package com.ripple.sdk.cache


/**
 * Author: fanyafeng
 * Data: 2020/8/17 09:34
 * Email: fanyafeng@live.cn
 * Description:
 *
 * 缓存存取通用接口
 */
interface IRippleCache<K, V> {
    /**
     * 存入数据
     */
    fun put(key: K, value: V): V?

    /**
     * 根据key获取数据
     */
    fun get(key: K): V?

    /**
     * 根据key移除数据
     */
    fun remove(key: K): V?

    /**
     * 裁剪缓存数量
     */
    fun trimToSize(maxSize: Int)

    /**
     * 清除所有缓存
     */
    fun evictAll()
}