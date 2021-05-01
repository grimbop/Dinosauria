package com.grimbo.dinosauria.entity.render;

import com.grimbo.dinosauria.Dinosauria;
import com.grimbo.dinosauria.entity.BalaurEntity;
import com.grimbo.dinosauria.entity.PlatykottaEntity;
import com.grimbo.dinosauria.entity.model.BalaurModel;
import com.grimbo.dinosauria.entity.model.PlatykottaModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class PlatykottaRenderer extends MobRenderer<PlatykottaEntity, PlatykottaModel<PlatykottaEntity>> {


    public PlatykottaRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new PlatykottaModel<>(), 0.15f);
    }

    @Override
    public ResourceLocation getEntityTexture(PlatykottaEntity entity) {
        return new ResourceLocation(Dinosauria.MOD_ID, "textures/entity/platykotta.png");
    }
}
