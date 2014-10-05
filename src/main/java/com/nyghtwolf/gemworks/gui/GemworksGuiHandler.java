package com.nyghtwolf.gemworks.gui;

import com.nyghtwolf.gemworks.block.BlockGemFuser;
import com.nyghtwolf.gemworks.block.TileEntityGemFuser;
import com.nyghtwolf.gemworks.gemworks;
import com.nyghtwolf.gemworks.inventory.ContainerGemFuser;
import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class GemworksGuiHandler implements IGuiHandler {

    public static int guiID = 0;
    public static int GemFuser = guiID++;

    @Override
    public Object getServerGuiElement (int ID, EntityPlayer player, World world, int x, int y, int z) {
        TileEntity entity = world.getTileEntity(x, y, z);
        if(ID == GemFuser){
            return new ContainerGemFuser(player.inventory, (TileEntityGemFuser)entity);
        }
        return null;
    }

    @Override
    public Object getClientGuiElement (int ID, EntityPlayer player, World world,int x, int y, int z) {

        TileEntity entity = world.getTileEntity(x, y, z);
        if(ID == GemFuser){
            return new GuiGemFuser(player.inventory, (TileEntityGemFuser)entity);
        }
        return null;
    }
}
