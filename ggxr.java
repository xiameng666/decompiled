import java.io.Serializable;

public final class ggxr implements ggxs, Serializable {
    public static final ggxr a;
    public static final ggxr b;
    public static final ggxr c;
    public static final ggxr d;
    public static final ggxr e;
    public final double f;

    static {
        ggxr.a = new ggxr(0.0);
        ggxr.b = new ggxr(2.0);
        ggxr.c = new ggxr(4.0);
        ggxr.d = new ggxr(Infinity);
        ggxr.e = new ggxr(-1.0);
    }

    public ggxr(double f) {
        this.f = f;
        if(this.l()) {
            return;
        }
        throw new IllegalArgumentException(a.E(f, "Invalid length2: "));
    }

    public ggxr(ghae ghae0, ghae ghae1) {
        this(Math.min(4.0, ghae0.d(ghae1)));
        gftb.checkTrue(ggxv.g(ghae0));
        gftb.checkTrue(ggxv.g(ghae1));
        gftb.checkTrue(this.l());
    }

    public static double a(ggxr ggxr0) {
        gftb.checkTrue(((boolean)(ggxr0.k() ^ 1)));
        return ggxr0.f * (1.0 - 0.25 * ggxr0.f);
    }

    public final int b(ggxr ggxr0) {
        return Double.compare(this.f, ggxr0.f);
    }

    public final ggxp c() {
        if(this.j()) {
            return new ggxp(-1.0);
        }
        if(this.i()) {
            return ggxp.a;
        }
        double f = Math.asin(Math.sqrt(this.f) * 0.5);
        return new ggxp(f + f);
    }

    @Override
    public final int compareTo(Object object0) {
        return this.b(((ggxr)object0));
    }

    public static ggxr d(ggxr ggxr0, ggxr ggxr1) {
        gftb.checkTrue(((boolean)(ggxr0.k() ^ 1)));
        gftb.checkTrue(((boolean)(ggxr1.k() ^ 1)));
        double f = ggxr0.f;
        double f1 = ggxr1.f;
        if(f1 == 0.0) {
            return ggxr0;
        }
        if((f + f1 >= 4.0)) {
            return ggxr.c;
        }
        double f2 = (1.0 - f1 * 0.25) * f;
        double f3 = f1 * (1.0 - f * 0.25);
        double f4 = Math.sqrt(f2 * f3);
        return new ggxr(Math.min(4.0, f2 + f3 + (f4 + f4)));
    }

    public static ggxr e(double f) {
        return new ggxr(Math.min(4.0, f));
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof ggxr) && this.f == ((ggxr)object0).f;
    }

    @Override  // ggxs
    public final boolean f() {
        return this.f == 0.0;
    }

    public static ggxr g(ggxp ggxp0) {
        double f = ggxp0.c;
        if((f < 0.0)) {
            return ggxr.e;
        }
        if(ggxp0.equals(ggxp.a)) {
            return ggxr.d;
        }
        double f1 = Math.sin(Math.min(3.141593, f) * 0.5);
        double f2 = f1 + f1;
        return new ggxr(f2 * f2);
    }

    public final ggxr h(double f) {
        return this.k() ? this : ggxr.e(Math.max(0.0, Math.min(4.0, this.f + f)));
    }

    @Override
    public final int hashCode() {
        double f = this.f;
        if(f == 0.0) {
            return 0;
        }
        long v = Double.doubleToLongBits(f);
        return (int)(v ^ v >>> 0x20);
    }

    public final boolean i() {
        return this.f == Infinity;
    }

    public final boolean j() {
        return this.f < 0.0;
    }

    public final boolean k() {
        return this.j() || this.i();
    }

    public final boolean l() {
        return this.f >= 0.0 && this.f <= 4.0 || this.j() || this.i();
    }

    @Override
    public final String toString() {
        double f = this.f;
        if(f == ggxr.e.f) {
            return "NEGATIVE";
        }
        if(f == ggxr.a.f) {
            return "ZERO";
        }
        if(f == ggxr.c.f) {
            return "STRAIGHT";
        }
        return f == ggxr.d.f ? "INFINITY" : this.c().toString();
    }
}

