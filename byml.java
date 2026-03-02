public final class byml {
    public static final void a(String s, hfc hfc0, boolean z, ibts ibts0, goz goz0, int v, int v1) {
        ibts ibts3;
        ibts ibts2;
        hfc hfc2;
        goz goz2;
        boolean z1;
        ibts ibts1;
        hfc hfc1;
        int v3;
        ibuq.f(s, "text");
        goz goz1 = goz0.ao(1298520942);
        int v2 = 1;
        if((v1 & 1) == 0) {
            v3 = (v & 6) == 0 ? (goz1.X(s) ? 4 : 2) | v : v;
        }
        else {
            v3 = v | 6;
        }
        if((v1 & 2) != 0) {
            v3 |= 0x30;
            hfc1 = hfc0;
        }
        else if((v & 0x30) == 0) {
            hfc1 = hfc0;
            v3 |= (goz1.X(hfc1) ? 0x20 : 16);
        }
        else {
            hfc1 = hfc0;
        }
        if((v1 & 4) != 0) {
            v3 |= 0x180;
        }
        else if((v & 0x180) == 0) {
            v3 |= (goz1.Y(z) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v3 |= 0xC00;
            ibts1 = ibts0;
        }
        else if((v & 0xC00) == 0) {
            ibts1 = ibts0;
            v3 |= (goz1.Z(ibts1) ? 0x800 : 0x400);
        }
        else {
            ibts1 = ibts0;
        }
        if((v3 & 0x493) == 1170 && goz1.ac()) {
            goz1.G();
            z1 = z;
            goz2 = goz1;
            hfc2 = hfc1;
            ibts2 = ibts1;
        }
        else {
            hfc hfc3 = (v1 & 2) == 0 ? hfc1 : hfc.e;
            int v4 = z & ((v1 & 4) == 0 ? 1 : 0);
            if((v1 & 8) == 0) {
                ibts3 = ibts1;
            }
            else {
                goz1.M(0x6E3C21FE);
                Object object0 = goz1.j();
                if(object0 == gop.a) {
                    object0 = new byme();
                    goz1.P(object0);
                }
                goz1.x();
                ibts3 = (ibts)object0;
            }
            hfc hfc4 = dls.C(hfc3, null, 3);
            long v5 = fpu.a(goz1).s;
            jbn jbn0 = jbn.y(fpu.d(goz1).l, 0L, 0L, null, null, null, 0L, null, 0, 0L, null, null, 0, 2, null, 0xBFFFFF);
            if(1 != v4) {
                v2 = 0x7FFFFFFF;
            }
            goz2 = goz1;
            gdh.b(s, hfc4, v5, 0L, null, 0L, null, null, 0L, 2, false, v2, 0, ibts3, jbn0, goz2, v3 & 14, v3 << 9 & 0x380000 | 0x180, 0xAFF8);
            ibts2 = ibts3;
            hfc2 = hfc3;
            z1 = v4;
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new bymf(s, hfc2, z1, ibts2, v, v1);
        }
    }

    public static final void b(String s, hfc hfc0, goz goz0, int v, int v1) {
        goz goz2;
        hfc hfc1;
        int v2;
        ibuq.f(s, "text");
        goz goz1 = goz0.ao(0x8D32FA2C);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? v | (goz1.X(s) ? 4 : 2) : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
            hfc1 = hfc0;
        }
        else if((v & 0x30) == 0) {
            hfc1 = hfc0;
            v2 |= (goz1.X(hfc1) ? 0x20 : 16);
        }
        else {
            hfc1 = hfc0;
        }
        if((v2 & 19) == 18 && goz1.ac()) {
            goz1.G();
            goz2 = goz1;
        }
        else {
            hfc hfc2 = (v1 & 2) == 0 ? hfc1 : hfc.e;
            hfc hfc3 = dls.C(hfc2, null, 3);
            long v3 = fpu.a(goz1).q;
            jbn jbn0 = jbn.y(fpu.d(goz1).f, 0L, 0L, null, null, null, 0L, null, 0, 0L, null, null, 0, 2, null, 0xBFFFFF);
            goz2 = goz1;
            gdh.b(s, hfc3, v3, 0L, null, 0L, null, new jjy(3), 0L, 0, false, 0, 0, null, jbn0, goz2, v2 & 14, 0, 130040);
            hfc1 = hfc2;
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new bymg(s, hfc1, v, v1);
        }
    }

    public static final void c(String s, hfc hfc0, boolean z, ibts ibts0, jjy jjy0, goz goz0, int v, int v1) {
        ibts ibts3;
        jjy jjy2;
        ibts ibts2;
        hfc hfc2;
        goz goz2;
        boolean z1;
        jjy jjy1;
        ibts ibts1;
        hfc hfc1;
        int v3;
        ibuq.f(s, "text");
        goz goz1 = goz0.ao(0xFE60F57A);
        int v2 = 1;
        if((v1 & 1) == 0) {
            v3 = (v & 6) == 0 ? (goz1.X(s) ? 4 : 2) | v : v;
        }
        else {
            v3 = v | 6;
        }
        if((v1 & 2) != 0) {
            v3 |= 0x30;
            hfc1 = hfc0;
        }
        else if((v & 0x30) == 0) {
            hfc1 = hfc0;
            v3 |= (goz1.X(hfc1) ? 0x20 : 16);
        }
        else {
            hfc1 = hfc0;
        }
        if((v1 & 4) != 0) {
            v3 |= 0x180;
        }
        else if((v & 0x180) == 0) {
            v3 |= (goz1.Y(z) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v3 |= 0xC00;
            ibts1 = ibts0;
        }
        else if((v & 0xC00) == 0) {
            ibts1 = ibts0;
            v3 |= (goz1.Z(ibts1) ? 0x800 : 0x400);
        }
        else {
            ibts1 = ibts0;
        }
        if((v1 & 16) != 0) {
            v3 |= 0x6000;
            jjy1 = jjy0;
        }
        else if((v & 0x6000) == 0) {
            jjy1 = jjy0;
            v3 |= (goz1.X(jjy1) ? 0x4000 : 0x2000);
        }
        else {
            jjy1 = jjy0;
        }
        if((v3 & 9363) == 9362 && goz1.ac()) {
            goz1.G();
            z1 = z;
            goz2 = goz1;
            hfc2 = hfc1;
            ibts2 = ibts1;
            jjy2 = jjy1;
        }
        else {
            hfc hfc3 = (v1 & 2) == 0 ? hfc1 : hfc.e;
            int v4 = z & ((v1 & 4) == 0 ? 1 : 0);
            if((v1 & 8) == 0) {
                ibts3 = ibts1;
            }
            else {
                goz1.M(0x6E3C21FE);
                Object object0 = goz1.j();
                if(object0 == gop.a) {
                    object0 = new bymj();
                    goz1.P(object0);
                }
                goz1.x();
                ibts3 = (ibts)object0;
            }
            jjy jjy3 = (v1 & 16) == 0 ? jjy1 : null;
            hfc hfc4 = dls.C(hfc3, null, 3);
            long v5 = fpu.a(goz1).q;
            jbn jbn0 = jbn.y(fpu.d(goz1).i, 0L, 0L, null, null, null, 0L, null, 0, 0L, null, null, 0, 2, null, 0xBFFFFF);
            if(1 != v4) {
                v2 = 0x7FFFFFFF;
            }
            goz2 = goz1;
            gdh.b(s, hfc4, v5, 0L, null, 0L, null, jjy3, 0L, 2, false, v2, 0, ibts3, jbn0, goz2, v3 & 14, v3 >> 12 & 14 | 0x180 | v3 << 9 & 0x380000, 0xABF8);
            jjy2 = jjy3;
            ibts2 = ibts3;
            hfc2 = hfc3;
            z1 = v4;
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new bymk(s, hfc2, z1, ibts2, jjy2, v, v1);
        }
    }

    public static final void d(String s, hfc hfc0, goz goz0, int v) {
        goz goz2;
        ibuq.f(s, "text");
        goz goz1 = goz0.ao(0xF36F6B03);
        int v1 = (v & 6) == 0 ? v | (goz1.X(s) ? 4 : 2) : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.X(hfc0) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
            goz2 = goz1;
        }
        else {
            goz2 = goz1;
            gdh.b(s, dls.C(hfc0, null, 3), fpu.a(goz1).q, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, jbn.y(fpu.d(goz1).g, 0L, 0L, null, null, null, 0L, null, 0, 0L, null, null, 0, 2, null, 0xBFFFFF), goz2, v1 & 14, 0, 0x1FFF8);
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new byma(s, hfc0, v);
        }
    }

    public static final void e(String s, hfc hfc0, long v, goz goz0, int v1) {
        goz goz2;
        ibuq.f(s, "text");
        goz goz1 = goz0.ao(0x40831853);
        int v2 = (v1 & 6) == 0 ? (goz1.X(s) ? 4 : 2) | v1 : v1;
        if((v1 & 0x30) == 0) {
            v2 |= (goz1.X(hfc0) ? 0x20 : 16);
        }
        if((v1 & 0x180) == 0) {
            v2 |= (goz1.W(v) ? 0x100 : 0x80);
        }
        if((v2 & 0x93) == 0x92 && goz1.ac()) {
            goz1.G();
            goz2 = goz1;
        }
        else {
            goz2 = goz1;
            gdh.b(s, dls.C(hfc0, null, 3), v, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, jbn.y(fpu.d(goz1).i, 0L, 0L, null, null, null, 0L, null, 0, 0L, null, null, 0, 2, null, 0xBFFFFF), goz2, v2 & 910, 0, 0x1FFF8);
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new bymc(s, hfc0, v, v1);
        }
    }

    public static final void f(String s, hfc hfc0, goz goz0, int v) {
        goz goz2;
        ibuq.f(s, "text");
        goz goz1 = goz0.ao(0x80F25EE8);
        int v1 = (v & 6) == 0 ? v | (goz1.X(s) ? 4 : 2) : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.X(hfc0) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
            goz2 = goz1;
        }
        else {
            goz2 = goz1;
            gdh.b(s, dls.C(hfc0, null, 3), fpu.a(goz1).v, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, jbn.y(fpu.d(goz1).k, 0L, 0L, null, null, null, 0L, null, 0, 0L, null, null, 0, 2, null, 0xBFFFFF), goz2, v1 & 14, 0, 0x1FFF8);
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new bylz(s, hfc0, v);
        }
    }

    public static final void g(String s, hfc hfc0, goz goz0, int v) {
        hfc hfc1;
        goz goz2;
        ibuq.f(s, "text");
        goz goz1 = goz0.ao(-2065388311);
        int v1 = (v & 6) == 0 ? v | (goz1.X(s) ? 4 : 2) : v;
        if(((v1 | 0x30) & 19) == 18 && goz1.ac()) {
            goz1.G();
            goz2 = goz1;
            hfc1 = hfc0;
        }
        else {
            goz2 = goz1;
            gdh.b(s, dls.C(hfc.e, null, 3), fpu.a(goz1).s, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, jbn.y(fpu.d(goz1).k, 0L, 0L, null, null, null, 0L, null, 0, 0L, null, null, 0, 2, null, 0xBFFFFF), goz2, (v1 | 0x30) & 14, 0, 0x1FFF8);
            hfc1 = hfc.e;
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new bymd(s, hfc1, v);
        }
    }

    public static final void h(String s, hfc hfc0, goz goz0, int v) {
        hfc hfc1;
        goz goz2;
        ibuq.f(s, "text");
        goz goz1 = goz0.ao(0x12EBC8E7);
        int v1 = (v & 6) == 0 ? v | (goz1.X(s) ? 4 : 2) : v;
        if(((v1 | 0x30) & 19) == 18 && goz1.ac()) {
            goz1.G();
            goz2 = goz1;
            hfc1 = hfc0;
        }
        else {
            hfc hfc2 = dls.C(hfc.e, null, 3);
            jbn jbn0 = jbn.y(fpu.d(goz1).m, 0L, 0L, null, null, null, 0L, null, 0, 0L, null, null, 0, 2, null, 0xBFFFFF);
            goz2 = goz1;
            gdh.b(s, hfc2, 0L, 0L, null, 0L, null, new jjy(3), 0L, 0, false, 0, 0, null, jbn0, goz2, (v1 | 0x30) & 14, 0, 0x1FBFC);
            hfc1 = hfc.e;
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new bymh(s, hfc1, v);
        }
    }

    public static final void i(String s, hfc hfc0, goz goz0, int v) {
        hfc hfc1;
        goz goz2;
        ibuq.f(s, "text");
        goz goz1 = goz0.ao(0xB1374F10);
        int v1 = (v & 6) == 0 ? v | (goz1.X(s) ? 4 : 2) : v;
        if(((v1 | 0x30) & 19) == 18 && goz1.ac()) {
            goz1.G();
            goz2 = goz1;
            hfc1 = hfc0;
        }
        else {
            hfc hfc2 = dls.C(hfc.e, null, 3);
            long v2 = fpu.a(goz1).s;
            jbn jbn0 = jbn.y(fpu.d(goz1).m, 0L, 0L, null, null, null, 0L, null, 0, 0L, null, null, 0, 2, null, 0xBFFFFF);
            goz2 = goz1;
            gdh.b(s, hfc2, v2, 0L, null, 0L, null, new jjy(3), 0L, 0, false, 0, 0, null, jbn0, goz2, (v1 | 0x30) & 14, 0, 130040);
            hfc1 = hfc.e;
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new bymi(s, hfc1, v);
        }
    }

    public static final void j(String s, hfc hfc0, goz goz0, int v) {
        hfc hfc1;
        goz goz2;
        ibuq.f(s, "text");
        goz goz1 = goz0.ao(0xC3060185);
        int v1 = (v & 6) == 0 ? v | (goz1.X(s) ? 4 : 2) : v;
        if(((v1 | 0x30) & 19) == 18 && goz1.ac()) {
            goz1.G();
            goz2 = goz1;
            hfc1 = hfc0;
        }
        else {
            goz2 = goz1;
            gdh.b(s, dls.C(hfc.e, null, 3), fpu.a(goz1).e, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, jbn.y(fpu.d(goz1).m, 0L, 0L, null, null, null, 0L, null, 0, 0L, null, null, 0, 2, null, 0xBFFFFF), goz2, (v1 | 0x30) & 14, 0, 0x1FFF8);
            hfc1 = hfc.e;
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new bymb(s, hfc1, v);
        }
    }
}

