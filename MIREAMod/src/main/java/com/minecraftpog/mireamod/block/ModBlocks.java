package com.minecraftpog.mireamod.block;



import com.minecraftpog.mireamod.MIREAMod;
import com.minecraftpog.mireamod.block.custom.*;
import com.minecraftpog.mireamod.item.ModCreativeModeTab;
import com.minecraftpog.mireamod.item.ModItems;
import com.minecraftpog.mireamod.world.feature.tree.PurpleCorruptedTreeGrower;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.*;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, MIREAMod.MODID);

    public static final RegistryObject<Block> CITRINE_BLOCK = registerBlock("citrine_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_MISC);


    public static final RegistryObject<Block> MIREA_PORTAL = registerBlockWithoutBlockItem("mirea_portal",
                MireaPortalBlock::new);

    public static final RegistryObject<Block> PURPLE_CORRUPTED_LEAVES = registerBlock("purple_corrupted_leaves",
    		()-> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
    			
    			@Override 
    			public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
    				return true;
    			}
    			
    			@Override 
    			public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
    				return 60;
    			}
    			
    			@Override 
    			public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
    				return 20;
    			}
    			
    		}, CreativeModeTab.TAB_DECORATIONS);
    
    public static final RegistryObject<Block> PURPLE_CORRUPTED_LOG = registerBlock("purple_corrupted_log",
    		()-> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)),
    		CreativeModeTab.TAB_DECORATIONS);
    
    public static final RegistryObject<Block> RED_CORRUPTED_LOG = registerBlock("red_corrupted_log",
    		()-> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)),
    		CreativeModeTab.TAB_DECORATIONS);
    
    public static final RegistryObject<Block> STRIPPED_PURPLE_CORRUPTED_LOG = registerBlock("stripped_purple_corrupted_log",
    		()-> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)),
    		CreativeModeTab.TAB_DECORATIONS);
    
    public static final RegistryObject<Block> PURPLE_CORRUPTED_PLANKS = registerBlock("purple_corrupted_planks",
    		()-> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
    			
    			@Override 
    			public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
    				return true;
    			}
    			
    			@Override 
    			public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
    				return 60;
    			}
    			
    			@Override 
    			public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
    				return 20;
    			}
    			
    		}, CreativeModeTab.TAB_DECORATIONS);
    
    public static final RegistryObject<Block> PURPLE_CORRUPTED_SAPLING = registerBlock("purple_corrupted_sapling",
    		()-> new SaplingBlock(new PurpleCorruptedTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)),
    		ModCreativeModeTab.TUTORIAL_TAB);
    
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
    private static <T extends Block> RegistryObject<T> registerBlockWithoutBlockItem(String name, Supplier<T> block) {
        return BLOCKS.register(name, block);
    }
}