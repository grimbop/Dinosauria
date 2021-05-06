package com.grimbo.dinosauria.entity.render;

import com.grimbo.dinosauria.Dinosauria;
import com.grimbo.dinosauria.entity.BalaurEntity;
import com.grimbo.dinosauria.entity.model.BalaurModel;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class BalaurRenderer extends MobRenderer<BalaurEntity, BalaurModel<BalaurEntity>> {

    public BalaurRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new BalaurModel<>(), 0.5f);
    }


    @Override
    public ResourceLocation getEntityTexture(BalaurEntity entity) {
        if(entity.isChild()){
            entityModel.setBalaurBabyModel();
        }else{
            entityModel.setBalaurAdultModel();
        }

        return new ResourceLocation(Dinosauria.MOD_ID, entity.BalaurTexture);
    }


}
