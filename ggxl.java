import java.io.Serializable;

public final class ggxl implements Serializable {
    public double a;
    public double b;

    public ggxl() {
        this(1.0, 0.0);
    }

    public ggxl(double f, double f1) {
        this.a = f;
        this.b = f1;
    }

    public ggxl(ggxl ggxl0) {
        this(ggxl0.a, ggxl0.b);
    }

    public final double a(double f) {
        return Math.max(this.a, Math.min(this.b, f));
    }

    public final ggxl b(double f) {
        return this.j() ? this : new ggxl(this.a - f, this.b + f);
    }

    public static ggxl c(double f, double f1) {
        ggxl ggxl0 = new ggxl();
        ggxl0.e(f, f1);
        return ggxl0;
    }

    final void d(double f) {
        this.a -= f;
        this.b += f;
    }

    final void e(double f, double f1) {
        int v = Double.compare(f, f1);
        this.a = v > 0 ? f1 : f;
        if(v <= 0) {
            f = f1;
        }
        this.b = f;
    }

    @Override
    public final boolean equals(Object object0) {
        if((object0 instanceof ggxl)) {
            if(Double.compare(this.a, ((ggxl)object0).a) == 0) {
                return this.b == ((ggxl)object0).b ? true : this.j() && ((ggxl)object0).j();
            }
            return this.j() && ((ggxl)object0).j();
        }
        return false;
    }

    final void f(double f, double f1) {
        this.a = f;
        this.b = f1;
    }

    final void g(ggxl ggxl0) {
        if(this.j()) {
            this.a = ggxl0.a;
            this.b = ggxl0.b;
            return;
        }
        if(!ggxl0.j()) {
            this.a = Math.min(this.a, ggxl0.a);
            this.b = Math.max(this.b, ggxl0.b);
        }
    }

    public final boolean h(double f) {
        return f >= this.a && f <= this.b;
    }

    @Override
    public final int hashCode() {
        if(this.j()) {
            return 17;
        }
        long v = (Double.doubleToLongBits(this.a) + 629L) * 37L + Double.doubleToLongBits(this.b);
        return (int)(v ^ v >>> 0x20);
    }

    public final boolean i(ggxl ggxl0) {
        double f = this.a;
        double f1 = ggxl0.a;
        int v = Double.compare(f, f1);
        if(v <= 0) {
            f = f1;
        }
        if((f <= (v > 0 ? ggxl0 : this).b)) {
            if(v <= 0) {
                this = ggxl0;
            }
            return f <= this.b;
        }
        return false;
    }

    public final boolean j() {
        return this.a > this.b;
    }

    @Override
    public final String toString() {
        return "[" + this.a + ", " + this.b + "]";
    }
}

