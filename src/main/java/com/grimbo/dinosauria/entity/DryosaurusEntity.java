package com.grimbo.dinosauria.entity;

import net.minecraft.block.BlockState;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.RabbitEntity;
import net.minecraft.entity.passive.WolfEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.Util;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.IServerWorld;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.server.ServerWorld;

import javax.annotation.Nullable;

public class DryosaurusEntity extends AnimalEntity {
    public String dryosaurusTexture = "textures/entity/dryosaurus_adult.png";
    public int timeToAdult = 24000;
    public int youngGrowningAge = 0;

    protected DryosaurusEntity(EntityType<? extends AnimalEntity> type, World worldIn) {
        super(type, worldIn);
    }

    public static AttributeModifierMap.MutableAttribute setCustomAttributes()
    {
        return MobEntity.func_233666_p_().
                createMutableAttribute(Attributes.MAX_HEALTH, 15)
                .createMutableAttribute(Attributes.MOVEMENT_SPEED, 0.3D);


    }

    @Override
    public boolean isChild() {
        return youngGrowningAge < 0;
    }

    public boolean isYoung(){
        return youngGrowningAge < timeToAdult && !isChild();
    }

    public boolean isAdult(){
        return !isChild() && !isYoung();
    }

    public String setTextureByAge(String babyTexture, String youngTexture, String adultTexture){

        if(isChild()){
            return babyTexture;
        }else if(isYoung() && !isChild()){
            return youngTexture;
        }else if(isAdult()){
            return adultTexture;
        }else{
            return adultTexture;
        }

    }
    
    @Override
    public void livingTick() {
        super.livingTick();
        if(!isAdult()){
            youngGrowningAge++;
        }

        dryosaurusTexture = setTextureByAge("textures/entity/dryosaurus_baby.png","textures/entity/dryosaurus_young.png","textures/entity/dryosaurus_adult.png");
    }


    //==SOUNDS==\\

    @Nullable
    @Override
    protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
        return SoundEvents.ENTITY_OCELOT_HURT;
    }

    @Nullable
    @Override
    protected SoundEvent getDeathSound() {
        return SoundEvents.ENTITY_OCELOT_DEATH;
    }

    @Nullable
    @Override
    protected SoundEvent getAmbientSound() {
        return SoundEvents.ENTITY_OCELOT_AMBIENT;
    }

    @Override
    protected void playStepSound(BlockPos pos, BlockState blockIn) {
        this.playSound(SoundEvents.ENTITY_COW_STEP, 1, 1);
    }


    //==GOALS==\\

    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(0, new SwimGoal(this));
        this.goalSelector.addGoal(1, new PanicGoal(this, 0.7D));
        this.goalSelector.addGoal(2, new BreedGoal(this, 0.5D));
        this.goalSelector.addGoal(3, new FollowParentGoal(this, 0.5D));
        this.goalSelector.addGoal(4, new WaterAvoidingRandomWalkingGoal(this, 0.5D));
        this.goalSelector.addGoal(5, new LookAtGoal(this, PlayerEntity.class, 3.0F));
        this.goalSelector.addGoal(6, new LookRandomlyGoal(this));
    }


    @Nullable
    @Override
    public AgeableEntity func_241840_a(ServerWorld p_241840_1_, AgeableEntity p_241840_2_) {
        return ModEntityTypes.DRYOSAURUS.get().create(this.world);
    }


}
