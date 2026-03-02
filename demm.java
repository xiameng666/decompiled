import android.accounts.Account;

public final class demm {
    public static final void a(Account account0, String s, hfc hfc0, String s1, hpw hpw0, boolean z, goz goz0, int v, int v1) {
        String s5;
        int v5;
        boolean z1;
        String s3;
        hfc hfc2;
        String s2;
        hfc hfc1;
        Account account1;
        int v2;
        hpw hpw1 = hpw0;
        goz goz1 = goz0.ao(0xBCCA3EDD);
        if((v1 & 1) == 0) {
            account1 = account0;
            v2 = (v & 6) == 0 ? (goz1.Z(account1) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
            account1 = account0;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v2 |= (goz1.X(s) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
            hfc1 = hfc0;
        }
        else if((v & 0x180) == 0) {
            hfc1 = hfc0;
            v2 |= (goz1.X(hfc1) ? 0x100 : 0x80);
        }
        else {
            hfc1 = hfc0;
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
            s2 = s1;
        }
        else if((v & 0xC00) == 0) {
            s2 = s1;
            v2 |= (goz1.X(s2) ? 0x800 : 0x400);
        }
        else {
            s2 = s1;
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
        }
        else if((v & 0x6000) == 0) {
            v2 |= (((0x8000 & v) == 0 ? goz1.X(hpw1) : goz1.Z(hpw1)) ? 0x4000 : 0x2000);
        }
        if((v1 & 0x20) != 0) {
            v2 |= 0x30000;
        }
        else if((v & 0x30000) == 0) {
            v2 |= (goz1.Y(z) ? 0x20000 : 0x10000);
        }
        if((74899 & v2) == 74898 && goz1.ac()) {
            goz1.G();
            hfc2 = hfc1;
            s3 = s2;
            z1 = z;
        }
        else {
            hfc hfc3 = (v1 & 4) == 0 ? hfc1 : hfc.e;
            String s4 = (v1 & 8) == 0 ? s2 : null;
            if((v1 & 16) != 0) {
                hpw1 = null;
            }
            int v3 = ((v1 & 0x20) == 0 ? 1 : 0) & z;
            iau iau0 = dll.b(dho.a, hei.k, goz1, 0x30);
            int v4 = demd.a(gol.c(goz1));
            gzk gzk0 = goz1.ak();
            hfc hfc4 = hew.c(goz1, hfc3);
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
            if(goz1.x) {
                v5 = v2;
            label_75:
                Integer integer0 = v4;
                goz1.P(integer0);
                goz1.p(integer0, ibtw2);
            }
            else {
                v5 = v2;
                if(!ibuq.m(goz1.j(), Integer.valueOf(v4))) {
                    goto label_75;
                }
            }
            ibts ibts0 = iej.g;
            guo.a(goz1, ibts0);
            ibtw ibtw3 = iej.c;
            guo.b(goz1, hfc4, ibtw3);
            ddxv.b(goz1);
            hfc hfc5 = dla.j(hfc.e, 0.0f, 0.0f, 16.0f, 0.0f, 11);
            hey hey0 = hfc.e;
            iau iau1 = dhw.a(hei.a, false);
            int v6 = demd.a(gol.c(goz1));
            gzk gzk1 = goz1.ak();
            hfc hfc6 = hew.c(goz1, hfc5);
            goz1.O();
            if(goz1.x) {
                goz1.t(ibth0);
            }
            else {
                goz1.T();
            }
            guo.b(goz1, iau1, ibtw0);
            guo.b(goz1, gzk1, ibtw1);
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v6))) {
                Integer integer1 = v6;
                goz1.P(integer1);
                goz1.p(integer1, ibtw2);
            }
            guo.a(goz1, ibts0);
            guo.b(goz1, hfc6, ibtw3);
            ddbf.f(account1, 40.0f, ((boolean)v3), goz1, v5 & 14 | 0x30 | v5 >> 9 & 0x380, 0);
            z1 = v3;
            goz1.M(1404635460);
            if(hpw1 != null) {
                demm.b(hpw1, goz1, 8);
            }
            goz1.x();
            goz1.z();
            iau iau2 = dii.a(dho.c, hei.m, goz1, 0);
            int v7 = demd.a(gol.c(goz1));
            gzk gzk2 = goz1.ak();
            hfc hfc7 = hew.c(goz1, hey0);
            goz1.O();
            if(goz1.x) {
                goz1.t(ibth0);
            }
            else {
                goz1.T();
            }
            guo.b(goz1, iau2, ibtw0);
            guo.b(goz1, gzk2, ibtw1);
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v7))) {
                Integer integer2 = v7;
                goz1.P(integer2);
                goz1.p(integer2, ibtw2);
            }
            guo.a(goz1, ibts0);
            guo.b(goz1, hfc7, ibtw3);
            jbn jbn0 = fpu.d(goz1).w;
            gdh.b(s, null, fpu.a(goz1).q, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, jbn0, goz1, v5 >> 3 & 14, 0x6180, 0x1AFFA);
            goz1 = goz1;
            goz1.M(-59095573);
            if(s4 == null) {
                s5 = null;
            }
            else {
                jbn jbn1 = fpu.d(goz1).k;
                s5 = s4;
                gdh.b(s5, null, fpu.a(goz1).s, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, jbn1, goz1, 0, 0, 0x1FFFA);
                goz1 = goz1;
            }
            goz1.x();
            goz1.z();
            goz1.z();
            s3 = s5;
            hfc2 = hfc3;
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new deme(account0, s, hfc2, s3, hpw1, z1, v, v1);
        }
    }

    public static final void b(hpw hpw0, goz goz0, int v) {
        hpw hpw1;
        goz goz1 = goz0.ao(-1251490734);
        int v1 = (v & 6) == 0 ? (((v & 8) == 0 ? goz1.X(hpw0) : goz1.Z(hpw0)) ? 4 : 2) | v : v;
        if((v1 & 3) == 2 && goz1.ac()) {
            goz1.G();
            hpw1 = hpw0;
        }
        else {
            hey hey0 = hfc.e;
            hfc hfc0 = cqx.c(hhi.a(dla.d(crd.c(dls.k(dku.b(hey0, 24.0f, 20.0f), 24.0f), 2.0f, fpu.a(goz1).D, eah.a), 1.0f), eah.a), fpu.a(goz1).a);
            iau iau0 = dhw.a(hei.e, false);
            int v2 = demd.a(gol.c(goz1));
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
            long v3 = fpu.a(goz1).b;
            hpw1 = hpw0;
            fiso.a(hpw1, null, dls.k(hey0, 16.0f), v3, goz1, v1 & 14 | 440, 0);
            goz1.z();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new demf(hpw1, v);
        }
    }

    public static final void c(hpw hpw0, long v, long v1, goz goz0, int v2) {
        ibuq.f(hpw0, "painter");
        goz goz1 = goz0.ao(-595340837);
        int v3 = (v2 & 6) == 0 ? (((v2 & 8) == 0 ? goz1.X(hpw0) : goz1.Z(hpw0)) ? 4 : 2) | v2 : v2;
        if((v2 & 0x30) == 0) {
            v3 |= (goz1.W(v) ? 0x20 : 16);
        }
        if((v2 & 0x180) == 0) {
            v3 |= (goz1.W(v1) ? 0x100 : 0x80);
        }
        if((v3 & 0x93) == 0x92 && goz1.ac()) {
            goz1.G();
        }
        else {
            hfc hfc0 = cqx.c(hhi.a(hfc.e, eah.a), v1);
            ddxv.b(goz1);
            fiso.a(hpw0, null, dls.k(dla.d(hfc0, 8.0f), 24.0f), v, goz1, v3 & 14 | 56 | v3 << 6 & 0x1C00, 0);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new demh(hpw0, v, v1, v2);
        }
    }

    public static final void d(ibtw ibtw0, hfc hfc0, ibtw ibtw1, ibtw ibtw2, ibtw ibtw3, ibtw ibtw4, boolean z, ibtx ibtx0, goz goz0, int v, int v1) {
        int v5;
        ibtw ibtw14;
        ibtw ibtw11;
        ibtw ibtw10;
        ibtw ibtw9;
        goz goz2;
        boolean z1;
        ibtw ibtw8;
        ibtx ibtx1;
        ibtw ibtw7;
        ibtw ibtw6;
        ibtw ibtw5;
        hfc hfc1;
        int v2;
        ibuq.f(ibtw0, "primaryText");
        goz goz1 = goz0.ao(-1605050056);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (goz1.Z(ibtw0) ? 4 : 2) | v : v;
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
            ibtw5 = ibtw1;
        }
        else if((v & 0x180) == 0) {
            ibtw5 = ibtw1;
            v2 |= (goz1.Z(ibtw5) ? 0x100 : 0x80);
        }
        else {
            ibtw5 = ibtw1;
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
            ibtw6 = ibtw2;
        }
        else if((v & 0xC00) == 0) {
            ibtw6 = ibtw2;
            v2 |= (goz1.Z(ibtw6) ? 0x800 : 0x400);
        }
        else {
            ibtw6 = ibtw2;
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
            ibtw7 = ibtw3;
        }
        else if((v & 0x6000) == 0) {
            ibtw7 = ibtw3;
            v2 |= (goz1.Z(ibtw7) ? 0x4000 : 0x2000);
        }
        else {
            ibtw7 = ibtw3;
        }
        if((v1 & 0x20) != 0) {
            v2 |= 0x30000;
        }
        else if((v & 0x30000) == 0) {
            v2 |= (goz1.Z(ibtw4) ? 0x20000 : 0x10000);
        }
        if((v1 & 0x40) != 0) {
            v2 |= 0x180000;
        }
        else if((v & 0x180000) == 0) {
            v2 |= (goz1.Y(((int)z)) ? 0x100000 : 0x80000);
        }
        if((v1 & 0x80) == 0) {
            ibtx1 = ibtx0;
            if((v & 0xC00000) == 0) {
                v2 |= (goz1.Z(ibtx1) ? 0x800000 : 0x400000);
            }
        }
        else {
            v2 |= 0xC00000;
            ibtx1 = ibtx0;
        }
        if((0x492493 & v2) == 4793490 && goz1.ac()) {
            goz1.G();
            ibtw8 = ibtw4;
            z1 = (int)z;
            goz2 = goz1;
            ibtw9 = ibtw7;
            ibtw10 = ibtw5;
            ibtw11 = ibtw6;
        }
        else {
            if((v1 & 2) != 0) {
                hfc1 = hfc.e;
            }
            if((v1 & 4) != 0) {
                ibtw5 = null;
            }
            if((v1 & 8) != 0) {
                ibtw6 = null;
            }
            if((v1 & 16) != 0) {
                ibtw7 = null;
            }
            ibtw ibtw12 = (v1 & 0x20) == 0 ? ibtw4 : null;
            int v3 = ((v1 & 0x40) == 0 ? 1 : 0) ^ 1 | ((int)z);
            if((v1 & 0x80) != 0) {
                ibtx1 = null;
            }
            ddxv.b(goz1);
            hfc hfc2 = cqx.c(hhi.a(dla.i(hfc1, 16.0f, 0.0f, 2), fpu.c(goz1).e), fpu.a(goz1).D);
            ddxv.b(goz1);
            hfc hfc3 = dls.w(dla.i(hfc2, 0.0f, 16.0f, 1));
            iau iau0 = dii.a(dho.c, hei.m, goz1, 0);
            int v4 = demd.a(gol.c(goz1));
            gzk gzk0 = goz1.ak();
            hfc hfc4 = hew.c(goz1, hfc3);
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
            ibtw ibtw13 = iej.f;
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v4))) {
                Integer integer0 = v4;
                goz1.P(integer0);
                goz1.p(integer0, ibtw13);
            }
            guo.a(goz1, iej.g);
            guo.b(goz1, hfc4, iej.c);
            dim dim0 = dim.a;
            demm.e(ibtw0, ibtw5, ibtw6, ibtw7, goz1, v2 & 14 | v2 >> 3 & 0x70 | v2 >> 3 & 0x380 | v2 >> 3 & 0x1C00);
            goz1.M(0x7C905CC);
            if(ibtx1 == null) {
                ibtw14 = ibtw5;
                v5 = v3;
            }
            else {
                ibtw14 = ibtw5;
                v5 = v3;
                ccf.e(dim0, ((boolean)v5), null, cef.n(chm.b(0.8f, 380.0f, null, 4), null, 14).a(cef.o(chm.c(85, 0, cih.d, 2), 2)), cef.v(chm.b(0.8f, 380.0f, null, 4), null, 14).a(cef.p(chm.c(85, 0, cih.d, 2), 2)), null, gzf.e(0x297B74A3, new demj(ibtx1), goz1), goz1, v2 >> 15 & 0x70 | 0x180006, 18);
            }
            goz2 = goz1;
            goz2.x();
            goz2.M(130637435);
            if(ibtw12 != null) {
                ddxv.b(goz2);
                dlv.a(dls.e(hfc.e, 24.0f), goz2);
                ibtw12.a(goz2, Integer.valueOf(0));
            }
            goz2.x();
            goz2.z();
            ibtw8 = ibtw12;
            z1 = v5;
            ibtw9 = ibtw7;
            ibtw11 = ibtw6;
            ibtw10 = ibtw14;
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new demi(ibtw0, hfc1, ibtw10, ibtw11, ibtw9, ibtw8, z1, ibtx1, v, v1);
        }
    }

    public static final void e(ibtw ibtw0, ibtw ibtw1, ibtw ibtw2, ibtw ibtw3, goz goz0, int v) {
        goz goz1 = goz0.ao(0x26E0E1B6);
        int v1 = (v & 6) == 0 ? (goz1.Z(ibtw0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(ibtw1) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (goz1.Z(ibtw2) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v1 |= (goz1.Z(ibtw3) ? 0x800 : 0x400);
        }
        if((v1 & 0x493) == 1170 && goz1.ac()) {
            goz1.G();
        }
        else {
            ddxv.b(goz1);
            dhg dhg0 = dho.g(12.0f);
            hey hey0 = hfc.e;
            ddxv.b(goz1);
            hfc hfc0 = dla.i(hey0, 16.0f, 0.0f, 2);
            iau iau0 = dll.b(dhg0, hei.j, goz1, 0);
            int v2 = demd.a(gol.c(goz1));
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
            ibtw ibtw4 = iej.e;
            guo.b(goz1, iau0, ibtw4);
            ibtw ibtw5 = iej.d;
            guo.b(goz1, gzk0, ibtw5);
            ibtw ibtw6 = iej.f;
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v2))) {
                Integer integer0 = v2;
                goz1.P(integer0);
                goz1.p(integer0, ibtw6);
            }
            ibts ibts0 = iej.g;
            guo.a(goz1, ibts0);
            ibtw ibtw7 = iej.c;
            guo.b(goz1, hfc1, ibtw7);
            dlq dlq0 = dlq.a;
            goz1.M(2083015642);
            if(ibtw2 != null) {
                ibtw2.a(goz1, Integer.valueOf(v1 >> 6 & 14));
            }
            goz1.x();
            hfc hfc2 = dlo.a(dlq0, hey0, 1.0f);
            iau iau1 = dii.a(dho.c, hei.m, goz1, 0);
            gzk gzk1 = goz1.ak();
            hfc hfc3 = hew.c(goz1, hfc2);
            goz1.O();
            int v3 = demd.a(gol.c(goz1));
            if(goz1.x) {
                goz1.t(ibth0);
            }
            else {
                goz1.T();
            }
            guo.b(goz1, iau1, ibtw4);
            guo.b(goz1, gzk1, ibtw5);
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v3))) {
                Integer integer1 = v3;
                goz1.P(integer1);
                goz1.p(integer1, ibtw6);
            }
            guo.a(goz1, ibts0);
            guo.b(goz1, hfc3, ibtw7);
            gry[] arr_gry = new gry[2];
            jbn jbn0 = fpu.d(goz1).w;
            arr_gry[0] = gdh.a.c(jbn0);
            hll hll0 = new hll(fpu.a(goz1).q);
            arr_gry[1] = fft.a.c(hll0);
            gpo.b(arr_gry, gzf.e(0x2C273F5C, new demk(ibtw0), goz1), goz1, 56);
            gry[] arr_gry1 = new gry[2];
            jbn jbn1 = fpu.d(goz1).k;
            arr_gry1[0] = gdh.a.c(jbn1);
            hll hll1 = new hll(fpu.a(goz1).s);
            arr_gry1[1] = fft.a.c(hll1);
            gpo.b(arr_gry1, gzf.e(0x708CD305, new deml(ibtw1), goz1), goz1, 56);
            goz1.z();
            goz1.M(2083032154);
            if(ibtw3 != null) {
                ibtw3.a(goz1, Integer.valueOf(v1 >> 9 & 14));
            }
            goz1.x();
            goz1.z();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new demg(ibtw0, ibtw1, ibtw2, ibtw3, v);
        }
    }
}

