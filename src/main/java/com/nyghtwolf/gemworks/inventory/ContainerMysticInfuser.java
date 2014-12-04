package com.nyghtwolf.gemworks.inventory;

import com.nyghtwolf.gemworks.block.TileEntityGemFuser;
import com.nyghtwolf.gemworks.block.TileEntityMysticInfuser;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;


public class ContainerMysticInfuser extends Container {
    public ContainerMysticInfuser(InventoryPlayer player, TileEntityMysticInfuser gemfuser) {

    }

    public boolean canInteractWith(EntityPlayer var1){

    return true;
}
}
