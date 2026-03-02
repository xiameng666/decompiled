final class cgn extends ibsl implements ibtw {
    int a;
    final cgm b;
    final long c;
    final cgp d;

    public cgn(cgm cgm0, long v, cgp cgp0, ibrl ibrl0) {
        this.b = cgm0;
        this.c = v;
        this.d = cgp0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((cgn)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new cgn(this.b, this.c, this.d, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            jlk jlk0 = new jlk(this.c);
            chl chl0 = this.d.a;
            this.a = 1;
            object0 = chb.k(this.b.a, jlk0, chl0, null, this, 12);
            if(object0 == object1) {
                return object1;
            }
        }
        chj chj0 = (chj)object0;
        return ibom.a;
    }
}

