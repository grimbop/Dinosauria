package com.grimbo.dinosauria.item;

import com.grimbo.dinosauria.Dinosauria;
import com.grimbo.dinosauria.item.ToolTip_items.DromaeosaurMaterialBalaur;
import com.grimbo.dinosauria.item.ToolTip_items.SpinosaurMaterialIrritator;
import com.grimbo.dinosauria.util.Registration;
import net.minecraft.item.*;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.fml.RegistryObject;

import java.util.function.Supplier;

public class ModItems {
    //tools types for adding Tools Itens
    enum TOOLTYPE{SHOVEL,PICKAXE,SWORD,AXE,HOE};


    /*
    ARMOR
     */

    /*
    UNOBTAINABLE ARMOR
        /*


    //ANKY
    public static final RegistryObject<Item> ANKY_IRON_ARMOR = registerItem("anky_iron_armor");

    public static final RegistryObject<Item> ANKY_GOLD_ARMOR = registerItem("anky_gold_armor");

    public static final RegistryObject<Item> ANKY_DIAMOND_ARMOR = registerItem("anky_diamond_armor");

    public static final RegistryObject<Item> ANKY_NETHERITE_ARMOR = registerItem("anky_netherite_armor");

    //MARINE
    public static final RegistryObject<Item> MARINE_IRON_ARMOR = registerItem("marine_iron_armor");

    public static final RegistryObject<Item> MARINE_GOLD_ARMOR = registerItem("marine_gold_armor");

    public static final RegistryObject<Item> MARINE_DIAMOND_ARMOR = registerItem("marine_diamond_armor");

    public static final RegistryObject<Item> MARINE_NETHERITE_ARMOR = registerItem("marine_netherite_armor");


    //STEGOSAURIN
    public static final RegistryObject<Item> STEGOSAURIAN_IRON_ARMOR = registerItem("stegosaurian_iron_armor");

    public static final RegistryObject<Item> STEGOSAURIAN_GOLD_ARMOR = registerItem("stegosaurian_gold_armor");

    public static final RegistryObject<Item> STEGOSAURIAN_DIAMOND_ARMOR = registerItem("stegosaurian_diamond_armor");

    public static final RegistryObject<Item> STEGOSAURIAN_NETHERITE_ARMOR = registerItem("stegosaurian_netherite_armor");


    //CERATOPSIAN
    public static final RegistryObject<Item> CERATOPSIAN_IRON_ARMOR = registerItem("ceratopsian_iron_armor");

    public static final RegistryObject<Item> CERATOPSIAN_GOLD_ARMOR = registerItem("ceratopsian_gold_armor");

    public static final RegistryObject<Item> CERATOPSIAN_DIAMOND_ARMOR = registerItem("ceratopsian_diamond_armor");

    public static final RegistryObject<Item> CERATOPSIAN_NETHERITE_ARMOR = registerItem("ceratopsian_netherite_armor");

    //CERATOPIAN
    public static final RegistryObject<Item> CERATOPTIAN_DIAMOND_ARMOR = registerItem("ceratoptian_diamond_armor");

    public static final RegistryObject<Item> CERATOPTIAN_GOLD_ARMOR = registerItem("ceratoptian_gold_armor");

    public static final RegistryObject<Item> CERATOPTIAN_IRON_ARMOR = registerItem("ceratoptian_iron_armor");

    public static final RegistryObject<Item> CERATOPTIAN_NETHERITE_ARMOR = registerItem("ceratoptian_netherite_armor");

//SAUROPOD
    public static final RegistryObject<Item> SAUROPOD_GOLD_ARMOR = registerItem("sauropod_gold_armor");

    public static final RegistryObject<Item> SAUROPOD_IRON_ARMOR = registerItem("sauropod_iron_armor");

    public static final RegistryObject<Item> SAUROPOD_NETHERITE_ARMOR = registerItem("sauropod_netherite_armor");

    public static final RegistryObject<Item> SAUROPOD_DIAMOND_ARMOR = registerItem("sauropod_diamond_armor");

    public static final RegistryObject<Item> SAUROPOD_SADDLE = registerItem("sauropod_saddle");

    */



    //THEROPOD

    public static final RegistryObject<Item> THEROPOD_IRON_ARMOR = registerItem("theropod_iron_armor");

    public static final RegistryObject<Item> THEROPOD_LEATHER_ARMOR = registerItem("theropod_leather_armor");

    public static final RegistryObject<Item> THEROPOD_GOLD_ARMOR = registerItem("theropod_gold_armor");

    public static final RegistryObject<Item> THEROPOD_NETHERITE_ARMOR = registerItem("theropod_netherite_armor");

    public static final RegistryObject<Item> THEROPOD_DIAMOND_ARMOR = registerItem("theropod_diamond_armor");

    public static final RegistryObject<Item> THEROPOD_SADDLE = registerItem("theropod_saddle");



    //ORNITHOPOD ==// need textures
    public static final RegistryObject<Item> ORNITHOPOD_IRON_ARMOR = registerItem("ornithopod_iron_armor");

    public static final RegistryObject<Item> ORNITHOPOD_LEATHER_ARMOR = registerItem("ornithopod_leather_armor");

    public static final RegistryObject<Item> ORNITHOPOD_GOLD_ARMOR = registerItem("ornithopod_gold_armor");

    public static final RegistryObject<Item> ORNITHOPOD_NETHERITE_ARMOR = registerItem("ornithopod_netherite_armor");

    public static final RegistryObject<Item> ORNITHOPOD_DIAMOND_ARMOR = registerItem("ornithopod_diamond_armor");






    public static final RegistryObject<Item> DINO_CHEST = registerItem("dino_chest");

    public static final RegistryObject<Item> PTERODACTYL_ELYTRA = registerItem("pterodactyl_elytra");

    /*
    END OF ARMOR
     */



    /*
    BOOKS
     */

    public static final RegistryObject<Item> OLD_PAPER = registerItem("old_paper");

    public static final RegistryObject<Item> LORE_BOOK = registerItem("lore_book");

    public static final RegistryObject<Item> DINOSAURIA_GUIDE_BOOK = registerItem("dinosauria_guide_book");


    /*
    END OF BOOKS
     */




    /*
    BONES
     */

    /*
    public static final RegistryObject<Item> DASPLETO_FOSSIL_SKULL = registerItem("daspleto_fossil_skull");

    public static final RegistryObject<Item> DASPLETO_FRESH_SKULL = registerItem("daspleto_fresh_skull");

    public static final RegistryObject<Item> DASPLETO_FOSSIL_NECK = registerItem("daspleto_fossil_neck");

    public static final RegistryObject<Item> DASPLETO_FRESH_NECK = registerItem("daspleto_fresh_neck");

    public static final RegistryObject<Item> DASPLETO_FOSSIL_VERTEBRAE = registerItem("daspleto_fossil_vertebrae");

    public static final RegistryObject<Item> DASPLETO_FRESH_VERTEBRAE = registerItem("daspleto_fresh_vertebrae");

    public static final RegistryObject<Item> DASPLETO_FOSSIL_RIBS = registerItem("daspleto_fossil_ribs");

    public static final RegistryObject<Item> DASPLETO_FRESH_RIBS = registerItem("daspleto_fresh_ribs");

    public static final RegistryObject<Item> DASPLETO_FOSSIL_TAIL = registerItem("daspleto_fossil_tail");

    public static final RegistryObject<Item> DASPLETO_FRESH_TAIL = registerItem("daspleto_fresh_tail");

    public static final RegistryObject<Item> DASPLETO_FOSSIL_BELLY = registerItem("daspleto_fossil_belly");

    public static final RegistryObject<Item> DASPLETO_FRESH_BELLY = registerItem("daspleto_fresh_belly");

    public static final RegistryObject<Item> DASPLETO_FOSSIL_ARM = registerItem("daspleto_fossil_arm");

    public static final RegistryObject<Item> DASPLETO_FRESH_ARM = registerItem("daspleto_fresh_arm");

    public static final RegistryObject<Item> DASPLETO_FOSSIL_LEG = registerItem("daspleto_fossil_leg");

    public static final RegistryObject<Item> DASPLETO_FRESH_LEG = registerItem("daspleto_fresh_leg");

    public static final RegistryObject<Item> DASPLETO_FOSSIL_HAND = registerItem("daspleto_fossil_hand");

    public static final RegistryObject<Item> DASPLETO_FRESH_HAND = registerItem("daspleto_fresh_hand");

    public static final RegistryObject<Item> DASPLETO_FOSSIL_FOOT = registerItem("daspleto_fossil_foot");

    public static final RegistryObject<Item> DASPLETO_FRESH_FOOT = registerItem("daspleto_fresh_foot");

    public static final RegistryObject<Item> DASPLETO_FRESH_TOOTH = registerItem("daspleto_fresh_tooth");

     */

    // need texture
    public static final RegistryObject<Item> FOSSIL_THEROPOD_BONE = registerItem("fossil_theropod_bone");

    public static final RegistryObject<Item> BALAUR_SKULL = registerItem("balaur_skull",
            () -> new Item(new Item.Properties().group(Dinosauria.DINOSAURIA).maxStackSize(1)));

    public static final RegistryObject<Item> DILOPHOSAURUS_SKULL = registerItem("dilophosaurus_skull",
            () -> new Item(new Item.Properties().group(Dinosauria.DINOSAURIA).maxStackSize(1)));

    public static final RegistryObject<Item> IRRITATOR_SKULL = registerItem("irritator_skull",
            () -> new Item(new Item.Properties().group(Dinosauria.DINOSAURIA).maxStackSize(1)));

    public static final RegistryObject<Item> DRYOSAURUS_SKULL = registerItem("dryosaurus_skull",
            () -> new Item(new Item.Properties().group(Dinosauria.DINOSAURIA).maxStackSize(1)));

    public static final RegistryObject<Item> MONOLOPHOSAURUS_SKULL = registerItem("monolophosaurus_skull",
            () -> new Item(new Item.Properties().group(Dinosauria.DINOSAURIA).maxStackSize(1)));



    /*
    END OF BONES
     */



    /*
    EGGS
     */

    public static final RegistryObject<Item> DILOPHOSAURUS_EGG = registerItem("dilophosaurus_egg");

    public static final RegistryObject<Item> DASPLETOSAURUS_EGG = registerItem("daspletosaurus_egg");

    public static final RegistryObject<Item> BARYONYX_EGG = registerItem("baryonyx_egg");

    public static final RegistryObject<Item> NIGERSAURUS_EGG = registerItem("nigersaurus_egg");

    public static final RegistryObject<Item> ANKY_EGG = registerItem("anky_egg");

    /*
    END OF EGGS
     */



    /**
    TOOLS
     **/

    /*
    END OD TOOLS
     */




    /**
    WEAPONS
    **/

    /*
    END OF WEAPONS
     */




    /**
    FOOD
     */
    public static final RegistryObject<Item> BURGER = registerFood("burger", 8, 2);

    public static final RegistryObject<Item> COOKED_EGG = registerFood("cooked_egg", 3,1.5f);

    public static final RegistryObject<Item> COOKED_THIGH = registerFood("cooked_thigh", 5, 1.5f);

    public static final RegistryObject<Item> COOKED_MEAT = registerFood("cooked_meat",5,1.5f);

    public static final RegistryObject<Item> COOKED_FISH_MEAT = registerFood("cooked_fish_meat", 5, 1.5f);

    public static final RegistryObject<Item> RAW_PLATYKOTTA = registerFood("raw_platykotta", 2, 1f);

    public static final RegistryObject<Item> COOKED_PLATYKOTTA = registerFood("cooked_platykotta", 8, 2f);

    public static final RegistryObject<Item> RAW_THIGH = registerInfectedFood("raw_thigh",
            1, Effects.HUNGER, 300, 1, 0.2f);

    public static final RegistryObject<Item> RAW_MEAT = registerInfectedFood("raw_meat",
            1, Effects.HUNGER, 300, 1, 0.2f);

    public static final RegistryObject<Item> SPICY_BREAD = registerInfectedFood("spicy_bread",
            4, Effects.SPEED, 200, 1, 1);

    /*
    END OF FOOD
     */



    /**
    MATERIALS ITEMS
     */

    public static final RegistryObject<Item> SPICY_WHEAT = registerItem("spicy_wheat");

    public static final RegistryObject<Item> BALAUR_FEATHER = registerItem("balaur_feather");

    public static final RegistryObject<Item> THEROPOD_TOOTH = registerItem("theropod_tooth");

    public static final RegistryObject<Item> SPINOSAURID_TOOTH = registerItem("spinosaurid_tooth");

    public static final RegistryObject<Item> WOODEN_RING = registerItem("wooden_ring",
     () -> new Item(new Item.Properties().group(Dinosauria.DINOSAURIA).maxStackSize(1)));

    public static final RegistryObject<Item> DROMAEOSAUR_MATERIAL_BALAUR = registerItem("dromaeosaur_material_balaur",
    () -> new DromaeosaurMaterialBalaur());

    public static final RegistryObject<Item> SPINOSAUR_MATERIAL_IRRITATOR = registerItem("spinosaur_material_irritator",
    () -> new SpinosaurMaterialIrritator());

    /*
    END OF MATERIALS
     */





    /** fuctions

    **/

    public static void register() {}


    //function to register items without specific class
    public static RegistryObject<Item> registerItem (String nameOfItem)   {

        return Registration.ITEMS.register(nameOfItem,
                () -> new Item(new Item.Properties().group(Dinosauria.DINOSAURIA)));
    }


    //"registerItem" fuction with specific group
    public static RegistryObject<Item> registerItem (String nameOfItem, ItemGroup itemGroup)   {

                return Registration.ITEMS.register(nameOfItem,
                        () -> new Item(new Item.Properties().group(itemGroup)));
    }


    //"registerItem" fuction with supplier, to add others classes
    public static <T extends Item> RegistryObject<Item> registerItem (String nameOfItem, Supplier<T> supplier)   {

        return Registration.ITEMS.register(nameOfItem, supplier);
    }


    //function to register food
    public static RegistryObject<Item> registerFood (String nameOfItem, int hunger, float saturation)   {

        return Registration.ITEMS.register(nameOfItem,//set nameOfItem
                () -> new Item(new Item.Properties().food(new Food.Builder().
                        hunger( Math.abs(hunger) ).//set hunger
                        saturation( Math.max(0.2f,saturation) ).build()).//set saturation
                        group( Dinosauria.DINOSAURIA).group( ItemGroup.FOOD) ));//set group

    }

    //fuction to register infectedFood
    public static <T extends Object> RegistryObject<Item> registerInfectedFood
    (String nameOfItem, int hunger, Effect effects, int duration, int amplifier, float probability)   {

        return Registration.ITEMS.register(nameOfItem,
                () -> new Item(new Item.Properties().group(Dinosauria.DINOSAURIA)
                        .food(new Food.Builder()
                                .hunger(Math.abs(hunger))//sets a absolute "hunger"
                                .effect(() -> new EffectInstance(effects, duration, Math.min(amplifier,255)), probability)//set the type, duration, amplifier and probality
                                .build())
                ));

    }



    // register a tool with default minecraft ItemTier, like diamond
    public static RegistryObject<Item> registerTool(
            String name, TOOLTYPE toolType, ItemTier itemTier, float attackDamage,
            float attackSpeed, int defaultMaxDamage, int toolTypeLevel){


        switch (toolType){

            case SHOVEL:

                return registerItem(name, () -> new ShovelItem(itemTier,
                        attackDamage, attackSpeed, new Item.Properties()
                        .defaultMaxDamage(defaultMaxDamage).addToolType(ToolType.SHOVEL,toolTypeLevel).
                                group(ItemGroup.TOOLS)));

            case PICKAXE:

                return registerItem(name, () -> new PickaxeItem(itemTier,
                        (int)attackDamage, attackSpeed, new Item.Properties()
                        .defaultMaxDamage(defaultMaxDamage).addToolType(ToolType.PICKAXE,toolTypeLevel).
                                group(ItemGroup.TOOLS)));

            case SWORD:

                return registerItem(name, () -> new SwordItem(itemTier,
                        (int)attackDamage, attackSpeed, new Item.Properties()
                        .defaultMaxDamage(defaultMaxDamage).
                                group(ItemGroup.COMBAT)));

            case HOE:

                return registerItem(name, () -> new HoeItem(itemTier,
                        (int)attackDamage, attackSpeed, new Item.Properties()
                        .defaultMaxDamage(defaultMaxDamage).addToolType(ToolType.HOE,toolTypeLevel).
                                group(ItemGroup.TOOLS)));

            case AXE:

                return registerItem(name, () -> new AxeItem(itemTier,
                        attackDamage, attackSpeed, new Item.Properties()
                        .defaultMaxDamage(defaultMaxDamage).addToolType(ToolType.AXE,toolTypeLevel).
                                group(ItemGroup.TOOLS)));

            default:
                return null;

        }
    }



    // register a tool with mod ItemTier
    public static RegistryObject<Item> registerTool(
            String name, TOOLTYPE toolType, ModItemTier itemTier, float attackDamage,
            float attackSpeed, int defaultMaxDamage, int toolTypeLevel){


        switch (toolType){

            case SHOVEL:

                return registerItem(name, () -> new ShovelItem(itemTier,
                        attackDamage, attackSpeed, new Item.Properties()
                        .defaultMaxDamage(defaultMaxDamage).addToolType(ToolType.SHOVEL,toolTypeLevel).
                                group(ItemGroup.TOOLS)));

            case PICKAXE:

                return registerItem(name, () -> new PickaxeItem(itemTier,
                        (int)attackDamage, attackSpeed, new Item.Properties()
                        .defaultMaxDamage(defaultMaxDamage).addToolType(ToolType.PICKAXE,toolTypeLevel).
                                group(ItemGroup.TOOLS)));

            case SWORD:

                return registerItem(name, () -> new SwordItem(itemTier,
                        (int)attackDamage, attackSpeed, new Item.Properties()
                        .defaultMaxDamage(defaultMaxDamage).
                                group(ItemGroup.COMBAT)));

            case HOE:

                return registerItem(name, () -> new HoeItem(itemTier,
                        (int)attackDamage, attackSpeed, new Item.Properties()
                        .defaultMaxDamage(defaultMaxDamage).addToolType(ToolType.HOE,toolTypeLevel).
                                group(ItemGroup.TOOLS)));

            case AXE:

                return registerItem(name, () -> new AxeItem(itemTier,
                        attackDamage, attackSpeed, new Item.Properties()
                        .defaultMaxDamage(defaultMaxDamage).addToolType(ToolType.AXE,toolTypeLevel).
                                group(ItemGroup.TOOLS)));

            default:
                return null;

        }


    }


    /*
    END OF FUCTIONS
     */




    //ITEM TIER

    //add a itemTier
    public enum ModItemTier implements IItemTier {

        THEROPOD(0, 0, 0, 0, 0,
                null //add an item when created
        ),
        Ornithopod(0, 0, 0, 0, 0,
                null //add an item when created
        )
        ;


        private final int harvestLevel;
        private final int maxUses;
        private final float efficiency;
        private final float attackDamage;
        private final int enchantability;
        private final Ingredient repairMaterial;

        ModItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage,
                    int enchantability, Ingredient repairMaterial) {
            this.harvestLevel = harvestLevel;
            this.maxUses = maxUses;
            this.efficiency = efficiency;
            this.attackDamage = attackDamage;
            this.enchantability = enchantability;
            this.repairMaterial = repairMaterial;
        }


        public int getMaxUses() {
            return maxUses;
        }

        public float getEfficiency() {
            return efficiency;
        }

        public float getAttackDamage() {
            return attackDamage;
        }

        public int getHarvestLevel() {
            return harvestLevel;
        }

        public int getEnchantability() {
            return enchantability;
        }

        public Ingredient getRepairMaterial() {
            return repairMaterial;
        }

    }





}