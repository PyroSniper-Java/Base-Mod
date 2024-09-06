package com.pyrocoder.basemod.item;

import com.pyrocoder.basemod.BaseMod;
import com.pyrocoder.basemod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BaseMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> MOD_ITEMS_TAB = CREATIVE_MODE_TABS.register("mod_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CUSTOM_BONE.get()))
                    .title(Component.translatable("creativetab.basemod.mod_items"))
                    .displayItems((itemDisplayParameters, output) -> {

                    }).build());

    public static final RegistryObject<CreativeModeTab> MOD_BLOCKS_TAB = CREATIVE_MODE_TABS.register("mod_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.GEM_BLOCK.get()))
                    .withTabsBefore(MOD_ITEMS_TAB.getId())
                    .title(Component.translatable("creativetab.basemod.mod_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {

                    }).build());

    public static final RegistryObject<CreativeModeTab> MOD_FOODS_TAB = CREATIVE_MODE_TABS.register("mod_foods_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BONE_IN_STEAK.get()))
                    .withTabsBefore(MOD_BLOCKS_TAB.getId())
                    .title(Component.translatable("creativetab.basemod.mod_foods"))
                    .displayItems((itemDisplayParameters, output) -> {

                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
