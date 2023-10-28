package fr.mysticraft.mystimod.datagen;

import fr.mysticraft.mystimod.block.ModBlocks;
import fr.mysticraft.mystimod.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class ModRecipieProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipieProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.MYSTIQUARTZ_BLOCK.get())
                .pattern("MMM")
                .pattern("MMM")
                .pattern("MMM")
                .define('M', ModItems.MYSTIQUARTZ.get())
                .unlockedBy(getHasName(ModItems.MYSTIQUARTZ.get()), has(ModItems.MYSTIQUARTZ.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DIAMOND_APPLE.get())
                .pattern("MMM")
                .pattern("DAD")
                .pattern("MMM")
                .define('M', ModItems.DIAMOND_NUGGET.get())
                .define('D', Items.DIAMOND)
                .define('A', Items.GOLDEN_APPLE)
                .unlockedBy(getHasName(ModItems.DIAMOND_NUGGET.get()), has(ModItems.DIAMOND_NUGGET.get()))
                .unlockedBy(getHasName(Items.DIAMOND), has(Items.DIAMOND))
                .unlockedBy(getHasName(Items.GOLDEN_APPLE), has(Items.GOLDEN_APPLE))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.OBSIDIAN_STICK.get())
                .pattern("   ")
                .pattern(" M ")
                .pattern(" M ")
                .define('M', Blocks.OBSIDIAN)
                .unlockedBy(getHasName(Items.OBSIDIAN), has(Items.OBSIDIAN))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ROCKET_WAND.get())
                .pattern("PDP")
                .pattern(" S ")
                .pattern(" S ")
                .define('P', Items.FEATHER)
                .define('D', Items.DIAMOND)
                .define('S', ModItems.OBSIDIAN_STICK.get())
                .unlockedBy(getHasName(ModItems.OBSIDIAN_STICK.get()), has(ModItems.OBSIDIAN_STICK.get()))
                .unlockedBy(getHasName(Items.DIAMOND), has(Items.DIAMOND))
                .unlockedBy(getHasName(Items.FEATHER), has(Items.FEATHER))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.NINJA_STICK.get())
                .pattern(" P ")
                .pattern(" S ")
                .pattern(" S ")
                .define('P', Items.FERMENTED_SPIDER_EYE)
                .define('S', ModItems.OBSIDIAN_STICK.get())
                .unlockedBy(getHasName(ModItems.OBSIDIAN_STICK.get()), has(ModItems.OBSIDIAN_STICK.get()))
                .unlockedBy(getHasName(Items.FERMENTED_SPIDER_EYE), has(Items.FERMENTED_SPIDER_EYE))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RHINO_REINFORCED_OBSIDIAN.get())
                .pattern("RRR")
                .pattern("ROR")
                .pattern("RRR")
                .define('R', ModItems.RHINO_THING.get())
                .define('O', Items.OBSIDIAN)
                .unlockedBy(getHasName(ModItems.RHINO_THING.get()), has(ModItems.RHINO_THING.get()))
                .unlockedBy(getHasName(Items.OBSIDIAN), has(Items.OBSIDIAN))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MYSTIQUARTZ_SWORD.get())
                .pattern(" M ")
                .pattern(" M ")
                .pattern(" S ")
                .define('M', ModItems.MYSTIQUARTZ.get())
                .define('S', ModItems.OBSIDIAN_STICK.get())
                .unlockedBy(getHasName(ModItems.OBSIDIAN_STICK.get()), has(ModItems.OBSIDIAN_STICK.get()))
                .unlockedBy(getHasName(ModItems.MYSTIQUARTZ.get()), has(ModItems.MYSTIQUARTZ.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MYSTIQUARTZ_PICKAXE.get())
                .pattern("MMM")
                .pattern(" S ")
                .pattern(" S ")
                .define('M', ModItems.MYSTIQUARTZ.get())
                .define('S', ModItems.OBSIDIAN_STICK.get())
                .unlockedBy(getHasName(ModItems.OBSIDIAN_STICK.get()), has(ModItems.OBSIDIAN_STICK.get()))
                .unlockedBy(getHasName(ModItems.MYSTIQUARTZ.get()), has(ModItems.MYSTIQUARTZ.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MYSTIQUARTZ_HELMET.get())
                .pattern("MMM")
                .pattern("M M")
                .pattern("   ")
                .define('M', ModItems.MYSTIQUARTZ.get())
                .unlockedBy(getHasName(ModItems.MYSTIQUARTZ.get()), has(ModItems.MYSTIQUARTZ.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MYSTIQUARTZ_CHESTPLATE.get())
                .pattern("M M")
                .pattern("MMM")
                .pattern("MMM")
                .define('M', ModItems.MYSTIQUARTZ.get())
                .unlockedBy(getHasName(ModItems.MYSTIQUARTZ.get()), has(ModItems.MYSTIQUARTZ.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MYSTIQUARTZ_LEGGINGS.get())
                .pattern("MMM")
                .pattern("M M")
                .pattern("M M")
                .define('M', ModItems.MYSTIQUARTZ.get())
                .unlockedBy(getHasName(ModItems.MYSTIQUARTZ.get()), has(ModItems.MYSTIQUARTZ.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MYSTIQUARTZ_BOOTS.get())
                .pattern("   ")
                .pattern("M M")
                .pattern("M M")
                .define('M', ModItems.MYSTIQUARTZ.get())
                .unlockedBy(getHasName(ModItems.MYSTIQUARTZ.get()), has(ModItems.MYSTIQUARTZ.get()))
                .save(pWriter);




        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.MYSTIQUARTZ.get(), 9)
                .requires(ModBlocks.MYSTIQUARTZ_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.MYSTIQUARTZ_BLOCK.get()), has(ModBlocks.MYSTIQUARTZ_BLOCK.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.DIAMOND_NUGGET.get(), 9)
                .requires(Items.DIAMOND)
                .unlockedBy(getHasName(Items.DIAMOND), has(Items.DIAMOND))
                .save(pWriter);
    }
}
