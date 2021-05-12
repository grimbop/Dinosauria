package com.grimbo.dinosauria.item;

import com.grimbo.dinosauria.Dinosauria;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

import java.util.List;

public class ToolTipItems extends Item {
    public String tooltip;

    public ToolTipItems(String tooltip) {
        super(new Properties().group(Dinosauria.DINOSAURIA));
        this.tooltip = tooltip;
    }

    @Override
    public void addInformation(ItemStack stack, World world, List<ITextComponent> tooltip, ITooltipFlag flag){
        tooltip.add(new StringTextComponent(this.tooltip));

    }

}
