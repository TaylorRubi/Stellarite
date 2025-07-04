package taylorrubi.stellarite;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;
import taylorrubi.stellarite.datagen.ModBlockTagProvider;
import taylorrubi.stellarite.datagen.ModItemTagProvider;
import taylorrubi.stellarite.datagen.ModModelProvider;
import taylorrubi.stellarite.datagen.ModWorldGenerator;
import taylorrubi.stellarite.world.ModConfiguredFeatures;
import taylorrubi.stellarite.world.ModPlacedFeatures;

/* Message to Taylor:
* please run the gradle task fabric/runDatagen before you run or build your mod. this ensures that every json file is
* generated and up to date so nothing breaks.
*
* thanks!
* pin
* */
public class StellariteDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModBlockTagProvider::new);
		pack.addProvider(ModWorldGenerator::new);
		pack.addProvider(ModItemTagProvider::new);
	}

	@Override
	public void buildRegistry(RegistryBuilder registryBuilder) {
		registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, ModConfiguredFeatures::bootstrap);
		registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, ModPlacedFeatures::bootstrap);
	}
}
