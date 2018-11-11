package com.whackweapons.mod.items;

import java.util.ArrayList;
import java.util.List;

import com.whackweapons.mod.items.tools.CustomAxe;
import com.whackweapons.mod.items.tools.CustomBow;
import com.whackweapons.mod.items.tools.CustomPickaxe;
import com.whackweapons.mod.items.tools.CustomShield;
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
		EGG_ORE_T_MATERIAL = EnumHelper.addToolMaterial("EGG_ORE_T_MATERIAL", 4, 2000, 16, 16, 30);
	
	public static final Item SAPPHIRE_ITEM = new ItemBase("SAPPHIRE_ITEM", CreativeTabs.MATERIALS, "gemSapphire");
	public static final Item RUBY_ITEM = new ItemBase("RUBY_ITEM", CreativeTabs.MATERIALS, "gemRuby");
	public static final Item TOPAZ_ITEM = new ItemBase("TOPAZ_ITEM", CreativeTabs.MATERIALS, "gemTopaz");
	
	public static final Item RUBY_SWORD = new CustomSword("RUBY_SWORD", RUBY_MATERIAL);
	public static final Item TOPAZ_SWORD = new CustomSword("TOPAZ_SWORD", SAPPHIRE_MATERIAL);
	public static final Item SAPPHIRE_SWORD = new CustomSword("SAPPHIRE_SWORD", SAPPHIRE_MATERIAL);
	
	public static final Item RUBY_PICKAXE = new CustomPickaxe("RUBY_PICKAXE", RUBY_MATERIAL);
	public static final Item TOPAZ_PICKAXE = new CustomPickaxe("TOPAZ_PICKAXE", SAPPHIRE_MATERIAL);
	public static final Item SAPPHIRE_PICKAXE = new CustomPickaxe("SAPPHIRE_PICKAXE", SAPPHIRE_MATERIAL);
	
	public static final Item RUBY_AXE = new CustomAxe("RUBY_AXE", RUBY_MATERIAL);
	public static final Item TOPAZ_AXE = new CustomAxe("TOPAZ_AXE", RUBY_MATERIAL);
	public static final Item SAPPHIRE_AXE = new CustomAxe("SAPPHIRE_AXE", RUBY_MATERIAL);
	
	public static final Item RUBY_SHIELD = new CustomShield("RUBY_SHIELD");
	public static final Item TOPAZ_SHIELD = new CustomShield("TOPAZ_SHIELD");
	public static final Item SAPPHIRE_SHIELD = new CustomShield("SAPPHIRE_SHIELD");
	
	public static void addItem(Item i) { ITEMS.add(i); }
}
