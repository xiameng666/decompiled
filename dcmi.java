public final class dcmi extends ibsl implements ibtw {
    Object a;
    int b;
    final dcmf c;
    private Object d;

    public dcmi(dcmf dcmf0, ibrl ibrl0) {
        this.c = dcmf0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dcmi)this.c(((ichm)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new dcmi(this.c, ibrl0);
        ibrl1.d = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object4;
        Throwable throwable1;
        ichm ichm1;
        Object object3;
        Object object2;
        Object object1 = ibrx.a;
        switch(this.b) {
            case 0: {
                ibnx.b(object0);
                ichm ichm0 = (ichm)this.d;
                object2 = new dcmg(ichm0);
                try {
                    evql evql0 = this.c.I(((dbzg)object2));
                    this.d = ichm0;
                    this.a = object2;
                    this.b = 1;
                    object3 = ictn.b(evql0, this);
                }
                catch(Throwable throwable0) {
                    ichm1 = ichm0;
                    throwable1 = throwable0;
                    break;
                }
                if(object3 == object1) {
                    return object1;
                }
                ichm1 = ichm0;
                object0 = object3;
                object4 = (Void)object0;
                goto label_28;
            }
            case 1: {
                object2 = this.a;
                ichm1 = (ichm)this.d;
                try {
                    ibnx.b(object0);
                    object4 = (Void)object0;
                    goto label_28;
                }
                catch(Throwable throwable1) {
                }
                break;
            }
            default: {
                ibnx.b(object0);
                return ibom.a;
            }
        }
        object4 = ibnx.a(throwable1);
    label_28:
        Throwable throwable2 = ibnw.a(object4);
        if(throwable2 != null) {
            ichm1.e(throwable2);
        }
        dcmh dcmh0 = new dcmh(this.c, ((dbzg)object2));
        this.d = null;
        this.a = null;
        this.b = 2;
        return ichl.b(ichm1, dcmh0, this) == object1 ? object1 : ibom.a;
    }
}

