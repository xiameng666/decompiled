import j..time.Instant;

public final class buex {
    public static final Long a(Instant instant0) {
        if(instant0 != null) {
            return ibuq.m(instant0, Instant.MAX) ? ((long)0x7FFFFFFFFFFFFFFFL) : instant0.toEpochMilli();
        }
        return null;
    }

    public static final Instant b(Long long0) {
        if(long0 != null) {
            long v = long0.longValue();
            return v == 0x7FFFFFFFFFFFFFFFL ? Instant.MAX : Instant.ofEpochMilli(v);
        }
        return null;
    }
}

