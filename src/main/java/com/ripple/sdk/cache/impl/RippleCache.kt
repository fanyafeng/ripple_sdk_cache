package com.ripple.sdk.cache.impl

import com.ripple.sdk.cache.IRippleCache
import java.math.BigDecimal


/**
 * Author: fanyafeng
 * Data: 2020/8/17 09:34
 * Email: fanyafeng@live.cn
 * Description:
 */
object RippleCache : IRippleCache {
    override fun put(key: String, value: String) {

    }

    override fun get(key: String) {
    }
}

fun main(args: Array<String>) {
    val a = 699500L
    val b = BigDecimal(a)
    val c = BigDecimal(10_000)
    val d = b.divide(c, 1, BigDecimal.ROUND_HALF_UP)
    println(d.toString())
}