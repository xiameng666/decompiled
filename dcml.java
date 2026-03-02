final class dcml extends ibsl implements ibtw {
    Object a;
    int b;
    final boolean c;
    final dcmf d;
    final dcky e;
    private Object f;

    public dcml(boolean z, dcmf dcmf0, dcky dcky0, ibrl ibrl0) {
        this.c = z;
        this.d = dcmf0;
        this.e = dcky0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dcml)this.c(((ichm)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new dcml(this.c, this.d, this.e, ibrl0);
        ibrl1.f = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object4;
        Object object3;
        Throwable throwable1;
        ichm ichm1;
        Object object2;
        Object object1 = ibrx.a;
        switch(this.b) {
            case 0: {
                ibnx.b(object0);
                ichm ichm0 = (ichm)this.f;
                dcmj dcmj0 = new dcmj(ichm0, this.c);
                try {
                    evql evql0 = this.d.r(dcmj0, this.e);
                    this.f = ichm0;
                    this.a = dcmj0;
                    this.b = 1;
                    object2 = ictn.b(evql0, this);
                }
                catch(Throwable throwable0) {
                    ichm1 = ichm0;
                    throwable1 = throwable0;
                    object3 = dcmj0;
                    break;
                }
                if(object2 == object1) {
                    return object1;
                }
                ichm1 = ichm0;
                object0 = object2;
                object3 = dcmj0;
                object4 = (Void)object0;
                goto label_30;
            }
            case 1: {
                object3 = this.a;
                ichm1 = (ichm)this.f;
                try {
                    ibnx.b(object0);
                    object4 = (Void)object0;
                    goto label_30;
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
    label_30:
        Throwable throwable2 = ibnw.a(object4);
        if(throwable2 != null) {
            aztb aztb0 = (throwable2 instanceof aztb) ? ((aztb)throwable2) : null;
            Integer integer0 = aztb0 == null ? null : new Integer(aztb0.b());
            if(integer0 != null && ((int)integer0) == 0x8ABB) {
                Object object5 = ichm1.b(dckv.a);
                if(!icha.c(object5) && !(object5 instanceof icgy)) {
                    throw new IllegalStateException("trySend should always succeed due to unlimited buffer.");
                }
                ichp.a(ichm1);
            }
            else if(integer0 != null && ((int)integer0) == 0x8ABE) {
                Object object6 = ichm1.b(dcku.a);
                if(!icha.c(object6) && !(object6 instanceof icgy)) {
                    throw new IllegalStateException("trySend should always succeed due to unlimited buffer.");
                }
                ichp.a(ichm1);
            }
            else if(hvrc.a.b().l()) {
                ichm1.e(throwable2);
            }
            else {
                ichp.a(ichm1);
            }
        }
        dcmk dcmk0 = new dcmk(this.d, ((dcnp)object3));
        this.f = null;
        this.a = null;
        this.b = 2;
        return ichl.b(ichm1, dcmk0, this) == object1 ? object1 : ibom.a;
    }
}

