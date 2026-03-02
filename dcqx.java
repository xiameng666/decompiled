public final class dcqx implements icih {
    final icih a;

    public dcqx(icih icih0) {
        this.a = icih0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        dcqw dcqw0;
        if((ibrl0 instanceof dcqw)) {
            dcqw0 = (dcqw)ibrl0;
            int v = dcqw0.b;
            if((v & 0x80000000) == 0) {
                dcqw0 = new dcqw(this, ibrl0);
            }
            else {
                dcqw0.b = v - 0x80000000;
            }
        }
        else {
            dcqw0 = new dcqw(this, ibrl0);
        }
        Object object1 = dcqw0.a;
        Object object2 = ibrx.a;
        switch(dcqw0.b) {
            case 0: {
                ibnx.b(object1);
                dcqw0.b = 1;
                return this.a.a(((dcrq)object0).a, dcqw0) == object2 ? object2 : ibom.a;
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

