package com.nyghtwolf.gemworks.gui;

import com.nyghtwolf.gemworks.block.TileEntityGemFuser;
import com.nyghtwolf.gemworks.block.TileEntityMysticInfuser;
import com.nyghtwolf.gemworks.inventory.ContainerGemFuser;
import com.nyghtwolf.gemworks.inventory.ContainerMysticInfuser;
import com.nyghtwolf.gemworks.reference.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

public class GuiMysticInfuser extends GuiContainer {

    public static ResourceLocation textureguiMysticInfuser= new ResourceLocation(Reference.MOD_ID.toLowerCase(), "assets/textures/gui/guiMysticInfuser.png");

    public GuiMysticInfuser(InventoryPlayer player, TileEntityMysticInfuser MysticInfuser){
        super(new ContainerMysticInfuser(player, MysticInfuser));
        this.xSize = 176;
        this.ySize = 166;
    }

    protected void drawGuiContainerBackgroundLayer (float var1, int var2,
            int var3) {
        Minecraft.getMinecraft().getTextureManager().bindTexture(textureguiMysticInfuser);
        this.drawTexturedModalRect(guiLeft, guiTop,0,0,xSize,ySize);
    }
}
