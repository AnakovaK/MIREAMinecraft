package com.minecraftpog.mireamod.recipe;

import com.minecraftpog.mireamod.MIREAMod;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModRecipes {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, MIREAMod.MODID);

    public static final RegistryObject<RecipeSerializer<VendingMachineRecipe>> VENDING_MACHINE_SERIALIZER =
            SERIALIZERS.register("vending_machine", () -> VendingMachineRecipe.Serializer.INSTANCE);

    public static void register(IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
    }
}