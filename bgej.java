public final class bgej implements icih {
    final icih a;
    final beev b;

    public bgej(icih icih0, beev beev0) {
        this.a = icih0;
        this.b = beev0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        bgei bgei0;
        if((ibrl0 instanceof bgei)) {
            bgei0 = (bgei)ibrl0;
            int v = bgei0.b;
            if((v & 0x80000000) == 0) {
                bgei0 = new bgei(this, ibrl0);
            }
            else {
                bgei0.b = v - 0x80000000;
            }
        }
        else {
            bgei0 = new bgei(this, ibrl0);
        }
        Object object1 = bgei0.a;
        Object object2 = ibrx.a;
        switch(bgei0.b) {
            case 0: {
                ibnx.b(object1);
                bedv bedv0 = betd.a(((bedv)object0), this.b);
                bgei0.b = 1;
                return this.a.a(bedv0, bgei0) == object2 ? object2 : ibom.a;
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

