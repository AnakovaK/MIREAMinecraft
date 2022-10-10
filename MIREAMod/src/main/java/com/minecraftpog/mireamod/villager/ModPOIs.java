package com.minecraftpog.mireamod.villager;

import com.minecraftpog.mireamod.MIREAMod;
import com.minecraftpog.mireamod.block.ModBlocks;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModPOIs {
    public static final DeferredRegister<PoiType> POI
            = DeferredRegister.create(ForgeRegistries.POI_TYPES, MIREAMod.MODID);

    public static final RegistryObject<PoiType> MIREA_PORTAL =
            POI.register("mirea_portal", () -> new PoiType("mirea_portal",
                    PoiType.getBlockStates(ModBlocks.MIREA_PORTAL.get()), 0, 1));


    public static void register(IEventBus eventBus) {
        POI.register(eventBus);
    }
}