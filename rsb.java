public final class rsb {
    public final icck a;

    public rsb(rng rng0, rrv rrv0) {
        ibuq.f(rng0, "onboardingFlagsProvider");
        ibuq.f(rrv0, "stableEnvironmentManager");
        super();
        this.a = iccl.b(ibrq.d(new icfg(null), icdc.a));
        hfsv hfsv0 = hfsu.a(((ProtoLiteMessage)hfst.a).v_newBuilder());
        hfsv0.c(3L);
        ghml.d(hfyo.c(hfsv0.a()), 1.5, 3);
    }

    static Object a(rsb rsb0, ibrl ibrl0) {
        rrx rrx0;
        if((ibrl0 instanceof rrx)) {
            rrx0 = (rrx)ibrl0;
            int v = rrx0.c;
            if((v & 0x80000000) == 0) {
                rrx0 = new rrx(rsb0, ibrl0);
            }
            else {
                rrx0.c = v - 0x80000000;
            }
        }
        else {
            rrx0 = new rrx(rsb0, ibrl0);
        }
        Object object0 = rrx0.a;
        switch(rrx0.c) {
            case 0: {
                ibnx.b(object0);
                sct.e("StableEnvironmentHelper", "Stable environment is not enabled");
                return ibom.a;
            }
            case 1: {
                ibnx.b(object0);
                if(((rsc)object0) != rsc.a) {
                    sct.e("StableEnvironmentHelper", a.o(((rsc)object0), "Failed to set stable environment for reason: null with result: "));
                }
                return ibom.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    @ibni
    static Object b(rsb rsb0, ibrl ibrl0) {
        rrz rrz0;
        if((ibrl0 instanceof rrz)) {
            rrz0 = (rrz)ibrl0;
            int v = rrz0.c;
            if((v & 0x80000000) == 0) {
                rrz0 = new rrz(rsb0, ibrl0);
            }
            else {
                rrz0.c = v - 0x80000000;
            }
        }
        else {
            rrz0 = new rrz(rsb0, ibrl0);
        }
        Object object0 = rrz0.a;
        switch(rrz0.c) {
            case 0: {
                ibnx.b(object0);
                sct.e("StableEnvironmentHelper", "Stable environment is not enabled");
                return ibom.a;
            }
            case 1: {
                ibnx.b(object0);
                if(((rsc)object0) != rsc.a) {
                    sct.e("StableEnvironmentHelper", a.o(((rsc)object0), "Failed to unset stable environment for reason: null with result: "));
                }
                return ibom.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    @ibni
    public final void c(rsd rsd0) {
        ibuq.f(rsd0, "contract");
        rsa rsa0 = new rsa(this, rsd0, null);
        icpu.e(this.a, rsa0);
    }
}

