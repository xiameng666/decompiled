import java.util.concurrent.Executor;

public final class bfq {
    bgt a;
    public bdm b;
    bdm c;
    bdm d;
    public bgq e;
    public bfp f;
    public bge g;

    public bfq() {
        this.a = null;
        this.g = null;
    }

    public final int a() {
        boj.b();
        kay.d(this.b != null, "The ImageReader is not initialized.");
        bdm bdm0 = this.b;
        Object object0 = bdm0.a;
        return bdm0.d.c() - bdm0.b;
    }

    public static bkq b(bco bco0, int v, int v1, int v2) {
        return bco0 == null ? bcp.a(v, v1, v2, 4) : bco0.a();
    }

    final void c(bgt bgt0) {
        boj.b();
        boolean z = false;
        kay.d(bgt0.i.size() == 1, "only one capture stage is supported.");
        if(this.a() > 0) {
            z = true;
        }
        kay.d(z, "Too many acquire images. Close image to be able to process next.");
        this.a = bgt0;
        bfo bfo0 = new bfo(this, bgt0);
        Executor executor0 = bol.a();
        bpt.j(bgt0.j, bfo0, executor0);
    }

    final void d(bgx bgx0) {
        boj.b();
        bgt bgt0 = this.a;
        if(bgt0 != null) {
            int v = bgt0.a;
            if(v == bgx0.a) {
                bcs.e("ProcessingRequest", "onCaptureFailure: request ID = " + v, bgx0.b);
                boj.b();
                if(!bgt0.l.e) {
                    throw null;
                }
            }
        }
    }

    public final void e(bkq bkq0) {
        bkq0.j(new bfi(this), bow.a());
    }
}

