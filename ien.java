public final class ien {
    public static final hfb a(gwq gwq0) {
        if(gwq0 != null) {
            return gwq0.b == 0 ? null : ((hfb)gwq0.c(gwq0.b - 1));
        }
        return null;
    }

    public static final hzk b(iem iem0) {
        if(!iem0.I().B) {
            hxt.d("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        hzk hzk0 = ien.e(iem0, 2);
        if(!hzk0.t()) {
            hxt.d("LayoutCoordinates is not attached.");
        }
        return hzk0;
    }

    public static final ifk c(hfb hfb0) {
        if((hfb0.s & 2) != 0) {
            if((hfb0 instanceof ifk)) {
                return (ifk)hfb0;
            }
            if((hfb0 instanceof iep)) {
                for(hfb hfb1 = ((iep)hfb0).D; hfb1 != null; hfb1 = (hfb1 instanceof iep) && (hfb1.s & 2) != 0 ? ((iep)hfb1).D : hfb1.v) {
                    if((hfb1 instanceof ifk)) {
                        return (ifk)hfb1;
                    }
                }
            }
        }
        return null;
    }

    public static final ify d(iem iem0) {
        ihy ihy0 = iem0.I().x;
        if(ihy0 != null) {
            return ihy0.t;
        }
        hxt.b("Cannot obtain node coordinator. Is the Modifier.Node attached?");
        throw new ibnm();
    }

    public static final ihy e(iem iem0, int v) {
        ihy ihy0 = iem0.I().x;
        ibuq.c(ihy0);
        if(ihy0.B() == iem0 && iia.h(v)) {
            ihy ihy1 = ihy0.w;
            ibuq.c(ihy1);
            return ihy1;
        }
        return ihy0;
    }

    public static final iio f(iem iem0) {
        iio iio0 = ien.d(iem0).j;
        if(iio0 != null) {
            return iio0;
        }
        hxt.b("This node does not have an owner.");
        throw new ibnm();
    }

    public static final jks g(iem iem0) {
        return ien.d(iem0).q;
    }

    public static final jlm h(iem iem0) {
        return ien.d(iem0).r;
    }

    public static final void i(iem iem0) {
        ify ify0 = ien.d(iem0);
        if(!ify0.o) {
            hfv hfv0 = ((ili)igc.a(ify0)).ac;
            if(hfv0 != null) {
                int v = ify0.c;
                hfp hfp0 = new hfp(hfv0, ify0);
                hfv0.c.a.b(v, hfp0);
            }
        }
    }

    public static final void j(gwq gwq0, hfb hfb0) {
        gwq gwq1 = ien.d(hfb0).k();
        int v = gwq1.b - 1;
        Object[] arr_object = gwq1.a;
        if(v < arr_object.length) {
            while(v >= 0) {
                gwq0.n(((ify)arr_object[v]).u.f);
                --v;
            }
        }
    }

    public static final hkm k(iem iem0) {
        return ((ili)ien.f(iem0)).ab;
    }
}

