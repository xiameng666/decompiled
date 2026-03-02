import java.util.Set;

public final class ftrp {
    public static final Set a;
    private static final Set b;

    static {
        ftrp.a = ibqg.b(hkua.b);
        ftrp.b = ibqg.c(new hkua[]{hkua.c, hkua.d, hkua.e, hkua.f});
    }

    public static final hktw a(hknp hknp0) {
        hktw hktw0;
        ibuq.f(hknp0, "coreTransaction");
        if((hknl.b(hknp0.q) == null ? hknl.i : hknl.b(hknp0.q)) != hknl.b && (hknl.b(hknp0.q) == null ? hknl.i : hknl.b(hknp0.q)) != hknl.d) {
            switch((hknp0.D == null ? hkno.a : hknp0.D).f) {
                case 0: {
                    hktw0 = hktw.a;
                    break;
                }
                case 1: {
                    hktw0 = hktw.b;
                    break;
                }
                case 2: {
                    hktw0 = hktw.c;
                    break;
                }
                default: {
                    hktw0 = null;
                }
            }
            if(hktw0 == null) {
                hktw0 = hktw.d;
            }
            ibuq.e(hktw0, "getIncompleteJourneyStatus(...)");
            return hktw0;
        }
        return hktw.a;
    }

    public static final hkua b(hknp hknp0) {
        ibuq.f(hknp0, "coreTransaction");
        hfuo hfuo0 = (hknp0.v == null ? hknn.a : hknp0.v).b;
        ibuq.e(hfuo0, "getTapsList(...)");
        hkoj hkoj0 = (hkoj)ibpo.T(hfuo0);
        if(hkoj0 != null) {
            hkua hkua0 = hkua.b(hkoj0.h) == null ? hkua.h : hkua.b(hkoj0.h);
            return hkua0 == null ? hkua.a : hkua0;
        }
        return hkua.a;
    }

    public static final String c(hknp hknp0) {
        ibuq.f(hknp0, "coreTransaction");
        hfuo hfuo0 = (hknp0.v == null ? hknn.a : hknp0.v).b;
        ibuq.e(hfuo0, "getTapsList(...)");
        hkoj hkoj0 = (hkoj)ibpo.T(hfuo0);
        if(hkoj0 != null) {
            hktx hktx0 = hkoj0.g == null ? hktx.a : hkoj0.g;
            if(hktx0 != null) {
                hkun hkun0 = hktx0.b == null ? hkun.a : hktx0.b;
                if(hkun0 != null) {
                    return hkun0.b == null ? "" : hkun0.b;
                }
            }
        }
        return "";
    }

    public static final boolean d(hknp hknp0) {
        ibuq.f(hknp0, "coreTransaction");
        return hkum.a((hknp0.D == null ? hkno.a : hknp0.D).c) == 3;
    }

    public static final boolean e(hknp hknp0) {
        ibuq.f(hknp0, "coreTransaction");
        return hkum.a((hknp0.D == null ? hkno.a : hknp0.D).c) == 4;
    }

    public static final boolean f(hkua hkua0) {
        return ibpo.aB(ftrp.b, hkua0);
    }

    public static final boolean g(hknp hknp0) {
        ibuq.f(hknp0, "coreTransaction");
        return hkum.a((hknp0.D == null ? hkno.a : hknp0.D).c) != 2;
    }

    public static final boolean h(hknp hknp0) {
        ibuq.f(hknp0, "coreTransaction");
        hkno hkno0 = hknp0.D == null ? hkno.a : hknp0.D;
        return fscd.k((hkno0.e == null ? hjin.a : hkno0.e)) ? false : (hknl.b(hknp0.q) == null ? hknl.i : hknl.b(hknp0.q)) == hknl.c;
    }

    public static final boolean i(hknp hknp0) {
        ibuq.f(hknp0, "coreTransaction");
        return ftrp.a(hknp0) != hktw.a;
    }
}

