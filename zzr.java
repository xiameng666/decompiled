public final class zzr {
    public static final void a(String s, float f, zhx zhx0, zhx zhx1, hfc hfc0, long v, goz goz0, int v1, int v2) {
        long v7;
        hfc hfc3;
        long v6;
        hfc hfc2;
        long v5;
        hfc hfc1;
        int v3;
        ibuq.f(s, "label");
        goz goz1 = goz0.ao(2007671267);
        if((v2 & 1) == 0) {
            v3 = (v1 & 6) == 0 ? (goz1.X(s) ? 4 : 2) | v1 : v1;
        }
        else {
            v3 = v1 | 6;
        }
        if((v2 & 2) != 0) {
            v3 |= 0x30;
        }
        else if((v1 & 0x30) == 0) {
            v3 |= (goz1.U(f) ? 0x20 : 16);
        }
        if((v2 & 4) != 0) {
            v3 |= 0x180;
        }
        else if((v1 & 0x180) == 0) {
            v3 |= (((v1 & 0x200) == 0 ? goz1.X(zhx0) : goz1.Z(zhx0)) ? 0x100 : 0x80);
        }
        if((v2 & 8) != 0) {
            v3 |= 0xC00;
        }
        else if((v1 & 0xC00) == 0) {
            v3 |= (((v1 & 0x1000) == 0 ? goz1.X(zhx1) : goz1.Z(zhx1)) ? 0x800 : 0x400);
        }
        if((v2 & 16) != 0) {
            v3 |= 0x6000;
            hfc1 = hfc0;
        }
        else if((v1 & 0x6000) == 0) {
            hfc1 = hfc0;
            v3 |= (goz1.X(hfc1) ? 0x4000 : 0x2000);
        }
        else {
            hfc1 = hfc0;
        }
        int v4 = 0x10000;
        if((0x30000 & v1) == 0) {
            if((v2 & 0x20) == 0) {
                v5 = v;
                if(goz1.W(v5)) {
                    v4 = 0x20000;
                }
            }
            else {
                v5 = v;
            }
            v3 |= v4;
        }
        else {
            v5 = v;
        }
        if((74899 & v3) == 74898 && goz1.ac()) {
            goz1.G();
            hfc2 = hfc1;
            v6 = v5;
        }
        else {
            goz1.I();
            if((v1 & 1) != 0 && !goz1.aa()) {
                goz1.G();
                if((v2 & 0x20) != 0) {
                    v3 &= 0xFFF8FFFF;
                }
                hfc3 = hfc1;
                v7 = v5;
            }
            else {
                hfc hfc4 = (v2 & 16) == 0 ? hfc1 : hfc.e;
                if((v2 & 0x20) == 0) {
                    hfc3 = hfc4;
                    v7 = v5;
                }
                else {
                    v3 &= 0xFFF8FFFF;
                    hfc3 = hfc4;
                    v7 = fpu.a(goz1).s;
                }
            }
            goz1.w();
            long v8 = zzr.b(zhx0, fitf.a(goz1));
            long v9 = zzr.b(zhx1, fitf.b(goz1));
            hfc hfc5 = dla.j(hfc3, 0.0f, 4.0f, 0.0f, 0.0f, 13);
            iau iau0 = dii.a(dho.g(8.0f), hei.m, goz1, 6);
            long v10 = gol.c(goz1);
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
            int v11 = (int)(v10 ^ v10 >>> 0x20);
            guo.b(goz1, iau0, iej.e);
            guo.b(goz1, gzk0, iej.d);
            ibtw ibtw0 = iej.f;
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v11))) {
                Integer integer0 = v11;
                goz1.P(integer0);
                goz1.p(integer0, ibtw0);
            }
            guo.a(goz1, iej.g);
            guo.b(goz1, hfc6, iej.c);
            hfc hfc7 = dls.w(dls.e(dla.i(hfc.e, 0.0f, 2.0f, 1), 8.0f));
            goz1.M(5004770);
            Object object0 = goz1.j();
            if((v3 & 0x70) == 0x20 || object0 == gop.a) {
                object0 = new zzp(f);
                goz1.P(object0);
            }
            goz1.x();
            fitn.b(((ibth)object0), hfc7, v8, v9, 0, 4.0f, null, goz1, 0x30030, 80);
            jbn jbn0 = fpu.d(goz1).k;
            gdh.b(s, null, v7, 0L, jeu.a, 0L, null, null, 0L, 0, false, 0, 0, null, jbn0, goz1, v3 & 14 | 0x180000 | v3 >> 9 & 0x380, 0, 0x1FFBA);
            goz1 = goz1;
            goz1.z();
            v6 = v7;
            hfc2 = hfc3;
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new zzq(s, f, zhx0, zhx1, hfc2, v6, v1, v2);
        }
    }

    private static final long b(zhx zhx0, long v) {
        if(zhx0 != null) {
            return cchl.d() ? hln.i(zhx0.b.b, zhx0.b.c, zhx0.b.d, zhx0.b.a, null, 16) : hln.i(zhx0.a.b, zhx0.a.c, zhx0.a.d, zhx0.a.a, null, 16);
        }
        return v;
    }
}

