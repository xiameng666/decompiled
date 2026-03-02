import j..util.Objects;
import java.math.RoundingMode;
import java.util.Locale;

public final class fvhw implements Comparable {
    public final int a;
    public final long b;

    public fvhw(int v, long v1) {
        long v2 = v1 % 604800000000000000L;
        int v3 = (int)(v1 / 604800000000000000L);
        if(Long.compare(v2, 0L) < 0) {
            v2 += 604800000000000000L;
            --v3;
        }
        this.a = v + v3;
        this.b = v2;
    }

    public final int a(fvhw fvhw0) {
        return ggbe.b.b(this.a, fvhw0.a).c(this.b, fvhw0.b).a();
    }

    public final long b(fvhw fvhw0) {
        fvhv fvhv0 = this.i(fvhw0);
        return fvhv0.a + Math.round(fvhv0.b);
    }

    public final long c() {
        long v = glun.b(this.b, 1000L, RoundingMode.HALF_UP);
        return ((long)this.a) * 604800000000000L + v;
    }

    @Override
    public final int compareTo(Object object0) {
        return this.a(((fvhw)object0));
    }

    public final long d() {
        int v = fvht.b(this.f());
        return this.c() + fvhx.f * 1000000L - ((long)v) * 1000000000L;
    }

    public final fvht e() {
        fvhu fvhu0 = new fvhu(this.a, this.b);
        return fvht.d(((long)fvhu0.a) * 604800L + fvhu0.b / 1000000000000L + ((long)(((double)fvhx.f) * 0.001)), fvhu0.b % 1000000000000L);
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof fvhw) ? this.a == ((fvhw)object0).a && this.b == ((fvhw)object0).b : false;
    }

    public final fvht f() {
        int v = fvht.b(this.e());
        fvht fvht0 = this.r(((long)v) * 1000000000L).e();
        int v1 = fvht.b(fvht0);
        return v == v1 ? fvht0 : this.r(((long)v1) * 1000000000L).e();
    }

    public final fvhu g() {
        long v = this.b;
        long v1 = -14000000000000L + v;
        int v2 = this.a;
        int v3 = v2 - 0x54C;
        if(Long.compare(v1, 0L) < 0) {
            v3 = v2 - 0x54D;
            v1 = 604786000000000000L + v;
        }
        return new fvhu(v3, v1);
    }

    public final fvhu h() {
        return new fvhu(this.a - fvhx.g, this.b);
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{((int)this.a), ((long)this.b)});
    }

    public final fvhv i(fvhw fvhw0) {
        long v = this.b - fvhw0.b;
        return new fvhv(((long)(this.a - fvhw0.a)) * 604800000000000L + v / 1000L, ((double)(v % 1000L)) / 1000.0);
    }

    public static fvhw j(int v, long v1) {
        long v2 = 14000000000000L + v1;
        int v3 = v + 0x54C;
        if(Long.compare(v2, 604800000000000000L) >= 0) {
            v3 = v + 0x54D;
            v2 = -604786000000000000L + v1;
        }
        return new fvhw(v3, v2);
    }

    public static fvhw k(fvht fvht0) {
        return fvhw.q(fvht0.c(fvhx.a), fvht0.g % 1000000000L);
    }

    public static fvhw l(fvht fvht0) {
        int v = fvht.b(fvht0);
        return fvhw.q(fvht0.c(fvhx.a) + ((long)v) * 1000L, fvht0.g % 1000000000L);
    }

    public static fvhw m(int v, long v1) {
        return new fvhw(v + fvhx.g, v1);
    }

    public static fvhw n(long v) {
        return fvhw.o(v, 0.0);
    }

    public static fvhw o(long v, double f) {
        return new fvhw(((int)(v / 604800000000000L)), v % 604800000000000L * 1000L + ((long)(f * 1000.0)));
    }

    public static fvhw p(long v) {
        int v1 = fvht.b(fvht.d(v / 1000000000L, v % 1000000000L * 1000L));
        long v2 = v - fvhx.f * 1000000L + ((long)v1) * 1000000000L;
        int v3 = (int)(v2 / 604800000000000L);
        return new fvhw(v3, (v2 - ((long)v3) * 604800000000000L) * 1000L);
    }

    public static fvhw q(long v, long v1) {
        return new fvhw(((int)(v / 604800000L)), v % 604800000L * 1000000000L + v1);
    }

    public final fvhw r(long v) {
        return fvhw.o(this.u() - v, ((double)(this.b % 1000L)) / 1000.0);
    }

    public final fvhw s(long v) {
        return fvhw.o(this.u() + v, ((double)(this.b % 1000L)) / 1000.0);
    }

    public final fvuf t() {
        fvht fvht0 = fvhw.k(this.f()).s(10800000000000L).e();
        return new fvuf(fvht0, ((long)(((long)(fvht0.d * 3600 + fvht0.e * 60 + fvht0.f)) * 1000000000000L + fvht0.g)));
    }

    @Override
    public final String toString() {
        return String.format(Locale.US, "GnssTime<gpsWeek: %d, gpsTowPicos: %d>", ((int)this.a), ((long)this.b));
    }

    private final long u() {
        return ((long)this.a) * 604800000000000L + this.b / 1000L;
    }
}

