public final class fvix {
    public final fveo a;
    public float b;
    public float c;
    public float d;
    public float e;
    public int f;
    public final float g;
    public double h;
    public boolean i;
    public fvgr j;
    public double k;

    public fvix(int v, int v1, float f) {
        this.h = 149.896225;
        this.i = false;
        this.k = NaN;
        gftb.b(((boolean)(Float.isNaN(0.0f) ^ 1)), "Inter-Signal CN0 Bias (ISCB) should not be NaN.");
        this.a = new fveo(v, v1, ((double)f));
        this.b = f;
        this.d = NaNf;
        this.e = NaNf;
        this.c = NaNf;
        this.g = 0.0f;
    }

    public fvix(int v, int v1, float f, float f1) {
        this.h = 149.896225;
        this.i = false;
        this.k = NaN;
        gftb.b(((boolean)(Float.isNaN(f1) ^ 1)), "Inter-Signal CN0 Bias (ISCB) should not be NaN.");
        this.a = new fveo(v, v1, ((double)f));
        this.b = f;
        this.f = 0;
        this.g = f1;
    }

    public final int a() {
        return this.a.b();
    }

    public final int b() {
        return this.a.b;
    }

    public static boolean c(float f, float f1) {
        return f >= 0.0f && f <= 360.0f && f1 >= -90.0f && f1 <= 90.0f;
    }

    final boolean d() {
        return this.f == 0;
    }

    public final boolean e() {
        return this.f() && this.c > 0.0f;
    }

    public final boolean f() {
        return this.d > 10.0f && fvix.c(this.e, this.d);
    }
}

