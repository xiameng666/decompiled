public final class dcya implements icih {
    final icih a;
    final dcyu b;

    public dcya(icih icih0, dcyu dcyu0) {
        this.a = icih0;
        this.b = dcyu0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        dcxz dcxz0;
        if((ibrl0 instanceof dcxz)) {
            dcxz0 = (dcxz)ibrl0;
            int v = dcxz0.b;
            if((v & 0x80000000) == 0) {
                dcxz0 = new dcxz(this, ibrl0);
            }
            else {
                dcxz0.b = v - 0x80000000;
            }
        }
        else {
            dcxz0 = new dcxz(this, ibrl0);
        }
        Object object1 = dcxz0.a;
        Object object2 = ibrx.a;
        switch(dcxz0.b) {
            case 0: {
                ibnx.b(object1);
                ibom ibom0 = (ibom)object0;
                Boolean boolean0 = Boolean.valueOf(dizr.g(this.b.a));
                dcxz0.b = 1;
                return this.a.a(boolean0, dcxz0) == object2 ? object2 : ibom.a;
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

