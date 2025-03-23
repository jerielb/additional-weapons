package com.jerielb.additional_weapons.util;

import com.jerielb.additional_weapons.AdditionalWeapons;
import com.jerielb.additional_weapons.item.ModItems;
import net.minecraft.client.item.ModelPredicateProviderRegistry;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;

public class ModModelPredicates {
	public static void registerModelPredicates() {
		AdditionalWeapons.LOGGER.info("Registering Model Predicates for " + AdditionalWeapons.MOD_ID);
		
		registerCustomShield(ModItems.KNIGHTS_SHIELD);
		registerCustomShield(ModItems.DREAM_SHIELD);
		
		registerCustomShield(ModItems.STOUT_SHIELD);
		registerCustomShield(ModItems.GOLEM_SHIELD);
		registerCustomShield(ModItems.ADAMANT_SHIELD);
		
		registerCustomShield(ModItems.MYTHRIL_SHIELD);
		registerCustomShield(ModItems.ONYX_SHIELD);
		
		registerCustomShield(ModItems.SMASHER_SHIELD);
		registerCustomShield(ModItems.GIGAS_FIST_SHIELD);
		
		registerCustomShield(ModItems.HERCS_SHIELD);
		registerCustomShield(ModItems.GENJI_SHIELD);
		registerCustomShield(ModItems.DEFENDER_SHIELD);
		registerCustomShield(ModItems.SAVE_THE_KING_SHIELD);
		registerCustomShield(ModItems.MIGHTY_SHIELD);
		registerCustomShield(ModItems.SEVEN_ELEMENTS_SHIELD);
	}
	
	private static void registerCustomShield(Item item) {
		ModelPredicateProviderRegistry.register(item, Identifier.ofVanilla("blocking"), (stack, world, entity, seed) ->
			entity != null && entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0F : 0.0F
		);
	}
}
