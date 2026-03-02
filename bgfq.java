public final class bgfq implements icih {
    final icih a;

    public bgfq(icih icih0) {
        this.a = icih0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        bgfp bgfp0;
        if((ibrl0 instanceof bgfp)) {
            bgfp0 = (bgfp)ibrl0;
            int v = bgfp0.b;
            if((v & 0x80000000) == 0) {
                bgfp0 = new bgfp(this, ibrl0);
            }
            else {
                bgfp0.b = v - 0x80000000;
            }
        }
        else {
            bgfp0 = new bgfp(this, ibrl0);
        }
        Object object1 = bgfp0.a;
        Object object2 = ibrx.a;
        switch(bgfp0.b) {
            case 0: {
                ibnx.b(object1);
                Boolean boolean0 = (Boolean)object0;
                bgfp0.b = 1;
                return this.a.a(Boolean.valueOf(false), bgfp0) == object2 ? object2 : ibom.a;
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

