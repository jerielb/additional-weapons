package com.jerielb.additional_weapons.item;

import com.jerielb.additional_weapons.AdditionalWeapons;
import com.jerielb.additional_weapons.entity.ModEntities;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
	// Kingdom Hearts 1 - keyblades
	public static final Item KINGDOM_KEY = registerItem("kingdom_key", new SwordItem(ToolMaterials.NETHERITE, (new Item.Settings()).fireproof()
			.attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE, 3, -2.4F))));
	public static final Item JUNGLE_KING = registerItem("jungle_king", new SwordItem(ToolMaterials.NETHERITE, (new Item.Settings()).fireproof()
			.attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE, 3, -2.4F))));
	public static final Item THREE_WISHES = registerItem("three_wishes", new SwordItem(ToolMaterials.NETHERITE, (new Item.Settings()).fireproof()
			.attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE, 3, -2.4F))));
	public static final Item CRABCLAW = registerItem("crabclaw", new SwordItem(ToolMaterials.NETHERITE, (new Item.Settings()).fireproof()
			.attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE, 3, -2.4F))));
	public static final Item PUMPKINHEAD = registerItem("pumpkinhead", new SwordItem(ToolMaterials.NETHERITE, (new Item.Settings()).fireproof()
			.attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE, 3, -2.4F))));
	public static final Item FAIRY_HARP = registerItem("fairy_harp", new SwordItem(ToolMaterials.NETHERITE, (new Item.Settings()).fireproof()
			.attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE, 3, -2.4F))));
	public static final Item WISHING_STAR = registerItem("wishing_star", new SwordItem(ToolMaterials.NETHERITE, (new Item.Settings()).fireproof()
			.attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE, 3, -2.4F))));
	public static final Item SPELLBINDER = registerItem("spellbinder", new SwordItem(ToolMaterials.NETHERITE, (new Item.Settings()).fireproof()
			.attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE, 3, -2.4F))));
	public static final Item METAL_CHOCOBO = registerItem("metal_chocobo", new SwordItem(ToolMaterials.NETHERITE, (new Item.Settings()).fireproof()
			.attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE, 3, -2.4F))));
	public static final Item OLYMPIA = registerItem("olympia", new SwordItem(ToolMaterials.NETHERITE, (new Item.Settings()).fireproof()
			.attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE, 3, -2.4F))));
	public static final Item LIONHEART = registerItem("lionheart", new SwordItem(ToolMaterials.NETHERITE, (new Item.Settings()).fireproof()
			.attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE, 3, -2.4F))));
	public static final Item OATHKEEPER = registerItem("oathkeeper", new SwordItem(ToolMaterials.NETHERITE, (new Item.Settings()).fireproof()
			.attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE, 3, -2.4F))));
	public static final Item OBLIVION = registerItem("oblivion", new SwordItem(ToolMaterials.NETHERITE, (new Item.Settings()).fireproof()
			.attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE, 3, -2.4F))));
	public static final Item LADY_LUCK = registerItem("lady_luck", new SwordItem(ToolMaterials.NETHERITE, (new Item.Settings()).fireproof()
			.attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE, 3, -2.4F))));
	public static final Item DIVINE_ROSE = registerItem("divine_rose", new SwordItem(ToolMaterials.NETHERITE, (new Item.Settings()).fireproof()
			.attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE, 3, -2.4F))));
	public static final Item DIAMOND_DUST = registerItem("diamond_dust", new SwordItem(ToolMaterials.NETHERITE, (new Item.Settings()).fireproof()
			.attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE, 3, -2.4F))));
	public static final Item ONE_WINGED_ANGEL = registerItem("one_winged_angel", new SwordItem(ToolMaterials.NETHERITE, (new Item.Settings()).fireproof()
			.attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE, 3, -2.4F))));
	public static final Item ULTIMA_WEAPON = registerItem("ultima_weapon", new SwordItem(ToolMaterials.NETHERITE, (new Item.Settings()).fireproof()
			.attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE, 3, -2.4F))));
	public static final Item KINGDOM_KEY_DARKSIDE = registerItem("kingdom_key_darkside", new SwordItem(ToolMaterials.NETHERITE, (new Item.Settings()).fireproof()
			.attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE, 3, -2.4F))));
	public static final Item SOUL_EATER = registerItem("soul_eater", new SwordItem(ToolMaterials.NETHERITE, (new Item.Settings()).fireproof()
			.attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE, 3, -2.4F))));
	
	// shield(s)
	public static final Item KNIGHTS_SHIELD = registerItem("knights_shield", new ShieldItem(new Item.Settings().maxDamage(336)));
	public static final Item DREAM_SHIELD = registerItem("dream_shield", new ShieldItem(new Item.Settings().maxDamage(336)));
	
//	public static final Item STOUT_SHIELD = registerItem("stout_shield", new ShieldItem(new Item.Settings().maxDamage(336)));
//	public static final Item GOLEM_SHIELD = registerItem("golem_shield", new ShieldItem(new Item.Settings().maxDamage(336)));
//	public static final Item ADAMANT_SHIELD = registerItem("adamant_shield", new ShieldItem(new Item.Settings().maxDamage(336)));
	
	
	// munny
	public static final Item MUNNY = registerItem("munny", new Item(new Item.Settings()));
	
	// entity spawn eggs
	public static final Item BANDIT_SPAWN_EGG = registerItem("bandit_spawn_egg",
			new SpawnEggItem(ModEntities.BANDIT, 0x292967, 0x56503A, new Item.Settings()));
	
	// helper method
	private static Item registerItem(String name, Item item) {
		return Registry.register(Registries.ITEM, Identifier.of(AdditionalWeapons.MOD_ID, name), item);
	}
	
	// gets called by the Main class onInitialize() method
	public static void registerModItems() {
		AdditionalWeapons.LOGGER.info("Registering Mod Items for " + AdditionalWeapons.MOD_ID);
	}
}