final class ctkv extends ibsl implements ibtw {
    Object a;
    Object b;
    Object c;
    int d;
    final ctkw e;
    final icig f;
    private Object g;

    public ctkv(ctkw ctkw0, icig icig0, ibrl ibrl0) {
        this.e = ctkw0;
        this.f = icig0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ctkv)this.c(((icih)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new ctkv(this.e, this.f, ibrl0);
        ibrl1.g = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object2;
        Object object5;
        Object object4;
        Object object3;
        icih icih0;
        Object object1 = ibrx.a;
        switch(this.d) {
            case 0: {
                ibnx.b(object0);
                icih0 = (icih)this.g;
                ctkw ctkw0 = this.e;
                object3 = this.f;
                this.g = icih0;
                object4 = ctkw0.b;
                this.a = object4;
                this.b = ctkw0;
                this.c = object3;
                this.d = 1;
                if(((icta)object4).b(this) != object1) {
                    object5 = ctkw0;
                    goto label_25;
                }
                break;
            }
            case 1: {
                object3 = this.c;
                object5 = this.b;
                object4 = this.a;
                icih0 = (icih)this.g;
                ibnx.b(object0);
                try {
                label_25:
                    ctku ctku0 = new ctku(((icig)object3));
                    icig icig0 = ((ctkw)object5).a.a("remoteDevice", ctku0);
                    icjo icjo0 = new icjo(new ctkq(icih0, null), icig0);
                    ctkr ctkr0 = new ctkr(icih0);
                    this.g = object4;
                    this.a = null;
                    this.b = null;
                    this.c = null;
                    this.d = 2;
                    if(icjo0.oR(ctkr0, this) != object1) {
                        goto label_41;
                    }
                    break;
                }
                catch(Throwable throwable1) {
                    throwable0 = throwable1;
                    object2 = object4;
                }
                ((icta)object2).d();
                throw throwable0;
            label_41:
                object2 = object4;
            label_42:
                ((icta)object2).d();
                return ibom.a;
            }
            default: {
                object2 = (icta)this.g;
                try {
                    ibnx.b(object0);
                    goto label_42;
                }
                catch(Throwable throwable0) {
                    ((icta)object2).d();
                    throw throwable0;
                }
            }
        }
        return object1;
    }
}

