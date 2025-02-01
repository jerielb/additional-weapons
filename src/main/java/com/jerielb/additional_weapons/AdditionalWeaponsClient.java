package com.jerielb.additional_weapons;

import com.jerielb.additional_weapons.util.ModModelPredicates;
import net.fabricmc.api.ClientModInitializer;

public class AdditionalWeaponsClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		ModModelPredicates.registerModelPredicates();
	}
}
