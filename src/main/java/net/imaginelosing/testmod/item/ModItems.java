package net.imaginelosing.testmod.item;

import net.imaginelosing.testmod.TestMod;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item gold_dust = itemRegister(new Item(new Item.Settings()), "gold_dust");

    public static Item itemRegister(Item item, String id) {
        // Create the identifier for the item.
        Identifier itemID = Identifier.of(TestMod.MOD_ID, id);

        // Register and Return the registered item!
        return Registry.register(Registries.ITEM, itemID, item);

    }

    public static void initialize() {
    }
}