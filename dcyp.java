public final class dcyp implements icih {
    final icih a;
    final dcyu b;

    public dcyp(icih icih0, dcyu dcyu0) {
        this.a = icih0;
        this.b = dcyu0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        dcyo dcyo0;
        if((ibrl0 instanceof dcyo)) {
            dcyo0 = (dcyo)ibrl0;
            int v = dcyo0.b;
            if((v & 0x80000000) == 0) {
                dcyo0 = new dcyo(this, ibrl0);
            }
            else {
                dcyo0.b = v - 0x80000000;
            }
        }
        else {
            dcyo0 = new dcyo(this, ibrl0);
        }
        Object object1 = dcyo0.a;
        Object object2 = ibrx.a;
        switch(dcyo0.b) {
            case 0: {
                ibnx.b(object1);
                ibom ibom0 = (ibom)object0;
                Boolean boolean0 = Boolean.valueOf(dizr.f(this.b.a));
                dcyo0.b = 1;
                return this.a.a(boolean0, dcyo0) == object2 ? object2 : ibom.a;
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

