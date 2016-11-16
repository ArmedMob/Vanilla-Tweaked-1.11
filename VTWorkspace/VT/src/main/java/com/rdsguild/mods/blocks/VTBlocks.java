package com.rdsguild.mods.blocks;

import com.rdsguild.mods.items.IItemModelProvider;
import com.rdsguild.mods.items.IItemOreDict;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.registry.IForgeRegistryEntry.Impl;

public class VTBlocks {

	
	public static BlockBase blockT2oopy;
	
	public static void init() {
		
		blockT2oopy = register(new BlockBase(Material.IRON, "blockT2oopy", MapColor.PURPLE).setCreativeTab(CreativeTabs.BUILDING_BLOCKS));
	}
	
	private static <T extends Block> T register(T block, ItemBlock itemBlock) {
		
		GameRegistry.register(block);
		
		if(itemBlock != null) {
			GameRegistry.register(itemBlock);
		}
		
		if (block instanceof IItemModelProvider) {
			((IItemModelProvider)block).registerItemModel(itemBlock);
		}
		
		if(block instanceof IItemOreDict) {
			((IItemOreDict)block).initOreDict();
		}
		
		if(itemBlock instanceof IItemOreDict) {
			((IItemOreDict)itemBlock).initOreDict();
		}
		
		return block;
	}
	
	private static<T extends Block> T register(T block) {
		
		ItemBlock itemBlock = new ItemBlock(block);
		itemBlock.setRegistryName(((Impl<Block>) block).getRegistryName());
		return register(block, itemBlock);
	}
}
