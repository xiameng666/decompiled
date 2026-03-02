public final class flcm {
    public gfsx a;
    private static flcm b;

    private flcm() {
        this.a = gfqx.a;
    }

    public static flcm a() {
        flcm flcm1;
        synchronized(flcm.class) {
            flcm flcm0 = flcm.b;
            if(flcm0 != null) {
                return flcm0;
            }
            flcm1 = new flcm();
            flcm.b = flcm1;
        }
        return flcm1;
    }

    public final boolean b() {
        boolean z = iaea.s();
        this.e();
        return z;
    }

    public final void c() {
        this.e();
    }

    public final void d() {
        this.e();
    }

    private final void e() {
        if(!this.a.i()) {
            return;
        }
        fiel fiel0 = (fiel)this.a.d();
    }
}

