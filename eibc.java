public final class eibc {
    public static final long a;

    static {
        eibc.a = ibzy.h(450, ibzz.c);
    }

    public static final void a(hfc hfc0, clj clj0, float f, float f1, goz goz0, int v) {
        Object object1;
        Object object0;
        hfc hfc1;
        ibuq.f(clj0, "stateTransition");
        goz goz1 = goz0.ao(64295800);
        int v1 = (v & 0x30) == 0 ? v | 6 | (goz1.X(clj0) ? 0x20 : 16) : v | 6;
        if((v & 0x180) == 0) {
            v1 |= (goz1.U(f) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v1 |= (goz1.U(f1) ? 0x800 : 0x400);
        }
        if((v1 & 0x493) == 1170 && goz1.ac()) {
            goz1.G();
            hfc1 = hfc0;
        }
        else {
            int v2 = v1 >> 3 & 14;
            hey hey0 = hfc.e;
            gui gui0 = ehxu.a(clj0, goz1, v2 | 0x30);
            goz1.M(1650772557);
            eibb eibb0 = eibb.a;
            cmc cmc0 = cmv.a;
            int v3 = (v2 | 0x180) & 14 | 0xC00;
            int v4 = v3 & 14 ^ 6;
            if(clj0.z()) {
                goz1.M(0x635A29CD);
                goz1.x();
                object0 = clj0.f();
            }
            else {
                goz1.M(0x63564970);
                boolean z = v4 > 4 && goz1.X(clj0) || (v3 & 6) == 4;
                object0 = goz1.j();
                if(z || object0 == gop.a) {
                    hbm hbm0 = hbl.a();
                    ibts ibts0 = hbm0 == null ? null : hbm0.i();
                    hbm hbm1 = hbl.b(hbm0);
                    try {
                        object1 = clj0.f();
                    }
                    finally {
                        hbl.d(hbm0, hbm1, ibts0);
                    }
                    goz1.P(object1);
                    object0 = object1;
                }
                goz1.x();
            }
            ehwv ehwv0 = (ehwv)object0;
            goz1.M(-2010910231);
            goz1.x();
            Float float0 = (float)0.0f;
            boolean z1 = v4 > 4 && goz1.X(clj0) || (v3 & 6) == 4;
            Object object2 = goz1.j();
            if(z1 || object2 == gop.a) {
                object2 = new gpx(new eiaz(clj0), null);
                goz1.P(object2);
            }
            ehwv ehwv1 = (ehwv)((gui)object2).a();
            goz1.M(-2010910231);
            goz1.x();
            boolean z2 = v4 > 4 && goz1.X(clj0) || (v3 & 6) == 4;
            Object object3 = goz1.j();
            if(z2 || object3 == gop.a) {
                gpx gpx0 = new gpx(new eiba(clj0), null);
                goz1.P(gpx0);
                object3 = gpx0;
            }
            gui gui1 = clz.g(clj0, float0, float0, ((cii)eibb0.a(((gui)object3).a(), goz1, Integer.valueOf(0))), cmc0, goz1, v3 & 14 | 0x30000);
            goz1.x();
            ehwv ehwv2 = (ehwv)clj0.g();
            ccf.b(false, null, cef.o(null, 3), cef.p(null, 3), null, gzf.e(-1165652400, new eiay(f, f1, hey0, clj0, gui0, gui1), goz1), goz1, 200064, 18);
            hfc1 = hey0;
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new eiax(hfc1, clj0, f, f1, v);
        }
    }
}

