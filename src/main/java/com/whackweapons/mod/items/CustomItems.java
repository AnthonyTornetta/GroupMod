package com.whackweapons.mod.items;

import java.util.ArrayList;
import java.util.List;

import com.whackweapons.mod.items.tools.CustomAxe;
import com.whackweapons.mod.items.tools.CustomBow;
import com.whackweapons.mod.items.tools.CustomHoe;
import com.whackweapons.mod.items.tools.CustomPickaxe;
import com.whackweapons.mod.items.tools.CustomShield;
import com.whackweapons.mod.items.tools.CustomShovel;
import com.whackweapons.mod.items.tools.CustomSword;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemShield;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.crafting.ShieldRecipes;
import net.minecraftforge.common.util.EnumHelper;

public class CustomItems
{
	public static final List<Item> ITEMS = new ArrayList<>();
	
	/*
	 * = Tool Material Guide =
	 * 
	 * Harvest level: 0 wood, 3 diamond, 4 ardite/cobalt (tinker's construct), 5+ overkill
	 * Durability: 59 wood, 131 stone, 250 iron, 1561 diamond, 32 gold
	 * Mining Speed: 1.0f no tool, 2.0f wood, 4.0f stone, 6.0f iron, 8.0f diamond, 12.0f gold
	 * Damage: wood: 0.0f, diamond: 3.0f
	 * Enchantability: wood: 15, stone: 5, iron: 14, diamond: 10, gold: 22
	 */
	
	/*
	 * WOOD(0, 59, 2.0F, 0.0F, 15),
        STONE(1, 131, 4.0F, 1.0F, 5),
        IRON(2, 250, 6.0F, 2.0F, 14),
        DIAMOND(3, 1561, 8.0F, 3.0F, 10),
        GOLD(0, 32, 12.0F, 0.0F, 22);
	 */
	public static final ToolMaterial 
		SAPPHIRE_MATERIAL = EnumHelper.addToolMaterial("SAPPHIRE_MATERIAL", 3, 1200, 8.0f, 8.0f, 16), 
		TOPAZ_MATERIAL = EnumHelper.addToolMaterial("TOPAZ_MATERIAL", 3, 1200, 8.0f, 8.0f, 16), 
		RUBY_MATERIAL = EnumHelper.addToolMaterial("RUBY_MATERIAL", 3, 1200, 8.0f, 8.0f, 16),
		EGG_ORE_T_MATERIAL = EnumHelper.addToolMaterial("EGG_ORE_T_MATERIAL", 4, 2000, 20, 16, 30);
	

	public static final Item 
		SAPPHIRE_ITEM = new ItemBase("SAPPHIRE_ITEM", CreativeTabs.MATERIALS, "gemSapphire"),
		RUBY_ITEM = new ItemBase("RUBY_ITEM", CreativeTabs.MATERIALS, "gemRuby"),
		TOPAZ_ITEM = new ItemBase("TOPAZ_ITEM", CreativeTabs.MATERIALS, "gemTopaz"),
		EGG_ORE_T_INGOT = new ItemBase("EGG_ORE_T_INGOT", CreativeTabs.MATERIALS, "ingotEggOreT"),
		
		RUBY_SWORD = new CustomSword("RUBY_SWORD", RUBY_MATERIAL),
		TOPAZ_SWORD = new CustomSword("TOPAZ_SWORD", SAPPHIRE_MATERIAL),
		SAPPHIRE_SWORD = new CustomSword("SAPPHIRE_SWORD", SAPPHIRE_MATERIAL),
		EGG_ORE_T_SWORD = new CustomSword("EGG_ORE_T_SWORD", EGG_ORE_T_MATERIAL),
		
		RUBY_PICKAXE = new CustomPickaxe("RUBY_PICKAXE", RUBY_MATERIAL),
		TOPAZ_PICKAXE = new CustomPickaxe("TOPAZ_PICKAXE", SAPPHIRE_MATERIAL),
		SAPPHIRE_PICKAXE = new CustomPickaxe("SAPPHIRE_PICKAXE", SAPPHIRE_MATERIAL),
		EGG_ORE_T_PICKAXE = new CustomPickaxe("EGG_ORE_T_PICKAXE", EGG_ORE_T_MATERIAL),
		
		RUBY_AXE = new CustomAxe("RUBY_AXE", RUBY_MATERIAL),
		TOPAZ_AXE = new CustomAxe("TOPAZ_AXE", RUBY_MATERIAL),
		SAPPHIRE_AXE = new CustomAxe("SAPPHIRE_AXE", RUBY_MATERIAL),
		EGG_ORE_T_AXE = new CustomAxe("EGG_ORE_T_AXE", EGG_ORE_T_MATERIAL),
		
		RUBY_SHIELD = new CustomShield("RUBY_SHIELD"),
		TOPAZ_SHIELD = new CustomShield("TOPAZ_SHIELD"),
		SAPPHIRE_SHIELD = new CustomShield("SAPPHIRE_SHIELD"),
		EGG_ORE_T_SHIELD = new CustomShield("EGG_ORE_T_SHIELD"),
	
		SAPPHIRE_HOE = new CustomHoe("SAPPHIRE_HOE", RUBY_MATERIAL),
		TOPAZ_HOE = new CustomHoe("TOPAZ_HOE", RUBY_MATERIAL),
		RUBY_HOE = new CustomHoe("RUBY_HOE", RUBY_MATERIAL),
		EGG_ORE_T_HOE = new CustomHoe("EGG_ORE_T_HOE", EGG_ORE_T_MATERIAL),
		
		SAPPHIRE_SHOVEL = new CustomShovel("SAPPHIRE_SHOVEL", RUBY_MATERIAL),
		TOPAZ_SHOVEL = new CustomShovel("TOPAZ_SHOVEL", RUBY_MATERIAL),
		RUBY_SHOVEL = new CustomShovel("RUBY_SHOVEL", RUBY_MATERIAL),
		EGG_ORE_T_SHOVEL = new CustomShovel("EGG_ORE_T_SHOVEL", EGG_ORE_T_MATERIAL);
	
	public static void addItem(Item i) { ITEMS.add(i); }
}
