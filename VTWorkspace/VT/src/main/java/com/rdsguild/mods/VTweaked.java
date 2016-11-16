package com.rdsguild.mods;

import com.rdsguild.mods.proxies.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, version = Reference.VERSION, name = Reference.NAME, useMetadata = true)
public class VTweaked
{
	@Instance(Reference.MODID)
	public VTweaked instance;
	
    @SidedProxy(clientSide = Reference.CLIENT_SERVER_PROXY, serverSide = Reference.SERVER_SERVER_PROXY, modId = Reference.MODID)
    public static CommonProxy proxy;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	   	
        System.out.println("Red Dragons Guild" + ":" + Reference.MODID + ":" + " PreInitializationEvent Started!");
        
        proxy.preInit();
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        
        System.out.println("Red Dragons Guild" + ": " + Reference.MODID + ":" + " InitializationEvent Started!");
        
        proxy.init();
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        
        System.out.println("Red Dragons Guild" + ": " + Reference.MODID + ":" + " PostInitializationEvent Started!");
        
        proxy.postInit();
    }
    
    public static String prependModID(String name) {
    	
    	return Reference.MODID + ":" + name;
    }
}
