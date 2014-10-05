package com.nyghtwolf.gemworks.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelMysticInfuser extends ModelBase
{
  //fields
    ModelRenderer Support1;
    ModelRenderer Support2;
    ModelRenderer Support3;
    ModelRenderer Support4;
    ModelRenderer TableTop;
    ModelRenderer TableRunnerSideR;
    ModelRenderer TableRunnerSideL;
  
  public ModelMysticInfuser()
  {
    textureWidth = 64;
    textureHeight = 64;
    
      Support1 = new ModelRenderer(this, 16, 13);
      Support1.addBox(0F, 0F, 0F, 2, 8, 2);
      Support1.setRotationPoint(-6F, 16F, 4F);
      Support1.setTextureSize(64, 64);
      Support1.mirror = true;
      setRotation(Support1, 0F, 0F, 0F);
      Support2 = new ModelRenderer(this, 8, 13);
      Support2.addBox(0F, 0F, 0F, 2, 8, 2);
      Support2.setRotationPoint(-6F, 16F, -6F);
      Support2.setTextureSize(64, 64);
      Support2.mirror = true;
      setRotation(Support2, 0F, 0F, 0F);
      Support3 = new ModelRenderer(this, 0, 13);
      Support3.addBox(0F, 0F, 0F, 2, 8, 2);
      Support3.setRotationPoint(4F, 16F, -6F);
      Support3.setTextureSize(64, 64);
      Support3.mirror = true;
      setRotation(Support3, 0F, 0F, 0F);
      Support4 = new ModelRenderer(this, 24, 13);
      Support4.addBox(0F, 0F, 0F, 2, 8, 2);
      Support4.setRotationPoint(4F, 16F, 4F);
      Support4.setTextureSize(64, 64);
      Support4.mirror = true;
      setRotation(Support4, 0F, 0F, 0F);
      TableTop = new ModelRenderer(this, 0, 23);
      TableTop.addBox(0F, 0F, 0F, 14, 2, 14);
      TableTop.setRotationPoint(-7F, 14F, -7F);
      TableTop.setTextureSize(64, 64);
      TableTop.mirror = true;
      setRotation(TableTop, 0F, 0F, 0F);
      TableRunnerSideR = new ModelRenderer(this, 0, 47);
      TableRunnerSideR.addBox(0F, 0F, 0F, 0, 5, 8);
      TableRunnerSideR.setRotationPoint(7F, 16F, -4F);
      TableRunnerSideR.setTextureSize(64, 64);
      TableRunnerSideR.mirror = true;
      setRotation(TableRunnerSideR, 0F, 0F, 0F);
      TableRunnerSideL = new ModelRenderer(this, 16, 47);
      TableRunnerSideL.addBox(0F, 0F, 0F, 0, 5, 8);
      TableRunnerSideL.setRotationPoint(-7F, 16F, -4F);
      TableRunnerSideL.setTextureSize(64, 64);
      TableRunnerSideL.mirror = true;
      setRotation(TableRunnerSideL, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Support1.render(f5);
    Support2.render(f5);
    Support3.render(f5);
    Support4.render(f5);
    TableTop.render(f5);
    TableRunnerSideR.render(f5);
    TableRunnerSideL.render(f5);
  }

    public void RenderModel(float f){
        Support1.render(f);
        Support2.render(f);
        Support3.render(f);
        Support4.render(f);
        TableTop.render(f);
        TableRunnerSideR.render(f);
        TableRunnerSideL.render(f);
    }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}