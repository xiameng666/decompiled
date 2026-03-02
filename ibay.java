import j..util.Objects;

final class ibay extends iawh {
    final ialq c;
    final gRPCMethodDescriptor d;
    final iakq e;
    final ibaz f;
    private final long g;

    public ibay(ibaz ibaz0, ialq ialq0, gRPCMethodDescriptor iaoj0, iakq iakq0) {
        Objects.requireNonNull(ibaz0);
        this.f = ibaz0;
        super(ibaz0.c.l(iakq0), ibaz0.c.k, iakq0.b);
        this.c = ialq0;
        this.d = iaoj0;
        this.e = iakq0;
        this.g = System.nanoTime();
    }

    @Override  // iawh
    protected final void f() {
        ibax ibax0 = new ibax(this);
        this.f.c.n.execute(ibax0);
    }

    final void j() {
        iakv iakv0;
        iavs iavs0;
        ialq ialq0 = this.c.a();
        try {
            iakv0 = this.f.c(this.d, this.e.h(ialc.f, Long.valueOf(System.nanoTime() - this.g)));
        }
        finally {
            this.c.c(ialq0);
        }
        synchronized(this) {
            if(this.b == null) {
                super.i(iakv0);
                goto label_16;
            }
            else {
                iavs0 = null;
            }
            goto label_18;
        }
    label_16:
        iavs0 = new iavs(this, this.a);
    label_18:
        if(iavs0 == null) {
            ibax ibax0 = new ibax(this);
            this.f.c.n.execute(ibax0);
            return;
        }
        ibaw ibaw0 = new ibaw(this, iavs0);
        this.f.c.l(this.e).execute(ibaw0);
    }
}

