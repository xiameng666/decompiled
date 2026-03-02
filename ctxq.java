public final class ctxq implements icih {
    final icih a;

    public ctxq(icih icih0) {
        this.a = icih0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        ctxp ctxp0;
        if((ibrl0 instanceof ctxp)) {
            ctxp0 = (ctxp)ibrl0;
            int v = ctxp0.b;
            if((v & 0x80000000) == 0) {
                ctxp0 = new ctxp(this, ibrl0);
            }
            else {
                ctxp0.b = v - 0x80000000;
            }
        }
        else {
            ctxp0 = new ctxp(this, ibrl0);
        }
        Object object1 = ctxp0.a;
        Object object2 = ibrx.a;
        switch(ctxp0.b) {
            case 0: {
                ibnx.b(object1);
                byte[] arr_b = ((ctze)object0).toBytesArray();
                ctxp0.b = 1;
                return this.a.a(arr_b, ctxp0) == object2 ? object2 : ibom.a;
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

