package com.minecraftpog.mireamod.world.feature.tree;

import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.core.Holder;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import org.jetbrains.annotations.Nullable;

import com.minecraftpog.mireamod.world.feature.ModConfiguredFeatures;

import java.util.Random;

public class PurpleCorruptedTreeGrower extends AbstractTreeGrower {
    @Nullable
    @Override
    protected Holder<? extends ConfiguredFeature<?, ?>> getConfiguredFeature(Random p_204307_, boolean p_204308_) {
        return ModConfiguredFeatures.PURPLE_CORRUPTED_TREE;
    }
}
