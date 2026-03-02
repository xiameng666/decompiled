public enum bnxi {
    GAIA_PASSWORD(2),
    LOCK_SCREEN(3);

    public final int c;

    private bnxi(int v1) {
        this.c = v1;
    }

    public static bnxi a(String s) {
        return (bnxi)Enum.valueOf(bnxi.class, s);
    }

    public static gfsx b(Iterable iterable0) {
        if(gggq.x(iterable0)) {
            return gfqx.a;
        }
        Object object0 = iterable0.iterator().next();
        int v = gtam.b(((gtan)object0).f);
        if(v == 0) {
            v = 1;
        }
        gftb.r(gggq.u(iterable0, new bnxh(v)), "Server returned mixed Keychain domain KF types");
        return gfsx.m(bnxi.c(v));
    }

    public static bnxi c(int v) {
        bnxi[] arr_bnxi = bnxi.values();
        int v1 = 0;
        while(v1 < arr_bnxi.length) {
            bnxi bnxi0 = arr_bnxi[v1];
            int v2 = bnxi0.c;
            if(v2 == 0) {
                throw null;
            }
            if(v2 == v) {
                return bnxi0;
            }
            ++v1;
            continue;
        }
        throw new IllegalArgumentException("Unrecognized SecurityDomainKnowledgeFactorType");
    }
}

