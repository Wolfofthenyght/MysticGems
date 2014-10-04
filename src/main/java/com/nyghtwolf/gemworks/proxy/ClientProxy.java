package com.nyghtwolf.gemworks.proxy;

import com.nyghtwolf.gemworks.block.TileEntityGemFuser;
import com.nyghtwolf.gemworks.render.RenderGemFuser;
import cpw.mods.fml.client.registry.ClientRegistry;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxy extends CommonProxy {

    public void registerRenderThings(){
        //Gem Fuser Render
        TileEntitySpecialRenderer render = new RenderGemFuser();
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityGemFuser.class, render);

    }

    public void registerProxies(){

    }
    public void registerTileTEntitySpecialRenderer(){

    }
}
