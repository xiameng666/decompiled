final class beme extends ibsl implements ibtw {
    int a;
    final bemf b;
    private Object c;

    public beme(bemf bemf0, ibrl ibrl0) {
        this.b = bemf0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((beme)this.c(((lqf)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new beme(this.b, ibrl0);
        ibrl1.c = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        lqf lqf0;
        Object object1 = ibrx.a;
        switch(this.a) {
            case 0: {
                ibnx.b(object0);
                lqf0 = (lqf)this.c;
                this.c = lqf0;
                this.a = 1;
                object0 = bgks.a(this.b.a, this);
                if(object0 != object1) {
                    goto label_13;
                }
                break;
            }
            case 1: {
                lqf0 = (lqf)this.c;
                ibnx.b(object0);
            label_13:
                this.c = null;
                this.a = 2;
                if(lqf0.a(object0, this) != object1) {
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

