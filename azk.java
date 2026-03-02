import android.graphics.Matrix;
import android.graphics.Rect;
import android.media.Image.Plane;
import android.media.Image;

final class azk implements bcn {
    private final Image a;
    private final azj[] b;
    private final bcg c;

    public azk(Image image0) {
        this.a = image0;
        Image.Plane[] arr_image$Plane = image0.getPlanes();
        if(arr_image$Plane == null) {
            this.b = new azj[0];
        }
        else {
            this.b = new azj[arr_image$Plane.length];
            for(int v = 0; v < arr_image$Plane.length; ++v) {
                this.b[v] = new azj(arr_image$Plane[v]);
            }
        }
        long v1 = image0.getTimestamp();
        Matrix matrix0 = new Matrix();
        this.c = new bcq(bms.a, v1, 0, matrix0, 0);
    }

    @Override  // bcn
    public final int a() {
        return this.a.getFormat();
    }

    @Override  // bcn
    public final int b() {
        return this.a.getHeight();
    }

    @Override  // bcn
    public final int c() {
        return this.a.getWidth();
    }

    @Override  // bcn
    public final void close() {
        this.a.close();
    }

    @Override  // bcn
    public final Image d() {
        return this.a;
    }

    @Override  // bcn
    public final bcg e() {
        return this.c;
    }

    @Override  // bcn
    public final void f(Rect rect0) {
        throw null;
    }

    @Override  // bcn
    public final bcm[] g() {
        return this.b;
    }
}

