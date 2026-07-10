package city.norain.slimefun4;

import io.github.thebusybiscuit.slimefun4.implementation.Slimefun;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nonnull;
import org.bukkit.Bukkit;

class EnvironmentChecker {
    private static final List<String> UNSUPPORTED_PLUGINS = List.of(
            "BedrockTechnology", "SlimefunFix", "SlimefunBugFixer", "Slimefunbookfix", "PlaceItemsOnGroundRebuilt");

    static boolean checkIncompatiblePlugins(@Nonnull Logger logger) {
        List<String> plugins = UNSUPPORTED_PLUGINS.stream()
                .filter(name -> Bukkit.getServer().getPluginManager().isPluginEnabled(name))
                .toList();

        if (plugins.isEmpty()) {
            return false;
        }

        printBorder(logger);
        logger.log(Level.WARNING, "");
        logger.log(Level.WARNING, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        logger.log(Level.WARNING, "Phát hiện plugin không tương thích, đã tự động vô hiệu hóa Slimefun!");
        logger.log(Level.WARNING, "Danh sách plugin không tương thích: ", String.join(", ", plugins));
        logger.log(Level.WARNING, "Các plugin này xuất hiện ở đây vì chúng đã không còn tương thích");
        logger.log(Level.WARNING, "với phiên bản Slimefun hiện tại hoặc xung đột với Slimefun.");
        logger.log(Level.WARNING, "Nếu bạn cho rằng các plugin này có thể hoạt động cùng Slimefun,");
        logger.log(Level.WARNING, "vui lòng liên hệ chúng tôi để chỉnh sửa.");
        logger.log(Level.WARNING, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        logger.log(Level.WARNING, "");
        printBorder(logger);

        return true;
    }

    static boolean checkHybridServer() {

        try {
            Class.forName("cpw.mods.modlauncher.Launcher", false, ClassLoader.getSystemClassLoader());
            return true;
        } catch (ClassNotFoundException ignored) {
        }

        try {
            Class.forName(
                    "net.minecraftforge.server.console.TerminalHandler", false, ClassLoader.getSystemClassLoader());

            return true;
        } catch (ClassNotFoundException ignored) {
        }

        try {
            Class.forName("org.cardboardpowered.mixin.CardboardMixinPlugin", false, ClassLoader.getSystemClassLoader());
            return true;
        } catch (ClassNotFoundException ignored) {
        }

        try {
            Class.forName("net.fabricmc.loader.impl.FabricLoaderImpl", false, ClassLoader.getSystemClassLoader());
            return true;
        } catch (ClassNotFoundException ignored) {
        }

        if (Bukkit.getPluginCommand("mohist") != null) {
            return true;
        }

        var serverVer = Bukkit.getVersion().toLowerCase();

        return serverVer.contains("arclight") || serverVer.contains("mohist");
    }

    static void scheduleSlimeGlueCheck(@Nonnull Slimefun sf) {
        Slimefun.getFoliaLib()
                .getScheduler()
                .runLater(
                        () -> {
                            if (Bukkit.getPluginManager().getPlugin("SlimeGlue") == null) {
                                sf.getLogger().log(Level.WARNING, "Phát hiện chưa cài đặt SlimeGlue (keo nhầy), bạn sẽ thiếu các kiểm tra bảo vệ bổ sung cho một số plugin!");
                                sf.getLogger().log(Level.WARNING, "Tải về: https://github.com/Xzavier0722/SlimeGlue");
                            }
                        },
                        300); // 15s
    }

    private static void printBorder(@Nonnull Logger logger) {
        logger.log(Level.WARNING, "#######################################################");
    }
}
