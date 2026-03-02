import j..time.Instant;

final class dtxe extends ibsl implements ibtw {
    final dtxg a;
    final String b;
    final Instant c;

    public dtxe(dtxg dtxg0, String s, Instant instant0, ibrl ibrl0) {
        this.a = dtxg0;
        this.b = s;
        this.c = instant0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dtxe)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dtxe(this.a, this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        this.a.i(this.b, this.c);
        return ibom.a;
    }
}

