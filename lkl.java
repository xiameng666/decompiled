public final class lkl {
    public double a;
    public double b;
    public double c;
    public double d;
    private boolean e;
    private double f;
    private double g;
    private double h;
    private double i;
    private final lkg j;

    public lkl() {
        this.a = Math.sqrt(1500.0);
        this.b = 0.5;
        this.e = false;
        this.i = 1.797693E+308;
        this.j = new lkg();
    }

    public lkl(float f) {
        this.a = Math.sqrt(1500.0);
        this.b = 0.5;
        this.e = false;
        this.i = 1.797693E+308;
        this.j = new lkg();
        this.i = (double)f;
    }

    public final float a() {
        return (float)this.i;
    }

    final lkg b(double f, double f1, long v) {
        double f9;
        double f8;
        if(!this.e) {
            if(this.i == 1.797693E+308) {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
            double f2 = this.b;
            if((f2 > 1.0)) {
                this.f = -f2 * this.a + this.a * Math.sqrt(f2 * f2 - 1.0);
                this.g = -this.b * this.a - this.a * Math.sqrt(this.b * this.b - 1.0);
            }
            else if((f2 >= 0.0) && (f2 < 1.0)) {
                this.h = this.a * Math.sqrt(1.0 - f2 * f2);
            }
            this.e = true;
        }
        double f3 = f - this.i;
        double f4 = this.b;
        int v1 = Double.compare(f4, 1.0);
        if(v1 > 0) {
            double f5 = this.g;
            double f6 = (f5 * f3 - f1) / (f5 - this.f);
            double f7 = f3 - f6;
            f8 = f7 * this.g * Math.pow(2.718282, this.g * (((double)v) / 1000.0)) + f6 * this.f * Math.pow(2.718282, this.f * (((double)v) / 1000.0));
            f9 = Math.pow(2.718282, f5 * (((double)v) / 1000.0)) * f7 + Math.pow(2.718282, this.f * (((double)v) / 1000.0)) * f6;
        }
        else if(v1 == 0) {
            double f10 = f1 + this.a * f3;
            double f11 = f3 + f10 * (((double)v) / 1000.0);
            f9 = Math.pow(2.718282, -this.a * (((double)v) / 1000.0)) * f11;
            f8 = f11 * Math.pow(2.718282, -this.a * (((double)v) / 1000.0)) * -this.a + f10 * Math.pow(2.718282, ((double)v) / 1000.0 * -this.a);
        }
        else {
            double f12 = Math.pow(2.718282, -f4 * this.a * (((double)v) / 1000.0));
            double f13 = Math.cos(this.h * (((double)v) / 1000.0)) * f3;
            double f14 = this.h * (((double)v) / 1000.0);
            double f15 = 1.0 / this.h * (f4 * this.a * f3 + f1);
            double f16 = f12 * (f13 + Math.sin(f14) * f15);
            f8 = -this.a * f16 * this.b + Math.pow(2.718282, -this.b * this.a * (((double)v) / 1000.0)) * (-this.h * f3 * Math.sin(this.h * (((double)v) / 1000.0)) + this.h * f15 * Math.cos(this.h * (((double)v) / 1000.0)));
            f9 = f16;
        }
        this.j.a = (float)(f9 + this.i);
        this.j.b = (float)f8;
        return this.j;
    }

    public final void c(float f) {
        if(f < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.b = (double)f;
        this.e = false;
    }

    public final void d(float f) {
        this.i = (double)f;
    }

    public final void e(float f) {
        if(f <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.a = Math.sqrt(f);
        this.e = false;
    }
}

