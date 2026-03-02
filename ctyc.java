public final class ctyc implements icih {
    final icih a;

    public ctyc(icih icih0) {
        this.a = icih0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        ctyb ctyb0;
        if((ibrl0 instanceof ctyb)) {
            ctyb0 = (ctyb)ibrl0;
            int v = ctyb0.b;
            if((v & 0x80000000) == 0) {
                ctyb0 = new ctyb(this, ibrl0);
            }
            else {
                ctyb0.b = v - 0x80000000;
            }
        }
        else {
            ctyb0 = new ctyb(this, ibrl0);
        }
        Object object1 = ctyb0.a;
        Object object2 = ibrx.a;
        switch(ctyb0.b) {
            case 0: {
                ibnx.b(object1);
                byte[] arr_b = ((cuaq)object0).toBytesArray();
                ctyb0.b = 1;
                return this.a.a(arr_b, ctyb0) == object2 ? object2 : ibom.a;
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

