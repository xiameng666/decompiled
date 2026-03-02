final class dexm extends ibsl implements ibtw {
    int a;
    final ddag b;
    final dexn c;

    public dexm(ddag ddag0, dexn dexn0, ibrl ibrl0) {
        this.b = ddag0;
        this.c = dexn0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dexm)this.c(((icih)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dexm(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            this.a = 1;
            if(this.b.m(this.c.a, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

