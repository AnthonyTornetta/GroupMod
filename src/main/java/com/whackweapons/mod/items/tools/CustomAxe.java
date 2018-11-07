package com.whackweapons.mod.items.tools;

import com.whackweapons.mod.WhackWeapons;
import com.whackweapons.mod.items.CustomItems;
import com.whackweapons.mod.rendering.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

public class CustomAxe extends ItemAxe implements IHasModel
{
	public CustomAxe(String name, ToolMaterial material)
	{
		super(material, material.getAttackDamage(), -3.0f);
		
		setRegistryName(name);
		setUnlocalizedName(name);
		
		setCreativeTab(CreativeTabs.TOOLS);
		
		CustomItems.addItem(this);
	}

	@Override
	public void registerModels()
	{
		WhackWeapons.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
