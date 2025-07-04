package taylorrubi.stellarite;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import taylorrubi.stellarite.block.ModBlocks;
import taylorrubi.stellarite.item.Moditems;
import taylorrubi.stellarite.util.ModLootTableModifiers;
import taylorrubi.stellarite.world.gen.ModWorldGeneration;

public class Stellarite implements ModInitializer {
	public static final String MOD_ID = "stellarite";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override

	public void onInitialize() {
		Moditems.registerModItems();
		ModBlocks.registerModBlocks();
		ModLootTableModifiers.modifyLootTables();

		ModWorldGeneration.generateWorld();

		LOGGER.info("Muahaha I'm turning evil... (im working)");
	}
}