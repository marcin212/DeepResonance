package mcjty.deepresonance.items.armor;

// Date: 24/10/2015 20:12:38
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ChestModel extends ModelBiped {
    //fields
    ModelRenderer front;
    ModelRenderer back;
    ModelRenderer lefthand;
    ModelRenderer righthand;
    ModelRenderer leftarmside1;
    ModelRenderer rightarmside1;
    ModelRenderer leftarmside2;
    ModelRenderer rightarmside2;
    ModelRenderer leftarmfront;
    ModelRenderer rightarmfront;
    ModelRenderer leftarmback;
    ModelRenderer rightarmback;
    ModelRenderer leftshoulder;
    ModelRenderer rightshoulder;

    public ChestModel() {
        textureWidth = 64;
        textureHeight = 32;

        front = new ModelRenderer(this, 0, 0);
        front.addBox(0F, 0F, 0F, 8, 12, 1);
        front.setRotationPoint(-4F, 0F, -3F);
        front.setTextureSize(64, 32);
        front.mirror = true;
        setRotation(front, 0F, 0F, 0F);
        back = new ModelRenderer(this, 0, 0);
        back.addBox(0F, 0F, 0F, 8, 12, 1);
        back.setRotationPoint(-4F, 0F, 2F);
        back.setTextureSize(64, 32);
        back.mirror = true;
        setRotation(back, 0F, 0F, 0F);
        lefthand = new ModelRenderer(this, 34, 0);
        lefthand.addBox(0F, 0F, 0F, 4, 1, 4);
        lefthand.setRotationPoint(4F, 12F, -2F);
        lefthand.setTextureSize(64, 32);
        lefthand.mirror = true;
        setRotation(lefthand, 0F, 0F, 0F);
        righthand = new ModelRenderer(this, 34, 0);
        righthand.addBox(0F, 0F, 0F, 4, 1, 4);
        righthand.setRotationPoint(-8F, 12F, -2F);
        righthand.setTextureSize(64, 32);
        righthand.mirror = true;
        setRotation(righthand, 0F, 0F, 0F);
        leftarmside1 = new ModelRenderer(this, 18, 6);
        leftarmside1.addBox(0F, 0F, 0F, 1, 12, 4);
        leftarmside1.setRotationPoint(3F, 0F, -2F);
        leftarmside1.setTextureSize(64, 32);
        leftarmside1.mirror = true;
        setRotation(leftarmside1, 0F, 0F, 0F);
        rightarmside1 = new ModelRenderer(this, 18, 6);
        rightarmside1.addBox(0F, 0F, 0F, 1, 12, 4);
        rightarmside1.setRotationPoint(-4F, 0F, -2F);
        rightarmside1.setTextureSize(64, 32);
        rightarmside1.mirror = true;
        setRotation(rightarmside1, 0F, 0F, 0F);
        leftarmside2 = new ModelRenderer(this, 18, 6);
        leftarmside2.addBox(0F, 0F, 0F, 1, 12, 4);
        leftarmside2.setRotationPoint(8F, 0F, -2F);
        leftarmside2.setTextureSize(64, 32);
        leftarmside2.mirror = true;
        setRotation(leftarmside2, 0F, 0F, 0F);
        rightarmside2 = new ModelRenderer(this, 18, 6);
        rightarmside2.addBox(0F, 0F, 0F, 1, 12, 4);
        rightarmside2.setRotationPoint(-9F, 0F, -2F);
        rightarmside2.setTextureSize(64, 32);
        rightarmside2.mirror = true;
        setRotation(rightarmside2, 0F, 0F, 0F);
        leftarmfront = new ModelRenderer(this, 28, 6);
        leftarmfront.addBox(0F, 0F, 0F, 4, 12, 1);
        leftarmfront.setRotationPoint(4F, 0F, -3F);
        leftarmfront.setTextureSize(64, 32);
        leftarmfront.mirror = true;
        setRotation(leftarmfront, 0F, 0F, 0F);
        rightarmfront = new ModelRenderer(this, 28, 6);
        rightarmfront.addBox(0F, 0F, 0F, 4, 12, 1);
        rightarmfront.setRotationPoint(-8F, 0F, -3F);
        rightarmfront.setTextureSize(64, 32);
        rightarmfront.mirror = true;
        setRotation(rightarmfront, 0F, 0F, 0F);
        leftarmback = new ModelRenderer(this, 28, 6);
        leftarmback.addBox(0F, 0F, 0F, 4, 12, 1);
        leftarmback.setRotationPoint(4F, 0F, 2F);
        leftarmback.setTextureSize(64, 32);
        leftarmback.mirror = true;
        setRotation(leftarmback, 0F, 0F, 0F);
        rightarmback = new ModelRenderer(this, 28, 6);
        rightarmback.addBox(0F, 0F, 0F, 4, 12, 1);
        rightarmback.setRotationPoint(-8F, 0F, 2F);
        rightarmback.setTextureSize(64, 32);
        rightarmback.mirror = true;
        setRotation(rightarmback, 0F, 0F, 0F);
        leftshoulder = new ModelRenderer(this, 18, 0);
        leftshoulder.addBox(0F, 0F, 0F, 4, 2, 4);
        leftshoulder.setRotationPoint(4F, -2F, -2F);
        leftshoulder.setTextureSize(64, 32);
        leftshoulder.mirror = true;
        setRotation(leftshoulder, 0F, 0F, 0F);
        rightshoulder = new ModelRenderer(this, 18, 0);
        rightshoulder.addBox(0F, 0F, 0F, 4, 2, 4);
        rightshoulder.setRotationPoint(-8F, -2F, -2F);
        rightshoulder.setTextureSize(64, 32);
        rightshoulder.mirror = true;
        setRotation(rightshoulder, 0F, 0F, 0F);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(entity, f, f1, f2, f3, f4, f5);
        front.render(f5);
        back.render(f5);
        lefthand.render(f5);
        righthand.render(f5);
        leftarmside1.render(f5);
        rightarmside1.render(f5);
        leftarmside2.render(f5);
        rightarmside2.render(f5);
        leftarmfront.render(f5);
        rightarmfront.render(f5);
        leftarmback.render(f5);
        rightarmback.render(f5);
        leftshoulder.render(f5);
        rightshoulder.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void setRotationAngles(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    }

}