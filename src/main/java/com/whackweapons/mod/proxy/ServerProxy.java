package com.whackweapons.mod.proxy;

import net.minecraft.item.Item;

public class ServerProxy extends CommonProxy
{
	@Override
	public void registerItemRenderer(Item item, int i, String string)
	{
		// Since it's the server, we don't have to worry about rendering so do nothing.
	}
}
