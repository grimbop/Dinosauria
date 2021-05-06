package com.grimbo.dinosauria.setup;

import com.google.common.collect.Maps;
import com.grimbo.dinosauria.Dinosauria;
import com.grimbo.dinosauria.entity.DryosaurusEntity;
import com.grimbo.dinosauria.entity.IrritatorEntity;
import com.grimbo.dinosauria.entity.ModEntityTypes;
import com.grimbo.dinosauria.entity.model.BalaurModel;
import com.grimbo.dinosauria.entity.render.*;
import com.grimbo.dinosauria.item.BalaurEggItem;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.client.renderer.entity.*;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.resources.IReloadableResourceManager;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;

import java.util.Map;

@Mod.EventBusSubscriber(modid = Dinosauria.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientProxy implements IProxy{

    public final Map<EntityType<?>, EntityRenderer<?>> renderers = Maps.newHashMap();


    @Override
    public void init()
    {
        ItemRenderer itemRendererIn = Minecraft.getInstance().getItemRenderer();

        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.BALAUR.get(), BalaurRenderer::new);

        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.DILOPHOSAURUS.get(), DilophosaurusRenderer::new);

        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.IRRITATOR.get(), IrritatorRenderer::new);

        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.MONOLOPHOSAURUS.get(), MonolophosaurusRenderer::new);

        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.DRYOSAURUS.get(), DryosaurusRenderer::new);

        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.PLATYKOTTA.get(), PlatykottaRenderer::new);

        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.BALAUR_EGG.get(), manager -> new SpriteRenderer(manager, itemRendererIn));

    }

    @Override
    public World getClientWorld() {
        return Minecraft.getInstance().world;
    }
}
