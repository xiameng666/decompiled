public final class ctzo {
    public final ykf a;

    public ctzo(ykf ykf0) {
        ibuq.f(ykf0, "client");
        super();
        this.a = ykf0;
    }

    public final Object a(ctzb ctzb0, ibrl ibrl0) {
        ctzm ctzm0;
        if((ibrl0 instanceof ctzm)) {
            ctzm0 = (ctzm)ibrl0;
            int v = ctzm0.c;
            if((v & 0x80000000) == 0) {
                ctzm0 = new ctzm(this, ibrl0);
            }
            else {
                ctzm0.c = v - 0x80000000;
            }
        }
        else {
            ctzm0 = new ctzm(this, ibrl0);
        }
        Object object0 = ctzm0.a;
        Object object1 = ibrx.a;
        switch(ctzm0.c) {
            case 0: {
                ibnx.b(object0);
                byte[] arr_b = ctzb0.toBytesArray();
                ctzm0.c = 1;
                object0 = this.a.a("AppCastService", "GetAppList", arr_b, ctzm0);
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
        ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)ctyz.a), ((byte[])object0), 0, ((byte[])object0).length, hftc.a);
        ProtoLiteMessage.P_makeImmutable(hftv0);
        ibuq.e(((ctyz)hftv0), "parseFrom(...)");
        return (ctyz)hftv0;
    }

    public final Object b(ctzc ctzc0, ibrl ibrl0) {
        ctzn ctzn0;
        if((ibrl0 instanceof ctzn)) {
            ctzn0 = (ctzn)ibrl0;
            int v = ctzn0.c;
            if((v & 0x80000000) == 0) {
                ctzn0 = new ctzn(this, ibrl0);
            }
            else {
                ctzn0.c = v - 0x80000000;
            }
        }
        else {
            ctzn0 = new ctzn(this, ibrl0);
        }
        Object object0 = ctzn0.a;
        Object object1 = ibrx.a;
        switch(ctzn0.c) {
            case 0: {
                ibnx.b(object0);
                byte[] arr_b = ctzc0.toBytesArray();
                ctzn0.c = 1;
                object0 = this.a.a("AppCastService", "GetIcon", arr_b, ctzn0);
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
        ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)ctzd.a), ((byte[])object0), 0, ((byte[])object0).length, hftc.a);
        ProtoLiteMessage.P_makeImmutable(hftv0);
        ibuq.e(((ctzd)hftv0), "parseFrom(...)");
        return (ctzd)hftv0;
    }
}

