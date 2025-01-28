package com.jerielb.additional_weapons.item.customItem;

import net.minecraft.block.DispenserBlock;
import net.minecraft.item.*;

public class KnightsShield extends ShieldItem {
	public KnightsShield(Item.Settings settings) {
		super(settings);
		
		DispenserBlock.registerBehavior(this, ArmorItem.DISPENSER_BEHAVIOR);
	}
}
