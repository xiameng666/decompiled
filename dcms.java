final class dcms extends ibsl implements ibtw {
    Object a;
    int b;
    final dcmf c;
    private Object d;

    public dcms(dcmf dcmf0, ibrl ibrl0) {
        this.c = dcmf0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dcms)this.c(((ichm)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new dcms(this.c, ibrl0);
        ibrl1.d = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Exception exception1;
        ichm ichm1;
        Object object2;
        Object object1 = ibrx.a;
        switch(this.b) {
            case 0: {
                ibnx.b(object0);
                ichm ichm0 = (ichm)this.d;
                object2 = new dcmq(ichm0);
                try {
                    evql evql0 = this.c.t(((dcng)object2));
                    this.d = ichm0;
                    this.a = object2;
                    this.b = 1;
                    if(ictn.b(evql0, this) == object1) {
                        return object1;
                    }
                }
                catch(Exception exception0) {
                    ichm1 = ichm0;
                    exception1 = exception0;
                    ichm1.e(exception1);
                    break;
                }
                ichm1 = ichm0;
                break;
            }
            case 1: {
                object2 = this.a;
                ichm1 = (ichm)this.d;
                try {
                    ibnx.b(object0);
                    break;
                }
                catch(Exception exception1) {
                }
                ichm1.e(exception1);
                break;
            }
            default: {
                ibnx.b(object0);
                return ibom.a;
            }
        }
        dcmr dcmr0 = new dcmr(this.c, ((dcng)object2));
        this.d = null;
        this.a = null;
        this.b = 2;
        return ichl.b(ichm1, dcmr0, this) == object1 ? object1 : ibom.a;
    }
}

