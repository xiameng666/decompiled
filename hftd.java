import java.util.Map.Entry;

final class hftd {
    public static hfth a(Object object0) {
        return ((hfts)object0).s;
    }

    public static hfth b(Object object0) {
        return ((hfts)object0).e();
    }

    public static void c(hfsm hfsm0, Object object0, hftc hftc0, hfth hfth0) {
        hfta hfta0 = (hfta)object0;
        Object object1 = hfsm0.t(hfta0.c.getClass(), hftc0);
        hfth0.l(hfta0.d, object1);
    }

    public static void d(hfsr hfsr0, Map.Entry map$Entry0) {
        hftu hftu0 = (hftu)map$Entry0.getKey();
        switch(hftu0.b.ordinal()) {
            case 0: {
                double f = (double)(((Double)map$Entry0.getValue()));
                hfsr0.c(hftu0.a, f);
                return;
            }
            case 1: {
                float f1 = (float)(((Float)map$Entry0.getValue()));
                hfsr0.g(hftu0.a, f1);
                return;
            }
            case 2: {
                long v = (long)(((Long)map$Entry0.getValue()));
                hfsr0.j(hftu0.a, v);
                return;
            }
            case 3: {
                long v1 = (long)(((Long)map$Entry0.getValue()));
                hfsr0.s(hftu0.a, v1);
                return;
            }
            case 4: {
                int v2 = (int)(((Integer)map$Entry0.getValue()));
                hfsr0.i(hftu0.a, v2);
                return;
            }
            case 5: {
                long v3 = (long)(((Long)map$Entry0.getValue()));
                hfsr0.f(hftu0.a, v3);
                return;
            }
            case 6: {
                int v4 = (int)(((Integer)map$Entry0.getValue()));
                hfsr0.e(hftu0.a, v4);
                return;
            }
            case 7: {
                boolean z = ((Boolean)map$Entry0.getValue()).booleanValue();
                hfsr0.a(hftu0.a, z);
                return;
            }
            case 8: {
                String s = (String)map$Entry0.getValue();
                hfsr0.q(hftu0.a, s);
                return;
            }
            case 9: {
                Object object0 = map$Entry0.getValue();
                Class class0 = map$Entry0.getValue().getClass();
                hfwc hfwc0 = hfvu.a.b(class0);
                hfsr0.h(hftu0.a, object0, hfwc0);
                return;
            }
            case 10: {
                Object object1 = map$Entry0.getValue();
                Class class1 = map$Entry0.getValue().getClass();
                hfwc hfwc1 = hfvu.a.b(class1);
                hfsr0.k(hftu0.a, object1, hfwc1);
                return;
            }
            case 11: {
                ByteString hfsf0 = (ByteString)map$Entry0.getValue();
                hfsr0.b(hftu0.a, hfsf0);
                return;
            }
            case 12: {
                int v5 = (int)(((Integer)map$Entry0.getValue()));
                hfsr0.r(hftu0.a, v5);
                return;
            }
            case 13: {
                int v6 = (int)(((Integer)map$Entry0.getValue()));
                hfsr0.i(hftu0.a, v6);
                return;
            }
            case 14: {
                int v7 = (int)(((Integer)map$Entry0.getValue()));
                hfsr0.m(hftu0.a, v7);
                return;
            }
            case 15: {
                long v8 = (long)(((Long)map$Entry0.getValue()));
                hfsr0.n(hftu0.a, v8);
                return;
            }
            case 16: {
                int v9 = (int)(((Integer)map$Entry0.getValue()));
                hfsr0.o(hftu0.a, v9);
                return;
            }
            case 17: {
                long v10 = (long)(((Long)map$Entry0.getValue()));
                hfsr0.p(hftu0.a, v10);
            }
        }
    }

    public static final void e(Object object0) {
        hftd.a(object0).e();
    }
}

