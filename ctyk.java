public final class ctyk implements icih {
    final icih a;

    public ctyk(icih icih0) {
        this.a = icih0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        ctyj ctyj0;
        if((ibrl0 instanceof ctyj)) {
            ctyj0 = (ctyj)ibrl0;
            int v = ctyj0.b;
            if((v & 0x80000000) == 0) {
                ctyj0 = new ctyj(this, ibrl0);
            }
            else {
                ctyj0.b = v - 0x80000000;
            }
        }
        else {
            ctyj0 = new ctyj(this, ibrl0);
        }
        Object object1 = ctyj0.a;
        Object object2 = ibrx.a;
        switch(ctyj0.b) {
            case 0: {
                ibnx.b(object1);
                byte[] arr_b = ((ctyq)object0).toBytesArray();
                ctyj0.b = 1;
                return this.a.a(arr_b, ctyj0) == object2 ? object2 : ibom.a;
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

