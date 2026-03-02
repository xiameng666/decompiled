public final class rwv implements icih {
    final icih a;

    public rwv(icih icih0) {
        this.a = icih0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        rwu rwu0;
        if((ibrl0 instanceof rwu)) {
            rwu0 = (rwu)ibrl0;
            int v = rwu0.b;
            if((v & 0x80000000) == 0) {
                rwu0 = new rwu(this, ibrl0);
            }
            else {
                rwu0.b = v - 0x80000000;
            }
        }
        else {
            rwu0 = new rwu(this, ibrl0);
        }
        Object object1 = rwu0.a;
        Object object2 = ibrx.a;
        switch(rwu0.b) {
            case 0: {
                ibnx.b(object1);
                rzy rzy0 = new rzy(((scz)object0));
                rwu0.b = 1;
                return this.a.a(rzy0, rwu0) == object2 ? object2 : ibom.a;
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

