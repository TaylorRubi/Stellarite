package taylorrubi.stellarite.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import taylorrubi.stellarite.Stellarite;
import taylorrubi.stellarite.item.custom.StellariteChorusFruitItem;
import net.minecraft.item.SmithingTemplateItem

public class Moditems {
    public static final Item STELLARITE_INGOT = registerItem( "stellarite_ingot", new Item(new Item.Settings()));
    public static final Item STELLARITE_SCRAP = registerItem( "stellarite_scrap", new Item(new Item.Settings()));
    public static final Item STELLARITE_NUGGET = registerItem( "stellarite_nugget", new Item(new Item.Settings()));
    public static final Item STELLARITE_UPGRADE = registerItem( "stellarite_upgrade", new SmithingTemplateItem(Text.of());
    public static final Item IFO = registerItem( "ifo", new Item(new Item.Settings()));
    public static final Item STELLARITE_CHORUS_FRUIT = registerItem( "stellarite_chorus_fruit", new StellariteChorusFruitItem(new Item.Settings().food(ModFoodComponents.STELLARITE_CHORUS_FRUIT)));

    public static final Item STELLARITE_SWORD = registerItem("stellarite_sword",
            new SwordItem(ModToolMaterials.STELLARITE, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.STELLARITE, 3, -2.3f))));

    public static final Item STELLARITE_PICKAXE = registerItem("stellarite_pickaxe",
            new PickaxeItem(ModToolMaterials.STELLARITE, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.STELLARITE, 1, -2.7f))));

    public static final Item STELLARITE_AXE = registerItem("stellarite_axe",
            new AxeItem(ModToolMaterials.STELLARITE, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.STELLARITE, 5f, -2.9f))));

    public static final Item STELLARITE_SHOVEL = registerItem("stellarite_shovel",
            new ShovelItem(ModToolMaterials.STELLARITE, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.STELLARITE, 1.5f, -2.0f))));

    public static final Item STELLARITE_HOE = registerItem("stellarite_hoe",
            new HoeItem(ModToolMaterials.STELLARITE, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.STELLARITE, -3f, 0))));

    public static final Item STELLARITE_MACE = registerItem("stellarite_mace",
            new MaceItem(new Item.Settings()));





    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Stellarite.MOD_ID, name), item);
    }
    public static void registerModItems() {
        Stellarite.LOGGER.info("Registering Mod Items for " + Stellarite.MOD_ID);


        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(STELLARITE_INGOT);
            fabricItemGroupEntries.add(STELLARITE_SCRAP);
            fabricItemGroupEntries.add(STELLARITE_NUGGET);
            fabricItemGroupEntries.add(STELLARITE_UPGRADE);


        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(STELLARITE_PICKAXE);
            fabricItemGroupEntries.add(STELLARITE_AXE);
            fabricItemGroupEntries.add(STELLARITE_SHOVEL);
            fabricItemGroupEntries.add(STELLARITE_HOE);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(STELLARITE_SWORD);
            fabricItemGroupEntries.add(STELLARITE_AXE);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(STELLARITE_CHORUS_FRUIT);
    });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.OPERATOR).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(STELLARITE_MACE);
        });
} }
