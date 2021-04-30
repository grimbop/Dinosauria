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
    private final ModelRenderer Dryosaurus;
    private final ModelRenderer Body;
    private final ModelRenderer Tail1;
    private final ModelRenderer Tail2;
    private final ModelRenderer Neck;
    private final ModelRenderer Head;
    private final ModelRenderer Arm1;
    private final ModelRenderer Arm2;
    private final ModelRenderer Leg1;
    private final ModelRenderer Leg2;

    public DryosaurusModel() {
        textureWidth = 128;
        textureHeight = 128;

        Dryosaurus = new ModelRenderer(this);
        Dryosaurus.setRotationPoint(0.0F, 23.9F, 0.0F);


        Body = new ModelRenderer(this);
        Body.setRotationPoint(0.0F, -13.0F, -1.0F);
        Dryosaurus.addChild(Body);
        Body.setTextureOffset(0, 0).addBox(-4.0F, -5.0F, -18.0F, 8.0F, 10.0F, 23.0F, 0.0F, false);

        Tail1 = new ModelRenderer(this);
        Tail1.setRotationPoint(0.0F, -4.0F, 5.0F);
        Body.addChild(Tail1);
        Tail1.setTextureOffset(39, 0).addBox(-3.0F, -1.0F, 0.0F, 6.0F, 6.0F, 16.0F, 0.0F, false);
        Tail1.setTextureOffset(13, 50).addBox(0.0F, -9.0F, 0.0F, 0.0F, 8.0F, 16.0F, 0.0F, false);

        Tail2 = new ModelRenderer(this);
        Tail2.setRotationPoint(0.0F, 1.0F, 16.0F);
        Tail1.addChild(Tail2);
        Tail2.setTextureOffset(0, 33).addBox(-2.0F, -2.0F, 0.0F, 4.0F, 4.0F, 20.0F, 0.0F, false);
        Tail2.setTextureOffset(12, 71).addBox(0.0F, -10.0F, 0.0F, 0.0F, 8.0F, 19.0F, 0.0F, false);

        Neck = new ModelRenderer(this);
        Neck.setRotationPoint(0.4F, 0.0F, -17.8F);
        Body.addChild(Neck);
        Neck.setTextureOffset(0, 33).addBox(-2.5F, -12.0F, -3.0F, 4.0F, 13.0F, 4.0F, 0.0F, false);

        Head = new ModelRenderer(this);
        Head.setRotationPoint(-0.8F, -10.7F, -1.1F);
        Neck.addChild(Head);
        Head.setTextureOffset(0, 15).addBox(-2.2F, -1.4F, -3.9F, 5.0F, 4.0F, 4.0F, 0.0F, false);
        Head.setTextureOffset(40, 35).addBox(-1.2F, -0.4F, -7.9F, 3.0F, 3.0F, 4.0F, 0.0F, false);

        Arm1 = new ModelRenderer(this);
        Arm1.setRotationPoint(3.8F, 4.0F, -13.5F);
        Body.addChild(Arm1);
        Arm1.setTextureOffset(28, 39).addBox(-2.0F, -1.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, false);

        Arm2 = new ModelRenderer(this);
        Arm2.setRotationPoint(-3.8F, 4.0F, -13.5F);
        Body.addChild(Arm2);
        Arm2.setTextureOffset(28, 39).addBox(-1.0F, -1.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, true);

        Leg1 = new ModelRenderer(this);
        Leg1.setRotationPoint(4.0F, -13.0F, 0.0F);
        Dryosaurus.addChild(Leg1);
        Leg1.setTextureOffset(0, 0).addBox(-3.0F, -2.0F, -3.0F, 5.0F, 9.0F, 6.0F, 0.0F, false);
        Leg1.setTextureOffset(39, 0).addBox(-2.0F, 6.0F, 1.0F, 3.0F, 7.0F, 3.0F, 0.0F, false);
        Leg1.setTextureOffset(28, 33).addBox(-2.4F, 11.1F, -1.0F, 4.0F, 2.0F, 4.0F, 0.0F, false);

        Leg2 = new ModelRenderer(this);
        Leg2.setRotationPoint(-4.0F, -13.0F, 0.0F);
        Dryosaurus.addChild(Leg2);
        Leg2.setTextureOffset(0, 0).addBox(-2.0F, -2.0F, -3.0F, 5.0F, 9.0F, 6.0F, 0.0F, true);
        Leg2.setTextureOffset(39, 0).addBox(-1.0F, 6.0F, 1.0F, 3.0F, 7.0F, 3.0F, 0.0F, true);
        Leg2.setTextureOffset(28, 33).addBox(-1.6F, 11.1F, -1.0F, 4.0F, 2.0F, 4.0F, 0.0F, true);
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

}
