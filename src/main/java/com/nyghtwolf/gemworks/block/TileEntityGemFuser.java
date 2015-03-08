package com.nyghtwolf.gemworks.block;

import com.nyghtwolf.gemworks.GemFuserRecipes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;


public class TileEntityGemFuser extends TileEntity implements IInventory{

    public void updateEntity()
    {
        super.updateEntity();

        this.fuseItems();
    }

    private boolean canFuse()
    {
        if (this.gemFuserInventoryStacks[0] == null && this.gemFuserInventoryStacks[1] == null)//If there is nothing in the slots...
        {
            return false;
        }
        else
        {
            ItemStack itemstack = GemFuserRecipes.fusing().getGemfuseResult(this.gemFuserInventoryStacks[0], this.gemFuserInventoryStacks[1]);
            if (itemstack == null) return false;//If there is no output for the supplied items in the input slots...
            if (this.gemFuserInventoryStacks[2] == null) return true;//If the output slot isn't already occupied...
            if (!this.gemFuserInventoryStacks[2].isItemEqual(itemstack)) return false;//If the output slot IS occupied by a different item...
        }
        return false;
    }

    /**
     * Turn one item from the furnace source stack into the appropriate smelted item in the furnace result stack
     */
    public void fuseItems()
    {

        ItemStack itemstack = GemFuserRecipes.fusing().getGemfuseResult(this.gemFuserInventoryStacks[0], this.gemFuserInventoryStacks[1]);
        if (this.canFuse())
        {

            if (this.gemFuserInventoryStacks[2] == null)
            {
                this.gemFuserInventoryStacks[2] = itemstack.copy();
            }
        }

        if (itemstack == null)
        {
            this.gemFuserInventoryStacks[2] = null;
        }
    }

	private ItemStack[] gemFuserInventoryStacks = new ItemStack[3];

	public int getSizeInventory()
    {
        return this.gemFuserInventoryStacks.length;
    }

    /**
     * Returns the stack in slot i
     */
    public ItemStack getStackInSlot(int p_70301_1_)
    {
        return this.gemFuserInventoryStacks[p_70301_1_];
    }

    /**
     * Removes from an inventory slot (first arg) up to a specified number (second arg) of items and returns them in a
     * new stack.
     */
    public ItemStack decrStackSize(int p_70298_1_, int p_70298_2_)
    {
        if (this.gemFuserInventoryStacks[p_70298_1_] != null)
        {
            ItemStack itemstack;

            if (this.gemFuserInventoryStacks[p_70298_1_].stackSize <= p_70298_2_)
            {
                itemstack = this.gemFuserInventoryStacks[p_70298_1_];
                this.gemFuserInventoryStacks[p_70298_1_] = null;
                return itemstack;
            }
            else
            {
                itemstack = this.gemFuserInventoryStacks[p_70298_1_].splitStack(p_70298_2_);

                if (this.gemFuserInventoryStacks[p_70298_1_].stackSize == 0)
                {
                    this.gemFuserInventoryStacks[p_70298_1_] = null;
                }

                return itemstack;
            }
        }
        else
        {
            return null;
        }
    }

    /**
     * When some containers are closed they call this on each slot, then drop whatever it returns as an EntityItem -
     * like when you close a workbench GUI.
     */
    public ItemStack getStackInSlotOnClosing(int p_70304_1_)
    {
        if (this.gemFuserInventoryStacks[p_70304_1_] != null)
        {
            ItemStack itemstack = this.gemFuserInventoryStacks[p_70304_1_];
            this.gemFuserInventoryStacks[p_70304_1_] = null;
            return itemstack;
        }
        else
        {
            return null;
        }
    }

    /**
     * Sets the given item stack to the specified slot in the inventory (can be crafting or armor sections).
     */
    public void setInventorySlotContents(int p_70299_1_, ItemStack p_70299_2_)
    {
        this.gemFuserInventoryStacks[p_70299_1_] = p_70299_2_;

        if (p_70299_2_ != null && p_70299_2_.stackSize > this.getInventoryStackLimit())
        {
            p_70299_2_.stackSize = this.getInventoryStackLimit();
        }
    }

    /**
     * Returns the name of the inventory
     */
    public String getInventoryName()
    {
        return "container.furnace";
    }

    /**
     * Returns if the inventory is named
     */
    public boolean hasCustomInventoryName()
    {
        return false;
    }

    public void readFromNBT(NBTTagCompound p_145839_1_)
    {
        super.readFromNBT(p_145839_1_);
        NBTTagList nbttaglist = p_145839_1_.getTagList("Items", 10);
        this.gemFuserInventoryStacks = new ItemStack[this.getSizeInventory()];

        for (int i = 0; i < nbttaglist.tagCount(); ++i)
        {
            NBTTagCompound nbttagcompound1 = nbttaglist.getCompoundTagAt(i);
            byte b0 = nbttagcompound1.getByte("Slot");

            if (b0 >= 0 && b0 < this.gemFuserInventoryStacks.length)
            {
                this.gemFuserInventoryStacks[b0] = ItemStack.loadItemStackFromNBT(nbttagcompound1);
            }
        }
    }

    public void writeToNBT(NBTTagCompound p_145841_1_)
    {
        super.writeToNBT(p_145841_1_);
        NBTTagList nbttaglist = new NBTTagList();

        for (int i = 0; i < this.gemFuserInventoryStacks.length; ++i)
        {
            if (this.gemFuserInventoryStacks[i] != null)
            {
                NBTTagCompound nbttagcompound1 = new NBTTagCompound();
                nbttagcompound1.setByte("Slot", (byte)i);
                this.gemFuserInventoryStacks[i].writeToNBT(nbttagcompound1);
                nbttaglist.appendTag(nbttagcompound1);
            }
        }

        p_145841_1_.setTag("Items", nbttaglist);
    }

    /**
     * Returns the maximum stack size for a inventory slot.
     */
    public int getInventoryStackLimit()
    {
        return 64;
    }

    public boolean isUseableByPlayer(EntityPlayer p_70300_1_)
    {
        return this.worldObj.getTileEntity(this.xCoord, this.yCoord, this.zCoord) != this ? false : p_70300_1_.getDistanceSq((double)this.xCoord + 0.5D, (double)this.yCoord + 0.5D, (double)this.zCoord + 0.5D) <= 64.0D;
    }

    public void openInventory() {}

    public void closeInventory() {}

    //This turns our last slot into an output slot. Items cannot be placed into it by the player. THIS DOESN'T SEEM TO WORK. :( SO we'll achieve this in the container with our custom slot.
    public boolean isItemValidForSlot(int slot, ItemStack is)
    {
        return slot == 2 ? false : true;
    }
}