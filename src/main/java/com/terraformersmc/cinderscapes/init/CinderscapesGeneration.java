package com.terraformersmc.cinderscapes.init;

import net.fabricmc.fabric.api.biomes.v1.NetherBiomes;

public class CinderscapesGeneration {
    @SuppressWarnings("deprecation")
    public static void init() {
        NetherBiomes.addNetherBiome(CinderscapesBiomes.QUARTZ_CANYON);
        NetherBiomes.addNetherBiome(CinderscapesBiomes.LUMINOUS_GROVE);
    }
}