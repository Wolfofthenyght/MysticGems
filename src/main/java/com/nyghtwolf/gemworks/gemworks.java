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

import static cpw.mods.fml.common.Mod.EventHandler;

@Mod(modid="gemworks", name="GemWorks", version="1.7.10-1.0a")
public class gemworks {

    @Mod.Instance("Gemworks")
    public static gemworks instance;
    public static final String modid = "gemworks";
   //public static final int GuiGemfuser = 0;

    //@SidedProxy(clientSide ="com.nyghtwolf.gemworks.proxy.ClientProxy", serverSide = "com.nyghtwolf.gemworks.proxy.ServerProxy")
    //@SidedProxy(clientSide = "com.nyghtwolf.gemworks.proxy.ClientProxy", serverSide = "com.nyghtwolf.gemworks.proxy.CommonProxy")

    @SidedProxy(clientSide="com.nyghtwolf.gemworks.proxy.ClientProxy", serverSide="com.nyghtwolf.gemworks.proxy.CommonProxy")

    public static CommonProxy Wolfproxy;
    //public static ClientProxy ClientProxy;


    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());

        //Items Init
        ModItems.init();

        //Block Init
        ModBlocks.init();

        //Entity Init
        ModTileEntities.init();

        //Recipes Init
        ModRecipes.init();

        //Renders Init
        Wolfproxy.registerRenderThings();
    }

    @EventHandler
    public void init(FMLInitializationEvent event){
        NetworkRegistry.INSTANCE.registerGuiHandler(modid, new GemworksGuiHandler());

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event){

    }
}