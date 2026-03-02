public final class asgb {
    public int a;
    public int b;
    public final int c;
    public int d;
    public int e;
    public float f;
    private static final baun g;
    private final int h;
    private final int i;
    private final float j;

    static {
        asgb.g = aqql.a("BackUpNowProgressCalculator");
    }

    public asgb() {
        int v = 0;
        this.b = 0;
        this.e = -1;
        int v1 = (int)hqil.a.j().c();
        this.c = v1;
        int v2 = (int)hqil.a.j().i();
        if(v2 >= 0 && v2 <= 100) {
            v = v2;
        }
        else {
            asgb.g.f("Custom backup part percentage is invalid, setting to 0.", new Object[0]);
        }
        int v3 = v * v1 / 100;
        this.i = v3;
        this.h = v1 - v3;
        this.j = 1.0f / ((float)v1);
    }

    public final int a() {
        return this.h * this.b / this.a;
    }

    public final int b(float f) {
        boolean z = true;
        batl.n(this.e >= 0, "Invalid custom backups package number: %d", new Object[]{((int)this.e)});
        if(Float.compare(f, 0.0f) < 0 || f > 1.0f) {
            z = false;
        }
        batl.d(z, "Invalid progress reported, %s", new Object[]{Float.toString(f)});
        if(f != 1.0f && (f - this.f < this.j)) {
            asgb.g.j("Ignoring small progress update", new Object[0]);
            return -1;
        }
        this.f = f;
        int v = this.i / this.d;
        return this.h + this.e * v + ((int)(f * ((float)v)));
    }

    public final void c(int v) {
        batl.d(v > 0, "Total number of custom packages must be positive, value provided: %d", new Object[]{v});
        this.d = v;
    }
}

