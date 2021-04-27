package com.grimbo.dinosauria.entity.render;

import com.grimbo.dinosauria.Dinosauria;
import com.grimbo.dinosauria.entity.BalaurEntity;
import com.grimbo.dinosauria.entity.model.BalaurModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class BalaurRenderer extends MobRenderer<BalaurEntity, BalaurModel<BalaurEntity>> {


    public BalaurRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new BalaurModel<>(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(BalaurEntity entity) {
        return new ResourceLocation(Dinosauria.MOD_ID, "textures/entity/balaur.png");
    }
}
