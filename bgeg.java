public final class bgeg implements icih {
    final icih a;
    final bgeu b;

    public bgeg(icih icih0, bgeu bgeu0) {
        this.a = icih0;
        this.b = bgeu0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        bgef bgef0;
        if((ibrl0 instanceof bgef)) {
            bgef0 = (bgef)ibrl0;
            int v = bgef0.b;
            if((v & 0x80000000) == 0) {
                bgef0 = new bgef(this, ibrl0);
            }
            else {
                bgef0.b = v - 0x80000000;
            }
        }
        else {
            bgef0 = new bgef(this, ibrl0);
        }
        Object object1 = bgef0.a;
        Object object2 = ibrx.a;
        switch(bgef0.b) {
            case 0: {
                ibnx.b(object1);
                boolean z = this.b.b && this.b.e.a().size() > 0 && ((Boolean)object0).booleanValue();
                bgef0.b = 1;
                return this.a.a(Boolean.valueOf(z), bgef0) == object2 ? object2 : ibom.a;
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

