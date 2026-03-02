import j..time.Duration;

final class eyjk extends ibsl implements ibtw {
    int a;
    final gfug b;
    final icbr c;

    public eyjk(gfug gfug0, icbr icbr0, ibrl ibrl0) {
        this.b = gfug0;
        this.c = icbr0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((eyjk)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new eyjk(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            Duration duration0 = glyb.d(homc.g()).minus(this.b.d());
            ibuq.e(duration0, "minus(...)");
            if(duration0.compareTo(Duration.ZERO) > 0) {
                this.a = 1;
                if(glya.a(duration0, this) == object1) {
                    return object1;
                }
            }
        }
        this.c.V(exzh.b);
        return ibom.a;
    }
}

