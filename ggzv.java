import java.io.Serializable;

public final class ggzv implements Serializable {
    public final double a;
    public final double b;

    public ggzv() {
        this(0.0, 0.0);
    }

    public ggzv(double f, double f1) {
        this.a = f;
        this.b = f1;
    }

    public ggzv(ggxp ggxp0, ggxp ggxp1) {
        this(ggxp0.c, ggxp1.c);
    }

    public ggzv(ghae ghae0) {
        this(Math.atan2(ghae0.j + 0.0, Math.sqrt(ghae0.h * ghae0.h + ghae0.i * ghae0.i)), Math.atan2(ghae0.i + 0.0, ghae0.h + 0.0));
    }

    @Deprecated
    public final double a(ggzv ggzv0) {
        return this.d(ggzv0).b();
    }

    public final double b() {
        return this.a * 57.29578;
    }

    public final double c() {
        return this.b * 57.29578;
    }

    public final ggxp d(ggzv ggzv0) {
        double f = Math.sin((ggzv0.a - this.a) * 0.5);
        double f1 = Math.sin((ggzv0.b - this.b) * 0.5);
        double f2 = Math.asin(Math.sqrt(Math.min(1.0, f * f + f1 * f1 * Math.cos(this.a) * Math.cos(ggzv0.a))));
        return new ggxp(f2 + f2);
    }

    public final ggxp e() {
        return new ggxp(this.a);
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof ggzv) && this.a == ((ggzv)object0).a && this.b == ((ggzv)object0).b;
    }

    public static ggxp f(ghae ghae0) {
        return new ggxp(Math.atan2(ghae0.j + 0.0, Math.sqrt(ghae0.h * ghae0.h + ghae0.i * ghae0.i)));
    }

    public final ggxp g() {
        return new ggxp(this.b);
    }

    public static ggxp h(ghae ghae0) {
        return new ggxp(Math.atan2(ghae0.i + 0.0, ghae0.h + 0.0));
    }

    @Override
    public final int hashCode() {
        long v = Double.doubleToLongBits(this.a) + 646L;
        long v1 = v + (37L * v + Double.doubleToLongBits(this.b));
        return (int)(v1 ^ v1 >>> 0x20);
    }

    public static ggzv i(double f, double f1) {
        return new ggzv(ggxp.d(f), ggxp.d(f1));
    }

    public static ggzv j(int v, int v1) {
        return new ggzv(ggxp.e(v), ggxp.e(v1));
    }

    public final ghae k() {
        double f = Math.cos(this.a);
        return new ghae(Math.cos(this.b) * f, Math.sin(this.b) * f, Math.sin(this.a));
    }

    @Override
    public final String toString() {
        return "(" + this.a + ", " + this.b + ")";
    }
}

