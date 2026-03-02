public final class clz {
    public static final ibts a;
    private static final ibnn b;

    static {
        clz.a = new cln();
        clo clo0 = new clo();
        clz.b = ibno.a(ibnp.c, clo0);
    }

    public static final hcu a() {
        return (hcu)clz.b.a();
    }

    public static final clj b(clj clj0, Object object0, Object object1, String s, goz goz0, int v) {
        int v1 = v & 14 ^ 6;
        int v2 = 1;
        boolean z = v1 > 4 && goz0.X(clj0) || (v & 6) == 4;
        Object object2 = goz0.k();
        if(z || object2 == gop.a) {
            object2 = new clj(new cjh(object0), clj0, clj0.b + " > " + s);
            goz0.R(object2);
        }
        if((v1 <= 4 || !goz0.X(clj0)) && (v & 6) != 4) {
            v2 = 0;
        }
        int v3 = goz0.X(((clj)object2)) | v2;
        Object object3 = goz0.k();
        if(v3 != 0 || object3 == gop.a) {
            object3 = new cll(clj0, ((clj)object2));
            goz0.R(object3);
        }
        gqe.c(((clj)object2), ((ibts)object3), goz0);
        if(clj0.z()) {
            ((clj)object2).B(object0, object1);
            return (clj)object2;
        }
        ((clj)object2).w(object1);
        ((clj)object2).r(false);
        return (clj)object2;
    }

    public static final clj c(cma cma0, String s, goz goz0, int v, int v1) {
        clj clj0;
        int v2 = v & 14 ^ 6;
        boolean z = false;
        boolean z1 = v2 > 4 && goz0.X(cma0) || (v & 6) == 4;
        Object object0 = goz0.k();
        if(z1 || object0 == gop.a) {
            hbm hbm0 = hbl.a();
            ibts ibts0 = hbm0 == null ? null : hbm0.i();
            hbm hbm1 = hbl.b(hbm0);
            try {
                if((v1 & 2) != 0) {
                    s = null;
                }
                clj0 = new clj(cma0, null, s);
            }
            finally {
                hbl.d(hbm0, hbm1, ibts0);
            }
            goz0.R(clj0);
            object0 = clj0;
        }
        if((cma0 instanceof cke)) {
            goz0.M(0xAF14D769);
            Object object1 = ((cke)cma0).a();
            Object object2 = ((cke)cma0).b();
            if(v2 > 4 && goz0.X(cma0) || (v & 6) == 4) {
                z = true;
            }
            Object object3 = goz0.k();
            if(z || object3 == gop.a) {
                object3 = new clw(cma0, null);
                goz0.R(object3);
            }
            gqe.e(object1, object2, ((ibtw)object3), goz0);
        }
        else {
            goz0.M(0xAF1BE260);
            ((clj)object0).C(cma0.b(), goz0, 0);
        }
        goz0.A();
        boolean z2 = goz0.X(((clj)object0));
        Object object4 = goz0.k();
        if(z2 || object4 == gop.a) {
            object4 = new clk(((clj)object0));
            goz0.R(object4);
        }
        gqe.c(((clj)object0), ((ibts)object4), goz0);
        return (clj)object0;
    }

    public static final clj d(Object object0, String s, goz goz0, int v, int v1) {
        Object object1 = goz0.k();
        Object object2 = gop.a;
        if(object1 == object2) {
            if((v1 & 2) != 0) {
                s = null;
            }
            clj clj0 = new clj(new cjh(object0), null, s);
            goz0.R(clj0);
            object1 = clj0;
        }
        ((clj)object1).C(object0, goz0, v & 8 | 0x30 | v & 14);
        Object object3 = goz0.k();
        if(object3 == object2) {
            object3 = new clr(((clj)object1));
            goz0.R(object3);
        }
        gqe.c(((clj)object1), ((ibts)object3), goz0);
        return (clj)object1;
    }

    public static final void e(clj clj0, clf clf0, Object object0, Object object1, cii cii0, goz goz0, int v) {
        goz goz1 = goz0.ao(0x33AE021D);
        int v1 = (v & 6) == 0 ? (goz1.X(clj0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.X(clf0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (((v & 0x200) == 0 ? goz1.X(object0) : goz1.Z(object0)) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v1 |= (((v & 0x1000) == 0 ? goz1.X(object1) : goz1.Z(object1)) ? 0x800 : 0x400);
        }
        if((v & 0x6000) == 0) {
            v1 |= (((0x8000 & v) == 0 ? goz1.X(cii0) : goz1.Z(cii0)) ? 0x4000 : 0x2000);
        }
        if(!goz1.ad((v1 & 9363) != 9362, v1 & 1)) {
            goz1.G();
        }
        else if(clj0.z()) {
            clf0.l(object0, object1, cii0);
        }
        else {
            clf0.m(object1, cii0);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new cls(clj0, clf0, object0, object1, cii0, v);
        }
    }

    @ibni
    public static final clj f(cjh cjh0, String s, goz goz0, int v) {
        return clz.c(cjh0, s, goz0, v & 14 | 0x30, 0);
    }

    public static final gui g(clj clj0, Object object0, Object object1, cii cii0, cmc cmc0, goz goz0, int v) {
        clf clf0;
        Object object3;
        int v1 = v & 14 ^ 6;
        int v2 = 0;
        boolean z = v1 > 4 && goz0.X(clj0) || (v & 6) == 4;
        Object object2 = goz0.k();
        if(!z && object2 != gop.a) {
            object3 = object1;
        }
        else {
            hbm hbm0 = hbl.a();
            ibts ibts0 = hbm0 == null ? null : hbm0.i();
            hbm hbm1 = hbl.b(hbm0);
            try {
                object3 = object1;
                clf0 = new clf(clj0, object0, cho.a(cmc0, object1), cmc0);
            }
            finally {
                hbl.d(hbm0, hbm1, ibts0);
            }
            goz0.R(clf0);
            object2 = clf0;
        }
        int v4 = v >> 3 & 8;
        clz.e(clj0, ((clf)object2), object0, object3, cii0, goz0, v4 << 9 | (v & 14 | v4 << 6 | v << 3 & 0x380) | v << 3 & 0x1C00 | 0xE000 & v << 3);
        if(v1 > 4 && goz0.X(clj0) || (v & 6) == 4) {
            v2 = 1;
        }
        int v5 = goz0.X(((clf)object2)) | v2;
        Object object4 = goz0.k();
        if(v5 != 0 || object4 == gop.a) {
            object4 = new clp(clj0, ((clf)object2));
            goz0.R(object4);
        }
        gqe.c(((clf)object2), ((ibts)object4), goz0);
        return (clf)object2;
    }

    public static final clb h(clj clj0, cmc cmc0, goz goz0, int v) {
        int v1 = v & 14 ^ 6;
        int v2 = 0;
        boolean z = v1 > 4 && goz0.X(clj0) || (v & 6) == 4;
        Object object0 = goz0.k();
        if(z || object0 == gop.a) {
            object0 = new clb(clj0, cmc0);
            goz0.R(object0);
        }
        if(v1 > 4 && goz0.X(clj0) || (v & 6) == 4) {
            v2 = 1;
        }
        int v3 = goz0.Z(((clb)object0)) | v2;
        Object object1 = goz0.k();
        if(v3 != 0 || object1 == gop.a) {
            object1 = new clm(clj0, ((clb)object0));
            goz0.R(object1);
        }
        gqe.c(((clb)object0), ((ibts)object1), goz0);
        if(clj0.z()) {
            cla cla0 = ((clb)object0).a();
            if(cla0 != null) {
                Object object2 = cla0.c.a(((clb)object0).a.e().e());
                Object object3 = cla0.c.a(((clb)object0).a.e().f());
                cii cii0 = (cii)cla0.b.a(((clb)object0).a.e());
                cla0.a.l(object2, object3, cii0);
            }
        }
        return (clb)object0;
    }
}

