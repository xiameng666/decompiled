final class dgon extends ibsl implements ibtw {
    int a;
    final dgop b;
    final iced c;

    public dgon(dgop dgop0, iced iced0, ibrl ibrl0) {
        this.b = dgop0;
        this.c = iced0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dgon)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dgon(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            dgom dgom0 = new dgom(null);
            this.a = 1;
            if(icll.b(this.b.k, dgom0, this) == object1) {
                return object1;
            }
        }
        iceb.a(this.c);
        return ibom.a;
    }
}

