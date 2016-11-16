package com.rdsguild.mods.proxies;

import com.rdsguild.mods.blocks.VTBlocks;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;

public abstract class CommonProxy {
	
	public void preInit() {
		
		VTBlocks.init();
	}
	
	public void init() {
		
	}
	
	public void postInit() {
		
	}
	
	abstract public boolean playerIsInCreativeMode(EntityPlayer player);
	
	abstract public boolean isDedicatedServer();
	
	public void registerItemRenderer(Item item, int meta, String id) {		
		
	}
}
