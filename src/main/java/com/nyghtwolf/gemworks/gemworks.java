package com.nyghtwolf.gemworks;

import com.nyghtwolf.gemworks.configuration.ConfigurationHandler;
import com.nyghtwolf.gemworks.gui.GemworksGuiHandler;
import com.nyghtwolf.gemworks.init.ModBlocks;
import com.nyghtwolf.gemworks.init.ModItems;
import com.nyghtwolf.gemworks.init.ModRecipes;
import com.nyghtwolf.gemworks.init.ModTileEntities;
import com.nyghtwolf.gemworks.proxy.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import scala.tools.nsc.settings.Final;

import static cpw.mods.fml.common.Mod.EventHandler;

@Mod(modid="gemworks", name="GemWorks", version="1.7.10-1.0a")
public class gemworks {

    @Mod.Instance("Gemworks")
    public static gemworks instance;
    public static final String modid = "gemworks";
    public static final int GuiGemfuser = 0;

   // @SidedProxy(clientSide ="com.nyghtwolf.gemworks.proxy.ClientProxy", serverSide = "com.nyghtwolf.gemworks.proxy.ServerProxy")
    @SidedProxy(clientSide = "com.nyghtwolf.gemworks.proxy.ClientProxy", serverSide = "com.nyghtwolf.gemworks.proxy.CommonProxy")
    public static CommonProxy proxy;


    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());

        ModItems.init();
        ModBlocks.init();
        ModTileEntities.init();
        ModRecipes.init();
    }

    @EventHandler
    public void init(FMLInitializationEvent event){
        NetworkRegistry.INSTANCE.registerGuiHandler(modid, new GemworksGuiHandler());
        proxy.registerProxies();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event){

    }
}