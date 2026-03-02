final class ctoj extends ibsl implements ibtw {
    int a;
    final ctoq b;
    final String c;
    final String d;
    final byte[] e;
    private Object f;

    public ctoj(ctoq ctoq0, String s, String s1, byte[] arr_b, ibrl ibrl0) {
        this.b = ctoq0;
        this.c = s;
        this.d = s1;
        this.e = arr_b;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ctoj)this.c(((icih)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new ctoj(this.b, this.c, this.d, this.e, ibrl0);
        ibrl1.f = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        icih icih0;
        Object object1 = ibrx.a;
        switch(this.a) {
            case 0: {
                ibnx.b(object0);
                icih0 = (icih)this.f;
                try {
                    this.f = icih0;
                    this.a = 1;
                    if(this.b.b(this) != object1) {
                        goto label_12;
                    }
                    break;
                }
                catch(Throwable throwable0) {
                    this.b.c();
                    throw throwable0;
                }
                goto label_12;
            }
            case 1: {
                icih0 = (icih)this.f;
                try {
                    ibnx.b(object0);
                label_12:
                    icig icig0 = this.b.a.h(this.c, this.d, this.e);
                    ctoi ctoi0 = new ctoi(icih0);
                    this.f = null;
                    this.a = 2;
                    if(icig0.oR(ctoi0, this) != object1) {
                        goto label_21;
                    }
                    break;
                }
                catch(Throwable throwable0) {
                    this.b.c();
                    throw throwable0;
                }
            label_21:
                this.b.c();
                return ibom.a;
            }
            default: {
                try {
                    ibnx.b(object0);
                    goto label_21;
                }
                catch(Throwable throwable0) {
                    this.b.c();
                    throw throwable0;
                }
            }
        }
        return object1;
    }
}

