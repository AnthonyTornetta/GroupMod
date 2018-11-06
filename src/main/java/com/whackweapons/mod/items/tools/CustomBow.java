package com.whackweapons.mod.items.tools;

import com.whackweapons.mod.WhackWeapons;
import com.whackweapons.mod.items.CustomItems;
import com.whackweapons.mod.rendering.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemSnowball;
import net.minecraft.item.ItemStack;


public class CustomBow extends ItemBow implements IHasModel
{
	public CustomBow()
	{
		setRegistryName("CUSTOM_BOW");
		setUnlocalizedName("CUSTOM_BOW");
		
		CustomItems.addItem(this);
		setCreativeTab(CreativeTabs.COMBAT);
	}
    
	@Override
	protected boolean isArrow(ItemStack stack)
	{
		return stack.getItem() instanceof ItemSnowball;
	}

	@Override
	public void registerModels()
	{
		WhackWeapons.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
