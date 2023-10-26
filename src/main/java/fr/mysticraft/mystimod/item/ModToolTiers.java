package fr.mysticraft.mystimod.item;

import fr.mysticraft.mystimod.MystiMod;
import fr.mysticraft.mystimod.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {

    public static final Tier MYSTIQUARTZ = TierSortingRegistry.registerTier(new ForgeTier(5, 1500,
                    5f, 4f, 25, ModTags.Blocks.
                    NEEDS_MYSTIQUARTZ_TOOL, () -> Ingredient.of(ModItems.MYSTIQUARTZ.get())),
            new ResourceLocation(MystiMod.MOD_ID, "mystiquartz"),
            List.of(Tiers.NETHERITE), List.of());
}
