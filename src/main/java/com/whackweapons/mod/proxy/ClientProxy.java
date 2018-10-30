package com.whackweapons.mod.proxy;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class ClientProxy extends CommonProxy
{
	@Override
	public void registerItemRenderer(Item item, int metaData, String id)
	{
		ModelLoader.setCustomModelResourceLocation(item, metaData, new ModelResourceLocation(item.getRegistryName(), id));
	}
}
