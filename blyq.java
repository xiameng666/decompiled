public final class blyq {
    public static final bboh a;

    static {
        blyq.a = bnaa.f("PaaskExperimentHelper");
    }

    public static boolean a(bnae bnae0) {
        return blyq.b(bnae0.c);
    }

    public static boolean b(int[] arr_v) {
        return blyq.c(1, arr_v);
    }

    public static boolean c(int v, int[] arr_v) {
        if(arr_v != null && arr_v.length > 0) {
            for(int v1 = 0; v1 < arr_v.length; ++v1) {
                if(v == arr_v[v1]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean d(bnae bnae0) {
        return hsvg.a.b().l() || blyq.c(4, bnae0.c);
    }
}

