package taylorrubi.stellarite.world;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.placementmodifier.*;

import java.util.List;

public class ModOrePlacement {

    public static List<PlacementModifier> generateOres(int i, HeightRangePlacementModifier uniform) {
        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.STELLARITE_ORE_PLACED_KEY);
        return null;
    }

}
