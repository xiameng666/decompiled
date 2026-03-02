import java.util.concurrent.TimeUnit;

public final class aqxp {
    public final long a;

    public aqxp() {
        throw null;
    }

    public aqxp(long v) {
        batl.c(v >= 0L, "delayMillis must be non-negative.");
        this.a = v;
    }

    public static aqxp a(long v, TimeUnit timeUnit0) {
        return new aqxp(timeUnit0.toMillis(v));
    }
}

