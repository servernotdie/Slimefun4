package city.norain.slimefun4;

import city.norain.slimefun4.compatibillty.VersionedEvent;
import city.norain.slimefun4.listener.SlimefunMigrateListener;
import city.norain.slimefun4.utils.EnvUtil;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import com.zaxxer.hikari.pool.HikariPool;
import io.github.bakedlibs.dough.versions.MinecraftVersion;
import io.github.bakedlibs.dough.versions.UnknownServerVersionException;
import io.github.thebusybiscuit.slimefun4.implementation.Slimefun;
import java.util.logging.Level;
import javax.annotation.Nonnull;
import lombok.Getter;
import net.guizhanss.guizhanlib.minecraft.utils.MinecraftVersionUtil;
import org.apache.logging.log4j.core.config.Configurator;
import org.bukkit.Server;

public final class SlimefunExtended {
    private static SlimefunMigrateListener migrateListener = new SlimefunMigrateListener();

    @Getter
    private static boolean databaseDebugMode = false;

    @Deprecated(since = "2026.1.1", forRemoval = true)
    private static MinecraftVersion minecraftVersion;

    @Deprecated(since = "2026.1.1", forRemoval = true)
    public static MinecraftVersion getMinecraftVersion() {
        return minecraftVersion;
    }

    /**
     * Trả về chi tiết phiên bản Minecraft của máy chủ hiện tại, bao gồm số phiên bản chính, phụ và bản vá.
     * Ví dụ: 26.1.2 sẽ trả về (26, 1, 2), còn 26.1 sẽ trả về (26, 1, 0).
     *
     * Trả về null khi không thể nhận diện phiên bản máy chủ.
     *
     * @since 2026.1
     * @param server
     * @return
     */
    public static ServerVersion getServerVerDetail(Server server) {
        String mcVersion = server.getMinecraftVersion();

        if (mcVersion.isBlank()) {
            return null;
        }

        // Trích xuất phần số trong số phiên bản
        String[] versionPart = mcVersion.split("\\.");

        // Có thể là phiên bản snapshot hoặc pre-release?
        if (versionPart.length < 2) {
            return null;
        }

        try {
            int majorVersion = Integer.parseInt(versionPart[0]);

            // Từ 26.1 trở đi, định dạng số phiên bản Minecraft chuyển sang dùng năm làm số phiên bản chính
            if (majorVersion != 1 && majorVersion < 26) {
                return null;
            }

            int minorVersion = Integer.parseInt(versionPart[1]);
            int patchVersion = versionPart.length > 2 ? Integer.parseInt(versionPart[2]) : 0;
            return new ServerVersion(majorVersion, minorVersion, patchVersion);
        } catch (NumberFormatException e) {
            server.getLogger().log(Level.WARNING, "Không thể phân tích số phiên bản máy chủ hiện tại: " + mcVersion, e);
            return null;
        }
    }

    /**
     * @since 2026.1
     * @param major the major version number (e.g., 26 for Minecraft 26.1)
     * @param minor
     * @return
     */
    public static boolean isAtLeast(int major, int minor) {
        return MinecraftVersionUtil.isAtLeast(major, minor);
    }

    /**
     * @since 2026.1
     * @param major the major version number (e.g., 26 for Minecraft 26.1)
     * @param minor
     * @return
     */
    public static boolean isAtLeast(int major, int minor, int patch) {
        return MinecraftVersionUtil.isAtLeast(major, minor, patch);
    }

    private static void checkDebug() {
        if ("true".equals(System.getProperty("slimefun.database.debug"))) {
            databaseDebugMode = true;

            Slimefun.getSQLProfiler().start();
            Slimefun.logger().log(Level.INFO, "Đã khởi động chế độ debug cơ sở dữ liệu");
        } else {
            Configurator.setLevel(HikariConfig.class.getName(), org.apache.logging.log4j.Level.OFF);
            Configurator.setLevel(HikariDataSource.class.getName(), org.apache.logging.log4j.Level.OFF);
            Configurator.setLevel(HikariPool.class.getName(), org.apache.logging.log4j.Level.OFF);
        }
    }

    public static boolean checkEnvironment(@Nonnull Slimefun sf) {
        try {
            minecraftVersion = MinecraftVersion.of(sf.getServer());
        } catch (UnknownServerVersionException ignored) {
            // sf.getLogger().log(Level.WARNING, "Không thể nhận diện phiên bản server bạn đang sử dụng :(");
            // return false;
        }

        if (EnvironmentChecker.checkHybridServer()) {
            sf.getLogger().log(Level.WARNING, "#######################################################");
            sf.getLogger().log(Level.WARNING, "");
            sf.getLogger().log(Level.WARNING, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            sf.getLogger().log(Level.WARNING, "Phát hiện đang sử dụng hybrid server, Slimefun sẽ bị vô hiệu hóa!");
            sf.getLogger().log(Level.WARNING, "Hybrid server đã được nhiều người dùng báo cáo có vấn đề khi sử dụng,");
            sf.getLogger().log(Level.WARNING, "việc cưỡng chế bỏ qua kiểm tra sẽ không được hỗ trợ phản hồi.");
            sf.getLogger().log(Level.WARNING, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            sf.getLogger().log(Level.WARNING, "");
            sf.getLogger().log(Level.WARNING, "#######################################################");
            return false;
        }

        if (Slimefun.getConfigManager().isBypassEnvironmentCheck()) {
            sf.getLogger().log(Level.WARNING, "#######################################################");
            sf.getLogger().log(Level.WARNING, "");
            sf.getLogger().log(Level.WARNING, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            sf.getLogger().log(Level.WARNING, "Phát hiện bạn đã vô hiệu hóa kiểm tra tương thích môi trường!");
            sf.getLogger().log(Level.WARNING, "Không vượt qua kiểm tra tương thích sẽ không được hỗ trợ phản hồi.");
            sf.getLogger().log(Level.WARNING, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            sf.getLogger().log(Level.WARNING, "");
            sf.getLogger().log(Level.WARNING, "#######################################################");
            return true;
        } else {
            return !EnvironmentChecker.checkIncompatiblePlugins(sf.getLogger());
        }
    }

    public static void init(@Nonnull Slimefun sf) {
        EnvironmentChecker.scheduleSlimeGlueCheck(sf);

        EnvUtil.init();

        checkDebug();

        VaultIntegration.register(sf);

        migrateListener.register(sf);

        VersionedEvent.init();
    }

    public static void shutdown() {
        migrateListener = null;

        VaultIntegration.cleanup();

        databaseDebugMode = false;
    }
}
