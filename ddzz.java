public final class ddzz {
    public static final void a(hpw hpw0, String s, ibth ibth0, goz goz0, int v) {
        String s1;
        goz goz2;
        ibuq.f(hpw0, "icon");
        ibuq.f(s, "label");
        goz goz1 = goz0.ao(1014860004);
        int v1 = (v & 6) == 0 ? (((v & 8) == 0 ? goz1.X(hpw0) : goz1.Z(hpw0)) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.X(s) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (goz1.Z(ibth0) ? 0x100 : 0x80);
        }
        if((v1 & 0x93) == 0x92 && goz1.ac()) {
            goz1.G();
            goz2 = goz1;
            s1 = s;
        }
        else {
            goz1.M(0x6E3C21FE);
            Object object0 = goz1.j();
            if(object0 == gop.a) {
                object0 = new dgh();
                goz1.P(object0);
            }
            goz1.x();
            ddxv.b(goz1);
            dhg dhg0 = dho.g(6.0f);
            hey hey0 = hfc.e;
            hfc hfc0 = cru.c(hey0, ((dgg)object0), null, false, null, new its(0), ibth0, 12);
            iau iau0 = dii.a(dhg0, hei.n, goz1, 0x30);
            int v2 = ddzv.a(gol.c(goz1));
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
            guo.b(goz1, hfc1, ibtw3);
            goz1.M(0x27ED6FAB);
            hmu hmu0 = fitu.b(fivj.a, goz1);
            goz1.x();
            long v3 = fpu.a(goz1).c;
            ctp ctp0 = fxh.b(false, 0.0f, 0L, 7);
            iau iau1 = dhw.a(hei.e, false);
            int v4 = ddzv.a(gol.c(goz1));
            gzk gzk1 = goz1.ak();
            hfc hfc2 = hew.c(goz1, ctm.a(cqx.c(hhi.a(dls.l(hey0, jkw.a(2214592512.0f, 56.0f)), hmu0), v3), ((dgg)object0), ctp0));
            goz1.O();
            if(goz1.x) {
                goz1.t(ibth1);
            }
            else {
                goz1.T();
            }
            guo.b(goz1, iau1, ibtw0);
            guo.b(goz1, gzk1, ibtw1);
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v4))) {
                Integer integer1 = v4;
                goz1.P(integer1);
                goz1.p(integer1, ibtw2);
            }
            guo.a(goz1, ibts0);
            guo.b(goz1, hfc2, ibtw3);
            long v5 = fpu.a(goz1).d;
            fiso.a(hpw0, null, dls.k(hey0, 24.0f), v5, goz1, v1 & 14 | 56, 0);
            goz2 = goz1;
            goz2.z();
            jbn jbn0 = fpu.d(goz2).x;
            s1 = s;
            gdh.b(s1, null, fpu.a(goz2).q, 0L, null, 0L, null, new jjy(3), 0L, 0, false, 0, 0, null, jbn0, goz2, v1 >> 3 & 14, 0, 0x1FBFA);
            goz2.z();
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new ddzx(hpw0, s1, ibth0, v);
        }
    }

    public static final void b(String s, hfc hfc0, String s1, ibtw ibtw0, ibtw ibtw1, goz goz0, int v, int v1) {
        String s5;
        ibtw ibtw4;
        String s3;
        hfc hfc2;
        goz goz2;
        ibtw ibtw3;
        ibtw ibtw2;
        String s2;
        hfc hfc1;
        int v2;
        ibuq.f(s, "title");
        goz goz1 = goz0.ao(0x5491C74A);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (goz1.X(s) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
            hfc1 = hfc0;
        }
        else if((v & 0x30) == 0) {
            hfc1 = hfc0;
            v2 |= (goz1.X(hfc1) ? 0x20 : 16);
        }
        else {
            hfc1 = hfc0;
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
            s2 = s1;
        }
        else if((v & 0x180) == 0) {
            s2 = s1;
            v2 |= (goz1.X(s2) ? 0x100 : 0x80);
        }
        else {
            s2 = s1;
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
            ibtw2 = ibtw0;
        }
        else if((v & 0xC00) == 0) {
            ibtw2 = ibtw0;
            v2 |= (goz1.Z(ibtw2) ? 0x800 : 0x400);
        }
        else {
            ibtw2 = ibtw0;
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
            ibtw3 = ibtw1;
        }
        else if((v & 0x6000) == 0) {
            ibtw3 = ibtw1;
            v2 |= (goz1.Z(ibtw3) ? 0x4000 : 0x2000);
        }
        else {
            ibtw3 = ibtw1;
        }
        if((v2 & 9363) == 9362 && goz1.ac()) {
            goz1.G();
            goz2 = goz1;
            hfc2 = hfc1;
            s3 = s2;
            ibtw4 = ibtw2;
        }
        else {
            hfc hfc3 = (v1 & 2) == 0 ? hfc1 : hfc.e;
            String s4 = (v1 & 4) == 0 ? s2 : null;
            ibtw ibtw5 = (v1 & 8) == 0 ? ibtw2 : null;
            if((v1 & 16) != 0) {
                ibtw3 = null;
            }
            hfc hfc4 = cqx.c(hhi.a(hfc3, fpu.c(goz1).a), fpu.a(goz1).D);
            ddxv.b(goz1);
            ddxv.b(goz1);
            hfc hfc5 = dls.w(dla.e(hfc4, 16.0f, 12.0f));
            iau iau0 = dll.b(dho.a, hei.k, goz1, 0x30);
            int v3 = ddzv.a(gol.c(goz1));
            gzk gzk0 = goz1.ak();
            hfc hfc6 = hew.c(goz1, hfc5);
            ibth ibth0 = iej.a;
            goz1.O();
            if(goz1.x) {
                goz1.t(ibth0);
            }
            else {
                goz1.T();
            }
            ibtw ibtw6 = iej.e;
            guo.b(goz1, iau0, ibtw6);
            ibtw ibtw7 = iej.d;
            guo.b(goz1, gzk0, ibtw7);
            ibtw ibtw8 = iej.f;
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v3))) {
                Integer integer0 = v3;
                goz1.P(integer0);
                goz1.p(integer0, ibtw8);
            }
            ibts ibts0 = iej.g;
            guo.a(goz1, ibts0);
            ibtw ibtw9 = iej.c;
            guo.b(goz1, hfc6, ibtw9);
            dlq dlq0 = dlq.a;
            goz1.M(921035054);
            if(ibtw5 != null) {
                ddxv.b(goz1);
                hfc hfc7 = dla.j(hfc.e, 0.0f, 0.0f, 12.0f, 0.0f, 11);
                iau iau1 = dhw.a(hei.a, false);
                int v4 = ddzv.a(gol.c(goz1));
                gzk gzk1 = goz1.ak();
                hfc hfc8 = hew.c(goz1, hfc7);
                goz1.O();
                if(goz1.x) {
                    goz1.t(ibth0);
                }
                else {
                    goz1.T();
                }
                guo.b(goz1, iau1, ibtw6);
                guo.b(goz1, gzk1, ibtw7);
                if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v4))) {
                    Integer integer1 = v4;
                    goz1.P(integer1);
                    goz1.p(integer1, ibtw8);
                }
                guo.a(goz1, ibts0);
                guo.b(goz1, hfc8, ibtw9);
                ibtw5.a(goz1, Integer.valueOf(v2 >> 9 & 14));
                goz1.z();
            }
            goz1.x();
            hfc hfc9 = dlo.a(dlq0, hfc.e, 1.0f);
            iau iau2 = dii.a(dho.c, hei.m, goz1, 0);
            int v5 = ddzv.a(gol.c(goz1));
            gzk gzk2 = goz1.ak();
            hfc hfc10 = hew.c(goz1, hfc9);
            goz1.O();
            hey hey0 = hfc.e;
            if(goz1.x) {
                goz1.t(ibth0);
            }
            else {
                goz1.T();
            }
            guo.b(goz1, iau2, ibtw6);
            guo.b(goz1, gzk2, ibtw7);
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v5))) {
                Integer integer2 = v5;
                goz1.P(integer2);
                goz1.p(integer2, ibtw8);
            }
            guo.a(goz1, ibts0);
            guo.b(goz1, hfc10, ibtw9);
            jbn jbn0 = fpu.d(goz1).h;
            gdh.b(s, null, fpu.a(goz1).q, 0L, null, 0L, null, null, 0L, 2, false, 2, 0, null, jbn0, goz1, v2 & 14, 0x6180, 0x1AFFA);
            goz2 = goz1;
            goz2.M(-979027687);
            if(s4 != null && s4.length() != 0) {
                jbn jbn1 = fpu.d(goz2).k;
                s5 = s4;
                gdh.b(s5, null, fpu.a(goz2).s, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, jbn1, goz2, v2 >> 6 & 14, 0, 0x1FFFA);
            }
            else {
                s5 = s4;
            }
            goz2.x();
            goz2.z();
            goz2.M(0x36E63080);
            ibtw3 = ibtw3;
            if(ibtw3 != null) {
                ddxv.b(goz2);
                hfc hfc11 = dla.j(hey0, 12.0f, 0.0f, 0.0f, 0.0f, 14);
                iau iau3 = dhw.a(hei.a, false);
                int v6 = ddzv.a(gol.c(goz2));
                gzk gzk3 = goz2.ak();
                hfc hfc12 = hew.c(goz2, hfc11);
                goz2.O();
                if(goz2.x) {
                    goz2.t(ibth0);
                }
                else {
                    goz2.T();
                }
                guo.b(goz2, iau3, ibtw6);
                guo.b(goz2, gzk3, ibtw7);
                if(goz2.x || !ibuq.m(goz2.j(), Integer.valueOf(v6))) {
                    Integer integer3 = v6;
                    goz2.P(integer3);
                    goz2.p(integer3, ibtw8);
                }
                guo.a(goz2, ibts0);
                guo.b(goz2, hfc12, ibtw9);
                ibtw3.a(goz2, Integer.valueOf(v2 >> 12 & 14));
                goz2.z();
            }
            goz2.x();
            goz2.z();
            s3 = s5;
            hfc2 = hfc3;
            ibtw4 = ibtw5;
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new ddzy(s, hfc2, s3, ibtw4, ibtw3, v, v1);
        }
    }

    public static final void c(hfc hfc0, ibtx ibtx0, goz goz0, int v, int v1) {
        int v2;
        ibuq.f(ibtx0, "content");
        goz goz1 = goz0.ao(1035099657);
        if(v1 == 0) {
            v2 = (v & 6) == 0 ? (goz1.X(hfc0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v & 0x30) == 0) {
            v2 |= (goz1.Z(ibtx0) ? 0x20 : 16);
        }
        if((v2 & 19) == 18 && goz1.ac()) {
            goz1.G();
        }
        else {
            if(v1 != 0) {
                hfc0 = hfc.e;
            }
            ddxv.b(goz1);
            dhg dhg0 = dho.g(2.0f);
            ddxv.b(goz1);
            hfc hfc1 = hhi.a(dla.i(hfc0, 16.0f, 0.0f, 2), fpu.c(goz1).f);
            iau iau0 = dii.a(dhg0, hei.m, goz1, 0);
            int v3 = ddzv.a(gol.c(goz1));
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
            ibtx0.a(dim.a, goz1, Integer.valueOf(v2 & 0x70 | 6));
            goz1.z();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new ddzw(hfc0, ibtx0, v, v1);
        }
    }
}

