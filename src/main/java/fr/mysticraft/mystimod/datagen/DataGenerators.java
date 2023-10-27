package fr.mysticraft.mystimod.datagen;

import fr.mysticraft.mystimod.MystiMod;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import javax.xml.crypto.Data;
import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = MystiMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {

    @SubscribeEvent
    public static void  gatherData(GatherDataEvent e){
        DataGenerator generator = e.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = e.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = e.getLookupProvider();

        generator.addProvider(e.includeServer(), new ModRecipieProvider(packOutput));
        generator.addProvider(e.includeServer(), ModLootTableProvider.create(packOutput));

        generator.addProvider(e.includeClient(), new ModBlockStateProvider(packOutput, existingFileHelper));
        generator.addProvider(e.includeClient(), new ModItemModelProvider(packOutput, existingFileHelper));

        ModBlockTagGenerator blockTagGenerator = generator.addProvider(e.includeServer(),
                new ModBlockTagGenerator(packOutput, lookupProvider, existingFileHelper));
        generator.addProvider(e.includeServer(), new ModItemTagGenerator(packOutput, lookupProvider, blockTagGenerator.contentsGetter(), existingFileHelper));


    }
}
