public final class fvia {
    public final fvif a;

    public fvia() {
        this.a = new fvif();
    }

    public static double a(fvhb fvhb0) {
        return ((double)(fvhb0.a.d * 3600 + fvhb0.a.e * 60 + fvhb0.a.f)) + ((double)fvhb0.a.g) * 1.000000E-12;
    }

    public static final double b(fvhb fvhb0, fvhw fvhw0) {
        Long long0 = (Long)fvhw0.t().b;
        gftb.check(long0);
        return -(fvhb0.l - fvhb0.m * fvih.c(((double)(((long)long0))) * 1.000000E-12 - (fvia.a(fvhb0) + 10800.0), 86400.0, 2)) * 299792458.0;
    }
}

