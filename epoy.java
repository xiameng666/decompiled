final class epoy extends ibsl implements ibtw {
    int a;
    Object b;
    final eppe c;

    public epoy(eppe eppe0, ibrl ibrl0) {
        this.c = eppe0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((epoy)this.c(((epfz)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new epoy(this.c, ibrl0);
        ibrl1.b = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            epox epox0 = new epox(((epfz)this.b));
            this.a = 1;
            if(this.c.ik(epox0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

