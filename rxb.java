public final class rxb implements icih {
    final icih a;

    public rxb(icih icih0) {
        this.a = icih0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        rxa rxa0;
        if((ibrl0 instanceof rxa)) {
            rxa0 = (rxa)ibrl0;
            int v = rxa0.b;
            if((v & 0x80000000) == 0) {
                rxa0 = new rxa(this, ibrl0);
            }
            else {
                rxa0.b = v - 0x80000000;
            }
        }
        else {
            rxa0 = new rxa(this, ibrl0);
        }
        Object object1 = rxa0.a;
        Object object2 = ibrx.a;
        switch(rxa0.b) {
            case 0: {
                ibnx.b(object1);
                rzy rzy0 = new rzy(((scz)object0));
                rxa0.b = 1;
                return this.a.a(rzy0, rxa0) == object2 ? object2 : ibom.a;
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

