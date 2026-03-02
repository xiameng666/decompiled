public final class ctzh implements icih {
    final icih a;

    public ctzh(icih icih0) {
        this.a = icih0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        ctzg ctzg0;
        if((ibrl0 instanceof ctzg)) {
            ctzg0 = (ctzg)ibrl0;
            int v = ctzg0.b;
            if((v & 0x80000000) == 0) {
                ctzg0 = new ctzg(this, ibrl0);
            }
            else {
                ctzg0.b = v - 0x80000000;
            }
        }
        else {
            ctzg0 = new ctzg(this, ibrl0);
        }
        Object object1 = ctzg0.a;
        Object object2 = ibrx.a;
        switch(ctzg0.b) {
            case 0: {
                ibnx.b(object1);
                byte[] arr_b = ((ctze)object0).toBytesArray();
                ctzg0.b = 1;
                return this.a.a(arr_b, ctzg0) == object2 ? object2 : ibom.a;
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

