public final class bgem implements icih {
    final icih a;

    public bgem(icih icih0) {
        this.a = icih0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        bgel bgel0;
        if((ibrl0 instanceof bgel)) {
            bgel0 = (bgel)ibrl0;
            int v = bgel0.b;
            if((v & 0x80000000) == 0) {
                bgel0 = new bgel(this, ibrl0);
            }
            else {
                bgel0.b = v - 0x80000000;
            }
        }
        else {
            bgel0 = new bgel(this, ibrl0);
        }
        Object object1 = bgel0.a;
        Object object2 = ibrx.a;
        switch(bgel0.b) {
            case 0: {
                ibnx.b(object1);
                bgel0.b = 1;
                return this.a.a((((bedv)object0).c() ? ((gged_interceptors)((bedv)object0).b) : null), bgel0) == object2 ? object2 : ibom.a;
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

