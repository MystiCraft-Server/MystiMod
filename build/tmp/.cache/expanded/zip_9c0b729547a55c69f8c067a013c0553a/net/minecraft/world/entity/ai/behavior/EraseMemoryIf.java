package net.minecraft.world.entity.ai.behavior;

import java.util.function.Predicate;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.behavior.declarative.BehaviorBuilder;
import net.minecraft.world.entity.ai.memory.MemoryModuleType;

public class EraseMemoryIf {
   public static <E extends LivingEntity> BehaviorControl<E> create(Predicate<E> pShouldEraseMemory, MemoryModuleType<?> pErasingMemory) {
      return BehaviorBuilder.create((p_260008_) -> {
         return p_260008_.group(p_260008_.present(pErasingMemory)).apply(p_260008_, (p_259127_) -> {
            return (p_259033_, p_259929_, p_260086_) -> {
               if (pShouldEraseMemory.test(p_259929_)) {
                  p_259127_.erase();
                  return true;
               } else {
                  return false;
               }
            };
         });
      });
   }
}