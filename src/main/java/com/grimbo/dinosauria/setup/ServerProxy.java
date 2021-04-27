package com.grimbo.dinosauria.setup;

import com.grimbo.dinosauria.Dinosauria;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Dinosauria.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ServerProxy implements IProxy{


    @Override
    public void init() {

    }

    @Override
    public World getClientWorld() {
        throw new IllegalStateException("Cannot be run the Server!");
    }
}
