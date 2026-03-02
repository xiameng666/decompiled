public final class ctzx {
    public final ykf a;

    public ctzx(ykf ykf0) {
        ibuq.f(ykf0, "client");
        super();
        this.a = ykf0;
    }

    public final Object a(ctzr ctzr0, ibrl ibrl0) {
        ctzt ctzt0;
        if((ibrl0 instanceof ctzt)) {
            ctzt0 = (ctzt)ibrl0;
            int v = ctzt0.c;
            if((v & 0x80000000) == 0) {
                ctzt0 = new ctzt(this, ibrl0);
            }
            else {
                ctzt0.c = v - 0x80000000;
            }
        }
        else {
            ctzt0 = new ctzt(this, ibrl0);
        }
        Object object0 = ctzt0.a;
        Object object1 = ibrx.a;
        switch(ctzt0.c) {
            case 0: {
                ibnx.b(object0);
                byte[] arr_b = ctzr0.toBytesArray();
                ctzt0.c = 1;
                object0 = this.a.a("DeviceLinkDebugService", "Ping", arr_b, ctzt0);
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
        ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)ctzs.a), ((byte[])object0), 0, ((byte[])object0).length, hftc.a);
        ProtoLiteMessage.P_makeImmutable(hftv0);
        ibuq.e(((ctzs)hftv0), "parseFrom(...)");
        return (ctzs)hftv0;
    }
}

