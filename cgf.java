public final class cgf {
    public static final ckh a;
    public static final cga b;

    static {
        cgf.a = chm.b(0.0f, 400.0f, cno.a, 1);
        cgf.b = new cga();
        new bzk(null);
    }

    public static final void a(hfc hfc0, ibtx ibtx0, goz goz0, int v, int v1) {
        int v2;
        goz goz1 = goz0.ao(0x2686F612);
        if(v1 == 0) {
            v2 = (v & 6) == 0 ? (goz1.X(hfc0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v & 0x30) == 0) {
            v2 |= (goz1.Z(ibtx0) ? 0x20 : 16);
        }
        if(goz1.ad((v2 & 19) != 18, 1 & v2)) {
            if(v1 != 0) {
                hfc0 = hfc.e;
            }
            cgf.b(gzf.e(1948801580, new cgb(hfc0, ibtx0), goz1), goz1, 6);
        }
        else {
            goz1.G();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new cgc(hfc0, ibtx0, v, v1);
        }
    }

    public static final void b(ibty ibty0, goz goz0, int v) {
        goz goz1 = goz0.ao(1908320054);
        int v1 = (v & 6) == 0 ? (goz1.Z(ibty0) ? 4 : 2) | v : v;
        if(goz1.ad((v1 & 3) != 2, v1 & 1)) {
            iar.a(gzf.e(0x7AF4A235, new cgd(ibty0), goz1), goz1, 6);
        }
        else {
            goz1.G();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new cge(ibty0, v);
        }
    }
}

