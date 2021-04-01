package com.grimbo.dinosauria.item;

import com.grimbo.dinosauria.Dinosauria;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class RawMeat extends Item {

    public RawMeat()
    {
        super(new Properties().group(Dinosauria.DINOSAURIA)
                .food(new Food.Builder()
                        .hunger(1)
                        .effect(() -> new EffectInstance(Effects.HUNGER, 300, 0), 0.2f)
                        .build()));
    }


}
