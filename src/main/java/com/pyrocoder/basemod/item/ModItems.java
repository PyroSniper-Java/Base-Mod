package com.pyrocoder.basemod.item;

import com.pyrocoder.basemod.BaseMod;
import com.pyrocoder.basemod.item.custom.FuelItem;
import com.pyrocoder.basemod.item.custom.WandItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
        DeferredRegister.create(ForgeRegistries.ITEMS, BaseMod.MOD_ID);

    //Normal Items (Don't Do Anything)
    public static final RegistryObject<Item> GEM = ITEMS.register("gem",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CUSTOM_BONE = ITEMS.register("custom_bone",
            () -> new Item(new Item.Properties()));

    //Custom Advanced Item
    public static final RegistryObject<Item> WAND = ITEMS.register("wand",
            () -> new WandItem(new Item.Properties().durability(32)));

    //Food Items
    public static final RegistryObject<Item> BONE_IN_STEAK = ITEMS.register("bone_in_steak",
            () -> new Item(new Item.Properties().food(ModFoodProperties.BONE_IN_STEAK)));

    //Fuel Items
    public static final RegistryObject<Item> BONE_MARROW = ITEMS.register("bone_marrow",
            () -> new FuelItem(new Item.Properties(), 1200));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
