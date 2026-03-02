public final class ftxu {
    public static final void a(hfc hfc0, fcp fcp0, crk crk0, ibtx ibtx0, goz goz0, int v, int v1) {
        hfc hfc4;
        fcp fcp2;
        crk crk2;
        hfc hfc2;
        crk crk1;
        fcp fcp1;
        hfc hfc1;
        int v2;
        ibuq.f(ibtx0, "content");
        goz goz1 = goz0.ao(0x83A036BB);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (goz1.X(hfc0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        int v3 = 16;
        if((v & 0x30) == 0) {
            if((v1 & 2) == 0 && goz1.X(fcp0)) {
                v3 = 0x20;
            }
            v2 |= v3;
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x180) == 0) {
            v2 |= (goz1.X(crk0) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v2 |= (goz1.Z(ibtx0) ? 0x800 : 0x400);
        }
        if((v2 & 0x493) == 1170 && goz1.ac()) {
            goz1.G();
            hfc1 = hfc0;
            fcp1 = fcp0;
            crk1 = crk0;
        }
        else {
            goz1.I();
            if((v & 1) != 0 && !goz1.aa()) {
                goz1.G();
                if((v1 & 2) != 0) {
                    v2 &= 0xFFFFFF8F;
                }
                hfc2 = hfc0;
                fcp1 = fcp0;
                crk2 = crk0;
            }
            else {
                hfc hfc3 = (v1 & 1) == 0 ? hfc0 : hfc.e;
                if((v1 & 2) == 0) {
                    fcp2 = fcp0;
                }
                else {
                    v2 &= 0xFFFFFF8F;
                    fcp2 = fcq.g(goz1);
                }
                if((v1 & 4) == 0) {
                    crk2 = crk0;
                    hfc2 = hfc3;
                }
                else {
                    hfc2 = hfc3;
                    crk2 = null;
                }
                fcp1 = fcp2;
            }
            goz1.w();
            goz1.M(0x1C6D957F);
            if(hyxx.c()) {
                eaa eaa0 = fpu.c(goz1).e;
                hfc4 = hhi.a(hfc.e, eaa0);
            }
            else {
                eag eag0 = eah.b(28.0f);
                hfc4 = hhi.a(hfc.e, eag0);
            }
            goz1.x();
            hfc hfc5 = hfc4.a(hfc2);
            goz1.M(0x1C6DAFAD);
            eaa eaa1 = hyxx.c() ? fpu.c(goz1).e : eah.b(28.0f);
            goz1.x();
            fdb.a(hfc5, eaa1, fcp1, null, crk2, ibtx0, goz1, v2 << 3 & 0x380 | 0xE000 & v2 << 6 | v2 << 6 & 0x70000, 8);
            crk1 = crk2;
            hfc1 = hfc2;
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new ftxt(hfc1, fcp1, crk1, ibtx0, v, v1);
        }
    }
}

