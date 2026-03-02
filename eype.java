final class eype extends ibsl implements ibtw {
    int a;
    final eypi b;
    final iced c;

    public eype(eypi eypi0, iced iced0, ibrl ibrl0) {
        this.b = eypi0;
        this.c = iced0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((eype)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new eype(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            this.a = 1;
            if(this.b.f.a(this) == object1) {
                return object1;
            }
        }
        this.b.g();
        iceb.a(this.c);
        return ibom.a;
    }
}

