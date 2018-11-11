package com.whackweapons.mod.blocks;

import java.util.ArrayList;
import java.util.List;

import com.whackweapons.mod.items.CustomItems;
import com.whackweapons.mod.world.CustomWorldGeneration;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class CustomBlocks
{
	public static final List<Block> BLOCKS = new ArrayList<>();
	
	public static final Block
		CUSTOM_BLOCK = new BlockBase("TEST_BLOCK", Material.ROCK),
		EGG_ORE_T_BLOCK = new CustomOre("EGG_ORE_T_BLOCK", null, true, 5.0f, 15.0f, 2, "oreEggOreT"),
		RUBY_ORE_BLOCK = new CustomOre("RUBY_ORE_BLOCK", CustomItems.RUBY_ITEM, false, 5.0f, 15.0f, 2, "oreRuby"),
		SAPPHIRE_ORE_BLOCK = new CustomOre("SAPPHIRE_ORE_BLOCK", CustomItems.SAPPHIRE_ITEM, false, 5.0f, 15.0f, 2, "oreSapphire"),
		TOPAZ_ORE_BLOCK = new CustomOre("TOPAZ_ORE_BLOCK", CustomItems.TOPAZ_ITEM, false, 5.0f, 15.0f, 2, "oreTopaz");
	
	static
	{
		// BUMP DOWN ORE COMMONALITY
		CustomWorldGeneration.addOre(EGG_ORE_T_BLOCK   , 5, 10, 1, 64, 80);
		CustomWorldGeneration.addOre(RUBY_ORE_BLOCK    , 2, 5, 1, 16, 20);
		CustomWorldGeneration.addOre(SAPPHIRE_ORE_BLOCK, 2, 5, 1, 16, 20);
		CustomWorldGeneration.addOre(TOPAZ_ORE_BLOCK   , 2, 5, 1, 16, 20);
	}
	
	public static void add(Block b)
	{
		BLOCKS.add(b);
	}
}
