package com.minecraftpog.mireamod.core.init;

import com.minecraftpog.mireamod.MIREAMod;
import com.minecraftpog.mireamod.common.item.ModFoods;
import com.minecraftpog.mireamod.common.item.ZachetkaItem;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class ItemInit {
	private ItemInit() {}
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MIREAMod.MODID);
	
	public static final RegistryObject<Item> EXAMPLE_ITEM = ITEMS.register("example_item",
			() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).fireResistant()));
	
	public static final RegistryObject<ZachetkaItem> ZACHETKA = ITEMS.register("zachetka",
			() -> new ZachetkaItem(new Item.Properties().tab(CreativeModeTab.TAB_MISC).durability(100)));
	
	public static final RegistryObject<Item> BEER = ITEMS.register("beer",
			() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).food(ModFoods.BEER)));
	
	public static final RegistryObject<Item> SHAWA = ITEMS.register("shawa",
			() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).food(ModFoods.SHAWA)));
	
	public static final RegistryObject<Item> SIGA = ITEMS.register("siga",
			() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).food(ModFoods.SIGA)));
	
	public static final RegistryObject<Item> ENERGOS = ITEMS.register("energos",
			() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).food(ModFoods.ENERGOS)));

}
