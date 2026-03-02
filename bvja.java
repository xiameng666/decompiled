public final class bvja implements icih {
    final icih a;

    public bvja(icih icih0) {
        this.a = icih0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        bviz bviz0;
        if((ibrl0 instanceof bviz)) {
            bviz0 = (bviz)ibrl0;
            int v = bviz0.b;
            if((v & 0x80000000) == 0) {
                bviz0 = new bviz(this, ibrl0);
            }
            else {
                bviz0.b = v - 0x80000000;
            }
        }
        else {
            bviz0 = new bviz(this, ibrl0);
        }
        Object object1 = bviz0.a;
        Object object2 = ibrx.a;
        switch(bviz0.b) {
            case 0: {
                ibnx.b(object1);
                icih icih0 = this.a;
                if((((bvfx)object0) instanceof bvfu)) {
                    bviz0.b = 1;
                    if(icih0.a(object0, bviz0) == object2) {
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

