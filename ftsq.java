public final class ftsq {
    public static final void a(ftsr ftsr0, goz goz0, int v) {
        goz goz1 = goz0.ao(0x95A7A0B1);
        int v1 = 1;
        int v2 = (v & 6) == 0 ? (goz1.V(ftsr0.ordinal()) ? 4 : 2) | v : v;
        if((v2 & 3) == 2 && goz1.ac()) {
            goz1.G();
        }
        else {
            int v3 = csd.a(goz1) ^ 1;
            int v4 = hln.b(fpu.a(goz1).q);
            goz1.M(0x97EA02AA);
            if((v2 & 14) != 4) {
                v1 = 0;
            }
            int v5 = goz1.V(v4) | v1 | goz1.Y(((boolean)v3));
            Object object0 = goz1.j();
            if(v5 != 0 || object0 == gop.a) {
                object0 = new ftsn(ftsr0, v4, ((boolean)v3));
                goz1.P(object0);
            }
            goz1.x();
            jnl.b(((ibts)object0), iqn.a(hfc.e, "GoogleWalletProductName"), null, goz1, 0x30, 4);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new ftso(ftsr0, v);
        }
    }

    public static final void b(hfc hfc0, String s, ftsr ftsr0, goz goz0, int v, int v1) {
        int v2;
        ibuq.f(hfc0, "modifier");
        goz goz1 = goz0.ao(0xD4C6DED);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (goz1.X(hfc0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v2 |= (goz1.X(s) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v2 |= (goz1.V((ftsr0 == null ? -1 : ftsr0.ordinal())) ? 0x100 : 0x80);
        }
        if((v2 & 0x93) == 0x92 && goz1.ac()) {
            goz1.G();
        }
        else {
            if((v1 & 2) != 0) {
                s = null;
            }
            switch(ftsr0.ordinal()) {
                case 0: {
                    goz1.M(0xEBE8DFB2);
                    ftsq.d(hfc0, s, ftsr0, goz1, v2 & 0x3FE);
                    goz1.x();
                    break;
                }
                case 1: {
                    goz1.M(-337066638);
                    ftsq.d(hfc0, s, ftsr0, goz1, v2 & 0x3FE);
                    goz1.x();
                    break;
                }
                case 2: {
                    goz1.M(-337063057);
                    ftsq.c(hfc0, s, ftsr0, goz1, v2 & 0x3FE);
                    goz1.x();
                    break;
                }
                default: {
                    goz1.M(0xEBE8BD90);
                    goz1.x();
                    throw new ibnq();
                }
            }
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new ftsp(hfc0, s, ftsr0, v, v1);
        }
    }

    public static final void c(hfc hfc0, String s, ftsr ftsr0, goz goz0, int v) {
        ibuq.f(hfc0, "modifier");
        goz goz1 = goz0.ao(0xD193C407);
        int v1 = (v & 6) == 0 ? (goz1.X(hfc0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.X(s) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
        }
        else {
            hfc hfc1 = iqn.a(dls.e(hfc0, 40.0f), "GooglePayLogoImage");
            cth.a(ism.a(0x7F081064, goz1, 0), s, hfc1, null, null, 0.0f, null, goz1, v1 & 0x70 | 8, 120);  // drawable:wallet_icon_gpay_logo
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new ftsm(hfc0, s, ftsr0, v);
        }
    }

    public static final void d(hfc hfc0, String s, ftsr ftsr0, goz goz0, int v) {
        ibuq.f(hfc0, "modifier");
        goz goz1 = goz0.ao(0xF4BF6EC6);
        int v1 = (v & 6) == 0 ? (goz1.X(hfc0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.X(s) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (goz1.V((ftsr0 == null ? -1 : ftsr0.ordinal())) ? 0x100 : 0x80);
        }
        if((v1 & 0x93) == 0x92 && goz1.ac()) {
            goz1.G();
        }
        else {
            iau iau0 = dll.b(dho.g(8.0f), hei.k, goz1, 54);
            long v2 = gol.c(goz1);
            gzk gzk0 = goz1.ak();
            hfc hfc1 = hew.c(goz1, hfc.e);
            ibth ibth0 = iej.a;
            goz1.O();
            if(goz1.x) {
                goz1.t(ibth0);
            }
            else {
                goz1.T();
            }
            int v3 = (int)(v2 >>> 0x20 ^ v2);
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
            hfc hfc2 = iqn.a(dls.k(hfc0, 30.0f), "GoogleWalletLogoImage");
            cth.a(ism.a(0x7F080A81, goz1, 0), s, hfc2, null, null, 0.0f, null, goz1, v1 & 0x70 | 8, 120);
            goz1.M(1990791756);
            if(ftsr0 != ftsr.a) {
                ftsq.a(ftsr0, goz1, v1 >> 6 & 14);
            }
            goz1.x();
            goz1.z();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new ftsl(hfc0, s, ftsr0, v);
        }
    }
}

