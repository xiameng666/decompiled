import j..util.Objects;
import java.util.Locale;

public final class fvgr {
    public final double a;
    public final double b;
    public final double c;

    public fvgr(double f, double f1, double f2) {
        this.a = f;
        this.b = f1;
        this.c = f2;
    }

    public final double a(fvgr fvgr0) {
        return this.a * fvgr0.a + this.b * fvgr0.b + this.c * fvgr0.c;
    }

    public final double b(fvgr fvgr0) {
        gftb.b(fvgr0 != null, "Invalid null EcefVector \"other\" argument.");
        return Math.sqrt(Math.pow(this.a - fvgr0.a, 2.0) + Math.pow(this.b - fvgr0.b, 2.0) + Math.pow(this.c - fvgr0.c, 2.0));
    }

    public final boolean c() {
        return Double.isNaN(this.a) || Double.isNaN(this.b) || Double.isNaN(this.c);
    }

    public final double[] d() {
        return new double[]{this.a, this.b, this.c};
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof fvgr) && this.a == ((fvgr)object0).a && this.b == ((fvgr)object0).b && this.c == ((fvgr)object0).c;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{((double)this.a), ((double)this.b), ((double)this.c)});
    }

    @Override
    public final String toString() {
        return String.format(Locale.US, "%.3f,%.3f,%.3f", ((double)this.a), ((double)this.b), ((double)this.c));
    }
}

