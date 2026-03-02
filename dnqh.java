final class dnqh extends ibsl implements ibtw {
    int a;
    final dnqi b;

    public dnqh(dnqi dnqi0, ibrl ibrl0) {
        this.b = dnqi0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dnqh)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dnqh(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            this.a = 1;
            object0 = dqew.a(this.b.f, this);
            if(object0 == object1) {
                return object1;
            }
        }
        return Boolean.valueOf(((dqdy)object0).c);
    }
}

