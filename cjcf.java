final class cjcf implements icih {
    final ibvd a;
    final icih b;

    public cjcf(ibvd ibvd0, icih icih0) {
        this.a = ibvd0;
        this.b = icih0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        cjce cjce0;
        if((ibrl0 instanceof cjce)) {
            cjce0 = (cjce)ibrl0;
            int v = cjce0.d;
            if((v & 0x80000000) == 0) {
                cjce0 = new cjce(this, ibrl0);
            }
            else {
                cjce0.d = v - 0x80000000;
            }
        }
        else {
            cjce0 = new cjce(this, ibrl0);
        }
        Object object1 = cjce0.b;
        Object object2 = ibrx.a;
        switch(cjce0.d) {
            case 0: {
                ibnx.b(object1);
                cjch cjch0 = (cjch)this.a.a;
                if(cjch0 != null) {
                    ibns ibns0 = new ibns(cjch0.a, object0);
                    cjce0.a = object0;
                    cjce0.d = 1;
                    if(this.b.a(ibns0, cjce0) == object2) {
                        return object2;
                    }
                }
                break;
            }
            case 1: {
                object0 = cjce0.a;
                ibnx.b(object1);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        this.a.a = new cjch(object0);
        return ibom.a;
    }
}

