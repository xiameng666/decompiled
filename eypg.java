final class eypg extends ibsl implements ibtw {
    int a;
    final eypi b;

    public eypg(eypi eypi0, ibrl ibrl0) {
        this.b = eypi0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((eypg)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new eypg(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            eypf eypf0 = new eypf(this.b);
            this.a = 1;
            if(this.b.b.f.oR(eypf0, this) == object1) {
                return object1;
            }
        }
        throw new ibnm();
    }
}

