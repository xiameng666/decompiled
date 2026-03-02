final class dfrl extends ibsl implements ibtw {
    int a;
    final dfrr b;
    final int c;

    public dfrl(dfrr dfrr0, int v, ibrl ibrl0) {
        this.b = dfrr0;
        this.c = v;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dfrl)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dfrl(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            dcky dcky0 = dckz.a(new dfrg());
            ickk ickk0 = new ickk(dcmt.a(this.b.c, dcky0, false), new dfrh(null));
            icjm icjm0 = new icjm(new icjo(new dfri(this.b, null), ickk0), new dfrj(this.b, this.c, null));
            this.a = 1;
            if(icjm0.oR(dfrk.a, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

