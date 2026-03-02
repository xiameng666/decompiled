import j..util.Objects;

final class dvxi implements dpuf, dpug {
    final dvxj a;

    public dvxi(dvxj dvxj0) {
        Objects.requireNonNull(dvxj0);
        this.a = dvxj0;
        super();
    }

    @Override  // dpuf
    public final void a(dpui dpui0) {
        a.ae(dvxj.a.i(), "Generate share link RPC failed.", dpui0);
        this.a.R();
    }

    @Override  // dpug
    public final void b(Object object0) {
        dvxj dvxj0 = this.a;
        if(dvxj0.an() != null && dvxj0.aG) {
            dvxj0.aM = ((gvat)object0).b;
            if(gfta.c(dvxj0.aM)) {
                ((ggtj)dvxj.a.i()).x("Share link empty or null");
                dvxj0.R();
                return;
            }
            dvxj0.H(dvxj0.aM);
        }
    }
}

