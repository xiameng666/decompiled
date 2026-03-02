final class cqp extends ibsl implements ibtw {
    final cqq a;

    public cqp(cqq cqq0, ibrl ibrl0) {
        this.a = cqq0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((cqp)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new cqp(this.a, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        cqq cqq0 = this.a;
        dgc dgc0 = cqq0.g;
        if(dgc0 != null) {
            dgd dgd0 = new dgd(dgc0);
            dgg dgg0 = cqq0.b;
            if(dgg0 != null) {
                icbb.b(cqq0.J(), null, null, new cqb(dgg0, dgd0, null), 3);
            }
            cqq0.g = null;
        }
        return ibom.a;
    }
}

