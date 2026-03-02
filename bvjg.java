public final class bvjg implements icih {
    final icih a;

    public bvjg(icih icih0) {
        this.a = icih0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        bvjf bvjf0;
        if((ibrl0 instanceof bvjf)) {
            bvjf0 = (bvjf)ibrl0;
            int v = bvjf0.b;
            if((v & 0x80000000) == 0) {
                bvjf0 = new bvjf(this, ibrl0);
            }
            else {
                bvjf0.b = v - 0x80000000;
            }
        }
        else {
            bvjf0 = new bvjf(this, ibrl0);
        }
        Object object1 = bvjf0.a;
        Object object2 = ibrx.a;
        switch(bvjf0.b) {
            case 0: {
                ibnx.b(object1);
                icih icih0 = this.a;
                if(((bvku)object0).b.contains(buyj.b)) {
                    bvjf0.b = 1;
                    if(icih0.a(object0, bvjf0) == object2) {
                        return object2;
                    }
                }
                return ibom.a;
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

