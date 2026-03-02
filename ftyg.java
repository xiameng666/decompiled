public final class ftyg {
    public static final void a(hfc hfc0, long v, goz goz0, int v1) {
        goz goz1 = goz0.ao(0x101D09BF);
        int v2 = (v1 & 6) == 0 ? (goz1.X(hfc0) ? 4 : 2) | v1 : v1;
        if((v1 & 0x30) == 0) {
            v2 |= (goz1.W(v) ? 0x20 : 16);
        }
        if((v1 & 0x180) == 0) {
            v2 |= 0x80;
        }
        if((v2 & 0x93) == 0x92 && goz1.ac()) {
            goz1.G();
        }
        else {
            goz1.I();
            if((v1 & 1) != 0 && !goz1.aa()) {
                goz1.G();
            }
            goz1.w();
            if(!ibzw.v(v)) {
                throw new IllegalStateException("PassListItemLoader does not support non-positive durations");
            }
            ciy ciy0 = cjc.b(goz1);
            int v3 = (int)ibzw.h(0L);
            gui gui0 = cjc.c(ciy0, 1.0f, 0.3f, new cir(chm.c(((int)ibzw.h(v)), 0, cih.d, 2), 2, ((long)(-v3))), goz1, 0x71B8);
            ftxu.a(dls.e(dls.w(hfc0), 96.0f), null, null, gzf.e(-995671059, new ftyf(gui0), goz1), goz1, 0xC00, 6);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new ftye(hfc0, v, v1);
        }
    }
}

