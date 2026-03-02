public final class sir {
    public static final void a(ibtw ibtw0, goz goz0, int v) {
        ibuq.f(ibtw0, "content");
        goz goz1 = goz0.ao(-1569048117);
        int v1 = (v & 6) == 0 ? (goz1.Z(ibtw0) ? 4 : 2) | v : v;
        if((v1 & 3) == 2 && goz1.ac()) {
            goz1.G();
        }
        else {
            if(sin.a()) {
                goz1.M(0xAD8D1172);
                hfc hfc0 = dls.w(hfc.e);
                iau iau0 = dll.b(dho.e, hei.j, goz1, 6);
                long v2 = gol.c(goz1);
                gzk gzk0 = goz1.ak();
                hfc hfc1 = hew.c(goz1, hfc0);
                ibth ibth0 = iej.a;
                goz1.O();
                if(goz1.x) {
                    goz1.t(ibth0);
                }
                else {
                    goz1.T();
                }
                int v3 = (int)(v2 ^ v2 >>> 0x20);
                guo.b(goz1, iau0, iej.e);
                guo.b(goz1, gzk0, iej.d);
                ibtw ibtw1 = iej.f;
                if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v3))) {
                    Integer integer0 = v3;
                    goz1.P(integer0);
                    goz1.p(integer0, ibtw1);
                }
                guo.a(goz1, iej.g);
                guo.b(goz1, hfc1, iej.c);
                ibtw0.a(goz1, Integer.valueOf(v1 & 14));
                goz1.z();
            }
            else {
                goz1.M(0xAD8F1EFE);
                ibtw0.a(goz1, Integer.valueOf(v1 & 14));
            }
            goz1.x();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new siq(ibtw0, v);
        }
    }
}

