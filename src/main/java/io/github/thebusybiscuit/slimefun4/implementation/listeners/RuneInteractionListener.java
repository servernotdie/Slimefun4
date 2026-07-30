package io.github.thebusybiscuit.slimefun4.implementation.listeners;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.core.services.sounds.SoundEffect;
import io.github.thebusybiscuit.slimefun4.implementation.Slimefun;
import io.github.thebusybiscuit.slimefun4.implementation.items.magical.runes.EnchantmentRune;
import io.github.thebusybiscuit.slimefun4.implementation.items.magical.runes.SoulboundRune;
import io.github.thebusybiscuit.slimefun4.utils.SlimefunUtils;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nonnull;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.ItemStack;

public class RuneInteractionListener implements Listener {

    public RuneInteractionListener(@Nonnull Slimefun plugin) {
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler(ignoreCancelled = true)
    public void onInventoryClick(InventoryClickEvent e) {
        if (!(e.getWhoClicked() instanceof Player player)) {
            return;
        }

        ItemStack cursor = e.getCursor();
        ItemStack current = e.getCurrentItem();

        if (cursor == null
                || cursor.getType() == Material.AIR
                || current == null
                || current.getType() == Material.AIR) {
            return;
        }

        if (e.getClickedInventory() == null || e.getClickedInventory().getType() != InventoryType.PLAYER) {
            return;
        }

        if (e.getView().getTopInventory().getType() != InventoryType.CRAFTING) {
            return;
        }

        if (e.isShiftClick()) {
            return;
        }

        SlimefunItem runeItem = SlimefunItem.getByItem(cursor);
        if (runeItem == null) {
            return;
        }

        if (runeItem instanceof SoulboundRune soulboundRune) {
            applySoulboundRune(player, cursor, current, soulboundRune);
            e.setCancelled(true);
        } else if (runeItem instanceof EnchantmentRune enchantmentRune) {
            applyEnchantmentRune(player, cursor, current, enchantmentRune);
            e.setCancelled(true);
        }
    }

    private void applySoulboundRune(
            @Nonnull Player player, @Nonnull ItemStack cursor, @Nonnull ItemStack target, @Nonnull SoulboundRune rune) {
        if (!rune.canUse(player, true)) {
            return;
        }

        if (SlimefunUtils.isSoulbound(target)) {
            Slimefun.getLocalization().sendMessage(player, "messages.soulbound-rune.fail", true);
            return;
        }

        if (target.getAmount() != 1) {
            Slimefun.getLocalization().sendMessage(player, "messages.soulbound-rune.fail", true);
            return;
        }

        SlimefunItem targetSfItem = SlimefunItem.getByItem(target);
        if (targetSfItem != null && targetSfItem instanceof SoulboundRune) {
            return;
        }

        SlimefunUtils.setSoulbound(target, true);

        if (cursor.getAmount() > 1) {
            cursor.setAmount(cursor.getAmount() - 1);
        } else {
            player.setItemOnCursor(null);
        }

        SoundEffect.SOULBOUND_RUNE_RITUAL_SOUND.playFor(player);

        Slimefun.getLocalization().sendMessage(player, "messages.soulbound-rune.success", true);
    }

    private void applyEnchantmentRune(
            @Nonnull Player player,
            @Nonnull ItemStack cursor,
            @Nonnull ItemStack target,
            @Nonnull EnchantmentRune rune) {
        if (!rune.canUse(player, true)) {
            return;
        }

        if (target.getAmount() != 1) {
            Slimefun.getLocalization().sendMessage(player, "messages.enchantment-rune.fail", true);
            return;
        }

        SlimefunItem targetSfItem = SlimefunItem.getByItem(target);
        if (targetSfItem != null && !targetSfItem.isEnchantable()) {
            Slimefun.getLocalization().sendMessage(player, "messages.enchantment-rune.fail", true);
            return;
        }

        List<Enchantment> potentialEnchantments = new ArrayList<>();
        for (Enchantment enchantment : Enchantment.values()) {
            if (enchantment.equals(Enchantment.BINDING_CURSE) || enchantment.equals(Enchantment.VANISHING_CURSE)) {
                continue;
            }
            if (enchantment.canEnchantItem(target)) {
                potentialEnchantments.add(enchantment);
            }
        }

        for (Enchantment existing : target.getEnchantments().keySet()) {
            potentialEnchantments.removeIf(e -> e.equals(existing) || e.conflictsWith(existing));
        }

        if (potentialEnchantments.isEmpty()) {
            Slimefun.getLocalization().sendMessage(player, "messages.enchantment-rune.no-enchantment", true);
            return;
        }

        Enchantment selected = potentialEnchantments.get((int) (Math.random() * potentialEnchantments.size()));
        int level = selected.getMaxLevel() == 1 ? 1 : (int) (Math.random() * selected.getMaxLevel()) + 1;

        target.addEnchantment(selected, level);

        if (cursor.getAmount() > 1) {
            cursor.setAmount(cursor.getAmount() - 1);
        } else {
            player.setItemOnCursor(null);
        }

        SoundEffect.ENCHANTMENT_RUNE_ADD_ENCHANT_SOUND.playFor(player);

        Slimefun.getLocalization().sendMessage(player, "messages.enchantment-rune.success", true);
    }
}
