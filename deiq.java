public final class deiq {
    public static final void a(String s, hfc hfc0, String s1, ibtw ibtw0, float f, goz goz0, int v) {
        float f1;
        goz goz2;
        ibuq.f(s, "title");
        ibuq.f(hfc0, "modifier");
        ibuq.f(s1, "visibility");
        goz goz1 = goz0.ao(0xDDCEA717);
        int v1 = (v & 6) == 0 ? (goz1.X(s) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.X(hfc0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (goz1.X(s1) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v1 |= (goz1.Z(ibtw0) ? 0x800 : 0x400);
        }
        if((v & 0x6000) == 0) {
            v1 |= (goz1.U(f) ? 0x4000 : 0x2000);
        }
        if((v1 & 9363) == 9362 && goz1.ac()) {
            goz1.G();
            goz2 = goz1;
        }
        else {
            ddxv.b(goz1);
            dle dle0 = new dle(8.0f, 8.0f, 8.0f, 8.0f);
            ddxv.b(goz1);
            ddxv.b(goz1);
            ddxv.b(goz1);
            ddxv.b(goz1);
            dle dle1 = new dle(8.0f, 6.0f, 20.0f, 6.0f);
            if(jkv.a(f, 600.0f) >= 0) {
                dle0 = dle1;
            }
            hfc hfc1 = dls.D(dla.c(hfc0, dle0), null, 3);
            iau iau0 = dll.b(dho.a, hei.k, goz1, 0x30);
            int v2 = deio.a(gol.c(goz1));
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
            ibtw ibtw1 = iej.e;
            guo.b(goz1, iau0, ibtw1);
            ibtw ibtw2 = iej.d;
            guo.b(goz1, gzk0, ibtw2);
            ibtw ibtw3 = iej.f;
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v2))) {
                Integer integer0 = v2;
                goz1.P(integer0);
                goz1.p(integer0, ibtw3);
            }
            ibts ibts0 = iej.g;
            guo.a(goz1, ibts0);
            ibtw ibtw4 = iej.c;
            guo.b(goz1, hfc2, ibtw4);
            hey hey0 = hfc.e;
            if(jkv.a(f, 600.0f) >= 0) {
                goz1.M(0x51EE5770);
                ddxv.b(goz1);
                goz1.x();
                f1 = 8.0f;
            }
            else {
                goz1.M(0x51EF61F7);
                ddxv.b(goz1);
                goz1.x();
                f1 = 0.0f;
            }
            hfc hfc3 = dla.j(hey0, 0.0f, 0.0f, f1, 0.0f, 11);
            iau iau1 = dhw.a(hei.a, false);
            int v3 = deio.a(gol.c(goz1));
            gzk gzk1 = goz1.ak();
            hfc hfc4 = hew.c(goz1, hfc3);
            goz1.O();
            if(goz1.x) {
                goz1.t(ibth0);
            }
            else {
                goz1.T();
            }
            guo.b(goz1, iau1, ibtw1);
            guo.b(goz1, gzk1, ibtw2);
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v3))) {
                Integer integer1 = v3;
                goz1.P(integer1);
                goz1.p(integer1, ibtw3);
            }
            guo.a(goz1, ibts0);
            guo.b(goz1, hfc4, ibtw4);
            ibtw0.a(goz1, Integer.valueOf(v1 >> 9 & 14));
            goz1.z();
            goz1.M(-1202578995);
            if(jkv.a(f, 600.0f) >= 0) {
                iau iau2 = dii.a(dho.c, hei.m, goz1, 0);
                int v4 = deio.a(gol.c(goz1));
                gzk gzk2 = goz1.ak();
                hfc hfc5 = hew.c(goz1, hey0);
                goz1.O();
                if(goz1.x) {
                    goz1.t(ibth0);
                }
                else {
                    goz1.T();
                }
                guo.b(goz1, iau2, ibtw1);
                guo.b(goz1, gzk2, ibtw2);
                if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v4))) {
                    Integer integer2 = v4;
                    goz1.P(integer2);
                    goz1.p(integer2, ibtw3);
                }
                guo.a(goz1, ibts0);
                guo.b(goz1, hfc5, ibtw4);
                jbn jbn0 = fpu.d(goz1).C;
                goz2 = goz1;
                gdh.b(s, null, fpu.a(goz1).q, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, jbn0, goz2, v1 & 14, 0x6180, 0x1AFFA);
                jbn jbn1 = fpu.d(goz2).o;
                gdh.b(s1, null, fpu.a(goz2).q, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, jbn1, goz2, v1 >> 6 & 14, 0x6180, 0x1AFFA);
                goz2.z();
            }
            else {
                goz2 = goz1;
            }
            goz2.x();
            goz2.z();
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new deip(s, hfc0, s1, ibtw0, f, v);
        }
    }
}

