public final class bvcq {
    public static final void a(cmai cmai0, hfc hfc0, goz goz0, int v) {
        goz goz1 = goz0.ao(0x8E1475D2);
        int v1 = (v & 6) == 0 ? (((v & 8) == 0 ? goz1.X(cmai0) : goz1.Z(cmai0)) ? 4 : 2) | v : v;
        if(((v1 | 0x30) & 19) == 18 && goz1.ac()) {
            goz1.G();
        }
        else {
            hfc0 = hfc.e;
            hfc hfc1 = dla.i(dls.w(hfc0), 0.0f, 40.0f, 1);
            iau iau0 = dll.b(dho.e, hei.k, goz1, 54);
            long v2 = gol.c(goz1);
            gzk gzk0 = goz1.ak();
            hfc hfc2 = hew.c(goz1, hfc1);
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
            ibtw ibtw0 = iej.f;
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v3))) {
                Integer integer0 = v3;
                goz1.P(integer0);
                goz1.p(integer0, ibtw0);
            }
            guo.a(goz1, iej.g);
            guo.b(goz1, hfc2, iej.c);
            cmah.a(cmai0, goz1, (v1 | 0x30) & 14);
            goz1.z();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new bvcp(cmai0, hfc0, v);
        }
    }
}

