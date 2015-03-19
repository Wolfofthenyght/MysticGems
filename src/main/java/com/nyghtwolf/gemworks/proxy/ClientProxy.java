package com.nyghtwolf.gemworks.proxy;

import com.nyghtwolf.gemworks.block.TileEntityGemFuser;
import com.nyghtwolf.gemworks.block.TileEntityMysticInfuser;
import com.nyghtwolf.gemworks.render.RenderGemFuser;
import com.nyghtwolf.gemworks.render.RenderMysticInfuser;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;

public class ClientProxy extends CommonProxy {

    public void registerRenderThings(){
        //Gem Fuser Render
        TileEntitySpecialRenderer render = new RenderGemFuser();
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityGemFuser.class, render);

        //Mystic Infuser Render
        TileEntitySpecialRenderer render2 = new RenderMysticInfuser();
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityMysticInfuser.class, render2);
        }
    //Mystic Core Armor Render
    public int addArmor(String armor){
        return RenderingRegistry.addNewArmourRendererPrefix(armor);
    }

    public void registerTileTEntitySpecialRenderer(){

    }
}
