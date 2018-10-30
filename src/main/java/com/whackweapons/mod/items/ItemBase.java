package com.whackweapons.mod.items;

import com.whackweapons.mod.WhackWeapons;
import com.whackweapons.mod.rendering.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel
{
	public ItemBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		
		setCreativeTab(CreativeTabs.MISC);
		
		CustomItems.addItem(this);
	}

	@Override
	public void registerModels()
	{
		WhackWeapons.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
