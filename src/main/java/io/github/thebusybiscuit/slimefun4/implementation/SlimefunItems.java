package io.github.thebusybiscuit.slimefun4.implementation;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.player.PlayerBackpack;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.core.attributes.Radioactivity;
import io.github.thebusybiscuit.slimefun4.implementation.items.magical.staves.StormStaff;
import io.github.thebusybiscuit.slimefun4.utils.ChatUtils;
import io.github.thebusybiscuit.slimefun4.utils.HeadTexture;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import io.github.thebusybiscuit.slimefun4.utils.compatibility.VersionedEnchantment;
import io.github.thebusybiscuit.slimefun4.utils.itemstack.ColoredFireworkStar;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

/**
 * This class holds a static references to every {@link SlimefunItemStack}
 * found in Slimefun.
 */
@SuppressWarnings("java:S1192") // Suppress "duplicate string literal" warnings
public final class SlimefunItems {

    private SlimefunItems() {}

    /*		 Items 		*/
    public static final SlimefunItemStack PORTABLE_CRAFTER = new SlimefunItemStack(
            "PORTABLE_CRAFTER",
            HeadTexture.PORTABLE_CRAFTER,
            "&6Bàn Chế Tạo Di Động",
            "&a&oMột bàn chế tạo cầm tay",
            "",
            LoreBuilder.RIGHT_CLICK_TO_OPEN);
    public static final SlimefunItemStack PORTABLE_DUSTBIN = new SlimefunItemStack(
            "PORTABLE_DUSTBIN",
            HeadTexture.TRASH_CAN,
            "&6Thùng Rác Di Động",
            "&rDễ dàng loại bỏ các vật phẩm thừa",
            "",
            LoreBuilder.RIGHT_CLICK_TO_OPEN);
    public static final SlimefunItemStack ENDER_BACKPACK = new SlimefunItemStack(
            "ENDER_BACKPACK",
            HeadTexture.ENDER_BACKPACK,
            "&6Ba Lô Ender",
            "&a&oRương Ender cầm tay",
            "",
            LoreBuilder.RIGHT_CLICK_TO_OPEN);
    public static final SlimefunItemStack MAGIC_EYE_OF_ENDER = new SlimefunItemStack(
            "MAGIC_EYE_OF_ENDER",
            Material.ENDER_EYE,
            "&6&lMắt Ender Ma Thuật",
            "&4&lYêu cầu full bộ giáp Ender",
            "",
            "&7&eChuột phải&7 để bắn ra một viên Ngọc Ender");
    public static final SlimefunItemStack BROKEN_SPAWNER = new SlimefunItemStack(
            "BROKEN_SPAWNER",
            Material.SPAWNER,
            "&cLồng Sinh Quái Hỏng",
            "&7Loại: &b<type>",
            "",
            "&cĐã hỏng, cần sửa tại Bàn Thờ Cổ Đại");
    public static final SlimefunItemStack REPAIRED_SPAWNER = new SlimefunItemStack(
            "REINFORCED_SPAWNER", Material.SPAWNER, "&bLồng Sinh Quái Đã Sửa", "&7Loại: &b<type>");
    public static final SlimefunItemStack INFERNAL_BONEMEAL = new SlimefunItemStack(
            "INFERNAL_BONEMEAL",
            Material.BONE_MEAL,
            "&4Bột Xương Địa Ngục",
            "",
            "&cTăng tốc độ phát triển của Nether Wart");
    public static final SlimefunItemStack TAPE_MEASURE = new SlimefunItemStack(
            "TAPE_MEASURE",
            "180d5c43a6cf5bb7769fd0c8240e1e70d2ae38ef9d78a1db401aca6a2cb36f65",
            "&6Thước Cuộn",
            "",
            "&eShift + Chuột phải &7đặt điểm bắt đầu đo",
            "&eChuột phải &7đo khoảng cách");

    /*		 Gadgets 		*/
    public static final SlimefunItemStack GOLD_PAN = new SlimefunItemStack(
            "GOLD_PAN",
            Material.BOWL,
            "&6Chảo Lọc Vàng",
            "&a&oCó thể thu được nhiều loại khoáng sản",
            "",
            "&7&eChuột phải&7 để lọc vàng từ sỏi");
    public static final SlimefunItemStack NETHER_GOLD_PAN = new SlimefunItemStack(
            "NETHER_GOLD_PAN",
            Material.BOWL,
            "&4Chảo Lọc Vàng Nether",
            "",
            "&7&eChuột phải&7 để lọc vàng từ cát linh hồn");
    public static final SlimefunItemStack PARACHUTE = new SlimefunItemStack(
            "PARACHUTE", Material.LEATHER_CHESTPLATE, Color.WHITE, "&r&lDù Bay", "", LoreBuilder.CROUCH_TO_USE);
    public static final SlimefunItemStack GRAPPLING_HOOK =
            new SlimefunItemStack("GRAPPLING_HOOK", Material.LEAD, "&6Móc Trèo", "", LoreBuilder.RIGHT_CLICK_TO_USE);
    public static final SlimefunItemStack SOLAR_HELMET = new SlimefunItemStack(
            "SOLAR_HELMET",
            Material.IRON_HELMET,
            "&bMũ Năng Lượng Mặt Trời",
            "",
            "&a&oSạc năng lượng cho vật phẩm và trang bị bạn đang cầm");
    public static final SlimefunItemStack CLOTH = new SlimefunItemStack("CLOTH", Material.PAPER, "&bVải");
    public static final SlimefunItemStack REINFORCED_CLOTH = new SlimefunItemStack(
            "REINFORCED_CLOTH",
            Material.PAPER,
            "&bVải Gia Cố",
            "",
            "&fLoại vải này sau khi được gia cố bằng chì",
            "&fcó thể ngăn chặn ảnh hưởng tiêu cực từ phóng xạ");
    public static final SlimefunItemStack TIN_CAN = new SlimefunItemStack("CAN", HeadTexture.TIN_CAN, "&rHộp Thiếc");
    public static final SlimefunItemStack NIGHT_VISION_GOGGLES = new SlimefunItemStack(
            "NIGHT_VISION_GOGGLES",
            Material.LEATHER_HELMET,
            Color.BLACK,
            "&aKính Nhìn Đêm",
            "",
            "&9+ Hiệu ứng nhìn ban đêm");
    public static final SlimefunItemStack ELYTRA_CAP = new SlimefunItemStack(
            "ELYTRA_CAP",
            Material.LEATHER_HELMET,
            Color.PURPLE,
            "&5Mũ Cánh Bay",
            "",
            "&7Giúp bạn khi bay bằng cánh",
            "&7không bị rơi xuống thành bã");
    public static final SlimefunItemStack FARMER_SHOES = new SlimefunItemStack(
            "FARMER_SHOES",
            Material.LEATHER_BOOTS,
            Color.YELLOW,
            "&eGiày Nông Dân",
            "",
            "&6&oCó thể tránh giẫm hỏng đất trồng");
    public static final SlimefunItemStack INFUSED_MAGNET = new SlimefunItemStack(
            "INFUSED_MAGNET",
            HeadTexture.MAGNET,
            "&aNam Châm Hút",
            "",
            "&rNam châm được truyền phép thuật",
            "&rCó thể hút các vật phẩm gần đó",
            "&rvào ba lô của bạn",
            "",
            "&7Giữ &eShift&7 để hút vật phẩm xung quanh");
    public static final SlimefunItemStack RAG = new SlimefunItemStack(
            "RAG",
            Material.PAPER,
            "&cGiẻ Rách",
            "",
            "&aDụng cụ y tế cấp 1",
            "",
            "&rHồi 2 máu",
            "&rCó thể dập tắt lửa trên người",
            "",
            LoreBuilder.RIGHT_CLICK_TO_USE);
    public static final SlimefunItemStack BANDAGE = new SlimefunItemStack(
            "BANDAGE",
            Material.PAPER,
            "&cBăng",
            "",
            "&aDụng cụ y tế cấp 2",
            "",
            "&rHồi 4 máu",
            "&rCó thể dập tắt lửa trên người",
            "",
            LoreBuilder.RIGHT_CLICK_TO_USE);
    public static final SlimefunItemStack SPLINT = new SlimefunItemStack(
            "SPLINT",
            Material.STICK,
            "&cNẹp Gỗ",
            "",
            "&aDụng cụ y tế cấp 1",
            "",
            "&rHồi 2 máu",
            "",
            LoreBuilder.RIGHT_CLICK_TO_USE);
    public static final SlimefunItemStack VITAMINS = new SlimefunItemStack(
            "VITAMINS",
            Material.NETHER_WART,
            "&cVitamin",
            "",
            "&aDụng cụ y tế cấp 3",
            "",
            "&rHồi 4 máu",
            "&rCó thể dập tắt lửa trên người",
            "&rChữa khỏi hiệu ứng tiêu cực: Độc/Wither/Phóng xạ",
            "",
            LoreBuilder.RIGHT_CLICK_TO_USE);
    public static final SlimefunItemStack MEDICINE = new SlimefunItemStack(
            "MEDICINE",
            Material.POTION,
            Color.RED,
            "&cThuốc",
            "",
            "&aDụng cụ y tế cấp 3",
            "",
            "&rHồi 4 máu",
            "&rCó thể dập tắt lửa trên người",
            "&rChữa khỏi hiệu ứng tiêu cực: Độc/Wither/Phóng xạ",
            "",
            "&7&eChuột phải&7 để uống");
    public static final SlimefunItemStack MAGICAL_ZOMBIE_PILLS = new SlimefunItemStack(
            "MAGICAL_ZOMBIE_PILLS",
            Material.NETHER_WART,
            "&6Thuốc Hoàn Hồn",
            "",
            "&eChuột phải để chữa ngay &7Dân làng Zombie/Piglin");

    public static final SlimefunItemStack FLASK_OF_KNOWLEDGE = new SlimefunItemStack(
            "FLASK_OF_KNOWLEDGE",
            Material.GLASS_BOTTLE,
            "&cBình Tri Thức",
            "",
            "&rCho phép bạn lưu trữ kinh nghiệm vào lọ",
            "&7Tiêu tốn &a1 cấp độ");
    public static final SlimefunItemStack FILLED_FLASK_OF_KNOWLEDGE =
            new SlimefunItemStack("FILLED_FLASK_OF_KNOWLEDGE", Material.EXPERIENCE_BOTTLE, "&aBình Tri Thức");

    /*		Backpacks		*/
    public static final SlimefunItemStack BACKPACK_SMALL = new SlimefunItemStack(
            "SMALL_BACKPACK",
            HeadTexture.BACKPACK,
            "&eBa Lô Nhỏ",
            "",
            "&7Kích thước: &e9",
            PlayerBackpack.LORE_OWNER,
            "",
            LoreBuilder.RIGHT_CLICK_TO_OPEN);
    public static final SlimefunItemStack BACKPACK_MEDIUM = new SlimefunItemStack(
            "MEDIUM_BACKPACK",
            HeadTexture.BACKPACK,
            "&eBa Lô Trung Bình",
            "",
            "&7Kích thước: &e18",
            PlayerBackpack.LORE_OWNER,
            "",
            LoreBuilder.RIGHT_CLICK_TO_OPEN);
    public static final SlimefunItemStack BACKPACK_LARGE = new SlimefunItemStack(
            "LARGE_BACKPACK",
            HeadTexture.BACKPACK,
            "&eBa Lô Lớn",
            "",
            "&7Kích thước: &e27",
            PlayerBackpack.LORE_OWNER,
            "",
            LoreBuilder.RIGHT_CLICK_TO_OPEN);
    public static final SlimefunItemStack WOVEN_BACKPACK = new SlimefunItemStack(
            "WOVEN_BACKPACK",
            HeadTexture.BACKPACK,
            "&eBa Lô Dệt",
            "",
            "&7Kích thước: &e36",
            PlayerBackpack.LORE_OWNER,
            "",
            LoreBuilder.RIGHT_CLICK_TO_OPEN);
    public static final SlimefunItemStack GILDED_BACKPACK = new SlimefunItemStack(
            "GILDED_BACKPACK",
            HeadTexture.BACKPACK,
            "&eBa Lô Mạ Vàng",
            "",
            "&7Kích thước: &e45",
            PlayerBackpack.LORE_OWNER,
            "",
            LoreBuilder.RIGHT_CLICK_TO_OPEN);
    public static final SlimefunItemStack RADIANT_BACKPACK = new SlimefunItemStack(
            "RADIANT_BACKPACK",
            HeadTexture.BACKPACK,
            "&eBa Lô Rực Rỡ",
            "",
            "&7Kích thước: &e54 (Rương lớn)",
            PlayerBackpack.LORE_OWNER,
            "",
            LoreBuilder.RIGHT_CLICK_TO_OPEN);
    public static final SlimefunItemStack BOUND_BACKPACK = new SlimefunItemStack(
            "BOUND_BACKPACK",
            HeadTexture.ENDER_BACKPACK,
            "&cBa Lô Linh Hồn Ràng Buộc",
            "",
            "&7Kích thước: &e36",
            PlayerBackpack.LORE_OWNER,
            "",
            LoreBuilder.RIGHT_CLICK_TO_OPEN);
    public static final SlimefunItemStack COOLER = new SlimefunItemStack(
            "COOLER",
            HeadTexture.COOLER,
            "&bTủ Lạnh Nhỏ",
            "&rCó thể lưu trữ nước trái cây và sinh tố",
            "&rKhi túi lạnh ở trong túi đồ của bạn",
            "&rSẽ tự động tiêu thụ thức ăn bên trong khi bạn đói",
            "",
            "&7Kích thước: &e27",
            PlayerBackpack.LORE_OWNER,
            "",
            LoreBuilder.RIGHT_CLICK_TO_OPEN);
    public static final SlimefunItemStack RESTORED_BACKPACK = new SlimefunItemStack(
            "RESTORED_BACKPACK",
            HeadTexture.RESTORED_BACKPACK,
            "&eBộ Khôi Phục Ba Lô",
            "",
            "&7Lấy lại các vật phẩm trong ba lô bị mất",
            PlayerBackpack.LORE_OWNER,
            "",
            LoreBuilder.RIGHT_CLICK_TO_OPEN);

    /*		 Jetpacks		*/
    public static final SlimefunItemStack DURALUMIN_JETPACK = new SlimefunItemStack(
            "DURALUMIN_JETPACK",
            Material.LEATHER_CHESTPLATE,
            Color.SILVER,
            "&9Ba Lô Phản Lực Điện &7- &eI",
            "",
            LoreBuilder.material("Duralumin"),
            LoreBuilder.powerCharged(0, 20),
            "&8\u21E8 &7Lực đẩy: &c0.35",
            "",
            LoreBuilder.CROUCH_TO_USE);
    public static final SlimefunItemStack SOLDER_JETPACK = new SlimefunItemStack(
            "SOLDER_JETPACK",
            Material.LEATHER_CHESTPLATE,
            Color.SILVER,
            "&9Ba Lô Phản Lực Điện &7- &eII",
            "",
            LoreBuilder.material("Thiếc hàn"),
            LoreBuilder.powerCharged(0, 30),
            "&8\u21E8 &7Lực đẩy: &c0.4",
            "",
            LoreBuilder.CROUCH_TO_USE);
    public static final SlimefunItemStack BILLON_JETPACK = new SlimefunItemStack(
            "BILLON_JETPACK",
            Material.LEATHER_CHESTPLATE,
            Color.SILVER,
            "&9Ba Lô Phản Lực Điện &7- &eIII",
            "",
            LoreBuilder.material("Hợp kim Bạc-Đồng"),
            LoreBuilder.powerCharged(0, 45),
            "&8\u21E8 &7Lực đẩy: &c0.45",
            "",
            LoreBuilder.CROUCH_TO_USE);
    public static final SlimefunItemStack STEEL_JETPACK = new SlimefunItemStack(
            "STEEL_JETPACK",
            Material.LEATHER_CHESTPLATE,
            Color.SILVER,
            "&9Ba Lô Phản Lực Điện &7- &eIV",
            "",
            LoreBuilder.material("Thép"),
            LoreBuilder.powerCharged(0, 60),
            "&8\u21E8 &7Lực đẩy: &c0.5",
            "",
            LoreBuilder.CROUCH_TO_USE);
    public static final SlimefunItemStack DAMASCUS_STEEL_JETPACK = new SlimefunItemStack(
            "DAMASCUS_STEEL_JETPACK",
            Material.LEATHER_CHESTPLATE,
            Color.SILVER,
            "&9Ba Lô Phản Lực Điện &7- &eV",
            "",
            LoreBuilder.material("Thép Damascus"),
            LoreBuilder.powerCharged(0, 75),
            "&8\u21E8 &7Lực đẩy: &c0.55",
            "",
            LoreBuilder.CROUCH_TO_USE);
    public static final SlimefunItemStack REINFORCED_ALLOY_JETPACK = new SlimefunItemStack(
            "REINFORCED_ALLOY_JETPACK",
            Material.LEATHER_CHESTPLATE,
            Color.SILVER,
            "&9Ba Lô Phản Lực Điện &7- &eVI",
            "",
            LoreBuilder.material("Hợp kim gia cố"),
            LoreBuilder.powerCharged(0, 100),
            "&8\u21E8 &7Lực đẩy: &c0.6",
            "",
            LoreBuilder.CROUCH_TO_USE);
    public static final SlimefunItemStack CARBONADO_JETPACK = new SlimefunItemStack(
            "CARBONADO_JETPACK",
            Material.LEATHER_CHESTPLATE,
            Color.BLACK,
            "&9Ba Lô Phản Lực Điện &7- &eVII",
            "",
            LoreBuilder.material("Kim cương đen"),
            LoreBuilder.powerCharged(0, 150),
            "&8\u21E8 &7Lực đẩy: &c0.7",
            "",
            LoreBuilder.CROUCH_TO_USE);
    public static final SlimefunItemStack ARMORED_JETPACK = new SlimefunItemStack(
            "ARMORED_JETPACK",
            Material.IRON_CHESTPLATE,
            "&9Ba Lô Phản Lực Bọc Giáp",
            LoreBuilder.material("Thép"),
            "",
            LoreBuilder.powerCharged(0, 50),
            "&8\u21E8 &7Lực đẩy: &c0.5",
            "",
            LoreBuilder.CROUCH_TO_USE);

    /*		 Jetboots		*/
    public static final SlimefunItemStack DURALUMIN_JETBOOTS = new SlimefunItemStack(
            "DURALUMIN_JETBOOTS",
            Material.LEATHER_BOOTS,
            Color.SILVER,
            "&9Giày Phản Lực &7- &eI",
            "",
            LoreBuilder.material("Duralumin"),
            LoreBuilder.powerCharged(0, 20),
            "&8\u21E8 &7Tốc độ: &a0.35",
            "&8\u21E8 &7Độ chính xác: &c50%",
            "",
            LoreBuilder.CROUCH_TO_USE);
    public static final SlimefunItemStack SOLDER_JETBOOTS = new SlimefunItemStack(
            "SOLDER_JETBOOTS",
            Material.LEATHER_BOOTS,
            Color.SILVER,
            "&9Giày Phản Lực &7- &eII",
            "",
            LoreBuilder.material("Thiếc hàn"),
            LoreBuilder.powerCharged(0, 30),
            "&8\u21E8 &7Tốc độ: &a0.4",
            "&8\u21E8 &7Độ chính xác: &660%",
            "",
            LoreBuilder.CROUCH_TO_USE);
    public static final SlimefunItemStack BILLON_JETBOOTS = new SlimefunItemStack(
            "BILLON_JETBOOTS",
            Material.LEATHER_BOOTS,
            Color.SILVER,
            "&9Giày Phản Lực &7- &eIII",
            "",
            LoreBuilder.material("Hợp kim Bạc-Đồng"),
            LoreBuilder.powerCharged(0, 40),
            "&8\u21E8 &7Tốc độ: &a0.45",
            "&8\u21E8 &7Độ chính xác: &665%",
            "",
            LoreBuilder.CROUCH_TO_USE);
    public static final SlimefunItemStack STEEL_JETBOOTS = new SlimefunItemStack(
            "STEEL_JETBOOTS",
            Material.LEATHER_BOOTS,
            Color.SILVER,
            "&9Giày Phản Lực &7- &eIV",
            "",
            LoreBuilder.material("Thép"),
            LoreBuilder.powerCharged(0, 50),
            "&8\u21E8 &7Tốc độ: &a0.5",
            "&8\u21E8 &7Độ chính xác: &e70%",
            "",
            LoreBuilder.CROUCH_TO_USE);
    public static final SlimefunItemStack DAMASCUS_STEEL_JETBOOTS = new SlimefunItemStack(
            "DAMASCUS_STEEL_JETBOOTS",
            Material.LEATHER_BOOTS,
            Color.SILVER,
            "&9Giày Phản Lực &7- &eV",
            "",
            LoreBuilder.material("Thép Damascus"),
            LoreBuilder.powerCharged(0, 75),
            "&8\u21E8 &7Tốc độ: &a0.55",
            "&8\u21E8 &7Độ chính xác: &a75%",
            "",
            LoreBuilder.CROUCH_TO_USE);
    public static final SlimefunItemStack REINFORCED_ALLOY_JETBOOTS = new SlimefunItemStack(
            "REINFORCED_ALLOY_JETBOOTS",
            Material.LEATHER_BOOTS,
            Color.SILVER,
            "&9Giày Phản Lực &7- &eVI",
            "",
            LoreBuilder.material("Hợp kim gia cố"),
            LoreBuilder.powerCharged(0, 100),
            "&8\u21E8 &7Tốc độ: &a0.6",
            "&8\u21E8 &7Độ chính xác: &c80%",
            "",
            LoreBuilder.CROUCH_TO_USE);
    public static final SlimefunItemStack CARBONADO_JETBOOTS = new SlimefunItemStack(
            "CARBONADO_JETBOOTS",
            Material.LEATHER_BOOTS,
            Color.BLACK,
            "&9Giày Phản Lực &7- &eVII",
            "",
            LoreBuilder.material("Kim cương đen"),
            LoreBuilder.powerCharged(0, 125),
            "&8\u21E8 &7Tốc độ: &a0.7",
            "&8\u21E8 &7Độ chính xác: &c99.9%",
            "",
            LoreBuilder.CROUCH_TO_USE);
    public static final SlimefunItemStack ARMORED_JETBOOTS = new SlimefunItemStack(
            "ARMORED_JETBOOTS",
            Material.IRON_BOOTS,
            "&9Giày Phản Lực Bọc Giáp",
            "",
            LoreBuilder.material("Thép"),
            LoreBuilder.powerCharged(0, 50),
            "&8\u21E8 &7Tốc độ: &a0.45",
            "&8\u21E8 &7Độ chính xác: &e70%",
            "",
            LoreBuilder.CROUCH_TO_USE);

    /*		 Multi Tools		*/
    public static final SlimefunItemStack DURALUMIN_MULTI_TOOL = new SlimefunItemStack(
            "DURALUMIN_MULTI_TOOL",
            Material.SHEARS,
            "&9Dụng Cụ Đa Năng &7- &eI",
            "",
            LoreBuilder.material("Duralumin"),
            LoreBuilder.powerCharged(0, 20),
            "",
            LoreBuilder.RIGHT_CLICK_TO_USE,
            "&7Giữ &eShift + Chuột phải&7 để đổi chế độ");
    public static final SlimefunItemStack SOLDER_MULTI_TOOL = new SlimefunItemStack(
            "SOLDER_MULTI_TOOL",
            Material.SHEARS,
            "&9Dụng Cụ Đa Năng &7- &eII",
            "",
            LoreBuilder.material("Thiếc hàn"),
            LoreBuilder.powerCharged(0, 30),
            "",
            LoreBuilder.RIGHT_CLICK_TO_USE,
            "&7Giữ &eShift + Chuột phải&7 để đổi chế độ");
    public static final SlimefunItemStack BILLON_MULTI_TOOL = new SlimefunItemStack(
            "BILLON_MULTI_TOOL",
            Material.SHEARS,
            "&9Dụng Cụ Đa Năng &7- &eIII",
            "",
            LoreBuilder.material("Hợp kim Bạc-Đồng"),
            LoreBuilder.powerCharged(0, 40),
            "",
            LoreBuilder.RIGHT_CLICK_TO_USE,
            "&7Giữ &eShift + Chuột phải&7 để đổi chế độ");
    public static final SlimefunItemStack STEEL_MULTI_TOOL = new SlimefunItemStack(
            "STEEL_MULTI_TOOL",
            Material.SHEARS,
            "&9Dụng Cụ Đa Năng &7- &eIV",
            "",
            LoreBuilder.material("Thép"),
            LoreBuilder.powerCharged(0, 50),
            "",
            LoreBuilder.RIGHT_CLICK_TO_USE,
            "&7Giữ &eShift + Chuột phải&7 để đổi chế độ");
    public static final SlimefunItemStack DAMASCUS_STEEL_MULTI_TOOL = new SlimefunItemStack(
            "DAMASCUS_STEEL_MULTI_TOOL",
            Material.SHEARS,
            "&9Dụng Cụ Đa Năng &7- &eV",
            "",
            LoreBuilder.material("Thép Damascus"),
            LoreBuilder.powerCharged(0, 60),
            "",
            LoreBuilder.RIGHT_CLICK_TO_USE,
            "&7Giữ &eShift + Chuột phải&7 để đổi chế độ");
    public static final SlimefunItemStack REINFORCED_ALLOY_MULTI_TOOL = new SlimefunItemStack(
            "REINFORCED_ALLOY_MULTI_TOOL",
            Material.SHEARS,
            "&9Dụng Cụ Đa Năng &7- &eVI",
            "",
            LoreBuilder.material("Hợp kim gia cố"),
            LoreBuilder.powerCharged(0, 75),
            "",
            LoreBuilder.RIGHT_CLICK_TO_USE,
            "&7Giữ &eShift + Chuột phải&7 để đổi chế độ");
    public static final SlimefunItemStack CARBONADO_MULTI_TOOL = new SlimefunItemStack(
            "CARBONADO_MULTI_TOOL",
            Material.SHEARS,
            "&9Dụng Cụ Đa Năng &7- &eVII",
            "",
            LoreBuilder.material("Kim cương đen"),
            LoreBuilder.powerCharged(0, 100),
            "",
            LoreBuilder.RIGHT_CLICK_TO_USE,
            "&7Giữ &eShift + Chuột phải&7 để đổi chế độ");

    static {
        ItemMeta duralumin = DURALUMIN_MULTI_TOOL.getItemMeta();
        duralumin.setUnbreakable(true);
        DURALUMIN_MULTI_TOOL.setItemMeta(duralumin);

        ItemMeta solder = SOLDER_MULTI_TOOL.getItemMeta();
        solder.setUnbreakable(true);
        SOLDER_MULTI_TOOL.setItemMeta(solder);

        ItemMeta billon = BILLON_MULTI_TOOL.getItemMeta();
        billon.setUnbreakable(true);
        BILLON_MULTI_TOOL.setItemMeta(billon);

        ItemMeta steel = STEEL_MULTI_TOOL.getItemMeta();
        steel.setUnbreakable(true);
        STEEL_MULTI_TOOL.setItemMeta(steel);

        ItemMeta damascus = DAMASCUS_STEEL_MULTI_TOOL.getItemMeta();
        damascus.setUnbreakable(true);
        DAMASCUS_STEEL_MULTI_TOOL.setItemMeta(damascus);

        ItemMeta reinforced = REINFORCED_ALLOY_MULTI_TOOL.getItemMeta();
        reinforced.setUnbreakable(true);
        REINFORCED_ALLOY_MULTI_TOOL.setItemMeta(reinforced);

        ItemMeta carbonado = CARBONADO_MULTI_TOOL.getItemMeta();
        carbonado.setUnbreakable(true);
        CARBONADO_MULTI_TOOL.setItemMeta(carbonado);
    }

    /*		 Food 		*/
    public static final SlimefunItemStack FORTUNE_COOKIE = new SlimefunItemStack(
            "FORTUNE_COOKIE", Material.COOKIE, "&6Bánh Quy May Mắn", "", "&a&oCho bạn biết điều gì sẽ xảy ra :o");
    public static final SlimefunItemStack DIET_COOKIE = new SlimefunItemStack(
            "DIET_COOKIE", Material.COOKIE, "&6Bánh Quy Ăn Kiêng", "", "&aMột chiếc bánh quy rất&o nhẹ");
    public static final SlimefunItemStack MAGIC_SUGAR = new SlimefunItemStack(
            "MAGIC_SUGAR", Material.SUGAR, "&6Đường Ma Thuật", "", "&a&oCảm nhận sức mạnh của Hermes!");
    public static final SlimefunItemStack MONSTER_JERKY = new SlimefunItemStack(
            "MONSTER_JERKY", Material.ROTTEN_FLESH, "&6Thịt Quái Vật Khô", "", "&a&oTỉnh táo và chống đói");
    public static final SlimefunItemStack APPLE_JUICE = new SlimefunItemStack(
            "APPLE_JUICE",
            Color.RED,
            new PotionEffect(PotionEffectType.SATURATION, 5, 0),
            "&cNước Táo",
            "",
            LoreBuilder.hunger(3));
    public static final SlimefunItemStack MELON_JUICE = new SlimefunItemStack(
            "MELON_JUICE",
            Color.RED,
            new PotionEffect(PotionEffectType.SATURATION, 5, 0),
            "&cNước Dưa Hấu",
            "",
            LoreBuilder.hunger(3));
    public static final SlimefunItemStack CARROT_JUICE = new SlimefunItemStack(
            "CARROT_JUICE",
            Color.ORANGE,
            new PotionEffect(PotionEffectType.SATURATION, 5, 0),
            "&6Nước Cà Rốt",
            "",
            LoreBuilder.hunger(3));
    public static final SlimefunItemStack PUMPKIN_JUICE = new SlimefunItemStack(
            "PUMPKIN_JUICE",
            Color.ORANGE,
            new PotionEffect(PotionEffectType.SATURATION, 5, 0),
            "&6Nước Bí Ngô",
            "",
            LoreBuilder.hunger(3));
    public static final SlimefunItemStack SWEET_BERRY_JUICE = new SlimefunItemStack(
            "SWEET_BERRY_JUICE",
            Color.RED,
            new PotionEffect(PotionEffectType.SATURATION, 5, 0),
            "&cNước Quả Mọng",
            "",
            LoreBuilder.hunger(3));
    public static final SlimefunItemStack GLOW_BERRY_JUICE = new SlimefunItemStack(
            "GLOW_BERRY_JUICE",
            Color.ORANGE,
            new PotionEffect(PotionEffectType.SATURATION, 5, 0),
            "&6Nước Quả Mọng Phát Sáng",
            "",
            LoreBuilder.hunger(3));
    public static final SlimefunItemStack GOLDEN_APPLE_JUICE = new SlimefunItemStack(
            "GOLDEN_APPLE_JUICE",
            Color.YELLOW,
            new PotionEffect(PotionEffectType.ABSORPTION, 20 * 20, 0),
            "&bNước Táo Vàng");

    public static final SlimefunItemStack BEEF_JERKY =
            new SlimefunItemStack("BEEF_JERKY", Material.COOKED_BEEF, "&6Thịt Bò Khô", "", "&rQuét sạch cơn đói!");
    public static final SlimefunItemStack PORK_JERKY =
            new SlimefunItemStack("PORK_JERKY", Material.COOKED_PORKCHOP, "&6Thịt Lợn Khô", "", "&rQuét sạch cơn đói!");
    public static final SlimefunItemStack CHICKEN_JERKY = new SlimefunItemStack(
            "CHICKEN_JERKY", Material.COOKED_CHICKEN, "&6Thịt Gà Khô", "", "&rQuét sạch cơn đói!");
    public static final SlimefunItemStack MUTTON_JERKY =
            new SlimefunItemStack("MUTTON_JERKY", Material.COOKED_MUTTON, "&6Thịt Cừu Khô", "", "&rQuét sạch cơn đói!");
    public static final SlimefunItemStack RABBIT_JERKY =
            new SlimefunItemStack("RABBIT_JERKY", Material.COOKED_RABBIT, "&6Thịt Thỏ Khô", "", "&rQuét sạch cơn đói!");
    public static final SlimefunItemStack FISH_JERKY =
            new SlimefunItemStack("FISH_JERKY", Material.COOKED_COD, "&6Cá Khô", "", "&rQuét sạch cơn đói!");
    public static final SlimefunItemStack KELP_COOKIE =
            new SlimefunItemStack("KELP_COOKIE", Material.COOKIE, "&2Bánh Quy Rong Biển");

    /*		Christmas		*/
    public static final SlimefunItemStack CHRISTMAS_MILK = new SlimefunItemStack(
            "CHRISTMAS_MILK",
            Color.WHITE,
            new PotionEffect(PotionEffectType.SATURATION, 4, 0),
            "&6Một Cốc Sữa",
            "",
            LoreBuilder.hunger(2.5));
    public static final SlimefunItemStack CHRISTMAS_CHOCOLATE_MILK = new SlimefunItemStack(
            "CHRISTMAS_CHOCOLATE_MILK",
            Color.MAROON,
            new PotionEffect(PotionEffectType.SATURATION, 11, 0),
            "&6Sữa Socola",
            "",
            LoreBuilder.hunger(3.5));
    public static final SlimefunItemStack CHRISTMAS_EGG_NOG = new SlimefunItemStack(
            "CHRISTMAS_EGG_NOG",
            Color.GRAY,
            new PotionEffect(PotionEffectType.SATURATION, 6, 0),
            "&aNước Trứng",
            "",
            LoreBuilder.hunger(7));
    public static final SlimefunItemStack CHRISTMAS_APPLE_CIDER = new SlimefunItemStack(
            "CHRISTMAS_APPLE_CIDER",
            Color.RED,
            new PotionEffect(PotionEffectType.SATURATION, 13, 0),
            "&cRượu Táo",
            "",
            LoreBuilder.hunger(7));
    public static final SlimefunItemStack CHRISTMAS_COOKIE =
            new SlimefunItemStack("CHRISTMAS_COOKIE", Material.COOKIE, ChatUtils.christmas("Bánh Quy Giáng Sinh"));
    public static final SlimefunItemStack CHRISTMAS_FRUIT_CAKE =
            new SlimefunItemStack("CHRISTMAS_FRUIT_CAKE", Material.PUMPKIN_PIE, ChatUtils.christmas("Bánh Trái Cây"));
    public static final SlimefunItemStack CHRISTMAS_APPLE_PIE =
            new SlimefunItemStack("CHRISTMAS_APPLE_PIE", Material.PUMPKIN_PIE, "&rBánh Táo");
    public static final SlimefunItemStack CHRISTMAS_HOT_CHOCOLATE = new SlimefunItemStack(
            "CHRISTMAS_HOT_CHOCOLATE",
            Color.MAROON,
            new PotionEffect(PotionEffectType.SATURATION, 13, 0),
            "&6Socola Nóng",
            "",
            LoreBuilder.hunger(7));
    public static final SlimefunItemStack CHRISTMAS_CAKE =
            new SlimefunItemStack("CHRISTMAS_CAKE", Material.PUMPKIN_PIE, ChatUtils.christmas("Bánh Giáng Sinh"));
    public static final SlimefunItemStack CHRISTMAS_CARAMEL =
            new SlimefunItemStack("CHRISTMAS_CARAMEL", Material.BRICK, "&6Caramel");
    public static final SlimefunItemStack CHRISTMAS_CARAMEL_APPLE =
            new SlimefunItemStack("CHRISTMAS_CARAMEL_APPLE", Material.APPLE, "&6Táo Caramel");
    public static final SlimefunItemStack CHRISTMAS_CHOCOLATE_APPLE =
            new SlimefunItemStack("CHRISTMAS_CHOCOLATE_APPLE", Material.APPLE, "&6Táo Socola");
    public static final SlimefunItemStack CHRISTMAS_PRESENT = new SlimefunItemStack(
            "CHRISTMAS_PRESENT",
            HeadTexture.CHRISTMAS_PRESENT,
            ChatUtils.christmas("Quà Giáng Sinh"),
            "&7Từ &eTheBusyBiscuit",
            "&7Đến: &eBạn",
            "",
            LoreBuilder.RIGHT_CLICK_TO_OPEN);

    /*		Easter			*/
    public static final SlimefunItemStack EASTER_EGG = new SlimefunItemStack(
            "EASTER_EGG",
            HeadTexture.EASTER_EGG,
            "&rTrứng Phục Sinh",
            "&dPhục Sinh vui vẻ! Mở quà xem nào.",
            "",
            LoreBuilder.RIGHT_CLICK_TO_OPEN);
    public static final SlimefunItemStack EASTER_CARROT_PIE =
            new SlimefunItemStack("CARROT_PIE", Material.PUMPKIN_PIE, "&6Bánh Cà Rốt");
    public static final SlimefunItemStack EASTER_APPLE_PIE =
            new SlimefunItemStack("EASTER_APPLE_PIE", Material.PUMPKIN_PIE, "&rBánh Táo");

    /*		 Weapons 		*/
    public static final SlimefunItemStack GRANDMAS_WALKING_STICK =
            new SlimefunItemStack("GRANDMAS_WALKING_STICK", Material.STICK, "&7Gậy Của Bà");
    public static final SlimefunItemStack GRANDPAS_WALKING_STICK =
            new SlimefunItemStack("GRANDPAS_WALKING_STICK", Material.STICK, "&7Gậy Của Ông");
    public static final SlimefunItemStack SWORD_OF_BEHEADING = new SlimefunItemStack(
            "SWORD_OF_BEHEADING",
            Material.IRON_SWORD,
            "&6Kiếm Chém Đầu",
            "&7Chém Đầu II",
            "",
            "&rCó cơ hội chặt đầu sinh vật",
            "&r(Tăng tỷ lệ rơi đầu Wither Skeleton)");
    public static final SlimefunItemStack BLADE_OF_VAMPIRES = new SlimefunItemStack(
            "BLADE_OF_VAMPIRES",
            Material.GOLDEN_SWORD,
            "&cLưỡi Kiếm Ma Cà Rồng",
            "&7Hút Máu I",
            "",
            "&rKhi tấn công có 45% cơ hội",
            "hồi 2 máu cho bản thân");
    public static final SlimefunItemStack SEISMIC_AXE = new SlimefunItemStack(
            "SEISMIC_AXE",
            Material.IRON_AXE,
            "&aRìu Động Đất",
            "",
            "&7&oGây ra một trận động đất...",
            "",
            LoreBuilder.RIGHT_CLICK_TO_USE);

    static {
        GRANDMAS_WALKING_STICK.addUnsafeEnchantment(Enchantment.KNOCKBACK, 2);
        GRANDPAS_WALKING_STICK.addUnsafeEnchantment(Enchantment.KNOCKBACK, 5);

        BLADE_OF_VAMPIRES.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 2);
        BLADE_OF_VAMPIRES.addUnsafeEnchantment(VersionedEnchantment.UNBREAKING, 4);
        BLADE_OF_VAMPIRES.addUnsafeEnchantment(VersionedEnchantment.SHARPNESS, 2);
    }

    /*		Bows		*/
    public static final SlimefunItemStack EXPLOSIVE_BOW = new SlimefunItemStack(
            "EXPLOSIVE_BOW", Material.BOW, "&cCung Nổ", "&rBị trúng mũi tên từ cung nổ sẽ bay lên trời");
    public static final SlimefunItemStack ICY_BOW = new SlimefunItemStack(
            "ICY_BOW",
            Material.BOW,
            "&bCung Băng",
            "&rBị trúng mũi tên từ cung này",
            "&rsẽ bị đóng băng không di chuyển được (2 giây)");

    /*		 Tools		*/
    public static final SlimefunItemStack SMELTERS_PICKAXE = new SlimefunItemStack(
            "SMELTERS_PICKAXE",
            Material.DIAMOND_PICKAXE,
            "&6Cuốc Nấu Luyện",
            "&c&lTự động nấu chảy",
            "",
            "&9Khi đào có hiệu ứng may mắn");
    public static final SlimefunItemStack LUMBER_AXE =
            new SlimefunItemStack("LUMBER_AXE", Material.DIAMOND_AXE, "&6Rìu Đốn Cây", "&a&oChặt cả cây...");
    public static final SlimefunItemStack PICKAXE_OF_CONTAINMENT = new SlimefunItemStack(
            "PICKAXE_OF_CONTAINMENT",
            Material.IRON_PICKAXE,
            "&cCuốc Lồng Sinh Quái",
            "",
            "&9Có thể lấy được lồng sinh quái");
    public static final SlimefunItemStack EXPLOSIVE_PICKAXE = new SlimefunItemStack(
            "EXPLOSIVE_PICKAXE",
            Material.DIAMOND_PICKAXE,
            "&eCuốc Nổ",
            "",
            "&rDùng vụ nổ để đào khoáng sản nhanh",
            "",
            "&9Hỗ trợ phù phép may mắn");
    public static final SlimefunItemStack EXPLOSIVE_SHOVEL = new SlimefunItemStack(
            "EXPLOSIVE_SHOVEL", Material.DIAMOND_SHOVEL, "&eCái Xẻng Nổ", "", "&rGiúp bạn đào nhiều khối cùng lúc");
    public static final SlimefunItemStack PICKAXE_OF_THE_SEEKER = new SlimefunItemStack(
            "PICKAXE_OF_THE_SEEKER",
            Material.DIAMOND_PICKAXE,
            "&aCuốc Tìm Khoáng",
            "&rKhi dùng sẽ chỉ ra khoáng sản gần bạn",
            "&rnhưng có thể bị hư hại",
            "",
            "&7&eChuột phải&7 để tìm khoáng sản xung quanh");
    public static final SlimefunItemStack COBALT_PICKAXE =
            new SlimefunItemStack("COBALT_PICKAXE", Material.IRON_PICKAXE, "&9Cuốc Coban");
    public static final SlimefunItemStack PICKAXE_OF_VEIN_MINING = new SlimefunItemStack(
            "PICKAXE_OF_VEIN_MINING",
            Material.DIAMOND_PICKAXE,
            "&eCuốc Đào Mạch",
            "",
            "&rCuốc này sẽ đào",
            "&rtoàn bộ mạch khoáng...");
    public static final SlimefunItemStack CLIMBING_PICK = new SlimefunItemStack(
            "CLIMBING_PICK",
            Material.IRON_PICKAXE,
            "&bCuốc Leo Núi",
            "",
            "&fGiúp bạn có thể chuột phải",
            "&fđể leo lên bề mặt chỉ định.",
            "&fPhù phép hiệu quả sẽ tăng tốc độ leo");

    static {
        COBALT_PICKAXE.addUnsafeEnchantment(VersionedEnchantment.UNBREAKING, 10);
        COBALT_PICKAXE.addUnsafeEnchantment(VersionedEnchantment.EFFICIENCY, 6);
    }

    /*		 Armor 		*/
    public static final SlimefunItemStack GLOWSTONE_HELMET = new SlimefunItemStack(
            "GLOWSTONE_HELMET",
            Material.LEATHER_HELMET,
            Color.YELLOW,
            "&e&lMũ Đá Phát Sáng",
            "",
            "&a&oSáng như mặt trời!",
            "",
            "&9+ Hiệu ứng nhìn ban đêm");
    public static final SlimefunItemStack GLOWSTONE_CHESTPLATE = new SlimefunItemStack(
            "GLOWSTONE_CHESTPLATE",
            Material.LEATHER_CHESTPLATE,
            Color.YELLOW,
            "&e&lÁo Giáp Đá Phát Sáng",
            "",
            "&a&oSáng như mặt trời!",
            "",
            "&9+ Hiệu ứng nhìn ban đêm");
    public static final SlimefunItemStack GLOWSTONE_LEGGINGS = new SlimefunItemStack(
            "GLOWSTONE_LEGGINGS",
            Material.LEATHER_LEGGINGS,
            Color.YELLOW,
            "&e&lQuần Đá Phát Sáng",
            "",
            "&a&oSáng như mặt trời!",
            "",
            "&9+ Hiệu ứng nhìn ban đêm");
    public static final SlimefunItemStack GLOWSTONE_BOOTS = new SlimefunItemStack(
            "GLOWSTONE_BOOTS",
            Material.LEATHER_BOOTS,
            Color.YELLOW,
            "&e&lGiày Đá Phát Sáng",
            "",
            "&a&oSáng như mặt trời!",
            "",
            "&9+ Hiệu ứng nhìn ban đêm");
    public static final SlimefunItemStack RAINBOW_LEATHER = new SlimefunItemStack(
            "RAINBOW_LEATHER",
            Material.RABBIT_HIDE,
            Color.FUCHSIA,
            "&dDa Cầu Vồng",
            "",
            "&fDùng để chế tạo trang bị cầu vồng");
    public static final SlimefunItemStack RAINBOW_HELMET = new SlimefunItemStack(
            "RAINBOW_HELMET", Material.LEATHER_HELMET, Color.FUCHSIA, "&d&lMũ Cầu Vồng", "", LoreBuilder.RAINBOW);
    public static final SlimefunItemStack RAINBOW_CHESTPLATE = new SlimefunItemStack(
            "RAINBOW_CHESTPLATE",
            Material.LEATHER_CHESTPLATE,
            Color.FUCHSIA,
            "&d&lÁo Giáp Cầu Vồng",
            "",
            LoreBuilder.RAINBOW);
    public static final SlimefunItemStack RAINBOW_LEGGINGS = new SlimefunItemStack(
            "RAINBOW_LEGGINGS", Material.LEATHER_LEGGINGS, Color.FUCHSIA, "&d&lQuần Cầu Vồng", "", LoreBuilder.RAINBOW);
    public static final SlimefunItemStack RAINBOW_BOOTS = new SlimefunItemStack(
            "RAINBOW_BOOTS", Material.LEATHER_BOOTS, Color.FUCHSIA, "&d&lGiày Cầu Vồng", "", LoreBuilder.RAINBOW);
    public static final SlimefunItemStack ENDER_HELMET = new SlimefunItemStack(
            "ENDER_HELMET",
            Material.LEATHER_HELMET,
            Color.fromRGB(28, 25, 112),
            "&5&lMũ Ender",
            "",
            "&a&oDịch chuyển tùy ý");
    public static final SlimefunItemStack ENDER_CHESTPLATE = new SlimefunItemStack(
            "ENDER_CHESTPLATE",
            Material.LEATHER_CHESTPLATE,
            Color.fromRGB(28, 25, 112),
            "&5&lÁo Giáp Ender",
            "",
            "&a&oDịch chuyển tùy ý");
    public static final SlimefunItemStack ENDER_LEGGINGS = new SlimefunItemStack(
            "ENDER_LEGGINGS",
            Material.LEATHER_LEGGINGS,
            Color.fromRGB(28, 25, 112),
            "&5&lQuần Ender",
            "",
            "&a&oDịch chuyển tùy ý");
    public static final SlimefunItemStack ENDER_BOOTS = new SlimefunItemStack(
            "ENDER_BOOTS",
            Material.LEATHER_BOOTS,
            Color.fromRGB(28, 25, 112),
            "&5&lGiày Ender",
            "",
            "&a&oDịch chuyển tùy ý",
            "",
            "&9+ Không nhận sát thương khi dùng Ngọc Ender");

    public static final SlimefunItemStack SLIME_HELMET = new SlimefunItemStack(
            "SLIME_HELMET", Material.LEATHER_HELMET, Color.LIME, "&a&lMũ Slime", "", "&a&oCảm giác đàn hồi");
    public static final SlimefunItemStack SLIME_CHESTPLATE = new SlimefunItemStack(
            "SLIME_CHESTPLATE",
            Material.LEATHER_CHESTPLATE,
            Color.LIME,
            "&a&lÁo Giáp Slime",
            "",
            "&a&oCảm giác đàn hồi");
    public static final SlimefunItemStack SLIME_LEGGINGS = new SlimefunItemStack(
            "SLIME_LEGGINGS",
            Material.LEATHER_LEGGINGS,
            Color.LIME,
            "&a&lQuần Slime",
            "",
            "&a&oCảm giác đàn hồi",
            "",
            "&9+ Tốc độ");
    public static final SlimefunItemStack SLIME_BOOTS = new SlimefunItemStack(
            "SLIME_BOOTS",
            Material.LEATHER_BOOTS,
            Color.LIME,
            "&a&lGiày Slime",
            "",
            "&a&oCảm giác đàn hồi",
            "",
            "&9+ Tăng nhảy",
            "&9+ Giảm sát thương rơi");

    public static final SlimefunItemStack CACTUS_HELMET =
            new SlimefunItemStack("CACTUS_HELMET", Material.LEATHER_HELMET, Color.GREEN, "&2Mũ Xương Rồng");
    public static final SlimefunItemStack CACTUS_CHESTPLATE = new SlimefunItemStack(
            "CACTUS_CHESTPLATE", Material.LEATHER_CHESTPLATE, Color.GREEN, "&2Áo Giáp Xương Rồng");
    public static final SlimefunItemStack CACTUS_LEGGINGS =
            new SlimefunItemStack("CACTUS_LEGGINGS", Material.LEATHER_LEGGINGS, Color.GREEN, "&2Quần Xương Rồng");
    public static final SlimefunItemStack CACTUS_BOOTS =
            new SlimefunItemStack("CACTUS_BOOTS", Material.LEATHER_BOOTS, Color.GREEN, "&2Giày Xương Rồng");

    public static final SlimefunItemStack DAMASCUS_STEEL_HELMET =
            new SlimefunItemStack("DAMASCUS_STEEL_HELMET", Material.IRON_HELMET, "&7Mũ Thép Damascus");
    public static final SlimefunItemStack DAMASCUS_STEEL_CHESTPLATE =
            new SlimefunItemStack("DAMASCUS_STEEL_CHESTPLATE", Material.IRON_CHESTPLATE, "&7Áo Giáp Thép Damascus");
    public static final SlimefunItemStack DAMASCUS_STEEL_LEGGINGS =
            new SlimefunItemStack("DAMASCUS_STEEL_LEGGINGS", Material.IRON_LEGGINGS, "&7Quần Thép Damascus");
    public static final SlimefunItemStack DAMASCUS_STEEL_BOOTS =
            new SlimefunItemStack("DAMASCUS_STEEL_BOOTS", Material.IRON_BOOTS, "&7Giày Thép Damascus");

    public static final SlimefunItemStack REINFORCED_ALLOY_HELMET =
            new SlimefunItemStack("REINFORCED_ALLOY_HELMET", Material.IRON_HELMET, "&bMũ Hợp Kim Gia Cố");
    public static final SlimefunItemStack REINFORCED_ALLOY_CHESTPLATE =
            new SlimefunItemStack("REINFORCED_ALLOY_CHESTPLATE", Material.IRON_CHESTPLATE, "&bÁo Giáp Hợp Kim Gia Cố");
    public static final SlimefunItemStack REINFORCED_ALLOY_LEGGINGS =
            new SlimefunItemStack("REINFORCED_ALLOY_LEGGINGS", Material.IRON_LEGGINGS, "&bQuần Hợp Kim Gia Cố");
    public static final SlimefunItemStack REINFORCED_ALLOY_BOOTS =
            new SlimefunItemStack("REINFORCED_ALLOY_BOOTS", Material.IRON_BOOTS, "&bGiày Hợp Kim Gia Cố");

    private static final List<String> hazmatLore = new ArrayList<>();

    static {
        hazmatLore.add("");
        hazmatLore.add(ChatColor.GOLD + "Hiệu ứng bộ đồ đầy đủ:");
        hazmatLore.add(ChatColor.YELLOW + "- Miễn nhiễm sát thương phóng xạ");
        hazmatLore.add(ChatColor.YELLOW + "- Miễn nhiễm ong đốt");
    }

    public static final SlimefunItemStack SCUBA_HELMET = new SlimefunItemStack(
            "SCUBA_HELMET", Material.LEATHER_HELMET, Color.ORANGE, "&cMũ Lặn", "", "&7Cho phép bạn thở dưới nước");
    public static final SlimefunItemStack HAZMAT_CHESTPLATE = new SlimefunItemStack(
            "HAZMAT_CHESTPLATE",
            Material.LEATHER_CHESTPLATE,
            Color.ORANGE,
            "&cÁo Chống Hóa Chất",
            "",
            "&7Cho phép bạn đi trong lửa và nham thạch");
    public static final SlimefunItemStack HAZMAT_LEGGINGS = new SlimefunItemStack(
            "HAZMAT_LEGGINGS",
            Material.LEATHER_LEGGINGS,
            Color.ORANGE,
            "&cQuần Chống Hóa Chất",
            hazmatLore.toArray(new String[0]));
    public static final SlimefunItemStack HAZMAT_BOOTS = new SlimefunItemStack(
            "RUBBER_BOOTS",
            Material.LEATHER_BOOTS,
            Color.BLACK,
            "&cGiày Chống Hóa Chất",
            hazmatLore.toArray(new String[0]));

    static {
        ItemMeta helmetMeta = SCUBA_HELMET.getItemMeta();
        List<String> helmetLore = helmetMeta.getLore();
        helmetLore.addAll(hazmatLore);
        helmetMeta.setLore(helmetLore);
        SCUBA_HELMET.setItemMeta(helmetMeta);

        ItemMeta chestplateMeta = HAZMAT_CHESTPLATE.getItemMeta();
        List<String> chestplateLore = chestplateMeta.getLore();
        chestplateLore.addAll(hazmatLore);
        chestplateMeta.setLore(chestplateLore);
        HAZMAT_CHESTPLATE.setItemMeta(chestplateMeta);
    }

    public static final SlimefunItemStack GILDED_IRON_HELMET =
            new SlimefunItemStack("GILDED_IRON_HELMET", Material.GOLDEN_HELMET, "&6Mũ Sắt Mạ Vàng");
    public static final SlimefunItemStack GILDED_IRON_CHESTPLATE =
            new SlimefunItemStack("GILDED_IRON_CHESTPLATE", Material.GOLDEN_CHESTPLATE, "&6Áo Giáp Sắt Mạ Vàng");
    public static final SlimefunItemStack GILDED_IRON_LEGGINGS =
            new SlimefunItemStack("GILDED_IRON_LEGGINGS", Material.GOLDEN_LEGGINGS, "&6Quần Sắt Mạ Vàng");
    public static final SlimefunItemStack GILDED_IRON_BOOTS =
            new SlimefunItemStack("GILDED_IRON_BOOTS", Material.GOLDEN_BOOTS, "&6Giày Sắt Mạ Vàng");

    public static final SlimefunItemStack GOLDEN_HELMET_12K =
            new SlimefunItemStack("GOLD_12K_HELMET", Material.GOLDEN_HELMET, "&6Mũ Vàng", "&912 carat");
    public static final SlimefunItemStack GOLDEN_CHESTPLATE_12K =
            new SlimefunItemStack("GOLD_12K_CHESTPLATE", Material.GOLDEN_CHESTPLATE, "&6Áo Giáp Vàng", "&912 carat");
    public static final SlimefunItemStack GOLDEN_LEGGINGS_12K =
            new SlimefunItemStack("GOLD_12K_LEGGINGS", Material.GOLDEN_LEGGINGS, "&6Quần Vàng", "&912 carat");
    public static final SlimefunItemStack GOLDEN_BOOTS_12K =
            new SlimefunItemStack("GOLD_12K_BOOTS", Material.GOLDEN_BOOTS, "&6Giày Vàng", "&912 carat");

    public static final SlimefunItemStack SLIME_HELMET_STEEL = new SlimefunItemStack(
            "SLIME_STEEL_HELMET", Material.IRON_HELMET, "&a&lMũ Slime", "&7&oĐã gia cố", "", "&a&oCảm giác đàn hồi");
    public static final SlimefunItemStack SLIME_CHESTPLATE_STEEL = new SlimefunItemStack(
            "SLIME_STEEL_CHESTPLATE",
            Material.IRON_CHESTPLATE,
            "&a&lÁo Giáp Slime",
            "&7&oĐã gia cố",
            "",
            "&a&oCảm giác đàn hồi");
    public static final SlimefunItemStack SLIME_LEGGINGS_STEEL = new SlimefunItemStack(
            "SLIME_STEEL_LEGGINGS",
            Material.IRON_LEGGINGS,
            "&a&lQuần Slime",
            "&7&oĐã gia cố",
            "",
            "&a&oCảm giác đàn hồi",
            "",
            "&9+ Tốc độ");
    public static final SlimefunItemStack SLIME_BOOTS_STEEL = new SlimefunItemStack(
            "SLIME_STEEL_BOOTS",
            Material.IRON_BOOTS,
            "&a&lGiày Slime",
            "&7&oĐã gia cố",
            "",
            "&a&oCảm giác đàn hồi",
            "",
            "&9+ Tăng nhảy",
            "&9+ Giảm sát thương rơi");

    public static final SlimefunItemStack BOOTS_OF_THE_STOMPER = new SlimefunItemStack(
            "BOOTS_OF_THE_STOMPER",
            Material.LEATHER_BOOTS,
            Color.AQUA,
            "&bGiày Giẫm Đạp",
            "",
            "&9Tất cả sát thương rơi bạn nhận",
            "&9sẽ chuyển cho sinh vật/người chơi gần đó",
            "",
            "&9+ Giảm sát thương rơi");

    public static final SlimefunItemStack BEE_HELMET =
            new SlimefunItemStack("BEE_HELMET", Material.GOLDEN_HELMET, "&e&lMũ Ong", " ", "&fVzzz vzzz");
    public static final SlimefunItemStack BEE_WINGS = new SlimefunItemStack(
            "BEE_WINGS",
            Material.ELYTRA,
            "&e&lCánh Ong",
            " ",
            "&fVzzz vzzz",
            " ",
            "&9Khi gần mặt đất",
            "&9sẽ kích hoạt chế độ rơi chậm",
            " ");
    public static final SlimefunItemStack BEE_LEGGINGS =
            new SlimefunItemStack("BEE_LEGGINGS", Material.GOLDEN_LEGGINGS, "&e&lQuần Ong", " ", "&fVzzz vzzz");
    public static final SlimefunItemStack BEE_BOOTS = new SlimefunItemStack(
            "BEE_BOOTS",
            Material.GOLDEN_BOOTS,
            "&e&lGiày Ong",
            "&fVzzz vzzz",
            "",
            "&e&oChắc chắn bay lại được",
            "",
            "&9+ Tăng nhảy",
            "&9+ Giảm sát thương rơi");

    static {
        Map<Enchantment, Integer> cactusEnchs = new HashMap<>();
        cactusEnchs.put(Enchantment.THORNS, 3);
        cactusEnchs.put(VersionedEnchantment.UNBREAKING, 6);

        CACTUS_HELMET.addUnsafeEnchantments(cactusEnchs);
        CACTUS_CHESTPLATE.addUnsafeEnchantments(cactusEnchs);
        CACTUS_LEGGINGS.addUnsafeEnchantments(cactusEnchs);
        CACTUS_BOOTS.addUnsafeEnchantments(cactusEnchs);

        Map<Enchantment, Integer> damascusEnchs = new HashMap<>();
        damascusEnchs.put(VersionedEnchantment.UNBREAKING, 5);
        damascusEnchs.put(VersionedEnchantment.PROTECTION, 5);

        DAMASCUS_STEEL_HELMET.addUnsafeEnchantments(damascusEnchs);
        DAMASCUS_STEEL_CHESTPLATE.addUnsafeEnchantments(damascusEnchs);
        DAMASCUS_STEEL_LEGGINGS.addUnsafeEnchantments(damascusEnchs);
        DAMASCUS_STEEL_BOOTS.addUnsafeEnchantments(damascusEnchs);

        Map<Enchantment, Integer> reinforcedEnchs = new HashMap<>();
        reinforcedEnchs.put(VersionedEnchantment.UNBREAKING, 9);
        reinforcedEnchs.put(VersionedEnchantment.PROTECTION, 9);

        REINFORCED_ALLOY_HELMET.addUnsafeEnchantments(reinforcedEnchs);
        REINFORCED_ALLOY_CHESTPLATE.addUnsafeEnchantments(reinforcedEnchs);
        REINFORCED_ALLOY_LEGGINGS.addUnsafeEnchantments(reinforcedEnchs);
        REINFORCED_ALLOY_BOOTS.addUnsafeEnchantments(reinforcedEnchs);

        Map<Enchantment, Integer> gildedEnchs = new HashMap<>();
        gildedEnchs.put(VersionedEnchantment.UNBREAKING, 6);
        gildedEnchs.put(VersionedEnchantment.PROTECTION, 8);

        GILDED_IRON_HELMET.addUnsafeEnchantments(gildedEnchs);
        GILDED_IRON_CHESTPLATE.addUnsafeEnchantments(gildedEnchs);
        GILDED_IRON_LEGGINGS.addUnsafeEnchantments(gildedEnchs);
        GILDED_IRON_BOOTS.addUnsafeEnchantments(gildedEnchs);

        GOLDEN_HELMET_12K.addUnsafeEnchantment(VersionedEnchantment.UNBREAKING, 10);
        GOLDEN_CHESTPLATE_12K.addUnsafeEnchantment(VersionedEnchantment.UNBREAKING, 10);
        GOLDEN_LEGGINGS_12K.addUnsafeEnchantment(VersionedEnchantment.UNBREAKING, 10);
        GOLDEN_BOOTS_12K.addUnsafeEnchantment(VersionedEnchantment.UNBREAKING, 10);

        Map<Enchantment, Integer> slimeEnchs = new HashMap<>();
        slimeEnchs.put(VersionedEnchantment.UNBREAKING, 4);
        slimeEnchs.put(VersionedEnchantment.PROTECTION, 2);

        SLIME_HELMET_STEEL.addUnsafeEnchantments(slimeEnchs);
        SLIME_CHESTPLATE_STEEL.addUnsafeEnchantments(slimeEnchs);
        SLIME_LEGGINGS_STEEL.addUnsafeEnchantments(slimeEnchs);
        SLIME_BOOTS_STEEL.addUnsafeEnchantments(slimeEnchs);

        Map<Enchantment, Integer> beeEnchs = new HashMap<>();
        beeEnchs.put(VersionedEnchantment.UNBREAKING, 4);
        beeEnchs.put(VersionedEnchantment.PROTECTION, 2);

        BEE_HELMET.addUnsafeEnchantments(beeEnchs);
        BEE_WINGS.addUnsafeEnchantments(beeEnchs);
        BEE_LEGGINGS.addUnsafeEnchantments(beeEnchs);
        BEE_BOOTS.addUnsafeEnchantments(beeEnchs);
    }

    /*		 Misc 		*/
    public static final SlimefunItemStack MAGIC_LUMP_1 = new SlimefunItemStack(
            "MAGIC_LUMP_1", Material.GOLD_NUGGET, "&6Tinh Thể Ma Thuật &7- &eI", "", "&c&oCấp độ: I");
    public static final SlimefunItemStack MAGIC_LUMP_2 = new SlimefunItemStack(
            "MAGIC_LUMP_2", Material.GOLD_NUGGET, "&6Tinh Thể Ma Thuật &7- &eII", "", "&c&oCấp độ: II");
    public static final SlimefunItemStack MAGIC_LUMP_3 = new SlimefunItemStack(
            "MAGIC_LUMP_3", Material.GOLD_NUGGET, "&6Tinh Thể Ma Thuật &7- &eIII", "", "&c&oCấp độ: III");
    public static final SlimefunItemStack ENDER_LUMP_1 = new SlimefunItemStack(
            "ENDER_LUMP_1", Material.GOLD_NUGGET, "&5Tinh Thể Ender &7- &eI", "", "&c&oCấp độ: I");
    public static final SlimefunItemStack ENDER_LUMP_2 = new SlimefunItemStack(
            "ENDER_LUMP_2", Material.GOLD_NUGGET, "&5Tinh Thể Ender &7- &eII", "", "&c&oCấp độ: II");
    public static final SlimefunItemStack ENDER_LUMP_3 = new SlimefunItemStack(
            "ENDER_LUMP_3", Material.GOLD_NUGGET, "&5Tinh Thể Ender &7- &eIII", "", "&c&oCấp độ: III");
    public static final SlimefunItemStack MAGICAL_BOOK_COVER = new SlimefunItemStack(
            "MAGICAL_BOOK_COVER", Material.PAPER, "&6Bìa Sách Ma Thuật", "", "&a&oDùng cho nhiều loại sách ma thuật");
    public static final SlimefunItemStack MAGICAL_GLASS = new SlimefunItemStack(
            "MAGICAL_GLASS",
            Material.GLASS_PANE,
            "&6Kính Ma Thuật",
            "",
            "&a&oĐược sử dụng bởi nhiều vật phẩm ma thuật");
    public static final SlimefunItemStack SYNTHETIC_SHULKER_SHELL = new SlimefunItemStack(
            "SYNTHETIC_SHULKER_SHELL",
            Material.SHULKER_SHELL,
            "&dVỏ Shulker Nhân Tạo",
            "",
            "&fCó thể dùng để chế tạo",
            "&fgiống như vỏ shulker thường");
    public static final SlimefunItemStack BASIC_CIRCUIT_BOARD =
            new SlimefunItemStack("BASIC_CIRCUIT_BOARD", Material.ACTIVATOR_RAIL, "&bMạch Điện Cơ Bản");
    public static final SlimefunItemStack ADVANCED_CIRCUIT_BOARD =
            new SlimefunItemStack("ADVANCED_CIRCUIT_BOARD", Material.POWERED_RAIL, "&bMạch Điện Nâng Cao");
    public static final SlimefunItemStack WHEAT_FLOUR =
            new SlimefunItemStack("WHEAT_FLOUR", Material.SUGAR, "&rBột Mì");
    public static final SlimefunItemStack STEEL_PLATE =
            new SlimefunItemStack("STEEL_PLATE", Material.PAPER, "&7&lTấm Thép");
    public static final SlimefunItemStack BATTERY = new SlimefunItemStack("BATTERY", HeadTexture.BATTERY, "&6Pin");
    public static final SlimefunItemStack CARBON = new SlimefunItemStack("CARBON", HeadTexture.CARBON, "&eCarbon");
    public static final SlimefunItemStack COMPRESSED_CARBON =
            new SlimefunItemStack("COMPRESSED_CARBON", HeadTexture.COMPRESSED_CARBON, "&cCarbon Nén");
    public static final SlimefunItemStack CARBON_CHUNK =
            new SlimefunItemStack("CARBON_CHUNK", HeadTexture.CARBON, "&4Khối Carbon");
    public static final SlimefunItemStack STEEL_THRUSTER =
            new SlimefunItemStack("STEEL_THRUSTER", Material.BUCKET, "&7&lĐộng Cơ Đẩy Thép");
    public static final SlimefunItemStack POWER_CRYSTAL =
            new SlimefunItemStack("POWER_CRYSTAL", HeadTexture.POWER_CRYSTAL, "&c&lKhối Năng Lượng");
    public static final SlimefunItemStack CHAIN = new SlimefunItemStack("CHAIN", Material.STRING, "&bXích");
    public static final SlimefunItemStack HOOK = new SlimefunItemStack("HOOK", Material.FLINT, "&bMóc");
    public static final SlimefunItemStack SIFTED_ORE =
            new SlimefunItemStack("SIFTED_ORE", Material.GUNPOWDER, "&6Quặng Đã Sàng");
    public static final SlimefunItemStack STONE_CHUNK =
            new SlimefunItemStack("STONE_CHUNK", HeadTexture.STONE_CHUNK, "&6Mảnh Đá");
    public static final SlimefunItemStack LAVA_CRYSTAL =
            new SlimefunItemStack("LAVA_CRYSTAL", HeadTexture.LAVA_CRYSTAL, "&4Tinh Thể Nham Thạch");
    public static final SlimefunItemStack SALT = new SlimefunItemStack("SALT", Material.SUGAR, "&rMuối");
    public static final SlimefunItemStack CHEESE = new SlimefunItemStack("CHEESE", HeadTexture.CHEESE, "&rPhô Mai");
    public static final SlimefunItemStack BUTTER = new SlimefunItemStack("BUTTER", HeadTexture.BUTTER, "&rBơ");
    public static final SlimefunItemStack DUCT_TAPE = new SlimefunItemStack(
            "DUCT_TAPE",
            HeadTexture.DUCT_TAPE,
            "&8Băng Keo Siêu Dính",
            "",
            "&rCó thể dùng để sửa vật phẩm",
            "&rtrong Đe Tự Động");
    public static final SlimefunItemStack HEAVY_CREAM =
            new SlimefunItemStack("HEAVY_CREAM", Material.SNOWBALL, "&rKem Đặc");
    public static final SlimefunItemStack CRUSHED_ORE =
            new SlimefunItemStack("CRUSHED_ORE", Material.GUNPOWDER, "&6Quặng Đã Nghiền");
    public static final SlimefunItemStack PULVERIZED_ORE =
            new SlimefunItemStack("PULVERIZED_ORE", Material.GUNPOWDER, "&6Quặng Dạng Bột");
    public static final SlimefunItemStack PURE_ORE_CLUSTER =
            new SlimefunItemStack("PURE_ORE_CLUSTER", Material.GUNPOWDER, "&6Cụm Quặng Tinh Khiết");
    public static final SlimefunItemStack SMALL_URANIUM = new SlimefunItemStack(
            "SMALL_URANIUM",
            HeadTexture.URANIUM,
            "&cMột Khối Urani Nhỏ",
            "",
            LoreBuilder.radioactive(Radioactivity.MODERATE),
            LoreBuilder.HAZMAT_SUIT_REQUIRED);
    public static final SlimefunItemStack TINY_URANIUM = new SlimefunItemStack(
            "TINY_URANIUM", HeadTexture.URANIUM, "&cMột Chút Urani", "", LoreBuilder.radioactive(Radioactivity.LOW));

    public static final SlimefunItemStack MAGNET = new SlimefunItemStack("MAGNET", HeadTexture.MAGNET, "&cNam Châm");
    public static final SlimefunItemStack NECROTIC_SKULL =
            new SlimefunItemStack("NECROTIC_SKULL", HeadTexture.NECROTIC_SKULL, "&cHộp Sọ Hoại Tử");
    public static final SlimefunItemStack ESSENCE_OF_AFTERLIFE =
            new SlimefunItemStack("ESSENCE_OF_AFTERLIFE", Material.GUNPOWDER, "&4Tinh Hoa Thế Giới Bên Kia");
    public static final SlimefunItemStack STRANGE_NETHER_GOO = new SlimefunItemStack(
            "STRANGE_NETHER_GOO",
            Material.PURPLE_DYE,
            "&5Chất Nhầy Nether Kỳ Lạ",
            "",
            "&fMột chất liệu kỳ lạ",
            "&fcó thể đổi với Piglin");
    public static final SlimefunItemStack ELECTRO_MAGNET =
            new SlimefunItemStack("ELECTRO_MAGNET", HeadTexture.MAGNET, "&cNam Châm Điện");
    public static final SlimefunItemStack HEATING_COIL =
            new SlimefunItemStack("HEATING_COIL", HeadTexture.HEATING_COIL, "&cDây Nung");
    public static final SlimefunItemStack COOLING_UNIT =
            new SlimefunItemStack("COOLING_UNIT", HeadTexture.COOLING_UNIT, "&bBộ Làm Mát");
    public static final SlimefunItemStack ELECTRIC_MOTOR =
            new SlimefunItemStack("ELECTRIC_MOTOR", HeadTexture.MOTOR, "&cĐộng Cơ Điện");
    public static final SlimefunItemStack CARGO_MOTOR = new SlimefunItemStack(
            "CARGO_MOTOR",
            HeadTexture.CARGO_MOTOR,
            "&3Động Cơ Vận Chuyển",
            "",
            "&7Linh kiện quan trọng của máy vận chuyển hàng");
    public static final SlimefunItemStack SCROLL_OF_DIMENSIONAL_TELEPOSITION = new SlimefunItemStack(
            "SCROLL_OF_DIMENSIONAL_TELEPOSITION",
            Material.PAPER,
            "&6Cuộn Giấy Dịch Chuyển Chiều Không Gian",
            "",
            "&cCuộn giấy này có thể tạo ra",
            "&cmột lỗ đen tạm thời di động",
            "&cdịch chuyển các thực thể gần đó",
            "&cđến một chiều không gian khác",
            "&cmọi thứ đều bị đảo ngược",
            "",
            "&rTức là: làm thực thể quay 180°");
    public static final SlimefunItemStack TOME_OF_KNOWLEDGE_SHARING = new SlimefunItemStack(
            "TOME_OF_KNOWLEDGE_SHARING",
            Material.ENCHANTED_BOOK,
            "&6Sách Chia Sẻ Tri Thức",
            "&7Chủ nhân: &bChưa có",
            "",
            "&eChuột phải&7 để ràng buộc toàn bộ nghiên cứu của bạn",
            "",
            "",
            "&eChuột phải&7 để nhận toàn bộ nghiên cứu của chủ nhân trước");
    public static final SlimefunItemStack HARDENED_GLASS = new SlimefunItemStack(
            "HARDENED_GLASS", Material.LIGHT_GRAY_STAINED_GLASS, "&7Kính Cường Lực", "", "&rCó thể chống vụ nổ");
    public static final SlimefunItemStack WITHER_PROOF_OBSIDIAN = new SlimefunItemStack(
            "WITHER_PROOF_OBSIDIAN",
            Material.OBSIDIAN,
            "&5Hắc Diện Thạch Chống Wither",
            "",
            "&rCó thể chống vụ nổ và",
            "&rcuộc tấn công của Wither");
    public static final SlimefunItemStack WITHER_PROOF_GLASS = new SlimefunItemStack(
            "WITHER_PROOF_GLASS",
            Material.PURPLE_STAINED_GLASS,
            "&5Kính Chống Wither",
            "",
            "&rCó thể chống vụ nổ và",
            "&rcuộc tấn công của Wither");
    public static final SlimefunItemStack REINFORCED_PLATE =
            new SlimefunItemStack("REINFORCED_PLATE", Material.PAPER, "&7Tấm Thép Gia Cố");
    public static final SlimefunItemStack ANCIENT_PEDESTAL = new SlimefunItemStack(
            "ANCIENT_PEDESTAL", Material.DISPENSER, "&dBệ Cổ Đại", "", "&5Một phần của Bàn Thờ Cổ Đại");
    public static final SlimefunItemStack ANCIENT_ALTAR = new SlimefunItemStack(
            "ANCIENT_ALTAR",
            Material.ENCHANTING_TABLE,
            "&dBàn Thờ Cổ Đại",
            "",
            "&5Xây dựng bàn thờ trong thế giới",
            "&5và chế tạo vật phẩm bằng nghi lễ cổ xưa");
    public static final SlimefunItemStack COPPER_WIRE = new SlimefunItemStack(
            "COPPER_WIRE", Material.STRING, "&6Dây Đồng", "", "&6Linh kiện quan trọng của thiết bị điện tử");
    public static final SlimefunItemStack CRAFTING_MOTOR = new SlimefunItemStack(
            "CRAFTING_MOTOR",
            HeadTexture.CRAFTING_MOTOR,
            "&6Động Cơ Chế Tạo",
            "",
            "&7Linh kiện quan trọng của máy chế tạo tự động");

    public static final SlimefunItemStack RAINBOW_WOOL =
            new SlimefunItemStack("RAINBOW_WOOL", Material.WHITE_WOOL, "&5Len Cầu Vồng", "", LoreBuilder.RAINBOW);
    public static final SlimefunItemStack RAINBOW_GLASS = new SlimefunItemStack(
            "RAINBOW_GLASS", Material.WHITE_STAINED_GLASS, "&5Kính Cầu Vồng", "", LoreBuilder.RAINBOW);
    public static final SlimefunItemStack RAINBOW_CLAY = new SlimefunItemStack(
            "RAINBOW_CLAY", Material.WHITE_TERRACOTTA, "&5Đất Sét Cầu Vồng", "", LoreBuilder.RAINBOW);
    public static final SlimefunItemStack RAINBOW_GLASS_PANE = new SlimefunItemStack(
            "RAINBOW_GLASS_PANE", Material.WHITE_STAINED_GLASS_PANE, "&5Tấm Kính Cầu Vồng", "", LoreBuilder.RAINBOW);
    public static final SlimefunItemStack RAINBOW_CONCRETE = new SlimefunItemStack(
            "RAINBOW_CONCRETE", Material.WHITE_CONCRETE, "&5Bê Tông Cầu Vồng", "", LoreBuilder.RAINBOW);
    public static final SlimefunItemStack RAINBOW_GLAZED_TERRACOTTA = new SlimefunItemStack(
            "RAINBOW_GLAZED_TERRACOTTA",
            Material.WHITE_GLAZED_TERRACOTTA,
            "&5Gốm Tráng Men Cầu Vồng",
            "",
            LoreBuilder.RAINBOW);

    private static final String CHRISTMAS = ChatUtils.christmas("< Phiên Bản Giáng Sinh >");

    public static final SlimefunItemStack RAINBOW_WOOL_XMAS = new SlimefunItemStack(
            "RAINBOW_WOOL_XMAS", Material.WHITE_WOOL, "&5Len Cầu Vồng &7(Giáng Sinh)", "", CHRISTMAS);
    public static final SlimefunItemStack RAINBOW_GLASS_XMAS = new SlimefunItemStack(
            "RAINBOW_GLASS_XMAS", Material.WHITE_STAINED_GLASS, "&5Kính Cầu Vồng &7(Giáng Sinh)", "", CHRISTMAS);
    public static final SlimefunItemStack RAINBOW_CLAY_XMAS = new SlimefunItemStack(
            "RAINBOW_CLAY_XMAS", Material.WHITE_TERRACOTTA, "&5Đất Sét Cầu Vồng &7(Giáng Sinh)", "", CHRISTMAS);
    public static final SlimefunItemStack RAINBOW_GLASS_PANE_XMAS = new SlimefunItemStack(
            "RAINBOW_GLASS_PANE_XMAS",
            Material.WHITE_STAINED_GLASS_PANE,
            "&5Tấm Kính Cầu Vồng &7(Giáng Sinh)",
            "",
            CHRISTMAS);
    public static final SlimefunItemStack RAINBOW_CONCRETE_XMAS = new SlimefunItemStack(
            "RAINBOW_CONCRETE_XMAS", Material.WHITE_CONCRETE, "&5Bê Tông Cầu Vồng &7(Giáng Sinh)", "", CHRISTMAS);
    public static final SlimefunItemStack RAINBOW_GLAZED_TERRACOTTA_XMAS = new SlimefunItemStack(
            "RAINBOW_GLAZED_TERRACOTTA_XMAS",
            Material.WHITE_GLAZED_TERRACOTTA,
            "&5Gốm Tráng Men Cầu Vồng &7(Giáng Sinh)",
            "",
            CHRISTMAS);

    private static final String VALENTINES_DAY = "&d< Phiên Bản Lễ Tình Nhân >";

    public static final SlimefunItemStack RAINBOW_WOOL_VALENTINE = new SlimefunItemStack(
            "RAINBOW_WOOL_VALENTINE", Material.PINK_WOOL, "&5Len Cầu Vồng &7(Lễ Tình Nhân)", "", VALENTINES_DAY);
    public static final SlimefunItemStack RAINBOW_GLASS_VALENTINE = new SlimefunItemStack(
            "RAINBOW_GLASS_VALENTINE",
            Material.PINK_STAINED_GLASS,
            "&5Kính Cầu Vồng &7(Lễ Tình Nhân)",
            "",
            VALENTINES_DAY);
    public static final SlimefunItemStack RAINBOW_CLAY_VALENTINE = new SlimefunItemStack(
            "RAINBOW_CLAY_VALENTINE",
            Material.PINK_TERRACOTTA,
            "&5Đất Sét Cầu Vồng &7(Lễ Tình Nhân)",
            "",
            VALENTINES_DAY);
    public static final SlimefunItemStack RAINBOW_GLASS_PANE_VALENTINE = new SlimefunItemStack(
            "RAINBOW_GLASS_PANE_VALENTINE",
            Material.PINK_STAINED_GLASS_PANE,
            "&5Tấm Kính Cầu Vồng &7(Lễ Tình Nhân)",
            "",
            VALENTINES_DAY);
    public static final SlimefunItemStack RAINBOW_CONCRETE_VALENTINE = new SlimefunItemStack(
            "RAINBOW_CONCRETE_VALENTINE",
            Material.PINK_CONCRETE,
            "&5Bê Tông Cầu Vồng &7(Lễ Tình Nhân)",
            "",
            VALENTINES_DAY);
    public static final SlimefunItemStack RAINBOW_GLAZED_TERRACOTTA_VALENTINE = new SlimefunItemStack(
            "RAINBOW_GLAZED_TERRACOTTA_VALENTINE",
            Material.PINK_GLAZED_TERRACOTTA,
            "&5Gốm Tráng Men Cầu Vồng &7(Lễ Tình Nhân)",
            "",
            VALENTINES_DAY);

    private static final String HALLOWEEN = "&6< Phiên Bản Halloween >";

    public static final SlimefunItemStack RAINBOW_WOOL_HALLOWEEN = new SlimefunItemStack(
            "RAINBOW_WOOL_HALLOWEEN", Material.ORANGE_WOOL, "&5Len Cầu Vồng &7(Halloween)", "", HALLOWEEN);
    public static final SlimefunItemStack RAINBOW_GLASS_HALLOWEEN = new SlimefunItemStack(
            "RAINBOW_GLASS_HALLOWEEN", Material.ORANGE_STAINED_GLASS, "&5Kính Cầu Vồng &7(Halloween)", "", HALLOWEEN);
    public static final SlimefunItemStack RAINBOW_CLAY_HALLOWEEN = new SlimefunItemStack(
            "RAINBOW_CLAY_HALLOWEEN", Material.ORANGE_TERRACOTTA, "&5Đất Sét Cầu Vồng &7(Halloween)", "", HALLOWEEN);
    public static final SlimefunItemStack RAINBOW_GLASS_PANE_HALLOWEEN = new SlimefunItemStack(
            "RAINBOW_GLASS_PANE_HALLOWEEN",
            Material.ORANGE_STAINED_GLASS_PANE,
            "&5Tấm Kính Cầu Vồng &7(Halloween)",
            "",
            HALLOWEEN);
    public static final SlimefunItemStack RAINBOW_CONCRETE_HALLOWEEN = new SlimefunItemStack(
            "RAINBOW_CONCRETE_HALLOWEEN", Material.ORANGE_CONCRETE, "&5Bê Tông Cầu Vồng &7(Halloween)", "", HALLOWEEN);
    public static final SlimefunItemStack RAINBOW_GLAZED_TERRACOTTA_HALLOWEEN = new SlimefunItemStack(
            "RAINBOW_GLAZED_TERRACOTTA_HALLOWEEN",
            Material.ORANGE_GLAZED_TERRACOTTA,
            "&5Gốm Tráng Men Cầu Vồng &7(Halloween)",
            "",
            HALLOWEEN);

    /*		Thỏi 		*/
    public static final SlimefunItemStack COPPER_INGOT =
            new SlimefunItemStack("COPPER_INGOT", Material.BRICK, "&bThỏi Đồng");
    public static final SlimefunItemStack TIN_INGOT =
            new SlimefunItemStack("TIN_INGOT", Material.IRON_INGOT, "&bThỏi Thiếc");
    public static final SlimefunItemStack SILVER_INGOT =
            new SlimefunItemStack("SILVER_INGOT", Material.IRON_INGOT, "&bThỏi Bạc");
    public static final SlimefunItemStack ALUMINUM_INGOT =
            new SlimefunItemStack("ALUMINUM_INGOT", Material.IRON_INGOT, "&bThỏi Nhôm");
    public static final SlimefunItemStack LEAD_INGOT =
            new SlimefunItemStack("LEAD_INGOT", Material.IRON_INGOT, "&bThỏi Chì");
    public static final SlimefunItemStack ZINC_INGOT =
            new SlimefunItemStack("ZINC_INGOT", Material.IRON_INGOT, "&bThỏi Kẽm");
    public static final SlimefunItemStack MAGNESIUM_INGOT =
            new SlimefunItemStack("MAGNESIUM_INGOT", Material.IRON_INGOT, "&bThỏi Magiê");

    /*		Alloy (Carbon + Iron)	*/
    public static final SlimefunItemStack STEEL_INGOT =
            new SlimefunItemStack("STEEL_INGOT", Material.IRON_INGOT, "&bThỏi Thép");
    /*		Alloy (Copper + Tin)	*/
    public static final SlimefunItemStack BRONZE_INGOT =
            new SlimefunItemStack("BRONZE_INGOT", Material.BRICK, "&bThỏi Đồng Thanh");
    /*		Alloy (Copper + Aluminum)	*/
    public static final SlimefunItemStack DURALUMIN_INGOT =
            new SlimefunItemStack("DURALUMIN_INGOT", Material.IRON_INGOT, "&bThỏi Duralumin");
    /*		Alloy (Copper + Silver)	*/
    public static final SlimefunItemStack BILLON_INGOT =
            new SlimefunItemStack("BILLON_INGOT", Material.IRON_INGOT, "&bThỏi Hợp Kim Bạc-Đồng");
    /*		Alloy (Copper + Zinc)	*/
    public static final SlimefunItemStack BRASS_INGOT =
            new SlimefunItemStack("BRASS_INGOT", Material.GOLD_INGOT, "&bThỏi Đồng Thau");
    /*		Alloy (Aluminum + Brass)	*/
    public static final SlimefunItemStack ALUMINUM_BRASS_INGOT =
            new SlimefunItemStack("ALUMINUM_BRASS_INGOT", Material.GOLD_INGOT, "&bThỏi Nhôm Thau");
    /*		Alloy (Aluminum + Bronze)	*/
    public static final SlimefunItemStack ALUMINUM_BRONZE_INGOT =
            new SlimefunItemStack("ALUMINUM_BRONZE_INGOT", Material.GOLD_INGOT, "&bThỏi Nhôm Đồng");
    /*		Alloy (Gold + Silver + Copper)	*/
    public static final SlimefunItemStack CORINTHIAN_BRONZE_INGOT =
            new SlimefunItemStack("CORINTHIAN_BRONZE_INGOT", Material.GOLD_INGOT, "&bThỏi Đồng Corinth");
    /*		Alloy (Lead + Tin)	*/
    public static final SlimefunItemStack SOLDER_INGOT =
            new SlimefunItemStack("SOLDER_INGOT", Material.IRON_INGOT, "&bThỏi Thiếc Hàn");
    /*		Alloy (Steel + Iron + Carbon)	*/
    public static final SlimefunItemStack DAMASCUS_STEEL_INGOT =
            new SlimefunItemStack("DAMASCUS_STEEL_INGOT", Material.IRON_INGOT, "&bThỏi Thép Damascus");
    /*		Alloy (Damascus Steel + Duralumin + Compressed Carbon + Aluminium Bronze)	*/
    public static final SlimefunItemStack HARDENED_METAL_INGOT =
            new SlimefunItemStack("HARDENED_METAL_INGOT", Material.IRON_INGOT, "&b&lKim Loại Cứng Hóa");
    /*		Alloy (Hardened Metal + Corinthian Bronze + Solder + Billon + Damascus Steel)	*/
    public static final SlimefunItemStack REINFORCED_ALLOY_INGOT =
            new SlimefunItemStack("REINFORCED_ALLOY_INGOT", Material.IRON_INGOT, "&b&lThỏi Hợp Kim Gia Cố");
    /*		Alloy (Iron + Silicon)		*/
    public static final SlimefunItemStack FERROSILICON =
            new SlimefunItemStack("FERROSILICON", Material.IRON_INGOT, "&bSắt Silicon");
    /*		Alloy (Iron + Gold)			*/
    public static final SlimefunItemStack GILDED_IRON =
            new SlimefunItemStack("GILDED_IRON", Material.GOLD_INGOT, "&6&lThỏi Sắt Mạ Vàng");
    /*		Alloy (Redstone + Ferrosilicon)	*/
    public static final SlimefunItemStack REDSTONE_ALLOY =
            new SlimefunItemStack("REDSTONE_ALLOY", Material.BRICK, "&cThỏi Hợp Kim Redstone");
    /*		Alloy (Iron + Copper)		*/
    public static final SlimefunItemStack NICKEL_INGOT =
            new SlimefunItemStack("NICKEL_INGOT", Material.IRON_INGOT, "&bThỏi Niken");
    /*		Alloy (Nickel + Iron + Copper)		*/
    public static final SlimefunItemStack COBALT_INGOT =
            new SlimefunItemStack("COBALT_INGOT", Material.IRON_INGOT, "&9Thỏi Coban");

    /*		Gold		*/
    public static final SlimefunItemStack GOLD_4K =
            new SlimefunItemStack("GOLD_4K", Material.GOLD_INGOT, "&rThỏi Vàng &7(4 carat)");
    public static final SlimefunItemStack GOLD_6K =
            new SlimefunItemStack("GOLD_6K", Material.GOLD_INGOT, "&rThỏi Vàng &7(6 carat)");
    public static final SlimefunItemStack GOLD_8K =
            new SlimefunItemStack("GOLD_8K", Material.GOLD_INGOT, "&rThỏi Vàng &7(8 carat)");
    public static final SlimefunItemStack GOLD_10K =
            new SlimefunItemStack("GOLD_10K", Material.GOLD_INGOT, "&rThỏi Vàng &7(10 carat)");
    public static final SlimefunItemStack GOLD_12K =
            new SlimefunItemStack("GOLD_12K", Material.GOLD_INGOT, "&rThỏi Vàng &7(12 carat)");
    public static final SlimefunItemStack GOLD_14K =
            new SlimefunItemStack("GOLD_14K", Material.GOLD_INGOT, "&rThỏi Vàng &7(14 carat)");
    public static final SlimefunItemStack GOLD_16K =
            new SlimefunItemStack("GOLD_16K", Material.GOLD_INGOT, "&rThỏi Vàng &7(16 carat)");
    public static final SlimefunItemStack GOLD_18K =
            new SlimefunItemStack("GOLD_18K", Material.GOLD_INGOT, "&rThỏi Vàng &7(18 carat)");
    public static final SlimefunItemStack GOLD_20K =
            new SlimefunItemStack("GOLD_20K", Material.GOLD_INGOT, "&rThỏi Vàng &7(20 carat)");
    public static final SlimefunItemStack GOLD_22K =
            new SlimefunItemStack("GOLD_22K", Material.GOLD_INGOT, "&rThỏi Vàng &7(22 carat)");
    public static final SlimefunItemStack GOLD_24K =
            new SlimefunItemStack("GOLD_24K", Material.GOLD_INGOT, "&rThỏi Vàng &7(24 carat)");

    /*		 Dusts 		*/
    public static final SlimefunItemStack IRON_DUST =
            new SlimefunItemStack("IRON_DUST", Material.GUNPOWDER, "&6Bột Sắt");
    public static final SlimefunItemStack GOLD_DUST =
            new SlimefunItemStack("GOLD_DUST", Material.GLOWSTONE_DUST, "&6Bột Vàng");
    public static final SlimefunItemStack TIN_DUST = new SlimefunItemStack("TIN_DUST", Material.SUGAR, "&6Bột Thiếc");
    public static final SlimefunItemStack COPPER_DUST =
            new SlimefunItemStack("COPPER_DUST", Material.GLOWSTONE_DUST, "&6Bột Đồng");
    public static final SlimefunItemStack SILVER_DUST =
            new SlimefunItemStack("SILVER_DUST", Material.SUGAR, "&6Bột Bạc");
    public static final SlimefunItemStack ALUMINUM_DUST =
            new SlimefunItemStack("ALUMINUM_DUST", Material.SUGAR, "&6Bột Nhôm");
    public static final SlimefunItemStack LEAD_DUST =
            new SlimefunItemStack("LEAD_DUST", Material.GUNPOWDER, "&6Bột Chì");
    public static final SlimefunItemStack SULFATE =
            new SlimefunItemStack("SULFATE", Material.GLOWSTONE_DUST, "&6Muối Sunfat");
    public static final SlimefunItemStack ZINC_DUST = new SlimefunItemStack("ZINC_DUST", Material.SUGAR, "&6Bột Kẽm");
    public static final SlimefunItemStack MAGNESIUM_DUST =
            new SlimefunItemStack("MAGNESIUM_DUST", Material.SUGAR, "&6Bột Magiê");
    public static final SlimefunItemStack SILICON =
            new SlimefunItemStack("SILICON", Material.FIREWORK_STAR, "&6Silicon");
    public static final SlimefunItemStack GOLD_24K_BLOCK =
            new SlimefunItemStack("GOLD_24K_BLOCK", Material.GOLD_BLOCK, "&r&rKhối Vàng &7(24 carat)");

    /*		 Gems 		*/
    public static final SlimefunItemStack SYNTHETIC_DIAMOND = new SlimefunItemStack(
            "SYNTHETIC_DIAMOND",
            Material.DIAMOND,
            "&bKim Cương Nhân Tạo",
            "",
            "&rCó thể dùng trong bàn chế tạo như kim cương thường");
    public static final SlimefunItemStack SYNTHETIC_EMERALD = new SlimefunItemStack(
            "SYNTHETIC_EMERALD",
            Material.EMERALD,
            "&bNgọc Lục Bảo Nhân Tạo",
            "",
            "&rCó thể dùng để giao dịch với dân làng");
    public static final SlimefunItemStack SYNTHETIC_SAPPHIRE = new SlimefunItemStack(
            "SYNTHETIC_SAPPHIRE",
            HeadTexture.SAPPHIRE,
            "&bNgọc Xanh Lam Nhân Tạo",
            "",
            "&rCó thể dùng trong bàn chế tạo như lapis lazuli");
    public static final SlimefunItemStack CARBONADO =
            new SlimefunItemStack("CARBONADO", HeadTexture.CARBONADO, "&b&lKim Cương Đen", "", "&7&o\"Kim cương đen\"");
    public static final SlimefunItemStack RAW_CARBONADO =
            new SlimefunItemStack("RAW_CARBONADO", HeadTexture.RAW_CARBONADO, "&bQuặng Kim Cương Đen Thô");

    public static final SlimefunItemStack URANIUM = new SlimefunItemStack(
            "URANIUM",
            HeadTexture.URANIUM,
            "&4Urani",
            "",
            LoreBuilder.radioactive(Radioactivity.HIGH),
            LoreBuilder.HAZMAT_SUIT_REQUIRED);
    public static final SlimefunItemStack NEPTUNIUM = new SlimefunItemStack(
            "NEPTUNIUM",
            HeadTexture.NEPTUNIUM,
            "&aNeptuni",
            "",
            LoreBuilder.radioactive(Radioactivity.HIGH),
            LoreBuilder.HAZMAT_SUIT_REQUIRED);
    public static final SlimefunItemStack PLUTONIUM = new SlimefunItemStack(
            "PLUTONIUM",
            HeadTexture.PLUTONIUM,
            "&7Plutoni",
            "",
            LoreBuilder.radioactive(Radioactivity.VERY_HIGH),
            LoreBuilder.HAZMAT_SUIT_REQUIRED);
    public static final SlimefunItemStack BOOSTED_URANIUM = new SlimefunItemStack(
            "BOOSTED_URANIUM",
            HeadTexture.BOOSTED_URANIUM,
            "&2Nhiên Liệu Hạt Nhân MOX Plutoni-Urani",
            "",
            LoreBuilder.radioactive(Radioactivity.VERY_HIGH),
            LoreBuilder.HAZMAT_SUIT_REQUIRED);

    /*		Talisman		*/
    public static final SlimefunItemStack COMMON_TALISMAN =
            new SlimefunItemStack("COMMON_TALISMAN", Material.EMERALD, "&6Bùa Hộ Mệnh Thường");
    public static final SlimefunItemStack ENDER_TALISMAN =
            new SlimefunItemStack("ENDER_TALISMAN", Material.EMERALD, "&5Bùa Hộ Mệnh Ender");

    public static final SlimefunItemStack TALISMAN_ANVIL = new SlimefunItemStack(
            "ANVIL_TALISMAN",
            Material.EMERALD,
            "&aBùa Hộ Mệnh Đe",
            "",
            "&fMỗi bùa có thể ngăn chặn",
            "&fmột công cụ bị hỏng do hết độ bền",
            "&fsau đó sẽ bị tiêu hao",
            "",
            "&4&lCảnh báo:",
            "&4Do độ phức tạp của công cụ quá mạnh",
            "&4bùa này không thể sửa công cụ quá mạnh");
    public static final SlimefunItemStack TALISMAN_MINER = new SlimefunItemStack(
            "MINER_TALISMAN",
            Material.EMERALD,
            "&aBùa Hộ Mệnh Thợ Mỏ",
            "",
            "&fKhi bùa này ở trong ba lô",
            "&fsẽ có 20% cơ hội nhân đôi",
            "&fkhoáng sản bạn đào được");
    public static final SlimefunItemStack TALISMAN_FARMER = new SlimefunItemStack(
            "FARMER_TALISMAN",
            Material.EMERALD,
            "&aBùa Hộ Mệnh Nông Dân",
            "",
            "&fKhi bùa này ở trong ba lô",
            "&fsẽ có 20% cơ hội nhân đôi",
            "&fvật phẩm bạn thu hoạch được");
    public static final SlimefunItemStack TALISMAN_HUNTER = new SlimefunItemStack(
            "HUNTER_TALISMAN",
            Material.EMERALD,
            "&aBùa Hộ Mệnh Thợ Săn",
            "",
            "&fKhi bùa này ở trong ba lô",
            "&fsẽ có 20% cơ hội nhân đôi",
            "&fvật phẩm rơi từ sinh vật bạn giết");
    public static final SlimefunItemStack TALISMAN_LAVA = new SlimefunItemStack(
            "LAVA_TALISMAN",
            Material.EMERALD,
            "&aBùa Hộ Mệnh Người Đi Trên Nham",
            "",
            "&fKhi bùa này ở trong ba lô",
            "&fnhận hiệu ứng kháng lửa",
            "&fchỉ khi bạn đi trên nham thạch",
            "&fsau đó sẽ bị tiêu hao");
    public static final SlimefunItemStack TALISMAN_WATER = new SlimefunItemStack(
            "WATER_TALISMAN",
            Material.EMERALD,
            "&aBùa Hộ Mệnh Thợ Lặn",
            "",
            "&fKhi bùa này ở trong ba lô",
            "&fkhi sắp chết đuối",
            "&fbùa sẽ cho bạn hô hấp dưới nước",
            "&fsau đó sẽ bị tiêu hao");
    public static final SlimefunItemStack TALISMAN_ANGEL = new SlimefunItemStack(
            "ANGEL_TALISMAN",
            Material.EMERALD,
            "&aBùa Hộ Mệnh Thiên Thần",
            "",
            "&fKhi bùa này ở trong ba lô",
            "&fcó 75% cơ hội giảm sát thương rơi");
    public static final SlimefunItemStack TALISMAN_FIRE = new SlimefunItemStack(
            "FIRE_TALISMAN",
            Material.EMERALD,
            "&aBùa Hộ Mệnh Lính Cứu Hỏa",
            "",
            "&fKhi bùa này ở trong ba lô",
            "&fkhi bạn bốc cháy",
            "&fcho bạn hiệu ứng kháng lửa",
            "&fsau đó sẽ bị tiêu hao");
    public static final SlimefunItemStack TALISMAN_MAGICIAN = new SlimefunItemStack(
            "MAGICIAN_TALISMAN",
            Material.EMERALD,
            "&aBùa Hộ Mệnh Pháp Sư",
            "",
            "&fKhi bùa này ở trong ba lô",
            "&fkhi phù phép có 80% cơ hội",
            "&fnhận thêm một phù phép");
    public static final SlimefunItemStack TALISMAN_TRAVELLER = new SlimefunItemStack(
            "TRAVELLER_TALISMAN",
            Material.EMERALD,
            "&aBùa Hộ Mệnh Lữ Khách",
            "",
            "&fKhi bùa này ở trong ba lô",
            "&fkhi bắt đầu chạy có 60% cơ hội",
            "&fnhận hiệu ứng tốc độ");
    public static final SlimefunItemStack TALISMAN_WARRIOR = new SlimefunItemStack(
            "WARRIOR_TALISMAN",
            Material.EMERALD,
            "&aBùa Hộ Mệnh Chiến Binh",
            "",
            "&fKhi bùa này ở trong ba lô",
            "&fsau khi bị tấn công sẽ nhận Sức mạnh 3",
            "&fsau đó sẽ bị tiêu hao");
    public static final SlimefunItemStack TALISMAN_KNIGHT = new SlimefunItemStack(
            "KNIGHT_TALISMAN",
            Material.EMERALD,
            "&aBùa Hộ Mệnh Hiệp Sĩ",
            "",
            "&fKhi bùa này ở trong ba lô",
            "&fsau khi bị tấn công",
            "&fcó 30% cơ hội nhận hồi máu trong 5 giây",
            "&fsau đó sẽ bị tiêu hao");
    public static final SlimefunItemStack TALISMAN_WHIRLWIND = new SlimefunItemStack(
            "WHIRLWIND_TALISMAN",
            Material.EMERALD,
            "&aBùa Hộ Mệnh Lốc Xoáy",
            "",
            "&fKhi bùa này ở trong ba lô",
            "&fsẽ có 60% cơ hội",
            "&fbật lại tất cả vật phóng bay về phía bạn");
    public static final SlimefunItemStack TALISMAN_WIZARD = new SlimefunItemStack(
            "WIZARD_TALISMAN",
            Material.EMERALD,
            "&aBùa Hộ Mệnh Phù Thủy",
            "",
            "&fKhi bùa này ở trong ba lô",
            "&fkhi phù phép có thể nhận May mắn 4/5",
            "&fnhưng cũng có thể giảm cấp độ",
            "&fcác phù phép khác trên vật phẩm");
    public static final SlimefunItemStack TALISMAN_CAVEMAN = new SlimefunItemStack(
            "CAVEMAN_TALISMAN",
            Material.EMERALD,
            "&aBùa Hộ Mệnh Người Hang Động",
            "",
            "&fKhi bùa này ở trong ba lô",
            "&fkhi đào có 50% cơ hội",
            "&fnhận hiệu ứng đào nhanh tạm thời");
    public static final SlimefunItemStack TALISMAN_WISE = new SlimefunItemStack(
            "WISE_TALISMAN",
            Material.EMERALD,
            "&aBùa Hộ Mệnh Người Khôn Ngoan",
            "",
            "&fKhi bùa này ở trong ba lô",
            "&fkinh nghiệm nhận được có 20% cơ hội nhân đôi");

    /*		Staves		*/
    public static final SlimefunItemStack STAFF_ELEMENTAL =
            new SlimefunItemStack("STAFF_ELEMENTAL", Material.STICK, "&6Gậy Nguyên Tố");
    public static final SlimefunItemStack STAFF_WIND = new SlimefunItemStack(
            "STAFF_ELEMENTAL_WIND",
            Material.STICK,
            "&6Gậy Nguyên Tố &7- &b&oGió",
            "",
            "&7Nguyên tố: &b&oGió",
            "",
            "&7&eChuột phải&7 để bay lên");
    public static final SlimefunItemStack STAFF_FIRE = new SlimefunItemStack(
            "STAFF_ELEMENTAL_FIRE",
            Material.STICK,
            "&6Gậy Nguyên Tố &7- &c&oLửa",
            "",
            "&7Nguyên tố: &c&oLửa",
            "",
            "&cĐể lửa thanh tẩy mọi thứ!");
    public static final SlimefunItemStack STAFF_WATER = new SlimefunItemStack(
            "STAFF_ELEMENTAL_WATER",
            Material.STICK,
            "&6Gậy Nguyên Tố &7- &1&oNước",
            "",
            "&7Nguyên tố: &1&oNước",
            "",
            "&7&eChuột phải&7 để dập tắt lửa trên người");
    public static final SlimefunItemStack STAFF_STORM = new SlimefunItemStack(
            "STAFF_ELEMENTAL_STORM",
            Material.STICK,
            "&6Gậy Nguyên Tố &7- &8&oSét",
            "",
            "&7Nguyên tố: &8&oSét",
            "",
            "&eChuột phải&7 triệu hồi một tia sét",
            LoreBuilder.usesLeft(StormStaff.MAX_USES));

    static {
        STAFF_WIND.addUnsafeEnchantment(VersionedEnchantment.LUCK_OF_THE_SEA, 1);
        STAFF_FIRE.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 5);
        STAFF_WATER.addUnsafeEnchantment(VersionedEnchantment.AQUA_AFFINITY, 1);
        STAFF_STORM.addUnsafeEnchantment(VersionedEnchantment.UNBREAKING, 1);
    }

    /*		 Machines 		*/
    public static final SlimefunItemStack GRIND_STONE = new SlimefunItemStack(
            "GRIND_STONE", Material.DISPENSER, "&bĐá Mài", "", "&a&oNghiền vật phẩm hiệu quả hơn");
    public static final SlimefunItemStack ARMOR_FORGE = new SlimefunItemStack(
            "ARMOR_FORGE", Material.ANVIL, "&6Bàn Rèn Giáp", "", "&a&oTrao cho bạn sức mạnh tạo ra giáp mạnh");
    public static final SlimefunItemStack MAKESHIFT_SMELTERY = new SlimefunItemStack(
            "MAKESHIFT_SMELTERY",
            Material.BLAST_FURNACE,
            "&eLò Luyện Tạm",
            "",
            "&rPhiên bản đơn giản của lò luyện",
            "&rChỉ có thể nấu chảy bột quặng thành thỏi");
    public static final SlimefunItemStack SMELTERY = new SlimefunItemStack(
            "SMELTERY", Material.FURNACE, "&6Lò Luyện", "", "&aLò nhiệt độ cao có thể nấu chảy kim loại");
    public static final SlimefunItemStack IGNITION_CHAMBER = new SlimefunItemStack(
            "IGNITION_CHAMBER",
            Material.DROPPER,
            "&4Máy Đánh Lửa Tự Động",
            "&rPhòng khi lò luyện mất lửa",
            "&rBỏ đá lửa vào",
            "&rĐặt bên cạnh bộ phát của lò luyện");
    public static final SlimefunItemStack ORE_CRUSHER = new SlimefunItemStack(
            "ORE_CRUSHER", Material.DISPENSER, "&bMáy Nghiền Quặng", "", "&a&oNghiền quặng và nhận gấp đôi bột quặng");
    public static final SlimefunItemStack COMPRESSOR =
            new SlimefunItemStack("COMPRESSOR", Material.PISTON, "&bMáy Nén", "", "&aNén vật phẩm");
    public static final SlimefunItemStack PRESSURE_CHAMBER = new SlimefunItemStack(
            "PRESSURE_CHAMBER", Material.GLASS, "&bBuồng Áp Suất", "", "&aNén thêm nhiều vật phẩm");
    public static final SlimefunItemStack MAGIC_WORKBENCH = new SlimefunItemStack(
            "MAGIC_WORKBENCH",
            Material.CRAFTING_TABLE,
            "&6Bàn Chế Tạo Ma Thuật",
            "",
            "&dTruyền năng lượng ma thuật vào vật phẩm");
    public static final SlimefunItemStack ORE_WASHER = new SlimefunItemStack(
            "ORE_WASHER",
            Material.CAULDRON,
            "&6Máy Rửa Quặng",
            "",
            "&a&oRửa quặng đã sàng thành quặng lọc",
            "&a&ovà cho bạn một ít mảnh đá nhỏ");
    public static final SlimefunItemStack TABLE_SAW = new SlimefunItemStack(
            "TABLE_SAW",
            Material.STONECUTTER,
            "&6Máy Cưa Bàn",
            "",
            "&a&oNhận 8 tấm gỗ từ 1 khúc gỗ",
            "&a&o(Hỗ trợ tất cả loại gỗ)");
    ;
    public static final SlimefunItemStack COMPOSTER = new SlimefunItemStack(
            "COMPOSTER", Material.CAULDRON, "&aMáy Trộn", "", "&a&oCó thể chuyển đổi nhiều vật liệu theo thời gian...");
    public static final SlimefunItemStack ENHANCED_CRAFTING_TABLE = new SlimefunItemStack(
            "ENHANCED_CRAFTING_TABLE",
            Material.CRAFTING_TABLE,
            "&eBàn Chế Tạo Nâng Cao",
            "",
            "&a&oBàn chế tạo nguyên thủy",
            "&a&okhông thể chịu được sức mạnh lớn...");
    public static final SlimefunItemStack CRUCIBLE = new SlimefunItemStack(
            "CRUCIBLE", Material.CAULDRON, "&cNồi Luyện", "", "&a&oDùng để biến vật phẩm thành chất lỏng");
    public static final SlimefunItemStack JUICER = new SlimefunItemStack(
            "JUICER", Material.GLASS_BOTTLE, "&aMáy Ép Nước", "", "&aGiúp bạn tạo ra nước trái cây ngon");

    public static final SlimefunItemStack INDUSTRIAL_MINER = new SlimefunItemStack(
            "INDUSTRIAL_MINER",
            Material.GOLDEN_PICKAXE,
            "&bMáy Đào Công Nghiệp",
            "",
            "&rMáy đào công nghiệp có thể khai thác tất cả khoáng sản",
            "&rtrong phạm vi 7x7 bên dưới nó.",
            "&rBỏ than hoặc nhiên liệu khác vào",
            "&rrương của máy để thêm nhiên liệu.");
    public static final SlimefunItemStack ADVANCED_INDUSTRIAL_MINER = new SlimefunItemStack(
            "ADVANCED_INDUSTRIAL_MINER",
            Material.DIAMOND_PICKAXE,
            "&cMáy Đào Công Nghiệp Nâng Cao",
            "",
            "&rMáy đào công nghiệp nâng cao có thể khai thác tất cả khoáng sản",
            "&rtrong phạm vi 11x11 bên dưới.",
            "&rBỏ dầu hoặc nham thạch vào rương của máy",
            "&rđể thêm nhiên liệu.",
            "",
            "&a+ Chạm tơ");

    static {
        ItemMeta meta = INDUSTRIAL_MINER.getItemMeta();
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        INDUSTRIAL_MINER.setItemMeta(meta);

        ItemMeta meta2 = ADVANCED_INDUSTRIAL_MINER.getItemMeta();
        meta2.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        ADVANCED_INDUSTRIAL_MINER.setItemMeta(meta2);
    }

    public static final SlimefunItemStack SOLAR_PANEL = new SlimefunItemStack(
            "SOLAR_PANEL",
            Material.DAYLIGHT_DETECTOR,
            "&bTấm Pin Quang Điện",
            "",
            "&7Linh kiện quan trọng để chế tạo &bMáy Phát Điện Mặt Trời");

    public static final SlimefunItemStack AUTOMATED_PANNING_MACHINE = new SlimefunItemStack(
            "AUTOMATED_PANNING_MACHINE", Material.BOWL, "&aMáy Lọc Tự Động", "", "&a&oPhiên bản nâng cấp của chảo lọc");
    public static final SlimefunItemStack OUTPUT_CHEST = new SlimefunItemStack(
            "OUTPUT_CHEST",
            Material.CHEST,
            "&4Rương Xuất Vật Phẩm",
            "",
            "&c&oĐặt bên cạnh bộ phát của máy cơ bản",
            "&c&ovật phẩm được tạo sẽ được đưa vào rương");
    public static final SlimefunItemStack HOLOGRAM_PROJECTOR = new SlimefunItemStack(
            "HOLOGRAM_PROJECTOR",
            Material.QUARTZ_SLAB,
            "&bMáy Chiếu Ảnh Ba Chiều",
            "",
            "&rChiếu ra văn bản ba chiều có thể chỉnh sửa");

    /*		 Enhanced Furnaces 		*/
    public static final SlimefunItemStack ENHANCED_FURNACE = new SlimefunItemStack(
            "ENHANCED_FURNACE",
            Material.FURNACE,
            "&7Lò Nâng Cấp - &eI",
            "",
            "&7Tốc độ đốt: &e1x",
            "&7Hiệu suất nhiên liệu: &e1x",
            "&7Hệ số nhân đôi sản phẩm: &e1x");
    public static final SlimefunItemStack ENHANCED_FURNACE_2 = new SlimefunItemStack(
            "ENHANCED_FURNACE_2",
            Material.FURNACE,
            "&7Lò Nâng Cấp - &eII",
            "",
            "&7Tốc độ đốt: &e2x",
            "&7Hiệu suất nhiên liệu: &e1x",
            "&7Hệ số nhân đôi sản phẩm: &e1x");
    public static final SlimefunItemStack ENHANCED_FURNACE_3 = new SlimefunItemStack(
            "ENHANCED_FURNACE_3",
            Material.FURNACE,
            "&7Lò Nâng Cấp - &eIII",
            "",
            "&7Tốc độ đốt: &e2x",
            "&7Hiệu suất nhiên liệu: &e2x",
            "&7Hệ số nhân đôi sản phẩm: &e1x");
    public static final SlimefunItemStack ENHANCED_FURNACE_4 = new SlimefunItemStack(
            "ENHANCED_FURNACE_4",
            Material.FURNACE,
            "&7Lò Nâng Cấp - &eIV",
            "",
            "&7Tốc độ đốt: &e3x",
            "&7Hiệu suất nhiên liệu: &e2x",
            "&7Hệ số nhân đôi sản phẩm: &e1x");
    public static final SlimefunItemStack ENHANCED_FURNACE_5 = new SlimefunItemStack(
            "ENHANCED_FURNACE_5",
            Material.FURNACE,
            "&7Lò Nâng Cấp - &eV",
            "",
            "&7Tốc độ đốt: &e3x",
            "&7Hiệu suất nhiên liệu: &e2x",
            "&7Hệ số nhân đôi sản phẩm: &e2x");
    public static final SlimefunItemStack ENHANCED_FURNACE_6 = new SlimefunItemStack(
            "ENHANCED_FURNACE_6",
            Material.FURNACE,
            "&7Lò Nâng Cấp - &eVI",
            "",
            "&7Tốc độ đốt: &e3x",
            "&7Hiệu suất nhiên liệu: &e3x",
            "&7Hệ số nhân đôi sản phẩm: &e2x");
    public static final SlimefunItemStack ENHANCED_FURNACE_7 = new SlimefunItemStack(
            "ENHANCED_FURNACE_7",
            Material.FURNACE,
            "&7Lò Nâng Cấp - &eVII",
            "",
            "&7Tốc độ đốt: &e4x",
            "&7Hiệu suất nhiên liệu: &e3x",
            "&7Hệ số nhân đôi sản phẩm: &e2x");
    public static final SlimefunItemStack ENHANCED_FURNACE_8 = new SlimefunItemStack(
            "ENHANCED_FURNACE_8",
            Material.FURNACE,
            "&7Lò Nâng Cấp - &eVIII",
            "",
            "&7Tốc độ đốt: &e4x",
            "&7Hiệu suất nhiên liệu: &e4x",
            "&7Hệ số nhân đôi sản phẩm: &e2x");
    public static final SlimefunItemStack ENHANCED_FURNACE_9 = new SlimefunItemStack(
            "ENHANCED_FURNACE_9",
            Material.FURNACE,
            "&7Lò Nâng Cấp - &eIX",
            "",
            "&7Tốc độ đốt: &e5x",
            "&7Hiệu suất nhiên liệu: &e4x",
            "&7Hệ số nhân đôi sản phẩm: &e2x");
    public static final SlimefunItemStack ENHANCED_FURNACE_10 = new SlimefunItemStack(
            "ENHANCED_FURNACE_10",
            Material.FURNACE,
            "&7Lò Nâng Cấp - &eX",
            "",
            "&7Tốc độ đốt: &e5x",
            "&7Hiệu suất nhiên liệu: &e5x",
            "&7Hệ số nhân đôi sản phẩm: &e2x");
    public static final SlimefunItemStack ENHANCED_FURNACE_11 = new SlimefunItemStack(
            "ENHANCED_FURNACE_11",
            Material.FURNACE,
            "&7Lò Nâng Cấp - &eXI",
            "",
            "&7Tốc độ đốt: &e5x",
            "&7Hiệu suất nhiên liệu: &e5x",
            "&7Hệ số nhân đôi sản phẩm: &e3x");
    public static final SlimefunItemStack REINFORCED_FURNACE = new SlimefunItemStack(
            "REINFORCED_FURNACE",
            Material.FURNACE,
            "&7Lò Hợp Kim Gia Cố",
            "",
            "&7Tốc độ đốt: &e10x",
            "&7Hiệu suất nhiên liệu: &e10x",
            "&7Hệ số nhân đôi sản phẩm: &e3x");
    public static final SlimefunItemStack CARBONADO_EDGED_FURNACE = new SlimefunItemStack(
            "CARBONADO_EDGED_FURNACE",
            Material.FURNACE,
            "&7Lò Viền Kim Cương Đen",
            "",
            "&7Tốc độ đốt: &e20x",
            "&7Hiệu suất nhiên liệu: &e10x",
            "&7Hệ số nhân đôi sản phẩm: &e3x");

    public static final SlimefunItemStack BLOCK_PLACER = new SlimefunItemStack(
            "BLOCK_PLACER",
            Material.DISPENSER,
            "&aMáy Đặt Khối",
            "",
            "&rTất cả khối trong bộ phát này",
            "&rsẽ được tự động đặt");

    /*		Soulbound Items		*/
    public static final SlimefunItemStack SOULBOUND_SWORD =
            new SlimefunItemStack("SOULBOUND_SWORD", Material.DIAMOND_SWORD, "&cKiếm Ràng Buộc Linh Hồn");
    public static final SlimefunItemStack SOULBOUND_BOW =
            new SlimefunItemStack("SOULBOUND_BOW", Material.BOW, "&cCung Ràng Buộc Linh Hồn");
    public static final SlimefunItemStack SOULBOUND_PICKAXE =
            new SlimefunItemStack("SOULBOUND_PICKAXE", Material.DIAMOND_PICKAXE, "&cCuốc Ràng Buộc Linh Hồn");
    public static final SlimefunItemStack SOULBOUND_AXE =
            new SlimefunItemStack("SOULBOUND_AXE", Material.DIAMOND_AXE, "&cRìu Ràng Buộc Linh Hồn");
    public static final SlimefunItemStack SOULBOUND_SHOVEL =
            new SlimefunItemStack("SOULBOUND_SHOVEL", Material.DIAMOND_SHOVEL, "&cXẻng Ràng Buộc Linh Hồn");
    public static final SlimefunItemStack SOULBOUND_HOE =
            new SlimefunItemStack("SOULBOUND_HOE", Material.DIAMOND_HOE, "&cCuốc Xới Ràng Buộc Linh Hồn");

    public static final SlimefunItemStack SOULBOUND_HELMET =
            new SlimefunItemStack("SOULBOUND_HELMET", Material.DIAMOND_HELMET, "&cMũ Ràng Buộc Linh Hồn");
    public static final SlimefunItemStack SOULBOUND_CHESTPLATE =
            new SlimefunItemStack("SOULBOUND_CHESTPLATE", Material.DIAMOND_CHESTPLATE, "&cÁo Giáp Ràng Buộc Linh Hồn");
    public static final SlimefunItemStack SOULBOUND_LEGGINGS =
            new SlimefunItemStack("SOULBOUND_LEGGINGS", Material.DIAMOND_LEGGINGS, "&cQuần Ràng Buộc Linh Hồn");
    public static final SlimefunItemStack SOULBOUND_BOOTS =
            new SlimefunItemStack("SOULBOUND_BOOTS", Material.DIAMOND_BOOTS, "&cGiày Ràng Buộc Linh Hồn");
    public static final SlimefunItemStack SOULBOUND_TRIDENT =
            new SlimefunItemStack("SOULBOUND_TRIDENT", Material.TRIDENT, "&cĐinh Ba Ràng Buộc Linh Hồn");

    /* Runes */
    public static final SlimefunItemStack BLANK_RUNE =
            new SlimefunItemStack("BLANK_RUNE", new ColoredFireworkStar(Color.BLACK, "&8Rune Trống"));

    public static final SlimefunItemStack AIR_RUNE = new SlimefunItemStack(
            "ANCIENT_RUNE_AIR", new ColoredFireworkStar(Color.AQUA, "&7Rune Cổ Đại &8&l[&b&lKhí&8&l]"));
    public static final SlimefunItemStack WATER_RUNE = new SlimefunItemStack(
            "ANCIENT_RUNE_WATER", new ColoredFireworkStar(Color.BLUE, "&7Rune Cổ Đại &8&l[&1&lNước&8&l]"));
    public static final SlimefunItemStack FIRE_RUNE = new SlimefunItemStack(
            "ANCIENT_RUNE_FIRE", new ColoredFireworkStar(Color.RED, "&7Rune Cổ Đại &8&l[&4&lLửa&8&l]"));
    public static final SlimefunItemStack EARTH_RUNE = new SlimefunItemStack(
            "ANCIENT_RUNE_EARTH",
            new ColoredFireworkStar(Color.fromRGB(112, 47, 7), "&7Rune Cổ Đại &8&l[&c&lĐất&8&l]"));
    public static final SlimefunItemStack ENDER_RUNE = new SlimefunItemStack(
            "ANCIENT_RUNE_ENDER", new ColoredFireworkStar(Color.PURPLE, "&7Rune Cổ Đại &8&l[&5&lEnder&8&l]"));

    public static final SlimefunItemStack RAINBOW_RUNE = new SlimefunItemStack(
            "ANCIENT_RUNE_RAINBOW", new ColoredFireworkStar(Color.FUCHSIA, "&7Rune Cổ Đại &8&l[&d&lCầu Vồng&8&l]"));
    public static final SlimefunItemStack LIGHTNING_RUNE = new SlimefunItemStack(
            "ANCIENT_RUNE_LIGHTNING",
            new ColoredFireworkStar(Color.fromRGB(255, 255, 95), "&7Rune Cổ Đại &8&l[&e&lSét&8&l]"));
    public static final SlimefunItemStack SOULBOUND_RUNE = new SlimefunItemStack(
            "ANCIENT_RUNE_SOULBOUND",
            new ColoredFireworkStar(
                    Color.fromRGB(47, 0, 117),
                    "&7Rune Cổ Đại &8&l[&5&lRàng Buộc Linh Hồn&8&l]",
                    "&eĐầu tiên vứt vật phẩm bạn muốn ràng buộc xuống đất",
                    "&esau đó vứt rune này về phía vật phẩm đó",
                    "&5để ràng buộc linh hồn &evật phẩm đó.",
                    " ",
                    "&eNên dùng cho vật phẩm &6quan trọng&e.",
                    " ",
                    "&eVật phẩm đã ràng buộc sẽ không rơi khi chết."));
    public static final SlimefunItemStack ENCHANTMENT_RUNE = new SlimefunItemStack(
            "ANCIENT_RUNE_ENCHANTMENT",
            new ColoredFireworkStar(
                    Color.fromRGB(255, 217, 25),
                    "&7Rune Cổ Đại &8&l[&6&lPhù Phép&8&l]",
                    "&eVứt rune về phía vật phẩm đã vứt",
                    "&ecần được &6phù phép",
                    "&evật phẩm đó sẽ nhận một phù phép ngẫu nhiên."));
    public static final SlimefunItemStack VILLAGER_RUNE = new SlimefunItemStack(
            "ANCIENT_RUNE_VILLAGERS",
            new ColoredFireworkStar(
                    Color.fromRGB(160, 20, 5),
                    "&7Rune Cổ Đại &8&l[&4&lDân Làng&8&l]",
                    "&eChuột phải vào dân làng để xóa",
                    "&enghề nghiệp và danh sách giao dịch.",
                    "&eDân làng sẽ tự tìm",
                    "&ecông việc mới sau một thời gian."));

    /*		Electricity			*/
    public static final SlimefunItemStack SOLAR_GENERATOR = new SlimefunItemStack(
            "SOLAR_GENERATOR",
            Material.DAYLIGHT_DETECTOR,
            "&bMáy Phát Điện Mặt Trời",
            "",
            LoreBuilder.machine(MachineTier.BASIC, MachineType.GENERATOR),
            LoreBuilder.powerBuffer(0),
            LoreBuilder.powerPerSecond(4));
    public static final SlimefunItemStack SOLAR_GENERATOR_2 = new SlimefunItemStack(
            "SOLAR_GENERATOR_2",
            Material.DAYLIGHT_DETECTOR,
            "&cMáy Phát Điện Mặt Trời Nâng Cao",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.GENERATOR),
            LoreBuilder.powerBuffer(0),
            LoreBuilder.powerPerSecond(16));
    public static final SlimefunItemStack SOLAR_GENERATOR_3 = new SlimefunItemStack(
            "SOLAR_GENERATOR_3",
            Material.DAYLIGHT_DETECTOR,
            "&4Máy Phát Điện Mặt Trời Kim Cương Đen",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.GENERATOR),
            LoreBuilder.powerBuffer(0),
            LoreBuilder.powerPerSecond(64));
    public static final SlimefunItemStack SOLAR_GENERATOR_4 = new SlimefunItemStack(
            "SOLAR_GENERATOR_4",
            Material.DAYLIGHT_DETECTOR,
            "&eMáy Phát Điện Mặt Trời Tích Điện",
            "",
            "&9Có thể hoạt động ban đêm",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.GENERATOR),
            LoreBuilder.powerBuffer(0),
            LoreBuilder.powerPerSecond(256),
            " (Ban ngày)",
            LoreBuilder.powerPerSecond(128),
            " (Ban đêm)");

    public static final SlimefunItemStack COAL_GENERATOR = new SlimefunItemStack(
            "COAL_GENERATOR",
            HeadTexture.GENERATOR,
            "&cMáy Phát Điện Than",
            "",
            LoreBuilder.machine(MachineTier.AVERAGE, MachineType.GENERATOR),
            LoreBuilder.powerBuffer(64),
            LoreBuilder.powerPerSecond(16));
    public static final SlimefunItemStack COAL_GENERATOR_2 = new SlimefunItemStack(
            "COAL_GENERATOR_2",
            HeadTexture.GENERATOR,
            "&cMáy Phát Điện Than &7(&eII&7)",
            "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.GENERATOR),
            LoreBuilder.powerBuffer(256),
            LoreBuilder.powerPerSecond(30));

    public static final SlimefunItemStack LAVA_GENERATOR = new SlimefunItemStack(
            "LAVA_GENERATOR",
            HeadTexture.GENERATOR,
            "&4Máy Phát Điện Nham Thạch",
            "",
            LoreBuilder.machine(MachineTier.AVERAGE, MachineType.GENERATOR),
            LoreBuilder.powerBuffer(512),
            LoreBuilder.powerPerSecond(20));
    public static final SlimefunItemStack LAVA_GENERATOR_2 = new SlimefunItemStack(
            "LAVA_GENERATOR_2",
            HeadTexture.GENERATOR,
            "&4Máy Phát Điện Nham Thạch &7(&eII&7)",
            "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.GENERATOR),
            LoreBuilder.powerBuffer(1024),
            LoreBuilder.powerPerSecond(40));

    public static final SlimefunItemStack ELECTRIC_FURNACE = new SlimefunItemStack(
            "ELECTRIC_FURNACE",
            Material.FURNACE,
            "&cLò Điện",
            "",
            LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE),
            "&8\u21E8 &7Tốc độ: 1x",
            LoreBuilder.powerPerSecond(4));
    public static final SlimefunItemStack ELECTRIC_FURNACE_2 = new SlimefunItemStack(
            "ELECTRIC_FURNACE_2",
            Material.FURNACE,
            "&cLò Điện &7- &eII",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
            "&8\u21E8 &7Tốc độ: 2x",
            LoreBuilder.powerPerSecond(6));
    public static final SlimefunItemStack ELECTRIC_FURNACE_3 = new SlimefunItemStack(
            "ELECTRIC_FURNACE_3",
            Material.FURNACE,
            "&cLò Điện &7- &eIII",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
            "&8\u21E8 &7Tốc độ: 4x",
            LoreBuilder.powerPerSecond(10));

    public static final SlimefunItemStack ELECTRIC_ORE_GRINDER = new SlimefunItemStack(
            "ELECTRIC_ORE_GRINDER",
            Material.FURNACE,
            "&cMáy Nghiền Quặng Điện",
            "",
            "&rSự kết hợp hoàn hảo của máy nghiền quặng và đá mài",
            "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            "&8\u21E8 &7Tốc độ: 1x",
            LoreBuilder.powerPerSecond(12));
    public static final SlimefunItemStack ELECTRIC_ORE_GRINDER_2 = new SlimefunItemStack(
            "ELECTRIC_ORE_GRINDER_2",
            Material.FURNACE,
            "&cMáy Nghiền Quặng Điện &7(&eII&7)",
            "",
            "&rSự kết hợp hoàn hảo của máy nghiền quặng và đá mài",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Tốc độ: 4x",
            LoreBuilder.powerPerSecond(30));
    public static final SlimefunItemStack ELECTRIC_ORE_GRINDER_3 = new SlimefunItemStack(
            "ELECTRIC_ORE_GRINDER_3",
            Material.FURNACE,
            "&cMáy Nghiền Quặng Điện &7(&eIII&7)",
            "",
            "&fSự kết hợp hoàn hảo của máy nghiền quặng và đá mài",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.speed(10),
            LoreBuilder.powerPerSecond(90));
    public static final SlimefunItemStack ELECTRIC_INGOT_PULVERIZER = new SlimefunItemStack(
            "ELECTRIC_INGOT_PULVERIZER",
            Material.FURNACE,
            "&cMáy Nghiền Thỏi Điện",
            "",
            "&rBiến thỏi thành bột",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
            "&8\u21E8 &7Tốc độ: 1x",
            LoreBuilder.powerPerSecond(14));
    public static final SlimefunItemStack AUTO_DRIER = new SlimefunItemStack(
            "AUTO_DRIER",
            Material.SMOKER,
            "&eMáy Sấy Khô Tự Động",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
            "&8\u21E8 &7Tốc độ: 1x",
            LoreBuilder.powerPerSecond(10));
    public static final SlimefunItemStack AUTO_ENCHANTER = new SlimefunItemStack(
            "AUTO_ENCHANTER",
            Material.ENCHANTING_TABLE,
            "&5Máy Phù Phép Tự Động",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
            LoreBuilder.speed(1),
            LoreBuilder.powerPerSecond(18));
    public static final SlimefunItemStack AUTO_ENCHANTER_2 = new SlimefunItemStack(
            "AUTO_ENCHANTER_2",
            Material.ENCHANTING_TABLE,
            "&5Máy Phù Phép Tự Động &7- &eII",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.speed(3),
            LoreBuilder.powerPerSecond(48));
    public static final SlimefunItemStack AUTO_DISENCHANTER = new SlimefunItemStack(
            "AUTO_DISENCHANTER",
            Material.ENCHANTING_TABLE,
            "&5Máy Gỡ Phù Phép Tự Động",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
            LoreBuilder.speed(1),
            LoreBuilder.powerPerSecond(18));
    public static final SlimefunItemStack AUTO_DISENCHANTER_2 = new SlimefunItemStack(
            "AUTO_DISENCHANTER_2",
            Material.ENCHANTING_TABLE,
            "&5Máy Gỡ Phù Phép Tự Động &7- &eII",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.speed(3),
            LoreBuilder.powerPerSecond(48));
    public static final SlimefunItemStack AUTO_ANVIL = new SlimefunItemStack(
            "AUTO_ANVIL",
            Material.IRON_BLOCK,
            "&7Đe Tự Động",
            "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            "&8\u21E8 &7Có thể sửa phần trăm: 10%",
            LoreBuilder.powerPerSecond(24));
    public static final SlimefunItemStack AUTO_ANVIL_2 = new SlimefunItemStack(
            "AUTO_ANVIL_2",
            Material.IRON_BLOCK,
            "&7Đe Tự Động Mk.II",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Có thể sửa phần trăm: 25%",
            LoreBuilder.powerPerSecond(32));
    public static final SlimefunItemStack AUTO_BREWER = new SlimefunItemStack(
            "AUTO_BREWER",
            Material.SMOKER,
            "&eMáy Pha Chế Tự Động",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
            LoreBuilder.speed(1),
            LoreBuilder.powerPerSecond(12));

    public static final SlimefunItemStack BOOK_BINDER = new SlimefunItemStack(
            "BOOK_BINDER",
            Material.BOOKSHELF,
            "&6Máy Gộp Sách Phù Phép",
            "",
            "&fGộp nhiều sách phù phép vào một cuốn.",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
            LoreBuilder.powerPerSecond(16));

    public static final SlimefunItemStack BIO_REACTOR = new SlimefunItemStack(
            "BIO_REACTOR",
            Material.LIME_TERRACOTTA,
            "&2Máy Phát Điện Sinh Học",
            "",
            LoreBuilder.machine(MachineTier.AVERAGE, MachineType.GENERATOR),
            "&8\u21E8 &e\u26A1 &7128 J có thể lưu trữ",
            LoreBuilder.powerPerSecond(8));
    public static final SlimefunItemStack MULTIMETER = new SlimefunItemStack(
            "MULTIMETER", Material.CLOCK, "&eĐồng Hồ Vạn Năng", "", "&rXem năng lượng lưu trữ trong máy");

    public static final SlimefunItemStack SMALL_CAPACITOR = new SlimefunItemStack(
            "SMALL_CAPACITOR",
            HeadTexture.CAPACITOR_25,
            "&aTụ Điện Lưu Trữ Nhỏ",
            LoreBuilder.range(6),
            "",
            LoreBuilder.machine(MachineTier.BASIC, MachineType.CAPACITOR),
            "&8\u21E8 &e\u26A1 &7128 J có thể lưu trữ");
    public static final SlimefunItemStack MEDIUM_CAPACITOR = new SlimefunItemStack(
            "MEDIUM_CAPACITOR",
            HeadTexture.CAPACITOR_25,
            "&aTụ Điện Lưu Trữ Trung Bình",
            LoreBuilder.range(6),
            "",
            LoreBuilder.machine(MachineTier.AVERAGE, MachineType.CAPACITOR),
            LoreBuilder.powerBuffer(512));
    public static final SlimefunItemStack BIG_CAPACITOR = new SlimefunItemStack(
            "BIG_CAPACITOR",
            HeadTexture.CAPACITOR_25,
            "&aTụ Điện Lưu Trữ Lớn",
            LoreBuilder.range(6),
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.CAPACITOR),
            LoreBuilder.powerBuffer(1024));
    public static final SlimefunItemStack LARGE_CAPACITOR = new SlimefunItemStack(
            "LARGE_CAPACITOR",
            HeadTexture.CAPACITOR_25,
            "&aTụ Điện Lưu Trữ Khổng Lồ",
            LoreBuilder.range(6),
            "",
            LoreBuilder.machine(MachineTier.GOOD, MachineType.CAPACITOR),
            LoreBuilder.powerBuffer(8192));
    public static final SlimefunItemStack CARBONADO_EDGED_CAPACITOR = new SlimefunItemStack(
            "CARBONADO_EDGED_CAPACITOR",
            HeadTexture.CAPACITOR_25,
            "&aTụ Điện Lưu Trữ Viền Kim Cương Đen",
            LoreBuilder.range(6),
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.CAPACITOR),
            LoreBuilder.powerBuffer(65536));
    public static final SlimefunItemStack ENERGIZED_CAPACITOR = new SlimefunItemStack(
            "ENERGIZED_CAPACITOR",
            HeadTexture.CAPACITOR_25,
            "&aTụ Điện Lưu Trữ Cuối Cùng",
            LoreBuilder.range(6),
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.CAPACITOR),
            LoreBuilder.powerBuffer(524288));

    /*		Robots				*/
    public static final SlimefunItemStack PROGRAMMABLE_ANDROID = new SlimefunItemStack(
            "PROGRAMMABLE_ANDROID",
            HeadTexture.PROGRAMMABLE_ANDROID,
            "&cRobot Lập Trình Được &7(Thường)",
            "",
            "&8\u21E8 &7Chức năng: Không",
            "&8\u21E8 &7Hiệu suất nhiên liệu: 1.0x");
    public static final SlimefunItemStack PROGRAMMABLE_ANDROID_FARMER = new SlimefunItemStack(
            "PROGRAMMABLE_ANDROID_FARMER",
            HeadTexture.PROGRAMMABLE_ANDROID_FARMER,
            "&cRobot Lập Trình Được &7(Nông Dân)",
            "",
            "&8\u21E8 &7Chức năng: Trồng trọt",
            "&8\u21E8 &7Hiệu suất nhiên liệu: 1.0x");
    public static final SlimefunItemStack PROGRAMMABLE_ANDROID_MINER = new SlimefunItemStack(
            "PROGRAMMABLE_ANDROID_MINER",
            HeadTexture.PROGRAMMABLE_ANDROID_MINER,
            "&cRobot Lập Trình Được &7(Thợ Mỏ)",
            "",
            "&8\u21E8 &7Chức năng: Đào mỏ",
            "&8\u21E8 &7Hiệu suất nhiên liệu: 1.0x");
    public static final SlimefunItemStack PROGRAMMABLE_ANDROID_WOODCUTTER = new SlimefunItemStack(
            "PROGRAMMABLE_ANDROID_WOODCUTTER",
            HeadTexture.PROGRAMMABLE_ANDROID_WOODCUTTER,
            "&cRobot Lập Trình Được &7(Tiều Phu)",
            "",
            "&8\u21E8 &7Chức năng: Đốn cây",
            "&8\u21E8 &7Hiệu suất nhiên liệu: 1.0x");
    public static final SlimefunItemStack PROGRAMMABLE_ANDROID_BUTCHER = new SlimefunItemStack(
            "PROGRAMMABLE_ANDROID_BUTCHER",
            HeadTexture.PROGRAMMABLE_ANDROID_BUTCHER,
            "&cRobot Lập Trình Được &7(Đồ Tể)",
            "",
            "&8\u21E8 &7Chức năng: Giết mổ",
            "&8\u21E8 &7Sát thương: 4",
            "&8\u21E8 &7Hiệu suất nhiên liệu: 1.0x");
    public static final SlimefunItemStack PROGRAMMABLE_ANDROID_FISHERMAN = new SlimefunItemStack(
            "PROGRAMMABLE_ANDROID_FISHERMAN",
            HeadTexture.PROGRAMMABLE_ANDROID_FISHERMAN,
            "&cRobot Lập Trình Được &7(Ngư Dân)",
            "",
            "&8\u21E8 &7Chức năng: Câu cá",
            "&8\u21E8 &7Tỷ lệ thành công: 10%",
            "&8\u21E8 &7Hiệu suất nhiên liệu: 1.0x");

    public static final SlimefunItemStack PROGRAMMABLE_ANDROID_2 = new SlimefunItemStack(
            "PROGRAMMABLE_ANDROID_2",
            HeadTexture.PROGRAMMABLE_ANDROID,
            "&cRobot Lập Trình Nâng Cao &7(Thường)",
            "",
            "&8\u21E8 &7Chức năng: Không",
            "&8\u21E8 &7Hiệu suất nhiên liệu: 1.5x");
    public static final SlimefunItemStack PROGRAMMABLE_ANDROID_2_FISHERMAN = new SlimefunItemStack(
            "PROGRAMMABLE_ANDROID_2_FISHERMAN",
            HeadTexture.PROGRAMMABLE_ANDROID_FISHERMAN,
            "&cRobot Lập Trình Nâng Cao &7(Ngư Dân)",
            "",
            "&8\u21E8 &7Chức năng: Câu cá",
            "&8\u21E8 &7Tỷ lệ thành công: 20%",
            "&8\u21E8 &7Hiệu suất nhiên liệu: 1.5x");
    public static final SlimefunItemStack PROGRAMMABLE_ANDROID_2_FARMER = new SlimefunItemStack(
            "PROGRAMMABLE_ANDROID_2_FARMER",
            HeadTexture.PROGRAMMABLE_ANDROID_FARMER,
            "&cRobot Lập Trình Nâng Cao &7(Nông Dân)",
            "",
            "&8\u21E8 &7Chức năng: Trồng trọt",
            "&8\u21E8 &7Hiệu suất nhiên liệu: 1.5x",
            "&8\u21E8 &7Có thể thu hoạch cây trong Vườn Kỳ Lạ");
    public static final SlimefunItemStack PROGRAMMABLE_ANDROID_2_BUTCHER = new SlimefunItemStack(
            "PROGRAMMABLE_ANDROID_2_BUTCHER",
            HeadTexture.PROGRAMMABLE_ANDROID_BUTCHER,
            "&cRobot Lập Trình Nâng Cao &7(Đồ Tể)",
            "",
            "&8\u21E8 &7Chức năng: Giết mổ",
            "&8\u21E8 &7Sát thương: 8",
            "&8\u21E8 &7Hiệu suất nhiên liệu: 1.5x");

    public static final SlimefunItemStack PROGRAMMABLE_ANDROID_3 = new SlimefunItemStack(
            "PROGRAMMABLE_ANDROID_3",
            HeadTexture.PROGRAMMABLE_ANDROID,
            "&eRobot Lập Trình Có Thể Cấp Quyền &7(Thường)",
            "",
            "&8\u21E8 &7Chức năng: Không",
            "&8\u21E8 &7Hiệu suất nhiên liệu: 3.0x");
    public static final SlimefunItemStack PROGRAMMABLE_ANDROID_3_FISHERMAN = new SlimefunItemStack(
            "PROGRAMMABLE_ANDROID_3_FISHERMAN",
            HeadTexture.PROGRAMMABLE_ANDROID_FISHERMAN,
            "&eRobot Lập Trình Có Thể Cấp Quyền &7(Ngư Dân)",
            "",
            "&8\u21E8 &7Chức năng: Câu cá",
            "&8\u21E8 &7Tỷ lệ thành công: 30%",
            "&8\u21E8 &7Hiệu suất nhiên liệu: 8.0x");
    public static final SlimefunItemStack PROGRAMMABLE_ANDROID_3_BUTCHER = new SlimefunItemStack(
            "PROGRAMMABLE_ANDROID_3_BUTCHER",
            HeadTexture.PROGRAMMABLE_ANDROID_BUTCHER,
            "&eRobot Lập Trình Có Thể Cấp Quyền &7(Đồ Tể)",
            "",
            "&8\u21E8 &7Chức năng: Giết mổ",
            "&8\u21E8 &7Sát thương: 20",
            "&8\u21E8 &7Hiệu suất nhiên liệu: 8.0x");

    /*		       GPS		       */
    public static final SlimefunItemStack GPS_TRANSMITTER = new SlimefunItemStack(
            "GPS_TRANSMITTER",
            HeadTexture.GPS_TRANSMITTER,
            "&bBộ Phát GPS",
            "",
            LoreBuilder.powerBuffer(16),
            LoreBuilder.powerPerSecond(2));
    public static final SlimefunItemStack GPS_TRANSMITTER_2 = new SlimefunItemStack(
            "GPS_TRANSMITTER_2",
            HeadTexture.GPS_TRANSMITTER,
            "&cBộ Phát GPS Nâng Cao",
            "",
            LoreBuilder.powerBuffer(64),
            LoreBuilder.powerPerSecond(6));
    public static final SlimefunItemStack GPS_TRANSMITTER_3 = new SlimefunItemStack(
            "GPS_TRANSMITTER_3",
            HeadTexture.GPS_TRANSMITTER,
            "&4Bộ Phát GPS Kim Cương Đen",
            "",
            LoreBuilder.powerBuffer(256),
            LoreBuilder.powerPerSecond(22));
    public static final SlimefunItemStack GPS_TRANSMITTER_4 = new SlimefunItemStack(
            "GPS_TRANSMITTER_4",
            HeadTexture.GPS_TRANSMITTER,
            "&eBộ Phát GPS Tích Điện",
            "",
            LoreBuilder.powerBuffer(1024),
            LoreBuilder.powerPerSecond(92));

    public static final SlimefunItemStack GPS_MARKER_TOOL = new SlimefunItemStack(
            "GPS_MARKER_TOOL",
            Material.REDSTONE_TORCH,
            "&bCông Cụ Đặt Điểm Đường GPS",
            "",
            "&rCho phép bạn đặt một điểm dịch chuyển",
            "&rtại vị trí công cụ đánh dấu và đặt tên");
    public static final SlimefunItemStack GPS_CONTROL_PANEL = new SlimefunItemStack(
            "GPS_CONTROL_PANEL",
            HeadTexture.GPS_CONTROL_PANEL,
            "&bBảng Điều Khiển GPS",
            "",
            "&rCho phép bạn theo dõi vệ tinh GPS",
            "&rvà quản lý các điểm đường đã có");
    public static final SlimefunItemStack GPS_EMERGENCY_TRANSMITTER = new SlimefunItemStack(
            "GPS_EMERGENCY_TRANSMITTER",
            HeadTexture.GPS_TRANSMITTER,
            "&cBộ Phát GPS Khẩn Cấp",
            "",
            "&rKhi bạn chết",
            "&rnếu bộ phát khẩn cấp trong ba lô",
            "&rsẽ tự động đặt vị trí chết làm điểm đường");

    public static final SlimefunItemStack ANDROID_INTERFACE_FUEL = new SlimefunItemStack(
            "ANDROID_INTERFACE_FUEL",
            Material.DISPENSER,
            "&7Giao Diện Tương Tác Robot &c(Nhiên Liệu)",
            "",
            "&rKhi script yêu cầu",
            "&rvật phẩm trong giao diện tương tác",
            "&rsẽ được đưa vào ô nhiên liệu robot");
    public static final SlimefunItemStack ANDROID_INTERFACE_ITEMS = new SlimefunItemStack(
            "ANDROID_INTERFACE_ITEMS",
            Material.DISPENSER,
            "&7Giao Diện Tương Tác Robot &9(Vật Phẩm)",
            "",
            "&rKhi script yêu cầu",
            "&rvật phẩm trong kho robot",
            "&rsẽ được đưa vào giao diện tương tác");

    public static final SlimefunItemStack GPS_GEO_SCANNER = new SlimefunItemStack(
            "GPS_GEO_SCANNER",
            HeadTexture.GEO_SCANNER,
            "&bMáy Quét Địa Hình GPS",
            "",
            "&rQuét có bao nhiêu tài nguyên tự nhiên trong chunk",
            "&rví dụ &8Dầu");
    public static final SlimefunItemStack PORTABLE_GEO_SCANNER = new SlimefunItemStack(
            "PORTABLE_GEO_SCANNER",
            Material.CLOCK,
            "&bMáy Quét Tài Nguyên Di Động",
            "",
            "&rQuét tài nguyên tự nhiên trong chunk",
            "",
            "&eChuột phải&7 để quét");
    public static final SlimefunItemStack GEO_MINER = new SlimefunItemStack(
            "GEO_MINER",
            HeadTexture.GEO_MINER,
            "&6Máy Khai Thác Tài Nguyên Tự Nhiên",
            "",
            "&eKhai thác tài nguyên từ chunk",
            "&eCó thể khai thác tài nguyên không thể đào bằng cuốc",
            "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            "&8\u21E8 &7Tốc độ: 1x",
            LoreBuilder.powerPerSecond(48),
            "",
            "&c&l! &cHãy chắc chắn đã quét địa hình GEO");
    public static final SlimefunItemStack OIL_PUMP = new SlimefunItemStack(
            "OIL_PUMP",
            HeadTexture.OIL_PUMP,
            "&rMáy Bơm Dầu",
            "",
            "&7Bơm dầu thô và đổ vào xô",
            "",
            "&c&l! &cVui lòng quét địa hình chunk trước");
    public static final SlimefunItemStack OIL_BUCKET =
            new SlimefunItemStack("BUCKET_OF_OIL", HeadTexture.OIL_BUCKET, "&rXô Dầu Thô");
    public static final SlimefunItemStack FUEL_BUCKET =
            new SlimefunItemStack("BUCKET_OF_FUEL", HeadTexture.FUEL_BUCKET, "&rXô Nhiên Liệu");

    public static final SlimefunItemStack REFINERY =
            new SlimefunItemStack("REFINERY", Material.PISTON, "&cMáy Lọc Dầu", "", "&rLọc dầu thô thành nhiên liệu");
    public static final SlimefunItemStack COMBUSTION_REACTOR = new SlimefunItemStack(
            "COMBUSTION_REACTOR",
            HeadTexture.GENERATOR,
            "&cMáy Phản Ứng Đốt Cháy",
            "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.GENERATOR),
            LoreBuilder.powerBuffer(256),
            LoreBuilder.powerPerSecond(24));
    public static final SlimefunItemStack ANDROID_MEMORY_CORE =
            new SlimefunItemStack("ANDROID_MEMORY_CORE", HeadTexture.ENERGY_REGULATOR, "&bLõi Bộ Nhớ Robot");

    public static final SlimefunItemStack GPS_TELEPORTER_PYLON = new SlimefunItemStack(
            "GPS_TELEPORTER_PYLON",
            Material.PURPLE_STAINED_GLASS,
            "&5Tháp Tín Hiệu GPS",
            "",
            "&7Linh kiện của máy dịch chuyển");
    public static final SlimefunItemStack GPS_TELEPORTATION_MATRIX = new SlimefunItemStack(
            "GPS_TELEPORTATION_MATRIX",
            Material.IRON_BLOCK,
            "&bMa Trận Dịch Chuyển GPS",
            "",
            "&rĐây là linh kiện chính của dịch chuyển GPS",
            "&rMa trận này cho phép người chơi dịch chuyển đến",
            "&rcác điểm đường đã đặt");
    public static final SlimefunItemStack GPS_ACTIVATION_DEVICE_SHARED = new SlimefunItemStack(
            "GPS_ACTIVATION_DEVICE_SHARED",
            Material.STONE_PRESSURE_PLATE,
            "&rThiết Bị Kích Hoạt GPS &3(Công Cộng)",
            "",
            "&rĐặt nó trên ma trận dịch chuyển",
            "&rvà giẫm lên tấm áp lực để chọn",
            "&rđiểm đường để dịch chuyển");
    public static final SlimefunItemStack GPS_ACTIVATION_DEVICE_PERSONAL = new SlimefunItemStack(
            "GPS_ACTIVATION_DEVICE_PERSONAL",
            Material.STONE_PRESSURE_PLATE,
            "&rThiết Bị Kích Hoạt GPS &a(Cá Nhân)",
            "",
            "&rĐặt nó trên ma trận dịch chuyển",
            "&rvà giẫm lên tấm áp lực để chọn",
            "&rđiểm đường để dịch chuyển",
            "",
            "&rThiết bị kích hoạt này chỉ cho phép",
            "&rngười đặt nó sử dụng");
    public static final SlimefunItemStack PORTABLE_TELEPORTER = new SlimefunItemStack(
            "PORTABLE_TELEPORTER",
            Material.COMPASS,
            "&bMáy Dịch Chuyển Di Động",
            "",
            "&fCho phép bạn dịch chuyển bất cứ lúc nào",
            "&fđến điểm dịch chuyển",
            "",
            LoreBuilder.powerCharged(0, 50),
            "",
            "&eChuột phải&7 để sử dụng");

    public static final SlimefunItemStack ELEVATOR_PLATE = new SlimefunItemStack(
            "ELEVATOR_PLATE",
            Material.STONE_PRESSURE_PLATE,
            "&bTấm Thang Máy",
            "",
            "&rĐặt tấm thang máy ở mỗi tầng",
            "&rbạn có thể dịch chuyển giữa các tầng.",
            "",
            "&eChuột phải tấm thang máy&7 để đặt tên tầng");

    public static final SlimefunItemStack INFUSED_HOPPER = new SlimefunItemStack(
            "INFUSED_HOPPER",
            Material.HOPPER,
            "&5Phễu Hút",
            "",
            "&rTự động hút tất cả vật phẩm",
            "&rtrong phạm vi 7x7x7 gần phễu");

    public static final SlimefunItemStack PLASTIC_SHEET =
            new SlimefunItemStack("PLASTIC_SHEET", Material.PAPER, "&rTấm nhựa");

    public static final SlimefunItemStack HEATED_PRESSURE_CHAMBER = new SlimefunItemStack(
            "HEATED_PRESSURE_CHAMBER",
            Material.LIGHT_GRAY_STAINED_GLASS,
            "&cBuồng Áp Suất Gia Nhiệt",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Tốc độ: 1x",
            LoreBuilder.powerPerSecond(10));
    public static final SlimefunItemStack HEATED_PRESSURE_CHAMBER_2 = new SlimefunItemStack(
            "HEATED_PRESSURE_CHAMBER_2",
            Material.LIGHT_GRAY_STAINED_GLASS,
            "&cBuồng Áp Suất Gia Nhiệt &7- &eII",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Tốc độ: 5x",
            LoreBuilder.powerPerSecond(44));

    public static final SlimefunItemStack ELECTRIC_SMELTERY = new SlimefunItemStack(
            "ELECTRIC_SMELTERY",
            Material.FURNACE,
            "&cLò Luyện Điện",
            "",
            "&4Chỉ hỗ trợ hợp kim, không thể nấu bột thành thỏi",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Tốc độ: 1x",
            LoreBuilder.powerPerSecond(20));
    public static final SlimefunItemStack ELECTRIC_SMELTERY_2 = new SlimefunItemStack(
            "ELECTRIC_SMELTERY_2",
            Material.FURNACE,
            "&cLò Luyện Điện &7- &eII",
            "",
            "&4Chỉ hỗ trợ hợp kim, không thể nấu bột thành thỏi",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Tốc độ: 3x",
            LoreBuilder.powerPerSecond(40));

    public static final SlimefunItemStack ELECTRIC_PRESS = new SlimefunItemStack(
            "ELECTRIC_PRESS",
            HeadTexture.ELECTRIC_PRESS,
            "&eMáy Ép",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
            "&8\u21E8 &7Tốc độ: 1x",
            LoreBuilder.powerPerSecond(16));
    public static final SlimefunItemStack ELECTRIC_PRESS_2 = new SlimefunItemStack(
            "ELECTRIC_PRESS_2",
            HeadTexture.ELECTRIC_PRESS,
            "&eMáy Ép &7- &eII",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Tốc độ: 3x",
            LoreBuilder.powerPerSecond(40));

    public static final SlimefunItemStack ELECTRIFIED_CRUCIBLE = new SlimefunItemStack(
            "ELECTRIFIED_CRUCIBLE",
            Material.RED_TERRACOTTA,
            "&cNồi Luyện Điện",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Tốc độ: 1x",
            LoreBuilder.powerPerSecond(48));
    public static final SlimefunItemStack ELECTRIFIED_CRUCIBLE_2 = new SlimefunItemStack(
            "ELECTRIFIED_CRUCIBLE_2",
            Material.RED_TERRACOTTA,
            "&cNồi Luyện Điện &7- &eII",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Tốc độ: 2x",
            "&8\u21E8 &e\u26A1 &780 J/s");
    public static final SlimefunItemStack ELECTRIFIED_CRUCIBLE_3 = new SlimefunItemStack(
            "ELECTRIFIED_CRUCIBLE_3",
            Material.RED_TERRACOTTA,
            "&cNồi Luyện Điện &7- &eIII",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Tốc độ: 4x",
            "&8\u21E8 &e\u26A1 &7120 J/s");

    public static final SlimefunItemStack CARBON_PRESS = new SlimefunItemStack(
            "CARBON_PRESS",
            Material.BLACK_STAINED_GLASS,
            "&cMáy Ép Carbon",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Tốc độ: 1x",
            LoreBuilder.powerPerSecond(20));
    public static final SlimefunItemStack CARBON_PRESS_2 = new SlimefunItemStack(
            "CARBON_PRESS_2",
            Material.BLACK_STAINED_GLASS,
            "&cMáy Ép Carbon &7- &eII",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Tốc độ: 3x",
            "&8\u21E8 &e\u26A1 &750 J/s");
    public static final SlimefunItemStack CARBON_PRESS_3 = new SlimefunItemStack(
            "CARBON_PRESS_3",
            Material.BLACK_STAINED_GLASS,
            "&cMáy Ép Carbon &7- &eIII",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Tốc độ: 15x",
            "&8\u21E8 &e\u26A1 &7180 J/s");

    public static final SlimefunItemStack BLISTERING_INGOT = new SlimefunItemStack(
            "BLISTERING_INGOT",
            Material.GOLD_INGOT,
            "&6Thỏi Nổi Bọt &7(33%)",
            "",
            LoreBuilder.radioactive(Radioactivity.HIGH),
            LoreBuilder.HAZMAT_SUIT_REQUIRED);
    public static final SlimefunItemStack BLISTERING_INGOT_2 = new SlimefunItemStack(
            "BLISTERING_INGOT_2",
            Material.GOLD_INGOT,
            "&6Thỏi Nổi Bọt &7(66%)",
            "",
            LoreBuilder.radioactive(Radioactivity.HIGH),
            LoreBuilder.HAZMAT_SUIT_REQUIRED);
    public static final SlimefunItemStack BLISTERING_INGOT_3 = new SlimefunItemStack(
            "BLISTERING_INGOT_3",
            Material.GOLD_INGOT,
            "&6Thỏi Nổi Bọt",
            "",
            LoreBuilder.radioactive(Radioactivity.HIGH),
            LoreBuilder.HAZMAT_SUIT_REQUIRED);

    public static final SlimefunItemStack ENERGY_REGULATOR = new SlimefunItemStack(
            "ENERGY_REGULATOR",
            HeadTexture.ENERGY_REGULATOR,
            "&6Bộ Điều Chỉnh Năng Lượng",
            "",
            "&rPhần cốt lõi của mạng năng lượng");
    public static final SlimefunItemStack ENERGY_CONNECTOR = new SlimefunItemStack(
            "ENERGY_CONNECTOR",
            HeadTexture.ENERGY_CONNECTOR,
            "&cBộ Kết Nối Năng Lượng",
            LoreBuilder.range(6),
            "",
            "&fDùng để kết nối máy móc và máy phát điện",
            "&fCó thể kết nối với mạng năng lượng gần đó");
    public static final SlimefunItemStack DEBUG_FISH = new SlimefunItemStack(
            "DEBUG_FISH",
            Material.SALMON,
            "&3Con cá này giá bao nhiêu?",
            "",
            "&eChuột phải &rkhối bất kỳ để xem dữ liệu khối",
            "&eChuột trái &rphá hủy khối",
            "&eShift + Chuột trái &rkhối bất kỳ để xóa dữ liệu khối",
            "&eShift + Chuột phải &rđặt khối giữ chỗ");

    public static final SlimefunItemStack NETHER_ICE = new SlimefunItemStack(
            "NETHER_ICE",
            HeadTexture.NETHER_ICE,
            "&eBăng Nether",
            "",
            LoreBuilder.radioactive(Radioactivity.MODERATE),
            LoreBuilder.HAZMAT_SUIT_REQUIRED);
    public static final SlimefunItemStack ENRICHED_NETHER_ICE = new SlimefunItemStack(
            "ENRICHED_NETHER_ICE",
            HeadTexture.ENRICHED_NETHER_ICE,
            "&eBăng Nether Làm Giàu",
            "",
            LoreBuilder.radioactive(Radioactivity.VERY_HIGH),
            LoreBuilder.HAZMAT_SUIT_REQUIRED);
    public static final SlimefunItemStack NETHER_ICE_COOLANT_CELL = new SlimefunItemStack(
            "NETHER_ICE_COOLANT_CELL", HeadTexture.NETHER_ICE_COOLANT_CELL, "&6Chất làm mát băng Nether");

    // Cargo
    public static final SlimefunItemStack CARGO_MANAGER = new SlimefunItemStack(
            "CARGO_MANAGER",
            HeadTexture.CARGO_MANAGER,
            "&6Bộ quản lý hàng hóa",
            "",
            "&rThành phần cốt lõi của mạng vận chuyển vật phẩm");
    public static final SlimefunItemStack CARGO_CONNECTOR_NODE = new SlimefunItemStack(
            "CARGO_NODE",
            HeadTexture.CARGO_CONNECTOR_NODE,
            "&7Node hàng hóa &c(Kết nối)",
            "",
            "&rỐng dẫn kết nối hàng hóa");
    public static final SlimefunItemStack CARGO_INPUT_NODE = new SlimefunItemStack(
            "CARGO_NODE_INPUT",
            HeadTexture.CARGO_INPUT_NODE,
            "&7Node hàng hóa &c(Đầu vào)",
            "",
            "&rỐng dẫn đầu vào hàng hóa");
    public static final SlimefunItemStack CARGO_OUTPUT_NODE = new SlimefunItemStack(
            "CARGO_NODE_OUTPUT",
            HeadTexture.CARGO_OUTPUT_NODE,
            "&7Node hàng hóa &c(Đầu ra)",
            "",
            "&rỐng dẫn đầu ra hàng hóa");
    public static final SlimefunItemStack CARGO_OUTPUT_NODE_2 = new SlimefunItemStack(
            "CARGO_NODE_OUTPUT_ADVANCED",
            HeadTexture.CARGO_OUTPUT_NODE,
            "&6Node hàng hóa nâng cao &c(Đầu ra)",
            "",
            "&rỐng dẫn đầu ra hàng hóa");

    // Animal farm
    public static final SlimefunItemStack AUTO_BREEDER = new SlimefunItemStack(
            "AUTO_BREEDER",
            Material.HAY_BLOCK,
            "&eMáy cho ăn tự động",
            "",
            "&rCần &aThực phẩm hữu cơ",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.powerBuffer(1024),
            "&8\u21E8 &e\u26A1 &760 J/con vật");
    public static final SlimefunItemStack PRODUCE_COLLECTOR = new SlimefunItemStack(
            "PRODUCE_COLLECTOR",
            Material.HAY_BLOCK,
            "&bMáy thu hoạch toàn tự động",
            "",
            "&fMáy này có thể tự động thu thập",
            "&fsản phẩm từ động vật gần đó.",
            "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            LoreBuilder.powerBuffer(512),
            LoreBuilder.powerPerSecond(32));

    public static final SlimefunItemStack ORGANIC_FOOD =
            new SlimefunItemStack("ORGANIC_FOOD", HeadTexture.FILLED_CAN, "&aThực phẩm hữu cơ", "&7Chứa &9???");
    public static final SlimefunItemStack WHEAT_ORGANIC_FOOD = new SlimefunItemStack(
            "ORGANIC_FOOD_WHEAT", HeadTexture.FILLED_CAN, ORGANIC_FOOD.getDisplayName(), "&7Chứa &9Lúa mì");
    public static final SlimefunItemStack CARROT_ORGANIC_FOOD = new SlimefunItemStack(
            "ORGANIC_FOOD_CARROT", HeadTexture.FILLED_CAN, ORGANIC_FOOD.getDisplayName(), "&7Chứa &9Cà rốt");
    public static final SlimefunItemStack POTATO_ORGANIC_FOOD = new SlimefunItemStack(
            "ORGANIC_FOOD_POTATO", HeadTexture.FILLED_CAN, ORGANIC_FOOD.getDisplayName(), "&7Chứa &9Khoai tây");
    public static final SlimefunItemStack SEEDS_ORGANIC_FOOD = new SlimefunItemStack(
            "ORGANIC_FOOD_SEEDS", HeadTexture.FILLED_CAN, ORGANIC_FOOD.getDisplayName(), "&7Chứa &9Hạt lúa mì");
    public static final SlimefunItemStack BEETROOT_ORGANIC_FOOD = new SlimefunItemStack(
            "ORGANIC_FOOD_BEETROOT", HeadTexture.FILLED_CAN, ORGANIC_FOOD.getDisplayName(), "&7Chứa &9Củ cải đường");
    public static final SlimefunItemStack MELON_ORGANIC_FOOD = new SlimefunItemStack(
            "ORGANIC_FOOD_MELON", HeadTexture.FILLED_CAN, ORGANIC_FOOD.getDisplayName(), "&7Chứa &9Dưa hấu");
    public static final SlimefunItemStack APPLE_ORGANIC_FOOD = new SlimefunItemStack(
            "ORGANIC_FOOD_APPLE", HeadTexture.FILLED_CAN, ORGANIC_FOOD.getDisplayName(), "&7Chứa &9Táo");
    public static final SlimefunItemStack SWEET_BERRIES_ORGANIC_FOOD = new SlimefunItemStack(
            "ORGANIC_FOOD_SWEET_BERRIES", HeadTexture.FILLED_CAN, ORGANIC_FOOD.getDisplayName(), "&7Chứa &9Quả mọng");
    public static final SlimefunItemStack KELP_ORGANIC_FOOD = new SlimefunItemStack(
            "ORGANIC_FOOD_KELP", HeadTexture.FILLED_CAN, ORGANIC_FOOD.getDisplayName(), "&7Chứa &9Rong biển khô");
    public static final SlimefunItemStack COCOA_ORGANIC_FOOD = new SlimefunItemStack(
            "ORGANIC_FOOD_COCOA", HeadTexture.FILLED_CAN, ORGANIC_FOOD.getDisplayName(), "&7Chứa &9Hạt ca cao");
    public static final SlimefunItemStack SEAGRASS_ORGANIC_FOOD = new SlimefunItemStack(
            "ORGANIC_FOOD_SEAGRASS", HeadTexture.FILLED_CAN, ORGANIC_FOOD.getDisplayName(), "&7Chứa: &9Cỏ biển");

    public static final SlimefunItemStack FERTILIZER =
            new SlimefunItemStack("FERTILIZER", HeadTexture.FILLED_CAN, "&aPhân bón hữu cơ", "&7Chứa &9???");
    public static final SlimefunItemStack WHEAT_FERTILIZER = new SlimefunItemStack(
            "FERTILIZER_WHEAT", HeadTexture.FILLED_CAN, FERTILIZER.getDisplayName(), "&7Chứa &9Lúa mì");
    public static final SlimefunItemStack CARROT_FERTILIZER = new SlimefunItemStack(
            "FERTILIZER_CARROT", HeadTexture.FILLED_CAN, FERTILIZER.getDisplayName(), "&7Chứa &9Cà rốt");
    public static final SlimefunItemStack POTATO_FERTILIZER = new SlimefunItemStack(
            "FERTILIZER_POTATO", HeadTexture.FILLED_CAN, FERTILIZER.getDisplayName(), "&7Chứa &9Khoai tây");
    public static final SlimefunItemStack SEEDS_FERTILIZER = new SlimefunItemStack(
            "FERTILIZER_SEEDS", HeadTexture.FILLED_CAN, FERTILIZER.getDisplayName(), "&7Chứa &9Hạt lúa mì");
    public static final SlimefunItemStack BEETROOT_FERTILIZER = new SlimefunItemStack(
            "FERTILIZER_BEETROOT", HeadTexture.FILLED_CAN, FERTILIZER.getDisplayName(), "&7Chứa &9Củ cải đường");
    public static final SlimefunItemStack MELON_FERTILIZER = new SlimefunItemStack(
            "FERTILIZER_MELON", HeadTexture.FILLED_CAN, FERTILIZER.getDisplayName(), "&7Chứa &9Dưa hấu");
    public static final SlimefunItemStack APPLE_FERTILIZER = new SlimefunItemStack(
            "FERTILIZER_APPLE", HeadTexture.FILLED_CAN, FERTILIZER.getDisplayName(), "&7Chứa &9Táo");
    public static final SlimefunItemStack SWEET_BERRIES_FERTILIZER = new SlimefunItemStack(
            "FERTILIZER_SWEET_BERRIES", HeadTexture.FILLED_CAN, FERTILIZER.getDisplayName(), "&7Chứa &9Quả mọng");
    public static final SlimefunItemStack KELP_FERTILIZER = new SlimefunItemStack(
            "FERTILIZER_KELP", HeadTexture.FILLED_CAN, FERTILIZER.getDisplayName(), "&7Chứa &9Rong biển khô");
    public static final SlimefunItemStack COCOA_FERTILIZER = new SlimefunItemStack(
            "FERTILIZER_COCOA", HeadTexture.FILLED_CAN, FERTILIZER.getDisplayName(), "&7Chứa &9Hạt ca cao");
    public static final SlimefunItemStack SEAGRASS_FERTILIZER = new SlimefunItemStack(
            "FERTILIZER_SEAGRASS", HeadTexture.FILLED_CAN, FERTILIZER.getDisplayName(), "&7Chứa: &9Cỏ biển");

    public static final SlimefunItemStack ANIMAL_GROWTH_ACCELERATOR = new SlimefunItemStack(
            "ANIMAL_GROWTH_ACCELERATOR",
            Material.HAY_BLOCK,
            "&bMáy tăng tốc phát triển động vật",
            "",
            "&rCần &aThực phẩm hữu cơ",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.powerBuffer(1024),
            LoreBuilder.powerPerSecond(28));
    public static final SlimefunItemStack CROP_GROWTH_ACCELERATOR = new SlimefunItemStack(
            "CROP_GROWTH_ACCELERATOR",
            Material.LIME_TERRACOTTA,
            "&aMáy tăng tốc phát triển cây trồng",
            "",
            "&rCần &aPhân bón hữu cơ",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Bán kính: 7x7",
            "&8\u21E8 &7Tốc độ: &a3/lần",
            LoreBuilder.powerBuffer(1024),
            "&8\u21E8 &e\u26A1 &750 J/s");
    public static final SlimefunItemStack CROP_GROWTH_ACCELERATOR_2 = new SlimefunItemStack(
            "CROP_GROWTH_ACCELERATOR_2",
            Material.LIME_TERRACOTTA,
            "&aMáy tăng tốc phát triển cây trồng &7(&eII&7)",
            "",
            "&rCần &aPhân bón hữu cơ",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Bán kính: 9x9",
            "&8\u21E8 &7Tốc độ: &a4/lần",
            LoreBuilder.powerBuffer(1024),
            "&8\u21E8 &e\u26A1 &760 J/s");
    public static final SlimefunItemStack TREE_GROWTH_ACCELERATOR = new SlimefunItemStack(
            "TREE_GROWTH_ACCELERATOR",
            Material.BROWN_TERRACOTTA,
            "&aMáy tăng tốc phát triển cây",
            "",
            "&rCần &aPhân bón hữu cơ",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Bán kính: 9x9",
            "&8\u21E8 &7Tốc độ: &a4/lần",
            LoreBuilder.powerBuffer(1024),
            LoreBuilder.powerPerSecond(48));

    public static final SlimefunItemStack FOOD_FABRICATOR = new SlimefunItemStack(
            "FOOD_FABRICATOR",
            Material.GREEN_STAINED_GLASS,
            "&cMáy chế biến thực phẩm",
            "",
            "&rCó thể chế tạo &aThực phẩm hữu cơ",
            "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            "&8\u21E8 &7Tốc độ: 1x",
            LoreBuilder.powerBuffer(256),
            LoreBuilder.powerPerSecond(14));
    public static final SlimefunItemStack FOOD_FABRICATOR_2 = new SlimefunItemStack(
            "FOOD_FABRICATOR_2",
            Material.GREEN_STAINED_GLASS,
            "&cMáy Chế Biến Thực Phẩm &7(&eII&7)",
            "",
            "&rCó thể chế tạo &aThực phẩm hữu cơ",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Tốc độ: 6x",
            LoreBuilder.powerBuffer(512),
            LoreBuilder.powerPerSecond(48));

    public static final SlimefunItemStack FOOD_COMPOSTER = new SlimefunItemStack(
            "FOOD_COMPOSTER",
            Material.GREEN_TERRACOTTA,
            "&cMáy Ủ Phân Thực Phẩm",
            "",
            "&rCó thể chế tạo &aPhân bón hữu cơ",
            "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            "&8\u21E8 &7Tốc độ: 1x",
            LoreBuilder.powerBuffer(256),
            LoreBuilder.powerPerSecond(16));
    public static final SlimefunItemStack FOOD_COMPOSTER_2 = new SlimefunItemStack(
            "FOOD_COMPOSTER_2",
            Material.GREEN_TERRACOTTA,
            "&cMáy Ủ Phân Thực Phẩm &7(&eII&7)",
            "",
            "&rCó thể chế tạo &aPhân bón hữu cơ",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Tốc độ: 10x",
            LoreBuilder.powerBuffer(512),
            "&8\u21E8 &e\u26A1 &752 J/s");

    public static final SlimefunItemStack EXP_COLLECTOR = new SlimefunItemStack(
            "XP_COLLECTOR",
            HeadTexture.EXP_COLLECTOR,
            "&aMáy Thu Thập Kinh Nghiệm",
            "",
            "&rThu thập kinh nghiệm gần đó và lưu trữ chúng",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.powerBuffer(1024),
            LoreBuilder.powerPerSecond(20));
    public static final SlimefunItemStack REACTOR_COOLANT_CELL =
            new SlimefunItemStack("REACTOR_COLLANT_CELL", HeadTexture.COOLANT_CELL, "&bChất Làm Mát Lò Phản Ứng");

    public static final SlimefunItemStack NUCLEAR_REACTOR = new SlimefunItemStack(
            "NUCLEAR_REACTOR",
            HeadTexture.NUCLEAR_REACTOR,
            "&2Lò Phản Ứng Hạt Nhân",
            "",
            "&rCần chất làm mát!",
            "&8\u21E8 &bPhải được bao quanh bởi nước",
            "&8\u21E8 &bPhải sử dụng chất làm mát lò phản ứng để hoạt động",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.GENERATOR),
            "&8\u21E8 &e\u26A1 &716384 J có thể lưu trữ",
            "&8\u21E8 &e\u26A1 &7500 J/s");
    public static final SlimefunItemStack NETHER_STAR_REACTOR = new SlimefunItemStack(
            "NETHERSTAR_REACTOR",
            HeadTexture.NETHER_STAR_REACTOR,
            "&rLò Phản Ứng Ngôi Sao Nether",
            "",
            "&rCần ngôi sao Nether",
            "&8\u21E8 &bPhải được bao quanh bởi nước",
            "&8\u21E8 &bPhải sử dụng chất làm mát băng Nether để hoạt động",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.GENERATOR),
            "&8\u21E8 &e\u26A1 &732768 J có thể lưu trữ",
            "&8\u21E8 &e\u26A1 &71024 J/s",
            "&8\u21E8 &4Sẽ gây hiệu ứng Wither cho sinh vật gần đó");
    public static final SlimefunItemStack REACTOR_ACCESS_PORT = new SlimefunItemStack(
            "REACTOR_ACCESS_PORT",
            Material.CYAN_TERRACOTTA,
            "&2Cổng Truy Cập Lò Phản Ứng",
            "",
            "&rCho phép bạn truy cập lò phản ứng thông qua nút vận chuyển hàng hóa",
            "&rCũng có thể dùng để lưu trữ",
            "",
            "&8\u21E8 &cPhải &eđặt ở ô thứ ba phía trên lò phản ứng");

    public static final SlimefunItemStack FREEZER = new SlimefunItemStack(
            "FREEZER",
            Material.LIGHT_BLUE_STAINED_GLASS,
            "&bTủ Lạnh",
            "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            "&8\u21E8 &7Tốc độ: 1x",
            LoreBuilder.powerBuffer(256),
            LoreBuilder.powerPerSecond(18));
    public static final SlimefunItemStack FREEZER_2 = new SlimefunItemStack(
            "FREEZER_2",
            Material.LIGHT_BLUE_STAINED_GLASS,
            "&bTủ Lạnh &7(&eII&7)",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Tốc độ: 2x",
            LoreBuilder.powerBuffer(256),
            LoreBuilder.powerPerSecond(30));
    public static final SlimefunItemStack FREEZER_3 = new SlimefunItemStack(
            "FREEZER_3",
            Material.LIGHT_BLUE_STAINED_GLASS,
            "&bTủ Lạnh &7(&eIII&7)",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.speed(3),
            LoreBuilder.powerBuffer(256),
            LoreBuilder.powerPerSecond(42));

    public static final SlimefunItemStack ELECTRIC_GOLD_PAN = new SlimefunItemStack(
            "ELECTRIC_GOLD_PAN",
            Material.BROWN_TERRACOTTA,
            "&6Chảo Lọc Vàng Điện",
            "",
            LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE),
            "&8\u21E8 &7Tốc độ: 1x",
            LoreBuilder.powerPerSecond(2));
    public static final SlimefunItemStack ELECTRIC_GOLD_PAN_2 = new SlimefunItemStack(
            "ELECTRIC_GOLD_PAN_2",
            Material.BROWN_TERRACOTTA,
            "&6Chảo Lọc Vàng Điện &7(&eII&7)",
            "",
            LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE),
            "&8\u21E8 &7Tốc độ: 3x",
            LoreBuilder.powerPerSecond(4));
    public static final SlimefunItemStack ELECTRIC_GOLD_PAN_3 = new SlimefunItemStack(
            "ELECTRIC_GOLD_PAN_3",
            Material.BROWN_TERRACOTTA,
            "&6Chảo Lọc Vàng Điện &7(&eIII&7)",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Tốc độ: 10x",
            LoreBuilder.powerPerSecond(14));

    public static final SlimefunItemStack ELECTRIC_DUST_WASHER = new SlimefunItemStack(
            "ELECTRIC_DUST_WASHER",
            Material.BLUE_STAINED_GLASS,
            "&3Máy Rửa Quặng Điện",
            "",
            LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE),
            "&8\u21E8 &7Tốc độ: 1x",
            LoreBuilder.powerPerSecond(6));
    public static final SlimefunItemStack ELECTRIC_DUST_WASHER_2 = new SlimefunItemStack(
            "ELECTRIC_DUST_WASHER_2",
            Material.BLUE_STAINED_GLASS,
            "&3Máy Rửa Quặng Điện &7(&eII&7)",
            "",
            LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE),
            "&8\u21E8 &7Tốc độ: 2x",
            LoreBuilder.powerPerSecond(10));
    public static final SlimefunItemStack ELECTRIC_DUST_WASHER_3 = new SlimefunItemStack(
            "ELECTRIC_DUST_WASHER_3",
            Material.BLUE_STAINED_GLASS,
            "&3Máy Rửa Quặng Điện &7(&eIII&7)",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Tốc độ: 10x",
            LoreBuilder.powerPerSecond(30));

    public static final SlimefunItemStack ELECTRIC_INGOT_FACTORY = new SlimefunItemStack(
            "ELECTRIC_INGOT_FACTORY",
            Material.RED_TERRACOTTA,
            "&cLò Đúc Thỏi Điện",
            "",
            LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE),
            "&8\u21E8 &7Tốc độ: 1x",
            LoreBuilder.powerPerSecond(8));
    public static final SlimefunItemStack ELECTRIC_INGOT_FACTORY_2 = new SlimefunItemStack(
            "ELECTRIC_INGOT_FACTORY_2",
            Material.RED_TERRACOTTA,
            "&cLò Đúc Thỏi Điện &7(&eII&7)",
            "",
            LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE),
            "&8\u21E8 &7Tốc độ: 2x",
            LoreBuilder.powerPerSecond(14));
    public static final SlimefunItemStack ELECTRIC_INGOT_FACTORY_3 = new SlimefunItemStack(
            "ELECTRIC_INGOT_FACTORY_3",
            Material.RED_TERRACOTTA,
            "&cLò Đúc Thỏi Điện &7(&eIII&7)",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Tốc độ: 8x",
            LoreBuilder.powerPerSecond(40));

    // @Deprecated
    // public static final SlimefunItemStack AUTOMATED_CRAFTING_CHAMBER = new
    // SlimefunItemStack("AUTOMATED_CRAFTING_CHAMBER", Material.CRAFTING_TABLE, "&6Máy Chế Tạo Tự Động", "",
    // LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), "&8\u21E8 &e\u26A1 &710
    // J/vật phẩm");

    public static final SlimefunItemStack FLUID_PUMP = new SlimefunItemStack(
            "FLUID_PUMP",
            Material.BLUE_TERRACOTTA,
            "&9Máy Bơm Chất Lỏng",
            "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            "&8\u21E8 &e\u26A1 &732 J/khối");
    public static final SlimefunItemStack CHARGING_BENCH = new SlimefunItemStack(
            "CHARGING_BENCH",
            Material.CRAFTING_TABLE,
            "&6Bàn Sạc",
            "",
            "&rCó thể sạc vật phẩm, như ba lô phản lực",
            "",
            LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE),
            "&8\u21E8 &e\u26A1 &7128 J có thể lưu trữ",
            "&8\u21E8 &e\u26A1 &7Tỷ lệ mất năng lượng: &c50%");

    public static final SlimefunItemStack VANILLA_AUTO_CRAFTER = new SlimefunItemStack(
            "VANILLA_AUTO_CRAFTER",
            HeadTexture.VANILLA_AUTO_CRAFTER,
            "&2Máy Chế Tạo Tự Động &8(Thường)",
            "",
            "&fĐặt máy lên bất kỳ khối chứa vật phẩm nào",
            "&fđể tự động chế tạo mọi thứ!",
            "&fCó thể chế tạo vật phẩm mà &eBàn chế tạo thường &fcó thể làm",
            "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            "&8\u21E8 &e\u26A1 &7Chế tạo vật phẩm tiêu tốn 16 J");
    public static final SlimefunItemStack ENHANCED_AUTO_CRAFTER = new SlimefunItemStack(
            "ENHANCED_AUTO_CRAFTER",
            HeadTexture.ENHANCED_AUTO_CRAFTER,
            "&2Máy Chế Tạo Tự Động &8(Nâng cao)",
            "",
            "&fĐặt máy lên bất kỳ khối chứa vật phẩm nào",
            "&fđể tự động chế tạo mọi thứ!",
            "&fCó thể chế tạo vật phẩm mà &eBàn chế tạo nâng cao &fcó thể làm",
            "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            "&8\u21E8 &e\u26A1 &7Chế tạo vật phẩm tiêu tốn 16 J");
    public static final SlimefunItemStack ARMOR_AUTO_CRAFTER = new SlimefunItemStack(
            "ARMOR_AUTO_CRAFTER",
            HeadTexture.ARMOR_AUTO_CRAFTER,
            "&2Máy Chế Tạo Tự Động &8(Rèn giáp)",
            "",
            "&fĐặt máy lên bất kỳ khối chứa vật phẩm nào",
            "&fđể tự động chế tạo vật phẩm từ bàn rèn giáp",
            "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            "&8\u21E8 &e\u26A1 &7Chế tạo vật phẩm tiêu tốn 32 J");

    public static final SlimefunItemStack IRON_GOLEM_ASSEMBLER = new SlimefunItemStack(
            "IRON_GOLEM_ASSEMBLER",
            Material.IRON_BLOCK,
            "&6Máy Lắp Ráp Golem Sắt",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Thời gian hồi: &b30 giây",
            LoreBuilder.powerBuffer(4096),
            "&8\u21E8 &e\u26A1 &72048 J/Golem Sắt");
    public static final SlimefunItemStack WITHER_ASSEMBLER = new SlimefunItemStack(
            "WITHER_ASSEMBLER",
            Material.OBSIDIAN,
            "&5Máy Lắp Ráp Wither",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "&8\u21E8 &7Thời gian hồi: &b30 giây",
            "&8\u21E8 &e\u26A1 &74096 J có thể lưu trữ",
            "&8\u21E8 &e\u26A1 &74096 J/Wither");

    public static final SlimefunItemStack TRASH_CAN = new SlimefunItemStack(
            "TRASH_CAN_BLOCK", HeadTexture.TRASH_CAN, "&3Thùng Rác", "", "&rCó thể bỏ vật phẩm không cần vào đây");

    public static final SlimefunItemStack ELYTRA_SCALE =
            new SlimefunItemStack("ELYTRA_SCALE", Material.FEATHER, "&bVảy Cánh Elytra");
    public static final SlimefunItemStack INFUSED_ELYTRA =
            new SlimefunItemStack("INFUSED_ELYTRA", Material.ELYTRA, "&5Cánh Elytra (Phục hồi kinh nghiệm)");
    public static final SlimefunItemStack SOULBOUND_ELYTRA =
            new SlimefunItemStack("SOULBOUND_ELYTRA", Material.ELYTRA, "&cCánh Elytra (Ràng buộc linh hồn)");

    public static final SlimefunItemStack MAGNESIUM_SALT = new SlimefunItemStack(
            "MAGNESIUM_SALT",
            Material.SUGAR,
            "&cMuối Magie",
            "",
            "&7Là loại nhiên liệu đặc biệt có thể sử dụng trong máy phát điện magie");
    public static final SlimefunItemStack MAGNESIUM_GENERATOR = new SlimefunItemStack(
            "MAGNESIUM_GENERATOR",
            HeadTexture.GENERATOR,
            "&cMáy Phát Điện Magie",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.GENERATOR),
            LoreBuilder.powerBuffer(128),
            LoreBuilder.powerPerSecond(36));

    // Đừng xóa
    public static final SlimefunItemStack CRAFTER_SMART_PORT = new SlimefunItemStack(
            "CRAFTER_SMART_PORT",
            Material.LIME_STAINED_GLASS,
            "&aGiao Diện Thông Minh Máy Chế Tạo",
            "",
            "&5Có thể phân bổ số lượng đầu vào theo số lượng nguyên liệu công thức",
            "&5và có chỉ định ô xuất");

    static {
        INFUSED_ELYTRA.addUnsafeEnchantment(Enchantment.MENDING, 1);
    }
}
