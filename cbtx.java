final class cbtx extends ibsl implements ibtw {
    int a;
    final cbuo b;
    final String c;

    public cbtx(cbuo cbuo0, String s, ibrl ibrl0) {
        this.b = cbuo0;
        this.c = s;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((cbtx)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new cbtx(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        switch(v) {
            case 0: {
                ibuq.c(this.c);
                this.a = 1;
                object0 = this.b.aD(this.c);
                if(object0 != object1) {
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
        if(!((Boolean)object0).booleanValue()) {
            ibuq.c(this.c);
            this.a = 2;
            if(this.b.N(this.c, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

