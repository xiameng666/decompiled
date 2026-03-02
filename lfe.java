final class lfe extends ibsl implements ibtw {
    int a;
    Object b;
    final ibtw c;

    public lfe(ibtw ibtw0, ibrl ibrl0) {
        this.c = ibtw0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((lfe)this.c(((lfa)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new lfe(this.c, ibrl0);
        ibrl1.b = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        if(this.a != 0) {
            Object object2 = (lfa)this.b;
            ibnx.b(object0);
            return object2;
        }
        ibnx.b(object0);
        Object object3 = new lfa(ibpz.r(((lfa)this.b).b()), false);
        this.b = object3;
        this.a = 1;
        return this.c.a(object3, this) == object1 ? object1 : object3;
    }
}

