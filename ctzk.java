public final class ctzk implements icih {
    final icih a;

    public ctzk(icih icih0) {
        this.a = icih0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        ctzj ctzj0;
        if((ibrl0 instanceof ctzj)) {
            ctzj0 = (ctzj)ibrl0;
            int v = ctzj0.b;
            if((v & 0x80000000) == 0) {
                ctzj0 = new ctzj(this, ibrl0);
            }
            else {
                ctzj0.b = v - 0x80000000;
            }
        }
        else {
            ctzj0 = new ctzj(this, ibrl0);
        }
        Object object1 = ctzj0.a;
        Object object2 = ibrx.a;
        switch(ctzj0.b) {
            case 0: {
                ibnx.b(object1);
                ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)ctze.a), ((byte[])object0), 0, ((byte[])object0).length, hftc.a);
                ProtoLiteMessage.P_makeImmutable(hftv0);
                ctzj0.b = 1;
                return this.a.a(((ctze)hftv0), ctzj0) == object2 ? object2 : ibom.a;
            }
            case 1: {
                ibnx.b(object1);
                return ibom.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

