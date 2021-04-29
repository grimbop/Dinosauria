package com.grimbo.dinosauria.entity.model;

import com.grimbo.dinosauria.entity.IrritatorEntity;
import com.grimbo.dinosauria.entity.MonolophosaurusEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class MonolophosaurusModel<T extends MonolophosaurusEntity> extends EntityModel<T>
{
    private final ModelRenderer Monolophosaurus;
    private final ModelRenderer Body;
    private final ModelRenderer Tail1;
    private final ModelRenderer Tail2;
    private final ModelRenderer Neck;
    private final ModelRenderer Head;
    private final ModelRenderer Jaw;
    private final ModelRenderer Arm1;
    private final ModelRenderer Arm2;
    private final ModelRenderer Leg1;
    private final ModelRenderer Knee1;
    private final ModelRenderer Leg2;
    private final ModelRenderer Knee2;

    public MonolophosaurusModel() {
        textureWidth = 128;
        textureHeight = 128;

        Monolophosaurus = new ModelRenderer(this);
        Monolophosaurus.setRotationPoint(0.0F, 23.0F, 1.0F);


        Body = new ModelRenderer(this);
        Body.setRotationPoint(-1.0F, -19.0F, -3.0F);
        Monolophosaurus.addChild(Body);
        Body.setTextureOffset(0, 0).addBox(-6.0F, -7.0F, -26.0F, 13.0F, 14.0F, 35.0F, 0.0F, false);

        Tail1 = new ModelRenderer(this);
        Tail1.setRotationPoint(0.0F, -4.0F, 9.0F);
        Body.addChild(Tail1);
        Tail1.setTextureOffset(0, 49).addBox(-4.0F, -3.0F, 0.0F, 9.0F, 10.0F, 26.0F, 0.0F, false);

        Tail2 = new ModelRenderer(this);
        Tail2.setRotationPoint(0.0F, 0.0F, 26.0F);
        Tail1.addChild(Tail2);
        Tail2.setTextureOffset(45, 60).addBox(-2.0F, -3.0F, 0.0F, 5.0F, 6.0F, 25.0F, 0.0F, false);
        Tail2.setTextureOffset(45, 60).addBox(-2.0F, -3.0F, 0.0F, 5.0F, 6.0F, 25.0F, 0.0F, false);
        Tail2.setTextureOffset(45, 60).addBox(-2.0F, -3.0F, 0.0F, 5.0F, 6.0F, 25.0F, 0.0F, false);

        Neck = new ModelRenderer(this);
        Neck.setRotationPoint(0.0F, 1.0F, -26.0F);
        Body.addChild(Neck);
        Neck.setTextureOffset(0, 49).addBox(-3.0F, -11.0F, -5.0F, 7.0F, 13.0F, 6.0F, 0.0F, false);

        Head = new ModelRenderer(this);
        Head.setRotationPoint(0.0F, -9.1F, -1.7F);
        Neck.addChild(Head);
        Head.setTextureOffset(44, 49).addBox(-4.0F, -2.0F, -4.0F, 9.0F, 5.0F, 4.0F, 0.0F, false);
        Head.setTextureOffset(0, 0).addBox(-3.0F, -2.0F, -14.0F, 7.0F, 6.0F, 10.0F, 0.0F, false);
        Head.setTextureOffset(94, 96).addBox(-2.0F, 1.899F, -13.2F, 5.0F, 4.0F, 9.0F, 0.0F, false);
        Head.setTextureOffset(8, 0).addBox(-3.0F, 3.0F, -14.0F, 7.0F, 0.0F, 10.0F, 0.0F, false);
        Head.setTextureOffset(80, 49).addBox(-3.0F, -6.0F, -14.0F, 7.0F, 4.0F, 12.0F, 0.0F, false);

        Jaw = new ModelRenderer(this);
        Jaw.setRotationPoint(0.0F, 4.4F, -0.8F);
        Head.addChild(Jaw);
        Jaw.setTextureOffset(13, 89).addBox(-4.0F, -1.4F, -3.2F, 9.0F, 3.0F, 4.0F, 0.0F, false);
        Jaw.setTextureOffset(98, 26).addBox(-2.9F, -1.4F, -13.1F, 6.0F, 2.0F, 9.0F, 0.0F, false);
        Jaw.setTextureOffset(98, 12).addBox(-1.9F, -2.6F, -12.1F, 4.0F, 2.0F, 8.0F, 0.0F, false);

        Arm1 = new ModelRenderer(this);
        Arm1.setRotationPoint(6.0F, 5.0F, -20.0F);
        Body.addChild(Arm1);
        Arm1.setTextureOffset(80, 65).addBox(-1.0F, -1.0F, -2.0F, 3.0F, 9.0F, 4.0F, 0.0F, false);
        Arm1.setTextureOffset(0, 88).addBox(1.9F, -1.0F, 1.0F, 0.0F, 9.0F, 4.0F, 0.0F, false);

        Arm2 = new ModelRenderer(this);
        Arm2.setRotationPoint(-6.0F, 5.0F, -20.0F);
        Body.addChild(Arm2);
        Arm2.setTextureOffset(80, 65).addBox(-1.0F, -1.0F, -2.0F, 3.0F, 9.0F, 4.0F, 0.0F, true);
        Arm2.setTextureOffset(0, 88).addBox(-0.9F, -1.0F, 1.0F, 0.0F, 9.0F, 4.0F, 0.0F, true);

        Leg1 = new ModelRenderer(this);
        Leg1.setRotationPoint(6.0F, -18.0F, 0.0F);
        Monolophosaurus.addChild(Leg1);
        Leg1.setTextureOffset(61, 0).addBox(-5.0F, -6.0F, -7.0F, 7.0F, 14.0F, 11.0F, 0.0F, false);

        Knee1 = new ModelRenderer(this);
        Knee1.setRotationPoint(-2.0F, 8.0F, 3.0F);
        Leg1.addChild(Knee1);
        Knee1.setTextureOffset(44, 59).addBox(-1.0F, -1.0F, -1.0F, 4.0F, 12.0F, 3.0F, 0.0F, false);
        Knee1.setTextureOffset(0, 22).addBox(-1.5F, 9.0F, -4.9F, 5.0F, 2.0F, 5.0F, 0.0F, false);

        Leg2 = new ModelRenderer(this);
        Leg2.setRotationPoint(-7.0F, -18.0F, 0.0F);
        Monolophosaurus.addChild(Leg2);
        Leg2.setTextureOffset(61, 0).addBox(-2.0F, -6.0F, -7.0F, 7.0F, 14.0F, 11.0F, 0.0F, true);

        Knee2 = new ModelRenderer(this);
        Knee2.setRotationPoint(2.0F, 8.0F, 3.0F);
        Leg2.addChild(Knee2);
        Knee2.setTextureOffset(44, 59).addBox(-3.0F, -1.0F, -1.0F, 4.0F, 12.0F, 3.0F, 0.0F, true);
        Knee2.setTextureOffset(0, 22).addBox(-3.5F, 9.0F, -4.9F, 5.0F, 2.0F, 5.0F, 0.0F, true);
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
        Monolophosaurus.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;

    }

}
