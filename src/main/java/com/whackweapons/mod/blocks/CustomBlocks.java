package com.whackweapons.mod.blocks;

import java.util.ArrayList;
import java.util.List;

import com.whackweapons.mod.world.CustomWorldGeneration;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class CustomBlocks
{
	public static final List<Block> BLOCKS = new ArrayList<>();
	
	public static final Block
		CUSTOM_BLOCK = new BlockBase("TEST_BLOCK", Material.ROCK),
		EGG_ORE_T_BLOCK = new CustomOre("EGG_ORE_T_BLOCK", null);
	
	static
	{
		CustomWorldGeneration.addOre(EGG_ORE_T_BLOCK, 5, 10, 1, 64, 80);
	}
	
	public static void add(Block b)
	{
		BLOCKS.add(b);
	}
}
