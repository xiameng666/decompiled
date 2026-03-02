public final class zxg {
    public static final void a(znt znt0, hfc hfc0, goz goz0, int v) {
        ibtw ibtw4;
        zns zns1;
        ibth ibth1;
        ggqk ggqk1;
        goz goz2;
        hfc hfc1 = hfc0;
        ibuq.f(znt0, "attributes");
        goz goz1 = goz0.ao(0x3A161FD2);
        int v1 = (v & 6) == 0 ? v | (((v & 8) == 0 ? goz1.X(znt0) : goz1.Z(znt0)) ? 4 : 2) : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.X(hfc1) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
            goz2 = goz1;
        }
        else {
            iau iau0 = dii.a(dho.c, hei.m, goz1, 0);
            int v2 = zxe.a(gol.c(goz1));
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
            ibtw ibtw0 = iej.e;
            guo.b(goz1, iau0, ibtw0);
            ibtw ibtw1 = iej.d;
            guo.b(goz1, gzk0, ibtw1);
            ibtw ibtw2 = iej.f;
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v2))) {
                Integer integer0 = v2;
                goz1.P(integer0);
                goz1.p(integer0, ibtw2);
            }
            ibts ibts0 = iej.g;
            guo.a(goz1, ibts0);
            ibtw ibtw3 = iej.c;
            guo.b(goz1, hfc2, ibtw3);
            goz1.M(0x340825E0);
            ggqk ggqk0 = znt0.a.E();
            ibuq.e(ggqk0, "iterator(...)");
            while(ggqk0.hasNext()) {
                zns zns0 = (zns)ggqk0.next();
                iau iau1 = dll.b(dho.g(4.0f), hei.k, goz1, 54);
                int v3 = zxe.a(gol.c(goz1));
                gzk gzk1 = goz1.ak();
                hfc hfc3 = hew.c(goz1, hfc.e);
                goz1.O();
                if(goz1.x) {
                    goz1.t(ibth0);
                }
                else {
                    goz1.T();
                }
                guo.b(goz1, iau1, ibtw0);
                guo.b(goz1, gzk1, ibtw1);
                if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v3))) {
                    Integer integer1 = v3;
                    goz1.P(integer1);
                    goz1.p(integer1, ibtw2);
                }
                guo.a(goz1, ibts0);
                guo.b(goz1, hfc3, ibtw3);
                zhr zhr0 = zns0.a;
                goz1.M(0xCC9FCDC8);
                if(zhr0 == null) {
                    ggqk1 = ggqk0;
                    ibtw4 = ibtw3;
                    ibth1 = ibth0;
                    zns1 = zns0;
                }
                else {
                    ggqk1 = ggqk0;
                    ibth1 = ibth0;
                    zns1 = zns0;
                    ibtw4 = ibtw3;
                    aadq.b(zhr0, hys.a, hfc0, 0L, 0, 0, goz1, v1 << 3 & 0x380 | 0x30, 56);
                }
                goz1.x();
                jbn jbn0 = fpu.d(goz1).k;
                long v4 = fpu.a(goz1).s;
                hfc1 = hfc0;
                fiuk.b(zns1.b, hfc1, v4, 0L, jeu.a, 0L, null, 0L, 0, false, 0, 0, null, jbn0, goz1, v1 & 0x70 | 0x180000, 0, 131000);
                goz1.z();
                goz1 = goz1;
                ibtw3 = ibtw4;
                ggqk0 = ggqk1;
                ibth0 = ibth1;
                ibtw0 = ibtw0;
                ibtw1 = ibtw1;
                ibtw2 = ibtw2;
                ibts0 = ibts0;
            }
            goz2 = goz1;
            goz2.x();
            goz2.z();
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new zxf(znt0, hfc1, v);
        }
    }
}

