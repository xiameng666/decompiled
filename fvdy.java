public enum fvdy {
    A,
    B,
    C,
    D,
    E,
    I,
    L,
    M,
    N,
    P,
    Q,
    S,
    W,
    X,
    Y,
    Z,
    UNKNOWN;

    @Deprecated
    public static fvdy a(int v, double f) {
        switch(v) {
            case 1: {
                Double double0 = f;
                if(fvec.c.s(double0)) {
                    return fvdy.k;
                }
                return fvec.b.s(double0) ? fvdy.q : fvdy.c;
            }
            case 2: {
                return fveg.b.s(Double.valueOf(f)) ? fvdy.q : fvdy.c;
            }
            case 3: {
                return fveb.e.s(Double.valueOf(f)) ? fvdy.f : fvdy.c;
            }
            case 4: {
                Double double1 = f;
                if(!fvee.a.s(double1) && f != 0.0) {
                    return fvee.c.s(double1) ? fvdy.k : fvdy.l;
                }
                return fvdy.c;
            }
            case 5: {
                Double double2 = f;
                if(!fvdz.a.s(double2)) {
                    if(f == 0.0) {
                        return fvdy.f;
                    }
                    if(fven.b(1575420000.0, f)) {
                        return fvdy.d;
                    }
                    return fvdz.e.s(double2) ? fvdy.f : fvdy.j;
                }
                return fvdy.f;
            }
            case 6: {
                Double double3 = f;
                if(!fvea.a.s(double3) && f != 0.0) {
                    return fvea.e.s(double3) ? fvdy.b : fvdy.k;
                }
                return fvdy.c;
            }
            case 7: {
                return fved.b.s(Double.valueOf(f)) ? fvdy.c : fvdy.q;
            }
            default: {
                return fvdy.q;
            }
        }
    }

    public static fvdy b(String s) {
        return (fvdy)Enum.valueOf(fvdy.class, s);
    }
}

