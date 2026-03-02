public final class bdqc {
    public static final void a(goz goz0, int v) {
        goz goz1 = goz0.ao(0xA0EB5E28);
        int v1 = 0;
        if(v != 0) {
            fiso.a(ism.a(0x7F0804D2, goz1, 0), null, iqn.a(hfc.e, "icon_arrow_drop_down"), 0L, goz1, 440, 8);  // drawable:gs_arrow_drop_down_vd_theme_24
            v1 = v;
        }
        else if(!goz1.ac()) {
            fiso.a(ism.a(0x7F0804D2, goz1, 0), null, iqn.a(hfc.e, "icon_arrow_drop_down"), 0L, goz1, 440, 8);  // drawable:gs_arrow_drop_down_vd_theme_24
        }
        else {
            goz1.G();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new bdpz(v1);
        }
    }

    public static final void b(goz goz0, int v) {
        goz goz1 = goz0.ao(-1012015089);
        int v1 = 0;
        if(v != 0) {
            fiso.a(ism.a(0x7F0804D3, goz1, 0), null, iqn.a(hfc.e, "icon_arrow_drop_up"), 0L, goz1, 440, 8);  // drawable:gs_arrow_drop_up_vd_theme_24
            v1 = v;
        }
        else if(!goz1.ac()) {
            fiso.a(ism.a(0x7F0804D3, goz1, 0), null, iqn.a(hfc.e, "icon_arrow_drop_up"), 0L, goz1, 440, 8);  // drawable:gs_arrow_drop_up_vd_theme_24
        }
        else {
            goz1.G();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new bdpy(v1);
        }
    }

    public static final void c(hfc hfc0, String s, String s1, int v, boolean z, long v1, long v2, goz goz0, int v3, int v4) {
        long v14;
        long v13;
        int v12;
        hfc hfc3;
        long v11;
        long v10;
        hfc hfc2;
        long v9;
        long v7;
        hfc hfc1;
        int v5;
        ibuq.f(s, "title");
        ibuq.f(s1, "subTitle");
        goz goz1 = goz0.ao(0xE9025D5A);
        if((v4 & 1) != 0) {
            v5 = v3 | 6;
            hfc1 = hfc0;
        }
        else if((v3 & 6) == 0) {
            hfc1 = hfc0;
            v5 = (goz1.X(hfc1) ? 4 : 2) | v3;
        }
        else {
            hfc1 = hfc0;
            v5 = v3;
        }
        if((v4 & 2) != 0) {
            v5 |= 0x30;
        }
        else if((v3 & 0x30) == 0) {
            v5 |= (goz1.X(s) ? 0x20 : 16);
        }
        if((v4 & 4) != 0) {
            v5 |= 0x180;
        }
        else if((v3 & 0x180) == 0) {
            v5 |= (goz1.X(s1) ? 0x100 : 0x80);
        }
        if((v4 & 8) != 0) {
            v5 |= 0xC00;
        }
        else if((v3 & 0xC00) == 0) {
            v5 |= (goz1.V(v) ? 0x800 : 0x400);
        }
        if((v4 & 16) != 0) {
            v5 |= 0x6000;
        }
        else if((v3 & 0x6000) == 0) {
            v5 |= (goz1.Y(z) ? 0x4000 : 0x2000);
        }
        int v6 = 0x10000;
        if((0x30000 & v3) == 0) {
            if((v4 & 0x20) == 0) {
                v7 = v1;
                if(goz1.W(v7)) {
                    v6 = 0x20000;
                }
            }
            else {
                v7 = v1;
            }
            v5 |= v6;
        }
        else {
            v7 = v1;
        }
        int v8 = 0x80000;
        if((0x180000 & v3) == 0) {
            if((v4 & 0x40) == 0) {
                v9 = v2;
                if(goz1.W(v9)) {
                    v8 = 0x100000;
                }
            }
            else {
                v9 = v2;
            }
            v5 |= v8;
        }
        else {
            v9 = v2;
        }
        if((0x92493 & v5) == 0x92492 && goz1.ac()) {
            goz1.G();
            hfc2 = hfc1;
            v10 = v7;
            v11 = v9;
        }
        else {
            goz1.I();
            if((v3 & 1) != 0 && !goz1.aa()) {
                goz1.G();
                if((v4 & 0x20) != 0) {
                    v5 &= 0xFFF8FFFF;
                }
                if((v4 & 0x40) != 0) {
                    v5 &= 0xFFC7FFFF;
                }
                hfc3 = hfc1;
                v12 = v5;
                v13 = v9;
            }
            else {
                hfc3 = (v4 & 1) == 0 ? hfc1 : hfc.e;
                if((v4 & 0x20) == 0) {
                    v14 = v7;
                }
                else {
                    v5 &= 0xFFF8FFFF;
                    v14 = fpu.a(goz1).f;
                }
                if((v4 & 0x40) == 0) {
                    v12 = v5;
                    v7 = v14;
                    v13 = v9;
                }
                else {
                    v13 = fpu.a(goz1).h;
                    v12 = v5 & 0xFFC7FFFF;
                    v7 = v14;
                }
            }
            goz1.w();
            hfc hfc4 = dls.w(dla.e(hfc3, 12.0f, 16.0f));
            iau iau0 = dll.b(dho.g(16.0f), hei.k, goz1, 54);
            int v15 = bdpx.a(gol.c(goz1));
            gzk gzk0 = goz1.ak();
            hfc hfc5 = hew.c(goz1, hfc4);
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
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v15))) {
                Integer integer0 = v15;
                goz1.P(integer0);
                goz1.p(integer0, ibtw2);
            }
            ibts ibts0 = iej.g;
            guo.a(goz1, ibts0);
            ibtw ibtw3 = iej.c;
            guo.b(goz1, hfc5, ibtw3);
            hey hey0 = hfc.e;
            hfc hfc6 = dls.k(hey0, 40.0f);
            dlq dlq0 = dlq.a;
            hfc hfc7 = cqx.c(hhi.a(hfc6, eah.a), v13);
            iau iau1 = dhw.a(hei.e, false);
            gzk gzk1 = goz1.ak();
            hfc hfc8 = hew.c(goz1, hfc7);
            goz1.O();
            int v16 = bdpx.a(gol.c(goz1));
            if(goz1.x) {
                goz1.t(ibth0);
            }
            else {
                goz1.T();
            }
            guo.b(goz1, iau1, ibtw0);
            guo.b(goz1, gzk1, ibtw1);
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v16))) {
                Integer integer1 = v16;
                goz1.P(integer1);
                goz1.p(integer1, ibtw2);
            }
            guo.a(goz1, ibts0);
            guo.b(goz1, hfc8, ibtw3);
            fiso.a(ism.a(v, goz1, v12 >> 9 & 14), null, hey0, v7, goz1, v12 >> 6 & 0x1C00 | 440, 0);
            goz1.z();
            hfc hfc9 = dlo.a(dlq0, hey0, 1.0f);
            iau iau2 = dii.a(dho.c, hei.m, goz1, 0);
            int v17 = bdpx.a(gol.c(goz1));
            gzk gzk2 = goz1.ak();
            hfc hfc10 = hew.c(goz1, hfc9);
            goz1.O();
            if(goz1.x) {
                goz1.t(ibth0);
            }
            else {
                goz1.T();
            }
            guo.b(goz1, iau2, ibtw0);
            guo.b(goz1, gzk2, ibtw1);
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v17))) {
                Integer integer2 = v17;
                goz1.P(integer2);
                goz1.p(integer2, ibtw2);
            }
            guo.a(goz1, ibts0);
            guo.b(goz1, hfc10, ibtw3);
            fiuk.b(s, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, fpu.d(goz1).i, goz1, v12 >> 3 & 14, 0, 0x1FFFE);
            fiuk.b(s1, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, fpu.d(goz1).l, goz1, v12 >> 6 & 14, 0, 0x1FFFE);
            goz1 = goz1;
            goz1.z();
            if(z) {
                goz1.M(0x308D2B85);
                bdqc.b(goz1, 0);
            }
            else {
                goz1.M(0x308DBB23);
                bdqc.a(goz1, 0);
            }
            goz1.x();
            goz1.z();
            v11 = v13;
            v10 = v7;
            hfc2 = hfc3;
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new bdqa(hfc2, s, s1, v, z, v10, v11, v3, v4);
        }
    }

    public static final void d(hfc hfc0, bdtx bdtx0, float f, goz goz0, int v) {
        goz goz2;
        ibuq.f(bdtx0, "credential");
        goz goz1 = goz0.ao(0x52562C0);
        int v1 = (v & 6) == 0 ? (goz1.X(hfc0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(bdtx0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (goz1.U(f) ? 0x100 : 0x80);
        }
        if((v1 & 0x93) == 0x92 && goz1.ac()) {
            goz1.G();
            goz2 = goz1;
        }
        else {
            hfc hfc1 = dls.w(dla.j(dla.e(hfc0, 12.0f, 8.0f), 0.0f, 0.0f, 0.0f, f, 7));
            iau iau0 = dii.a(dho.c, hei.m, goz1, 0);
            int v2 = bdpx.a(gol.c(goz1));
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
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v2))) {
                Integer integer0 = v2;
                goz1.P(integer0);
                goz1.p(integer0, ibtw0);
            }
            guo.a(goz1, iej.g);
            guo.b(goz1, hfc2, iej.c);
            jbn jbn0 = fpu.d(goz1).l;
            long v3 = fpu.a(goz1).q;
            jeu jeu0 = new jeu(500);
            fiuk.b(bdtx0.a, null, v3, 0L, jeu0, 0L, null, 0L, 0, false, 0, 0, null, jbn0, goz1, 0x180000, 0, 0x1FFBA);
            String s = bdtx0.b;
            goz1.M(0x3303E17C);
            if(s == null) {
                s = isq.c(0x7F15268F, goz1);  // string:pwm_credential_export_confirmation_no_username "No username"
            }
            goz1.x();
            jbn jbn1 = fpu.d(goz1).l;
            goz2 = goz1;
            fiuk.b(s, null, fpu.a(goz1).s, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, jbn1, goz2, 0, 0, 0x1FFFA);
            goz2.z();
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new bdqb(hfc0, bdtx0, f, v);
        }
    }
}

