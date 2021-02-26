package com.grimbo.dinosauria.entity.render;

import com.grimbo.dinosauria.entity.DilophosaurusEntity;
import com.grimbo.dinosauria.entity.model.DilophosaurusModel;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import javax.annotation.Nullable;

public class DilophosaurusRender extends GeoEntityRenderer<DilophosaurusEntity>
{
    public DilophosaurusRender (EntityRendererManager renderManager)
    {
        super(renderManager, new DilophosaurusModel());
        this.shadowSize = 0.7F;
    }

    @Override
    public RenderType getRenderType (DilophosaurusEntity animatable, float partialTicks, MatrixStack stack, @Nullable IRenderTypeBuffer renderTypeBuffer, @Nullable IVertexBuilder vertexBuilder, int packedLightIn, ResourceLocation textureLocation)
    {
        return RenderType.getEntityTranslucent(getTextureLocation(animatable));
    }
}