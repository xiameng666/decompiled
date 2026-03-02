public final class dcvf {
    public static final void a(xnb xnb0, dcpn dcpn0, gyza gyza0, long v, gzat gzat0, boolean z) {
        ibuq.f(dcpn0, "analyticsLogger");
        ibuq.f(gyza0, "name");
        ibuq.f(gzat0, "useCase");
        icck icck0 = hvrc.c() ? iccl.c() : lpt.a(xnb0);
        icbb.b(icck0, null, null, new dcve(xnb0, dcpn0, gyza0, v, gzat0, z, null), 3);
    }

    public static void b(xnb xnb0) {
        ibrt ibrt0 = curg.d();
        ibuq.f(ibrt0, "context");
        dcva dcva0 = new dcva(xnb0);
        lsd lsd0 = new lsd(new ibuk(dcvu.class), new dcvb(xnb0), dcva0, new dcvc(xnb0));
        icbb.b(lpt.a(xnb0), ibrt0.plus(new iccj("frpEnforcement")), null, new dcvd(xnb0, lsd0, null), 2);
    }

    public static void c(xnb xnb0, dcpn dcpn0, gyza gyza0, long v, boolean z) {
        dcvf.a(xnb0, dcpn0, gyza0, v, gzat.b, z);
    }
}

