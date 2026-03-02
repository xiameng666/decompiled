public final class bvjw implements icih {
    final icih a;

    public bvjw(icih icih0) {
        this.a = icih0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        bvjv bvjv0;
        if((ibrl0 instanceof bvjv)) {
            bvjv0 = (bvjv)ibrl0;
            int v = bvjv0.b;
            if((v & 0x80000000) == 0) {
                bvjv0 = new bvjv(this, ibrl0);
            }
            else {
                bvjv0.b = v - 0x80000000;
            }
        }
        else {
            bvjv0 = new bvjv(this, ibrl0);
        }
        Object object1 = bvjv0.a;
        Object object2 = ibrx.a;
        switch(bvjv0.b) {
            case 0: {
                ibnx.b(object1);
                bvjv0.b = 1;
                return this.a.a(((bvfv)object0).a, bvjv0) == object2 ? object2 : ibom.a;
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

