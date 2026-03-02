final class gbgi extends ibsl implements ibtw {
    final gbln a;
    final String b;

    public gbgi(gbln gbln0, String s, ibrl ibrl0) {
        this.a = gbln0;
        this.b = s;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((gbgi)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new gbgi(this.a, this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        return this.a.a(this.b) == null ? Boolean.valueOf(false) : Boolean.valueOf(true);
    }
}

