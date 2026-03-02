import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

final class ri extends kw {
    public boolean a;

    public ri(Drawable drawable0) {
        super(drawable0);
        this.a = true;
    }

    @Override  // kw
    public final void draw(Canvas canvas0) {
        if(this.a) {
            super.draw(canvas0);
        }
    }

    @Override  // kw
    public final void setHotspot(float f, float f1) {
        if(this.a) {
            super.setHotspot(f, f1);
        }
    }

    @Override  // kw
    public final void setHotspotBounds(int v, int v1, int v2, int v3) {
        if(this.a) {
            super.setHotspotBounds(v, v1, v2, v3);
        }
    }

    @Override  // kw
    public final boolean setState(int[] arr_v) {
        return this.a ? super.setState(arr_v) : false;
    }

    @Override  // kw
    public final boolean setVisible(boolean z, boolean z1) {
        return this.a ? super.setVisible(z, z1) : false;
    }
}

