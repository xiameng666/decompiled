public final class ftvo {
    public static final void a(hfc hfc0, ftvr ftvr0, fyx fyx0, goz goz0, int v) {
        hfc hfc2;
        goz goz2;
        hfc hfc1;
        ibuq.f(ftvr0, "state");
        goz goz1 = goz0.ao(1072032622);
        int v1 = (v & 0x30) == 0 ? v | 6 | (goz1.Z(ftvr0) ? 0x20 : 16) : v | 6;
        if((v & 0x180) == 0) {
            v1 |= (goz1.X(fyx0) ? 0x100 : 0x80);
        }
        if((v1 & 0x93) == 0x92 && goz1.ac()) {
            goz1.G();
            hfc1 = hfc0;
            goz2 = goz1;
        }
        else {
            goz1.I();
            if((v & 1) != 0 && !goz1.aa()) {
                goz1.G();
                hfc2 = hfc0;
            }
            else {
                hfc2 = hfc.e;
            }
            goz1.w();
            hfc hfc3 = iqn.a(hfc2, "WalletBulletin");
            long v2 = fpu.a(goz1).p;
            gze gze0 = gzf.e(0x205324DC, new ftvn(ftvr0), goz1);
            goz2 = goz1;
            fsr.c(ftvr0.d, hfc3, fyx0, 0.0f, false, null, v2, 0L, 0.0f, 0L, null, null, null, gze0, goz2, v1 & 0x380, 0xC00, 8120);
            hfc1 = hfc2;
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new ftvl(hfc1, ftvr0, fyx0, v);
        }
    }
}

