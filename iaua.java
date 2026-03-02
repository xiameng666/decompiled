import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

public final class iaua {
    public static final Logger a;
    public final String b;
    public final AtomicLong c;

    static {
        iaua.a = Logger.getLogger(iaua.class.getName());
    }

    public iaua(long v) {
        AtomicLong atomicLong0 = new AtomicLong();
        this.c = atomicLong0;
        gftb.b(v > 0L, "value must be positive");
        this.b = "keepalive time nanos";
        atomicLong0.set(v);
    }
}

