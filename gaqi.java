final class gaqi extends ibsl implements ibtw {
    int a;
    final gaql b;
    final String c;
    private Object d;

    public gaqi(gaql gaql0, String s, ibrl ibrl0) {
        this.b = gaql0;
        this.c = s;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((gaqi)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new gaqi(this.b, this.c, ibrl0);
        ibrl1.d = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v != 0) {
            return object0;
        }
        icck icck0 = (icck)this.d;
        gbkj gbkj0 = (gbkj)this.b.c.a();
        ibuq.f(gbkj0, "<this>");
        ibuq.f(this.c, "actionName");
        ibuq.f(this.b.d, "coroutineScope");
        gbkx gbkx0 = new gbkx(gbkj0, this.c, null);
        gmcd gmcd0 = icpu.e(this.b.d, gbkx0);
        iccs iccs0 = icbb.a(icck0, null, null, new gaqg(gmcd0, null), 3);
        iccs0.t(new gaqh(gmcd0));
        this.a = 1;
        Object object2 = iccs0.n(this);
        return object2 == object1 ? object1 : object2;
    }
}

