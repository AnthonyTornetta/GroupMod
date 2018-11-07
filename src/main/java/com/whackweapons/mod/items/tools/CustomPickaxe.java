package com.whackweapons.mod.items.tools;

import com.whackweapons.mod.WhackWeapons;
import com.whackweapons.mod.items.CustomItems;
import com.whackweapons.mod.rendering.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class CustomPickaxe extends ItemPickaxe implements IHasModel
{
	public CustomPickaxe(String name, ToolMaterial material)
	{
		super(material);
		
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
