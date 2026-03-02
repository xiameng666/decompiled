final class lbr extends ibsl implements ibtw {
    Object a;
    int b;
    boolean c;
    final lcc d;
    final int e;

    public lbr(lcc lcc0, int v, ibrl ibrl0) {
        this.d = lcc0;
        this.e = v;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((lbr)this.c(((Boolean)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new lbr(this.d, this.e, ibrl0);
        ibrl1.c = ((Boolean)object0).booleanValue();
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        boolean z1;
        Object object1 = ibrx.a;
        switch(this.b) {
            case 0: {
                ibnx.b(object0);
                z1 = this.c;
                try {
                    this.b = 1;
                    object0 = this.d.i(z1, this);
                    return object0 == object1 ? object1 : new ibns(((lec)object0), Boolean.valueOf(z1));
                label_12:
                    z1 = this.c;
                    ibnx.b(object0);
                    return new ibns(((lec)object0), Boolean.valueOf(z1));
                }
                catch(Throwable object3) {
                    break;
                }
            }
            case 1: {
                goto label_12;
            }
            default: {
                boolean z = this.c;
                Object object2 = this.a;
                ibnx.b(object0);
                return new ibns(new ldo(((Throwable)object2), ((Number)object0).intValue()), Boolean.valueOf(z));
            }
        }
        if(z1) {
            lct lct0 = this.d.c();
            this.a = object3;
            this.c = true;
            this.b = 2;
            Object object4 = lct0.a(this);
            return object4 != object1 ? new ibns(new ldo(((Throwable)object3), ((Number)object4).intValue()), Boolean.valueOf(z1)) : object1;
        }
        return new ibns(new ldo(((Throwable)object3), this.e), Boolean.valueOf(z1));
    }
}

