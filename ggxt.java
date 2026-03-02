import java.io.Serializable;

public final class ggxt implements Serializable, Cloneable {
    public double a;
    public double b;

    public ggxt() {
        this(3.141593, -3.141593);
    }

    public ggxt(double f, double f1) {
        this.g(f, f1, false);
    }

    public ggxt(ggxt ggxt0) {
        this(ggxt0.a, ggxt0.b);
    }

    public final double a() {
        double f = this.b - this.a;
        if((f >= 0.0)) {
            return f;
        }
        return f + 6.283185 > 0.0 ? f + 6.283185 : -1.0;
    }

    public static double b(double f, double f1) {
        double f2 = f1 - f;
        return f2 >= 0.0 ? f2 : f1 + 3.141593 - (f - 3.141593);
    }

    public static ggxt c() {
        ggxt ggxt0 = new ggxt();
        ggxt0.h();
        return ggxt0;
    }

    public static ggxt d(double f, double f1) {
        ggxt ggxt0 = new ggxt();
        ggxt0.f(f, f1);
        return ggxt0;
    }

    public static ggxt e() {
        ggxt ggxt0 = new ggxt();
        ggxt0.i();
        return ggxt0;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof ggxt) && this.a == ((ggxt)object0).a && this.b == ((ggxt)object0).b;
    }

    final void f(double f, double f1) {
        if(Double.compare(f, -3.141593) == 0) {
            f = 3.141593;
        }
        if(f1 == -3.141593) {
            f1 = 3.141593;
        }
        int v = Double.compare(ggxt.b(f, f1), 3.141593);
        this.a = v > 0 ? f1 : f;
        if(v <= 0) {
            f = f1;
        }
        this.b = f;
    }

    final void g(double f, double f1, boolean z) {
        this.a = f;
        this.b = f1;
        if(!z) {
            if(Double.compare(f, -3.141593) == 0 && f1 != 3.141593) {
                this.a = 3.141593;
            }
            if(f1 == -3.141593 && f != 3.141593) {
                this.b = 3.141593;
            }
        }
    }

    final void h() {
        this.a = 3.141593;
        this.b = -3.141593;
    }

    @Override
    public final int hashCode() {
        long v = (Double.doubleToLongBits(this.a) + 629L) * 37L + Double.doubleToLongBits(this.b);
        return (int)(v ^ v >>> 0x20);
    }

    final void i() {
        this.a = -3.141593;
        this.b = 3.141593;
    }

    final void j(ggxt ggxt0) {
        if(!ggxt0.m()) {
            double f = ggxt0.a;
            if(this.l(f)) {
                double f1 = ggxt0.b;
                if(!this.l(f1)) {
                    goto label_8;
                }
                if(!this.k(ggxt0)) {
                    this.i();
                    return;
                label_8:
                    this.b = f1;
                }
            }
            else {
                double f2 = ggxt0.b;
                if(this.l(f2)) {
                    this.a = f;
                    return;
                }
                if(!this.m()) {
                    double f3 = this.a;
                    if(!ggxt0.l(f3)) {
                        if((ggxt.b(f2, f3) < ggxt.b(this.b, f))) {
                            this.a = f;
                            return;
                        }
                        this.b = f2;
                        return;
                    }
                }
                this.a = f;
                this.b = f2;
            }
        }
    }

    public final boolean k(ggxt ggxt0) {
        if(this.o()) {
            return ggxt0.o() ? ggxt0.a >= this.a && ggxt0.b <= this.b : (ggxt0.a >= this.a || ggxt0.b <= this.b) && !this.m();
        }
        return ggxt0.o() ? this.n() || ggxt0.m() : ggxt0.a >= this.a && ggxt0.b <= this.b;
    }

    public final boolean l(double f) {
        return this.o() ? (f >= this.a || f <= this.b) && !this.m() : f >= this.a && f <= this.b;
    }

    public final boolean m() {
        return this.a == 3.141593 && this.b == -3.141593;
    }

    public final boolean n() {
        return this.a == -3.141593 && this.b == 3.141593;
    }

    public final boolean o() {
        return this.a > this.b;
    }

    @Override
    public final String toString() {
        return "[" + this.a + ", " + this.b + "]";
    }
}

