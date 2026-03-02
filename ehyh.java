public final class ehyh {
    public static final int a;
    private static final cer b;
    private static final ceq c;

    static {
        ehyh.b = cef.p(chm.c(150, 0, cih.d, 2), 2).a(cef.r(chm.c(0xFA, 0, new chz(0.52f, 0.0f, 0.74f, 0.0f), 2), 0.8f, 4));
        ehyh.c = cef.o(chm.c(150, 0, cih.d, 2), 2).a(cef.q(chm.c(0xFA, 0, new chz(0.52f, 0.0f, 0.74f, 0.0f), 2), 0.8f, 4));
    }

    public static final void a(hfc hfc0, clj clj0, String s, goz goz0, int v) {
        ibuq.f(clj0, "stateTransition");
        goz goz1 = goz0.ao(2067547747);
        int v1 = (v & 6) == 0 ? (goz1.X(hfc0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.X(clj0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (goz1.X(s) ? 0x100 : 0x80);
        }
        if((v1 & 0x93) == 0x92 && goz1.ac()) {
            goz1.G();
        }
        else {
            ehyh.b(hfc0, clj0, gzf.e(0xAFFDA9AB, new ehyc(s), goz1), goz1, v1 & 0x70 | (v1 & 14 | 0x180));
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new ehxx(hfc0, clj0, s, v);
        }
    }

    public static final void b(hfc hfc0, clj clj0, ibtw ibtw0, goz goz0, int v) {
        goz goz1 = goz0.ao(0x2E941257);
        boolean z = true;
        int v1 = (v & 6) == 0 ? (goz1.X(hfc0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.X(clj0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (goz1.Z(ibtw0) ? 0x100 : 0x80);
        }
        if((v1 & 0x93) == 0x92 && goz1.ac()) {
            goz1.G();
        }
        else {
            ibuq.f(clj0, "stateTransition");
            goz1.M(0xF615416A);
            goz1.M(0x6E3C21FE);
            Object object0 = goz1.j();
            Object object1 = gop.a;
            if(object0 == object1) {
                object0 = chc.a(1.0f);
                goz1.P(object0);
            }
            goz1.x();
            Boolean boolean0 = Boolean.valueOf(eiav.b(((ehwv)clj0.g())));
            goz1.M(-1633490746);
            int v2 = (((v1 >> 3 & 14 ^ 6) <= 4 || !goz1.X(clj0)) && (v1 >> 3 & 6) != 4 ? 0 : 1) | goz1.Z(((chb)object0));
            Object object2 = goz1.j();
            if(v2 != 0 || object2 == object1) {
                object2 = new ehyg(clj0, ((chb)object0), null);
                goz1.P(object2);
            }
            goz1.x();
            gqe.f(boolean0, ((ibtw)object2), goz1);
            goz1.x();
            if(!eiav.b(((ehwv)clj0.g())) && eiav.a(((ehwv)clj0.g()))) {
                z = false;
            }
            gze gze0 = gzf.e(0x539C872F, new ehye(hfc0, ((chb)object0), ibtw0), goz1);
            ccf.b(z, null, ehyh.c, ehyh.b, null, gze0, goz1, 200064, 18);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new ehxy(hfc0, clj0, ibtw0, v);
        }
    }

    public static final void c(hfc hfc0, clj clj0, goz goz0, int v) {
        ibuq.f(clj0, "stateTransition");
        goz goz1 = goz0.ao(0xEB7C527B);
        int v1 = (v & 6) == 0 ? (goz1.X(hfc0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.X(clj0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (goz1.V(0x7F08043F) ? 0x100 : 0x80);
        }
        if((v1 & 0x93) == 0x92 && goz1.ac()) {
            goz1.G();
        }
        else {
            ehyh.b(hfc0, clj0, gzf.e(0xF8FEF433, new ehyb(), goz1), goz1, v1 & 0x70 | (v1 & 14 | 0x180));
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new ehxz(hfc0, clj0, v);
        }
    }
}

