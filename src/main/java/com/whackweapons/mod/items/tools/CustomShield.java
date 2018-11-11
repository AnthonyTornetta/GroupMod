package com.whackweapons.mod.items.tools;

import com.whackweapons.mod.WhackWeapons;
import com.whackweapons.mod.items.CustomItems;
import com.whackweapons.mod.rendering.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemShield;
import net.minecraft.item.Item.ToolMaterial;

public class CustomShield extends ItemShield implements IHasModel
{
	public CustomShield(String name)
	{
		setRegistryName(name);
		setUnlocalizedName(name);
		
		setCreativeTab(CreativeTabs.COMBAT);
		
		CustomItems.addItem(this);
	}

	@Override
	public void registerModels()
	{
		WhackWeapons.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
