package com.whackweapons.mod.proxy;

import net.minecraft.item.Item;

public abstract class CommonProxy
{	
	public abstract void registerItemRenderer(Item item, int metaData, String id);
}
