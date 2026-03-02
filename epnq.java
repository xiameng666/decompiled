final class epnq extends ibsl implements ibtw {
    int a;
    final ibtw b;
    private Object c;

    public epnq(ibtw ibtw0, ibrl ibrl0) {
        this.b = ibtw0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((epnq)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new epnq(this.b, ibrl0);
        ibrl1.c = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v != 0) {
            return object0;
        }
        epno epno0 = new epno(new epnn(((icck)this.c), this.b));
        gmcd gmcd0 = epnr.b.c(epno0, gmap.a);
        this.a = 1;
        Object object2 = icpu.c(gmcd0, this);
        return object2 == object1 ? object1 : object2;
    }
}

