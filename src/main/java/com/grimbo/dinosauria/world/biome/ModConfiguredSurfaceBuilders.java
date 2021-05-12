package com.grimbo.dinosauria.world.biome;

import com.grimbo.dinosauria.Dinosauria;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilder;

public class ModConfiguredSurfaceBuilders
{
    public static RegistryKey<ConfiguredSurfaceBuilder<?>> PLAIN_SURFACE =
            RegistryKey.getOrCreateKey(Registry.CONFIGURED_SURFACE_BUILDER_KEY,
                    new ResourceLocation(Dinosauria.MOD_ID, "plain_surface"));


}
