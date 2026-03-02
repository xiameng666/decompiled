final class ctjt implements icih {
    final ibvd a;
    final icmn b;

    public ctjt(ibvd ibvd0, icmn icmn0) {
        this.a = ibvd0;
        this.b = icmn0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        ibvd ibvd0 = this.a;
        if(!((Boolean)((icnl)ibvd0.a).b()).booleanValue() && ((byte[])object0).length == 0) {
            icnl icnl0 = (icnl)ibvd0.a;
            do {
                Object object1 = icnl0.b();
                Boolean boolean0 = (Boolean)object1;
            }
            while(!icnl0.h(object1, Boolean.valueOf(true)));
            return ibom.a;
        }
        Object object2 = this.b.a(((byte[])object0), ibrl0);
        return object2 != ibrx.a ? ibom.a : object2;
    }
}

