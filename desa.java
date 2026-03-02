final class desa implements ibtw {
    final devp a;
    final boolean b;
    final ibts c;
    final ibts d;
    final ibts e;

    public desa(devp devp0, boolean z, ibts ibts0, ibts ibts1, ibts ibts2) {
        this.a = devp0;
        this.b = z;
        this.c = ibts0;
        this.d = ibts1;
        this.e = ibts2;
        super();
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        if((((Number)object1).intValue() & 3) == 2 && ((goz)object0).ac()) {
            ((goz)object0).G();
            return ibom.a;
        }
        dfcr.g(this.a.a, this.a.e, this.b, this.c, this.d, this.e, false, ((goz)object0), 0);
        return ibom.a;
    }
}

