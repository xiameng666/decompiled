import android.graphics.Bitmap;
import j..util.Objects;

final class gase implements gcrw {
    public final int a;
    public hdil b;
    public int c;
    public int d;
    public gcrv e;
    final gasf f;

    public gase(gasf gasf0, int v) {
        Objects.requireNonNull(gasf0);
        this.f = gasf0;
        super();
        this.a = v;
    }

    public final void c() {
        gcrv gcrv0 = this.e;
        if(gcrv0 != null) {
            gcrv0.k();
            this.e = null;
        }
        this.b = null;
    }

    @Override  // gcrw
    public final void lQ() {
    }

    @Override  // gcrw
    public final void lR(gcrv gcrv0, boolean z) {
        Bitmap bitmap0 = gcrv0.b();
        if(bitmap0 != null) {
            this.f.c(this, bitmap0);
        }
    }
}

