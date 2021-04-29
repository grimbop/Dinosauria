package com.grimbo.dinosauria.setup;

import com.grimbo.dinosauria.Dinosauria;
import com.grimbo.dinosauria.entity.IrritatorEntity;
import com.grimbo.dinosauria.entity.ModEntityTypes;
import com.grimbo.dinosauria.entity.render.BalaurRenderer;
import com.grimbo.dinosauria.entity.render.DilophosaurusRenderer;
import com.grimbo.dinosauria.entity.render.IrritatorRenderer;
import com.grimbo.dinosauria.entity.render.MonolophosaurusRenderer;
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

        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.DILOPHOSAURUS.get(), DilophosaurusRenderer::new);

        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.IRRITATOR.get(), IrritatorRenderer::new);

        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.MONOLOPHOSAURUS.get(), MonolophosaurusRenderer::new);
    }

    @Override
    public World getClientWorld() {
        return Minecraft.getInstance().world;
    }
}
