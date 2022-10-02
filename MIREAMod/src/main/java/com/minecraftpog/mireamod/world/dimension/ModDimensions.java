package com.minecraftpog.mireamod.world.dimension;

import com.minecraftpog.mireamod.MIREAMod;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.dimension.DimensionType;

public class ModDimensions {
	public static final ResourceKey<Level> MIREADIM_KEY = ResourceKey.create(Registry.DIMENSION_REGISTRY, 
			new ResourceLocation(MIREAMod.MODID, "mireadim"));
	public static final ResourceKey<DimensionType> MIREADIM_TYPE = 
			ResourceKey.create(Registry.DIMENSION_TYPE_REGISTRY, MIREADIM_KEY.getRegistryName());
	
	public static void register() {
		System.out.println("Registering Mod Dim" + MIREAMod.MODID);
	}
}
