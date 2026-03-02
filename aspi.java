public final class aspi implements icih {
    final icih a;

    public aspi(icih icih0) {
        this.a = icih0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        aspg aspg0;
        if((ibrl0 instanceof aspg)) {
            aspg0 = (aspg)ibrl0;
            int v = aspg0.b;
            if((v & 0x80000000) == 0) {
                aspg0 = new aspg(this, ibrl0);
            }
            else {
                aspg0.b = v - 0x80000000;
            }
        }
        else {
            aspg0 = new aspg(this, ibrl0);
        }
        Object object1 = aspg0.a;
        Object object2 = ibrx.a;
        switch(aspg0.b) {
            case 0: {
                ibnx.b(object1);
                aqqh aqqh0 = ((aqqh)object0).a(new asph());
                aspg0.b = 1;
                return this.a.a(aqqh0, aspg0) == object2 ? object2 : ibom.a;
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

