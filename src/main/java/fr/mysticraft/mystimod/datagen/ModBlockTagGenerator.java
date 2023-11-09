package fr.mysticraft.mystimod.datagen;

import fr.mysticraft.mystimod.MystiMod;
import fr.mysticraft.mystimod.block.ModBlocks;
import fr.mysticraft.mystimod.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, MystiMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(BlockTags.NEEDS_DIAMOND_TOOL).add(ModBlocks.MYSTIQUARTZ_BLOCK.get(), ModBlocks.MYSTIQUARTZ_ORE.get());
        this.tag(BlockTags.NEEDS_DIAMOND_TOOL).add(ModBlocks.RHINO_REINFORCED_OBSIDIAN.get());
        this.tag(BlockTags.NEEDS_DIAMOND_TOOL).add(ModBlocks.GREENSCREEN_BLOCK.get());


        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(ModBlocks.MYSTIQUARTZ_BLOCK.get(), ModBlocks.MYSTIQUARTZ_ORE.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(ModBlocks.RHINO_REINFORCED_OBSIDIAN.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(ModBlocks.GREENSCREEN_BLOCK.get());


    }
}
