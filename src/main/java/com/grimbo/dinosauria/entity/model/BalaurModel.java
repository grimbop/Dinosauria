package com.grimbo.dinosauria.entity.model;

import com.google.common.collect.ImmutableList;
import com.grimbo.dinosauria.entity.BalaurEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.sun.javafx.scene.control.behavior.BehaviorBase;
import net.minecraft.client.renderer.entity.model.AgeableModel;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.util.math.MathHelper;
import software.bernie.geckolib3.model.provider.data.EntityModelData;

import javax.jws.WebParam;

public class BalaurModel<T extends BalaurEntity> extends EntityModel<T>
{

    ModelRenderer balaur;
    ModelRenderer body;
    ModelRenderer neck;
    ModelRenderer head;
    ModelRenderer jaw;
    ModelRenderer leftWing;
    ModelRenderer rightWing;
    ModelRenderer tail;
    ModelRenderer tailpart1;
    ModelRenderer leg1;
    ModelRenderer claws1;
    ModelRenderer cube_r1;
    ModelRenderer cube_r2;
    ModelRenderer leg2;
    ModelRenderer claws2;
    ModelRenderer cube_r3;
    ModelRenderer cube_r4;



    public BalaurModel() {
        setBalaurAdultModel();
    }


    protected Iterable<ModelRenderer> getBodyParts() {
        return ImmutableList.of(this.body, leg2, this.leg1, this.rightWing, this.leftWing);
    }


    @Override
    public void setRotationAngles(T entity , float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
        this.neck.rotateAngleX = headPitch * ((float)Math.PI / 180F);
        this.neck.rotateAngleY = netHeadYaw * ((float)Math.PI / 180F);
        this.leg2.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.leg1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;

    }


    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        balaur.render(matrixStack, buffer, packedLight, packedOverlay);

    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    public void setBalaurAdultModel(){
        textureWidth = 64;
        textureHeight = 64;

        balaur = new ModelRenderer(this);
        balaur.setRotationPoint(0.0F, 14.25F, -2.25F);


        body = new ModelRenderer(this);
        body.setRotationPoint(0.0F, 0.0F, 0.0F);
        balaur.addChild(body);
        body.setTextureOffset(0, 0).addBox(-3.0F, -2.25F, -5.75F, 6.0F, 5.0F, 11.0F, 0.0F, false);

        neck = new ModelRenderer(this);
        neck.setRotationPoint(0.0F, -0.25F, -6.0F);
        body.addChild(neck);
        neck.setTextureOffset(0, 0).addBox(-1.25F, -4.75F, -1.75F, 2.0F, 6.0F, 3.0F, 0.0F, false);

        head = new ModelRenderer(this);
        head.setRotationPoint(0.0F, -4.0F, -0.75F);
        neck.addChild(head);
        head.setTextureOffset(23, 0).addBox(-1.5F, -1.0F, -4.95F, 3.0F, 2.0F, 7.0F, 0.0F, false);

        jaw = new ModelRenderer(this);
        jaw.setRotationPoint(0.0F, 1.25F, 0.75F);
        head.addChild(jaw);


        leftWing = new ModelRenderer(this);
        leftWing.setRotationPoint(3.0F, 0.75F, -3.75F);
        body.addChild(leftWing);
        leftWing.setTextureOffset(38, 32).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 6.0F, 4.0F, 0.0F, false);
        leftWing.setTextureOffset(0, 8).addBox(1.0F, 5.0F, -1.0F, 0.0F, 1.0F, 2.0F, 0.0F, false);

        rightWing = new ModelRenderer(this);
        rightWing.setRotationPoint(-3.0F, 0.75F, -3.75F);
        body.addChild(rightWing);
        rightWing.setTextureOffset(26, 32).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 6.0F, 4.0F, 0.0F, false);
        rightWing.setTextureOffset(5, 7).addBox(-1.0F, 5.0F, -1.0F, 0.0F, 1.0F, 2.0F, 0.0F, false);

        tail = new ModelRenderer(this);
        tail.setRotationPoint(0.0F, 0.75F, 5.25F);
        body.addChild(tail);
        tail.setTextureOffset(22, 17).addBox(-2.0F, -2.0F, 0.0F, 4.0F, 3.0F, 12.0F, 0.0F, false);

        tailpart1 = new ModelRenderer(this);
        tailpart1.setRotationPoint(0.0F, -1.0F, 12.0F);
        tail.addChild(tailpart1);
        tailpart1.setTextureOffset(0, 29).addBox(-1.5F, -1.0F, 0.0F, 3.0F, 2.0F, 10.0F, 0.0F, false);
        tailpart1.setTextureOffset(0, 16).addBox(-3.5F, -0.9F, 2.0F, 7.0F, 3.0F, 10.0F, 0.0F, false);

        leg1 = new ModelRenderer(this);
        leg1.setRotationPoint(2.0F, 2.75F, 4.25F);
        balaur.addChild(leg1);
        leg1.setTextureOffset(24, 16).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 7.0F, 0.0F, 0.0F, false);
        leg1.setTextureOffset(19, 0).addBox(-1.0F, 7.0F, -4.0F, 2.0F, 0.01F, 4.0F, 0.0F, false);

        claws1 = new ModelRenderer(this);
        claws1.setRotationPoint(-1.0F, 7.0F, -1.5F);
        leg1.addChild(claws1);


        cube_r1 = new ModelRenderer(this);
        cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        claws1.addChild(cube_r1);
        setRotationAngle(cube_r1, 0.0F, 0.0F, 1.5708F);
        cube_r1.setTextureOffset(6, 1).addBox(-2.0F, 0.0F, -1.5F, 2.0F, 0.0F, 1.0F, 0.0F, true);

        cube_r2 = new ModelRenderer(this);
        cube_r2.setRotationPoint(1.0F, 0.0F, 0.0F);
        claws1.addChild(cube_r2);
        setRotationAngle(cube_r2, 0.0F, 0.0F, 1.5708F);
        cube_r2.setTextureOffset(6, 2).addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, 0.0F, false);

        leg2 = new ModelRenderer(this);
        leg2.setRotationPoint(-2.0F, 2.75F, 4.25F);
        balaur.addChild(leg2);
        leg2.setTextureOffset(0, 16).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 7.0F, 0.0F, 0.0F, false);
        leg2.setTextureOffset(0, 16).addBox(-1.0F, 7.0F, -4.0F, 2.0F, 0.01F, 4.0F, 0.0F, false);

        claws2 = new ModelRenderer(this);
        claws2.setRotationPoint(1.0F, 7.0F, -1.5F);
        leg2.addChild(claws2);


        cube_r3 = new ModelRenderer(this);
        cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
        claws2.addChild(cube_r3);
        setRotationAngle(cube_r3, 0.0F, 0.0F, -1.5708F);
        cube_r3.setTextureOffset(6, 1).addBox(0.0F, 0.0F, -1.5F, 2.0F, 0.0F, 1.0F, 0.0F, false);

        cube_r4 = new ModelRenderer(this);
        cube_r4.setRotationPoint(-1.0F, 0.0F, 0.0F);
        claws2.addChild(cube_r4);
        setRotationAngle(cube_r4, 0.0F, 0.0F, -1.5708F);
        cube_r4.setTextureOffset(6, 0).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, 0.0F, false);
    }

    public void setBalaurBabyModel(){
        textureWidth = 32;
        textureHeight = 32;

        balaur = new ModelRenderer(this);
        balaur.setRotationPoint(0.0F, 19.25F, -2.25F);


        body = new ModelRenderer(this);
        body.setRotationPoint(0.0F, 1.75F, 2.25F);
        balaur.addChild(body);
        body.setTextureOffset(0, 9).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 2.0F, 4.0F, 0.0F, false);

        neck = new ModelRenderer(this);
        neck.setRotationPoint(0.0F, 0.75F, -2.25F);
        body.addChild(neck);
        neck.setTextureOffset(4, 4).addBox(-0.25F, -1.75F, -0.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        neck.setTextureOffset(0, 0).addBox(-0.25F, -2.75F, -2.75F, 1.0F, 1.0F, 3.0F, 0.0F, false);

        head = new ModelRenderer(this);
        head.setRotationPoint(0.0F, -6.0F, -6.75F);
        neck.addChild(head);


        jaw = new ModelRenderer(this);
        jaw.setRotationPoint(0.0F, 1.25F, 0.75F);
        head.addChild(jaw);


        leftWing = new ModelRenderer(this);
        leftWing.setRotationPoint(1.0F, 0.0F, -1.0F);
        body.addChild(leftWing);
        leftWing.setTextureOffset(0, 4).addBox(-0.5F, 0.0F, -0.75F, 1.0F, 2.0F, 1.0F, 0.0F, false);

        rightWing = new ModelRenderer(this);
        rightWing.setRotationPoint(-1.0F, 0.0F, -1.0F);
        body.addChild(rightWing);
        rightWing.setTextureOffset(0, 4).addBox(-0.5F, 0.0F, -0.75F, 1.0F, 2.0F, 1.0F, 0.0F, true);

        tail = new ModelRenderer(this);
        tail.setRotationPoint(0.0F, -1.0F, 2.0F);
        body.addChild(tail);
        tail.setTextureOffset(0, 0).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 8.0F, 0.0F, false);

        leg1 = new ModelRenderer(this);
        leg1.setRotationPoint(0.5F, 2.75F, 4.25F);
        balaur.addChild(leg1);
        leg1.setTextureOffset(0, 0).addBox(-0.25F, 0.0F, 0.0F, 1.0F, 2.0F, 0.0F, 0.0F, false);
        leg1.setTextureOffset(3, 0).addBox(-0.25F, 1.98F, -2.0F, 1.0F, 0.02F, 2.0F, 0.0F, false);

        leg2 = new ModelRenderer(this);
        leg2.setRotationPoint(-0.5F, 2.75F, 4.25F);
        balaur.addChild(leg2);
        leg2.setTextureOffset(0, 0).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 2.0F, 0.0F, 0.0F, true);
        leg2.setTextureOffset(3, 0).addBox(-1.0F, 1.98F, -2.0F, 1.0F, 0.02F, 2.0F, 0.0F, true);

    }
}
