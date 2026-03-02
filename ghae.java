import java.io.Serializable;

public final class ghae implements ghbk, Serializable, Comparable {
    public static final ghae a;
    public static final ghae b;
    public static final ghae c;
    public static final ghae d;
    public static final ghae e;
    public static final ghae f;
    public static final ghae g;
    final double h;
    final double i;
    final double j;

    static {
        ghae.a = new ghae(0.0, 0.0, 0.0);
        ghae.b = new ghae(1.0, 0.0, 0.0);
        ghae.c = new ghae(-1.0, 0.0, 0.0);
        ghae.d = new ghae(0.0, 1.0, 0.0);
        ghae.e = new ghae(0.0, -1.0, 0.0);
        ghae.f = new ghae(0.0, 0.0, 1.0);
        ghae.g = new ghae(0.0, 0.0, -1.0);
    }

    public ghae() {
        this(0.0, 0.0, 0.0);
    }

    public ghae(double f, double f1, double f2) {
        this.h = f;
        this.i = f1;
        this.j = f2;
    }

    public final double a(ghae ghae0) {
        double f = this.h * ghae0.i - this.i * ghae0.h;
        double f1 = this.j * ghae0.h - ghae0.j * this.h;
        double f2 = this.i * ghae0.j - this.j * ghae0.i;
        return Math.atan2(Math.sqrt(f2 * f2 + f1 * f1 + f * f), this.b(ghae0));
    }

    public final double b(ghae ghae0) {
        return this.h * ghae0.h + this.i * ghae0.i + this.j * ghae0.j;
    }

    public final double c(int v) {
        if(v == 0) {
            return this.h;
        }
        return v == 1 ? this.i : this.j;
    }

    @Override
    public final int compareTo(Object object0) {
        return this.j(((ghae)object0));
    }

    public final double d(ghae ghae0) {
        double f = this.h - ghae0.h;
        double f1 = this.i - ghae0.i;
        double f2 = this.j - ghae0.j;
        return f * f + f1 * f1 + f2 * f2;
    }

    public final double e() {
        return Math.sqrt(this.g());
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof ghae) ? this.h == ((ghae)object0).h && this.i == ((ghae)object0).i && this.j == ((ghae)object0).j : false;
    }

    @Override  // ghbk
    public final ggyh f() {
        return ggyh.n(this);
    }

    public final double g() {
        return this.h * this.h + this.i * this.i + this.j * this.j;
    }

    @Override  // ghbk
    public final boolean h(ggyi ggyi0) {
        return false;
    }

    @Override
    public final int hashCode() {
        long v = Double.doubleToLongBits(Math.abs(this.h)) + 646L;
        long v1 = v + (v * 37L + Double.doubleToLongBits(Math.abs(this.i)));
        long v2 = v1 + (37L * v1 + Double.doubleToLongBits(Math.abs(this.j)));
        return (int)(v2 ^ v2 >>> 0x20);
    }

    public static final double i(ghae ghae0, ghae ghae1, ghae ghae2) {
        return ghae0.h * (ghae1.i * ghae2.j - ghae1.j * ghae2.i) + ghae0.i * (ghae1.j * ghae2.h - ghae2.j * ghae1.h) + ghae0.j * (ghae1.h * ghae2.i - ghae1.i * ghae2.h);
    }

    public final int j(ghae ghae0) {
        if(this.v(ghae0)) {
            return -1;
        }
        return this.t(ghae0) ? 0 : 1;
    }

    static final int k(double f, double f1, double f2) {
        double f3 = Math.abs(f);
        double f4 = Math.abs(f1);
        double f5 = Math.abs(f2);
        if(Double.compare(f3, f4) > 0) {
            return f3 > f5 ? 0 : 2;
        }
        return f4 > f5 ? 1 : 2;
    }

    public static final ghae l(ghae ghae0, ghae ghae1) {
        return new ghae(ghae0.h + ghae1.h, ghae0.i + ghae1.i, ghae0.j + ghae1.j);
    }

    @Override  // ghbk
    public final boolean m(ggyi ggyi0) {
        return ggyi0.k(this);
    }

    public static final ghae n(ghae ghae0, ghae ghae1) {
        return new ghae(ghae0.i * ghae1.j - ghae0.j * ghae1.i, ghae0.j * ghae1.h - ghae1.j * ghae0.h, ghae0.h * ghae1.i - ghae0.i * ghae1.h);
    }

    public static final ghae o(ghae ghae0, double f) {
        return new ghae(f * ghae0.h, f * ghae0.i, f * ghae0.j);
    }

    public static final ghae p(ghae ghae0) {
        return new ghae(-ghae0.h, -ghae0.i, -ghae0.j);
    }

    public static final ghae q(ghae ghae0) {
        double f = ghae0.e();
        return ghae.o(ghae0, (f == 0.0 ? ghae0.e() : 1.0 / f));
    }

    public static final ghae r(ghae ghae0, ghae ghae1) {
        return new ghae(ghae0.h - ghae1.h, ghae0.i - ghae1.i, ghae0.j - ghae1.j);
    }

    public final String s() {
        ggzv ggzv0 = new ggzv(this);
        return "(" + ggzv0.b() + ", " + ggzv0.c() + ")";
    }

    public final boolean t(ghae ghae0) {
        return this.h == ghae0.h && this.i == ghae0.i && this.j == ghae0.j;
    }

    @Override
    public final String toString() {
        return "(" + this.h + ", " + this.i + ", " + this.j + ")";
    }

    public final boolean u() {
        return ghad.a(this.h) && ghad.a(this.i) && ghad.a(this.j);
    }

    public final boolean v(ghae ghae0) {
        double f = this.h;
        double f1 = ghae0.h;
        if(Double.compare(f, f1) < 0) {
            return true;
        }
        if(Double.compare(f1, f) < 0) {
            return false;
        }
        double f2 = this.i;
        double f3 = ghae0.i;
        if((f2 < f3)) {
            return true;
        }
        return f3 < f2 ? false : this.j < ghae0.j;
    }
}

