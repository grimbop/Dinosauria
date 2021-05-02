package com.grimbo.dinosauria.entity.model;

import com.grimbo.dinosauria.entity.BalaurEntity;
import com.grimbo.dinosauria.entity.DilophosaurusEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class DilophosaurusModel <T extends DilophosaurusEntity> extends EntityModel<T>
    {
        private final ModelRenderer Dilophosaurus;
        private final ModelRenderer Torso;
        private final ModelRenderer Neck;
        private final ModelRenderer Head;
        private final ModelRenderer Jaw;
        private final ModelRenderer Tail;
        private final ModelRenderer Tail2;
        private final ModelRenderer Arm1;
        private final ModelRenderer Arm2;
        private final ModelRenderer leg1;
        private final ModelRenderer Knee1;
        private final ModelRenderer bone;
        private final ModelRenderer leg2;
        private final ModelRenderer Knee2;
        private final ModelRenderer bone2;

        public DilophosaurusModel() {
            textureWidth = 256;
            textureHeight = 256;

            Dilophosaurus = new ModelRenderer(this);
            Dilophosaurus.setRotationPoint(0.0F, -8.0F, -3.9F);


            Torso = new ModelRenderer(this);
            Torso.setRotationPoint(0.0F, 4.0F, 0.9F);
            Dilophosaurus.addChild(Torso);
            Torso.setTextureOffset(0, 0).addBox(-6.0F, -5.0F, -24.0F, 12.0F, 16.0F, 41.0F, 0.0F, false);

            Neck = new ModelRenderer(this);
            Neck.setRotationPoint(0.0F, 3.0F, -24.0F);
            Torso.addChild(Neck);
            Neck.setTextureOffset(0, 57).addBox(-3.0F, -15.0F, -5.0F, 6.0F, 20.0F, 6.0F, 0.0F, false);

            Head = new ModelRenderer(this);
            Head.setRotationPoint(0.0F, -13.2F, -2.5F);
            Neck.addChild(Head);
            Head.setTextureOffset(50, 57).addBox(-4.0F, -2.0F, -7.0F, 8.0F, 5.0F, 8.0F, 0.0F, false);
            Head.setTextureOffset(68, 70).addBox(-3.0F, -1.0F, -14.0F, 6.0F, 5.0F, 7.0F, 0.0F, false);
            Head.setTextureOffset(0, 111).addBox(-3.0F, 2.9F, -14.9F, 6.0F, 0.0F, 8.0F, 0.0F, false);
            Head.setTextureOffset(0, 134).addBox(-1.8F, 1.9F, -13.8F, 3.0F, 3.0F, 8.0F, 0.0F, false);
            Head.setTextureOffset(26, 0).addBox(-3.0F, 0.0F, -15.0F, 6.0F, 4.0F, 1.0F, 0.0F, false);
            Head.setTextureOffset(0, 15).addBox(2.5F, -12.0F, -14.0F, 0.0F, 11.0F, 15.0F, 0.0F, false);
            Head.setTextureOffset(0, 15).addBox(-2.5F, -12.0F, -14.0F, 0.0F, 11.0F, 15.0F, 0.0F, true);

            Jaw = new ModelRenderer(this);
            Jaw.setRotationPoint(0.0F, 4.2F, -0.9F);
            Head.addChild(Jaw);
            Jaw.setTextureOffset(82, 57).addBox(-2.8F, -1.2F, -14.0F, 5.0F, 2.0F, 8.0F, 0.0F, false);
            Jaw.setTextureOffset(0, 121).addBox(-1.8F, -3.7F, -13.0F, 3.0F, 3.0F, 7.0F, 0.0F, false);
            Jaw.setTextureOffset(65, 0).addBox(-4.0F, -1.2F, -6.1F, 8.0F, 3.0F, 8.0F, 0.0F, false);

            Tail = new ModelRenderer(this);
            Tail.setRotationPoint(0.0F, -3.0F, 17.0F);
            Torso.addChild(Tail);
            Tail.setTextureOffset(0, 57).addBox(-4.0F, -2.0F, 0.0F, 8.0F, 10.0F, 34.0F, 0.0F, false);

            Tail2 = new ModelRenderer(this);
            Tail2.setRotationPoint(0.0F, -1.0F, 34.0F);
            Tail.addChild(Tail2);
            Tail2.setTextureOffset(65, 0).addBox(-2.0F, -1.0F, 0.0F, 4.0F, 5.0F, 34.0F, 0.0F, false);

            Arm1 = new ModelRenderer(this);
            Arm1.setRotationPoint(4.2F, 7.0F, -18.0F);
            Torso.addChild(Arm1);
            Arm1.setTextureOffset(50, 70).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 15.0F, 5.0F, 0.0F, false);

            Arm2 = new ModelRenderer(this);
            Arm2.setRotationPoint(-4.2F, 7.0F, -18.0F);
            Torso.addChild(Arm2);
            Arm2.setTextureOffset(50, 70).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 15.0F, 5.0F, 0.0F, true);

            leg1 = new ModelRenderer(this);
            leg1.setRotationPoint(5.6F, 9.0F, 8.9F);
            Dilophosaurus.addChild(leg1);
            leg1.setTextureOffset(0, 0).addBox(-5.5F, -7.0F, -6.0F, 7.0F, 17.0F, 12.0F, 0.0F, false);

            Knee1 = new ModelRenderer(this);
            Knee1.setRotationPoint(-0.1F, 11.0F, 6.0F);
            leg1.addChild(Knee1);
            Knee1.setTextureOffset(65, 11).addBox(-4.2F, -4.0F, -2.0F, 5.0F, 16.0F, 4.0F, 0.0F, false);

            bone = new ModelRenderer(this);
            bone.setRotationPoint(0.0F, 10.2F, 0.0F);
            Knee1.addChild(bone);
            bone.setTextureOffset(115, 0).addBox(-4.8F, -0.2F, -6.4F, 6.0F, 2.0F, 8.0F, 0.0F, false);

            leg2 = new ModelRenderer(this);
            leg2.setRotationPoint(-5.6F, 9.0F, 8.9F);
            Dilophosaurus.addChild(leg2);
            leg2.setTextureOffset(0, 0).addBox(-1.5F, -7.0F, -6.0F, 7.0F, 17.0F, 12.0F, 0.0F, true);

            Knee2 = new ModelRenderer(this);
            Knee2.setRotationPoint(0.1F, 11.0F, 6.0F);
            leg2.addChild(Knee2);
            Knee2.setTextureOffset(65, 11).addBox(-0.8F, -4.0F, -2.0F, 5.0F, 16.0F, 4.0F, 0.0F, true);

            bone2 = new ModelRenderer(this);
            bone2.setRotationPoint(0.0F, 10.2F, 0.0F);
            Knee2.addChild(bone2);
            bone2.setTextureOffset(115, 0).addBox(-1.2F, -0.2F, -6.4F, 6.0F, 2.0F, 8.0F, 0.0F, true);
        }

        @Override
        public void setRotationAngles(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch)
        {
            this.Neck.rotateAngleX = headPitch * ((float)Math.PI / 180F);
            this.Neck.rotateAngleY = netHeadYaw * ((float)Math.PI / 180F);
            //this.body.rotateAngleX = ((float)Math.PI / 2F);
            this.leg2.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
            this.leg1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;

        }

        @Override
        public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        Dilophosaurus.render(matrixStack, buffer, packedLight, packedOverlay);
    }

        public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    }
