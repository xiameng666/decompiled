import android.util.Size;

public final class bwd implements Runnable {
    public final bwg a;
    public final bel b;
    public final bvs c;

    public bwd(bwg bwg0, bel bel0, bvs bvs0) {
        this.a = bwg0;
        this.b = bel0;
        this.c = bvs0;
    }

    @Override
    public final void run() {
        bwf bwf0 = this.a.d;
        bwf0.a();
        bel bel0 = this.b;
        if(bwf0.d) {
            bwf0.d = false;
            bel0.e();
            return;
        }
        bwf0.b = bel0;
        bwf0.f = this.c;
        Size size0 = bel0.b;
        bwf0.a = size0;
        bwf0.c = false;
        if(!bwf0.b()) {
            bcs.h("SurfaceViewImpl");
            bwf0.e.c.getHolder().setFixedSize(size0.getWidth(), size0.getHeight());
        }
    }
}

