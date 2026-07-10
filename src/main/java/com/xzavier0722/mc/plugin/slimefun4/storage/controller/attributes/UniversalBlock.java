package com.xzavier0722.mc.plugin.slimefun4.storage.controller.attributes;

import com.xzavier0722.mc.plugin.slimefun4.storage.controller.SlimefunUniversalBlockData;
import com.xzavier0722.mc.plugin.slimefun4.storage.controller.SlimefunUniversalData;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;

/**
 * Thuộc tính này được dùng để khai báo {@link SlimefunItem} sử dụng {@link SlimefunUniversalData}
 * <p>
 * Khi {@link SlimefunItem} này đóng vai trò là máy móc, vật liệu tương ứng cần hỗ trợ
 * sử dụng PDC storage container (để nhận diện UUID).
 * Nếu không, vật phẩm/máy móc này sẽ không thể được liên kết với dữ liệu chung.
 *
 * Xem tại đây để hiểu các vật liệu hỗ trợ PDC:
 * <a href="https://jd.papermc.io/paper/1.21/org/bukkit/block/TileState.html">Paper Doc</a>
 *
 * @author NoRainCity
 *
 * @see SlimefunUniversalData
 * @see SlimefunUniversalBlockData
 */
public interface UniversalBlock {}
