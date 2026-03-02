public final class zma implements evqf {
    public final zmi a;
    public final grxw b;

    public zma(zmi zmi0, grxw grxw0) {
        this.a = zmi0;
        this.b = grxw0;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        boolean z = ((gfsx)object0).i();
        zmi zmi0 = this.a;
        grxw grxw0 = this.b;
        if(z) {
            zho zho0 = (zho)((gfsx)object0).d();
            zmi0.h(gged_interceptors.l(zho0));
            zmi0.g(grxw0, zho0);
            return;
        }
        zjv zjv0 = zmi0.a(grxw0);
        zmi0.g(grxw0, ((zho)zmi.m(zmi0.e.c(zjv0))));
    }
}

