public final class zzm {
    public static final void a(ibtw ibtw0, hfc hfc0, long v, goz goz0, int v1, int v2) {
        int v3;
        ibuq.f(ibtw0, "content");
        goz goz1 = goz0.ao(0xF95527DF);
        if((v2 & 1) == 0) {
            v3 = (v1 & 6) == 0 ? (goz1.Z(ibtw0) ? 4 : 2) | v1 : v1;
        }
        else {
            v3 = v1 | 6;
        }
        if((v2 & 2) != 0) {
            v3 |= 0x30;
        }
        else if((v1 & 0x30) == 0) {
            v3 |= (goz1.X(hfc0) ? 0x20 : 16);
        }
        int v4 = 0x80;
        if((v1 & 0x180) == 0) {
            if((v2 & 4) == 0 && goz1.W(v)) {
                v4 = 0x100;
            }
            v3 |= v4;
        }
        if((v3 & 0x93) == 0x92 && goz1.ac()) {
            goz1.G();
        }
        else {
            goz1.I();
            if((v1 & 1) != 0 && !goz1.aa()) {
                goz1.G();
                if((v2 & 4) != 0) {
                    v3 &= -897;
                }
            }
            else {
                if((v2 & 2) != 0) {
                    hfc0 = hfc.e;
                }
                if((v2 & 4) != 0) {
                    v3 &= -897;
                    v = fpu.a(goz1).G;
                }
            }
            goz1.w();
            hfc hfc1 = dla.e(cqx.c(hhi.a(dls.x(hfc0, 36.0f, 0.0f, 2), eah.b(12.0f)), v), 2.0f, 8.0f);
            iau iau0 = dll.b(dho.a, hei.k, goz1, 0x30);
            long v5 = gol.c(goz1);
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
            int v6 = (int)(v5 >>> 0x20 ^ v5);
            guo.b(goz1, iau0, iej.e);
            guo.b(goz1, gzk0, iej.d);
            ibtw ibtw1 = iej.f;
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v6))) {
                Integer integer0 = v6;
                goz1.P(integer0);
                goz1.p(integer0, ibtw1);
            }
            guo.a(goz1, iej.g);
            guo.b(goz1, hfc2, iej.c);
            ibtw0.a(goz1, Integer.valueOf(v3 & 14));
            goz1.z();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new zzk(ibtw0, hfc0, v, v1, v2);
        }
    }

    public static final void b(hfc hfc0, String s, zhr zhr0, long v, long v1, goz goz0, int v2, int v3) {
        hfc hfc3;
        zhr zhr3;
        zhr zhr2;
        String s2;
        hfc hfc2;
        long v5;
        String s1;
        hfc hfc1;
        int v4;
        zhr zhr1 = zhr0;
        goz goz1 = goz0.ao(0x88D6C10F);
        if((v3 & 1) != 0) {
            v4 = v2 | 6;
            hfc1 = hfc0;
        }
        else if((v2 & 6) == 0) {
            hfc1 = hfc0;
            v4 = (goz1.X(hfc1) ? 4 : 2) | v2;
        }
        else {
            hfc1 = hfc0;
            v4 = v2;
        }
        if((v3 & 2) != 0) {
            v4 |= 0x30;
            s1 = s;
        }
        else if((v2 & 0x30) == 0) {
            s1 = s;
            v4 |= (goz1.X(s1) ? 0x20 : 16);
        }
        else {
            s1 = s;
        }
        if((v3 & 4) != 0) {
            v4 |= 0x180;
        }
        else if((v2 & 0x180) == 0) {
            v4 |= (((v2 & 0x200) == 0 ? goz1.X(zhr1) : goz1.Z(zhr1)) ? 0x100 : 0x80);
        }
        if((v2 & 0xC00) == 0) {
            v5 = v;
            v4 |= (goz1.W(v5) ? 0x800 : 0x400);
        }
        else {
            v5 = v;
        }
        if((v2 & 0x6000) == 0) {
            v4 |= (goz1.W(v1) ? 0x4000 : 0x2000);
        }
        if((v4 & 9363) == 9362 && goz1.ac()) {
            goz1.G();
            hfc2 = hfc1;
            s2 = s1;
            zhr2 = zhr1;
        }
        else {
            goz1.I();
            if((v2 & 1) != 0 && !goz1.aa()) {
                goz1.G();
                zhr3 = zhr1;
                hfc3 = hfc1;
            }
            else {
                hfc hfc4 = (v3 & 1) == 0 ? hfc1 : hfc.e;
                if((v3 & 2) != 0) {
                    s1 = "";
                }
                if((v3 & 4) != 0) {
                    zhr1 = null;
                }
                hfc3 = hfc4;
                zhr3 = zhr1;
            }
            goz1.w();
            zzm.a(gzf.e(908733329, new zzl(s1, v1, zhr3), goz1), hfc3, v5, goz1, v4 << 3 & 0x70 | 6 | v4 >> 3 & 0x380, 0);
            s2 = s1;
            zhr2 = zhr3;
            hfc2 = hfc3;
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new zzj(hfc2, s2, zhr2, v, v1, v2, v3);
        }
    }
}

