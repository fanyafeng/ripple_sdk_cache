package com.ripple.sdk.cache


/**
 * Author: fanyafeng
 * Data: 2020/8/17 09:34
 * Email: fanyafeng@live.cn
 * Description:
 */
interface IRippleCache {
    fun put(key: String, value: String)

    fun get(key: String)
}