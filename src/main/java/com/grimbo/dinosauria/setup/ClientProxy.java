package com.grimbo.dinosauria.setup;

import com.grimbo.dinosauria.Dinosauria;
import com.grimbo.dinosauria.entity.ModEntityTypes;
import com.grimbo.dinosauria.entity.render.BalaurRenderer;
import net.minecraft.client.Minecraft;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Dinosauria.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientProxy implements IProxy{


    @Override
    public void init()
    {
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.BALAUR.get(), BalaurRenderer::new);


    }

    @Override
    public World getClientWorld() {
        return Minecraft.getInstance().world;
    }
}
