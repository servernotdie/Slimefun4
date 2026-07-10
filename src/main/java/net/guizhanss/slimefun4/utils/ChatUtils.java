package net.guizhanss.slimefun4.utils;

import io.github.bakedlibs.dough.common.ChatColors;
import io.github.thebusybiscuit.slimefun4.implementation.Slimefun;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import org.bukkit.command.CommandSender;

/**
 * Các phương thức liên quan đến chat
 * @author ybw0014
 */
public class ChatUtils {
    private ChatUtils() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * Gửi tin nhắn có tiền tố Slimefun
     * @param sender Người nhận tin nhắn
     * @param message Tin nhắn
     */
    public static void sendMessage(CommandSender sender, String message) {
        sender.sendMessage(Slimefun.getLocalization().getChatPrefix() + ChatColors.color(message));
    }

    /**
     * Gửi tin nhắn có tiền tố Slimefun
     * @param sender Người nhận tin nhắn
     * @param message Tin nhắn
     * @param function {@link Function} để xử lý tin nhắn
     */
    public static void sendMessage(CommandSender sender, String message, UnaryOperator<String> function) {
        sendMessage(sender, function.apply(message));
    }
}
