package com.grimbo.dinosauria.entity;

import com.grimbo.dinosauria.Dinosauria;
import com.grimbo.dinosauria.util.Registration;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEntityTypes {

    public static DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, Dinosauria.MOD_ID);


    public static final RegistryObject<EntityType<BalaurEntity>> BALAUR = Registration.ENTITIES.register("balaur",
            () -> EntityType.Builder.create(BalaurEntity::new , EntityClassification.CREATURE)
    .size(1f, 1f)
    .build(new ResourceLocation(Dinosauria.MOD_ID + "balaur").toString()));


    public static final RegistryObject<EntityType<DilophosaurusEntity>> DILOPHOSAURUS = Registration.ENTITIES.register("dilophosaurus",
            () -> EntityType.Builder.create(DilophosaurusEntity::new , EntityClassification.CREATURE)
                    .size(1.5f, 2f)
                    .build(new ResourceLocation(Dinosauria.MOD_ID + "dilophosaurus").toString()));

    public static final RegistryObject<EntityType<IrritatorEntity>> IRRITATOR = Registration.ENTITIES.register("irritator",
            () -> EntityType.Builder.create(IrritatorEntity::new , EntityClassification.MONSTER)
                    .size(2f, 2f)
                    .build(new ResourceLocation(Dinosauria.MOD_ID + "irritator").toString()));

    public static final RegistryObject<EntityType<MonolophosaurusEntity>> MONOLOPHOSAURUS = Registration.ENTITIES.register("monolophosaurus",
    () -> EntityType.Builder.create(MonolophosaurusEntity::new , EntityClassification.MONSTER)
    .size(2.5F, 3F)
    .build(new ResourceLocation(Dinosauria.MOD_ID + "monolophosaurus").toString()));



    public static void register() {
    }

    //:;

}
