import j..util.Objects;

final class dvsl implements dpuf, dpug {
    final dvsn a;

    public dvsl(dvsn dvsn0) {
        Objects.requireNonNull(dvsn0);
        this.a = dvsn0;
        super();
    }

    @Override  // dpuf
    public final void a(dpui dpui0) {
        a.ae(dvsn.a.i(), "Generate share link RPC failed.", dpui0);
        this.a.R();
    }

    @Override  // dpug
    public final void b(Object object0) {
        dvsn dvsn0 = this.a;
        if(dvsn0.an() != null && dvsn0.aP) {
            dvsn0.aN = ((gvat)object0).b;
            if(bbqr.d(dvsn0.aN)) {
                ((ggtj)dvsn.a.i()).x("Share link empty or null");
                dvsn0.R();
                return;
            }
            dvsn0.B(dvsn0.aN);
        }
    }
}

