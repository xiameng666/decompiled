public final class ddyb {
    public static final void a(boolean z, hfc hfc0, goz goz0, int v, int v1) {
        hfc hfc1;
        int v2;
        goz goz1 = goz0.ao(0x328A16BF);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (goz1.Y(z) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v2 |= (goz1.X(hfc0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v2 |= (goz1.Z(null) ? 0x100 : 0x80);
        }
        if((v2 & 0x93) == 0x92 && goz1.ac()) {
            goz1.G();
            hfc1 = hfc0;
        }
        else {
            hfc1 = (v1 & 2) == 0 ? hfc0 : hfc.e;
            fiua.a(z, null, hfc1, gzf.e(0x9491303, new ddya(z), goz1), false, null, null, goz1, v2 & 14 | 0xC00 | v2 >> 3 & 0x70 | v2 << 3 & 0x380, 0x70);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new ddxz(z, hfc1, v, v1);
        }
    }
}

