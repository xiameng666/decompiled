final class iht extends ibur implements ibtw {
    final ihy a;
    final ibth b;

    public iht(ihy ihy0, ibth ibth0) {
        this.a = ihy0;
        this.b = ibth0;
        super(2);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        boolean z;
        ihy ihy0 = this.a;
        if(ihy0.t.an()) {
            ihy0.E = (hli)object0;
            ihy0.D = (hpn)object1;
            ihy0.ai().a.c(ihy0, ihy.p, this.b);
            z = false;
        }
        else {
            z = true;
        }
        ihy0.F = z;
        return ibom.a;
    }
}

