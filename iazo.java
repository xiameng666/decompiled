import j..util.Objects;
import java.util.concurrent.TimeUnit;

final class iazo implements Runnable {
    final iazr a;

    public iazo(iazr iazr0) {
        Objects.requireNonNull(iazr0);
        this.a = iazr0;
        super();
    }

    @Override
    public final void run() {
        iaym iaym0;
        iayn iayn0;
        boolean z;
        long v4;
        boolean z1;
        iazr iazr0 = this.a;
        synchronized(iazr0) {
            iazr0.f = null;
            int v1 = iazr0.k;
            z = true;
            if(v1 == 2) {
                iazr0.k = 4;
                iazr0.e = iazr0.c.schedule(iazr0.g, iazr0.j, TimeUnit.NANOSECONDS);
                z1 = true;
            }
            else {
                if(v1 == 3) {
                    long v2 = iazr0.d.a(TimeUnit.NANOSECONDS);
                    iazr0.f = iazr0.c.schedule(iazr0.h, iazr0.i - v2, TimeUnit.NANOSECONDS);
                    iazr0.k = 2;
                }
                z1 = false;
            }
        }
        if(z1) {
            iavn iavn0 = this.a.l.a;
            iazp iazp0 = new iazp(this.a.l);
            Object object0 = ((ibhj)iavn0).m;
            gmap gmap0 = gmap.a;
            synchronized(object0) {
                gftb.q(((ibhj)iavn0).k != null);
                if(((ibhj)iavn0).u) {
                    ((ibhj)iavn0).e();
                    iayn.b(iazp0, gmap0);
                    return;
                }
                iayn0 = ((ibhj)iavn0).t;
                if(iayn0 == null) {
                    v4 = ((ibhj)iavn0).h.nextLong();
                    gfug gfug0 = new gfug();
                    gfug0.f();
                    iayn iayn1 = new iayn(v4, gfug0);
                    ((ibhj)iavn0).t = iayn1;
                    ++((ibhj)iavn0).I.f;
                    iayn0 = iayn1;
                }
                else {
                    v4 = 0L;
                    z = false;
                }
                if(z) {
                    ((ibhj)iavn0).k.e(false, ((int)(v4 >>> 0x20)), ((int)v4));
                }
            }
            synchronized(iayn0) {
                if(!iayn0.d) {
                    iayn0.c.put(iazp0, gmap0);
                    return;
                }
                iaym0 = iayn0.e == null ? new iayl() : new iaym(iazp0);
            }
            iayn.a(gmap0, iaym0);
        }
    }
}

