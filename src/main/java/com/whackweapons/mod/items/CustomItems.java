package com.whackweapons.mod.items;

import java.util.ArrayList;
import java.util.List;

import com.whackweapons.mod.items.tools.CustomBow;
import com.whackweapons.mod.items.tools.CustomSword;

import net.minecraft.creativetab.CreativeTabs;
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
	public static final ToolMaterial 
		SAPPHIRE_MATERIAL = EnumHelper.addToolMaterial("SAPPHIRE_MATERIAL", 3, 1200, 16, 8.0f, 16), 
		TOPAZ_MATERIAL = EnumHelper.addToolMaterial("TOPAZ_MATERIAL", 3, 1200, 16, 8.0f, 16), 
		RUBY_MATERIAL = EnumHelper.addToolMaterial("RUBY_MATERIAL", 3, 1200, 16, 8.0f, 16);
	
//	public static final Item TEST_ITEM = new ItemBase("TEST_ITEM");
	
	public static final Item SAPPHIRE_ITEM = new ItemBase("SAPPHIRE_ITEM", CreativeTabs.MATERIALS);
	public static final Item RUBY_ITEM = new ItemBase("RUBY_ITEM", CreativeTabs.MATERIALS);
	public static final Item TOPAZ_ITEM = new ItemBase("TOPAZ_ITEM", CreativeTabs.MATERIALS);
	
	public static final Item TEST_BOW = new CustomBow();
	
	public static final Item RUBY_SWORD = new CustomSword("RUBY_SWORD", RUBY_MATERIAL);
	public static final Item TOPAZ_SWORD = new CustomSword("TOPAZ_SWORD", SAPPHIRE_MATERIAL);
	public static final Item SAPPHIRE_SWORD = new CustomSword("SAPPHIRE_SWORD", SAPPHIRE_MATERIAL);

	public static void addItem(Item i) { ITEMS.add(i); }
}
