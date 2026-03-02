public final class bvza implements icih {
    final icih a;
    final hgmn b;

    public bvza(icih icih0, hgmn hgmn0) {
        this.a = icih0;
        this.b = hgmn0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        bvyz bvyz0;
        if((ibrl0 instanceof bvyz)) {
            bvyz0 = (bvyz)ibrl0;
            int v = bvyz0.b;
            if((v & 0x80000000) == 0) {
                bvyz0 = new bvyz(this, ibrl0);
            }
            else {
                bvyz0.b = v - 0x80000000;
            }
        }
        else {
            bvyz0 = new bvyz(this, ibrl0);
        }
        Object object1 = bvyz0.a;
        Object object2 = ibrx.a;
        switch(bvyz0.b) {
            case 0: {
                ibnx.b(object1);
                icih icih0 = this.a;
                hgmm hgmm0 = hgmm.b(((hgmn)object0).b);
                if(hgmm0 == null) {
                    hgmm0 = hgmm.f;
                }
                if(hgmm0 == (hgmm.b(this.b.b) == null ? hgmm.f : hgmm.b(this.b.b)) && ibuq.m(((hgmn)object0).c, this.b.c)) {
                    bvyz0.b = 1;
                    if(icih0.a(object0, bvyz0) == object2) {
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

