public final class bvjz implements icih {
    final icih a;

    public bvjz(icih icih0) {
        this.a = icih0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        bvjy bvjy0;
        if((ibrl0 instanceof bvjy)) {
            bvjy0 = (bvjy)ibrl0;
            int v = bvjy0.b;
            if((v & 0x80000000) == 0) {
                bvjy0 = new bvjy(this, ibrl0);
            }
            else {
                bvjy0.b = v - 0x80000000;
            }
        }
        else {
            bvjy0 = new bvjy(this, ibrl0);
        }
        Object object1 = bvjy0.a;
        Object object2 = ibrx.a;
        switch(bvjy0.b) {
            case 0: {
                ibnx.b(object1);
                icih icih0 = this.a;
                bvku bvku0 = bvkp.b(((bvkw)object0));
                if(bvku0 != null) {
                    bvjy0.b = 1;
                    if(icih0.a(bvku0, bvjy0) == object2) {
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

