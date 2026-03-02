final class delk extends ibsl implements ibtw {
    int a;
    final gra b;

    public delk(gra gra0, ibrl ibrl0) {
        this.b = gra0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((delk)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new delk(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            long v1 = hvqs.a.aT().bV();
            this.a = 1;
            if(iccv.c(v1, this) == object1) {
                return object1;
            }
        }
        demb.a(this.b, false);
        return ibom.a;
    }
}

