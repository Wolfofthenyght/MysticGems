package com.nyghtwolf.gemworks.gui;

import com.nyghtwolf.gemworks.block.TileEntityGemFuser;
import com.nyghtwolf.gemworks.inventory.ContainerGemFuser;
import com.nyghtwolf.gemworks.reference.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

public class GuiGemFuser extends GuiContainer {

    public static ResourceLocation textureguiGemFuser = new ResourceLocation(Reference.MOD_ID.toLowerCase(), "assets/textures/gui/guiGemFuser.png");

    public GuiGemFuser (InventoryPlayer player, TileEntityGemFuser Gemfuser){
        super(new ContainerGemFuser(player, Gemfuser));
        this.xSize = 176;
        this.ySize = 166;
    }

    protected void drawGuiContainerBackgroundLayer (float var1, int var2,
            int var3) {
        Minecraft.getMinecraft().getTextureManager().bindTexture(textureguiGemFuser);
        this.drawTexturedModalRect(guiLeft, guiTop,0,0,xSize,ySize);
    }
}
