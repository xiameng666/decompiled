public final class ftxq {
    public static final void a(hfc hfc0, fryk fryk0, fryv fryv0, fryv fryv1, fryv fryv2, ibth ibth0, goz goz0, int v) {
        ibth ibth1;
        fryv fryv4;
        fryv fryv3;
        ibuq.f(fryk0, "bannerImage");
        ibuq.f(fryv0, "title");
        goz goz1 = goz0.ao(0x49EAFB86);
        int v1 = (v & 6) == 0 ? (goz1.X(hfc0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (((v & 0x40) == 0 ? goz1.X(fryk0) : goz1.Z(fryk0)) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (goz1.Z(null) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v1 |= (goz1.Z(fryv0) ? 0x800 : 0x400);
        }
        if((v & 0x6000) == 0) {
            fryv3 = fryv1;
            v1 |= (goz1.Z(fryv3) ? 0x4000 : 0x2000);
        }
        else {
            fryv3 = fryv1;
        }
        if((0x30000 & v) == 0) {
            fryv4 = fryv2;
            v1 |= (goz1.Z(fryv4) ? 0x20000 : 0x10000);
        }
        else {
            fryv4 = fryv2;
        }
        if((0x180000 & v) == 0) {
            v1 |= (goz1.V(0) ? 0x100000 : 0x80000);
        }
        if((0xC00000 & v) == 0) {
            ibth1 = ibth0;
            v1 |= (goz1.Z(ibth1) ? 0x800000 : 0x400000);
        }
        else {
            ibth1 = ibth0;
        }
        if((0x492493 & v1) == 4793490 && goz1.ac()) {
            goz1.G();
        }
        else {
            goz1.I();
            if((v & 1) != 0 && !goz1.aa()) {
                goz1.G();
            }
            goz1.w();
            fugo.b(0, null, null, gzf.e(0x8C066314, new ftxp(hfc0, ibth1, fryk0, fryv0, fryv3, fryv4), goz1), goz1, v1 >> 18 & 14 | 0xC00, 6);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new ftxl(hfc0, fryk0, fryv0, fryv1, fryv2, ibth0, v);
        }
    }

    public static final void b(hfc hfc0, ftxr ftxr0, goz goz0, int v) {
        hfc hfc1;
        goz goz1 = goz0.ao(0x370DE786);
        int v1 = (v & 6) == 0 ? (goz1.X(hfc0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(ftxr0) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
            hfc1 = hfc0;
        }
        else {
            hfc1 = hfc0;
            ftxq.a(hfc1, ftxr0.a, ftxr0.b, ftxr0.c, ftxr0.d, ftxr0.e, goz1, v1 & 14);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new ftxk(hfc1, ftxr0, v);
        }
    }
}

