public final class byjd {
    public static final void a(hfc hfc0, ibtw ibtw0, dhn dhn0, ibts ibts0, goz goz0, int v, int v1) {
        ibtw ibtw2;
        hfc hfc2;
        dhn dhn1;
        ibtw ibtw1;
        hfc hfc1;
        int v2;
        ibuq.f(ibts0, "content");
        goz goz1 = goz0.ao(0x2F10A397);
        if((v1 & 1) != 0) {
            v2 = v | 6;
            hfc1 = hfc0;
        }
        else if((v & 6) == 0) {
            hfc1 = hfc0;
            v2 = (goz1.X(hfc1) ? 4 : 2) | v;
        }
        else {
            hfc1 = hfc0;
            v2 = v;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
            ibtw1 = ibtw0;
        }
        else if((v & 0x30) == 0) {
            ibtw1 = ibtw0;
            v2 |= (goz1.Z(ibtw1) ? 0x20 : 16);
        }
        else {
            ibtw1 = ibtw0;
        }
        if((((v & 0xC00) == 0 ? v2 | 0x180 | (goz1.Z(ibts0) ? 0x800 : 0x400) : v2 | 0x180) & 0x493) == 1170 && goz1.ac()) {
            goz1.G();
            dhn1 = dhn0;
            hfc2 = hfc1;
            ibtw2 = ibtw1;
        }
        else {
            hfc hfc3 = (v1 & 1) == 0 ? hfc1 : hfc.e;
            ibtw ibtw3 = (v1 & 2) == 0 ? ibtw1 : null;
            hfc hfc4 = dls.B(dls.w(hfc3));
            fcp fcp0 = fcq.h(fpu.a(goz1).D, 0L, 0L, 0L, goz1, 14);
            gze gze0 = gzf.e(0xC16FF009, new byjc(ibtw3, dho.c, ibts0), goz1);
            goz1 = goz1;
            fdb.a(hfc4, null, fcp0, null, null, gze0, goz1, 0x36000, 10);
            dhn1 = dho.c;
            ibtw2 = ibtw3;
            hfc2 = hfc3;
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new byja(hfc2, ibtw2, dhn1, ibts0, v, v1);
        }
    }

    public static final void b(hfc hfc0, ibtx ibtx0, goz goz0, int v) {
        ibtx ibtx1;
        ibuq.f(ibtx0, "content");
        goz goz1 = goz0.ao(0xE4FC1C95);
        int v1 = (v & 0x30) == 0 ? v | 6 | (goz1.Z(ibtx0) ? 0x20 : 16) : v | 6;
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
            ibtx1 = ibtx0;
        }
        else {
            hfc0 = hfc.e;
            hfc hfc1 = dls.B(dls.w(hfc0));
            fcp fcp0 = fcq.h(hll.h, 0L, 0L, 0L, goz1, 14);
            goz1 = goz1;
            ibtx1 = ibtx0;
            fdb.a(hfc1, byii.a.c, fcp0, null, null, ibtx1, goz1, v1 << 12 & 0x70000 | 0x6000, 8);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new byjb(hfc0, ibtx1, v);
        }
    }
}

