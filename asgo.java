public final class asgo implements icih {
    final icih a;

    public asgo(icih icih0) {
        this.a = icih0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        asgn asgn0;
        if((ibrl0 instanceof asgn)) {
            asgn0 = (asgn)ibrl0;
            int v = asgn0.b;
            if((v & 0x80000000) == 0) {
                asgn0 = new asgn(this, ibrl0);
            }
            else {
                asgn0.b = v - 0x80000000;
            }
        }
        else {
            asgn0 = new asgn(this, ibrl0);
        }
        Object object1 = asgn0.a;
        Object object2 = ibrx.a;
        switch(asgn0.b) {
            case 0: {
                ibnx.b(object1);
                aqqh aqqh0 = ((aqqh)object0).a(asgj.a);
                asgn0.b = 1;
                return this.a.a(aqqh0, asgn0) == object2 ? object2 : ibom.a;
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

