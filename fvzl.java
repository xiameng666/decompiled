public final class fvzl {
    public static float a(double f) {
        double f1 = Math.abs(f);
        if((f1 > 10.0)) {
            return f < 0.0 ? -10.0f : 10.0f;
        }
        if((f1 > 1.0)) {
            return (float)Math.round(f);
        }
        return f1 > 0.1 ? ((float)Math.round(f * 10.0)) / 10.0f : ((float)Math.round(f * 100.0)) / 100.0f;
    }

    public static float b(double f) {
        return (float)Math.pow(0.75, Math.round(Math.log(f) / Math.log(0.75)));
    }

    public static float c(icvk icvk0) {
        return fvzl.a(icvk0.b);
    }

    public static float d(icvk icvk0) {
        return Math.max(-10.0f, Math.min(((float)Math.pow(0.75, Math.round(Math.log(icvk0.c) / Math.log(0.75)))), 20.0f));
    }

    public static boolean e(huqn_elevationGraphOptimizerFlags huqn0, double f, icvl icvl0, long v) {
        return icvl0 == null || f > fvzm.b(huqn0, v - icvl0.b, icvl0.c, ((double)icvl0.e));
    }
}

