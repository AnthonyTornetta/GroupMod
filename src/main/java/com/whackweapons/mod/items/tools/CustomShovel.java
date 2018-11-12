package com.whackweapons.mod.items.tools;

import com.whackweapons.mod.WhackWeapons;
import com.whackweapons.mod.items.CustomItems;
import com.whackweapons.mod.rendering.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSpade;

public class CustomShovel extends ItemSpade implements IHasModel
{
	public CustomShovel(String name, ToolMaterial material)
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
