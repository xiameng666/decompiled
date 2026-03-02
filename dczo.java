final class dczo extends ibsl implements ibtw {
    int a;
    final ddag b;

    public dczo(ddag ddag0, ibrl ibrl0) {
        this.b = ddag0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dczo)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dczo(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v != 0) {
            return object0;
        }
        evql evql0 = this.b.a.q();
        this.a = 1;
        Object object2 = dcwp.a(evql0, this);
        return object2 == object1 ? object1 : object2;
    }
}

