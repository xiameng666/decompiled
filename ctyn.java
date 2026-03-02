public final class ctyn implements icih {
    final icih a;

    public ctyn(icih icih0) {
        this.a = icih0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        ctym ctym0;
        if((ibrl0 instanceof ctym)) {
            ctym0 = (ctym)ibrl0;
            int v = ctym0.b;
            if((v & 0x80000000) == 0) {
                ctym0 = new ctym(this, ibrl0);
            }
            else {
                ctym0.b = v - 0x80000000;
            }
        }
        else {
            ctym0 = new ctym(this, ibrl0);
        }
        Object object1 = ctym0.a;
        Object object2 = ibrx.a;
        switch(ctym0.b) {
            case 0: {
                ibnx.b(object1);
                byte[] arr_b = ((ctyr)object0).toBytesArray();
                ctym0.b = 1;
                return this.a.a(arr_b, ctym0) == object2 ? object2 : ibom.a;
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

