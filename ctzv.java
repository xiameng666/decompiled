public final class ctzv implements icih {
    final icih a;

    public ctzv(icih icih0) {
        this.a = icih0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        ctzu ctzu0;
        if((ibrl0 instanceof ctzu)) {
            ctzu0 = (ctzu)ibrl0;
            int v = ctzu0.b;
            if((v & 0x80000000) == 0) {
                ctzu0 = new ctzu(this, ibrl0);
            }
            else {
                ctzu0.b = v - 0x80000000;
            }
        }
        else {
            ctzu0 = new ctzu(this, ibrl0);
        }
        Object object1 = ctzu0.a;
        Object object2 = ibrx.a;
        switch(ctzu0.b) {
            case 0: {
                ibnx.b(object1);
                ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)ctzs.a), ((byte[])object0), 0, ((byte[])object0).length, hftc.a);
                ProtoLiteMessage.P_makeImmutable(hftv0);
                ctzu0.b = 1;
                return this.a.a(((ctzs)hftv0), ctzu0) == object2 ? object2 : ibom.a;
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

