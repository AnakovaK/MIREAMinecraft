package com.minecraftpog.mireamod;

import com.minecraftpog.mireamod.core.init.ItemInit;
import com.minecraftpog.mireamod.world.dimension.ModDimensions;
import com.minecraftpog.mireamod.world.structure.ModStructures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(MIREAMod.MODID)
public class MIREAMod {
	public static final String MODID = "mireamod";

	
	public MIREAMod() {
		var bus = FMLJavaModLoadingContext.get().getModEventBus();
		
		ItemInit.ITEMS.register(bus);
		ModStructures.register(bus);
		
		ModDimensions.register();
	}
}
