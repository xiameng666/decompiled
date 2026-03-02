public final class dcuh implements icih {
    final icih a;

    public dcuh(icih icih0) {
        this.a = icih0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        dcug dcug0;
        if((ibrl0 instanceof dcug)) {
            dcug0 = (dcug)ibrl0;
            int v = dcug0.b;
            if((v & 0x80000000) == 0) {
                dcug0 = new dcug(this, ibrl0);
            }
            else {
                dcug0.b = v - 0x80000000;
            }
        }
        else {
            dcug0 = new dcug(this, ibrl0);
        }
        Object object1 = dcug0.a;
        Object object2 = ibrx.a;
        switch(dcug0.b) {
            case 0: {
                ibnx.b(object1);
                dcug0.b = 1;
                return this.a.a(Boolean.valueOf(((dclv)object0) != null), dcug0) == object2 ? object2 : ibom.a;
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

