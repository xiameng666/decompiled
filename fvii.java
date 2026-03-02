import java.util.Collections;

public final class fvii {
    public static double a(fvhw fvhw0, fvhw fvhw1) {
        fvhv fvhv0 = fvhw0.i(fvhw1);
        return ((double)fvhv0.a) * 0.299792 + fvhv0.b * 0.299792;
    }

    public static int b(int v, int v1, long v2) {
        int v5;
        int v4;
        switch(v) {
            case 2: {
                if(v1 >= 120 && v1 <= 0x9E) {
                    return v1 - 100;
                }
                throw new UnsupportedOperationException(a.f(v1, "Cannot recognize this SBAS PRN: ", "."));
            }
            case 4: {
                int v3 = Long.compare(v2, 1306540818000000000L);
                if(v3 < 0) {
                    v4 = (int)(((Integer)Collections.min(fvee.f.g())));
                    v5 = (int)(((Integer)Collections.max(fvee.f.g())));
                }
                else {
                    v4 = (int)(((Integer)Collections.min(fvee.e.g())));
                    v5 = 50;
                }
                if(v1 < v4 || v1 > v5) {
                    ggeo ggeo0 = v3 >= 0 ? fvee.e : fvee.f;
                    Integer integer0 = v1;
                    if(!ggeo0.containsKey(integer0)) {
                        throw new UnsupportedOperationException(a.f(v1, "Cannot recognize this QZSS PRN: ", "."));
                    }
                    Integer integer1 = (Integer)ggeo0.get(integer0);
                    if(integer1 != null) {
                        return (int)integer1;
                    }
                    throw new UnsupportedOperationException(a.f(v1, "Cannot recognize this QZSS PRN: ", "."));
                }
                return v1;
            }
            default: {
                return v1;
            }
        }
    }

    public static fvel c(int v, int v1, double f, fvdy fvdy0, long v2) {
        try {
            return new fvel(v, fvii.b(v, v1, v2), fven.a(v, f, fvdy0));
        }
        catch(UnsupportedOperationException unsupportedOperationException0) {
            throw new fvgi(unsupportedOperationException0);
        }
    }

    public static fvhw d(int v, long v1, long v2) {
        fvhw fvhw1;
        fvhw fvhw0 = fvhw.n(v2);
        switch(v) {
            case 3: {
                fvht fvht0 = (fvht)fvhw0.t().a;
                try {
                    long v3 = v1 % 3600000000000000L % 60000000000000L;
                    try {
                        fvhs fvhs0 = new fvhs();
                        fvhs0.a = fvht0.a;
                        fvhs0.e(fvht0.b);
                        fvhs0.b(fvht0.c);
                        fvhs0.c(((int)(v1 / 3600000000000000L)));
                        fvhs0.d(((int)(v1 % 3600000000000000L / 60000000000000L)));
                        fvhs0.g(((int)(v3 / 1000000000000L)));
                        fvhs0.f(v3 % 1000000000000L);
                        fvhw1 = fvhw.l(fvhw.k(fvhs0.a()).r(10800000000000L).e());
                        break;
                    }
                    catch(IllegalArgumentException illegalArgumentException0) {
                        throw new fvgi(illegalArgumentException0);
                    }
                }
                catch(fvgi unused_ex) {
                    return null;
                }
            }
            case 1: 
            case 2: 
            case 4: {
                fvhw1 = new fvhw(fvhw0.a, v1);
                break;
            }
            case 5: {
                fvhw1 = fvhw.j(fvhw0.g().a, v1);
                break;
            }
            case 6: {
                fvhw1 = fvhw.m(fvhw0.h().a, v1);
                break;
            }
            default: {
                return null;
            }
        }
        switch(v) {
            case 3: {
                return fvhw1.b(fvhw0) <= 43200000000000L ? fvhw1 : fvhw1.r(86400000000000L);
            }
            case 1: 
            case 2: 
            case 4: 
            case 5: 
            case 6: {
                return fvhw1.b(fvhw0) <= 302400000000000L ? fvhw1 : fvhw1.r(604800000000000L);
            }
            default: {
                return fvhw1;
            }
        }
    }
}

