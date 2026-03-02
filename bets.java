final class bets extends ibsl implements ibtw {
    int a;
    final betx b;
    private Object c;

    public bets(betx betx0, ibrl ibrl0) {
        this.b = betx0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((bets)this.c(((icih)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new bets(this.b, ibrl0);
        ibrl1.c = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            icih icih0 = (icih)this.c;
            icig icig0 = this.b.a.b();
            this.a = 1;
            if(icih0.a(icig0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

