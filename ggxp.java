import java.io.Serializable;

public final class ggxp implements ggxs, Serializable {
    public static final ggxp a;
    public static final ggxp b;
    public final double c;

    static {
        ggxp.a = new ggxp(Infinity);
        ggxp.b = new ggxp(0.0);
    }

    public ggxp() {
        this(0.0);
    }

    public ggxp(double f) {
        this.c = f;
    }

    public final double a() {
        return this.c * 57.29578;
    }

    @Deprecated
    public final double b() {
        return this.c * 6367000.0;
    }

    public final int c() {
        return glwy.a(Math.round(this.a() * 10000000.0));
    }

    @Override
    public final int compareTo(Object object0) {
        double f = ((ggxp)object0).c;
        double f1 = this.c;
        if((f1 < f)) {
            return -1;
        }
        return f1 > f ? 1 : 0;
    }

    public static ggxp d(double f) {
        return new ggxp(f * 0.017453);
    }

    public static ggxp e(int v) {
        return ggxp.d(((double)v) * 1.000000E-07);
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof ggxp) && this.c == ((ggxp)object0).c;
    }

    @Override  // ggxs
    public final boolean f() {
        throw null;
    }

    @Override
    public final int hashCode() {
        long v = Double.doubleToLongBits(this.c);
        return (int)(v ^ v >>> 0x20);
    }

    @Override
    public final String toString() {
        return this.a() + "d";
    }
}

