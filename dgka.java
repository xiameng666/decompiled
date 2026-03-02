final class dgka extends ibsl implements ibtw {
    Object a;
    final dgkd b;
    final long c;
    final String d;
    final ichm e;

    public dgka(dgkd dgkd0, ichm ichm0, long v, String s, ibrl ibrl0) {
        this.b = dgkd0;
        this.e = ichm0;
        this.c = v;
        this.d = s;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dgka)this.c(((dgmo)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new dgka(this.b, this.e, this.c, this.d, ibrl0);
        ibrl1.a = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        this.b.g(this.e, ((dgmo)this.a), this.c, this.d);
        return ibom.a;
    }
}

