final class dcmp extends ibsl implements ibtw {
    Object a;
    int b;
    final dcmf c;
    final dclp d;
    private Object e;

    public dcmp(dcmf dcmf0, dclp dclp0, ibrl ibrl0) {
        this.c = dcmf0;
        this.d = dclp0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dcmp)this.c(((ichm)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new dcmp(this.c, this.d, ibrl0);
        ibrl1.e = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Exception exception1;
        aztb aztb1;
        ichm ichm1;
        Object object2;
        Object object1 = ibrx.a;
    alab1:
        switch(this.b) {
            case 0: {
                ibnx.b(object0);
                ichm ichm0 = (ichm)this.e;
                object2 = new dcmm(ichm0);
                dcmo dcmo0 = new dcmo(ichm0);
                try {
                    evql evql0 = this.c.s(((dcnp)object2), dcmo0, this.d);
                    this.e = ichm0;
                    this.a = object2;
                    this.b = 1;
                    if(ictn.b(evql0, this) == object1) {
                        return object1;
                    }
                }
                catch(aztb aztb0) {
                    ichm1 = ichm0;
                    aztb1 = aztb0;
                    goto label_29;
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
                ichm1 = (ichm)this.e;
                try {
                    ibnx.b(object0);
                    break;
                }
                catch(aztb aztb1) {
                label_29:
                    switch(aztb1.b()) {
                        case 0x8AB8: {
                            Object object3 = ichm1.b(dclg.a);
                            if(!icha.c(object3) && !(object3 instanceof icgy)) {
                                throw new IllegalStateException("trySend should always succeed due to unlimited buffer.");
                            }
                            ichp.a(ichm1);
                            break alab1;
                        }
                        case 0x8ABB: {
                            Object object4 = ichm1.b(dcll.a);
                            if(!icha.c(object4) && !(object4 instanceof icgy)) {
                                throw new IllegalStateException("trySend should always succeed due to unlimited buffer.");
                            }
                            ichp.a(ichm1);
                            break alab1;
                        }
                        default: {
                            ichm1.e(aztb1);
                            break alab1;
                        }
                    }
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
        dcmn dcmn0 = new dcmn(this.c, ((dcnp)object2));
        this.e = null;
        this.a = null;
        this.b = 2;
        return ichl.b(ichm1, dcmn0, this) == object1 ? object1 : ibom.a;
    }
}

