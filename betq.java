public final class betq implements icih {
    final icih a;

    public betq(icih icih0) {
        this.a = icih0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        betp betp0;
        if((ibrl0 instanceof betp)) {
            betp0 = (betp)ibrl0;
            int v = betp0.b;
            if((v & 0x80000000) == 0) {
                betp0 = new betp(this, ibrl0);
            }
            else {
                betp0.b = v - 0x80000000;
            }
        }
        else {
            betp0 = new betp(this, ibrl0);
        }
        Object object1 = betp0.a;
        Object object2 = ibrx.a;
        switch(betp0.b) {
            case 0: {
                ibnx.b(object1);
                betp0.b = 1;
                return this.a.a(Boolean.valueOf(((bgov)object0).e), betp0) == object2 ? object2 : ibom.a;
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

