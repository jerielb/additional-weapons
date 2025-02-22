package com.jerielb.additional_weapons;

import com.jerielb.additional_weapons.entity.ModEntities;
import com.jerielb.additional_weapons.entity.client.*;
import com.jerielb.additional_weapons.util.ModModelPredicates;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class AdditionalWeaponsClient implements ClientModInitializer {
	
	@Override
	public void onInitializeClient() {
		ModModelPredicates.registerModelPredicates();
		
		EntityRendererRegistry.register(ModEntities.SOLDIER, SoldierEntityRenderer::new);
		EntityRendererRegistry.register(ModEntities.BANDIT, BanditEntityRenderer::new);
		EntityRendererRegistry.register(ModEntities.PIRATE, PirateEntityRenderer::new);
		EntityRendererRegistry.register(ModEntities.POWER_WILD, PowerWildEntityRenderer::new);
		EntityRendererRegistry.register(ModEntities.WHITE_MUSHROOM, WhiteMushroomEntityRenderer::new);
		EntityRendererRegistry.register(ModEntities.SHADOW, ShadowEntityRenderer::new);
	}
}
