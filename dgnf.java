final class dgnf extends ibsl implements ibtw {
    int a;
    final dgop b;
    final dgfc c;

    public dgnf(dgop dgop0, dgfc dgfc0, ibrl ibrl0) {
        this.b = dgop0;
        this.c = dgfc0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dgnf)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dgnf(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            this.b.e = this.b.g(this.c);
            cuwu cuwu0 = cuwu.b(new dgeh(this.b.e).a());
            this.a = 1;
            if(this.b.i.b(cuwu0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

