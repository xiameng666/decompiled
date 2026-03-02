public final class dedq implements icih {
    final icih a;

    public dedq(icih icih0) {
        this.a = icih0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        dedp dedp0;
        if((ibrl0 instanceof dedp)) {
            dedp0 = (dedp)ibrl0;
            int v = dedp0.b;
            if((v & 0x80000000) == 0) {
                dedp0 = new dedp(this, ibrl0);
            }
            else {
                dedp0.b = v - 0x80000000;
            }
        }
        else {
            dedp0 = new dedp(this, ibrl0);
        }
        Object object1 = dedp0.a;
        Object object2 = ibrx.a;
        switch(dedp0.b) {
            case 0: {
                ibnx.b(object1);
                dedp0.b = 1;
                return this.a.a((((Boolean)object0).booleanValue() ? new deni(deyw.a) : new deni(deyy.a)), dedp0) == object2 ? object2 : ibom.a;
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

