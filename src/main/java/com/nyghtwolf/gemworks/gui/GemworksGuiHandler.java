package com.nyghtwolf.gemworks.gui;

import com.nyghtwolf.gemworks.block.TileEntityMysticInfuser;
import com.nyghtwolf.gemworks.inventory.ContainerGemFuser;
import com.nyghtwolf.gemworks.inventory.ContainerMysticInfuser;
import net.minecraft.client.gui.inventory.GuiChest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.ContainerChest;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.world.World;
import com.nyghtwolf.gemworks.block.TileEntityGemFuser;
import com.nyghtwolf.gemworks.gui.GuiGemFuser;

import cpw.mods.fml.common.network.IGuiHandler;

//public class GemworksGuiHandler implements IGuiHandler {

  //  public static int guiID = 0;
    //public static int GemFuser = guiID++;

    //@Override
    //public Object getServerGuiElement (int ID, EntityPlayer player, World world, int x, int y, int z) {
      //  TileEntity entity = world.getTileEntity(x, y, z);
       // if(ID == GemFuser){
         //   return new ContainerGemFuser(player.inventory, (TileEntityGemFuser)entity);
       // }
       // return null;
//}

//@Override
//public Object getClientGuiElement (int ID, EntityPlayer player, World world,int x, int y, int z) {

//TileEntity entity = world.getTileEntity(x, y, z);
// if(ID == GemFuser){
//     return new GuiGemFuser(player.inventory, (TileEntityGemFuser)entity);
//  }
//  return null;
// }
//}

public class GemworksGuiHandler implements IGuiHandler{
    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {
        TileEntity tileEntity = world.getTileEntity(x, y, z);
        if(tileEntity !=null){
            switch(ID){
                case 0: return new ContainerGemFuser(player.inventory, (TileEntityGemFuser)tileEntity);
                case 1: return new ContainerChest(player.inventory, (TileEntityChest)tileEntity);
                case 2: return new ContainerMysticInfuser(player.inventory, (TileEntityMysticInfuser)tileEntity);
            }
        }
        if (ID == 3){
            return new ContainerForge(player.inventory, world,x,y,x));
        }
        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {
        TileEntity tileEntity = world.getTileEntity(x,y,z);

        if(tileEntity != null)
        {
            switch(ID)
            {
                case 0: return new GuiGemFuser(player.inventory, (TileEntityGemFuser)tileEntity);
                case 1: return new GuiChest(player.inventory, (TileEntityChest)tileEntity);
                case 2: return new GuiMysticInfuser(player.inventory, (TileEntityMysticInfuser)tileEntity);
            }
        }
        if (ID == 3)
        {
            return new GuiForge(player.inventory, world, x,y,x);
        }
        return null;
    }
}

