package com.nyghtwolf.gemworks.render;

import com.nyghtwolf.gemworks.gemworks;
import com.nyghtwolf.gemworks.model.ModelGemFuser;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;


public class RenderGemFuser extends TileEntitySpecialRenderer {
    public static final ResourceLocation textureGemFuser = new ResourceLocation(gemworks.modid + ":" + "textures/model/GemFuser.png");
    //public static final ResourceLocation texture = new ResourceLocation("gemworks:textures/model/GemFuser.png");

    private ModelGemFuser model;

    public RenderGemFuser(){
        this.model = new ModelGemFuser();
    }

    @Override
    public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float f){
        GL11.glPushMatrix();
            GL11.glTranslatef((float)x + 0.5F, (float)y +1.5F, (float)z + 0.5F);
            GL11.glRotatef(180, 0F, 0F,1F);

            this.bindTexture(textureGemFuser);

            GL11.glPushMatrix();
                this.model.RenderModel(0.0625F);

            GL11.glPopMatrix();
        GL11.glPopMatrix();
    }
}
