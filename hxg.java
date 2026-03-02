public final class hxg implements ibrl, jks {
    public icbi a;
    final hxj b;
    private final hxj c;
    private final ibrl d;
    private hvv e;
    private final ibrt f;

    public hxg(hxj hxj0, ibrl ibrl0) {
        this.b = hxj0;
        super();
        this.c = hxj0;
        this.d = ibrl0;
        this.e = hvv.b;
        this.f = ibru.a;
    }

    @Override  // jks
    public final float dX() {
        return this.c.dX();
    }

    @Override  // jlc
    public final float dY() {
        return this.c.dY();
    }

    @Override  // jlc
    public final float ea(long v) {
        return jlb.a(this.c, v);
    }

    @Override  // jks
    public final float eb(float f) {
        return jkr.a(this.c, f);
    }

    @Override  // jks
    public final float ec(int v) {
        return jkr.b(this.c, v);
    }

    @Override  // jks
    public final float ed(long v) {
        return jkr.c(this.c, v);
    }

    @Override  // jks
    public final float eg(float f) {
        return jkr.d(this.c, f);
    }

    @Override  // jks
    public final int eh(long v) {
        return jkr.e(this.c, v);
    }

    @Override  // jks
    public final int ei(float f) {
        return jkr.f(this.c, f);
    }

    @Override  // jks
    public final long ej(long v) {
        return jkr.g(this.c, v);
    }

    @Override  // jks
    public final long ek(long v) {
        return jkr.h(this.c, v);
    }

    @Override  // jlc
    public final long el(float f) {
        return jlb.b(this.c, f);
    }

    @Override  // jks
    public final long em(float f) {
        return jkr.i(this.c, f);
    }

    public final long n() {
        long v = this.b.o().g();
        long v1 = jkr.h(this.b, v);
        return ((long)Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat(((int)(v1 >> 0x20))) - ((float)(((int)(this.b.g >> 0x20))))) / 2.0f)) << 0x20 | ((long)Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat(((int)(v1 & 0xFFFFFFFFL))) - ((float)(((int)(this.b.g & 0xFFFFFFFFL))))) / 2.0f)) & 0xFFFFFFFFL;
    }

    public final long o() {
        return this.b.g;
    }

    public final hvt p() {
        return this.b.d;
    }

    public final iqy q() {
        return this.b.o();
    }

    public final Object r(hvv hvv0, ibrl ibrl0) {
        icbk icbk0 = new icbk(ibsc.c(ibrl0), 1);
        icbk0.z();
        this.e = hvv0;
        this.a = icbk0;
        Object object0 = icbk0.k();
        if(object0 == ibrx.a) {
            ibsi.b(ibrl0);
        }
        return object0;
    }

    public final Object s(long v, ibtw ibtw0, ibrl ibrl0) {
        Object object2;
        Throwable throwable1;
        hxd hxd0;
        if((ibrl0 instanceof hxd)) {
            hxd0 = (hxd)ibrl0;
            int v1 = hxd0.d;
            if((v1 & 0x80000000) == 0) {
                hxd0 = new hxd(this, ibrl0);
            }
            else {
                hxd0.d = v1 - 0x80000000;
            }
        }
        else {
            hxd0 = new hxd(this, ibrl0);
        }
        Object object0 = hxd0.b;
        Object object1 = ibrx.a;
        switch(hxd0.d) {
            case 0: {
                ibnx.b(object0);
                if(v <= 0L) {
                    icbi icbi0 = this.a;
                    if(icbi0 != null) {
                        icbi0.w(ibnx.a(new hvw(v)));
                    }
                }
                iced iced0 = icbb.b(this.b.J(), null, null, new hxe(v, this, null), 3);
                try {
                    hxd0.a = iced0;
                    hxd0.d = 1;
                    object0 = ibtw0.a(this, hxd0);
                }
                catch(Throwable throwable0) {
                    throwable1 = throwable0;
                    object2 = iced0;
                    ((iced)object2).x(hvg.a);
                    throw throwable1;
                }
                if(object0 != object1) {
                    object2 = iced0;
                    break;
                }
                return object1;
            }
            case 1: {
                try {
                    object2 = hxd0.a;
                    ibnx.b(object0);
                    break;
                }
                catch(Throwable throwable1) {
                }
                ((iced)object2).x(hvg.a);
                throw throwable1;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ((iced)object2).x(hvg.a);
        return object0;
    }

    public final Object t(long v, ibtw ibtw0, ibrl ibrl0) {
        hxf hxf0;
        if((ibrl0 instanceof hxf)) {
            hxf0 = (hxf)ibrl0;
            int v1 = hxf0.c;
            if((v1 & 0x80000000) == 0) {
                hxf0 = new hxf(this, ibrl0);
            }
            else {
                hxf0.c = v1 - 0x80000000;
            }
        }
        else {
            hxf0 = new hxf(this, ibrl0);
        }
        Object object0 = hxf0.a;
        Object object1 = ibrx.a;
        switch(hxf0.c) {
            case 0: {
                ibnx.b(object0);
                try {
                    hxf0.c = 1;
                    Object object2 = this.s(v, ibtw0, hxf0);
                    return object2 == object1 ? object1 : object2;
                label_19:
                    ibnx.b(object0);
                    return object0;
                }
                catch(hvw unused_ex) {
                    return null;
                }
            }
            case 1: {
                goto label_19;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    @Override  // ibrl
    public final ibrt u() {
        return this.f;
    }

    public final void v(hvt hvt0, hvv hvv0) {
        if(hvv0 == this.e) {
            icbi icbi0 = this.a;
            if(icbi0 != null) {
                this.a = null;
                icbi0.w(hvt0);
            }
        }
    }

    @Override  // ibrl
    public final void w(Object object0) {
        synchronized(this.b.f) {
            this.b.e.m(this);
        }
        this.d.w(object0);
    }
}

