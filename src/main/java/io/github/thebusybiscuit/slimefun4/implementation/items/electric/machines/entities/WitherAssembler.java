package io.github.thebusybiscuit.slimefun4.implementation.items.electric.machines.entities;

import io.github.bakedlibs.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.utils.ChestMenuUtils;
import javax.annotation.ParametersAreNonnullByDefault;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenuPreset;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Wither;
import org.bukkit.inventory.ItemStack;

/**
 * The {@link WitherAssembler} is an electrical machine that can automatically spawn
 * a {@link Wither} if the required ingredients have been provided.
 *
 * @author TheBusyBiscuit
 *
 * @see IronGolemAssembler
 *
 */
public class WitherAssembler extends AbstractEntityAssembler<Wither> {

    @ParametersAreNonnullByDefault
    public WitherAssembler(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, item, recipeType, recipe);
    }

    @Override
    public int getCapacity() {
        return 4096;
    }

    @Override
    public int getEnergyConsumption() {
        return 4096;
    }

    @Override
    public ItemStack getHead() {
        return new ItemStack(Material.WITHER_SKELETON_SKULL, 3);
    }

    @Override
    public Material getHeadBorder() {
        return Material.BLACK_STAINED_GLASS_PANE;
    }

    @Override
    public ItemStack getBody() {
        return new ItemStack(Material.SOUL_SAND, 4);
    }

    @Override
    public Material getBodyBorder() {
        return Material.BROWN_STAINED_GLASS_PANE;
    }

    @Override
    protected void constructMenu(BlockMenuPreset preset) {
        preset.addItem(
                1,
                new CustomItemStack(getHead(), "&7Đầu Wither Skeleton", "", "&fĐặt đầu Wither Skeleton vào đây"),
                ChestMenuUtils.getEmptyClickHandler());
        preset.addItem(
                7,
                new CustomItemStack(getBody(), "&7Cát linh hồn", "", "&fĐặt cát linh hồn vào đây"),
                ChestMenuUtils.getEmptyClickHandler());
        preset.addItem(
                13,
                new CustomItemStack(
                        Material.CLOCK,
                        "&7Thời gian hồi: &b30 giây",
                        "",
                        "&fMáy này cần nửa phút để lắp ráp",
                        "&fHãy kiên nhẫn chờ đợi!"),
                ChestMenuUtils.getEmptyClickHandler());
    }

    @Override
    public Wither spawnEntity(Location l) {
        return l.getWorld().spawn(l, Wither.class);
    }
}
