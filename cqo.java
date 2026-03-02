final class cqo extends ibsl implements ibtw {
    final cqq a;

    public cqo(cqq cqq0, ibrl ibrl0) {
        this.a = cqq0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((cqo)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new cqo(this.a, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        cqq cqq0 = this.a;
        if(cqq0.g == null) {
            dgc dgc0 = new dgc();
            dgg dgg0 = cqq0.b;
            if(dgg0 != null) {
                icbb.b(cqq0.J(), null, null, new cqa(dgg0, dgc0, null), 3);
            }
            cqq0.g = dgc0;
        }
        return ibom.a;
    }
}

