final class gbgq extends ibsl implements ibtw {
    int a;
    final gbgr b;
    final gblm c;

    public gbgq(gbgr gbgr0, gblm gblm0, ibrl ibrl0) {
        this.b = gbgr0;
        this.c = gblm0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((gbgq)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new gbgq(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            gbgr gbgr0 = this.b;
            if(!gbgr0.c) {
                return Boolean.valueOf(false);
            }
            this.a = 1;
            object0 = gbgr0.e(this.c, this);
            if(object0 == object1) {
                return object1;
            }
        }
        return Boolean.valueOf(((Boolean)object0).booleanValue());
    }
}

