package com.whackweapons.mod.blocks;

import java.util.Random;

import com.whackweapons.mod.items.CustomItems;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class CustomOre extends BlockBase
{
	private Item drop;
	
	public CustomOre(String name, Item drop)
	{
		super(name, Material.ROCK);
		
		setSoundType(SoundType.STONE);
		setHardness(5.0f);
		setResistance(15.0f);
		setHarvestLevel("pickaxe", 2);
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rdm, int fortune)
	{
		if(drop != null)
			return drop;
		else
			return new ItemBlock(this);
	}
}
