package com.xzavier0722.mc.plugin.slimefun4.storage.common;

/**
 * {@link DataType} là loại của bộ điều khiển cơ sở dữ liệu Slimefun,
 * dùng để phân biệt các loại lưu trữ dữ liệu khác nhau.
 */
public enum DataType {
    /**
     * Hồ sơ người chơi, thường bao gồm tiến độ nghiên cứu, ba lô và dữ liệu liên quan người chơi khác.
     */
    PLAYER_PROFILE,

    /**
     * Dữ liệu khối Slimefun
     */
    BLOCK_STORAGE
}
