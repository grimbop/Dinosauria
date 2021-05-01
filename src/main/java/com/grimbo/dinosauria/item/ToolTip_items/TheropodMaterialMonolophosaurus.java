package com.grimbo.dinosauria.item.ToolTip_items;

import com.grimbo.dinosauria.Dinosauria;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

import java.util.List;

public class TheropodMaterialMonolophosaurus extends Item {

    public TheropodMaterialMonolophosaurus() {
        super(new Properties().group(Dinosauria.DINOSAURIA));
    }

    @Override
    public void addInformation(ItemStack stack, World world, List<ITextComponent> tooltip, ITooltipFlag flag){
        tooltip.add(new StringTextComponent("\u00A78"+"Monolophosaurus" + "\u00A78"));

    }




}
