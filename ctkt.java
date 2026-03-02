public final class ctkt implements icih {
    final icih a;

    public ctkt(icih icih0) {
        this.a = icih0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        ctks ctks0;
        if((ibrl0 instanceof ctks)) {
            ctks0 = (ctks)ibrl0;
            int v = ctks0.b;
            if((v & 0x80000000) == 0) {
                ctks0 = new ctks(this, ibrl0);
            }
            else {
                ctks0.b = v - 0x80000000;
            }
        }
        else {
            ctks0 = new ctks(this, ibrl0);
        }
        Object object1 = ctks0.a;
        Object object2 = ibrx.a;
        switch(ctks0.b) {
            case 0: {
                ibnx.b(object1);
                byte[] arr_b = ((ctze)object0).c.toByteArray();
                ctks0.b = 1;
                return this.a.a(arr_b, ctks0) == object2 ? object2 : ibom.a;
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

