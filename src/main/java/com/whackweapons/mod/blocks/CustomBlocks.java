package com.whackweapons.mod.blocks;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class CustomBlocks
{
	public static final List<Block> BLOCKS = new ArrayList<>();
	
	private static final Block CUSTOM_BLOCK = new BlockBase("TEST_BLOCK", Material.ROCK);
	
	public static void add(Block b)
	{
		BLOCKS.add(b);
	}
}
