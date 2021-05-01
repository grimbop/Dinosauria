package com.grimbo.dinosauria.entity.model;

import com.grimbo.dinosauria.entity.DilophosaurusEntity;
import com.grimbo.dinosauria.entity.PlatykottaEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class PlatykottaModel<T extends PlatykottaEntity> extends EntityModel<T>
    {
        private final ModelRenderer Platykotta;
        private final ModelRenderer body;
        private final ModelRenderer legs1;
        private final ModelRenderer legs2;
        private final ModelRenderer antenna1;
        private final ModelRenderer antenna2;

	public PlatykottaModel() {
        textureWidth = 32;
        textureHeight = 32;

        Platykotta = new ModelRenderer(this);
        Platykotta.setRotationPoint(0.0F, 22.0F, 0.0F);


        body = new ModelRenderer(this);
        body.setRotationPoint(0.0F, 0.0F, 0.0F);
        Platykotta.addChild(body);
        body.setTextureOffset(0, 0).addBox(-1.0F, -1.0F, -3.0F, 2.0F, 2.0F, 7.0F, 0.0F, false);
        body.setTextureOffset(0, 0).addBox(-0.75F, -1.0F, -5.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

        legs1 = new ModelRenderer(this);
        legs1.setRotationPoint(1.0F, 1.0F, 0.0F);
        body.addChild(legs1);
        legs1.setTextureOffset(0, 2).addBox(0.0F, 0.0F, -4.0F, 0.0F, 1.0F, 8.0F, 0.0F, false);

        legs2 = new ModelRenderer(this);
        legs2.setRotationPoint(-1.0F, 1.0F, 0.0F);
        body.addChild(legs2);
        legs2.setTextureOffset(0, 1).addBox(0.0F, 0.0F, -4.0F, 0.0F, 1.0F, 8.0F, 0.0F, false);

        antenna1 = new ModelRenderer(this);
        antenna1.setRotationPoint(0.75F, -1.0F, -3.0F);
        body.addChild(antenna1);
        antenna1.setTextureOffset(0, 0).addBox(0.0F, -3.0F, -2.0F, 0.0F, 3.0F, 3.0F, 0.0F, false);

        antenna2 = new ModelRenderer(this);
        antenna2.setRotationPoint(-0.75F, -1.0F, -3.0F);
        body.addChild(antenna2);
        antenna2.setTextureOffset(0, 8).addBox(0.0F, -3.0F, -2.0F, 0.0F, 3.0F, 3.0F, 0.0F, false);
    }

        @Override
        public void setRotationAngles(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch)
        {

        }

        @Override
        public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        Platykotta.render(matrixStack, buffer, packedLight, packedOverlay);
    }


        public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    }
