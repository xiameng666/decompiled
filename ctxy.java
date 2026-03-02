public final class ctxy implements ykl {
    public ctqq a;
    private final String b;

    public ctxy() {
        this.b = "DeviceLinkDebugService";
    }

    @Override  // ykl
    public final ykk a(String s) {
        ibuq.f(s, "methodName");
        if(ibuq.m(s, "Ping")) {
            return new ykj(new ctxu(this, null));
        }
        return !ibuq.m(s, "StreamPings") ? null : new yki(new ctxt(this));
    }

    @Override  // ykl
    public final String b() {
        return this.b;
    }

    public final Object c(ibrl ibrl0) {
        ctpe ctpe0;
        if((ibrl0 instanceof ctpe)) {
            ctpe0 = (ctpe)ibrl0;
            int v = ctpe0.b;
            if((v & 0x80000000) == 0) {
                ctpe0 = new ctpe(this, ibrl0);
            }
            else {
                ctpe0.b = v - 0x80000000;
            }
        }
        else {
            ctpe0 = new ctpe(this, ibrl0);
        }
        Object object0 = ctpe0.a;
        Object object1 = ibrx.a;
        switch(ctpe0.b) {
            case 0: {
                ibnx.b(object0);
                ibvd ibvd0 = new ibvd();
                synchronized(this) {
                    ibvd0.a = this.a;
                }
                ctqq ctqq0 = (ctqq)ibvd0.a;
                if(ctqq0 != null) {
                    ctpe0.b = 1;
                    ctqq0.a.h.b(Boolean.valueOf(true));
                    ctqq0.a.k = new icbr();
                    icbr icbr0 = ctqq0.a.k;
                    if(icbr0 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    object0 = icbr0.F(ctpe0);
                    if(object0 != object1) {
                        return ((ctzs)object0) == null ? cubf.a(((ProtoLiteMessage)ctzs.a).v_newBuilder()).a() : ((ctzs)object0);
                    }
                    return object1;
                }
                return cubf.a(((ProtoLiteMessage)ctzs.a).v_newBuilder()).a();
            }
            case 1: {
                ibnx.b(object0);
                return ((ctzs)object0) == null ? cubf.a(((ProtoLiteMessage)ctzs.a).v_newBuilder()).a() : ((ctzs)object0);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

