import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class iatv implements iaty, ibbt {
    private boolean a;
    private final int b;
    private boolean c;
    private boolean d;
    private Runnable e;
    private boolean f;
    public iavr j;
    public final Object k;
    public final ibfu l;
    public final ibbw m;
    public int n;
    public boolean o;
    public final ibfn p;
    public iava q;
    public ialv r;
    public volatile boolean s;
    public boolean t;

    protected iatv(int v, ibfn ibfn0, ibfu ibfu0) {
        this.k = new Object();
        this.l = ibfu0;
        ibbw ibbw0 = new ibbw(this, ialf.a, v, ibfn0, ibfu0);
        this.m = ibbw0;
        this.j = ibbw0;
        this.b = 0x8000;
        this.r = ialv.b;
        this.d = false;
        this.p = ibfn0;
    }

    private final void c() {
        synchronized(this.k) {
            boolean z = this.i();
            if(!z) {
                Logger logger0 = iatw.t;
                if(logger0.isLoggable(Level.FINEST)) {
                    logger0.logp(Level.FINEST, "io.grpc.internal.AbstractStream$TransportState", "notifyIfReady", "Stream not ready so skip notifying listener.\ndetails: allocated/deallocated:{0}/{3}, sent queued: {1}, ready thresh: {2}", new Object[]{Boolean.valueOf(this.a), ((int)this.n), ((int)this.b), Boolean.valueOf(this.o)});
                }
            }
        }
        if(z) {
            this.q.e();
        }
    }

    protected void d() {
        gftb.q(this.q != null);
        synchronized(this.k) {
            gftb.r(((boolean)(this.a ^ 1)), "Already allocated");
            this.a = true;
        }
        this.c();
    }

    @Override  // ibbt
    public final void g(ibfp ibfp0) {
        this.q.d(ibfp0);
    }

    public final void h(int v) {
        synchronized(this.k) {
            gftb.r(this.a, "onStreamAllocated was not called, but it seems the stream is active");
            int v2 = this.n;
            int v3 = v2 - v;
            this.n = v3;
        }
        if(v2 >= this.b && v3 < this.b) {
            this.c();
        }
    }

    public final boolean i() {
        boolean z = false;
        synchronized(this.k) {
            if(this.a && this.n < this.b && !this.o) {
                z = true;
            }
        }
        return z;
    }

    public final void j(iapk iapk0, iauz iauz0, iaof_metadata iaof0) {
        if(!this.c) {
            this.c = true;
            this.p.m();
            ibfu ibfu0 = this.l;
            if(iapk0.h()) {
                ++ibfu0.d;
            }
            else {
                ++ibfu0.e;
            }
            this.q.a(iapk0, iauz0, iaof0);
        }
    }

    @Override  // ibbt
    public void k(boolean z) {
        gftb.r(this.t, "status should have been reported on deframer closed");
        this.d = true;
        if(this.f && z) {
            this.l(iapk.p.f("Encountered end-of-stream mid-frame"), true, new iaof_metadata());
        }
        Runnable runnable0 = this.e;
        if(runnable0 != null) {
            runnable0.run();
            this.e = null;
        }
    }

    public final void l(iapk iapk0, boolean z, iaof_metadata iaof0) {
        this.m(iapk0, iauz.a, z, iaof0);
    }

    public final void m(iapk iapk0, iauz iauz0, boolean z, iaof_metadata iaof0) {
        gftb.z(iapk0, "status");
        gftb.z(iaof0, "trailers");
        if(this.t) {
            if(!z) {
                return;
            }
            z = true;
        }
        this.t = true;
        this.f = iapk0.h();
        synchronized(this.k) {
            this.o = true;
        }
        if(this.d) {
            this.e = null;
            this.j(iapk0, iauz0, iaof0);
            return;
        }
        this.e = new iatr(this, iapk0, iauz0, iaof0);
        if(z) {
            this.j.close();
            return;
        }
        ibbw ibbw0 = (ibbw)this.j;
        if(ibbw0.b()) {
            return;
        }
        if(ibbw0.c()) {
            ibbw0.close();
            return;
        }
        ibbw0.f = true;
    }
}

