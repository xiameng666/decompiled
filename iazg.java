import j..util.Objects;
import java.util.concurrent.TimeUnit;

final class iazg implements Runnable {
    final iapk a;
    final iazi b;

    public iazg(iazi iazi0, iapk iapk0) {
        this.a = iapk0;
        Objects.requireNonNull(iazi0);
        this.b = iazi0;
        super();
    }

    @Override
    public final void run() {
        iazi iazi0 = this.b;
        iazk iazk0 = iazi0.c;
        if(iazk0.r.a != iall.e) {
            boolean z = false;
            iavn iavn0 = iazi0.a;
            if(iazk0.q == iavn0) {
                iazk0.q = null;
                iazk0.h.c();
                iazk0.d(iall.d);
                return;
            }
            if(iazk0.p == iavn0) {
                gftb.u(iazk0.r.a == iall.a, "Expected state is CONNECTING, actual state is %s", iazk0.r.a);
                iaze iaze0 = iazk0.h;
                ialw ialw0 = (ialw)iaze0.a.get(iaze0.b);
                int v = iaze0.c + 1;
                iaze0.c = v;
                if(v >= ialw0.b.size()) {
                    ++iaze0.b;
                    iaze0.c = 0;
                }
                if(iaze0.b >= iaze0.a.size()) {
                    iazk.j(iazk0);
                    iaze0.c();
                    iapk iapk0 = this.a;
                    iaps iaps0 = iazk0.g;
                    iaps0.d();
                    gftb.b(((boolean)(iapk0.h() ^ 1)), "The error status must not be OK");
                    iazk0.e(new ialm(iall.c, iapk0));
                    if(!iazk0.e) {
                        if(iazk0.u == null) {
                            iazk0.u = new iaxr();
                        }
                        long v1 = iazk0.u.a() - iazk0.j.a(TimeUnit.NANOSECONDS);
                        Object[] arr_object = {iazk.k(iapk0), v1};
                        iazk0.d.b(2, "TRANSIENT_FAILURE ({0}). Will reconnect after {1} ns", arr_object);
                        if(iazk0.k == null) {
                            z = true;
                        }
                        gftb.r(z, "previous reconnectTask is not done");
                        iazk0.k = iaps0.a(new iays(iazk0), v1, TimeUnit.NANOSECONDS, iazk0.b);
                    }
                }
                else {
                    iazk0.i();
                }
            }
        }
    }
}

