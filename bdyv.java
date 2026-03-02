public final class bdyv implements icih {
    final icih a;

    public bdyv(icih icih0) {
        this.a = icih0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        bdyu bdyu0;
        if((ibrl0 instanceof bdyu)) {
            bdyu0 = (bdyu)ibrl0;
            int v = bdyu0.b;
            if((v & 0x80000000) == 0) {
                bdyu0 = new bdyu(this, ibrl0);
            }
            else {
                bdyu0.b = v - 0x80000000;
            }
        }
        else {
            bdyu0 = new bdyu(this, ibrl0);
        }
        Object object1 = bdyu0.a;
        Object object2 = ibrx.a;
        switch(bdyu0.b) {
            case 0: {
                ibnx.b(object1);
                Boolean boolean0 = (Boolean)object0;
                bdyu0.b = 1;
                return this.a.a(Boolean.valueOf(false), bdyu0) == object2 ? object2 : ibom.a;
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

