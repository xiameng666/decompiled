import java.io.Serializable;

public final class ggxm implements Serializable {
    public final ggxl a;
    public final ggxl b;

    public ggxm() {
        this(new ggxl(), new ggxl());
    }

    public ggxm(ggxl ggxl0, ggxl ggxl1) {
        this.a = ggxl0;
        this.b = ggxl1;
    }

    public static ggxm a() {
        return new ggxm(new ggxl(1.0, 0.0), new ggxl(1.0, 0.0));
    }

    public final ggxm b(double f) {
        ggxn ggxn0 = new ggxn(f, f);
        ggxl ggxl0 = this.a.b(ggxn0.a);
        ggxl ggxl1 = this.b.b(ggxn0.b);
        return ggxl0.j() || ggxl1.j() ? ggxm.a() : new ggxm(ggxl0, ggxl1);
    }

    public static ggxm c(ggxn ggxn0, ggxn ggxn1) {
        return new ggxm(ggxl.c(ggxn0.a, ggxn1.a), ggxl.c(ggxn0.b, ggxn1.b));
    }

    public final ggxn d(int v, int v1) {
        double f = v == 0 ? this.a.a : this.a.b;
        return v1 == 0 ? new ggxn(f, this.b.a) : new ggxn(f, this.b.b);
    }

    public final ggxn e() {
        return new ggxn(this.a.b, this.b.b);
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof ggxm) && this.a.equals(((ggxm)object0).a) && this.b.equals(((ggxm)object0).b);
    }

    public final ggxn f() {
        return new ggxn(this.a.a, this.b.a);
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() * 701 + this.b.hashCode();
    }

    @Override
    public final String toString() {
        return "[Lo" + this.f().toString() + ", Hi" + this.e().toString() + "]";
    }
}

