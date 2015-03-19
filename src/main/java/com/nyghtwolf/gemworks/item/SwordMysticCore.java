package com.nyghtwolf.gemworks.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

//Define Specific Items
public class SwordMysticCore extends ItemSwordBaseTier1
{
    public SwordMysticCore()
    {
        super(GemToolMaterial.GemT1Material);
        this.setUnlocalizedName("SwordMysticCore");
    }
    public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entity){
        float var4 = 1.0F;
        int i = (int)(entity.prevPosX + (entity.posX - entity.prevPosX) * (double)var4);
        int j = (int)(entity.prevPosY + (entity.posY - entity.prevPosY) * (double)var4 + 1.62D - (double)entity.yOffset);
        int k = (int)(entity.prevPosZ + (entity.posZ - entity.prevPosZ) * (double)var4);

        if(true){
            entity.addPotionEffect(new PotionEffect(22,300, 1));
            entity.addPotionEffect(new PotionEffect(11,300, 1));
            entity.addPotionEffect(new PotionEffect(1,300, 1));
            entity.addPotionEffect(new PotionEffect(5,300, 1));
        }

        if(true){
            itemstack.damageItem(2, entity);
        }

        return itemstack;
    }
}