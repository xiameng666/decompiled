final class buor extends ibsl implements ibtw {
    final bupl a;

    public buor(bupl bupl0, ibrl ibrl0) {
        this.a = bupl0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((buor)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new buor(this.a, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        this.a.B().b(hjbx.f, hgeg.by, hjaw.b);
        return ibom.a;
    }
}

