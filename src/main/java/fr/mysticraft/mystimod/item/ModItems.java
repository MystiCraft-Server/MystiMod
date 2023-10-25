package fr.mysticraft.mystimod.item;

import fr.mysticraft.mystimod.MystiMod;
import fr.mysticraft.mystimod.item.customItems.RocketWandItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MystiMod.MOD_ID);

    public static final RegistryObject<Item> OBSIDIAN_STICK = ITEMS.register("obsidian_stick",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DIAMOND_NUGGET = ITEMS.register("diamond_nugget",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> MYSTIQUARTZ = ITEMS.register("mystiquartz",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ROCKET_WAND = ITEMS.register("rocket_wand",
            () -> new RocketWandItem(new Item.Properties().defaultDurability(5)));

    public static void register(IEventBus e){
        ITEMS.register(e);

    }

}
