import java.io.Serializable;

public final class ggxn implements Serializable {
    public double a;
    public double b;

    public ggxn() {
        this(0.0, 0.0);
    }

    public ggxn(double f, double f1) {
        this.a = f;
        this.b = f1;
    }

    public static double a(ggxn ggxn0, ggxn ggxn1) {
        return ggxn0.a * ggxn1.a + ggxn0.b * ggxn1.b;
    }

    public static ggxn b(ggxn ggxn0, ggxn ggxn1) {
        return new ggxn(ggxn0.a - ggxn1.a, ggxn0.b - ggxn1.b);
    }

    final void c(double f, double f1) {
        this.a = f;
        this.b = f1;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof ggxn) ? this.a == ((ggxn)object0).a && this.b == ((ggxn)object0).b : false;
    }

    @Override
    public final int hashCode() {
        long v = Double.doubleToLongBits(Math.abs(this.a)) + 646L;
        long v1 = v + (37L * v + Double.doubleToLongBits(Math.abs(this.b)));
        return (int)(v1 ^ v1 >>> 0x20);
    }

    @Override
    public final String toString() {
        return "(" + this.a + ", " + this.b + ")";
    }
}

