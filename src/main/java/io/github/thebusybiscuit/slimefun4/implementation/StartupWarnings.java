package io.github.thebusybiscuit.slimefun4.implementation;

import io.github.thebusybiscuit.slimefun4.utils.NumberUtils;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.ParametersAreNonnullByDefault;

/**
 * This class stores some startup warnings we occasionally need to print.
 * If you setup your server the recommended way, you are never going to see
 * any of these messages.
 *
 * @author TheBusyBiscuit
 *
 */
final class StartupWarnings {

    private static final String BORDER = "****************************************************";
    private static final String PREFIX = "* ";

    private StartupWarnings() {}

    @ParametersAreNonnullByDefault
    static void discourageCSCoreLib(Logger logger) {
        logger.log(Level.SEVERE, BORDER);
        logger.log(Level.SEVERE, PREFIX + "Có vẻ bạn đã cài đặt CS-CoreLib.");
        logger.log(Level.SEVERE, PREFIX);
        logger.log(Level.SEVERE, PREFIX + "Từ ngày 30/01/2021, CS-CoreLib không còn là phụ thuộc bắt buộc");
        logger.log(Level.SEVERE, PREFIX + "Bạn cần gỡ cài đặt CS-CoreLib để Slimefun hoạt động bình thường.");
        logger.log(Level.SEVERE, BORDER);
    }

    @ParametersAreNonnullByDefault
    static void invalidMinecraftVersion(Logger logger, String detectedVer, String slimefunVersion) {
        logger.log(Level.SEVERE, BORDER);
        logger.log(Level.SEVERE, PREFIX + "Slimefun tải thất bại!");
        logger.log(Level.SEVERE, PREFIX + "Bạn đang sử dụng phiên bản Minecraft không được hỗ trợ!");
        logger.log(Level.SEVERE, PREFIX);
        logger.log(Level.SEVERE, PREFIX + "Bạn đang sử dụng Minecraft {0}", detectedVer);
        logger.log(Level.SEVERE, PREFIX + "Nhưng Slimefun {0} chỉ hỗ trợ các phiên bản sau:", slimefunVersion);
        logger.log(Level.SEVERE, PREFIX + "Minecraft {0}", String.join(" / ", Slimefun.getSupportedVersions()));
        logger.log(Level.SEVERE, BORDER);
    }

    @ParametersAreNonnullByDefault
    static void invalidServerSoftware(Logger logger) {
        logger.log(Level.SEVERE, BORDER);
        logger.log(Level.SEVERE, PREFIX + "Slimefun tải thất bại!");
        logger.log(Level.SEVERE, PREFIX + "Chúng tôi không còn hỗ trợ server CraftBukkit!");
        logger.log(Level.SEVERE, PREFIX);
        logger.log(Level.SEVERE, PREFIX + "Bạn cần sử dụng Paper hoặc các nhánh của nó");
        logger.log(Level.SEVERE, PREFIX + "(Chúng tôi khuyên dùng Paper)");
        logger.log(Level.SEVERE, BORDER);
    }

    @ParametersAreNonnullByDefault
    static void oldJavaVersion(Logger logger, int recommendedJavaVersion) {
        int javaVersion = NumberUtils.getJavaVersion();

        logger.log(Level.WARNING, BORDER);
        logger.log(Level.WARNING, PREFIX + "Phiên bản Java đang sử dụng (Java {0}) đã lỗi thời.", javaVersion);
        logger.log(Level.WARNING, PREFIX);
        logger.log(
                Level.WARNING,
                PREFIX + "Do phiên bản Minecraft cao yêu cầu bắt buộc Java {0},",
                recommendedJavaVersion);
        logger.log(
                Level.WARNING,
                PREFIX + "Chúng tôi khuyên bạn nên nâng cấp lên Java {0} sớm nhất có thể.",
                recommendedJavaVersion);
        logger.log(Level.WARNING, PREFIX + "Đồng thời, để sử dụng nhanh các tính năng mới của Java,");
        logger.log(
                Level.WARNING,
                PREFIX + "Slimefun cũng sẽ sớm yêu cầu Java {0} trong tương lai.",
                recommendedJavaVersion);
        logger.log(Level.WARNING, PREFIX + "Để không ảnh hưởng đến việc sử dụng sau này, vui lòng cập nhật sớm!");
        logger.log(Level.WARNING, BORDER);
    }
}
