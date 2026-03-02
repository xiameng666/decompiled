package j$.time;

import j..util.Objects;

public abstract class Clock {
    public static a a(ZoneId zoneId0) {
        Objects.requireNonNull(zoneId0, "zone");
        return zoneId0 == ZoneOffset.UTC ? a.b : new a(zoneId0);
    }

    public abstract ZoneId getZone();

    public abstract Instant instant();

    public long millis() {
        return this.instant().toEpochMilli();
    }

    public static Clock systemDefaultZone() {
        return new a(ZoneId.systemDefault());
    }

    public static Clock systemUTC() {
        return a.b;
    }
}

