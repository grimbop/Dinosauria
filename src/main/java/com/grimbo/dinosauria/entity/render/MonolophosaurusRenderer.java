package com.grimbo.dinosauria.entity.render;

import com.grimbo.dinosauria.Dinosauria;
import com.grimbo.dinosauria.entity.IrritatorEntity;
import com.grimbo.dinosauria.entity.MonolophosaurusEntity;
import com.grimbo.dinosauria.entity.model.IrritatorModel;
import com.grimbo.dinosauria.entity.model.MonolophosaurusModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class MonolophosaurusRenderer extends MobRenderer<MonolophosaurusEntity, MonolophosaurusModel<MonolophosaurusEntity>> {


    public MonolophosaurusRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new MonolophosaurusModel<>(), 1f);
    }

    @Override
    public ResourceLocation getEntityTexture(MonolophosaurusEntity entity) {
        return new ResourceLocation(Dinosauria.MOD_ID, "textures/entity/monolophosaurus.png");
    }

    
}
