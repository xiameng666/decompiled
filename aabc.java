public final class aabc {
    public static final aabc a;

    static {
        aabc.a = new aabc();
    }

    public final void a(String s, goz goz0, int v) {
        goz goz2;
        ibuq.f(s, "title");
        goz goz1 = goz0.ao(0xCC3CE08A);
        int v1 = (v & 6) == 0 ? v | (goz1.X(s) ? 4 : 2) : v;
        if((v1 & 3) == 2 && goz1.ac()) {
            goz1.G();
            goz2 = goz1;
        }
        else if(s.length() > 0) {
            jbn jbn0 = fpu.d(goz1).v;
            long v2 = fpu.a(goz1).q;
            jeu jeu0 = jeu.b;
            hey hey0 = hfc.e;
            goz1.M(0x6E3C21FE);
            Object object0 = goz1.j();
            if(object0 == gop.a) {
                object0 = new aaba();
                goz1.P(object0);
            }
            goz1.x();
            goz2 = goz1;
            fiuk.b(s, iuc.d(hey0, ((ibts)object0)), v2, 0L, jeu0, 0L, null, 0L, 0, false, 0, 0, null, jbn0, goz2, v1 & 14 | 0x180000, 0, 131000);
        }
        else {
            goz2 = goz1;
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new aabb(this, s, v);
        }
    }

    public final void b(String s, String s1, ibth ibth0, hfc hfc0, long v, long v1, goz goz0, int v2, int v3) {
        long v8;
        long v7;
        hfc hfc3;
        long v6;
        hfc hfc2;
        goz goz2;
        long v5;
        hfc hfc1;
        int v4;
        ibuq.f(s, "text");
        ibuq.f(s1, "linkText");
        ibuq.f(ibth0, "onClick");
        goz goz1 = goz0.ao(0xCFEBE0EC);
        if((v3 & 1) == 0) {
            v4 = (v2 & 6) == 0 ? (goz1.X(s) ? 4 : 2) | v2 : v2;
        }
        else {
            v4 = v2 | 6;
        }
        if((v3 & 2) != 0) {
            v4 |= 0x30;
        }
        else if((v2 & 0x30) == 0) {
            v4 |= (goz1.X(s1) ? 0x20 : 16);
        }
        if((v3 & 4) != 0) {
            v4 |= 0x180;
        }
        else if((v2 & 0x180) == 0) {
            v4 |= (goz1.Z(ibth0) ? 0x100 : 0x80);
        }
        if((v3 & 8) != 0) {
            v4 |= 0xC00;
            hfc1 = hfc0;
        }
        else if((v2 & 0xC00) == 0) {
            hfc1 = hfc0;
            v4 |= (goz1.X(hfc1) ? 0x800 : 0x400);
        }
        else {
            hfc1 = hfc0;
        }
        if((v2 & 0x6000) == 0) {
            v4 |= 0x2000;
        }
        if((0x30000 & v2) == 0) {
            v4 |= 0x10000;
        }
        if((v2 & 0x180000) == 0) {
            v4 |= (goz1.X(this) ? 0x100000 : 0x80000);
        }
        if((0x92493 & v4) == 0x92492 && goz1.ac()) {
            goz1.G();
            v5 = v1;
            goz2 = goz1;
            hfc2 = hfc1;
            v6 = v;
            goto label_91;
        }
        else {
            goz1.I();
            if((v2 & 1) != 0 && !goz1.aa()) {
                goz1.G();
                hfc3 = hfc1;
                v7 = v;
                v8 = v1;
            }
            else {
                hfc3 = (v3 & 8) == 0 ? hfc1 : hfc.e;
                v7 = fpu.a(goz1).s;
                v8 = fpu.a(goz1).a;
            }
            goz1.w();
            if(s.length() == 0 && s1.length() == 0) {
                gsb gsb0 = goz1.af();
                if(gsb0 != null) {
                    gsb0.d = new aaax(this, s, s1, ibth0, hfc3, v7, v8, v2, v3);
                }
            }
            else {
                jat jat0 = new jat(v7, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 0xFFFE);
                jat jat1 = new jat(v8, 0L, null, null, null, null, null, 0L, null, null, null, 0L, jjz.b, null, 0xEFFE);
                iwg iwg0 = new iwg(null);
                int v9 = iwg0.c(jat0);
                try {
                    iwg0.j(s);
                }
                catch(Throwable throwable0) {
                    iwg0.k(v9);
                    throw throwable0;
                }
                iwg0.k(v9);
                if(s.length() > 0 && s1.length() > 0) {
                    iwg0.j(" ");
                }
                int v10 = iwg0.b(new iwy("link-tag", new aaaw(ibth0)));
                try {
                    int v11 = iwg0.c(jat1);
                    try {
                        iwg0.j(s1);
                    }
                    catch(Throwable throwable2) {
                        iwg0.k(v11);
                        throw throwable2;
                    }
                    iwg0.k(v11);
                }
                catch(Throwable throwable1) {
                    iwg0.k(v10);
                    throw throwable1;
                }
                iwg0.k(v10);
                iwj iwj0 = iwg0.d();
                jbn jbn0 = fpu.d(goz1).k;
                goz2 = goz1;
                fiuk.a(iwj0, hfc3, 0L, 0L, jeu.a, 0L, null, 0L, 0, false, 0, null, null, jbn0, goz2, v4 >> 6 & 0x70 | 0x180000, 0, 0x1FFBC);
                hfc2 = hfc3;
                v5 = v8;
                v6 = v7;
            label_91:
                gsb gsb1 = goz2.af();
                if(gsb1 != null) {
                    gsb1.d = new aaay(this, s, s1, ibth0, hfc2, v6, v5, v2, v3);
                }
            }
        }
    }

    public final void c(String s, hfc hfc0, goz goz0, int v) {
        hfc hfc1;
        goz goz2;
        ibuq.f(s, "title");
        goz goz1 = goz0.ao(0x132D6E67);
        int v1 = (v & 6) == 0 ? v | (goz1.X(s) ? 4 : 2) : v;
        if(((v1 | 0x30) & 19) == 18 && goz1.ac()) {
            goz1.G();
            goz2 = goz1;
            hfc1 = hfc0;
        }
        else {
            goz2 = goz1;
            hfc1 = hfc.e;
            if(s.length() > 0) {
                jbn jbn0 = fpu.d(goz2).h;
                fiuk.b(s, hfc1, fpu.a(goz2).q, 0L, jeu.b, 0L, null, 0L, 0, false, 0, 0, null, jbn0, goz2, (v1 | 0x30) & 14 | 0x180000 | (v1 | 0x30) & 0x70, 0, 131000);
            }
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new aaaz(this, s, hfc1, v);
        }
    }
}

