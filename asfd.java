public final class asfd implements icih {
    final icih a;

    public asfd(icih icih0) {
        this.a = icih0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        asfc asfc0;
        if((ibrl0 instanceof asfc)) {
            asfc0 = (asfc)ibrl0;
            int v = asfc0.b;
            if((v & 0x80000000) == 0) {
                asfc0 = new asfc(this, ibrl0);
            }
            else {
                asfc0.b = v - 0x80000000;
            }
        }
        else {
            asfc0 = new asfc(this, ibrl0);
        }
        Object object1 = asfc0.a;
        Object object2 = ibrx.a;
        switch(asfc0.b) {
            case 0: {
                ibnx.b(object1);
                icih icih0 = this.a;
                if(((aqqh)object0).b() != null) {
                    Object object3 = ((aqqh)object0).b();
                    asfc0.b = 1;
                    if(icih0.a(object3, asfc0) == object2) {
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

