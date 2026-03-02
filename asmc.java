public final class asmc {
    public static final bboh a;
    public final icnj b;
    private final aqga c;
    private final icck d;
    private final icnl e;

    static {
        asmc.a = bboh.b("BackupsNetworkSettingsUseCase", bbcu.dF);
    }

    public asmc(aqga aqga0, icck icck0) {
        ibuq.f(aqga0, "g1BackupClient");
        ibuq.f(icck0, "globalScope");
        super();
        this.c = aqga0;
        this.d = icck0;
        icnl icnl0 = icnm.a(aqqe.a);
        this.e = icnl0;
        this.b = iclp.b(new icjr(new asma(new icns(icnl0, new aslv(this, null))), new aslw(null)), icck0, icmy.a(0L, 3), aqqe.a);
    }

    public final Object a(ibrl ibrl0) {
        Object object0 = this.b(false, ibrl0);
        return object0 == ibrx.a ? object0 : ibom.a;
    }

    public final Object b(boolean z, ibrl ibrl0) {
        aslx aslx0;
        if((ibrl0 instanceof aslx)) {
            aslx0 = (aslx)ibrl0;
            int v = aslx0.c;
            if((v & 0x80000000) == 0) {
                aslx0 = new aslx(this, ibrl0);
            }
            else {
                aslx0.c = v - 0x80000000;
            }
        }
        else {
            aslx0 = new aslx(this, ibrl0);
        }
        Object object0 = aslx0.a;
        Object object1 = ibrx.a;
        switch(aslx0.c) {
            case 0: {
                ibnx.b(object0);
                iccs iccs0 = ictn.c(this.c.c(z));
                aslx0.c = 1;
                if(iccs0.n(aslx0) != object1) {
                    aslx0.c = 2;
                    return this.c(aslx0) != object1 ? ibom.a : object1;
                }
                return object1;
            }
            case 1: {
                ibnx.b(object0);
                aslx0.c = 2;
                return this.c(aslx0) != object1 ? ibom.a : object1;
            }
            case 2: {
                ibnx.b(object0);
                return ibom.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public final Object c(ibrl ibrl0) {
        Object object2;
        icnl icnl0;
        asmb asmb0;
        if((ibrl0 instanceof asmb)) {
            asmb0 = (asmb)ibrl0;
            int v = asmb0.d;
            if((v & 0x80000000) == 0) {
                asmb0 = new asmb(this, ibrl0);
            }
            else {
                asmb0.d = v - 0x80000000;
            }
        }
        else {
            asmb0 = new asmb(this, ibrl0);
        }
        Object object0 = asmb0.b;
        Object object1 = ibrx.a;
        switch(asmb0.d) {
            case 0: {
                ibnx.b(object0);
                icnl0 = this.e;
                goto label_21;
            }
            case 1: {
                object2 = asmb0.a;
                icnl0 = asmb0.e;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        do {
            if(icnl0.h(object2, new aqqf(object0))) {
                return ibom.a;
            }
        label_21:
            object2 = icnl0.b();
            aqqh aqqh0 = (aqqh)object2;
            iccs iccs0 = ictn.c(this.c.f());
            asmb0.e = icnl0;
            asmb0.a = object2;
            asmb0.d = 1;
            object0 = iccs0.n(asmb0);
        }
        while(object0 != object1);
        return object1;
    }
}

