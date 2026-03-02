public final class ddxp {
    public static final void a(ibtx ibtx0, ibty ibty0, ibtx ibtx1, ibtw ibtw0, ibtx ibtx2, goz goz0, int v) {
        goz goz2;
        ibtw ibtw1;
        ibuq.f(ibtx0, "userInfo");
        ibuq.f(ibtx1, "actions");
        ibuq.f(ibtx2, "content");
        goz goz1 = goz0.ao(-1056197021);
        int v1 = (v & 6) == 0 ? (goz1.Z(ibtx0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(ibty0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (goz1.Z(ibtx1) ? 0x100 : 0x80);
        }
        int v2 = (v & 0x6000) == 0 ? v1 | 0xC00 | (goz1.Z(ibtx2) ? 0x4000 : 0x2000) : v1 | 0xC00;
        if((v2 & 9363) == 9362 && goz1.ac()) {
            goz1.G();
            ibtw1 = ibtw0;
            goz2 = goz1;
        }
        else {
            long v3 = fpu.a(goz1).F;
            hfc hfc0 = dls.v(hfc.e);
            gze gze0 = gzf.e(0xD15E9E1F, new ddxm(ibtx0, ibty0, ibtx1), goz1);
            gze gze1 = gzf.e(-2018309196, new ddxo(ibtx2), goz1);
            goz2 = goz1;
            fxw.a(hfc0, gze0, null, ddwz.a, null, 0, v3, 0L, null, gze1, goz2, v2 & 0x1C00 | 0x30000036, 436);
            ibtw1 = ddwz.a;
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new ddxi(ibtx0, ibty0, ibtx1, ibtw1, ibtx2, v);
        }
    }
}

