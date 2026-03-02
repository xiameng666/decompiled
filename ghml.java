import j..time.Duration;
import java.io.Serializable;

public abstract class ghml implements Serializable {
    public static final Duration d;

    static {
        ghml.d = Duration.ofMillis(-1L);
    }

    public abstract Duration a(int arg1);

    public boolean b(int v) {
        return this.a(v).compareTo(Duration.ZERO) >= 0;
    }

    public Duration c(int v, Duration duration0) {
        gftb.check(duration0);
        return this.b(v) ? this.a(v) : ghml.d;
    }

    public static ghml d(Duration duration0, double f, int v) {
        gftb.check(duration0);
        return new ghmg(duration0, f, v);
    }

    public static ghml e(Duration duration0, int v) {
        return duration0.isZero() ? new ghmf(v) : new ghme(duration0, v);
    }

    public final Iterable f() {
        return this.g(gfuv.b);
    }

    public final Iterable g(gfuv gfuv0) {
        gftb.check(gfuv0);
        return new ghmc(this, gfuv0);
    }

    static void h(int v) {
        gftb.l(v >= 0, "%s (%s) must be >= 0", "tries", v);
    }

    static Duration i(Duration duration0) {
        if(!duration0.isNegative() && !duration0.isZero()) {
            long v = glxr.a(duration0);
            double f = Math.random() - 0.5;
            return Duration.ofNanos(glun.d(v, glxr.a(Duration.ofNanos(((long)((f + f) * 0.5 * ((double)v)))))));
        }
        return duration0;
    }

    static void j(int v) {
        gftb.l(v > 0, "%s (%s) must be > 0", "numAttempts", v);
    }
}

