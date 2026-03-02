final class dcvt extends ibsl implements ibtw {
    final aket a;

    public dcvt(aket aket0, ibrl ibrl0) {
        this.a = aket0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dcvt)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dcvt(this.a, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        return Boolean.valueOf(this.a.c());
    }
}

