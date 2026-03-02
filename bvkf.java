public final class bvkf implements icih {
    final icih a;

    public bvkf(icih icih0) {
        this.a = icih0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        bvke bvke0;
        if((ibrl0 instanceof bvke)) {
            bvke0 = (bvke)ibrl0;
            int v = bvke0.b;
            if((v & 0x80000000) == 0) {
                bvke0 = new bvke(this, ibrl0);
            }
            else {
                bvke0.b = v - 0x80000000;
            }
        }
        else {
            bvke0 = new bvke(this, ibrl0);
        }
        Object object1 = bvke0.a;
        Object object2 = ibrx.a;
        switch(bvke0.b) {
            case 0: {
                ibnx.b(object1);
                icih icih0 = this.a;
                bvku bvku0 = bvkp.b(((bvkw)object0));
                if(bvku0 != null) {
                    bvke0.b = 1;
                    if(icih0.a(bvku0, bvke0) == object2) {
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

