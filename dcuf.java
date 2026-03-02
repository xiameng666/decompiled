final class dcuf extends ibsl implements ibtw {
    int a;
    boolean b;
    final dcus c;

    public dcuf(dcus dcus0, ibrl ibrl0) {
        this.c = dcus0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dcuf)this.c(((Boolean)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new dcuf(this.c, ibrl0);
        ibrl1.b = ((Boolean)object0).booleanValue();
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0 && this.b) {
            dcue dcue0 = new dcue(this.c);
            this.a = 1;
            if(icoa.h(((icoa)this.c.a.b), dcue0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

