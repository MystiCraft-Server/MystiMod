package fr.mysticraft.mystimod.event;

import fr.mysticraft.mystimod.MystiMod;
import fr.mysticraft.mystimod.entity.ModEntities;
import fr.mysticraft.mystimod.entity.custom.RhinoEntity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MystiMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent e){
        e.put(ModEntities.RHINO.get(), RhinoEntity.createAttributes().build());
    }
}
