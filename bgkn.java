public final class bgkn {
    public static final void a(hfc hfc0, goz goz0, int v) {
        hfc hfc1;
        goz goz1 = goz0.ao(0xFEEEEFC9);
        if((((v & 6) == 0 ? (goz1.X(hfc0) ? 4 : 2) | v : v) & 3) == 2 && goz1.ac()) {
            goz1.G();
        }
        else {
            goz1.M(0xFEF22F32);
            if(hsam.f()) {
                hfc1 = dla.i(hfc.e, 0.0f, 12.0f, 1);
            }
            else {
                long v1 = fpu.a(goz1).p;
                hfc1 = dla.i(cqx.c(hfc.e, v1), 0.0f, 12.0f, 1);
            }
            goz1.x();
            gaq.c(hfc1, null, 0L, 0L, 0.0f, 0.0f, null, gzf.e(0x8D73F6E4, new bgkm(hfc0), goz1), goz1, 0x7E);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new bgkl(hfc0, v);
        }
    }
}

