public final class ftzt {
    public static final void a(hfc hfc0, ftzv ftzv0, goz goz0, int v, int v1) {
        int v2;
        ibuq.f(ftzv0, "state");
        goz goz1 = goz0.ao(0x6A081F3C);
        if(v1 == 0) {
            v2 = (v & 6) == 0 ? (goz1.X(hfc0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v & 0x30) == 0) {
            v2 |= (goz1.Z(ftzv0) ? 0x20 : 16);
        }
        if((v2 & 19) == 18 && goz1.ac()) {
            goz1.G();
        }
        else {
            if(v1 != 0) {
                hfc0 = hfc.e;
            }
            gze gze0 = gzf.e(0xFF20F6FF, new ftzs(ftzv0, hfc0), goz1);
            fugo.b(ftzv0.k, null, null, gze0, goz1, 0xC00, 6);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new ftzn(hfc0, ftzv0, v, v1);
        }
    }
}

