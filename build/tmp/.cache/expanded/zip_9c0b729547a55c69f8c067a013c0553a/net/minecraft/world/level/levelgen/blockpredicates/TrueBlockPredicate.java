package net.minecraft.world.level.levelgen.blockpredicates;

import com.mojang.serialization.Codec;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.WorldGenLevel;

class TrueBlockPredicate implements BlockPredicate {
   public static TrueBlockPredicate INSTANCE = new TrueBlockPredicate();
   public static final Codec<TrueBlockPredicate> CODEC = Codec.unit(() -> {
      return INSTANCE;
   });

   private TrueBlockPredicate() {
   }

   public boolean test(WorldGenLevel pLevel, BlockPos pPos) {
      return true;
   }

   public BlockPredicateType<?> type() {
      return BlockPredicateType.TRUE;
   }
}