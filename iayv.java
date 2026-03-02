import j..util.Objects;
import java.net.SocketAddress;
import java.util.List;
import java.util.concurrent.TimeUnit;

final class iayv implements Runnable {
    final List a;
    final iazk b;

    public iayv(iazk iazk0, List list0) {
        this.a = list0;
        Objects.requireNonNull(iazk0);
        this.b = iazk0;
        super();
    }

    @Override
    public final void run() {
        ibbs ibbs0;
        iazk iazk0 = this.b;
        iaze iaze0 = iazk0.h;
        SocketAddress socketAddress0 = iaze0.b();
        iaze0.a = this.a;
        iaze0.c();
        iazk0.i = this.a;
        iall iall0 = iall.b;
        if(iazk0.r.a == iall0 || iazk0.r.a == iall.a) {
            int v = 0;
            while(v < iaze0.a.size()) {
                int v1 = ((ialw)iaze0.a.get(v)).b.indexOf(socketAddress0);
                if(v1 == -1) {
                    ++v;
                    continue;
                }
                iaze0.b = v;
                iaze0.c = v1;
                ibbs0 = null;
                goto label_31;
            }
            if(iazk0.r.a == iall0) {
                ibbs0 = iazk0.q;
                iazk0.q = null;
                iaze0.c();
                iazk0.d(iall.d);
            }
            else {
                iazk0.p.p(iapk.q.f("InternalSubchannel closed pending transport due to address change"));
                iazk.j(iazk0);
                iaze0.c();
                iazk0.i();
                ibbs0 = null;
            }
        }
        else {
            ibbs0 = null;
        }
    label_31:
        if(ibbs0 != null) {
            if(iazk0.l != null) {
                iazk0.m.p(iapk.q.f("InternalSubchannel closed transport early due to address change"));
                iazk0.l.a();
                iazk0.l = null;
            }
            iazk0.m = ibbs0;
            iayu iayu0 = new iayu(this);
            iazk0.l = iazk0.g.a(iayu0, 5L, TimeUnit.SECONDS, iazk0.b);
        }
    }
}

