public final class bdor {
    public static final void a(hfc hfc0, String s, String s1, goz goz0, int v, int v1) {
        hfc hfc2;
        goz goz2;
        hfc hfc1;
        int v2;
        ibuq.f(s1, "userEmail");
        goz goz1 = goz0.ao(103951702);
        if(v1 != 0) {
            v2 = v | 6;
            hfc1 = hfc0;
        }
        else if((v & 6) == 0) {
            hfc1 = hfc0;
            v2 = (goz1.X(hfc1) ? 4 : 2) | v;
        }
        else {
            hfc1 = hfc0;
            v2 = v;
        }
        if((v & 0x30) == 0) {
            v2 |= (goz1.X(s) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v2 |= (goz1.X(s1) ? 0x100 : 0x80);
        }
        if((v2 & 0x93) == 0x92 && goz1.ac()) {
            goz1.G();
            goz2 = goz1;
            hfc2 = hfc1;
        }
        else {
            hfc hfc3 = v1 == 0 ? hfc1 : hfc.e;
            hfc hfc4 = dla.e(hfc3, 8.0f, 4.0f);
            iau iau0 = dll.b(dho.a, hei.k, goz1, 0x30);
            long v3 = gol.c(goz1);
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
            int v4 = (int)(v3 ^ v3 >>> 0x20);
            guo.b(goz1, iau0, iej.e);
            guo.b(goz1, gzk0, iej.d);
            ibtw ibtw0 = iej.f;
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v4))) {
                Integer integer0 = v4;
                goz1.P(integer0);
                goz1.p(integer0, ibtw0);
            }
            guo.a(goz1, iej.g);
            guo.b(goz1, hfc5, iej.c);
            bdor.b(s, goz1, v2 >> 3 & 14);
            dlv.a(dls.o(hfc.e, 8.0f), goz1);
            goz2 = goz1;
            hfc2 = hfc3;
            fiuk.b(s1, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, fpu.d(goz1).k, goz2, v2 >> 6 & 14, 0, 0x1FFFE);
            goz2.z();
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new bdoo(hfc2, s, s1, v, v1);
        }
    }

    public static final void b(String s, goz goz0, int v) {
        goz goz1 = goz0.ao(0x111719B6);
        if((((v & 6) == 0 ? (goz1.X(s) ? 4 : 2) | v : v) & 3) == 2 && goz1.ac()) {
            goz1.G();
        }
        else {
            gaq.c(hhi.a(dls.k(hfc.e, 20.0f), eah.a), null, 0L, 0L, 0.0f, 0.0f, null, gzf.e(0x3F226711, new bdoq(s), goz1), goz1, 0x7E);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new bdop(s, v);
        }
    }

    public static final void c(hfc hfc0, String s, String s1, goz goz0, int v) {
        String s3;
        String s2;
        ibuq.f(s1, "userEmail");
        goz goz1 = goz0.ao(0xE43803FD);
        int v1 = (v & 0x30) == 0 ? v | 6 | (goz1.X(s) ? 0x20 : 16) : v | 6;
        if((v & 0x180) == 0) {
            v1 |= (goz1.X(s1) ? 0x100 : 0x80);
        }
        if((v1 & 0x93) == 0x92 && goz1.ac()) {
            goz1.G();
            s2 = s;
            s3 = s1;
        }
        else {
            hfc0 = hfc.e;
            s2 = s;
            s3 = s1;
            bdor.a(crd.c(hfc0, 1.0f, fpu.a(goz1).B, eah.a(50)), s2, s3, goz1, v1 & 0x3F0, 0);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new bdon(hfc0, s2, s3, v);
        }
    }
}

