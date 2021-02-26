package com.grimbo.dinosauria.item;

import com.grimbo.dinosauria.Dinosauria;
import com.grimbo.dinosauria.util.Registration;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

public class ModItems {
    public static final RegistryObject<Item> COOKED_EGG =
            Registration.ITEMS.register("cooked_egg",
                    () -> new CookedEgg());

    public static final RegistryObject<Item> CERATOPTIAN_DIAMOND_ARMOR =
            Registration.ITEMS.register("ceratoptian_diamond_armor",
                    () -> new Item(new Item.Properties().group(Dinosauria.DINOSAURIA)));

    public static final RegistryObject<Item> CERATOPTIAN_GOLD_ARMOR =
            Registration.ITEMS.register("ceratoptian_gold_armor",
                    () -> new Item(new Item.Properties().group(Dinosauria.DINOSAURIA)));

    public static final RegistryObject<Item> CERATOPTIAN_IRON_ARMOR =
            Registration.ITEMS.register("ceratoptian_iron_armor",
                    () -> new Item(new Item.Properties().group(Dinosauria.DINOSAURIA)));

    public static final RegistryObject<Item> CERATOPTIAN_NETHERITE_ARMOR =
            Registration.ITEMS.register("ceratoptian_netherite_armor",
                    () -> new Item(new Item.Properties().group(Dinosauria.DINOSAURIA)));

    public static final RegistryObject<Item> COOKED_THIGH =
            Registration.ITEMS.register("cooked_thigh",
                    () -> new CookedThigh());

    public static final RegistryObject<Item> COOKED_MEAT =
            Registration.ITEMS.register("cooked_meat",
                    () -> new CookedMeat());

    public static final RegistryObject<Item> COOKED_FISH_MEAT =
            Registration.ITEMS.register("cooked_fish_meat",
                    () -> new CookedFishMeat());

    public static final RegistryObject<Item> SAUROPOD_SADDLE =
            Registration.ITEMS.register("sauropod_saddle",
                    () -> new Item(new Item.Properties().group(Dinosauria.DINOSAURIA)));

    public static final RegistryObject<Item> SAUROPOD_GOLD_ARMOR =
            Registration.ITEMS.register("sauropod_gold_armor",
                    () -> new Item(new Item.Properties().group(Dinosauria.DINOSAURIA)));

    public static final RegistryObject<Item> SAUROPOD_IRON_ARMOR =
            Registration.ITEMS.register("sauropod_iron_armor",
                    () -> new Item(new Item.Properties().group(Dinosauria.DINOSAURIA)));

    public static final RegistryObject<Item> SAUROPOD_NETHERITE_ARMOR =
            Registration.ITEMS.register("sauropod_netherite_armor",
                    () -> new Item(new Item.Properties().group(Dinosauria.DINOSAURIA)));

    public static final RegistryObject<Item> THEROPOD_IRON_ARMOR =
            Registration.ITEMS.register("theropod_iron_armor",
                    () -> new Item(new Item.Properties().group(Dinosauria.DINOSAURIA)));

    public static final RegistryObject<Item> THEROPOD_LEATHER_ARMOR =
            Registration.ITEMS.register("theropod_leather_armor",
                    () -> new Item(new Item.Properties().group(Dinosauria.DINOSAURIA)));

    public static final RegistryObject<Item> THEROPOD_GOLD_ARMOR =
            Registration.ITEMS.register("theropod_gold_armor",
                    () -> new Item(new Item.Properties().group(Dinosauria.DINOSAURIA)));

    public static final RegistryObject<Item> THEROPOD_NETHERITE_ARMOR =
            Registration.ITEMS.register("theropod_netherite_armor",
                    () -> new Item(new Item.Properties().group(Dinosauria.DINOSAURIA)));

    public static final RegistryObject<Item> THEROPOD_SADDLE =
            Registration.ITEMS.register("theropod_saddle",
                    () -> new Item(new Item.Properties().group(Dinosauria.DINOSAURIA)));

    public static final RegistryObject<Item> RAW_MEAT =
            Registration.ITEMS.register("raw_meat",
                    () -> new RawMeat());

    public static final RegistryObject<Item> OLD_PAPER =
            Registration.ITEMS.register("old_paper",
                    () -> new Item(new Item.Properties().group(Dinosauria.DINOSAURIA)));

    public static final RegistryObject<Item> LORE_BOOK =
            Registration.ITEMS.register("lore_book",
                    () -> new Item(new Item.Properties().group(Dinosauria.DINOSAURIA)));

    public static final RegistryObject<Item> RAW_THIGH =
            Registration.ITEMS.register("raw_thigh",
                    () -> new RawThigh());

    public static final RegistryObject<Item> ANKY_IRON_ARMOR =
            Registration.ITEMS.register("anky_iron_armor",
                    () -> new Item(new Item.Properties().group(Dinosauria.DINOSAURIA)));

    public static final RegistryObject<Item> ANKY_GOLD_ARMOR =
            Registration.ITEMS.register("anky_gold_armor",
                    () -> new Item(new Item.Properties().group(Dinosauria.DINOSAURIA)));

    public static final RegistryObject<Item> ANKY_DIAMOND_ARMOR =
            Registration.ITEMS.register("anky_diamond_armor",
                    () -> new Item(new Item.Properties().group(Dinosauria.DINOSAURIA)));


    public static final RegistryObject<Item> ANKY_NETHERITE_ARMOR =
            Registration.ITEMS.register("anky_netherite_armor",
                    () -> new Item(new Item.Properties().group(Dinosauria.DINOSAURIA)));

    public static final RegistryObject<Item> DASPLETO_FOSSIL_SKULL =
            Registration.ITEMS.register("daspleto_fossil_skull",
                    () -> new Item(new Item.Properties().group(Dinosauria.DINOSAURIA)));

    public static final RegistryObject<Item> DASPLETO_FRESH_SKULL =
            Registration.ITEMS.register("daspleto_fresh_skull",
                    () -> new Item(new Item.Properties().group(Dinosauria.DINOSAURIA)));

    public static final RegistryObject<Item> DASPLETO_FOSSIL_NECK =
            Registration.ITEMS.register("daspleto_fossil_neck",
                    () -> new Item(new Item.Properties().group(Dinosauria.DINOSAURIA)));

    public static final RegistryObject<Item> DASPLETO_FRESH_NECK =
            Registration.ITEMS.register("daspleto_fresh_neck",
                    () -> new Item(new Item.Properties().group(Dinosauria.DINOSAURIA)));

    public static final RegistryObject<Item> DASPLETO_FOSSIL_VERTEBRAE =
            Registration.ITEMS.register("daspleto_fossil_vertebrae",
                    () -> new Item(new Item.Properties().group(Dinosauria.DINOSAURIA)));

    public static final RegistryObject<Item> DASPLETO_FRESH_VERTEBRAE =
            Registration.ITEMS.register("daspleto_fresh_vertebrae",
                    () -> new Item(new Item.Properties().group(Dinosauria.DINOSAURIA)));

    public static final RegistryObject<Item> DASPLETO_FOSSIL_RIBS =
            Registration.ITEMS.register("daspleto_fossil_ribs",
                    () -> new Item(new Item.Properties().group(Dinosauria.DINOSAURIA)));

    public static final RegistryObject<Item> DASPLETO_FRESH_RIBS =
            Registration.ITEMS.register("daspleto_fresh_ribs",
                    () -> new Item(new Item.Properties().group(Dinosauria.DINOSAURIA)));

    public static final RegistryObject<Item> DASPLETO_FOSSIL_TAIL =
            Registration.ITEMS.register("daspleto_fossil_tail",
                    () -> new Item(new Item.Properties().group(Dinosauria.DINOSAURIA)));

    public static final RegistryObject<Item> DASPLETO_FRESH_TAIL =
            Registration.ITEMS.register("daspleto_fresh_tail",
                    () -> new Item(new Item.Properties().group(Dinosauria.DINOSAURIA)));

    public static final RegistryObject<Item> DASPLETO_FOSSIL_BELLY =
            Registration.ITEMS.register("daspleto_fossil_belly",
                    () -> new Item(new Item.Properties().group(Dinosauria.DINOSAURIA)));

    public static final RegistryObject<Item> DASPLETO_FRESH_BELLY =
            Registration.ITEMS.register("daspleto_fresh_belly",
                    () -> new Item(new Item.Properties().group(Dinosauria.DINOSAURIA)));

    public static final RegistryObject<Item> DASPLETO_FOSSIL_ARM =
            Registration.ITEMS.register("daspleto_fossil_arm",
                    () -> new Item(new Item.Properties().group(Dinosauria.DINOSAURIA)));

    public static final RegistryObject<Item> DASPLETO_FRESH_ARM =
            Registration.ITEMS.register("daspleto_fresh_arm",
                    () -> new Item(new Item.Properties().group(Dinosauria.DINOSAURIA)));

    public static final RegistryObject<Item> DASPLETO_FOSSIL_LEG =
            Registration.ITEMS.register("daspleto_fossil_leg",
                    () -> new Item(new Item.Properties().group(Dinosauria.DINOSAURIA)));

    public static final RegistryObject<Item> DASPLETO_FRESH_LEG =
            Registration.ITEMS.register("daspleto_fresh_leg",
                    () -> new Item(new Item.Properties().group(Dinosauria.DINOSAURIA)));

    public static final RegistryObject<Item> DASPLETO_FOSSIL_HAND =
            Registration.ITEMS.register("daspleto_fossil_hand",
                    () -> new Item(new Item.Properties().group(Dinosauria.DINOSAURIA)));

    public static final RegistryObject<Item> DASPLETO_FRESH_HAND =
            Registration.ITEMS.register("daspleto_fresh_hand",
                    () -> new Item(new Item.Properties().group(Dinosauria.DINOSAURIA)));

    public static final RegistryObject<Item> DASPLETO_FOSSIL_FOOT =
            Registration.ITEMS.register("daspleto_fossil_foot",
                    () -> new Item(new Item.Properties().group(Dinosauria.DINOSAURIA)));

    public static final RegistryObject<Item> DASPLETO_FRESH_FOOT =
            Registration.ITEMS.register("daspleto_fresh_foot",
                    () -> new Item(new Item.Properties().group(Dinosauria.DINOSAURIA)));

    public static final RegistryObject<Item> DASPLETO_FRESH_TOOTH =
            Registration.ITEMS.register("daspleto_fresh_tooth",
                    () -> new Item(new Item.Properties().group(Dinosauria.DINOSAURIA)));

    public static final RegistryObject<Item> THEROPOD_BONE =
            Registration.ITEMS.register("theropod_bone",
                    () -> new Item(new Item.Properties().group(Dinosauria.DINOSAURIA)));

    public static final RegistryObject<Item> SAUROPOD_DIAMOND_ARMOR =
            Registration.ITEMS.register("sauropod_diamond_armor",
                    () -> new Item(new Item.Properties().group(Dinosauria.DINOSAURIA)));

    public static final RegistryObject<Item> THEROPOD_DIAMOND_ARMOR =
            Registration.ITEMS.register("theropod_diamond_armor",
                    () -> new Item(new Item.Properties().group(Dinosauria.DINOSAURIA)));

    public static final RegistryObject<Item> DINOSAURIA_GUIDE_BOOK =
            Registration.ITEMS.register("dinosauria_guide_book",
                    () -> new Item(new Item.Properties().group(Dinosauria.DINOSAURIA)));

    public static final RegistryObject<Item> MARINE_IRON_ARMOR =
            Registration.ITEMS.register("marine_iron_armor",
                    () -> new Item(new Item.Properties().group(Dinosauria.DINOSAURIA)));

    public static final RegistryObject<Item> MARINE_GOLD_ARMOR =
            Registration.ITEMS.register("marine_gold_armor",
                    () -> new Item(new Item.Properties().group(Dinosauria.DINOSAURIA)));

    public static final RegistryObject<Item> MARINE_DIAMOND_ARMOR =
            Registration.ITEMS.register("marine_diamond_armor",
                    () -> new Item(new Item.Properties().group(Dinosauria.DINOSAURIA)));

    public static final RegistryObject<Item> MARINE_NETHERITE_ARMOR =
            Registration.ITEMS.register("marine_netherite_armor",
                    () -> new Item(new Item.Properties().group(Dinosauria.DINOSAURIA)));

    public static final RegistryObject<Item> STEGOSAURIAN_IRON_ARMOR =
            Registration.ITEMS.register("stegosaurian_iron_armor",
                    () -> new Item(new Item.Properties().group(Dinosauria.DINOSAURIA)));

    public static final RegistryObject<Item> STEGOSAURIAN_GOLD_ARMOR =
            Registration.ITEMS.register("stegosaurian_gold_armor",
                    () -> new Item(new Item.Properties().group(Dinosauria.DINOSAURIA)));

    public static final RegistryObject<Item> STEGOSAURIAN_DIAMOND_ARMOR =
            Registration.ITEMS.register("stegosaurian_diamond_armor",
                    () -> new Item(new Item.Properties().group(Dinosauria.DINOSAURIA)));

    public static final RegistryObject<Item> STEGOSAURIAN_NETHERITE_ARMOR =
            Registration.ITEMS.register("stegosaurian_netherite_armor",
                    () -> new Item(new Item.Properties().group(Dinosauria.DINOSAURIA)));

    public static final RegistryObject<Item> CERATOPSIAN_IRON_ARMOR =
            Registration.ITEMS.register("ceratopsian_iron_armor",
                    () -> new Item(new Item.Properties().group(Dinosauria.DINOSAURIA)));

    public static final RegistryObject<Item> CERATOPSIAN_GOLD_ARMOR =
            Registration.ITEMS.register("ceratopsian_gold_armor",
                    () -> new Item(new Item.Properties().group(Dinosauria.DINOSAURIA)));

    public static final RegistryObject<Item> CERATOPSIAN_DIAMOND_ARMOR =
            Registration.ITEMS.register("ceratopsian_diamond_armor",
                    () -> new Item(new Item.Properties().group(Dinosauria.DINOSAURIA)));

    public static final RegistryObject<Item> CERATOPSIAN_NETHERITE_ARMOR =
            Registration.ITEMS.register("ceratopsian_netherite_armor",
                    () -> new Item(new Item.Properties().group(Dinosauria.DINOSAURIA)));

    public static final RegistryObject<Item> PTERODACTYL_ELYTRA =
            Registration.ITEMS.register("pterodactyl_elytra",
                    () -> new Item(new Item.Properties().group(Dinosauria.DINOSAURIA)));

    public static final RegistryObject<Item> DINO_CHEST =
            Registration.ITEMS.register("dino_chest",
                    () -> new Item(new Item.Properties().group(Dinosauria.DINOSAURIA)));

    public static final RegistryObject<Item> DILOPHOSAURUS_EGG =
            Registration.ITEMS.register("dilophosaurus_egg",
                    () -> new Item(new Item.Properties().group(Dinosauria.DINOSAURIA)));

    public static final RegistryObject<Item> DASPLETOSAURUS_EGG =
            Registration.ITEMS.register("daspletosaurus_egg",
                    () -> new Item(new Item.Properties().group(Dinosauria.DINOSAURIA)));

    public static final RegistryObject<Item> BARYONYX_EGG =
            Registration.ITEMS.register("baryonyx_egg",
                    () -> new Item(new Item.Properties().group(Dinosauria.DINOSAURIA)));

    public static final RegistryObject<Item> NIGERSAURUS_EGG =
            Registration.ITEMS.register("nigersaurus_egg",
                    () -> new Item(new Item.Properties().group(Dinosauria.DINOSAURIA)));

    public static final RegistryObject<Item> ANKY_EGG =
            Registration.ITEMS.register("anky_egg",
                    () -> new Item(new Item.Properties().group(Dinosauria.DINOSAURIA)));

    public static final RegistryObject<Item> BURGER =
            Registration.ITEMS.register("burger",
                    () -> new Burger());











    public static void register() {}


}