package com.nyghtwolf.gemworks.inventory;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.nyghtwolf.gemworks.block.TileEntityGemFuser;


public class ContainerGemFuser extends Container {

	///This contains all of the slots for  container, not the player inventory. HOWEVER, since our tileentity implements IInventory, we use the tileentity instead.
	//public IInventory gemFuserInventory = new InventoryBasic("container.gemFuser", false, 3);
	private World worldObj;
	private int posX;
	private int posY;
	private int posZ; 

	public ContainerGemFuser(InventoryPlayer player, TileEntityGemFuser gemfuser){
		posX = gemfuser.xCoord;
		posY = gemfuser.yCoord;
		posZ = gemfuser.zCoord;
		worldObj = gemfuser.getWorldObj();

		//Add the player's inventory:
		int i1, l;
		//These are the 3x9 slots.
		for (l = 0; l < 3; ++l){
			for (i1 = 0; i1 < 9; ++i1){
				this.addSlotToContainer(new Slot(player, i1 + l * 9 + 9, 8 + i1 * 18, 84 + l * 18));
			}
		}
		//These are the hotbar slots.
		for (l = 0; l < 9; ++l){
			this.addSlotToContainer(new Slot(player, l, 8 + l * 18, 142));
		}


		//And now to add ours!
		this.addSlotToContainer(new Slot(gemfuser, 0, 56, 17));//inventory, id_of_slot, xpos, ypos
		this.addSlotToContainer(new Slot(gemfuser, 1, 56, 53));
		//these are basic slots, however, below is a custom slot which is defined in this class, pretty neat.
		this.addSlotToContainer(new MySlot(gemfuser, 2, 116, 35, player.player));
	}

	//Our custom slot!!
	private static class MySlot extends Slot
	{
		EntityPlayer player;
		public MySlot(IInventory i, int id, int x, int y, EntityPlayer p)
		{
			super(i, id, x, y);
			this.player = p;
		}

		//Decides which items can be placed inside the slot by the player.
		public boolean isItemValid(ItemStack is)
		{
			return false;
		}

		//You can trigger achievements in here.
		public void onPickupFromSlot(EntityPlayer p_82870_1_, ItemStack p_82870_2_)
		{
            //te.decrStackSize(0, 1);
            //te.decrStackSize(1, 1);
            this.onCrafting(p_82870_2_);
			super.onPickupFromSlot(p_82870_1_, p_82870_2_);
		}
	}

	public boolean canInteractWith(EntityPlayer var1){

		return true;
	}
    public ItemStack transferStackInSlot(EntityPlayer p_82846_1_, int p_82846_2_)
    {
        return null;//This stops you from shift clicking items. Change this by looking at ContainerFurnace's transferStackInSlot.
    }
}
