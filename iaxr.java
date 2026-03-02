import java.util.Random;
import java.util.concurrent.TimeUnit;

public final class iaxr {
    private final Random a;
    private final long b;
    private final long c;
    private long d;

    public iaxr() {
        this.a = new Random();
        long v = TimeUnit.SECONDS.toNanos(1L);
        this.b = v;
        this.c = TimeUnit.MINUTES.toNanos(2L);
        this.d = v;
    }

    public final long a() {
        long v = this.d;
        this.d = Math.min(((long)(1.6 * ((double)v))), this.c);
        gftb.checkTrue(0.2 * ((double)v) >= ((double)v) * -0.2);
        return v + ((long)(this.a.nextDouble() * (0.2 * ((double)v) - ((double)v) * -0.2) + ((double)v) * -0.2));
    }
}

