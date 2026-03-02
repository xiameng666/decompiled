import j..util.Objects;

final class iawm extends iaxg {
    public final iana a;
    public final ialq b;
    public final ialc[] c;
    public volatile iapk d;
    final iawo e;

    public iawm(iawo iawo0, iana iana0, ialc[] arr_ialc) {
        Objects.requireNonNull(iawo0);
        this.e = iawo0;
        super();
        this.b = ialq.b();
        this.a = iana0;
        this.c = arr_ialc;
    }

    @Override  // iaxg
    public final void b(iayp iayp0) {
        if(this.a.a.k()) {
            iayp0.a("wait_for_ready");
            iapk iapk0 = this.d;
            if(iapk0 != null && !iapk0.h()) {
                iayp0.b("Last Pick Failure", iapk0);
            }
        }
        super.b(iayp0);
    }

    @Override  // iaxg
    public final void c(iapk iapk0) {
        super.c(iapk0);
        iawo iawo0 = this.e;
        synchronized(iawo0.a) {
            if(iawo0.e != null) {
                boolean z = iawo0.g.remove(this);
                if(!iawo0.e() && z) {
                    iaps iaps0 = iawo0.b;
                    iaps0.c(iawo0.d);
                    if(iawo0.h.b != null) {
                        iaps0.c(iawo0.e);
                        iawo0.e = null;
                    }
                }
            }
        }
        this.e.b.b();
    }

    @Override  // iaxg
    protected final void p() {
        for(int v = 0; true; ++v) {
            ialc[] arr_ialc = this.c;
            if(v >= arr_ialc.length) {
                break;
            }
            ialc ialc0 = arr_ialc[v];
        }
    }
}

