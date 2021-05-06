package com.grimbo.dinosauria.entity;

import com.grimbo.dinosauria.Dinosauria;
import com.grimbo.dinosauria.entity.projectileItemEntity.BalaurEggEntity;
import com.grimbo.dinosauria.util.Registration;
import net.minecraft.client.resources.data.AnimationFrame;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.projectile.EggEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.IWorld;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import software.bernie.geckolib3.core.builder.AnimationBuilder;

import java.lang.reflect.Field;


public class ModEntityTypes {

    public static DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITIES, Dinosauria.MOD_ID);


    public static final RegistryObject<EntityType<BalaurEggEntity>> BALAUR_EGG = Registration.ENTITIES.register("balaur_egg",
            () -> EntityType.Builder.<BalaurEggEntity>create(BalaurEggEntity::new, EntityClassification.MISC)
                    .size(0.25f, 0.25f).trackingRange(4).func_233608_b_(10)
                    .build(new ResourceLocation(Dinosauria.MOD_ID + "balaur_egg").toString()));

    public static final RegistryObject<EntityType<BalaurEntity>> BALAUR = Registration.ENTITIES.register("balaur",
            () -> EntityType.Builder.create(BalaurEntity::new , EntityClassification.CREATURE)
    .size(1f, 0.8f)
    .build(new ResourceLocation(Dinosauria.MOD_ID + "balaur").toString()));



    public static final RegistryObject<EntityType<DilophosaurusEntity>> DILOPHOSAURUS = Registration.ENTITIES.register("dilophosaurus",
            () -> EntityType.Builder.create(DilophosaurusEntity::new , EntityClassification.CREATURE)
                    .size(1.5f, 2f)
                    .build(new ResourceLocation(Dinosauria.MOD_ID + "dilophosaurus").toString()));


    public static final RegistryObject<EntityType<IrritatorEntity>> IRRITATOR = Registration.ENTITIES.register("irritator",
            () -> EntityType.Builder.create(IrritatorEntity::new , EntityClassification.MONSTER)
                    .size(2.5f, 2f)
                    .build(new ResourceLocation(Dinosauria.MOD_ID + "irritator").toString()));


    public static final RegistryObject<EntityType<MonolophosaurusEntity>> MONOLOPHOSAURUS = Registration.ENTITIES.register("monolophosaurus",
    () -> EntityType.Builder.create(MonolophosaurusEntity::new , EntityClassification.MONSTER)
    .size(2.5F, 1.5F)
    .build(new ResourceLocation(Dinosauria.MOD_ID + "monolophosaurus").toString()));


    public static final RegistryObject<EntityType<DryosaurusEntity>> DRYOSAURUS = Registration.ENTITIES.register("dryosaurus",
            () -> EntityType.Builder.create(DryosaurusEntity::new , EntityClassification.MONSTER)
                    .size(1.35F, 1.5F)
                    .build(new ResourceLocation(Dinosauria.MOD_ID + "dryosaurus").toString()));


    public static final RegistryObject<EntityType<PlatykottaEntity>> PLATYKOTTA = Registration.ENTITIES.register("platykotta",
            () -> EntityType.Builder.create(PlatykottaEntity::new , EntityClassification.WATER_AMBIENT)
                    .size(0.35F, 0.35F)
                    .build(new ResourceLocation(Dinosauria.MOD_ID + "platykotta").toString()));


    public static void register() {
    }


}
