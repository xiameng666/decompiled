public final class asef implements icih {
    final icih a;

    public asef(icih icih0) {
        this.a = icih0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        ased ased0;
        if((ibrl0 instanceof ased)) {
            ased0 = (ased)ibrl0;
            int v = ased0.b;
            if((v & 0x80000000) == 0) {
                ased0 = new ased(this, ibrl0);
            }
            else {
                ased0.b = v - 0x80000000;
            }
        }
        else {
            ased0 = new ased(this, ibrl0);
        }
        Object object1 = ased0.a;
        Object object2 = ibrx.a;
        switch(ased0.b) {
            case 0: {
                ibnx.b(object1);
                aqqh aqqh0 = ((aqqh)object0).a(new asee());
                ased0.b = 1;
                return this.a.a(aqqh0, ased0) == object2 ? object2 : ibom.a;
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

