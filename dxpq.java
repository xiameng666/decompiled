final class dxpq extends ibsl implements ibtw {
    int a;
    final dxpr b;
    final boolean c;
    final dymg d;

    public dxpq(dxpr dxpr0, boolean z, dymg dymg0, ibrl ibrl0) {
        this.b = dxpr0;
        this.c = z;
        this.d = dymg0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dxpq)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dxpq(this.b, this.c, this.d, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            dxpp dxpp0 = new dxpp(this.c, this.d, this.b);
            gmcd gmcd0 = this.b.c.b(this.b.d, dxpp0);
            this.a = 1;
            if(icpu.c(gmcd0, this) == object1) {
                return object1;
            }
        }
        dxpn dxpn0 = new dxpn(this.c, this.d);
        this.b.a(dxpn0);
        ((ggtj)dxpr.a.h()).V("low balance notification settings stored: %s, %s", this.c, this.d);
        return ibom.a;
    }
}

