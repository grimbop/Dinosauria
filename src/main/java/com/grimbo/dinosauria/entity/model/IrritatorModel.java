package com.grimbo.dinosauria.entity.model;

import com.grimbo.dinosauria.entity.BalaurEntity;
import com.grimbo.dinosauria.entity.IrritatorEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class IrritatorModel<T extends IrritatorEntity> extends EntityModel<T>
{
    private final ModelRenderer Irrtator;
    private final ModelRenderer Body;
    private final ModelRenderer Tail;
    private final ModelRenderer Tail2;
    private final ModelRenderer Neck;
    private final ModelRenderer Head;
    private final ModelRenderer Jaw;
    private final ModelRenderer Neckbaloon;
    private final ModelRenderer Arm1;
    private final ModelRenderer Arm2;
    private final ModelRenderer Leg1;
    private final ModelRenderer Knee;
    private final ModelRenderer Feet1;
    private final ModelRenderer Leg2;
    private final ModelRenderer Knee2;
    private final ModelRenderer Feet2;

    public IrritatorModel() {
        textureWidth = 256;
        textureHeight = 256;

        Irrtator = new ModelRenderer(this);
        Irrtator.setRotationPoint(0.0F, 25.0F, 1.0F);


        Body = new ModelRenderer(this);
        Body.setRotationPoint(0.0F, -21.0F, -4.0F);
        Irrtator.addChild(Body);
        Body.setTextureOffset(0, 0).addBox(-7.0F, -14.0F, -32.0F, 13.0F, 18.0F, 42.0F, 0.0F, false);
        Body.setTextureOffset(147, 70).addBox(-2.0F, -17.0F, -28.0F, 3.0F, 3.0F, 37.0F, 0.0F, false);

        Tail = new ModelRenderer(this);
        Tail.setRotationPoint(0.0F, -9.0F, 9.0F);
        Body.addChild(Tail);
        Tail.setTextureOffset(68, 0).addBox(-5.0F, -4.0F, 1.0F, 9.0F, 10.0F, 30.0F, 0.0F, false);
        Tail.setTextureOffset(30, 156).addBox(-0.3F, -10.0F, 1.0F, 0.0F, 22.0F, 30.0F, 0.0F, false);

        Tail2 = new ModelRenderer(this);
        Tail2.setRotationPoint(0.0F, -2.0F, 31.0F);
        Tail.addChild(Tail2);
        Tail2.setTextureOffset(0, 60).addBox(-3.0F, -2.0F, 0.0F, 5.0F, 6.0F, 35.0F, 0.0F, false);
        Tail2.setTextureOffset(32, 184).addBox(-0.3F, -8.0F, 0.0F, 0.0F, 22.0F, 31.0F, 0.0F, false);

        Neck = new ModelRenderer(this);
        Neck.setRotationPoint(0.0F, -2.0F, -33.0F);
        Body.addChild(Neck);
        Neck.setTextureOffset(0, 60).addBox(-3.5F, -18.0F, -6.0F, 6.0F, 21.0F, 8.0F, 0.0F, false);

        Head = new ModelRenderer(this);
        Head.setRotationPoint(-1.0F, -15.1F, -4.9F);
        Neck.addChild(Head);
        Head.setTextureOffset(45, 81).addBox(-3.0F, -3.0F, -8.0F, 7.0F, 5.0F, 9.0F, 0.0F, false);
        Head.setTextureOffset(0, 0).addBox(-1.0F, -5.0F, -9.0F, 3.0F, 3.0F, 2.0F, 0.0F, false);
        Head.setTextureOffset(45, 60).addBox(-2.0F, -2.0F, -24.0F, 5.0F, 5.0F, 16.0F, 0.0F, false);
        Head.setTextureOffset(134, 55).addBox(-2.0F, 2.0F, -24.0F, 5.0F, 0.0F, 16.0F, 0.0F, false);


        Jaw = new ModelRenderer(this);
        Jaw.setRotationPoint(0.0F, 3.0F, 0.4F);
        Head.addChild(Jaw);
        Jaw.setTextureOffset(77, 83).addBox(-3.0F, -1.0F, -8.4F, 7.0F, 3.0F, 9.0F, 0.0F, false);
        Jaw.setTextureOffset(72, 66).addBox(-1.5F, -1.0F, -24.2F, 4.0F, 2.0F, 15.0F, 0.0F, false);
        Jaw.setTextureOffset(0, 103).addBox(-0.7F, -4.4F, -22.2F, 2.0F, 4.0F, 14.0F, 0.0F, false);

        Neckbaloon = new ModelRenderer(this);
        Neckbaloon.setRotationPoint(0.0F, -9.0F, -6.5F);
        Neck.addChild(Neckbaloon);
        Neckbaloon.setTextureOffset(171, 1).addBox(-2.5F, -1.1F, -5.5F, 4.0F, 9.0F, 7.0F, 0.0F, false);

        Arm1 = new ModelRenderer(this);
        Arm1.setRotationPoint(6.0F, 1.0F, -27.0F);
        Body.addChild(Arm1);
        Arm1.setTextureOffset(68, 0).addBox(-3.0F, -1.0F, -3.0F, 4.0F, 13.0F, 6.0F, 0.0F, false);
        Arm1.setTextureOffset(123, 0).addBox(-2.9F, 8.0F, -2.4F, 4.0F, 13.0F, 0.0F, 0.0F, false);

        Arm2 = new ModelRenderer(this);
        Arm2.setRotationPoint(-6.3F, 1.0F, -27.0F);
        Body.addChild(Arm2);
        Arm2.setTextureOffset(68, 0).addBox(-1.0F, -1.0F, -3.0F, 4.0F, 13.0F, 6.0F, 0.0F, true);
        Arm2.setTextureOffset(123, 0).addBox(-1.0F, 8.0F, -2.4F, 4.0F, 13.0F, 0.0F, 0.0F, true);

        Leg1 = new ModelRenderer(this);
        Leg1.setRotationPoint(5.0F, -28.0F, -4.0F);
        Irrtator.addChild(Leg1);
        Leg1.setTextureOffset(0, 0).addBox(-4.0F, -5.0F, -4.0F, 6.0F, 20.0F, 13.0F, 0.0F, false);

        Knee = new ModelRenderer(this);
        Knee.setRotationPoint(-1.0F, 14.0F, 9.0F);
        Leg1.addChild(Knee);
        Knee.setTextureOffset(95, 60).addBox(-2.0F, -1.0F, -3.0F, 4.0F, 14.0F, 5.0F, 0.0F, false);

        Feet1 = new ModelRenderer(this);
        Feet1.setRotationPoint(0.0F, 11.1F, -2.8F);
        Knee.addChild(Feet1);
        Feet1.setTextureOffset(68, 19).addBox(-3.0F, -1.1F, -5.0F, 6.0F, 3.0F, 7.0F, 0.0F, false);

        Leg2 = new ModelRenderer(this);
        Leg2.setRotationPoint(-6.0F, -28.0F, -4.0F);
        Irrtator.addChild(Leg2);
        Leg2.setTextureOffset(0, 0).addBox(-2.0F, -5.0F, -4.0F, 6.0F, 20.0F, 13.0F, 0.0F, true);

        Knee2 = new ModelRenderer(this);
        Knee2.setRotationPoint(1.0F, 14.0F, 9.0F);
        Leg2.addChild(Knee2);
        Knee2.setTextureOffset(95, 60).addBox(-2.0F, -1.0F, -3.0F, 4.0F, 14.0F, 5.0F, 0.0F, true);

        Feet2 = new ModelRenderer(this);
        Feet2.setRotationPoint(0.0F, 11.1F, -2.8F);
        Knee2.addChild(Feet2);
        Feet2.setTextureOffset(68, 19).addBox(-3.0F, -1.1F, -5.0F, 6.0F, 3.0F, 7.0F, 0.0F, true);

    }

    @Override
    public void setRotationAngles(T entity , float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
        this.Neck.rotateAngleX = headPitch * ((float)Math.PI / 180F);
        this.Neck.rotateAngleY = netHeadYaw * ((float)Math.PI / 180F);
        //this.body.rotateAngleX = ((float)Math.PI / 2F);
        this.Leg2.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.Leg1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;

    }

    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        Irrtator.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;

    }

}
