public final class bykt {
    public static final void a(hqf hqf0, goz goz0, int v) {
        hqf hqf1;
        ibuq.f(hqf0, "imageVector");
        goz goz1 = goz0.ao(0x70A14E87);
        int v1 = (v & 6) == 0 ? (goz1.X(hqf0) ? 4 : 2) | v : v;
        if((v1 & 3) == 2 && goz1.ac()) {
            goz1.G();
            hqf1 = hqf0;
        }
        else {
            hey hey0 = hfc.e;
            hfc hfc0 = dls.B(dls.w(hey0));
            iau iau0 = dll.b(dho.e, hei.j, goz1, 6);
            int v2 = bykq.a(gol.c(goz1));
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
            guo.b(goz1, iau0, iej.e);
            guo.b(goz1, gzk0, iej.d);
            ibtw ibtw0 = iej.f;
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v2))) {
                Integer integer0 = v2;
                goz1.P(integer0);
                goz1.p(integer0, ibtw0);
            }
            guo.a(goz1, iej.g);
            guo.b(goz1, hfc1, iej.c);
            hqf1 = hqf0;
            fnq.b(hqf1, null, dls.k(hey0, 32.0f), fpu.a(goz1).a, goz1, v1 & 14 | 0x1B0, 0);
            goz1.z();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new byks(hqf1, v);
        }
    }

    public static final void b(hkn hkn0, hll hll0, goz goz0, int v) {
        hkn hkn1;
        goz goz1 = goz0.ao(0x95B03B0A);
        int v1 = (v & 6) == 0 ? (goz1.Z(hkn0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.X(hll0) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
            hkn1 = hkn0;
        }
        else {
            hey hey0 = hfc.e;
            hfc hfc0 = dls.B(dls.w(hey0));
            iau iau0 = dll.b(dho.e, hei.j, goz1, 6);
            int v2 = bykq.a(gol.c(goz1));
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
            guo.b(goz1, iau0, iej.e);
            guo.b(goz1, gzk0, iej.d);
            ibtw ibtw0 = iej.f;
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v2))) {
                Integer integer0 = v2;
                goz1.P(integer0);
                goz1.p(integer0, ibtw0);
            }
            guo.a(goz1, iej.g);
            guo.b(goz1, hfc1, iej.c);
            hfc hfc2 = dls.k(hey0, 32.0f);
            goz1.M(0x1CFD3FAF);
            goz1.x();
            hkn1 = hkn0;
            fnq.c(hkn1, hfc2, hll0.j, goz1, v1 & 14 | 0x1B0);
            goz1.z();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new bykr(hkn1, hll0, v);
        }
    }
}

