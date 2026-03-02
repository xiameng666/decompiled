public final class beny implements icih {
    final icih a;

    public beny(icih icih0) {
        this.a = icih0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        benx benx0;
        if((ibrl0 instanceof benx)) {
            benx0 = (benx)ibrl0;
            int v = benx0.b;
            if((v & 0x80000000) == 0) {
                benx0 = new benx(this, ibrl0);
            }
            else {
                benx0.b = v - 0x80000000;
            }
        }
        else {
            benx0 = new benx(this, ibrl0);
        }
        Object object1 = benx0.a;
        Object object2 = ibrx.a;
        switch(benx0.b) {
            case 0: {
                ibnx.b(object1);
                icih icih0 = this.a;
                Object object3 = ((bedv)object0).b;
                if(object3 != null) {
                    benx0.b = 1;
                    if(icih0.a(object3, benx0) == object2) {
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

