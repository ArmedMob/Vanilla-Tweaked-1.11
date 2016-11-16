package com.rdsguild.mods.blocks;

import com.rdsguild.mods.VTweaked;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BlockBase extends Block implements com.rdsguild.mods.items.IItemModelProvider {

	protected String name;
	
	public BlockBase(Material material, String name, MapColor color) {
		
		super(material);
		this.name = name;
		setUnlocalizedName(name);
		setRegistryName(name);
	}
	
	@Override
	public void registerItemModel(Item itemBlock) {
		
		VTweaked.proxy.registerItemRenderer(itemBlock, 0, name);
	}
	
	@Override
	public BlockBase setCreativeTab(CreativeTabs tab) {
		
		super.setCreativeTab(tab);
		return this;
	}

}
