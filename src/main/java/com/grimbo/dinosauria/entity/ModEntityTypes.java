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
            () -> EntityType.Builder.create(BalaurEntity::new , EntityClassification.MONSTER)
    .size(1f, 1f)
    .build(new ResourceLocation(Dinosauria.MOD_ID + "balaur").toString()));



    public static void register() {
    }

    //:;

}
