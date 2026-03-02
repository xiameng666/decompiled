public final class buuy implements icih {
    final icih a;

    public buuy(icih icih0) {
        this.a = icih0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        buux buux0;
        if((ibrl0 instanceof buux)) {
            buux0 = (buux)ibrl0;
            int v = buux0.b;
            if((v & 0x80000000) == 0) {
                buux0 = new buux(this, ibrl0);
            }
            else {
                buux0.b = v - 0x80000000;
            }
        }
        else {
            buux0 = new buux(this, ibrl0);
        }
        Object object1 = buux0.a;
        Object object2 = ibrx.a;
        switch(buux0.b) {
            case 0: {
                ibnx.b(object1);
                icih icih0 = this.a;
                String s = ((buye)object0).c;
                if(ibzk.D(s)) {
                    s = null;
                }
                buux0.b = 1;
                return icih0.a(s, buux0) == object2 ? object2 : ibom.a;
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

