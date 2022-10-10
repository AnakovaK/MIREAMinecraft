package com.minecraftpog.mireamod.item;

import com.minecraftpog.mireamod.MIREAMod;
import com.minecraftpog.mireamod.item.custom.CatalystItem;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MIREAMod.MODID);

    public static final RegistryObject<Item> CITRINE = ITEMS.register("citrine",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    
    public static final RegistryObject<Item> EXAMPLE_ITEM = ITEMS.register("example_item", CatalystItem::new);
    
    public static final RegistryObject<Item> CITRINE_STAFF = ITEMS.register("citrine_staff", CatalystItem::new);


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}