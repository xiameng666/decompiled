public final class erwl implements icih {
    final icih a;

    public erwl(icih icih0) {
        this.a = icih0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        erwk erwk0;
        if((ibrl0 instanceof erwk)) {
            erwk0 = (erwk)ibrl0;
            int v = erwk0.b;
            if((v & 0x80000000) == 0) {
                erwk0 = new erwk(this, ibrl0);
            }
            else {
                erwk0.b = v - 0x80000000;
            }
        }
        else {
            erwk0 = new erwk(this, ibrl0);
        }
        Object object1 = erwk0.a;
        Object object2 = ibrx.a;
        switch(erwk0.b) {
            case 0: {
                ibnx.b(object1);
                icih icih0 = this.a;
                erve erve0 = (erve)object0;
                if(!(erve0 instanceof erve)) {
                    erve0 = null;
                }
                if(erve0 != null) {
                    erwk0.b = 1;
                    if(icih0.a(erve0, erwk0) == object2) {
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

