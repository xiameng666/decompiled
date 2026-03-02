public final class ddbu {
    public static final void a(hfc hfc0, ibtw ibtw0, String s, String s1, ibth ibth0, ibtw ibtw1, goz goz0, int v, int v1) {
        ibtw ibtw3;
        hfc hfc2;
        ibtw ibtw2;
        hfc hfc1;
        int v2;
        goz goz1 = goz0.ao(0x5E18137D);
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
            ibtw2 = ibtw0;
        }
        else if((v & 0x30) == 0) {
            ibtw2 = ibtw0;
            v2 |= (goz1.Z(ibtw2) ? 0x20 : 16);
        }
        else {
            ibtw2 = ibtw0;
        }
        if((v & 0x180) == 0) {
            v2 |= (goz1.X(s) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v2 |= (goz1.X(s1) ? 0x800 : 0x400);
        }
        if((v & 0x6000) == 0) {
            v2 |= (goz1.Z(ibth0) ? 0x4000 : 0x2000);
        }
        if((0x30000 & v) == 0) {
            v2 |= (goz1.Z(ibtw1) ? 0x20000 : 0x10000);
        }
        if((74899 & v2) == 74898 && goz1.ac()) {
            goz1.G();
            hfc2 = hfc1;
            ibtw3 = ibtw2;
        }
        else {
            hfc hfc3 = (v1 & 1) == 0 ? hfc1 : hfc.e;
            ibtw ibtw4 = (v1 & 2) == 0 ? ibtw2 : null;
            fby fby0 = fiqq.c(fpu.a(goz1).h, fpu.a(goz1).i, goz1, 12);
            dle dle0 = new dle(20.0f, 16.0f, 20.0f, 16.0f);
            fiqv.a(ibth0, hfc3, false, fpu.c(goz1).e, fby0, null, null, dle0, gzf.e(0xFA0ADF6D, new ddbt(ibtw4, ibtw1, s, s1), goz1), goz1, v2 >> 12 & 14 | 0x30C00000 | v2 << 3 & 0x70, 356);
            goz1 = goz1;
            ibtw3 = ibtw4;
            hfc2 = hfc3;
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new ddbq(hfc2, ibtw3, s, s1, ibth0, ibtw1, v, v1);
        }
    }

    public static final void b(hfc hfc0, String s, String s1, ibth ibth0, ibtw ibtw0, goz goz0, int v) {
        ibuq.f(s, "title");
        ibuq.f(s1, "subtitle");
        ibuq.f(ibth0, "onClick");
        goz goz1 = goz0.ao(0x865704E8);
        int v1 = (v & 6) == 0 ? (goz1.X(hfc0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.X(s) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (goz1.X(s1) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v1 |= (goz1.Z(ibth0) ? 0x800 : 0x400);
        }
        if((v & 0x6000) == 0) {
            v1 |= (goz1.Z(ibtw0) ? 0x4000 : 0x2000);
        }
        if((v1 & 9363) == 9362 && goz1.ac()) {
            goz1.G();
        }
        else {
            ddbu.a(hfc0, null, s, s1, ibth0, ibtw0, goz1, v1 & 14 | v1 << 3 & 0x380 | v1 << 3 & 0x1C00 | 0xE000 & v1 << 3 | v1 << 3 & 0x70000, 2);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new ddbs(hfc0, s, s1, ibth0, ibtw0, v);
        }
    }

    public static final void c(hfc hfc0, String s, String s1, ibth ibth0, ibtw ibtw0, goz goz0, int v) {
        ibtw ibtw1;
        ibuq.f(s, "title");
        ibuq.f(s1, "subtitle");
        ibuq.f(ibth0, "onClick");
        goz goz1 = goz0.ao(0xCD6DA1DB);
        int v1 = (v & 6) == 0 ? (goz1.X(hfc0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.X(s) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (goz1.X(s1) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v1 |= (goz1.Z(ibth0) ? 0x800 : 0x400);
        }
        if((v & 0x6000) == 0) {
            ibtw1 = ibtw0;
            v1 |= (goz1.Z(ibtw0) ? 0x4000 : 0x2000);
        }
        else {
            ibtw1 = ibtw0;
        }
        if((v1 & 9363) == 9362 && goz1.ac()) {
            goz1.G();
        }
        else {
            ddbu.a(hfc0, ibtw1, s, s1, ibth0, ddbx.a, goz1, v1 & 14 | 0x30000 | v1 >> 9 & 0x70 | v1 << 3 & 0x380 | v1 << 3 & 0x1C00 | v1 << 3 & 0xE000, 0);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new ddbr(hfc0, s, s1, ibth0, ibtw0, v);
        }
    }
}

