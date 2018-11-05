package com.whackweapons.mod.items.tools;

import java.util.ArrayList;
import java.util.List;

import com.whackweapons.mod.items.CustomSword;
import com.whackweapons.mod.items.ItemBase;

import net.minecraft.item.Item;
import net.minecraft.item.ItemBow;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class CustomItems
{
	public static final List<Item> ITEMS = new ArrayList<>();
	
	/*
	 * = Tool Material Guide =
	 * 
	 * Harvest level: 0 wood, 3 diamond, 4 ardite/cobalt (tinker's construct), 5+ overkill
	 * Durability: 
	 * Mining Speed: 1.0f no tool, 2.0f wood, 4.0f stone, 6.0f iron, 8.0f diamond, 12.0f gold
	 * Damage: wood: 0.0f, diamond: 3.0f
	 * Enchantability: wood: 15, stone: 5, iron: 14, diamond: 10, gold: 22
	 */
	public static final ToolMaterial TEST_TOOL_MATERIAL = EnumHelper.addToolMaterial("TEST_MATERIAL", 4, 1200, 16, Float.MAX_VALUE, 30);
	
	public static final Item TEST_ITEM = new ItemBase("TEST_ITEM");
	public static final Item TEST_SWORD = new CustomSword("TEST_SWORD", TEST_TOOL_MATERIAL);
	public static final Item TEST_BOW = new CustomBow();

	public static void addItem(Item i) { ITEMS.add(i); }
}
