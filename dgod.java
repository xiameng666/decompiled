public final class dgod extends ibsl implements ibtw {
    int a;
    final dgop b;
    private Object c;

    public dgod(dgop dgop0, ibrl ibrl0) {
        this.b = dgop0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dgod)this.c(((ichm)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new dgod(this.b, ibrl0);
        ibrl1.c = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ichm ichm0;
        Object object1 = ibrx.a;
        switch(this.a) {
            case 0: {
                ibnx.b(object0);
                ichm0 = (ichm)this.c;
                dgop dgop0 = this.b;
                synchronized(ichm0) {
                    if(dgop0.m != null) {
                        throw new IllegalStateException("PayloadTracker already started.");
                    }
                    dgop0.c.b = new dgnv(dgop0);
                    dgop0.c.c = new dgnw(dgop0, ichm0);
                    dgop0.m = ichm0;
                    iced iced0 = icir.d(new iclv(icii.b(new icib(new dgls(dgop0.i, null)), ((int)hvqs.ay()), 0, 2), new dgoc(dgop0, ichm0, null)), ichm0);
                    iced0.t(new dgnx(dgop0));
                    dgop0.h = iced0;
                    dgob dgob0 = new dgob(dgop0, null);
                    icir.d(new iclv(dgop0.k, dgob0), ichm0);
                }
                this.c = ichm0;
                this.a = 1;
                if(dgop0.i.c(dgop0.b, this) != object1) {
                    goto label_29;
                }
                break;
            }
            case 1: {
                ichm0 = (ichm)this.c;
                ibnx.b(object0);
            label_29:
                dgny dgny0 = new dgny(this.b);
                this.c = null;
                this.a = 2;
                if(ichl.b(ichm0, dgny0, this) != object1) {
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

