package net.imaginelosing.testmod;

import net.fabricmc.api.ModInitializer;

import net.imaginelosing.testmod.item.ModItemGroups;
import net.imaginelosing.testmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestMod implements ModInitializer {
	// alteration
	public static final String MOD_ID = "test-mod";

    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.initialize();
	}
}