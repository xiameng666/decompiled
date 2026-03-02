public final class saw implements icih {
    final icih a;

    public saw(icih icih0) {
        this.a = icih0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        Object object3;
        sav sav0;
        if((ibrl0 instanceof sav)) {
            sav0 = (sav)ibrl0;
            int v = sav0.b;
            if((v & 0x80000000) == 0) {
                sav0 = new sav(this, ibrl0);
            }
            else {
                sav0.b = v - 0x80000000;
            }
        }
        else {
            sav0 = new sav(this, ibrl0);
        }
        Object object1 = sav0.a;
        Object object2 = ibrx.a;
        switch(sav0.b) {
            case 0: {
                ibnx.b(object1);
                object3 = this.a;
                sav0.c = object3;
                sav0.b = 1;
                object1 = sbz.b(((rzz)object0), sav0);
                if(object1 != object2) {
                    sav0.c = null;
                    sav0.b = 2;
                    return ((icih)object3).a(object1, sav0) != object2 ? ibom.a : object2;
                }
                return object2;
            }
            case 1: {
                object3 = sav0.c;
                ibnx.b(object1);
                sav0.c = null;
                sav0.b = 2;
                return ((icih)object3).a(object1, sav0) != object2 ? ibom.a : object2;
            }
            case 2: {
                ibnx.b(object1);
                return ibom.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

