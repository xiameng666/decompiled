import android.content.Context;

public final class dnqq implements ccrt {
    private static final bboh a;
    private final Context b;
    private final edse c;
    private final dqew e;

    static {
        dnqq.a = bboh.b("Pay", bbcu.cZ);
    }

    public dnqq(Context context0, edse edse0, dqew dqew0) {
        ibuq.f(edse0, "walletInstallManager");
        ibuq.f(dqew0, "onboardingContextFetcher");
        super();
        this.b = context0;
        this.c = edse0;
        this.e = dqew0;
    }

    public final Object a(ccnu ccnu0, ibrl ibrl0) {
        ccoc ccoc4;
        ccoc ccoc3;
        ccoc ccoc2;
        ccoc ccoc1;
        ccoc ccoc0;
        dnqn dnqn0;
        if((ibrl0 instanceof dnqn)) {
            dnqn0 = (dnqn)ibrl0;
            int v = dnqn0.c;
            if((v & 0x80000000) == 0) {
                dnqn0 = new dnqn(this, ibrl0);
            }
            else {
                dnqn0.c = v - 0x80000000;
            }
        }
        else {
            dnqn0 = new dnqn(this, ibrl0);
        }
        Object object0 = dnqn0.a;
        Object object1 = ibrx.a;
        switch(dnqn0.c) {
            case 0: {
                ibnx.b(object0);
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ccnv.a).v_newBuilder();
                ibuq.f(hftp0, "builder");
                ccoc0 = new ccoc(hftp0);
                ibuq.f(ccnu0, "value");
                ProtoLiteBuilder hftp1 = ccoc0.a;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ccnv ccnv0 = (ccnv)hftp1.b_message;
                ccnv0.b = ccnu0.a();
                dnqn0.d = ccoc0;
                dnqn0.e = ccoc0;
                dnqn0.f = ccoc0;
                dnqn0.c = 1;
                object0 = this.e(dnqn0);
                if(object0 == object1) {
                    return object1;
                }
                ccoc1 = ccoc0;
                ccoc2 = ccoc1;
                goto label_36;
            }
            case 1: {
                ccoc1 = dnqn0.f;
                ccoc0 = dnqn0.e;
                ccoc2 = dnqn0.d;
                ibnx.b(object0);
            label_36:
                int v1 = ((Boolean)object0).booleanValue() ^ 1;
                ProtoLiteBuilder hftp2 = ccoc1.a;
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                ((ccnv)hftp2.b_message).c = v1;
                if(hwjs.a.b().e()) {
                    dnqn0.d = ccoc2;
                    dnqn0.e = ccoc0;
                    dnqn0.f = null;
                    dnqn0.c = 2;
                    object0 = this.b(dnqn0);
                    if(object0 != object1) {
                        ccoc3 = ccoc0;
                        ccoc4 = ccoc2;
                        goto label_55;
                    }
                    return object1;
                }
                goto label_61;
            }
            case 2: {
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ccoc3 = dnqn0.e;
        ccoc4 = dnqn0.d;
        ibnx.b(object0);
    label_55:
        boolean z = ((Boolean)object0).booleanValue();
        ProtoLiteBuilder hftp3 = ccoc3.a;
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        ((ccnv)hftp3.b_message).d = z;
        ccoc2 = ccoc4;
    label_61:
        ProtoLiteMessage hftv0 = ccoc2.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (ccnv)hftv0;
    }

    public final Object b(ibrl ibrl0) {
        dnqo dnqo0;
        if((ibrl0 instanceof dnqo)) {
            dnqo0 = (dnqo)ibrl0;
            int v = dnqo0.c;
            if((v & 0x80000000) == 0) {
                dnqo0 = new dnqo(this, ibrl0);
            }
            else {
                dnqo0.c = v - 0x80000000;
            }
        }
        else {
            dnqo0 = new dnqo(this, ibrl0);
        }
        Object object0 = dnqo0.a;
        Object object1 = ibrx.a;
        switch(dnqo0.c) {
            case 0: {
                ibnx.b(object0);
                dnqo0.c = 1;
                object0 = dqew.a(this.e, dnqo0);
                return object0 == object1 ? object1 : Boolean.valueOf(((dqdy)object0).c);
            }
            case 1: {
                ibnx.b(object0);
                return Boolean.valueOf(((dqdy)object0).c);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    @Override  // ccrt
    public final Object c(ibrl ibrl0) {
        ccob ccob2;
        ccob ccob1;
        Object object2;
        dnqm dnqm0;
        if((ibrl0 instanceof dnqm)) {
            dnqm0 = (dnqm)ibrl0;
            int v = dnqm0.c;
            if((v & 0x80000000) == 0) {
                dnqm0 = new dnqm(this, ibrl0);
            }
            else {
                dnqm0.c = v - 0x80000000;
            }
        }
        else {
            dnqm0 = new dnqm(this, ibrl0);
        }
        Object object0 = dnqm0.a;
        Object object1 = ibrx.a;
        switch(dnqm0.c) {
            case 0: {
                ibnx.b(object0);
                ccob ccob0 = ccoa.a(((ProtoLiteMessage)ccnw.a).v_newBuilder());
                dnqm0.d = ccob0;
                dnqm0.e = ccob0;
                dnqm0.c = 1;
                edsd edsd0 = this.c.b();
                if(edsd0 == null) {
                    ((ggtj)dnqq.a.j()).x("Wallet install state cannot be determined. Returning default feature state...");
                    object2 = this.a(ccnu.b, dnqm0);
                }
                else {
                    switch(edsd0.ordinal()) {
                        case 0: {
                            ((ggtj)dnqq.a.j()).x("Wallet install state unknown. Returning default feature state");
                            object2 = this.a(ccnu.b, dnqm0);
                            break;
                        }
                        case 1: {
                            object2 = this.a(ccnu.e, dnqm0);
                            break;
                        }
                        case 2: {
                            object2 = this.a(ccnu.c, dnqm0);
                            break;
                        }
                        case 3: {
                            object2 = this.a(ccnu.d, dnqm0);
                            break;
                        }
                        default: {
                            throw new ibnq();
                        }
                    }
                }
                if(object2 != object1) {
                    ccob1 = ccob0;
                    object0 = object2;
                    ccob2 = ccob1;
                    break;
                }
                return object1;
            }
            case 1: {
                ccob2 = dnqm0.e;
                ccob1 = dnqm0.d;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ibuq.f(((ccnv)object0), "value");
        ProtoLiteBuilder hftp0 = ccob2.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ccnw ccnw0 = (ccnw)hftp0.b_message;
        ((ccnv)object0).getClass();
        ccnw0.c = (ccnv)object0;
        ccnw0.b = 5;
        return ccob1.a();
    }

    @Override  // ccrt
    public final Object d(ibrl ibrl0) {
        if(dnqe.a(this.b)) {
            return ccni.b;
        }
        ((ggtj)dnqq.a.h()).x("Pay settings are not available");
        return ccni.e;
    }

    public final Object e(ibrl ibrl0) {
        dnqp dnqp0;
        if((ibrl0 instanceof dnqp)) {
            dnqp0 = (dnqp)ibrl0;
            int v = dnqp0.c;
            if((v & 0x80000000) == 0) {
                dnqp0 = new dnqp(this, ibrl0);
            }
            else {
                dnqp0.c = v - 0x80000000;
            }
        }
        else {
            dnqp0 = new dnqp(this, ibrl0);
        }
        Object object0 = dnqp0.a;
        Object object1 = ibrx.a;
        switch(dnqp0.c) {
            case 0: {
                ibnx.b(object0);
                dnqp0.c = 1;
                object0 = dqew.a(this.e, dnqp0);
                return object0 == object1 ? object1 : Boolean.valueOf(((dqdy)object0).a);
            }
            case 1: {
                ibnx.b(object0);
                return Boolean.valueOf(((dqdy)object0).a);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

