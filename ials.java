import j..util.Objects;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public final class ials implements Comparable {
    public static final ialr a;
    public final long b;
    public volatile boolean c;
    private static final long d;
    private static final long e;
    private static final long f;
    private final ialr g;

    static {
        ials.a = new ialr();
        long v = TimeUnit.DAYS.toNanos(36500L);
        ials.d = v;
        ials.e = -v;
        ials.f = TimeUnit.SECONDS.toNanos(1L);
    }

    private ials(ialr ialr0, long v, long v1) {
        this.g = ialr0;
        long v2 = Math.min(ials.d, Math.max(ials.e, v1));
        this.b = v + v2;
        this.c = v2 <= 0L;
    }

    public final int a(ials ials0) {
        ialr ialr0 = this.g;
        ialr ialr1 = ials0.g;
        if(ialr0 == ialr1) {
            return Long.compare(this.b, ials0.b);
        }
        throw new AssertionError("Tickers (" + ialr0.toString() + " and " + ialr1.toString() + ") don\'t match. Custom Ticker should only be used in tests!");
    }

    public final long b(TimeUnit timeUnit0) {
        long v = System.nanoTime();
        if(!this.c && this.b - v <= 0L) {
            this.c = true;
        }
        return timeUnit0.convert(this.b - v, TimeUnit.NANOSECONDS);
    }

    public static ials c(long v, TimeUnit timeUnit0) {
        Objects.requireNonNull(timeUnit0, "units");
        long v1 = timeUnit0.toNanos(v);
        return new ials(ials.a, System.nanoTime(), v1);
    }

    @Override
    public final int compareTo(Object object0) {
        return this.a(((ials)object0));
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return (object0 instanceof ials) ? this.g == ((ials)object0).g && this.b == ((ials)object0).b : false;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{this.g, ((long)this.b)});
    }

    @Override
    public final String toString() {
        long v = this.b(TimeUnit.NANOSECONDS);
        long v1 = Math.abs(v) / ials.f;
        long v2 = Math.abs(v) % ials.f;
        StringBuilder stringBuilder0 = new StringBuilder();
        if(v < 0L) {
            stringBuilder0.append('-');
        }
        stringBuilder0.append(v1);
        if(v2 > 0L) {
            stringBuilder0.append(String.format(Locale.US, ".%09d", v2));
        }
        stringBuilder0.append("s from now");
        ialr ialr0 = this.g;
        if(ialr0 != ials.a) {
            stringBuilder0.append(a.b(ialr0, " (ticker=", ")"));
        }
        return stringBuilder0.toString();
    }
}

