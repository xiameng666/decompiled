public final class ctvl extends ibsl implements ibtw {
    int a;
    final ctvm b;

    public ctvl(ctvm ctvm0, ibrl ibrl0) {
        this.b = ctvm0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ctvl)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ctvl(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            ctvk ctvk0 = new ctvk(this.b);
            this.a = 1;
            if(icmt.h(((icmt)this.b.e.c), ctvk0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

