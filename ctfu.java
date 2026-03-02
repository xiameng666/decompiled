public final class ctfu implements ccrt {
    private final csxk a;
    private final cuma b;

    public ctfu(csxk csxk0, cuma cuma0) {
        ibuq.f(csxk0, "settingsManager");
        ibuq.f(cuma0, "availabilityChecker");
        super();
        this.a = csxk0;
        this.b = cuma0;
    }

    @Override  // ccrt
    public final Object c(ibrl ibrl0) {
        ccno ccno0;
        ccob ccob2;
        ccob ccob1;
        ctfs ctfs0;
        if((ibrl0 instanceof ctfs)) {
            ctfs0 = (ctfs)ibrl0;
            int v = ctfs0.c;
            if((v & 0x80000000) == 0) {
                ctfs0 = new ctfs(this, ibrl0);
            }
            else {
                ctfs0.c = v - 0x80000000;
            }
        }
        else {
            ctfs0 = new ctfs(this, ibrl0);
        }
        Object object0 = ctfs0.a;
        Object object1 = ibrx.a;
        switch(ctfs0.c) {
            case 0: {
                ibnx.b(object0);
                ccob ccob0 = ccoa.a(((ProtoLiteMessage)ccnw.a).v_newBuilder());
                ctfs0.d = ccob0;
                ctfs0.e = ccob0;
                ctfs0.c = 1;
                Object object2 = this.b.a(ctfs0);
                if(object2 != object1) {
                    ccob1 = ccob0;
                    object0 = object2;
                    ccob2 = ccob1;
                    break;
                }
                return object1;
            }
            case 1: {
                ccob1 = ctfs0.e;
                ccob2 = ctfs0.d;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(((Boolean)object0).booleanValue()) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ccnp.a).v_newBuilder();
            ibuq.f(hftp0, "builder");
            switch(this.a.i().a.ordinal()) {
                case 0: {
                    ccno0 = ccno.a;
                    break;
                }
                case 1: {
                    ccno0 = ccno.b;
                    break;
                }
                case 2: {
                    ccno0 = ccno.c;
                    break;
                }
                case 3: {
                    ccno0 = ccno.d;
                    break;
                }
                case 4: {
                    ccno0 = ccno.e;
                    break;
                }
                case 5: {
                    ccno0 = ccno.a;
                    break;
                }
                default: {
                    throw new ibnq();
                }
            }
            ibuq.f(ccno0, "value");
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ccnp ccnp0 = (ccnp)hftp0.b_message;
            ccnp0.b = ccno0.a();
            ProtoLiteMessage hftv0 = hftp0.N_build();
            ibuq.e(hftv0, "build(...)");
            ibuq.f(((ccnp)hftv0), "value");
            ProtoLiteBuilder hftp1 = ccob1.a;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ccnw ccnw0 = (ccnw)hftp1.b_message;
            ((ccnp)hftv0).getClass();
            ccnw0.c = (ccnp)hftv0;
            ccnw0.b = 6;
        }
        return ccob2.a();
    }

    @Override  // ccrt
    public final Object d(ibrl ibrl0) {
        ctft ctft0;
        if((ibrl0 instanceof ctft)) {
            ctft0 = (ctft)ibrl0;
            int v = ctft0.c;
            if((v & 0x80000000) == 0) {
                ctft0 = new ctft(this, ibrl0);
            }
            else {
                ctft0.c = v - 0x80000000;
            }
        }
        else {
            ctft0 = new ctft(this, ibrl0);
        }
        Object object0 = ctft0.a;
        Object object1 = ibrx.a;
        switch(ctft0.c) {
            case 0: {
                ibnx.b(object0);
                ctft0.c = 1;
                object0 = this.b.a(ctft0);
                if(object0 == object1) {
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
        if(((Boolean)object0).booleanValue()) {
            switch(this.a.i().a.ordinal()) {
                case 0: {
                    return ccni.b;
                }
                case 1: {
                    return ccni.c;
                }
                case 2: {
                    return ccni.c;
                }
                case 3: {
                    return ccni.d;
                }
                case 4: {
                    return ccni.d;
                }
                case 5: {
                    return ccni.f;
                }
                default: {
                    throw new ibnq();
                }
            }
        }
        return ccni.e;
    }
}

