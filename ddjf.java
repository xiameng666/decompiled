public final class ddjf {
    public static final void a(String s, String s1, hfc hfc0, jat jat0, jat jat1, ibth ibth0, goz goz0, int v) {
        jat jat5;
        jat jat4;
        hfc hfc2;
        goz goz2;
        jat jat3;
        jat jat2;
        hfc hfc1;
        ibuq.f(s, "text");
        ibuq.f(s1, "linkText");
        goz goz1 = goz0.ao(0xC580B8F3);
        int v1 = (v & 6) == 0 ? (goz1.X(s) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.X(s1) ? 0x20 : 16);
        }
        int v2 = (v & 0xC00) == 0 ? v1 | 0x580 : v1 | 0x180;
        if((v & 0x6000) == 0) {
            v2 |= 0x2000;
        }
        if((0x30000 & v) == 0) {
            v2 |= (goz1.Z(ibth0) ? 0x20000 : 0x10000);
        }
        if((74899 & v2) == 74898 && goz1.ac()) {
            goz1.G();
            hfc1 = hfc0;
            jat2 = jat0;
            jat3 = jat1;
            goz2 = goz1;
        }
        else {
            goz1.I();
            if((v & 1) != 0 && !goz1.aa()) {
                goz1.G();
                hfc2 = hfc0;
                jat4 = jat0;
                jat5 = jat1;
            }
            else {
                hfc2 = hfc.e;
                jat4 = jat.g(fpu.d(goz1).k.b, fpu.a(goz1).q, null, 0xFFFE);
                jat5 = jat.g(fpu.d(goz1).k.b, fpu.a(goz1).a, jjz.b, 0xEFFE);
            }
            goz1.w();
            goz1.M(1748404807);
            iwg iwg0 = new iwg(null);
            int v3 = iwg0.c(jat4);
            try {
                iwg0.j(s);
            }
            catch(Throwable throwable0) {
                iwg0.k(v3);
                throw throwable0;
            }
            iwg0.k(v3);
            iwg0.j(" ");
            jbf jbf0 = new jbf(jat5, 14);
            goz1.M(5004770);
            Object object0 = goz1.j();
            if((v2 & 0x70000) == 0x20000 || object0 == gop.a) {
                object0 = new ddjd(ibth0);
                goz1.P(object0);
            }
            goz1.x();
            int v4 = iwg0.b(new iwy(s1, jbf0, ((ixb)object0)));
            try {
                iwg0.j(s1);
            }
            catch(Throwable throwable1) {
                iwg0.k(v4);
                throw throwable1;
            }
            iwg0.k(v4);
            iwj iwj0 = iwg0.d();
            goz1.x();
            jat3 = jat5;
            goz2 = goz1;
            fiuk.a(iwj0, hfc2, 0L, 0L, null, 0L, null, 0L, 0, false, 0, null, null, null, goz2, v2 >> 3 & 0x70, 0, 0x3FFFC);
            jat2 = jat4;
            hfc1 = hfc2;
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new ddje(s, s1, hfc1, jat2, jat3, ibth0, v);
        }
    }
}

