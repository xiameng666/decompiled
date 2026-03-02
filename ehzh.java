final class ehzh extends ibsl implements ibtw {
    int a;
    final ehzg b;
    final qnu c;

    public ehzh(qnu qnu0, ehzg ehzg0, ibrl ibrl0) {
        this.c = qnu0;
        this.b = ehzg0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ehzh)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ehzh(this.c, this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        switch(v) {
            case 0: {
                this.a = 1;
                if(qnv.b(this.c, this) != object1) {
                    break;
                }
                return object1;
            }
            case 1: {
                break;
            }
            default: {
                return ibom.a;
            }
        }
        ehzg ehzg0 = this.b;
        if(ehzg0.d) {
            qog qog0 = ehzg0.b == null ? null : new qog(ehzg0.b);
            this.a = 2;
            if(qnl.a(this.c, ehzg0.a, ehzg0.c, false, 1.0f, qog0, 0.0f, ehzg0.e, this, 0x6CA) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

