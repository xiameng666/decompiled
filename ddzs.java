public final class ddzs {
    public static final void a(String s, ibth ibth0, ibtx ibtx0, ibtw ibtw0, ibtw ibtw1, ibtx ibtx1, goz goz0, int v) {
        ibtw ibtw2;
        ibtx ibtx2;
        ibth ibth1;
        int v1;
        String s1;
        goz goz1 = goz0.ao(-1252640990);
        if((v & 6) == 0) {
            s1 = s;
            v1 = (goz1.X(s1) ? 4 : 2) | v;
        }
        else {
            s1 = s;
            v1 = v;
        }
        if((v & 0x30) == 0) {
            ibth1 = ibth0;
            v1 |= (goz1.Z(ibth1) ? 0x20 : 16);
        }
        else {
            ibth1 = ibth0;
        }
        if((v & 0x180) == 0) {
            ibtx2 = ibtx0;
            v1 |= (goz1.Z(ibtx2) ? 0x100 : 0x80);
        }
        else {
            ibtx2 = ibtx0;
        }
        if((v & 0xC00) == 0) {
            ibtw2 = ibtw0;
            v1 |= (goz1.Z(ibtw2) ? 0x800 : 0x400);
        }
        else {
            ibtw2 = ibtw0;
        }
        if((v & 0x6000) == 0) {
            v1 |= (goz1.Z(ibtw1) ? 0x4000 : 0x2000);
        }
        if((0x30000 & v) == 0) {
            v1 |= (goz1.Z(ibtx1) ? 0x20000 : 0x10000);
        }
        if((74899 & v1) == 74898 && goz1.ac()) {
            goz1.G();
        }
        else {
            gep gep0 = gem.b(far.k(goz1), null, null, null, goz1, 14);
            long v2 = fpu.a(goz1).F;
            fxw.a(huw.b(hfc.e, ((flj)gep0).d), gzf.e(558287078, new ddzn(v2, gep0, s1, ibth1, ibtx2), goz1), ibtw1, ibtw2, null, 0, v2, 0L, null, gzf.e(0xCF6A4B71, new ddzo(ibtx1), goz1), goz1, v1 >> 6 & 0x380 | 0x30000030 | v1 & 0x1C00, 0x1B0);
            goz1 = goz1;
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new ddzh(s, ibth0, ibtx0, ibtw0, ibtw1, ibtx1, v);
        }
    }

    public static final void b(String s, ibth ibth0, ibtx ibtx0, ibtw ibtw0, ibtw ibtw1, ibtx ibtx1, goz goz0, int v, int v1) {
        ibtw ibtw5;
        ibtw ibtw4;
        ibtx ibtx3;
        ibtw ibtw3;
        ibtw ibtw2;
        ibtx ibtx2;
        int v2;
        ibuq.f(s, "title");
        ibuq.f(ibth0, "onBackClick");
        ibuq.f(ibtx1, "content");
        goz goz1 = goz0.ao(-171122101);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (goz1.X(s) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v2 |= (goz1.Z(ibth0) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
            ibtx2 = ibtx0;
        }
        else if((v & 0x180) == 0) {
            ibtx2 = ibtx0;
            v2 |= (goz1.Z(ibtx2) ? 0x100 : 0x80);
        }
        else {
            ibtx2 = ibtx0;
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
            ibtw2 = ibtw0;
        }
        else if((v & 0xC00) == 0) {
            ibtw2 = ibtw0;
            v2 |= (goz1.Z(ibtw2) ? 0x800 : 0x400);
        }
        else {
            ibtw2 = ibtw0;
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
        }
        else if((v & 0x6000) == 0) {
            v2 |= (goz1.Z(null) ? 0x4000 : 0x2000);
        }
        if((v1 & 0x20) != 0) {
            v2 |= 0x30000;
            ibtw3 = ibtw1;
        }
        else if((v & 0x30000) == 0) {
            ibtw3 = ibtw1;
            v2 |= (goz1.Z(ibtw3) ? 0x20000 : 0x10000);
        }
        else {
            ibtw3 = ibtw1;
        }
        if((0x180000 & v) == 0) {
            v2 |= (goz1.Z(ibtx1) ? 0x100000 : 0x80000);
        }
        if((0x92493 & v2) == 0x92492 && goz1.ac()) {
            goz1.G();
            ibtx3 = ibtx2;
            ibtw4 = ibtw2;
            ibtw5 = ibtw3;
        }
        else {
            ibtx ibtx4 = (v1 & 4) == 0 ? ibtx2 : ddxh.a;
            ibtw ibtw6 = (v1 & 8) == 0 ? ibtw2 : ddxh.b;
            ibtw ibtw7 = (v1 & 0x20) == 0 ? ibtw3 : ddxh.c;
            ddzs.a(s, ibth0, ibtx4, ibtw6, ibtw7, gzf.e(0x580B201B, new ddzr(ibtx1), goz1), goz1, v2 & 14 | 0x30000 | v2 & 0x70 | v2 & 0x380 | v2 & 0x1C00 | v2 >> 3 & 0xE000);
            ibtw5 = ibtw7;
            ibtw4 = ibtw6;
            ibtx3 = ibtx4;
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new ddzg(s, ibth0, ibtx3, ibtw4, ibtw5, ibtx1, v, v1);
        }
    }

    public static final void c(String s, ibth ibth0, ibtx ibtx0, ibtw ibtw0, ibtw ibtw1, ibts ibts0, goz goz0, int v) {
        ibtw ibtw3;
        ibtw ibtw2;
        ibtx ibtx1;
        ibuq.f(s, "title");
        ibuq.f(ibth0, "onBackClick");
        ibuq.f(ibts0, "content");
        goz goz1 = goz0.ao(-1210939476);
        int v1 = (v & 6) == 0 ? v | (goz1.X(s) ? 4 : 2) : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(ibth0) ? 0x20 : 16);
        }
        int v2 = (v & 0x30000) == 0 ? v1 | 0x6D80 | (goz1.Z(ibts0) ? 0x20000 : 0x10000) : v1 | 0x6D80;
        if((74899 & v2) == 74898 && goz1.ac()) {
            goz1.G();
            ibtx1 = ibtx0;
            ibtw2 = ibtw0;
            ibtw3 = ibtw1;
        }
        else {
            gze gze0 = gzf.e(428043644, new ddzp(ibts0), goz1);
            ddzs.a(s, ibth0, ddxh.d, ddxh.e, ddxh.f, gze0, goz1, 0x30000 | v2 & 14 | v2 & 0x70 | v2 & 0x380 | v2 & 0x1C00 | v2 & 0xE000);
            ibtw3 = ddxh.f;
            ibtw2 = ddxh.e;
            ibtx1 = ddxh.d;
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new ddzi(s, ibth0, ibtx1, ibtw2, ibtw3, ibts0, v);
        }
    }
}

