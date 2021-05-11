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


    public String dryosaurusTexture = "textures/entity/dryosaurus_adult.png";

    public DryosaurusRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new DryosaurusModel<>(), 1f);
    }

    public void modelChange(boolean isChild, boolean isYoung, boolean isAdult){
        if(isChild){
            entityModel.setDryosaurusAdultModel();
            dryosaurusTexture = "textures/entity/dryosaurus_baby.png";
        }else if(isYoung){
            entityModel.setDryosaurusYoungModel();
            dryosaurusTexture = "textures/entity/dryosaurus_young.png";
        }else if(isAdult){
            entityModel.setDryosaurusAdultModel();
            dryosaurusTexture = "textures/entity/dryosaurus_adult.png";
        }
    }

    @Override
    public ResourceLocation getEntityTexture(DryosaurusEntity entity) {
        if (entity.isChild()) {
            entityModel.setDryosaurusBabyModel();
            dryosaurusTexture = "textures/entity/dryosaurus_baby.png";
        } else if (entity.isYoung()) {
            entityModel.setDryosaurusYoungModel();
            dryosaurusTexture = "textures/entity/dryosaurus_young.png";
        }else {
            entityModel.setDryosaurusAdultModel();
            dryosaurusTexture = "textures/entity/dryosaurus_adult.png";
        }



        return new ResourceLocation(Dinosauria.MOD_ID, dryosaurusTexture);
    }


}
