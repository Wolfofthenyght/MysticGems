package com.nyghtwolf.gemworks.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

//Define Specific Items
public class SwordMysticRegalT3 extends ItemSwordBaseTier3
{
    public SwordMysticRegalT3()
    {
        super(GemT3Material.GemT3Material);
        this.setUnlocalizedName("SwordMysticRegalT3");
    }
    public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entity){
        float var4 = 1.0F;
        int i = (int)(entity.prevPosX + (entity.posX - entity.prevPosX) * (double)var4);
        int j = (int)(entity.prevPosY + (entity.posY - entity.prevPosY) * (double)var4 + 1.62D - (double)entity.yOffset);
        int k = (int)(entity.prevPosZ + (entity.posZ - entity.prevPosZ) * (double)var4);

        if(true){
            entity.addPotionEffect(new PotionEffect(22,500, 3));
            entity.addPotionEffect(new PotionEffect(11,500, 3));
            entity.addPotionEffect(new PotionEffect(1,500, 3));
            entity.addPotionEffect(new PotionEffect(5,500, 3));
        }

        if(true){
            itemstack.damageItem(4, entity);
        }

        return itemstack;
    }
}