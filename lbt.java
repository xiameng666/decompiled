final class lbt extends ibsl implements ibtw {
    Object a;
    int b;
    boolean c;
    final lcc d;
    final int e;

    public lbt(lcc lcc0, int v, ibrl ibrl0) {
        this.d = lcc0;
        this.e = v;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((lbt)this.c(((Boolean)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new lbt(this.d, this.e, ibrl0);
        ibrl1.c = ((Boolean)object0).booleanValue();
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object2;
        boolean z;
        Object object1 = ibrx.a;
        switch(this.b) {
            case 0: {
                ibnx.b(object0);
                z = this.c;
                this.b = 1;
                object0 = this.d.h(this);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                z = this.c;
                ibnx.b(object0);
                break;
            }
            default: {
                object2 = this.a;
                ibnx.b(object0);
                goto label_22;
            }
        }
        if(z) {
            lct lct0 = this.d.c();
            this.a = object0;
            this.b = 2;
            Object object3 = lct0.a(this);
            if(object3 != object1) {
                Object object4 = object0;
                object0 = object3;
                object2 = object4;
            label_22:
                int v = ((Number)object0).intValue();
                return object2 == null ? new lah(null, 0, v) : new lah(object2, object2.hashCode(), v);
            }
            return object1;
        }
        return object0 == null ? new lah(null, 0, this.e) : new lah(object0, object0.hashCode(), this.e);
    }
}

