public final class bykv {
    public static final void a(ibth ibth0, goz goz0, int v) {
        ibth ibth1;
        goz goz1 = goz0.ao(0x1B4B404);
        int v1 = (v & 6) == 0 ? (goz1.Z(ibth0) ? 4 : 2) | v : v;
        if((v1 & 3) == 2 && goz1.ac()) {
            goz1.G();
            ibth1 = ibth0;
        }
        else {
            ibth1 = ibth0;
            fnl.b(ibth1, dla.j(dls.k(hfc.e, 48.0f), 4.0f, 0.0f, 0.0f, 0.0f, 14), false, null, null, byjj.a, goz1, v1 & 14 | 0x180030, 60);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new byku(ibth1, v);
        }
    }
}

