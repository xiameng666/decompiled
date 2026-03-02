final class epjd extends ibsl implements ibtw {
    int a;
    final epji b;
    final epng c;

    public epjd(epji epji0, epng epng0, ibrl ibrl0) {
        this.b = epji0;
        this.c = epng0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((epjd)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new epjd(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            String s = this.c.c;
            ibuq.e(s, "getPlaceId(...)");
            this.a = 1;
            if(this.b.f(s, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

