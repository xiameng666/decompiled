public final class ctlw implements icih {
    final icih a;

    public ctlw(icih icih0) {
        this.a = icih0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        ctlv ctlv0;
        if((ibrl0 instanceof ctlv)) {
            ctlv0 = (ctlv)ibrl0;
            int v = ctlv0.b;
            if((v & 0x80000000) == 0) {
                ctlv0 = new ctlv(this, ibrl0);
            }
            else {
                ctlv0.b = v - 0x80000000;
            }
        }
        else {
            ctlv0 = new ctlv(this, ibrl0);
        }
        Object object1 = ctlv0.a;
        Object object2 = ibrx.a;
        switch(ctlv0.b) {
            case 0: {
                ibnx.b(object1);
                cubs cubs0 = cubr.a(((ProtoLiteMessage)ctze.a).v_newBuilder());
                cubs0.b(hfxt.a(((byte[])object0)));
                ctze ctze0 = cubs0.a();
                ctlv0.b = 1;
                return this.a.a(ctze0, ctlv0) == object2 ? object2 : ibom.a;
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

