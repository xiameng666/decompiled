final class eyhe extends ibsl implements ibtw {
    int a;
    final eyhf b;

    public eyhe(eyhf eyhf0, ibrl ibrl0) {
        this.b = eyhf0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((eyhe)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new eyhe(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        boolean z = true;
        ibnx.b(object0);
        if(v == 0) {
            this.a = 1;
            object0 = this.b.d.d(this.b.c, this);
            if(object0 == object1) {
                return object1;
            }
        }
        if(object0 == null) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}

