package com.nyghtwolf.gemworks.gui;

import com.nyghtwolf.gemworks.block.TileEntityGemFuser;
import com.nyghtwolf.gemworks.gemworks;
import com.nyghtwolf.gemworks.inventory.ContainerGemFuser;
import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class GemworksGuiHandler implements IGuiHandler {

    @Override
    public Object getServerGuiElement (int ID, EntityPlayer player, World world, int x, int y, int z) {
        TileEntity tileEntity = world.getTileEntity(x,y,z);
        switch(ID){
            case gemworks.GuiGemfuser:
                if(tileEntity instanceof TileEntityGemFuser){
                    return new ContainerGemFuser(player.inventory, (TileEntityGemFuser) tileEntity);
                }
        }
        return null;
    }

    @Override
    public Object getClientGuiElement (int ID, EntityPlayer player, World world,int x, int y, int z) {

        TileEntity tileEntity = world.getTileEntity(x,y,z);
        switch(ID){
            case gemworks.GuiGemfuser:
                if(tileEntity instanceof TileEntityGemFuser){
                    return new GuiGemFuser(player.inventory, (TileEntityGemFuser) tileEntity);
                }
        }
        return null;
    }


}
