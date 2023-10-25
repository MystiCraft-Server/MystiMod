package net.minecraft.world.level.block;

import java.util.function.BiPredicate;
import java.util.function.Function;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.DirectionProperty;

public class DoubleBlockCombiner {
   public static <S extends BlockEntity> DoubleBlockCombiner.NeighborCombineResult<S> combineWithNeigbour(BlockEntityType<S> pBlockEntityType, Function<BlockState, DoubleBlockCombiner.BlockType> p_52824_, Function<BlockState, Direction> p_52825_, DirectionProperty p_52826_, BlockState pState, LevelAccessor pLevel, BlockPos pPos, BiPredicate<LevelAccessor, BlockPos> p_52830_) {
      S s = pBlockEntityType.getBlockEntity(pLevel, pPos);
      if (s == null) {
         return DoubleBlockCombiner.Combiner::acceptNone;
      } else if (p_52830_.test(pLevel, pPos)) {
         return DoubleBlockCombiner.Combiner::acceptNone;
      } else {
         DoubleBlockCombiner.BlockType doubleblockcombiner$blocktype = p_52824_.apply(pState);
         boolean flag = doubleblockcombiner$blocktype == DoubleBlockCombiner.BlockType.SINGLE;
         boolean flag1 = doubleblockcombiner$blocktype == DoubleBlockCombiner.BlockType.FIRST;
         if (flag) {
            return new DoubleBlockCombiner.NeighborCombineResult.Single<>(s);
         } else {
            BlockPos blockpos = pPos.relative(p_52825_.apply(pState));
            BlockState blockstate = pLevel.getBlockState(blockpos);
            if (blockstate.is(pState.getBlock())) {
               DoubleBlockCombiner.BlockType doubleblockcombiner$blocktype1 = p_52824_.apply(blockstate);
               if (doubleblockcombiner$blocktype1 != DoubleBlockCombiner.BlockType.SINGLE && doubleblockcombiner$blocktype != doubleblockcombiner$blocktype1 && blockstate.getValue(p_52826_) == pState.getValue(p_52826_)) {
                  if (p_52830_.test(pLevel, blockpos)) {
                     return DoubleBlockCombiner.Combiner::acceptNone;
                  }

                  S s1 = pBlockEntityType.getBlockEntity(pLevel, blockpos);
                  if (s1 != null) {
                     S s2 = flag1 ? s : s1;
                     S s3 = flag1 ? s1 : s;
                     return new DoubleBlockCombiner.NeighborCombineResult.Double<>(s2, s3);
                  }
               }
            }

            return new DoubleBlockCombiner.NeighborCombineResult.Single<>(s);
         }
      }
   }

   public static enum BlockType {
      SINGLE,
      FIRST,
      SECOND;
   }

   public interface Combiner<S, T> {
      T acceptDouble(S pFirst, S pSecond);

      T acceptSingle(S pSingle);

      T acceptNone();
   }

   public interface NeighborCombineResult<S> {
      <T> T apply(DoubleBlockCombiner.Combiner<? super S, T> p_52845_);

      public static final class Double<S> implements DoubleBlockCombiner.NeighborCombineResult<S> {
         private final S first;
         private final S second;

         public Double(S pFirst, S pSecond) {
            this.first = pFirst;
            this.second = pSecond;
         }

         public <T> T apply(DoubleBlockCombiner.Combiner<? super S, T> p_52852_) {
            return p_52852_.acceptDouble(this.first, this.second);
         }
      }

      public static final class Single<S> implements DoubleBlockCombiner.NeighborCombineResult<S> {
         private final S single;

         public Single(S pSingle) {
            this.single = pSingle;
         }

         public <T> T apply(DoubleBlockCombiner.Combiner<? super S, T> p_52857_) {
            return p_52857_.acceptSingle(this.single);
         }
      }
   }
}