public final class ctxw implements icih {
    final icih a;

    public ctxw(icih icih0) {
        this.a = icih0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        ctxv ctxv0;
        if((ibrl0 instanceof ctxv)) {
            ctxv0 = (ctxv)ibrl0;
            int v = ctxv0.b;
            if((v & 0x80000000) == 0) {
                ctxv0 = new ctxv(this, ibrl0);
            }
            else {
                ctxv0.b = v - 0x80000000;
            }
        }
        else {
            ctxv0 = new ctxv(this, ibrl0);
        }
        Object object1 = ctxv0.a;
        Object object2 = ibrx.a;
        switch(ctxv0.b) {
            case 0: {
                ibnx.b(object1);
                byte[] arr_b = ((ctzs)object0).toBytesArray();
                ctxv0.b = 1;
                return this.a.a(arr_b, ctxv0) == object2 ? object2 : ibom.a;
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

