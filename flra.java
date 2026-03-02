import java.io.Serializable;

public final class flra implements Serializable {
    public static final flra a;
    public static final flra b;
    public static final flra c;
    public final int d;
    public final long e;
    public final long f;
    public final double g;
    public final int h;

    static {
        flqz flqz0 = new flqz();
        flqz0.c(0L);
        flqz0.b(1.0);
        flqz0.e(0L);
        flqz0.f(0);
        flqz0.d(1);
        flra.a = flqz0.a();
        flqz flqz1 = new flqz();
        flqz1.c(1000L);
        flqz1.b(1.0);
        flqz1.e(2000L);
        flqz1.f(1);
        flqz1.d(1000);
        flra.b = flqz1.a();
        flqz flqz2 = new flqz();
        flqz2.c(1000L);
        flqz2.b(2.0);
        flqz2.e(30000L);
        flqz2.f(3);
        flqz2.d(1000);
        flra.c = flqz2.a();
    }

    public flra() {
        throw null;
    }

    public flra(int v, long v1, long v2, double f, int v3) {
        this.d = v;
        this.e = v1;
        this.f = v2;
        this.g = f;
        this.h = v3;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof flra) && this.d == ((flra)object0).d && this.e == ((flra)object0).e && this.f == ((flra)object0).f && Double.doubleToLongBits(this.g) == Double.doubleToLongBits(((flra)object0).g) && this.h == ((flra)object0).h;
    }

    @Override
    public final int hashCode() {
        return this.h ^ (((int)(Double.doubleToLongBits(this.g) ^ Double.doubleToLongBits(this.g) >>> 0x20)) ^ (((this.d ^ 1000003) * 1000003 ^ ((int)this.e)) * 1000003 ^ ((int)this.f)) * 1000003) * 1000003;
    }

    @Override
    public final String toString() {
        return "LighterRetryPolicy{maxRetries=" + this.d + ", maxDelayMs=" + this.e + ", initialDelayMs=" + this.f + ", backoff=" + this.g + ", jitterMs=" + this.h + "}";
    }
}

