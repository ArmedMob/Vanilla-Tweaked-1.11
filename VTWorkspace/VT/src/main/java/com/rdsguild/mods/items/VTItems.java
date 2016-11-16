package com.rdsguild.mods.items;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class VTItems {

	public static void init() {
		
	}
	
	@SuppressWarnings("unused")
	private static <T extends Item> T register(T item) {
		
		GameRegistry.register(item);
		
		if(item instanceof IItemModelProvider) {
			((IItemModelProvider)item).registerItemModel(item);
		}
		
		if(item instanceof IItemOreDict) {
			((IItemOreDict)item).initOreDict();
		}
		
		return item;
	}
}
