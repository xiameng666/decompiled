final class scd implements ibts {
    final ibvd a;
    final icbi b;

    public scd(ibvd ibvd0, icbi icbi0) {
        this.a = ibvd0;
        this.b = icbi0;
        super();
    }

    @Override  // ibts
    public final Object a(Object object0) {
        rzz rzz0 = (rzz)object0;
        ibuq.f(rzz0, "it");
        this.a.a = rzz0;
        this.b.w(ibom.a);
        return ibom.a;
    }
}

