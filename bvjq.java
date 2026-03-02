public final class bvjq implements icih {
    final icih a;

    public bvjq(icih icih0) {
        this.a = icih0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        bvjp bvjp0;
        if((ibrl0 instanceof bvjp)) {
            bvjp0 = (bvjp)ibrl0;
            int v = bvjp0.b;
            if((v & 0x80000000) == 0) {
                bvjp0 = new bvjp(this, ibrl0);
            }
            else {
                bvjp0.b = v - 0x80000000;
            }
        }
        else {
            bvjp0 = new bvjp(this, ibrl0);
        }
        Object object1 = bvjp0.a;
        Object object2 = ibrx.a;
        switch(bvjp0.b) {
            case 0: {
                ibnx.b(object1);
                bvjp0.b = 1;
                return this.a.a(((bvfw)object0).a, bvjp0) == object2 ? object2 : ibom.a;
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

