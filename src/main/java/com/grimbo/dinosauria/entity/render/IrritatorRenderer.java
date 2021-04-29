package com.grimbo.dinosauria.entity.render;

import com.grimbo.dinosauria.Dinosauria;
import com.grimbo.dinosauria.entity.DilophosaurusEntity;
import com.grimbo.dinosauria.entity.IrritatorEntity;
import com.grimbo.dinosauria.entity.model.DilophosaurusModel;
import com.grimbo.dinosauria.entity.model.IrritatorModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class IrritatorRenderer extends MobRenderer<IrritatorEntity, IrritatorModel<IrritatorEntity>> {


    public IrritatorRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new IrritatorModel<>(), 1f);
    }

    @Override
    public ResourceLocation getEntityTexture(IrritatorEntity entity) {
        return new ResourceLocation(Dinosauria.MOD_ID, "textures/entity/irritator.png");
    }

    
}
