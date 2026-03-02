import j..util.Objects;

final class dvsk implements dpuf, dpug {
    final dvsn a;

    public dvsk(dvsn dvsn0) {
        Objects.requireNonNull(dvsn0);
        this.a = dvsn0;
        super();
    }

    @Override  // dpuf
    public final void a(dpui dpui0) {
        a.ae(dvsn.a.i(), "Failed to archive valuable.", dpui0);
        this.a.K();
    }

    @Override  // dpug
    public final void b(Object object0) {
        gvdd gvdd0 = (gvdd)object0;
        ((ggtj)dvsn.a.h()).x("archived valuable");
        this.a.L();
    }
}

