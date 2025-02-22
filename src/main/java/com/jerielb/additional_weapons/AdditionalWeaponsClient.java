package com.jerielb.additional_weapons;

import com.jerielb.additional_weapons.entity.ModEntities;
import com.jerielb.additional_weapons.entity.client.BanditEntityRenderer;
import com.jerielb.additional_weapons.entity.client.PirateEntityRenderer;
import com.jerielb.additional_weapons.entity.client.PowerWildEntityRenderer;
import com.jerielb.additional_weapons.entity.client.SoldierEntityRenderer;
import com.jerielb.additional_weapons.util.ModModelPredicates;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.util.Identifier;
import net.minecraft.client.render.entity.model.EntityModelLayer;

public class AdditionalWeaponsClient implements ClientModInitializer {
	public static final EntityModelLayer BANDIT_LAYER = new EntityModelLayer(Identifier.of(AdditionalWeapons.MOD_ID, "bandit"), "main");
	
	@Override
	public void onInitializeClient() {
		ModModelPredicates.registerModelPredicates();
		
		EntityRendererRegistry.register(ModEntities.SOLDIER, SoldierEntityRenderer::new);
		EntityRendererRegistry.register(ModEntities.BANDIT, BanditEntityRenderer::new);
		EntityRendererRegistry.register(ModEntities.PIRATE, PirateEntityRenderer::new);
		EntityRendererRegistry.register(ModEntities.POWER_WILD, PowerWildEntityRenderer::new);
	}
}
