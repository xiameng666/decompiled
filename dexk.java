final class dexk extends ibsl implements ibtw {
    int a;
    final dexl b;
    final dcmf c;

    public dexk(dexl dexl0, dcmf dcmf0, ibrl ibrl0) {
        this.b = dexl0;
        this.c = dcmf0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dexk)this.c(((icih)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dexk(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            evql evql0 = this.c.p(this.b.a.k);
            this.a = 1;
            if(dcwp.a(evql0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

