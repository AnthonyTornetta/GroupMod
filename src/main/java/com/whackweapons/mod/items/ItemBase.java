package com.whackweapons.mod.items;

import com.whackweapons.mod.WhackWeapons;
import com.whackweapons.mod.rendering.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;

public class ItemBase extends Item implements IHasModel
{
	private String oreDictName;
	
	public ItemBase(String name)
	{
		this(name, CreativeTabs.MISC);
	}

	public ItemBase(String name, CreativeTabs tab)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		
		setCreativeTab(tab);
		
		CustomItems.addItem(this);
	}

	public ItemBase(String name, CreativeTabs tab, String oreDictName)
	{
		this(name, tab);
		
		this.oreDictName = oreDictName;
	}

	@Override
	public void registerModels()
	{
		WhackWeapons.proxy.registerItemRenderer(this, 0, "inventory");
	}
	
	public boolean shouldBeOreDictRegistered() { return oreDictName != null; }
	public void registerInOreDict()
	{
		OreDictionary.registerOre(oreDictName, this);
	}
}
