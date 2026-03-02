public final class aslz implements icih {
    final icih a;

    public aslz(icih icih0) {
        this.a = icih0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        asly asly0;
        if((ibrl0 instanceof asly)) {
            asly0 = (asly)ibrl0;
            int v = asly0.b;
            if((v & 0x80000000) == 0) {
                asly0 = new asly(this, ibrl0);
            }
            else {
                asly0.b = v - 0x80000000;
            }
        }
        else {
            asly0 = new asly(this, ibrl0);
        }
        Object object1 = asly0.a;
        Object object2 = ibrx.a;
        switch(asly0.b) {
            case 0: {
                ibnx.b(object1);
                asly0.b = 1;
                return this.a.a(((aqqh)object0), asly0) == object2 ? object2 : ibom.a;
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

