public final class bvjd implements icih {
    final icih a;

    public bvjd(icih icih0) {
        this.a = icih0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        bvjc bvjc0;
        if((ibrl0 instanceof bvjc)) {
            bvjc0 = (bvjc)ibrl0;
            int v = bvjc0.b;
            if((v & 0x80000000) == 0) {
                bvjc0 = new bvjc(this, ibrl0);
            }
            else {
                bvjc0.b = v - 0x80000000;
            }
        }
        else {
            bvjc0 = new bvjc(this, ibrl0);
        }
        Object object1 = bvjc0.a;
        Object object2 = ibrx.a;
        switch(bvjc0.b) {
            case 0: {
                ibnx.b(object1);
                icih icih0 = this.a;
                if(((bvku)object0).b.contains(buyj.c)) {
                    bvjc0.b = 1;
                    if(icih0.a(object0, bvjc0) == object2) {
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

