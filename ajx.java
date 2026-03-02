import j..time.DateTimeException;
import j..time.Instant;

public final class ajx {
    public static final Instant a(long v) {
        try {
            return Instant.ofEpochMilli(v);
        }
        catch(DateTimeException unused_ex) {
            return Instant.EPOCH;
        }
    }
}

