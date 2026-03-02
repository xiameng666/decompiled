final class buon extends ibsl implements ibtw {
    final bupl a;

    public buon(bupl bupl0, ibrl ibrl0) {
        this.a = bupl0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((buon)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new buon(this.a, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        this.a.B().b(hjbx.f, hgeg.by, hjaw.f);
        return ibom.a;
    }
}

