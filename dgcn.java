public final class dgcn implements icih {
    final icih a;

    public dgcn(icih icih0) {
        this.a = icih0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        dgcm dgcm0;
        if((ibrl0 instanceof dgcm)) {
            dgcm0 = (dgcm)ibrl0;
            int v = dgcm0.b;
            if((v & 0x80000000) == 0) {
                dgcm0 = new dgcm(this, ibrl0);
            }
            else {
                dgcm0.b = v - 0x80000000;
            }
        }
        else {
            dgcm0 = new dgcm(this, ibrl0);
        }
        Object object1 = dgcm0.a;
        Object object2 = ibrx.a;
        switch(dgcm0.b) {
            case 0: {
                ibnx.b(object1);
                icih icih0 = this.a;
                if((((dgyo)object0).a instanceof dhbq)) {
                    dgcm0.b = 1;
                    if(icih0.a(object0, dgcm0) == object2) {
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

