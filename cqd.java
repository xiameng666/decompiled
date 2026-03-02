final class cqd extends ibsl implements ibtw {
    Object a;
    int b;
    final cqq c;
    final long d;
    final dgg e;

    public cqd(cqq cqq0, long v, dgg dgg0, ibrl ibrl0) {
        this.c = cqq0;
        this.d = v;
        this.e = dgg0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((cqd)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new cqd(this.c, this.d, this.e, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object2;
        Object object1 = ibrx.a;
        switch(this.b) {
            case 0: {
                ibnx.b(object0);
                if(this.c.u()) {
                    this.b = 1;
                    if(iccv.c(crw.a, this) == object1) {
                        return object1;
                    }
                }
                break;
            }
            case 1: {
                ibnx.b(object0);
                break;
            }
            default: {
                object2 = this.a;
                ibnx.b(object0);
                this.c.f = (dgj)object2;
                return ibom.a;
            }
        }
        dgj dgj0 = new dgj(this.d);
        this.a = dgj0;
        this.b = 2;
        if(this.e.b(dgj0, this) == object1) {
            return object1;
        }
        object2 = dgj0;
        this.c.f = (dgj)object2;
        return ibom.a;
    }
}

