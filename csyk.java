public final class csyk implements icih {
    final icih a;
    final csym b;

    public csyk(icih icih0, csym csym0) {
        this.a = icih0;
        this.b = csym0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        csyj csyj0;
        if((ibrl0 instanceof csyj)) {
            csyj0 = (csyj)ibrl0;
            int v = csyj0.b;
            if((v & 0x80000000) == 0) {
                csyj0 = new csyj(this, ibrl0);
            }
            else {
                csyj0.b = v - 0x80000000;
            }
        }
        else {
            csyj0 = new csyj(this, ibrl0);
        }
        Object object1 = csyj0.a;
        Object object2 = ibrx.a;
        switch(csyj0.b) {
            case 0: {
                ibnx.b(object1);
                csyf csyf0 = new csyf(this.b, ((csyg)object0));
                csyj0.b = 1;
                return this.a.a(csyf0, csyj0) == object2 ? object2 : ibom.a;
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

