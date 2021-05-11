package com.grimbo.dinosauria.block;

import com.grimbo.dinosauria.Dinosauria;
import com.grimbo.dinosauria.util.Registration;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;

import java.lang.reflect.Field;
import java.util.function.Supplier;

import static com.grimbo.dinosauria.Dinosauria.DINOSAURIA;

public class ModBlocks {


    public static final RegistryObject<Block> DRYOSAURUS_EGG_BLOCK = register("dryosaurus_egg_block", () -> new DryosaurusEggBlock(AbstractBlock.Properties.create(Material.DRAGON_EGG, MaterialColor.SAND).hardnessAndResistance(0.5F).sound(SoundType.METAL).tickRandomly().notSolid()));



    public static void register() {}

    public static <T extends Block >RegistryObject<T> register(String name, Supplier<T> block){

        RegistryObject<T>  toReturn = Registration.BLOCKS.register(name,block);

        Registration.ITEMS.register(name, () ->  new BlockItem(toReturn.get(),
                new Item.Properties().group(ItemGroup.BUILDING_BLOCKS).group(DINOSAURIA)));

        return toReturn;
    }

}
