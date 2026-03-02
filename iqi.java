public final class iqi {
    private static final grx a;

    static {
        iqi.a = new guj(iqf.a);
    }

    public static final Object a(iio iio0, inx inx0, ibtw ibtw0, ibrl ibrl0) {
        iqh iqh0;
        if((ibrl0 instanceof iqh)) {
            iqh0 = (iqh)ibrl0;
            int v = iqh0.b;
            if((v & 0x80000000) == 0) {
                iqh0 = new iqh(ibrl0);
            }
            else {
                iqh0.b = v - 0x80000000;
            }
        }
        else {
            iqh0 = new iqh(ibrl0);
        }
        Object object0 = iqh0.a;
        Object object1 = ibrx.a;
        switch(iqh0.b) {
            case 0: {
                ibnx.b(object0);
                if(inx0 != null) {
                    iqh0.b = 2;
                    throw null;
                }
                iqh0.b = 1;
                if(iio0.m(ibtw0, iqh0) == object1) {
                    return object1;
                }
                throw new ibnm();
            }
            case 1: {
                ibnx.b(object0);
                throw new ibnm();
            }
            case 2: {
                ibnx.b(object0);
                throw new ibnm();
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public static final Object b(eor eor0, ibtw ibtw0, ibrl ibrl0) {
        iqg iqg0;
        if((ibrl0 instanceof iqg)) {
            iqg0 = (iqg)ibrl0;
            int v = iqg0.b;
            if((v & 0x80000000) == 0) {
                iqg0 = new iqg(ibrl0);
            }
            else {
                iqg0.b = v - 0x80000000;
            }
        }
        else {
            iqg0 = new iqg(ibrl0);
        }
        Object object0 = iqg0.a;
        Object object1 = ibrx.a;
        switch(iqg0.b) {
            case 0: {
                ibnx.b(object0);
                if(!eor0.r.B) {
                    throw new IllegalArgumentException("establishTextInputSession called from an unattached node");
                }
                iio iio0 = ien.f(eor0);
                inx inx0 = (inx)ien.d(eor0).E.h(iqi.a);
                iqg0.b = 1;
                if(iqi.a(iio0, inx0, ibtw0, iqg0) == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        throw new ibnm();
    }
}

