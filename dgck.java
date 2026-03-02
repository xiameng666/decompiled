public final class dgck implements icih {
    final icih a;

    public dgck(icih icih0) {
        this.a = icih0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        dgcj dgcj0;
        if((ibrl0 instanceof dgcj)) {
            dgcj0 = (dgcj)ibrl0;
            int v = dgcj0.b;
            if((v & 0x80000000) == 0) {
                dgcj0 = new dgcj(this, ibrl0);
            }
            else {
                dgcj0.b = v - 0x80000000;
            }
        }
        else {
            dgcj0 = new dgcj(this, ibrl0);
        }
        Object object1 = dgcj0.a;
        Object object2 = ibrx.a;
        switch(dgcj0.b) {
            case 0: {
                ibnx.b(object1);
                icih icih0 = this.a;
                if((((dgyo)object0).a instanceof dgzn)) {
                    dgcj0.b = 1;
                    if(icih0.a(object0, dgcj0) == object2) {
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

