package fr.mysticraft.mystimod.items;

import fr.mysticraft.mystimod.MystiMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MOD_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MystiMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> MYSTI_TAB = CREATIVE_MOD_TABS.register("mysti_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.OBSIDIAN_STICK.get()))
                    .title(Component.translatable("creativetab.mysti_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.OBSIDIAN_STICK.get());
                        pOutput.accept(ModItems.DIAMOND_NUGGET.get());
                        pOutput.accept(ModItems.ROCKET_WAND.get());

                    })
                    .build());

    public static void register(IEventBus e){
        CREATIVE_MOD_TABS.register(e);
    }
}
