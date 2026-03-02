import j..time.Duration;
import j..util.Objects;

public final class fvfr {
    public final double a;
    public final double b;
    public final double c;
    public final TimeRange d;
    private final String e;

    public fvfr(String s, double f, double f1, double f2, TimeRange ggmr0) {
        this.e = s;
        this.a = f;
        this.b = f1;
        this.c = f2;
        this.d = ggmr0;
    }

    public final double a(fvhw fvhw0) {
        long v = fvhw0.c() - ((fvhw)this.d.q()).c();
        if(v >= 0L) {
            return this.a + this.c * ((double)v) * 1.000000E-09;
        }
        throw new IllegalArgumentException("gnssTime is earlier than the validity window.");
    }

    public static fvfr b(gxqh gxqh0) {
        fvhw fvhw1;
        fvhw fvhw0 = fvhw.n(Duration.ofMillis((gxqh0.c == null ? gxra.a : gxqh0.c).c).toNanos());
        gxra gxra0 = gxqh0.c;
        if(((gxra0 == null ? gxra.a : gxra0).b & 2) == 0) {
            fvhw1 = fvhw.n(0x7FFFFFFFFFFFFFFFL);
        }
        else {
            if(gxra0 == null) {
                gxra0 = gxra.a;
            }
            fvhw1 = fvhw.n(Duration.ofMillis(gxra0.d).toNanos());
        }
        String s = gxqh0.b;
        double f = (gxqh0.d == null ? gxqi.a : gxqh0.d).b;
        gxqi gxqi0 = gxqh0.d;
        double f1 = (gxqi0 == null ? gxqi.a : gxqi0).c;
        if(gxqi0 == null) {
            gxqi0 = gxqi.a;
        }
        return new fvfr(s, f, f1, gxqi0.d, TimeRange.h(fvhw0, fvhw1));
    }

    public final boolean c(fvhw fvhw0) {
        long v = fvhw0.c();
        return ((fvhw)this.d.q()).c() <= v && v <= ((fvhw)this.d.r()).c();
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 == null) {
            return false;
        }
        return (object0 instanceof fvfr) ? this.e.equals(((fvfr)object0).e) && Double.compare(this.a, ((fvfr)object0).a) == 0 && Double.compare(this.b, ((fvfr)object0).b) == 0 && Double.compare(this.c, ((fvfr)object0).c) == 0 && this.d.equals(((fvfr)object0).d) : false;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{this.e, ((double)this.a), ((double)this.b), ((double)this.c), this.d});
    }
}

