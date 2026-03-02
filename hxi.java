final class hxi extends ibsl implements ibtw {
    int a;
    final hxj b;

    public hxi(hxj hxj0, ibrl ibrl0) {
        this.b = hxj0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((hxi)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new hxi(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        if(this.a != 0) {
            ibnx.b(object0);
            return ibom.a;
        }
        ibnx.b(object0);
        this.a = 2;
        return this.b.c.invoke(this.b, this) == object1 ? object1 : ibom.a;
    }
}

