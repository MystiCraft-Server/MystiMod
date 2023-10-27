package fr.mysticraft.mystimod.item;

import fr.mysticraft.mystimod.MystiMod;
import fr.mysticraft.mystimod.entity.ModEntities;
import fr.mysticraft.mystimod.item.customItems.ModFood;
import fr.mysticraft.mystimod.item.customItems.RocketWandItem;
import net.minecraft.world.item.*;
import net.minecraftforge.common.ForgeSpawnEggItem;
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

    public static final RegistryObject<Item> RHINO_THING = ITEMS.register("rhino_thing",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RHINO_SPAWN_EGG = ITEMS.register("rhino_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.RHINO, 0x7e9680, 0xc5d1c5, new Item.Properties()));


    public static final RegistryObject<Item> MYSTIQUARTZ = ITEMS.register("mystiquartz",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DIAMOND_APPLE = ITEMS.register("diamond_apple",
            () -> new Item(new Item.Properties().food(ModFood.DIAMOND_APPLE)));

    public static final RegistryObject<Item> MYSTIQUARTZ_SWORD = ITEMS.register("mystiquartz_sword",
            () -> new SwordItem(ModToolTiers.MYSTIQUARTZ, 4, 2,
                    new Item.Properties()));

    public static final RegistryObject<Item> MYSTIQUARTZ_PICKAXE = ITEMS.register("mystiquartz_pickaxe",
            () -> new PickaxeItem(ModToolTiers.MYSTIQUARTZ, 4, 2,
                    new Item.Properties()));

    public static final RegistryObject<Item> MYSTIQUARTZ_HELMET = ITEMS.register("mystiquartz_helmet",
            () -> new ArmorItem(ModArmorMaterials.MYSTIQUARTZ, ArmorItem.Type.HELMET,
                    new Item.Properties()));
    public static final RegistryObject<Item> MYSTIQUARTZ_CHESTPLATE = ITEMS.register("mystiquartz_chestplate",
            () -> new ArmorItem(ModArmorMaterials.MYSTIQUARTZ, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties()));
    public static final RegistryObject<Item> MYSTIQUARTZ_LEGGINGS = ITEMS.register("mystiquartz_leggings",
            () -> new ArmorItem(ModArmorMaterials.MYSTIQUARTZ, ArmorItem.Type.LEGGINGS,
                    new Item.Properties()));
    public static final RegistryObject<Item> MYSTIQUARTZ_BOOTS = ITEMS.register("mystiquartz_boots",
            () -> new ArmorItem(ModArmorMaterials.MYSTIQUARTZ, ArmorItem.Type.BOOTS,
                    new Item.Properties()));

    public static final RegistryObject<Item> ROCKET_WAND = ITEMS.register("rocket_wand",
            () -> new RocketWandItem(new Item.Properties().defaultDurability(5)));

    public static void register(IEventBus e){
        ITEMS.register(e);

    }

}
