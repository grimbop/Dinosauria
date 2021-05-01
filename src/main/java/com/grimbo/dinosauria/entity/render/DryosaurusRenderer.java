package com.grimbo.dinosauria.entity.render;

import com.grimbo.dinosauria.Dinosauria;
import com.grimbo.dinosauria.entity.BalaurEntity;
import com.grimbo.dinosauria.entity.DryosaurusEntity;
import com.grimbo.dinosauria.entity.model.BalaurModel;
import com.grimbo.dinosauria.entity.model.DryosaurusModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class DryosaurusRenderer extends MobRenderer<DryosaurusEntity, DryosaurusModel<DryosaurusEntity>> {


    public DryosaurusRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new DryosaurusModel<>(), 0.75f);
    }

    @Override
    public ResourceLocation getEntityTexture(DryosaurusEntity entity) {
        return new ResourceLocation(Dinosauria.MOD_ID, entity.DryoSetVariation);
    }
}
