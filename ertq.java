public final class ertq implements icih {
    final icih a;
    final String b;

    public ertq(icih icih0, String s) {
        this.a = icih0;
        this.b = s;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        ertp ertp0;
        if((ibrl0 instanceof ertp)) {
            ertp0 = (ertp)ibrl0;
            int v = ertp0.b;
            if((v & 0x80000000) == 0) {
                ertp0 = new ertp(this, ibrl0);
            }
            else {
                ertp0.b = v - 0x80000000;
            }
        }
        else {
            ertp0 = new ertp(this, ibrl0);
        }
        Object object1 = ertp0.a;
        Object object2 = ibrx.a;
        switch(ertp0.b) {
            case 0: {
                ibnx.b(object1);
                icih icih0 = this.a;
                if(ibuq.m(((erto)object0).a(), this.b)) {
                    ertp0.b = 1;
                    if(icih0.a(object0, ertp0) == object2) {
                        return object2;
                    }
                }
                return ibom.a;
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

