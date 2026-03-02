public final class bvkc implements icih {
    final icih a;

    public bvkc(icih icih0) {
        this.a = icih0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        bvkb bvkb0;
        if((ibrl0 instanceof bvkb)) {
            bvkb0 = (bvkb)ibrl0;
            int v = bvkb0.b;
            if((v & 0x80000000) == 0) {
                bvkb0 = new bvkb(this, ibrl0);
            }
            else {
                bvkb0.b = v - 0x80000000;
            }
        }
        else {
            bvkb0 = new bvkb(this, ibrl0);
        }
        Object object1 = bvkb0.a;
        Object object2 = ibrx.a;
        switch(bvkb0.b) {
            case 0: {
                ibnx.b(object1);
                icih icih0 = this.a;
                bvfw bvfw0 = (((bvfx)object0) instanceof bvfw) ? ((bvfw)(((bvfx)object0))) : null;
                if(bvfw0 != null) {
                    bvkb0.b = 1;
                    if(icih0.a(bvfw0, bvkb0) == object2) {
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

