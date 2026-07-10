package net.guizhanss.slimefun4.utils;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.utils.JsonUtils;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.text.MessageFormat;
import java.util.Map;
import java.util.function.Function;
import java.util.logging.Level;
import java.util.stream.Collectors;
import org.bukkit.plugin.Plugin;

/**
 * Cung cấp các phương thức tiện ích liên quan đến Wiki
 *
 * @author ybw0014
 */
public final class WikiUtils {
    private WikiUtils() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * Đọc wiki.json của addon và thiết lập nút Wiki cho vật phẩm
     *
     * @param addon Instance {@link SlimefunAddon} của addon
     */
    public static void setupJson(Plugin addon) {
        setupJson(addon, page -> page);
    }

    /**
     * Đọc wiki.json của addon và thiết lập nút Wiki cho vật phẩm
     * Có thể thay đổi địa chỉ trang
     *
     * @param plugin Instance {@link SlimefunAddon} của addon
     * @param formatter Để thay đổi địa chỉ trang
     */
    public static void setupJson(Plugin plugin, Function<String, String> formatter) {
        if (!(plugin instanceof SlimefunAddon)) {
            throw new IllegalArgumentException("Plugin này không phải là addon Slimefun");
        }
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(plugin.getClass().getResourceAsStream("/wiki.json"), StandardCharsets.UTF_8))) {
            JsonElement element = JsonUtils.parseString(reader.lines().collect(Collectors.joining("")));
            JsonObject json = element.getAsJsonObject();

            int count = 0;

            for (Map.Entry<String, JsonElement> entry : json.entrySet()) {
                SlimefunItem item = SlimefunItem.getById(entry.getKey());

                if (item != null) {
                    String page = entry.getValue().getAsString();
                    page = formatter.apply(page);
                    item.addWikiPage(page);
                    count++;
                }
            }

            plugin.getLogger()
                    .log(
                            Level.INFO,
                            MessageFormat.format(
                                    "Đã tải trang Wiki của {1} vật phẩm trong {0}", plugin.getName(), count));
        } catch (Exception e) {
            plugin.getLogger()
                    .log(Level.SEVERE, MessageFormat.format("Không thể tải wiki.json của {0}", plugin.getName()), e);
        }
    }
}
