final class cqm extends ibsl implements ibtw {
    int a;
    final cqq b;
    final dgj c;

    public cqm(cqq cqq0, dgj dgj0, ibrl ibrl0) {
        this.b = cqq0;
        this.c = dgj0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((cqm)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new cqm(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            dgg dgg0 = this.b.b;
            if(dgg0 != null) {
                this.a = 1;
                if(dgg0.b(this.c, this) == object1) {
                    return object1;
                }
            }
        }
        return ibom.a;
    }
}

