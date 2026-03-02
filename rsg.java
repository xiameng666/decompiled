import j..util.DesugarCollections;

public final class rsg implements icih {
    final icih a;
    final String b;

    public rsg(icih icih0, String s) {
        this.a = icih0;
        this.b = s;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        rsf rsf0;
        if((ibrl0 instanceof rsf)) {
            rsf0 = (rsf)ibrl0;
            int v = rsf0.b;
            if((v & 0x80000000) == 0) {
                rsf0 = new rsf(this, ibrl0);
            }
            else {
                rsf0.b = v - 0x80000000;
            }
        }
        else {
            rsf0 = new rsf(this, ibrl0);
        }
        Object object1 = rsf0.a;
        Object object2 = ibrx.a;
        switch(rsf0.b) {
            case 0: {
                ibnx.b(object1);
                Boolean boolean0 = Boolean.valueOf(DesugarCollections.unmodifiableMap(((rsn)object0).b).containsKey(this.b));
                rsf0.b = 1;
                return this.a.a(boolean0, rsf0) == object2 ? object2 : ibom.a;
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

