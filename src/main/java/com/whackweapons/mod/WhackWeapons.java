package com.whackweapons.mod;

import org.apache.logging.log4j.Logger;

import com.whackweapons.mod.proxy.CommonProxy;
import com.whackweapons.mod.util.Reference;
import com.whackweapons.mod.world.CustomWorldGeneration;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

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
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
