public final class bvjn implements icih {
    final icih a;

    public bvjn(icih icih0) {
        this.a = icih0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        bvjm bvjm0;
        if((ibrl0 instanceof bvjm)) {
            bvjm0 = (bvjm)ibrl0;
            int v = bvjm0.b;
            if((v & 0x80000000) == 0) {
                bvjm0 = new bvjm(this, ibrl0);
            }
            else {
                bvjm0.b = v - 0x80000000;
            }
        }
        else {
            bvjm0 = new bvjm(this, ibrl0);
        }
        Object object1 = bvjm0.a;
        Object object2 = ibrx.a;
        switch(bvjm0.b) {
            case 0: {
                ibnx.b(object1);
                bvjm0.b = 1;
                return this.a.a(((bvku)object0).a, bvjm0) == object2 ? object2 : ibom.a;
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

