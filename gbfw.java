final class gbfw extends ibsl implements ibtw {
    final gbla a;
    final String b;

    public gbfw(gbla gbla0, String s, ibrl ibrl0) {
        this.a = gbla0;
        this.b = s;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((gbfw)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new gbfw(this.a, this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        gblb gblb0 = new gblb(this.b);
        return (gblf)oqj.b(((gble)this.a).a, true, false, gblb0);
    }
}

