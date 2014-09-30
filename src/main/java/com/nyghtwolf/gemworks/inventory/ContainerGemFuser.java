package com.nyghtwolf.gemworks.inventory;

import com.nyghtwolf.gemworks.block.TileEntityGemFuser;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;


public class ContainerGemFuser extends Container {
    public ContainerGemFuser(InventoryPlayer player, TileEntityGemFuser gemfuser) {

    }

    public boolean canInteractWith(EntityPlayer var1){

    return true;
}
}
