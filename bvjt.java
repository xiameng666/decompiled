public final class bvjt implements icih {
    final icih a;

    public bvjt(icih icih0) {
        this.a = icih0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        bvjs bvjs0;
        if((ibrl0 instanceof bvjs)) {
            bvjs0 = (bvjs)ibrl0;
            int v = bvjs0.b;
            if((v & 0x80000000) == 0) {
                bvjs0 = new bvjs(this, ibrl0);
            }
            else {
                bvjs0.b = v - 0x80000000;
            }
        }
        else {
            bvjs0 = new bvjs(this, ibrl0);
        }
        Object object1 = bvjs0.a;
        Object object2 = ibrx.a;
        switch(bvjs0.b) {
            case 0: {
                ibnx.b(object1);
                bvjs0.b = 1;
                return this.a.a(((bvku)object0).a, bvjs0) == object2 ? object2 : ibom.a;
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

