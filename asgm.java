final class asgm extends ibsl implements ibtw {
    int a;
    final asgr b;
    private Object c;

    public asgm(asgr asgr0, ibrl ibrl0) {
        this.b = asgr0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((asgm)this.c(((ichm)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new asgm(this.b, ibrl0);
        ibrl1.c = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            ichm ichm0 = (ichm)this.c;
            String s = this.b.c();
            asgl asgl0 = new asgl(ichm0);
            this.b.b.d(s, asgl0);
            asgk asgk0 = new asgk(this.b);
            this.a = 1;
            if(ichl.b(ichm0, asgk0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

