final class gbgm extends ibsl implements ibtw {
    final gbgr a;

    public gbgm(gbgr gbgr0, ibrl ibrl0) {
        this.a = gbgr0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((gbgm)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new gbgm(this.a, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        return this.a.e.a(this.a.b) == null ? Boolean.valueOf(false) : Boolean.valueOf(true);
    }
}

