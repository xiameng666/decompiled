public final class icl {
    public static final ich a;
    public static final Object b;

    static {
        icl.a = new ich();
        icl.b = new Object();
    }

    public static final void a(hfc hfc0, ibtw ibtw0, goz goz0, int v, int v1) {
        int v2;
        goz goz1 = goz0.ao(0xB29CB430);
        boolean z = true;
        if(v1 == 0) {
            v2 = (v & 6) == 0 ? (goz1.X(hfc0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v & 0x30) == 0) {
            v2 |= (goz1.Z(ibtw0) ? 0x20 : 16);
        }
        if((v2 & 19) == 18) {
            z = false;
        }
        if(goz1.ad(z, v2 & 1)) {
            if(v1 != 0) {
                hfc0 = hfc.e;
            }
            Object object0 = goz1.j();
            if(object0 == gop.a) {
                object0 = new icq(ibe.a);
                goz1.P(object0);
            }
            icl.b(((icq)object0), hfc0, ibtw0, goz1, v2 << 3 & 0x3F0);
        }
        else {
            goz1.G();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new ici(hfc0, ibtw0, v, v1);
        }
    }

    public static final void b(icq icq0, hfc hfc0, ibtw ibtw0, goz goz0, int v) {
        goz goz1 = goz0.ao(0xE17BA7B9);
        int v1 = (v & 6) == 0 ? (goz1.Z(icq0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.X(hfc0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (goz1.Z(ibtw0) ? 0x100 : 0x80);
        }
        if(goz1.ad((v1 & 0x93) != 0x92, v1 & 1)) {
            long v2 = gol.c(goz1);
            gpg gpg0 = gol.e(goz1);
            hfc hfc1 = hew.c(goz1, hfc0);
            gzk gzk0 = goz1.ak();
            ibth ibth0 = ify.a;
            goz1.O();
            if(goz1.x) {
                goz1.t(ibth0);
            }
            else {
                goz1.T();
            }
            int v3 = (int)(v2 ^ v2 >>> 0x20);
            guo.b(goz1, icq0, icq0.c);
            guo.b(goz1, gpg0, icq0.d);
            guo.b(goz1, ibtw0, icq0.e);
            guo.b(goz1, gzk0, iej.d);
            guo.a(goz1, iej.g);
            guo.b(goz1, hfc1, iej.c);
            ibtw ibtw1 = iej.f;
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v3))) {
                Integer integer0 = v3;
                goz1.P(integer0);
                goz1.p(integer0, ibtw1);
            }
            goz1.z();
            if(goz1.ac()) {
                goz1.M(0xB48709A9);
            }
            else {
                goz1.M(0xB4F1D36C);
                boolean z = goz1.Z(icq0);
                Object object0 = goz1.j();
                if(z || object0 == gop.a) {
                    object0 = new icj(icq0);
                    goz1.P(object0);
                }
                gqe.h(((ibth)object0), goz1);
            }
            goz1.x();
        }
        else {
            goz1.G();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new ick(icq0, hfc0, ibtw0, v);
        }
    }
}

