public final class asep implements icih {
    final icih a;

    public asep(icih icih0) {
        this.a = icih0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        asen asen0;
        if((ibrl0 instanceof asen)) {
            asen0 = (asen)ibrl0;
            int v = asen0.b;
            if((v & 0x80000000) == 0) {
                asen0 = new asen(this, ibrl0);
            }
            else {
                asen0.b = v - 0x80000000;
            }
        }
        else {
            asen0 = new asen(this, ibrl0);
        }
        Object object1 = asen0.a;
        Object object2 = ibrx.a;
        switch(asen0.b) {
            case 0: {
                ibnx.b(object1);
                aqqh aqqh0 = ((aqqh)object0).a(new aseo());
                asen0.b = 1;
                return this.a.a(aqqh0, asen0) == object2 ? object2 : ibom.a;
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

