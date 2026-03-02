public final class ejsm {
    public static final void a(hfc hfc0, gra gra0, ibth ibth0, goz goz0, int v) {
        ibuq.f(ibth0, "onClick");
        goz goz1 = goz0.ao(0x392437AD);
        int v1 = (v & 0x30) == 0 ? v | 6 | (goz1.X(gra0) ? 0x20 : 16) : v | 6;
        if((v & 0x180) == 0) {
            v1 |= (goz1.Z(ibth0) ? 0x100 : 0x80);
        }
        if((v1 & 0x93) == 0x92 && goz1.ac()) {
            goz1.G();
        }
        else {
            hfc0 = hfc.e;
            hej hej0 = hei.n;
            iau iau0 = dii.a(dho.g, hej0, goz1, 54);
            long v2 = gol.c(goz1);
            gzk gzk0 = goz1.ak();
            hfc hfc1 = hew.c(goz1, hfc0);
            ibth ibth1 = iej.a;
            goz1.O();
            if(goz1.x) {
                goz1.t(ibth1);
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
            guo.b(goz1, hfc1, iej.c);
            ejsb.d(dla.j(dls.k(hfc0, 70.0f), 0.0f, 10.0f, 0.0f, 0.0f, 13), gra0, goz1, v1 & 0x70);
            ejrv.a(dls.B(dls.D(hfc0, null, 3)), gra0, goz1, v1 & 0x70);
            hfc hfc2 = dls.D(hfc0, null, 3);
            ejsr.a(dim.a.a(hfc2, hej0), gra0, ibth0, goz1, v1 & 0x3F0);
            goz1.z();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new ejsl(hfc0, gra0, ibth0, v);
        }
    }
}

