package com.minecraftpog.mireamod.world.feature;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class ModPlacedFeatures {
    public static final Holder<PlacedFeature> PURPLE_CORRUPTED_PLACED = PlacementUtils.register("purple_corrupted_placed",
            ModConfiguredFeatures.PURPLE_CORRUPTED_SPAWN, VegetationPlacements.treePlacement(
                    PlacementUtils.countExtra(3, 0.1f, 2)));
    
    public static final Holder<PlacedFeature> RED_CORRUPTED_PLACED = PlacementUtils.register("red_corrupted_placed",
            ModConfiguredFeatures.RED_CORRUPTED_SPAWN, VegetationPlacements.treePlacement(
                    PlacementUtils.countExtra(3, 0.1f, 2)));
}
