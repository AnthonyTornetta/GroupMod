package com.whackweapons.mod;

import org.apache.logging.log4j.Logger;

import com.whackweapons.mod.blocks.BlockBase;
import com.whackweapons.mod.blocks.CustomBlocks;
import com.whackweapons.mod.items.CustomItems;
import com.whackweapons.mod.items.ItemBase;
import com.whackweapons.mod.proxy.CommonProxy;
import com.whackweapons.mod.util.Reference;
import com.whackweapons.mod.world.CustomWorldGeneration;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class WhackWeapons
{
	@Instance
	public static WhackWeapons instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
    private static Logger logger;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	GameRegistry.registerWorldGenerator(new CustomWorldGeneration(), 3);
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        logger.info("Whack Weapons is adding some whack things...");
    	
        for(Item item : CustomItems.ITEMS)
		{
			if(item instanceof ItemBase)
			{
				ItemBase ib = (ItemBase)item;
				if(ib.shouldBeOreDictRegistered())
					ib.registerInOreDict();
			}
		}
    	
    	for(Block block : CustomBlocks.BLOCKS)
		{
			if(block instanceof BlockBase)
			{
				BlockBase bb = (BlockBase) block;
				if(bb.shouldBeOreDictRegistered())
					bb.registerInOreDict();
			}
		}
        
    	GameRegistry.addSmelting(CustomBlocks.RUBY_ORE_BLOCK, new ItemStack(CustomItems.RUBY_ITEM), 20f);
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    	
    }
}
