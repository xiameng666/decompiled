import android.graphics.Bitmap;

public final class bmyk implements lqj {
    public final bmym a;

    public bmyk(bmym bmym0) {
        this.a = bmym0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        bmym bmym0 = this.a;
        if(bmcn.d) {
            bmym0.d.setImageBitmap(((Bitmap)object0));
        }
        else {
            bmym0.c.setImageBitmap(((Bitmap)object0));
        }
        bmym0.y();
    }
}

