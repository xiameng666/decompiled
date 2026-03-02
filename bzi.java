final class bzi extends ibsk implements ibtw {
    Object a;
    Object b;
    int c;
    int d;
    final bzj e;
    private Object f;

    public bzi(bzj bzj0, ibrl ibrl0) {
        this.e = bzj0;
        super(ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((bzi)this.c(((ibxt)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new bzi(this.e, ibrl0);
        ibrl1.f = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibxt ibxt0;
        Object object3;
        Object object2;
        int v;
        Object object1 = ibrx.a;
        if(this.d == 0) {
            ibnx.b(object0);
            ibxt0 = (ibxt)this.f;
            object3 = this.e.b.b;
            object2 = this.e.b.c;
            v = this.e.b.e;
        }
        else {
            v = this.c;
            object2 = this.b;
            object3 = this.a;
            ibxt0 = (ibxt)this.f;
            ibnx.b(object0);
        }
        while(v != 0x7FFFFFFF) {
            long v1 = ((long[])object2)[v] >> 0x1F;
            Object object4 = ((Object[])object3)[v];
            this.f = ibxt0;
            this.a = object3;
            this.b = object2;
            v = (int)(v1 & 0x7FFFFFFFL);
            this.c = v;
            this.d = 1;
            if(ibxt0.a(object4, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

