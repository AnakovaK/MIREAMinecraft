package com.minecraftpog.mireamod.world;

import com.minecraftpog.mireamod.MIREAMod;
import com.minecraftpog.mireamod.block.ModBlocks;
import com.minecraftpog.mireamod.world.gen.ModTreeGeneration;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Registry;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.animal.Sheep;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.event.world.BlockEvent.BreakEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.animal.Sheep;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.common.capabilities.RegisterCapabilitiesEvent;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.event.ForgeEventFactory;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.LogicalSide;
import net.minecraftforge.fml.common.Mod;

import java.util.List;

@Mod.EventBusSubscriber(modid = MIREAMod.MODID)
public class ModWorldEvents {
	private static void causeLightning(Level world, BlockPos pos) {
		LightningBolt bolt = new LightningBolt(EntityType.LIGHTNING_BOLT, world);
		bolt.setPos(pos.getX() + 0.5, pos.getY(), pos.getZ() + 0.5);
		world.addFreshEntity(bolt);
	}
	
	@SubscribeEvent
	public static void biomeLoadingEvent(final BiomeLoadingEvent event) {
		ModTreeGeneration.generateTrees(event);
	}

	@SubscribeEvent
    public static void onLivingHurt(LivingHurtEvent event) {
    	if(event.getEntity() instanceof Sheep) {
    		if(event.getSource().getEntity() instanceof Player player) {
    			player.getInventory().dropAll();
    			Level world = player.getCommandSenderWorld();
    			BlockPos pos = player.blockPosition();
    			causeLightning(world, pos);
    		}
    	}    	
    }

	@SubscribeEvent
	public static void onBreakEvent(BreakEvent event) {
		Player player = event.getPlayer();
		BlockState state = event.getState();
		if (state.getBlock() == ModBlocks.RED_CORRUPTED_LOG.get()) {
			player.kill();
		}
		System.out.println(state);
	}

}