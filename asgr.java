import com.google.android.gms.backup.BackUpNowConfig;

public final class asgr {
    public static final bboh a;
    public final aqdx b;
    public final icck c;
    public final icmn d;
    private final ibrt e;
    private final ibnn f;
    private final ibnn g;
    private final ibnn h;

    static {
        asgr.a = bboh.b("BackUpNowUseCase", bbcu.dF);
    }

    public asgr(aqdx aqdx0, icck icck0, ibrt ibrt0) {
        ibuq.f(aqdx0, "backUpNowClient");
        ibuq.f(icck0, "coroutineScope");
        super();
        this.b = aqdx0;
        this.c = icck0;
        this.e = ibrt0;
        this.f = new ibnz(new asgd());
        this.d = icmu.e(0, 0, 0, 7);
        this.g = new ibnz(new asge(this));
        this.h = new ibnz(new asgf(this));
    }

    public final Object a(BackUpNowConfig backUpNowConfig0, ibrl ibrl0) {
        asgg asgg0;
        if((ibrl0 instanceof asgg)) {
            asgg0 = (asgg)ibrl0;
            int v = asgg0.d;
            if((v & 0x80000000) == 0) {
                asgg0 = new asgg(this, ibrl0);
            }
            else {
                asgg0.d = v - 0x80000000;
            }
        }
        else {
            asgg0 = new asgg(this, ibrl0);
        }
        Object object0 = asgg0.b;
        Object object1 = ibrx.a;
        switch(asgg0.d) {
            case 0: {
                ibnx.b(object0);
                aqqf aqqf0 = new aqqf(new asga(true));
                asgg0.a = backUpNowConfig0;
                asgg0.d = 1;
                if(this.d.a(aqqf0, asgg0) != object1) {
                    goto label_21;
                }
                return object1;
            }
            case 1: {
                backUpNowConfig0 = asgg0.a;
                ibnx.b(object0);
            label_21:
                asgh asgh0 = new asgh(this, backUpNowConfig0, null);
                asgg0.a = null;
                asgg0.d = 2;
                return icbd.a(this.e, asgh0, asgg0) != object1 ? ibom.a : object1;
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

    public final Object b(ibrl ibrl0) {
        asgq asgq0;
        if((ibrl0 instanceof asgq)) {
            asgq0 = (asgq)ibrl0;
            int v = asgq0.c;
            if((v & 0x80000000) == 0) {
                asgq0 = new asgq(this, ibrl0);
            }
            else {
                asgq0.c = v - 0x80000000;
            }
        }
        else {
            asgq0 = new asgq(this, ibrl0);
        }
        Object object0 = asgq0.a;
        Object object1 = ibrx.a;
        switch(asgq0.c) {
            case 0: {
                ibnx.b(object0);
                try {
                    iccs iccs0 = ictn.c(this.b.c());
                    asgq0.c = 1;
                    object0 = iccs0.n(asgq0);
                    if(object0 == object1) {
                        return object1;
                    label_19:
                        ibnx.b(object0);
                    }
                    ibuq.e(object0, "await(...)");
                    return new aqqf(new asga(((Boolean)object0).booleanValue()));
                }
                catch(aztb aztb0) {
                    break;
                }
            }
            case 1: {
                goto label_19;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return new aqqd(aztb0);
    }

    public final String c() {
        return (String)this.f.a();
    }

    public final icig d() {
        return (icig)this.g.a();
    }

    public final icnj e() {
        return (icnj)this.h.a();
    }
}

