public final class bvki implements icih {
    final icih a;

    public bvki(icih icih0) {
        this.a = icih0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        bvkh bvkh0;
        if((ibrl0 instanceof bvkh)) {
            bvkh0 = (bvkh)ibrl0;
            int v = bvkh0.b;
            if((v & 0x80000000) == 0) {
                bvkh0 = new bvkh(this, ibrl0);
            }
            else {
                bvkh0.b = v - 0x80000000;
            }
        }
        else {
            bvkh0 = new bvkh(this, ibrl0);
        }
        Object object1 = bvkh0.a;
        Object object2 = ibrx.a;
        switch(bvkh0.b) {
            case 0: {
                ibnx.b(object1);
                icih icih0 = this.a;
                bvfv bvfv0 = (((bvfx)object0) instanceof bvfv) ? ((bvfv)(((bvfx)object0))) : null;
                if(bvfv0 != null) {
                    bvkh0.b = 1;
                    if(icih0.a(bvfv0, bvkh0) == object2) {
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

