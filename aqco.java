import j..time.Instant;
import java.util.concurrent.TimeUnit;

public final class aqco {
    public static final long a;
    public static final TimeRange b;
    private static final Instant c;
    private static final Instant d;

    static {
        long v = TimeUnit.MICROSECONDS.convert(11644473600000L, TimeUnit.MILLISECONDS);
        aqco.a = v;
        Instant instant0 = Instant.parse("2000-01-01T00:00:00.00Z");
        aqco.c = instant0;
        Instant instant1 = Instant.parse("2360-01-01T00:00:00.00Z");
        aqco.d = instant1;
        aqco.b = TimeRange.g(Long.valueOf(TimeUnit.MICROSECONDS.convert(instant0.toEpochMilli(), TimeUnit.MILLISECONDS)), Long.valueOf(TimeUnit.MICROSECONDS.convert(instant1.toEpochMilli(), TimeUnit.MILLISECONDS)));
        TimeRange.g(Long.valueOf(TimeUnit.MICROSECONDS.convert(instant0.toEpochMilli(), TimeUnit.MILLISECONDS) + v), Long.valueOf(TimeUnit.MICROSECONDS.convert(instant1.toEpochMilli(), TimeUnit.MILLISECONDS) + v));
    }

    public static long a(Instant instant0) {
        long v = instant0.plusMillis(11644473600000L).toEpochMilli();
        return TimeUnit.MICROSECONDS.convert(v, TimeUnit.MILLISECONDS);
    }

    public static Instant b(long v) {
        long v1 = TimeUnit.MILLISECONDS.convert(v, TimeUnit.MICROSECONDS);
        return v1 >= 11644473600000L ? Instant.ofEpochMilli(v1 - 11644473600000L) : Instant.MIN;
    }

    public static boolean c(long v) {
        return aqco.b.s(Long.valueOf(v));
    }
}

