package com.minecraftpog.mireamod.world.feature;

import com.minecraftpog.mireamod.block.ModBlocks;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.TreeFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.WeightedPlacedFeature;
import net.minecraft.world.level.levelgen.feature.configurations.RandomFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.FancyTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.ForkingTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.GiantTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

import java.util.List;

public class ModConfiguredFeatures {
    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> PURPLE_CORRUPTED_TREE =
            FeatureUtils.register("purple_corrupted", Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                    BlockStateProvider.simple(ModBlocks.PURPLE_CORRUPTED_LOG.get()),
                    new FancyTrunkPlacer(5, 6, 3),
                    BlockStateProvider.simple(ModBlocks.PURPLE_CORRUPTED_LEAVES.get()),
                    new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 4),
                    new TwoLayersFeatureSize(1, 0, 2)).build());

    public static final Holder<PlacedFeature> PURPLE_CORRUPTED_CHECKED = PlacementUtils.register("purple_corrupted_checked", PURPLE_CORRUPTED_TREE,
                    PlacementUtils.filteredByBlockSurvival(ModBlocks.PURPLE_CORRUPTED_SAPLING.get()));

    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> PURPLE_CORRUPTED_SPAWN =
            FeatureUtils.register("purple_corrupted_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(PURPLE_CORRUPTED_CHECKED,
                            0.5F)), PURPLE_CORRUPTED_CHECKED));

    
    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> RED_CORRUPTED_TREE =
            FeatureUtils.register("red_corrupted", Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                    BlockStateProvider.simple(ModBlocks.RED_CORRUPTED_LOG.get()),
                    new FancyTrunkPlacer(5, 6, 3),
                    BlockStateProvider.simple(ModBlocks.PURPLE_CORRUPTED_LEAVES.get()),
                    new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 4),
                    new TwoLayersFeatureSize(1, 0, 2)).build());

    public static final Holder<PlacedFeature> RED_CORRUPTED_CHECKED = PlacementUtils.register("red_corrupted_checked", RED_CORRUPTED_TREE,
                    PlacementUtils.filteredByBlockSurvival(ModBlocks.RED_CORRUPTED_SAPLING.get()));

    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> RED_CORRUPTED_SPAWN =
            FeatureUtils.register("red_corrupted_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(RED_CORRUPTED_CHECKED,
                            0.5F)), RED_CORRUPTED_CHECKED));

}