public final class bega {
    public static final bboh a;
    public evpn b;
    public evqp c;
    public final lqi d;

    static {
        bega.a = bboh.b("ErrorResolutionRepository", bbcu.cX);
    }

    public bega() {
        this.b = null;
        this.c = null;
        this.d = new lqi(gfqx.a);
    }

    public final evql a(bedk bedk0) {
        if(this.c != null) {
            ((ggtj)bega.a.j()).x("There is already an ongoing error resolution. Cancelling current error resolution");
            return evrg.b();
        }
        evpn evpn0 = new evpn();
        evqp evqp0 = new evqp(evpn0.a);
        this.b = evpn0;
        this.c = evqp0;
        gfsx gfsx0 = gfsx.m(bedk0);
        this.d.l(gfsx0);
        return evqp0.a;
    }
}

