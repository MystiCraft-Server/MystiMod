package fr.mysticraft.mystimod.datagen.loot;

import fr.mysticraft.mystimod.block.ModBlocks;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {

    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.MYSTIQUARTZ_BLOCK.get());
        this.dropSelf(ModBlocks.MYSTIQUARTZ_ORE.get());
        this.dropSelf(ModBlocks.RHINO_REINFORCED_OBSIDIAN.get());
        this.dropSelf(ModBlocks.GREENSCREEN_BLOCK.get());



    }
    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }

}