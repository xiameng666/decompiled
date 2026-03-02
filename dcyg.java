public final class dcyg implements icih {
    final icih a;
    final dcyu b;

    public dcyg(icih icih0, dcyu dcyu0) {
        this.a = icih0;
        this.b = dcyu0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        dcyf dcyf0;
        if((ibrl0 instanceof dcyf)) {
            dcyf0 = (dcyf)ibrl0;
            int v = dcyf0.b;
            if((v & 0x80000000) == 0) {
                dcyf0 = new dcyf(this, ibrl0);
            }
            else {
                dcyf0.b = v - 0x80000000;
            }
        }
        else {
            dcyf0 = new dcyf(this, ibrl0);
        }
        Object object1 = dcyf0.a;
        Object object2 = ibrx.a;
        switch(dcyf0.b) {
            case 0: {
                ibnx.b(object1);
                ibom ibom0 = (ibom)object0;
                Boolean boolean0 = Boolean.valueOf(djbz.g(this.b.a));
                dcyf0.b = 1;
                return this.a.a(boolean0, dcyf0) == object2 ? object2 : ibom.a;
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

