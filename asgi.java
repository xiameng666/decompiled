final class asgi extends ibsl implements ibtw {
    int a;
    final asgr b;
    private Object c;

    public asgi(asgr asgr0, ibrl ibrl0) {
        this.b = asgr0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((asgi)this.c(((icih)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new asgi(this.b, ibrl0);
        ibrl1.c = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        icih icih0;
        Object object1 = ibrx.a;
        switch(this.a) {
            case 0: {
                ibnx.b(object0);
                icih0 = (icih)this.c;
                this.c = icih0;
                this.a = 1;
                object0 = this.b.b(this);
                if(object0 != object1) {
                    goto label_13;
                }
                break;
            }
            case 1: {
                icih0 = (icih)this.c;
                ibnx.b(object0);
            label_13:
                this.c = null;
                this.a = 2;
                if(icih0.a(object0, this) != object1) {
                    return ibom.a;
                }
                break;
            }
            default: {
                ibnx.b(object0);
                return ibom.a;
            }
        }
        return object1;
    }
}

