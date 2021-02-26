package com.grimbo.dinosauria.item;

import com.grimbo.dinosauria.Dinosauria;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class CookedFishMeat extends Item {
    public CookedFishMeat()
    {
        super(new Properties().group(Dinosauria.DINOSAURIA)
                .food(new Food.Builder()
                        .hunger(5)
                        .saturation(1.5f)
                        .build()));
    }


}
