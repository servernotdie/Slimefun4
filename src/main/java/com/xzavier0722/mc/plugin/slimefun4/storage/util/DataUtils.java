package com.xzavier0722.mc.plugin.slimefun4.storage.util;

import city.norain.slimefun4.utils.StringUtil;
import com.xzavier0722.mc.plugin.slimefun4.storage.controller.StorageType;
import io.github.thebusybiscuit.slimefun4.core.debug.Debug;
import io.github.thebusybiscuit.slimefun4.core.debug.TestCase;
import io.github.thebusybiscuit.slimefun4.implementation.Slimefun;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.logging.Level;
import javax.annotation.Nullable;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.io.BukkitObjectInputStream;
import org.bukkit.util.io.BukkitObjectOutputStream;

public class DataUtils {
    /**
     * Sử dụng {@link BukkitObjectOutputStream} để serialize {@link ItemStack}
     * thành chuỗi Base64, dùng cho lưu trữ cơ sở dữ liệu.
     *
     * @param itemStack {@link ItemStack} cần serialize
     * @return Chuỗi Base64 sau khi serialize
     */
    public static String serializeItemStack(ItemStack itemStack) {
        Debug.log(TestCase.BACKPACK, "Serializing itemstack: " + itemStack);

        if (itemStack == null) {
            return "";
        }

        try (var stream = new ByteArrayOutputStream();
                var bs = new BukkitObjectOutputStream(stream)) {
            bs.writeObject(itemStack);
            var itemStr = Base64.getEncoder().encodeToString(stream.toByteArray());

            if (!Slimefun.getConfigManager().isBypassItemLengthCheck()
                    && Slimefun.getDatabaseManager().getBlockDataStorageType() == StorageType.MYSQL
                    && itemStr.length() > 65535) {

                throw new IllegalArgumentException(
                        "Phát hiện vật phẩm quá lớn, vui lòng liên hệ nhà phát triển plugin tương ứng: "
                                + StringUtil.itemStackToString(itemStack) + ", size = " + itemStr.length());
            }

            return itemStr;
        } catch (Throwable e) {
            Slimefun.logger().log(Level.SEVERE, "Xảy ra lỗi khi serialize vật phẩm, sẽ lưu giá trị rỗng", e);
            return "";
        }
    }

    /**
     * Sử dụng {@link BukkitObjectInputStream} để deserialize chuỗi Base64
     * thành đối tượng {@link ItemStack}.
     *
     * @param base64Str Chuỗi Base64 cần deserialize
     * @return Đối tượng {@link ItemStack} sau khi deserialize
     */
    @Nullable public static ItemStack deserializeItemStack(String base64Str) {
        if (base64Str == null || base64Str.isEmpty() || base64Str.isBlank()) {
            return null;
        }

        Debug.log(TestCase.BACKPACK, "Deserializing itemstack: " + base64Str);

        try (var stream = new ByteArrayInputStream(Base64.getMimeDecoder().decode(base64Str));
                var bs = new BukkitObjectInputStream(stream)) {
            var result = (ItemStack) bs.readObject();

            Debug.log(TestCase.BACKPACK, "Deserialized itemstack: " + result);

            if (result.getType().isAir()) {
                Slimefun.logger().log(Level.SEVERE, "Giải mã vật phẩm từ cơ sở dữ liệu thất bại! Vật phẩm tương ứng không thể hiển thị.");
            }

            return result;
        } catch (Exception ex) {
            throw new RuntimeException("Lỗi khi giải mã vật phẩm, vật phẩm tương ứng không thể hiển thị", ex);
        }
    }

    public static String blockDataBase64(String text) {
        return Slimefun.getDatabaseManager().isBlockDataBase64Enabled() ? base64Encode(text) : text;
    }

    public static String blockDataDebase64(String base64Str) {
        return Slimefun.getDatabaseManager().isBlockDataBase64Enabled() ? base64Decode(base64Str) : base64Str;
    }

    public static String profileDataBase64(String text) {
        return Slimefun.getDatabaseManager().isProfileDataBase64Enabled() ? base64Encode(text) : text;
    }

    public static String profileDataDebase64(String base64Str) {
        return Slimefun.getDatabaseManager().isProfileDataBase64Enabled() ? base64Decode(base64Str) : base64Str;
    }

    public static String base64Encode(String text) {
        return Base64.getEncoder().encodeToString(text.getBytes(StandardCharsets.UTF_8));
    }

    public static String base64Decode(String base64Str) {
        return new String(Base64.getDecoder().decode(base64Str), StandardCharsets.UTF_8);
    }
}
