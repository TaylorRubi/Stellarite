package taylorrubi.stellarite.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        /*
        blockStateModelGenerator.registerLog(ModBlocks.SEQUOIA_LOG)
                .log(ModBlocks.SEQUOIA_LOG).wood(ModBlocks.SEQUOIA_WOOD);
         */

        //blockStateModelGenerator.registerTintableCrossBlockState(ModBlocks.SEQUOIA_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}
