public final class bdza extends ibsl implements ibtw {
    int a;
    final bdzc b;

    public bdza(bdzc bdzc0, ibrl ibrl0) {
        this.b = bdzc0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((bdza)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new bdza(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            this.a = 1;
            Boolean boolean0 = Boolean.valueOf(this.b.b.b());
            Object object2 = this.b.b.d.a(boolean0, this);
            if(object2 != object1) {
                object2 = ibom.a;
            }
            if(object2 == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

