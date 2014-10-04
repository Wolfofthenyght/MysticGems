package com.nyghtwolf.gemworks.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelGemFuser extends ModelBase
{
  //fields
    ModelRenderer GemFuserBase;
    ModelRenderer GemFuserSupportBase;
    ModelRenderer Pedestal;
    ModelRenderer PedestalTopBase;
  
  public ModelGemFuser()
  {
    textureWidth = 128;
    textureHeight = 64;
    
      GemFuserBase = new ModelRenderer(this, 0, 0);
      GemFuserBase.addBox(0F, 0F, 0F, 12, 3, 12);
      GemFuserBase.setRotationPoint(-6F, 21F, -6F);
      GemFuserBase.setTextureSize(128, 64);
      GemFuserBase.mirror = true;
      setRotation(GemFuserBase, 0F, 0F, 0F);
      GemFuserSupportBase = new ModelRenderer(this, 48, 0);
      GemFuserSupportBase.addBox(0F, 0F, 0F, 8, 2, 8);
      GemFuserSupportBase.setRotationPoint(-4F, 19F, -4F);
      GemFuserSupportBase.setTextureSize(128, 64);
      GemFuserSupportBase.mirror = true;
      setRotation(GemFuserSupportBase, 0F, 0F, 0F);
      Pedestal = new ModelRenderer(this, 48, 10);
      Pedestal.addBox(0F, 0F, 0F, 6, 5, 6);
      Pedestal.setRotationPoint(-3F, 14F, -3F);
      Pedestal.setTextureSize(128, 64);
      Pedestal.mirror = true;
      setRotation(Pedestal, 0F, 0F, 0F);
      PedestalTopBase = new ModelRenderer(this, 0, 15);
      PedestalTopBase.addBox(0F, 0F, 0F, 14, 5, 10);
      PedestalTopBase.setRotationPoint(-7F, 9F, -5F);
      PedestalTopBase.setTextureSize(128, 64);
      PedestalTopBase.mirror = true;
      setRotation(PedestalTopBase, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    GemFuserBase.render(f5);
    GemFuserSupportBase.render(f5);
    Pedestal.render(f5);
    PedestalTopBase.render(f5);
  }

    public void RenderModel(float f){
        GemFuserBase.render(f);
        GemFuserSupportBase.render(f);
        Pedestal.render(f);
        PedestalTopBase.render(f);
    }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5,Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}