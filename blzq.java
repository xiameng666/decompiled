public final class blzq {
    public static long a(hhrs hhrs0, String s) {
        batl.s(hhrs0);
        try {
            return hhrs0.l().a;
        }
        catch(hhrr hhrr0) {
            throw new blzy(s, hhrr0);
        }
    }

    public static long b(hhrs hhrs0, long v, String s) {
        long v1 = blzq.a(hhrs0, s);
        if(v1 >= v) {
            return v1;
        }
        throw new blzy(String.format("Value %d breached lessThanLimit of %d. Error: %s", v1, v, s));
    }

    public static gged_interceptors c(hhrs hhrs0, String s) {
        batl.s(hhrs0);
        try {
            return hhrs0.f().a;
        }
        catch(hhrr hhrr0) {
            throw new blzy(s, hhrr0);
        }
    }

    public static ggfz d(hhrs hhrs0, String s) {
        batl.s(hhrs0);
        try {
            return hhrs0.m().a;
        }
        catch(hhrr hhrr0) {
            throw new blzy(s, hhrr0);
        }
    }

    public static String e(hhrs hhrs0, String s) {
        batl.s(hhrs0);
        try {
            return hhrs0.p().a;
        }
        catch(hhrr hhrr0) {
            throw new blzy(s, hhrr0);
        }
    }

    public static boolean f(hhrs hhrs0, String s) {
        batl.s(hhrs0);
        try {
            return hhrs0.i().a;
        }
        catch(hhrr hhrr0) {
            throw new blzy(s, hhrr0);
        }
    }

    public static byte[] g(hhrs hhrs0, String s) {
        batl.s(hhrs0);
        try {
            return hhrs0.j().a.toByteArray();
        }
        catch(hhrr hhrr0) {
            throw new blzy(s, hhrr0);
        }
    }
}

