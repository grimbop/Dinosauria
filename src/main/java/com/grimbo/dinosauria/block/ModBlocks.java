package com.grimbo.dinosauria.block;

import com.grimbo.dinosauria.Dinosauria;
import com.grimbo.dinosauria.util.Registration;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;

import java.util.function.Supplier;

import static com.grimbo.dinosauria.Dinosauria.DINOSAURIA;

public class ModBlocks {


    public static void register() {}


    private static <T extends Block>RegistryObject<T> register(String name, Supplier<T> block){

        RegistryObject<T> toReturn = Registration.BLOCKS.register(name,block);
        Registration.ITEMS.register(name, () -> new BlockItem(toReturn.get(),
                new Item.Properties().group(Dinosauria.DINOSAURIA)));
        return toReturn;

    }
}
