public final class bdzb extends ibsl implements ibtw {
    int a;
    final bdzc b;
    final boolean c;

    public bdzb(bdzc bdzc0, boolean z, ibrl ibrl0) {
        this.b = bdzc0;
        this.c = z;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((bdzb)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new bdzb(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            this.a = 1;
            object0 = bdyy.a(this.b.b, this.c, this);
            if(object0 == object1) {
                return object1;
            }
        }
        if(!((Boolean)object0).booleanValue()) {
            this.b.e.l(ibom.a);
        }
        return ibom.a;
    }
}

