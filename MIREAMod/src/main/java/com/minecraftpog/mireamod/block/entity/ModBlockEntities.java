package com.minecraftpog.mireamod.block.entity;

import com.minecraftpog.mireamod.MIREAMod;
import com.minecraftpog.mireamod.block.ModBlocks;
import com.minecraftpog.mireamod.block.entity.custom.VendingMachineBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, MIREAMod.MODID);

    public static final RegistryObject<BlockEntityType<VendingMachineBlockEntity>> VENDING_MACHINE_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("vending_machine_block_entity", () ->
                    BlockEntityType.Builder.of(VendingMachineBlockEntity::new,
                            ModBlocks.VENDING_MACHINE_BLOCK.get()).build(null));


    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}