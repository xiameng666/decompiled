public final class ddjc {
    public static final void a(String s, String s1, String s2, String s3, ibth ibth0, ibth ibth1, ibth ibth2, hpw hpw0, goz goz0, int v, int v1) {
        goz goz2;
        hpw hpw2;
        int v2;
        hpw hpw1 = hpw0;
        ibuq.f(s, "title");
        ibuq.f(s1, "subtitle");
        ibuq.f(s2, "confirmText");
        ibuq.f(s3, "declineText");
        ibuq.f(ibth0, "onConfirm");
        ibuq.f(ibth1, "onDecline");
        ibuq.f(ibth2, "onDismissRequest");
        goz goz1 = goz0.ao(0x67633A19);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (goz1.X(s) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v2 |= (goz1.X(s1) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x180) == 0) {
            v2 |= (goz1.X(s2) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0xC00) == 0) {
            v2 |= (goz1.X(s3) ? 0x800 : 0x400);
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
        }
        else if((v & 0x6000) == 0) {
            v2 |= (goz1.Z(ibth0) ? 0x4000 : 0x2000);
        }
        if((v1 & 0x20) != 0) {
            v2 |= 0x30000;
        }
        else if((v & 0x30000) == 0) {
            v2 |= (goz1.Z(ibth1) ? 0x20000 : 0x10000);
        }
        if((v1 & 0x40) != 0) {
            v2 |= 0x180000;
        }
        else if((v & 0x180000) == 0) {
            v2 |= (goz1.Z(ibth2) ? 0x100000 : 0x80000);
        }
        if((v1 & 0x80) != 0) {
            v2 |= 0xC00000;
        }
        else if((0xC00000 & v) == 0) {
            v2 |= (((0x1000000 & v) == 0 ? goz1.X(hpw1) : goz1.Z(hpw1)) ? 0x800000 : 0x400000);
        }
        if((0x492493 & v2) == 4793490 && goz1.ac()) {
            goz1.G();
            hpw2 = hpw1;
            goz2 = goz1;
        }
        else {
            if((v1 & 0x80) != 0) {
                hpw1 = null;
            }
            eaa eaa0 = fpu.c(goz1).e;
            goz2 = goz1;
            fiqf.a(ibth2, cqx.c(hhi.a(hfc.e, eaa0), fpu.a(goz1).I), null, gzf.e(0xD42E1763, new ddjb(hpw1, s, s1, ibth0, ibth1, s2, s3), goz1), goz2, v2 >> 18 & 14 | 0xC00, 4);
            hpw2 = hpw1;
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new ddiy(s, s1, s2, s3, ibth0, ibth1, ibth2, hpw2, v, v1);
        }
    }
}

