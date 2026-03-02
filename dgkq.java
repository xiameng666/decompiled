final class dgkq extends ibsl implements ibtw {
    final dgkw a;
    final String b;
    final cuvf c;

    public dgkq(dgkw dgkw0, String s, cuvf cuvf0, ibrl ibrl0) {
        this.a = dgkw0;
        this.b = s;
        this.c = cuvf0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dgkq)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dgkq(this.a, this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        dgkw dgkw0 = this.a;
        double f = dgkw0.c.a();
        if((f > 0.0)) {
            dcvz.a.a().h("incoming connection rate limited, waited %f", new Double(f));
        }
        dgky dgky0 = new dgky(this.b, this.c);
        dgkp.a(dgkw0.d, dgky0);
        return ibom.a;
    }
}

