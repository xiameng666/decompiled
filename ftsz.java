public final class ftsz {
    public static final void a(ftvr ftvr0, fyx fyx0, goz goz0, int v) {
        goz goz1 = goz0.ao(1940423266);
        int v1 = (v & 6) == 0 ? (((v & 8) == 0 ? goz1.X(ftvr0) : goz1.Z(ftvr0)) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.X(fyx0) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
        }
        else {
            ftvo.a(null, ftvr0, fyx0, goz1, v1 << 3 & 0x380 | (v1 << 3 & 0x70 | 0x40));
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new ftsy(ftvr0, fyx0, v);
        }
    }
}

