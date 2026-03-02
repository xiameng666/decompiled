public final class ehxu {
    public static final gui a(clj clj0, goz goz0, int v) {
        Object object6;
        double f1;
        Object object5;
        ibuq.f(clj0, "uiStateTransition");
        goz0.M(0xF31E20A2);
        ckh ckh0 = chm.b(0.0f, 50.0f, null, 5);
        goz0.M(2018722421);
        goz0.M(0x6E3C21FE);
        Object object0 = goz0.j();
        Object object1 = gop.a;
        if(object0 == object1) {
            object0 = new ehxp();
            goz0.P(object0);
        }
        goz0.x();
        gtl gtl0 = (gtl)had.c(new Object[0], ((ibth)object0), goz0, 0x30);
        Object object2 = clj0.f();
        Object object3 = clj0.g();
        goz0.M(-1633490746);
        boolean z = true;
        int v1 = (((v & 14 ^ 6) <= 4 || !goz0.X(clj0)) && (v & 6) != 4 ? 0 : 1) | goz0.X(gtl0);
        Object object4 = goz0.j();
        if(v1 != 0 || object4 == object1) {
            object4 = new ehxt(clj0, gtl0, null);
            goz0.P(object4);
        }
        goz0.x();
        gqe.e(object2, object3, ((ibtw)object4), goz0);
        goz0.x();
        ehxs ehxs0 = new ehxs(ckh0);
        int v2 = (v & 14 | 0x180) & 14 | 0xC00;
        int v3 = v2 & 14 ^ 6;
        cmc cmc0 = cmv.a;
        if(clj0.z()) {
            goz0.M(0x635A29CD);
            goz0.x();
            object5 = clj0.f();
        }
        else {
            goz0.M(0x63564970);
            boolean z1 = v3 > 4 && goz0.X(clj0) || (v2 & 6) == 4;
            object5 = goz0.j();
            if(z1 || object5 == object1) {
                hbm hbm0 = hbl.a();
                ibts ibts0 = hbm0 == null ? null : hbm0.i();
                hbm hbm1 = hbl.b(hbm0);
                try {
                    object6 = clj0.f();
                }
                finally {
                    hbl.d(hbm0, hbm1, ibts0);
                }
                goz0.P(object6);
                object5 = object6;
            }
            goz0.x();
        }
        goz0.M(0x742F6B3E);
        double f = 0.0;
        if(eiav.b(((ehwv)object5))) {
            f1 = 0.0;
        }
        else {
            Double double0 = (double)0.0;
            ((ehwv)object5).f.f(double0);
            f1 = double0.doubleValue();
        }
        int v5 = ehxu.b(gtl0);
        goz0.x();
        Float float0 = (float)(-((float)Math.toDegrees(((double)(v5 + v5)) * 3.141593 + f1)));
        boolean z2 = v3 > 4 && goz0.X(clj0) || (v2 & 6) == 4;
        Object object7 = goz0.j();
        if(z2 || object7 == gop.a) {
            object7 = new gpx(new ehxq(clj0), null);
            goz0.P(object7);
        }
        ehwv ehwv0 = (ehwv)((gui)object7).a();
        goz0.M(0x742F6B3E);
        if(!eiav.b(ehwv0)) {
            Double double1 = (double)0.0;
            ehwv0.f.f(double1);
            f = double1.doubleValue();
        }
        int v6 = ehxu.b(gtl0);
        goz0.x();
        Float float1 = (float)(-((float)Math.toDegrees(((double)(v6 + v6)) * 3.141593 + f)));
        if((v3 <= 4 || !goz0.X(clj0)) && (v2 & 6) != 4) {
            z = false;
        }
        Object object8 = goz0.j();
        if(z || object8 == gop.a) {
            gpx gpx0 = new gpx(new ehxr(clj0), null);
            goz0.P(gpx0);
            object8 = gpx0;
        }
        gui gui0 = clz.g(clj0, float0, float1, ((cii)ehxs0.a(((gui)object8).a(), goz0, Integer.valueOf(0))), cmc0, goz0, v2 & 14 | 0x30000);
        goz0.x();
        return gui0;
    }

    private static final int b(gui gui0) {
        return ((Number)gui0.a()).intValue();
    }
}

