package io.github.thebusybiscuit.slimefun4.implementation.items.androids;

import io.github.bakedlibs.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.utils.HeadTexture;
import javax.annotation.Nonnull;
import org.bukkit.inventory.ItemStack;

/**
 * This enum covers all different fuel sources a {@link ProgrammableAndroid} can have.
 *
 * @author TheBusyBiscuit
 *
 */
public enum AndroidFuelSource {

    /**
     * This {@link ProgrammableAndroid} runs on solid fuel, e.g. Wood or coal
     */
    SOLID("", "&fLoại robot này cần nhiên liệu rắn", "&fVí dụ: than, gỗ, v.v..."),

    /**
     * This {@link ProgrammableAndroid} runs on liquid fuel, e.g. Fuel, Oil or Lava
     */
    LIQUID("", "&fLoại robot này cần nhiên liệu lỏng", "&fVí dụ: dung nham, dầu thô, nhiên liệu, v.v..."),

    /**
     * This {@link ProgrammableAndroid} runs on nuclear fuel, e.g. Uranium
     */
    NUCLEAR("", "&fLoại robot này cần nhiên liệu phóng xạ", "&fVí dụ: uranium, neptunium hoặc nhiên liệu hạt nhân MOX");

    private final String[] lore;

    AndroidFuelSource(@Nonnull String... lore) {
        this.lore = lore;
    }

    /**
     * This returns a display {@link ItemStack} for this {@link AndroidFuelSource}.
     *
     * @return An {@link ItemStack} to display
     */
    @Nonnull
    public ItemStack getItem() {
        return new CustomItemStack(
                HeadTexture.GENERATOR.getAsItemStack(), "&8\u21E9 &cKhe đầu vào nhiên liệu &8\u21E9", lore);
    }
}
