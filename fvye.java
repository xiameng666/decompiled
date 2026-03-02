import j..util.Objects;

public final class fvye {
    public final long a;
    public final long b;
    public long c;
    public fvyd d;
    public fvyd e;
    public final fvyf f;

    public fvye(fvyf fvyf0, long v, long v1) {
        Objects.requireNonNull(fvyf0);
        this.f = fvyf0;
        super();
        this.b = v;
        this.a = v1;
    }

    public final void a() {
        fvyd fvyd0 = this.d;
        if(fvyd0 != null) {
            fvyd fvyd1 = this.e;
            if(fvyd0.a()) {
                fvye fvye0 = fvyd0.d;
                int v = fvyd0.a;
                long v1 = fvye0.a;
                if(v >= 0) {
                    int v2 = fvyf.a(v1);
                    if(v2 != -1) {
                        fvye0.f.e[v2][v].c(fvyd0.b.b());
                    }
                }
                double f = fvyd0.b.a();
                if(fvyd1 != null && v - fvyd1.a == 1 && fvyd1.a() && v >= 0) {
                    int v3 = fvyf.a(v1);
                    if(v3 != -1) {
                        fvye0.f.f[v3][v].c(Math.abs(f - fvye0.e.b.a()));
                    }
                }
            }
        }
    }
}

