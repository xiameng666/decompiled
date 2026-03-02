public final class dcyd implements icih {
    final icih a;
    final dcyu b;

    public dcyd(icih icih0, dcyu dcyu0) {
        this.a = icih0;
        this.b = dcyu0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        dcyc dcyc0;
        if((ibrl0 instanceof dcyc)) {
            dcyc0 = (dcyc)ibrl0;
            int v = dcyc0.b;
            if((v & 0x80000000) == 0) {
                dcyc0 = new dcyc(this, ibrl0);
            }
            else {
                dcyc0.b = v - 0x80000000;
            }
        }
        else {
            dcyc0 = new dcyc(this, ibrl0);
        }
        Object object1 = dcyc0.a;
        Object object2 = ibrx.a;
        switch(dcyc0.b) {
            case 0: {
                ibnx.b(object1);
                ibom ibom0 = (ibom)object0;
                Boolean boolean0 = Boolean.valueOf(djbz.h(this.b.a));
                dcyc0.b = 1;
                return this.a.a(boolean0, dcyc0) == object2 ? object2 : ibom.a;
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

