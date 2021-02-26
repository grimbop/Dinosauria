package com.grimbo.dinosauria.item;

import com.grimbo.dinosauria.Dinosauria;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class CookedMeat extends Item {
    public CookedMeat()
    {
        super(new Properties().group(Dinosauria.DINOSAURIA)
                .food(new Food.Builder()
                        .hunger(5)
                        .saturation(1.5f)
                        .build()));
    }


}
