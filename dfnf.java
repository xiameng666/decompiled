final class dfnf extends ibsl implements ibtw {
    int a;
    final dfng b;
    final ddag c;
    private Object d;

    public dfnf(dfng dfng0, ddag ddag0, ibrl ibrl0) {
        this.b = dfng0;
        this.c = ddag0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dfnf)this.c(((icih)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new dfnf(this.b, this.c, ibrl0);
        ibrl1.d = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        switch(v) {
            case 0: {
                icih icih0 = (icih)this.d;
                dfoj dfoj0 = new dfoj(this.b.a);
                this.a = 1;
                if(icih0.a(dfoj0, this) != object1) {
                    goto label_9;
                }
                break;
            }
            case 1: {
            label_9:
                this.a = 2;
                if(this.c.d(this.b.a, this) != object1) {
                    return ibom.a;
                }
                break;
            }
            default: {
                return ibom.a;
            }
        }
        return object1;
    }
}

