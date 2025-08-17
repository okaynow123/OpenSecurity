package pcl.opensecurity.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelRFIDReader extends ModelBase {
    public ModelRenderer reader;

    public ModelRFIDReader() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.reader = new ModelRenderer(this, 0, 0);
        this.reader.setRotationPoint(-3.0F, 22.0F, -6.0F);
        this.reader.addBox(0.0F, 0.0F, 0.0F, 7, 2, 11, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.reader.render(f5);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
