package com.minecraftpog.mireamod;

import com.minecraftpog.mireamod.block.ModBlocks;
import com.minecraftpog.mireamod.item.ModItems;
import com.minecraftpog.mireamod.world.dimension.ModDimensions;
import com.minecraftpog.mireamod.world.structure.ModStructures;

import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(MIREAMod.MODID)
public class MIREAMod {
	public static final String MODID = "mireamod";

	
	public MIREAMod() {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		
		ModItems.register(bus);
		ModStructures.register(bus);
		ModBlocks.register(bus);
		ModDimensions.register();
	}
	private void clientSetup(final FMLClientSetupEvent event) {

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.MIREA_PORTAL.get(), RenderType.translucent());
    }
	  private void setup(final FMLCommonSetupEvent event) {
	        
	        
	    }
	
}
