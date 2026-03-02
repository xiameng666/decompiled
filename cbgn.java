final class cbgn extends ibsl implements ibtw {
    final cbgo a;

    public cbgn(cbgo cbgo0, ibrl ibrl0) {
        this.a = cbgo0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((cbgn)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new cbgn(this.a, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        return Boolean.valueOf(bbmn.s(this.a.a));
    }
}

