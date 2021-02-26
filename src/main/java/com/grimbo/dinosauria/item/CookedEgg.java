package com.grimbo.dinosauria.item;

import com.grimbo.dinosauria.Dinosauria;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class CookedEgg extends Item {
    public CookedEgg()
    {
        super(new Properties().group(Dinosauria.DINOSAURIA)
                .food(new Food.Builder()
                    .hunger(3)
                    .saturation(1.5f)
                    .build()));
    }


}
