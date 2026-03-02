import java.util.Set;

public final class asqp {
    public static final bboh a;
    public final boolean b;
    public final fpwl c;
    public final ghzs d;
    public aqvj e;
    public ghzu f;
    public gfsx g;
    private final aqso h;
    private final fpwv i;
    private final asxf j;
    private final ibrt k;
    private final icta l;
    private final icta m;

    static {
        asqp.a = bboh.b("BackupNotificationsDeviceState", bbcu.dF);
    }

    public asqp(boolean z, fpwl fpwl0, ghzs ghzs0, aqso aqso0, fpwv fpwv0, asxf asxf0, ibrt ibrt0) {
        this.b = z;
        this.c = fpwl0;
        this.d = ghzs0;
        this.h = aqso0;
        this.i = fpwv0;
        this.j = asxf0;
        this.k = ibrt0;
        this.l = new icta();
        this.m = new icta();
    }

    public final aqvj a() {
        if(this.e == null) {
            aqvc aqvc0 = aqvd.a();
            aqvc0.c(24);
            aqvd aqvd0 = aqvc0.a();
            this.e = this.h.b(aqvd0).a;
        }
        aqvj aqvj0 = this.e;
        ibuq.c(aqvj0);
        return aqvj0;
    }

    public final Object b(ibrl ibrl0) {
        asql asql0;
        if((ibrl0 instanceof asql)) {
            asql0 = (asql)ibrl0;
            int v = asql0.c;
            if((v & 0x80000000) == 0) {
                asql0 = new asql(this, ibrl0);
            }
            else {
                asql0.c = v - 0x80000000;
            }
        }
        else {
            asql0 = new asql(this, ibrl0);
        }
        Object object0 = asql0.a;
        Object object1 = ibrx.a;
        switch(asql0.c) {
            case 0: {
                ibnx.b(object0);
                try {
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fpxe.a).v_newBuilder();
                    ibuq.f(hftp0, "builder");
                    ProtoLiteMessage hftv0 = hftp0.N_build();
                    ibuq.e(hftv0, "build(...)");
                    asql0.c = 1;
                    object0 = fpwv.c(this.i, ((fpxe)hftv0), asql0);
                    if(object0 == object1) {
                        return object1;
                    label_22:
                        ibnx.b(object0);
                    }
                    Set set0 = ibqg.c(new fpxg[]{fpxg.c, fpxg.d});
                    fpxg fpxg0 = fpxg.b(((fpxh)object0).b);
                    if(fpxg0 == null) {
                        fpxg0 = fpxg.a;
                    }
                    return set0.contains(fpxg0) ? ghzu.b : ghzu.c;
                }
                catch(iapl iapl0) {
                    break;
                }
            }
            case 1: {
                goto label_22;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        a.ae(asqp.a.j(), "Failed to get backup opt-in type shown in SUW.", iapl0);
        return ghzu.d;
    }

    public final Object c(ibrl ibrl0) {
        Object object2;
        icta icta1;
        asqm asqm0;
        if((ibrl0 instanceof asqm)) {
            asqm0 = (asqm)ibrl0;
            int v = asqm0.c;
            if((v & 0x80000000) == 0) {
                asqm0 = new asqm(this, ibrl0);
            }
            else {
                asqm0.c = v - 0x80000000;
            }
        }
        else {
            asqm0 = new asqm(this, ibrl0);
        }
        Object object0 = asqm0.a;
        Object object1 = ibrx.a;
        switch(asqm0.c) {
            case 0: {
                ibnx.b(object0);
                icta icta0 = this.m;
                asqm0.d = icta0;
                asqm0.c = 1;
                if(icta0.b(asqm0) != object1) {
                    icta1 = icta0;
                    break;
                }
                return object1;
            }
            case 1: {
                icta1 = asqm0.d;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            if(this.g == null) {
                gfsx gfsx0 = this.j.c();
                ibuq.e(gfsx0, "getStorageQuotaInfo(...)");
                this.g = gfsx0;
            }
            object2 = this.g;
            ibuq.c(object2);
        }
        finally {
            icta1.d();
        }
        return object2;
    }

    public final Object d(ibrl ibrl0) {
        Object object3;
        icta icta2;
        Throwable throwable1;
        Object object2;
        icta icta0;
        asqn asqn0;
        if((ibrl0 instanceof asqn)) {
            asqn0 = (asqn)ibrl0;
            int v = asqn0.c;
            if((v & 0x80000000) == 0) {
                asqn0 = new asqn(this, ibrl0);
            }
            else {
                asqn0.c = v - 0x80000000;
            }
        }
        else {
            asqn0 = new asqn(this, ibrl0);
        }
        Object object0 = asqn0.a;
        Object object1 = ibrx.a;
        switch(asqn0.c) {
            case 0: {
                ibnx.b(object0);
                icta0 = this.l;
                asqn0.d = icta0;
                asqn0.c = 1;
                if(icta0.b(asqn0) != object1) {
                    goto label_22;
                }
                return object1;
            }
            case 1: {
                icta icta1 = asqn0.d;
                ibnx.b(object0);
                icta0 = icta1;
                try {
                label_22:
                    asqo asqo0 = new asqo(this, null);
                    asqn0.d = icta0;
                    asqn0.c = 2;
                    object2 = icbd.a(this.k, asqo0, asqn0);
                }
                catch(Throwable throwable0) {
                    throwable1 = throwable0;
                    icta2 = icta0;
                    break;
                }
                if(object2 != object1) {
                    object0 = object2;
                    icta2 = icta0;
                    object3 = (ghzu)object0;
                    goto label_43;
                }
                return object1;
            }
            case 2: {
                try {
                    icta2 = asqn0.d;
                    ibnx.b(object0);
                    object3 = (ghzu)object0;
                    goto label_43;
                }
                catch(Throwable throwable1) {
                }
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        icta2.d();
        throw throwable1;
    label_43:
        icta2.d();
        return object3;
    }
}

