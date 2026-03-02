public final class dcyj implements icih {
    final icih a;
    final dcyu b;

    public dcyj(icih icih0, dcyu dcyu0) {
        this.a = icih0;
        this.b = dcyu0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        dcyi dcyi0;
        if((ibrl0 instanceof dcyi)) {
            dcyi0 = (dcyi)ibrl0;
            int v = dcyi0.b;
            if((v & 0x80000000) == 0) {
                dcyi0 = new dcyi(this, ibrl0);
            }
            else {
                dcyi0.b = v - 0x80000000;
            }
        }
        else {
            dcyi0 = new dcyi(this, ibrl0);
        }
        Object object1 = dcyi0.a;
        Object object2 = ibrx.a;
        switch(dcyi0.b) {
            case 0: {
                ibnx.b(object1);
                ibom ibom0 = (ibom)object0;
                Boolean boolean0 = Boolean.valueOf(djam.b(this.b.a));
                dcyi0.b = 1;
                return this.a.a(boolean0, dcyi0) == object2 ? object2 : ibom.a;
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

