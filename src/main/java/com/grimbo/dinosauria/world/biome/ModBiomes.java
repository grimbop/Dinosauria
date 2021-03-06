package com.grimbo.dinosauria.world.biome;

import com.grimbo.dinosauria.util.Registration;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.biome.*;
import net.minecraft.world.gen.feature.structure.StructureFeatures;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilders;
import net.minecraftforge.fml.RegistryObject;

import java.util.function.Supplier;

public class ModBiomes
{
    public static final RegistryObject<Biome> ARAUCARIA_PLAINS = Registration.BIOMES.register("araucaria_plains", () -> makeAraucariaPlains(() -> WorldGenRegistries.CONFIGURED_SURFACE_BUILDER.getOrThrow(ModConfiguredSurfaceBuilders.PLAIN_SURFACE), 0.08f, 0.015f));


    public static void register(){}

    //BiomeMaker

    private static Biome makeAraucariaPlains(final Supplier<ConfiguredSurfaceBuilder<?>> surfaceBuilder, float depth, float scale)
    {
        MobSpawnInfo.Builder mobspawninfo$builder = new MobSpawnInfo.Builder();

        BiomeGenerationSettings.Builder biomegenerationsettings$builder = (new BiomeGenerationSettings.Builder()).withSurfaceBuilder(ConfiguredSurfaceBuilders.field_244178_j);

        DefaultBiomeFeatures.withStrongholdAndMineshaft(biomegenerationsettings$builder);
        biomegenerationsettings$builder.withStructure(StructureFeatures.RUINED_PORTAL);
        biomegenerationsettings$builder.withStructure(StructureFeatures.VILLAGE_TAIGA);
        DefaultBiomeFeatures.withCavesAndCanyons(biomegenerationsettings$builder);
        DefaultBiomeFeatures.withLavaLakes(biomegenerationsettings$builder);
        DefaultBiomeFeatures.withMonsterRoom(biomegenerationsettings$builder);
        DefaultBiomeFeatures.withTallGrass(biomegenerationsettings$builder);
        DefaultBiomeFeatures.withNormalGrassPatch(biomegenerationsettings$builder);
        DefaultBiomeFeatures.withNoiseTallGrass(biomegenerationsettings$builder);

        DefaultBiomeFeatures.withCommonOverworldBlocks(biomegenerationsettings$builder);
        DefaultBiomeFeatures.withOverworldOres(biomegenerationsettings$builder);


        DefaultBiomeFeatures.withLavaAndWaterSprings(biomegenerationsettings$builder);
        DefaultBiomeFeatures.withLavaAndWaterSprings(biomegenerationsettings$builder);
        DefaultBiomeFeatures.withLavaAndWaterSprings(biomegenerationsettings$builder);
        DefaultBiomeFeatures.withLavaAndWaterSprings(biomegenerationsettings$builder);

        DefaultBiomeFeatures.withHostileMobs(mobspawninfo$builder, 100, 10, 100);
        mobspawninfo$builder.withSpawner(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(EntityType.PARROT, 2, 1, 1));
        mobspawninfo$builder.withSpawner(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(EntityType.SHEEP, 3, 2, 4));
        mobspawninfo$builder.withSpawner(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(EntityType.COW, 4, 2, 4));
        mobspawninfo$builder.withSpawner(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(EntityType.LLAMA ,3, 2, 4));
        mobspawninfo$builder.withSpawner(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(EntityType.PIG, 4, 2, 3));


        return (new Biome.Builder()).precipitation(Biome.RainType.RAIN).category(Biome.Category.SWAMP).depth(depth).scale(scale).
                temperature(0.3F).downfall(0.5F).
                setEffects((new BiomeAmbience.Builder()).
                setWaterColor(4159204).setWaterFogColor(329011).setFogColor(12638463).withGrassColor(6658365).
                withSkyColor(getSkyColorWithTemperatureModifier(0.4F)).
                setMoodSound(MoodSoundAmbience.DEFAULT_CAVE).build()).
                withMobSpawnSettings(mobspawninfo$builder.copy()).
                withGenerationSettings(biomegenerationsettings$builder.build()).build();

    }


    private static int getSkyColorWithTemperatureModifier(float temperature) {
        float lvt_1_1_ = temperature / 3.0F;
        lvt_1_1_ = MathHelper.clamp(lvt_1_1_, -1.0F, 1.0F);
        return MathHelper.hsvToRGB(0.62222224F - lvt_1_1_ * 0.05F, 0.5F + lvt_1_1_ * 0.1F, 1.0F);
    }
















}

