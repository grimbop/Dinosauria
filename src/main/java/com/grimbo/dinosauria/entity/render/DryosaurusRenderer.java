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
        super(renderManagerIn, new DryosaurusModel<>(), 1f);
    }

    public void modelChange(boolean isChild, boolean isYoung, boolean isAdult){
        if(isChild){
            entityModel.setDryosaurusBabyModel();
        }else if(isYoung && !isChild){
            entityModel.setDryosaurusYoungModel();
        }else if(isAdult){
            entityModel.setDryosaurusAdultModel();
        }
    }

    @Override
    public ResourceLocation getEntityTexture(DryosaurusEntity entity) {
        modelChange(entity.isChild(), entity.isYoung(), entity.isAdult());

        return new ResourceLocation(Dinosauria.MOD_ID, entity.dryosaurusTexture);
    }
}
