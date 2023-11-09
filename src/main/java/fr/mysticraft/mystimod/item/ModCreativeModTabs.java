package fr.mysticraft.mystimod.item;

import fr.mysticraft.mystimod.MystiMod;
import fr.mysticraft.mystimod.block.ModBlocks;
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
                        pOutput.accept(ModItems.MYSTIQUARTZ.get());
                        pOutput.accept(ModItems.DIAMOND_APPLE.get());
                        pOutput.accept(ModItems.RHINO_SPAWN_EGG.get());
                        pOutput.accept(ModItems.RHINO_THING.get());
                        pOutput.accept(ModItems.NINJA_STICK.get());


                        pOutput.accept(ModItems.MYSTIQUARTZ_SWORD.get());
                        pOutput.accept(ModItems.MYSTIQUARTZ_PICKAXE.get());


                        pOutput.accept(ModItems.MYSTIQUARTZ_HELMET.get());
                        pOutput.accept(ModItems.MYSTIQUARTZ_CHESTPLATE.get());
                        pOutput.accept(ModItems.MYSTIQUARTZ_LEGGINGS.get());
                        pOutput.accept(ModItems.MYSTIQUARTZ_BOOTS.get());


                        pOutput.accept(ModBlocks.MYSTIQUARTZ_ORE.get());
                        pOutput.accept(ModBlocks.MYSTIQUARTZ_BLOCK.get());
                        pOutput.accept(ModBlocks.RHINO_REINFORCED_OBSIDIAN.get());
                        pOutput.accept(ModBlocks.GREENSCREEN_BLOCK.get());


                    })
                    .build());

    public static void register(IEventBus e){
        CREATIVE_MOD_TABS.register(e);
    }
}
