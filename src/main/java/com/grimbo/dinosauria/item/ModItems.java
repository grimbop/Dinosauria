package com.grimbo.dinosauria.item;

import com.grimbo.dinosauria.Dinosauria;
import com.grimbo.dinosauria.util.Registration;
import net.minecraft.item.*;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.LazyValue;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;

import java.util.function.Supplier;

public class ModItems {
    //tools types for adding Tools Itens
    enum TOOLTYPE {SHOVEL, PICKAXE, SWORD, AXE, HOE};

    /*
    DINO_ARMOR
     */

    /*
    END OF DINO_ARMOR
     */


    /*
    ARMOR
     */

    //place "registerArmor" after models
    public static final RegistryObject<Item> BALAUR_FEATRER_CROW = registerItem("balaur_feather_crown", 1);
    public static final RegistryObject<Item> DRYOSAURUS_FUZZ_CROWN = registerItem("dryosaurus_fuzz_crown", 1);

    /*
    END OF ARMOR
     */



    /*
    TROPHY
     */
    public static final RegistryObject<Item> DILOPHOSAURUS_CREST_TROPHY = registerItem("dilophosaurus_crest_trophy");
    public static final RegistryObject<Item> MONOLOPHOSAURUS_CREST_TROPHY = registerItem("monolophosaurus_crest_trophy");
    /*
    BOOKS
     */

    //public static final RegistryObject<Item> OLD_PAPER = registerItem("old_paper");

    //public static final RegistryObject<Item> LORE_BOOK = registerItem("lore_book");

    //public static final RegistryObject<Item> DINOSAURIA_GUIDE_BOOK = registerItem("dinosauria_guide_book");


    /*
    END OF BOOKS
     */



    /*
    Tools
     */
    public static final RegistryObject<Item> THEROPOD_TOOTH_KNIFE = Registration.ITEMS.register("theropod_tooth_knife", () -> new AxeItem(ItemTier.THEROPOD, 4, -1.8f, new Item.Properties().defaultMaxDamage(150).group(Dinosauria.DINOSAURIA)));
    public static final RegistryObject<Item> SPINOSAUR_TOOTH_SPEAR = Registration.ITEMS.register("spinosaur_tooth_spear", () -> new AxeItem(ModItems.ItemTier.SPINOSAUR, 4, -2.5f, new Item.Properties().defaultMaxDamage(150).group(Dinosauria.DINOSAURIA)));
    /*
    END OF TOOLS
     */


    /*
    BONES
     */
    public static final RegistryObject<Item> THEROPOD_BONE = registerItem("theropod_bone");
    public static final RegistryObject<Item> SPINOSAUR_BONE = registerItem("spinosaur_bone");
    public static final RegistryObject<Item> ORNITHOPOD_BONE = registerItem("ornithopod_bone");
    public static final RegistryObject<Item> DROMAEOSAUR_BONE = registerItem("dromaeosaur_bone");
    /**
     * Skulls
     */

    public static final RegistryObject<Item> BALAUR_SKULL = registerItem("balaur_skull", 1);
    public static final RegistryObject<Item> DILOPHOSAURUS_SKULL = registerItem("dilophosaurus_skull", 1);
    public static final RegistryObject<Item> IRRITATOR_SKULL = registerItem("irritator_skull", 1);
    public static final RegistryObject<Item> DRYOSAURUS_SKULL = registerItem("dryosaurus_skull", 1);
    public static final RegistryObject<Item> MONOLOPHOSAURUS_SKULL = registerItem("monolophosaurus_skull", 1);
    /*
    END OF BONES
     */



    /*
    EGGS
     */
    public static final RegistryObject<Item> BALAUR_EGG_ITEM = Registration.ITEMS.register("balaur_egg_item", () -> new BalaurEggItem(new Item.Properties().group(Dinosauria.DINOSAURIA).maxStackSize(16)));
    /*
    END OF EGGS
     */


    /**
     * FOOD
     */
    public static final RegistryObject<Item> BURGER = registerFood("burger", 8, 2);
    public static final RegistryObject<Item> RAW_PLATYKOTTA = registerFood("raw_platykotta", 2, 1f);
    public static final RegistryObject<Item> COOKED_PLATYKOTTA = registerFood("cooked_platykotta", 8, 2f);
    public static final RegistryObject<Item> RAW_THEROPOD_MEAT = registerFood("raw_theropod_meat", 4, 1f);
    public static final RegistryObject<Item> COOKED_THEROPOD_MEAT = registerFood("cooked_theropod_meat", 10, 2f);
    public static final RegistryObject<Item> RAW_SPINOSAUR_MEAT = registerFood("raw_spinosaur_meat", 5, 1f);
    public static final RegistryObject<Item> COOKED_SPINOSAUR_MEAT = registerFood("cooked_spinosaur_meat", 11, 2f);
    public static final RegistryObject<Item> RAW_DROMAEOSAUR_MEAT = registerInfectedFood("raw_dromaeosaur_meat", 2, Effects.HUNGER, 140, 1, 0.115F);
    public static final RegistryObject<Item> COOKED_DROMAEOSAUR_MEAT = registerFood("cookeed_dromaeosaur_meat", 8, 2f);
    public static final RegistryObject<Item> RAW_ORNITHOPOD_MEAT = registerFood("raw_ornithopod_meat", 5, 1f);
    public static final RegistryObject<Item> COOKED_ORNITHOPOD_MEAT = registerFood("cookeed_ornithopod_meat", 12, 2f);
    public static final RegistryObject<Item> SPICY_BREAD = registerInfectedFood("spicy_bread", 4, Effects.SPEED, 200, 1, 1);

    /*
    END OF FOOD
     */


    /**
     * MATERIALS ITEMS
     */

    public static final RegistryObject<Item> SPICY_WHEAT = registerItem("spicy_wheat");
    public static final RegistryObject<Item> BALAUR_FEATHER = registerItem("balaur_feather");
    public static final RegistryObject<Item> DRYOSAURUS_FUZZ = registerItem("dryosaurus_fuzz");
    public static final RegistryObject<Item> THEROPOD_TOOTH = registerItem("theropod_tooth");
    public static final RegistryObject<Item> SPINOSAURID_TOOTH = registerItem("spinosaurid_tooth");
    public static final RegistryObject<Item> WOODEN_RING = registerItem("wooden_ring", 1);

    /**
     * dino materials
     */

    public static final RegistryObject<Item> DROMAEOSAUR_MATERIAL_BALAUR = registerItem("dromaeosaur_material_balaur", () -> new ToolTipItems("\u00A76"+"Balaur" + "\u00A76"));
    public static final RegistryObject<Item> SPINOSAUR_MATERIAL_IRRITATOR = registerItem("spinosaur_material_irritator", () -> new ToolTipItems("\u00A7b"+"Irritator" + "\u00A7b"));
    public static final RegistryObject<Item> THEROPOD_MATERIAL_DILOPHOSAURUS = registerItem("theropod_material_dilophosaurus", () -> new ToolTipItems("\u00A74"+"Dilophosaurus" + "\u00A74"));
    public static final RegistryObject<Item> THEROPOD_MATERIAL_MONOLOPHOSAURUS = registerItem("theropod_material_monolophosaurus", () -> new ToolTipItems("\u00A79"+"Monolophosaurus" + "\u00A79"));
    public static final RegistryObject<Item> ORNITHOPOD_MATERIAL_DRYOSAURUS = registerItem("ornithopod_material_dryosaurus", () -> new ToolTipItems("\u00A74"+"Dryosaurus" + "\u00A74"));


    /*
    END OF MATERIALS
     */


    /**
     * fuctions
     **/

    public static void register() {
    }


    //function to register items without specific class
    public static RegistryObject<Item> registerItem(String nameOfItem) {

        return Registration.ITEMS.register(nameOfItem,
                () -> new Item(new Item.Properties().group(Dinosauria.DINOSAURIA)));
    }


    //"registerItem" fuction with specific group
    public static RegistryObject<Item> registerItem(String nameOfItem, ItemGroup itemGroup) {

        return Registration.ITEMS.register(nameOfItem,
                () -> new Item(new Item.Properties().group(itemGroup)));
    }


    //"registerItem" fuction with supplier, to add others classes
    public static <T extends Item> RegistryObject<Item> registerItem(String nameOfItem, Supplier<T> supplier) {

        return Registration.ITEMS.register(nameOfItem, supplier);
    }

    public static <T extends Item> RegistryObject<Item> registerItem(String nameOfItem, int maxStackSize) {

        return Registration.ITEMS.register(nameOfItem,
                () -> new Item(new Item.Properties().group(Dinosauria.DINOSAURIA).maxStackSize(maxStackSize)));
    }


    //function to register food
    public static RegistryObject<Item> registerFood(String nameOfItem, int hunger, float saturation) {

        return Registration.ITEMS.register(nameOfItem,//set nameOfItem
                () -> new Item(new Item.Properties().food(new Food.Builder().
                        hunger(Math.abs(hunger)).//set hunger
                        saturation(Math.max(0.2f, saturation)).build()).//set saturation
                        group(Dinosauria.DINOSAURIA)));//set group

    }


    //fuction to register infectedFood
    public static <T extends Object> RegistryObject<Item> registerInfectedFood
    (String nameOfItem, int hunger, Effect effects, int duration, int amplifier, float probability) {

        return Registration.ITEMS.register(nameOfItem,
                () -> new Item(new Item.Properties().group(Dinosauria.DINOSAURIA)
                        .food(new Food.Builder()
                                .hunger(Math.abs(hunger))//sets a absolute "hunger"
                                .effect(() -> new EffectInstance(effects, duration, Math.min(amplifier, 255)), probability)//set the type, duration, amplifier and probality
                                .build())
                ));

    }


    // register a tool with default minecraft ItemTier, like diamond
    public static RegistryObject<Item> registerTool(
            String name, TOOLTYPE toolType, ItemTier itemTier, float attackDamage,
            float attackSpeed, int defaultMaxDamage, int toolTypeLevel) {


        switch (toolType) {

            case SHOVEL:

                return registerItem(name, () -> new ShovelItem(itemTier,
                        attackDamage, attackSpeed, new Item.Properties()
                        .defaultMaxDamage(defaultMaxDamage).addToolType(ToolType.SHOVEL, toolTypeLevel).
                                group(ItemGroup.TOOLS)));

            case PICKAXE:

                return registerItem(name, () -> new PickaxeItem(itemTier,
                        (int) attackDamage, attackSpeed, new Item.Properties()
                        .defaultMaxDamage(defaultMaxDamage).addToolType(ToolType.PICKAXE, toolTypeLevel).
                                group(ItemGroup.TOOLS)));

            case SWORD:

                return registerItem(name, () -> new SwordItem(itemTier,
                        (int) attackDamage, attackSpeed, new Item.Properties()
                        .defaultMaxDamage(defaultMaxDamage).
                                group(ItemGroup.COMBAT)));

            case HOE:

                return registerItem(name, () -> new HoeItem(itemTier,
                        (int) attackDamage, attackSpeed, new Item.Properties()
                        .defaultMaxDamage(defaultMaxDamage).addToolType(ToolType.HOE, toolTypeLevel).
                                group(ItemGroup.TOOLS)));

            case AXE:

                return registerItem(name, () -> new AxeItem(itemTier,
                        attackDamage, attackSpeed, new Item.Properties()
                        .defaultMaxDamage(defaultMaxDamage).addToolType(ToolType.AXE, toolTypeLevel).
                                group(ItemGroup.TOOLS)));

            default:
                return null;

        }
    }


    //add a itemTier
    public enum ItemTier implements IItemTier {
        THEROPOD(1, 245, 1.0F, 0.0F, 15, () -> {
            return Ingredient.fromStacks(new ItemStack(ModItems.THEROPOD_BONE.get()));
        }),
        SPINOSAUR(1, 273, 1.0F, 0.5F, 15, () -> {
            return Ingredient.fromStacks(new ItemStack(ModItems.SPINOSAUR_BONE.get()));
        })
        ;

        private final int harvestLevel;
        private final int maxUses;
        private final float efficiency;
        private final float attackDamage;
        private final int enchantability;
        private final LazyValue<Ingredient> repairMaterial;

        private ItemTier(int harvestLevelIn, int maxUsesIn, float efficiencyIn, float attackDamageIn, int enchantabilityIn, Supplier<Ingredient> repairMaterialIn) {
            this.harvestLevel = harvestLevelIn;
            this.maxUses = maxUsesIn;
            this.efficiency = efficiencyIn;
            this.attackDamage = attackDamageIn;
            this.enchantability = enchantabilityIn;
            this.repairMaterial = new LazyValue<>(repairMaterialIn);
        }

        public int getMaxUses() {
            return this.maxUses;
        }

        public float getEfficiency() {
            return this.efficiency;
        }

        public float getAttackDamage() {
            return this.attackDamage;
        }

        public int getHarvestLevel() {
            return this.harvestLevel;
        }

        public int getEnchantability() {
            return this.enchantability;
        }

        public Ingredient getRepairMaterial() {
            return this.repairMaterial.getValue();
        }
    }


}