public final class ddif {
    public static final void a(ibth ibth0, long v, float f, long v1, float f1, goz goz0, int v2, int v3) {
        long v8;
        long v7;
        long v5;
        int v4;
        ibuq.f(ibth0, "progress");
        goz goz1 = goz0.ao(0xF9F5E618);
        if((v3 & 1) == 0) {
            v4 = (v2 & 6) == 0 ? (goz1.Z(ibth0) ? 4 : 2) | v2 : v2;
        }
        else {
            v4 = v2 | 6;
        }
        if((v3 & 2) != 0) {
            v4 |= 0x30;
            v5 = v;
        }
        else if((v2 & 0x30) == 0) {
            v5 = v;
            v4 |= (goz1.W(v5) ? 0x20 : 16);
        }
        else {
            v5 = v;
        }
        if((v3 & 4) != 0) {
            v4 |= 0x180;
        }
        else if((v2 & 0x180) == 0) {
            v4 |= (goz1.U(f) ? 0x100 : 0x80);
        }
        int v6 = 0x400;
        if((v2 & 0xC00) == 0) {
            if((v3 & 8) == 0) {
                v7 = v1;
                if(goz1.W(v7)) {
                    v6 = 0x800;
                }
            }
            else {
                v7 = v1;
            }
            v4 |= v6;
        }
        else {
            v7 = v1;
        }
        if((v2 & 0x6000) == 0) {
            v4 |= (goz1.U(f1) ? 0x4000 : 0x2000);
        }
        if((v4 & 9363) == 9362 && goz1.ac()) {
            goz1.G();
            v8 = v7;
        }
        else {
            goz1.I();
            if((v2 & 1) != 0 && !goz1.aa()) {
                goz1.G();
                if((v3 & 8) != 0) {
                    v4 &= 0xFFFFE3FF;
                }
                v8 = v7;
            }
            else if((v3 & 8) == 0) {
                v8 = v7;
            }
            else {
                v4 &= 0xFFFFE3FF;
                goz1.M(0xCE4666ED);
                v8 = firh.g(fivt.b, goz1);
                goz1.x();
            }
            goz1.w();
            fitn.d(ibth0, dls.k(hfc.e, f1), v5, f, v8, (4.0f - (-1.0f + f1 / 40.0f) * f) / (f1 / 40.0f), goz1, v4 & 14 | v4 << 3 & 0x380 | v4 << 3 & 0x1C00 | v4 << 3 & 0xE000);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new ddie(ibth0, v, f, v8, f1, v2, v3);
        }
    }
}

