package com.grimbo.dinosauria.entity.model;

import com.google.common.collect.ImmutableList;
import com.grimbo.dinosauria.entity.BalaurEntity;
import com.grimbo.dinosauria.entity.DryosaurusEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class DryosaurusModel<T extends DryosaurusEntity> extends EntityModel<T>
{
    private ModelRenderer Dryosaurus;
    private ModelRenderer Body;
    private ModelRenderer Tail1;
    private ModelRenderer Tail2;
    private ModelRenderer Neck;
    private ModelRenderer Head;
    private ModelRenderer Jaw;
    private ModelRenderer Arm1;
    private ModelRenderer Arm2;
    private ModelRenderer Leg1;
    private ModelRenderer Knee1;
    private ModelRenderer Feet1;
    private ModelRenderer Leg2;
    private ModelRenderer Knee2;
    private ModelRenderer Feet2;

    public DryosaurusModel() {
        setDryosaurusAdultModel();
    }


    @Override
    public void setRotationAngles(T entity , float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
        this.Neck.rotateAngleX = headPitch * ((float)Math.PI / 180F);
        this.Neck.rotateAngleY = netHeadYaw * ((float)Math.PI / 180F);
        this.Leg2.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.Leg1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;

    }



    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        Dryosaurus.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;

    }

    public void setDryosaurusAdultModel(){
        textureWidth = 128;
        textureHeight = 128;

        Dryosaurus = new ModelRenderer(this);
        Dryosaurus.setRotationPoint(0.0F, 22.8F, -10.0F);


        Body = new ModelRenderer(this);
        Body.setRotationPoint(0.0F, -15.0F, 11.0F);
        Dryosaurus.addChild(Body);
        Body.setTextureOffset(0, 0).addBox(-9.0F, -12.0F, -27.0F, 16.0F, 16.0F, 33.0F, 0.0F, false);

        Tail1 = new ModelRenderer(this);
        Tail1.setRotationPoint(-1.0F, -8.0F, 6.0F);
        Body.addChild(Tail1);
        Tail1.setTextureOffset(0, 49).addBox(-4.0F, -3.0F, 0.0F, 8.0F, 9.0F, 25.0F, 0.0F, false);

        Tail2 = new ModelRenderer(this);
        Tail2.setRotationPoint(0.0F, 0.0F, 25.0F);
        Tail1.addChild(Tail2);
        Tail2.setTextureOffset(39, 56).addBox(-3.0F, -2.0F, 0.0F, 6.0F, 5.0F, 27.0F, 0.0F, false);

        Neck = new ModelRenderer(this);
        Neck.setRotationPoint(-2.0F, -3.0F, -29.0F);
        Body.addChild(Neck);
        Neck.setTextureOffset(0, 0).addBox(-3.0F, -12.0F, -3.0F, 7.0F, 15.0F, 6.0F, 0.0F, false);

        Head = new ModelRenderer(this);
        Head.setRotationPoint(0.5F, -10.1F, -2.0F);
        Neck.addChild(Head);
        Head.setTextureOffset(78, 49).addBox(-4.0F, -2.0F, -5.0F, 8.0F, 6.0F, 5.0F, 0.0F, false);
        Head.setTextureOffset(41, 49).addBox(-3.0F, -2.0F, -11.0F, 6.0F, 5.0F, 6.0F, 0.0F, false);

        Jaw = new ModelRenderer(this);
        Jaw.setRotationPoint(-0.3F, 3.0F, -5.0F);
        Head.addChild(Jaw);
        Jaw.setTextureOffset(41, 59).addBox(-2.3F, -1.0F, -5.8F, 5.0F, 2.0F, 6.0F, 0.0F, false);

        Arm1 = new ModelRenderer(this);
        Arm1.setRotationPoint(6.8F, 1.0F, -21.0F);
        Body.addChild(Arm1);
        Arm1.setTextureOffset(78, 60).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

        Arm2 = new ModelRenderer(this);
        Arm2.setRotationPoint(-8.6F, 1.0F, -21.0F);
        Body.addChild(Arm2);
        Arm2.setTextureOffset(78, 60).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, true);

        Leg1 = new ModelRenderer(this);
        Leg1.setRotationPoint(10.0F, -18.0F, 8.0F);
        Dryosaurus.addChild(Leg1);
        Leg1.setTextureOffset(65, 0).addBox(-7.0F, -7.0F, -7.0F, 8.0F, 16.0F, 14.0F, 0.0F, false);

        Knee1 = new ModelRenderer(this);
        Knee1.setRotationPoint(-2.3F, 8.8F, 7.0F);
        Leg1.addChild(Knee1);
        Knee1.setTextureOffset(0, 49).addBox(-3.0F, -1.0F, -4.0F, 5.0F, 11.0F, 5.0F, 0.0F, false);

        Feet1 = new ModelRenderer(this);
        Feet1.setRotationPoint(0.0F, 8.5F, -1.0F);
        Knee1.addChild(Feet1);
        Feet1.setTextureOffset(0, 21).addBox(-4.0F, -1.0F, -6.0F, 7.0F, 3.0F, 7.0F, 0.0F, false);

        Leg2 = new ModelRenderer(this);
        Leg2.setRotationPoint(-12.0F, -18.0F, 8.0F);
        Dryosaurus.addChild(Leg2);
        Leg2.setTextureOffset(65, 0).addBox(-1.0F, -7.0F, -7.0F, 8.0F, 16.0F, 14.0F, 0.0F, true);

        Knee2 = new ModelRenderer(this);
        Knee2.setRotationPoint(2.3F, 8.8F, 7.0F);
        Leg2.addChild(Knee2);
        Knee2.setTextureOffset(0, 49).addBox(-2.0F, -1.0F, -4.0F, 5.0F, 11.0F, 5.0F, 0.0F, true);

        Feet2 = new ModelRenderer(this);
        Feet2.setRotationPoint(0.0F, 8.5F, -1.0F);
        Knee2.addChild(Feet2);
        Feet2.setTextureOffset(0, 21).addBox(-3.0F, -1.0F, -6.0F, 7.0F, 3.0F, 7.0F, 0.0F, true);
    }

    public void setDryosaurusYoungModel(){
        textureWidth = 128;
        textureHeight = 128;

        Dryosaurus = new ModelRenderer(this);
        Dryosaurus.setRotationPoint(0.0F, 23.5F, 2.0F);


        Body = new ModelRenderer(this);
        Body.setRotationPoint(0.0F, -13.0F, 2.0F);
        Dryosaurus.addChild(Body);
        Body.setTextureOffset(0, 0).addBox(-4.0F, -4.0F, -18.0F, 8.0F, 9.0F, 20.0F, 0.0F, false);

        Tail1 = new ModelRenderer(this);
        Tail1.setRotationPoint(0.0F, -2.0F, 2.0F);
        Body.addChild(Tail1);
        Tail1.setTextureOffset(32, 37).addBox(-3.0F, -1.0F, 0.0F, 6.0F, 5.0F, 16.0F, 0.0F, false);
        Tail1.setTextureOffset(0, 36).addBox(0.0F, -9.0F, 0.0F, 0.0F, 8.0F, 16.0F, 0.0F, false);

        Tail2 = new ModelRenderer(this);
        Tail2.setRotationPoint(0.0F, 1.0F, 16.0F);
        Tail1.addChild(Tail2);
        Tail2.setTextureOffset(0, 29).addBox(-2.0F, -2.0F, 0.0F, 4.0F, 3.0F, 20.0F, 0.0F, false);
        Tail2.setTextureOffset(28, 10).addBox(0.0F, -10.0F, 0.0F, 0.0F, 8.0F, 19.0F, 0.0F, false);

        Neck = new ModelRenderer(this);
        Neck.setRotationPoint(0.4F, 2.0F, -17.8F);
        Body.addChild(Neck);
        Neck.setTextureOffset(0, 0).addBox(-2.5F, -9.0F, -3.0F, 4.0F, 10.0F, 4.0F, 0.0F, false);

        Head = new ModelRenderer(this);
        Head.setRotationPoint(-0.8F, -7.7F, -1.1F);
        Neck.addChild(Head);
        Head.setTextureOffset(56, 11).addBox(-2.2F, -1.4F, -5.9F, 5.0F, 4.0F, 6.0F, 0.0F, false);

        Arm1 = new ModelRenderer(this);
        Arm1.setRotationPoint(3.5F, 4.0F, -13.5F);
        Body.addChild(Arm1);
        Arm1.setTextureOffset(12, 29).addBox(-1.0F, -1.0F, -1.5F, 2.0F, 7.0F, 2.0F, 0.0F, false);

        Arm2 = new ModelRenderer(this);
        Arm2.setRotationPoint(-3.5F, 4.0F, -13.5F);
        Body.addChild(Arm2);
        Arm2.setTextureOffset(12, 29).addBox(-1.0F, -1.0F, -1.5F, 2.0F, 7.0F, 2.0F, 0.0F, true);

        Leg1 = new ModelRenderer(this);
        Leg1.setRotationPoint(3.3F, -13.0F, 0.0F);
        Dryosaurus.addChild(Leg1);
        Leg1.setTextureOffset(36, 0).addBox(-2.0F, -2.0F, -5.0F, 4.0F, 9.0F, 8.0F, 0.0F, false);

        Knee1 = new ModelRenderer(this);
        Knee1.setRotationPoint(0.5F, 6.7F, 2.4F);
        Leg1.addChild(Knee1);
        Knee1.setTextureOffset(0, 29).addBox(-2.0F, -1.0F, -1.4F, 3.0F, 7.0F, 3.0F, 0.0F, false);
        Knee1.setTextureOffset(0, 14).addBox(-2.4F, 4.8F, -3.2F, 4.0F, 2.0F, 4.0F, 0.0F, false);

        Leg2 = new ModelRenderer(this);
        Leg2.setRotationPoint(-3.3F, -13.0F, 0.0F);
        Dryosaurus.addChild(Leg2);
        Leg2.setTextureOffset(36, 0).addBox(-2.0F, -2.0F, -5.0F, 4.0F, 9.0F, 8.0F, 0.0F, true);

        Knee2 = new ModelRenderer(this);
        Knee2.setRotationPoint(-0.5F, 6.7F, 2.4F);
        Leg2.addChild(Knee2);
        Knee2.setTextureOffset(0, 29).addBox(-1.0F, -1.0F, -1.4F, 3.0F, 7.0F, 3.0F, 0.0F, true);
        Knee2.setTextureOffset(0, 14).addBox(-1.6F, 4.8F, -3.2F, 4.0F, 2.0F, 4.0F, 0.0F, true);
    }

    public void setDryosaurusBabyModel(){
        textureWidth = 64;
        textureHeight = 64;

        Dryosaurus = new ModelRenderer(this);
        Dryosaurus.setRotationPoint(0.0F, 24.9F, -3.0F);


        Body = new ModelRenderer(this);
        Body.setRotationPoint(0.0F, -4.0F, 0.0F);
        Dryosaurus.addChild(Body);
        Body.setTextureOffset(0, 0).addBox(-3.0F, -5.1F, -6.0F, 5.0F, 5.0F, 11.0F, 0.0F, false);

        Tail1 = new ModelRenderer(this);
        Tail1.setRotationPoint(0.0F, -4.0F, 4.9F);
        Body.addChild(Tail1);
        Tail1.setTextureOffset(14, 19).addBox(-2.0F, -1.0F, 0.0F, 3.0F, 3.0F, 8.0F, 0.0F, false);
        Tail1.setTextureOffset(14, 19).addBox(-2.0F, -1.0F, 0.0F, 3.0F, 3.0F, 8.0F, 0.0F, false);
        Tail1.setTextureOffset(16, 22).addBox(-0.5F, -5.0F, 0.0F, 0.0F, 4.0F, 8.0F, 0.0F, false);

        Tail2 = new ModelRenderer(this);
        Tail2.setRotationPoint(0.5F, 0.0F, 8.0F);
        Tail1.addChild(Tail2);
        Tail2.setTextureOffset(0, 16).addBox(-2.0F, -1.0F, 0.0F, 2.0F, 2.0F, 9.0F, 0.0F, false);
        Tail2.setTextureOffset(0, 22).addBox(-1.0F, -5.0F, 0.0F, 0.0F, 4.0F, 8.0F, 0.0F, false);

        Neck = new ModelRenderer(this);
        Neck.setRotationPoint(-0.5F, -2.0F, -6.0F);
        Body.addChild(Neck);
        Neck.setTextureOffset(0, 0).addBox(-1.0F, -6.0F, -1.0F, 2.0F, 7.0F, 2.0F, 0.0F, false);

        Head = new ModelRenderer(this);
        Head.setRotationPoint(-0.1F, 0.0F, -1.0F);
        Neck.addChild(Head);
        Head.setTextureOffset(21, 0).addBox(-0.9F, -6.0F, -5.0F, 2.0F, 2.0F, 5.0F, 0.0F, false);

        Arm1 = new ModelRenderer(this);
        Arm1.setRotationPoint(1.4F, 0.0F, -3.8F);
        Body.addChild(Arm1);
        Arm1.setTextureOffset(4, 16).addBox(0.0F, -1.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);

        Arm2 = new ModelRenderer(this);
        Arm2.setRotationPoint(-2.2F, 0.0F, -3.8F);
        Body.addChild(Arm2);
        Arm2.setTextureOffset(4, 16).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, true);

        Leg1 = new ModelRenderer(this);
        Leg1.setRotationPoint(1.4F, -7.0F, 2.1F);
        Dryosaurus.addChild(Leg1);
        Leg1.setTextureOffset(28, 12).addBox(-1.0F, -1.1F, -2.0F, 2.0F, 4.0F, 4.0F, 0.0F, false);

        Knee1 = new ModelRenderer(this);
        Knee1.setRotationPoint(0.5F, 0.0F, 0.0F);
        Leg1.addChild(Knee1);
        Knee1.setTextureOffset(0, 16).addBox(-1.0F, 3.0F, 1.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
        Knee1.setTextureOffset(5, 0).addBox(-1.0F, 6.0F, 0.0F, 1.0F, 0.02F, 1.0F, 0.0F, false);

        Leg2 = new ModelRenderer(this);
        Leg2.setRotationPoint(-2.5F, -7.0F, 2.1F);
        Dryosaurus.addChild(Leg2);
        Leg2.setTextureOffset(28, 12).addBox(-1.0F, -1.1F, -2.0F, 2.0F, 4.0F, 4.0F, 0.0F, true);

        Knee2 = new ModelRenderer(this);
        Knee2.setRotationPoint(-0.5F, 0.0F, 0.0F);
        Leg2.addChild(Knee2);
        Knee2.setTextureOffset(0, 16).addBox(0.0F, 3.0F, 1.0F, 1.0F, 3.0F, 1.0F, 0.0F, true);
        Knee2.setTextureOffset(5, 0).addBox(0.0F, 6.0F, 0.0F, 1.0F, 0.02F, 1.0F, 0.0F, true);
    }

}
