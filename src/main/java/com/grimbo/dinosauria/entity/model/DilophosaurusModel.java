package com.grimbo.dinosauria.entity.model;

import com.grimbo.dinosauria.Dinosauria;
import com.grimbo.dinosauria.entity.DilophosaurusEntity;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class DilophosaurusModel extends AnimatedGeoModel<DilophosaurusEntity> {
    @Override
    public ResourceLocation getModelLocation(DilophosaurusEntity object) {
        return new ResourceLocation(Dinosauria.MOD_ID, "geo/Dilophosaurus_female.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(DilophosaurusEntity object) {
        return new ResourceLocation(Dinosauria.MOD_ID, "textures/entity/Dilophosaurus_female.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(DilophosaurusEntity object) {
        return new ResourceLocation(Dinosauria.MOD_ID, "animations/Dilophosaurus_Walk.json");
    }
}
