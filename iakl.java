public final class iakl {
    public final Object a;
    public iauy b;
    boolean c;
    public iaxg d;
    private final iavb e;
    private final gRPCMethodDescriptor f;
    private final iaof_metadata g;
    private final iakq h;
    private final ialq i;
    private final ialc[] j;
    private final iauk k;

    public iakl() {
        throw null;
    }

    public iakl(iavb iavb0, gRPCMethodDescriptor iaoj0, iaof_metadata iaof0, iakq iakq0, iauk iauk0, ialc[] arr_ialc) {
        this.a = new Object();
        this.e = iavb0;
        this.f = iaoj0;
        this.g = iaof0;
        this.h = iakq0;
        this.i = ialq.b();
        this.k = iauk0;
        this.j = arr_ialc;
    }

    public final void a(iaof_metadata iaof0) {
        iauy iauy0;
        gftb.r(((boolean)(this.c ^ 1)), "apply() or fail() already called");
        gftb.z(iaof0, "headers");
        this.g.h(iaof0);
        ialq ialq0 = this.i.a();
        try {
            iauy0 = this.e.b(this.f, this.g, this.h, this.j);
        }
        finally {
            this.i.c(ialq0);
        }
        this.c(iauy0);
    }

    public final void b(iapk iapk0) {
        gftb.b(((boolean)(iapk0.h() ^ 1)), "Cannot fail with OK status");
        gftb.r(((boolean)(this.c ^ 1)), "apply() or fail() already called");
        this.c(new iaxs(iayh.b(iapk0), this.j));
    }

    private final void c(iauy iauy0) {
        boolean z1;
        boolean z = true;
        gftb.r(((boolean)(this.c ^ 1)), "already finalized");
        this.c = true;
        synchronized(this.a) {
            if(this.b == null) {
                this.b = iauy0;
                z1 = true;
            }
            else {
                z1 = false;
            }
        }
        if(z1) {
            this.k.a();
            return;
        }
        if(this.d == null) {
            z = false;
        }
        gftb.r(z, "delayedStream is null");
        Runnable runnable0 = this.d.q(iauy0);
        if(runnable0 != null) {
            runnable0.run();
        }
        this.k.a();
    }
}

