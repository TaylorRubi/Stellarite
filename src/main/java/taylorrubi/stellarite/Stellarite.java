package taylorrubi.stellarite;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import taylorrubi.stellarite.block.ModBlocks;
import taylorrubi.stellarite.item.Moditems;
import taylorrubi.stellarite.util.ModLootTableModifiers;

public class Stellarite implements ModInitializer {
	public static final String MOD_ID = "stellarite";


	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override

	public void onInitialize() {
		Moditems.registerModItems();
		ModBlocks.registerModBlocks();
		ModLootTableModifiers.modifyLootTables();

		LOGGER.info("Muahaha I'm turning evil... (im working)");
	}
}