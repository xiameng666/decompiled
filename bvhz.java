final class bvhz extends ibsl implements ibtx {
    final bvkk a;
    final ibvd b;

    public bvhz(bvkk bvkk0, ibvd ibvd0, ibrl ibrl0) {
        this.a = bvkk0;
        this.b = ibvd0;
        super(3, ibrl0);
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        icih icih0 = (icih)object0;
        Throwable throwable0 = (Throwable)object1;
        return new bvhz(this.a, this.b, ((ibrl)object2)).jI(ibom.a);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        bvia bvia0 = (bvia)this.b.a;
        String s = null;
        String s1 = bvia0 == null ? null : bvia0.a;
        if(bvia0 != null) {
            s = bvia0.b;
        }
        this.a.f(s1, s, clmw.o);
        return ibom.a;
    }
}

