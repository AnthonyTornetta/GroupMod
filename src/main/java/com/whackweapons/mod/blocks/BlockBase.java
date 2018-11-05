package com.whackweapons.mod.blocks;

import com.whackweapons.mod.WhackWeapons;
import com.whackweapons.mod.items.tools.CustomItems;
import com.whackweapons.mod.rendering.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel
{
	public BlockBase(String name, Material materialIn)
	{
		super(materialIn);
		
		setUnlocalizedName(name);
		setRegistryName(name);
		
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		CustomBlocks.add(this);
		CustomItems.addItem(new ItemBlock(this).setRegistryName(getRegistryName()));
	}

	@Override
	public void registerModels()
	{
		WhackWeapons.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}
