public final class bdxp implements icih {
    final icih a;

    public bdxp(icih icih0) {
        this.a = icih0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        gged_interceptors gged0;
        bdxo bdxo0;
        if((ibrl0 instanceof bdxo)) {
            bdxo0 = (bdxo)ibrl0;
            int v = bdxo0.b;
            if((v & 0x80000000) == 0) {
                bdxo0 = new bdxo(this, ibrl0);
            }
            else {
                bdxo0.b = v - 0x80000000;
            }
        }
        else {
            bdxo0 = new bdxo(this, ibrl0);
        }
        Object object1 = bdxo0.a;
        Object object2 = ibrx.a;
        switch(bdxo0.b) {
            case 0: {
                ibnx.b(object1);
                icih icih0 = this.a;
                if(((bedv)object0).c()) {
                    gged0 = (gged_interceptors)((bedv)object0).b;
                    if(gged0 == null) {
                        gged0 = ibps.a;
                    }
                }
                else {
                    gged0 = ibps.a;
                }
                bdxo0.b = 1;
                return icih0.a(gged0, bdxo0) == object2 ? object2 : ibom.a;
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

