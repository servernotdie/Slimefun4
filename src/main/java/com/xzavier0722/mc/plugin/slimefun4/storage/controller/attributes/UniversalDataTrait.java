package com.xzavier0722.mc.plugin.slimefun4.storage.controller.attributes;

import city.norain.slimefun4.api.menu.UniversalMenu;
import com.xzavier0722.mc.plugin.slimefun4.storage.controller.SlimefunUniversalBlockData;
import com.xzavier0722.mc.plugin.slimefun4.storage.controller.SlimefunUniversalData;
import lombok.Getter;

/**
 * Enum này được dùng để khai báo đặc điểm của {@link SlimefunUniversalData}.
 * Một dữ liệu chung có thể có một hoặc nhiều đặc điểm.
 * <p>
 * Đối với một dữ liệu chung, nó mặc định có đặc điểm là k-v container.
 *
 * @see SlimefunUniversalData
 * @see SlimefunUniversalBlockData
 */
@Getter
public enum UniversalDataTrait {
    /**
     * Đặc điểm BLOCK cho biết dữ liệu chung này thuộc {@link SlimefunUniversalBlockData}
     */
    BLOCK("location"),

    /**
     * Đặc điểm INVENTORY cho biết dữ liệu chung này có một {@link UniversalMenu}
     */
    INVENTORY("");

    private final String reservedKey;

    UniversalDataTrait(String reservedKey) {
        this.reservedKey = reservedKey;
    }

    public static boolean isReservedKey(String key) {
        for (UniversalDataTrait trait : UniversalDataTrait.values()) {
            if (trait.getReservedKey().equals(key)) {
                return true;
            }
        }

        return false;
    }
}
