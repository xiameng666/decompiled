import j..util.Objects;

final class dvxh implements dpuf, dpug {
    final dvxj a;

    public dvxh(dvxj dvxj0) {
        Objects.requireNonNull(dvxj0);
        this.a = dvxj0;
        super();
    }

    @Override  // dpuf
    public final void a(dpui dpui0) {
        a.ae(dvxj.a.i(), "Failed to archive valuable.", dpui0);
        this.a.L();
    }

    @Override  // dpug
    public final void b(Object object0) {
        gvdd gvdd0 = (gvdd)object0;
        ((ggtj)dvxj.a.h()).x("archived valuable");
        this.a.M();
    }
}

