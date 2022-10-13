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
		bus.addListener(this::setup);
		bus.addListener(this::clientSetup);
		
		ModDimensions.register();
	}
	
	private void clientSetup(final FMLClientSetupEvent event) {
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.MIREA_PORTAL.get(), RenderType.translucent());
        
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PURPLE_CORRUPTED_LEAVES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PURPLE_CORRUPTED_SAPLING.get(), RenderType.cutout());
    }
	  private void setup(final FMLCommonSetupEvent event) {        
	        //some preinit code
	  }
	
}
