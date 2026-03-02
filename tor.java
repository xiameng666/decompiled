public final class tor extends tux {
    public static final tvi a;
    private static final tvg e;

    static {
        tor.a = new tvi(0x30, 1);
        tor.e = new tvg(2);
    }

    public tor(tvi tvi0, byte[] arr_b) {
        super(tvi0, arr_b, tor.e);
    }

    public final tnu a() {
        return new tnu(this.k(tnu.a));
    }

    public final tnv b() {
        return new tnv(this.k(tnv.a));
    }

    public final tnw c() {
        return new tnw(this.k(tnw.a));
    }

    public final toa d() {
        return new toa(this.k(toa.a));
    }

    public final tof e() {
        return new tof(this.k(tof.b));
    }

    public final tog f() {
        return new tog(this.k(tog.a));
    }

    public final tol g() {
        try {
            return new tol(this.k(tol.a));
        }
        catch(IllegalArgumentException unused_ex) {
            return null;
        }
    }

    public final too h() {
        return new too(this.k(too.a));
    }

    public final boolean i() {
        byte[] arr_b = new too(this.k(too.a)).r();
        for(int v = 0; v < arr_b.length; ++v) {
            if(arr_b[v] != 0) {
                return false;
            }
        }
        return true;
    }
}

