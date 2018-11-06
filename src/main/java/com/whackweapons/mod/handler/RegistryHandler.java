package com.whackweapons.mod.handler;

import com.whackweapons.mod.blocks.CustomBlocks;
import com.whackweapons.mod.items.CustomItems;
import com.whackweapons.mod.rendering.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class RegistryHandler
{
	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event)
	{
		event.getRegistry().registerAll(CustomItems.ITEMS.toArray(new Item[0]));
	}
	
	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event)
	{
		event.getRegistry().registerAll(CustomBlocks.BLOCKS.toArray(new Block[0]));
	}
	
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event)
	{
		for(Item item : CustomItems.ITEMS)
			if(item instanceof IHasModel)
				((IHasModel)item).registerModels();
		
		for(Block block : CustomBlocks.BLOCKS)
			if(block instanceof IHasModel)
				((IHasModel)block).registerModels();
	}
}
