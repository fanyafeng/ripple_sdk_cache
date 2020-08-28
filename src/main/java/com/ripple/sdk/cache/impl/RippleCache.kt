package com.ripple.sdk.cache.impl

import androidx.collection.LruCache
import com.ripple.sdk.cache.IRippleCache
import java.math.BigDecimal


/**
 * Author: fanyafeng
 * Data: 2020/8/17 09:34
 * Email: fanyafeng@live.cn
 * Description:
 */
object RippleCache {

}

fun main(args: Array<String>) {
    val map = LruCache<String, String>(5)
    map.put("a", "A")
    map.put("b", "B")
    map.put("c", "C")
    map.put("d", "D")
    map.put("e", "E")
    map.put("f", "F")
    map.put("g", "G")
    map.get("a")
    map.snapshot().forEach { (key, value) ->
        println(value)
    }
}

