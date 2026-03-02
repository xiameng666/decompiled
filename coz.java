final class coz extends cpb {
    @Override  // cpb
    public final gui a(clj clj0, int v, goz goz0, int v1) {
        Object object1;
        Object object0;
        goz0.M(0x71ED531);
        cov cov0 = new cov(v);
        int v2 = v1 << 3 & 0x380 | v1 & 14;
        int v3 = v2 & 14 | v2 << 3 & 0x1C00;
        int v4 = v3 & 14 ^ 6;
        cmc cmc0 = cmv.a;
        if(clj0.z()) {
            goz0.M(0x635A29CD);
            goz0.x();
            object0 = clj0.f();
        }
        else {
            goz0.M(0x63564970);
            boolean z = v4 > 4 && goz0.X(clj0) || (v3 & 6) == 4;
            object0 = goz0.j();
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
                goz0.P(object1);
                object0 = object1;
            }
            goz0.x();
        }
        goz0.M(0xB7D3F570);
        float f = 0.0f;
        goz0.x();
        Float float0 = (float)(((Boolean)object0).booleanValue() ? ((float)v) : 0.0f);
        boolean z1 = v4 > 4 && goz0.X(clj0) || (v3 & 6) == 4;
        Object object2 = goz0.j();
        if(z1 || object2 == gop.a) {
            gpx gpx0 = new gpx(new cox(clj0), null);
            goz0.P(gpx0);
            object2 = gpx0;
        }
        boolean z2 = ((Boolean)((gui)object2).a()).booleanValue();
        goz0.M(0xB7D3F570);
        if(z2) {
            f = (float)v;
        }
        goz0.x();
        Float float1 = f;
        boolean z3 = v4 > 4 && goz0.X(clj0) || (v3 & 6) == 4;
        Object object3 = goz0.j();
        if(z3 || object3 == gop.a) {
            gpx gpx1 = new gpx(new coy(clj0), null);
            goz0.P(gpx1);
            object3 = gpx1;
        }
        gui gui0 = clz.g(clj0, float0, float1, ((cii)cov0.a(((gui)object3).a(), goz0, Integer.valueOf(0))), cmc0, goz0, v3 & 14 | v3 << 6 & 0x70000);
        int v6 = goz0.Z(this) | goz0.X(gui0);
        Object object4 = goz0.j();
        if(v6 != 0 || object4 == gop.a) {
            object4 = new cow(this, gui0);
            goz0.P(object4);
        }
        gui gui1 = new gpx(((ibth)object4), null);
        goz0.x();
        return gui1;
    }
}

