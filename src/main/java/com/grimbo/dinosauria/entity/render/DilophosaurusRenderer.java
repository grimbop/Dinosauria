package com.grimbo.dinosauria.entity.render;

import com.grimbo.dinosauria.Dinosauria;
import com.grimbo.dinosauria.entity.BalaurEntity;
import com.grimbo.dinosauria.entity.DilophosaurusEntity;
import com.grimbo.dinosauria.entity.model.BalaurModel;
import com.grimbo.dinosauria.entity.model.DilophosaurusModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

import java.*;

public class DilophosaurusRenderer extends MobRenderer<DilophosaurusEntity, DilophosaurusModel<DilophosaurusEntity>> {


    public DilophosaurusRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new DilophosaurusModel<>(), 1f);
    }


    @Override
    public ResourceLocation getEntityTexture(DilophosaurusEntity entity) {
        return new ResourceLocation(Dinosauria.MOD_ID, "textures/entity/dilophosaurus.png");
    }

}
