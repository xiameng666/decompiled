import j..util.Objects;

final class iayw implements Runnable {
    final iapk a;
    final iazk b;

    public iayw(iazk iazk0, iapk iapk0) {
        this.a = iapk0;
        Objects.requireNonNull(iazk0);
        this.b = iazk0;
        super();
    }

    @Override
    public final void run() {
        iazk iazk0 = this.b;
        iall iall0 = iall.e;
        if(iazk0.r.a != iall0) {
            iapk iapk0 = this.a;
            iazk0.s = iapk0;
            ibbs ibbs0 = iazk0.q;
            iavn iavn0 = iazk0.p;
            iazk0.q = null;
            iazk.j(iazk0);
            iazk0.d(iall0);
            iazk0.h.c();
            if(iazk0.n.isEmpty()) {
                iazk0.f();
            }
            iazk0.g.d();
            iapr iapr0 = iazk0.k;
            if(iapr0 != null) {
                iapr0.a();
                iazk0.k = null;
                iazk0.u = null;
            }
            iapr iapr1 = iazk0.l;
            if(iapr1 != null) {
                iapr1.a();
                iazk0.m.p(iapk0);
                iazk0.l = null;
                iazk0.m = null;
            }
            if(ibbs0 != null) {
                ibbs0.p(iapk0);
            }
            if(iavn0 != null) {
                iavn0.p(iapk0);
            }
        }
    }
}

