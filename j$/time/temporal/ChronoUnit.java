package j$.time.temporal;

import j..time.Duration;

public enum ChronoUnit implements TemporalUnit {
    NANOS("Nanos", Duration.ofNanos(1L)),
    MICROS("Micros", Duration.ofNanos(1000L)),
    MILLIS("Millis", Duration.ofNanos(1000000L)),
    SECONDS("Seconds", Duration.ofSeconds(1L)),
    MINUTES("Minutes", Duration.ofSeconds(60L)),
    HOURS("Hours", Duration.ofSeconds(3600L)),
    HALF_DAYS("HalfDays", Duration.ofSeconds(43200L)),
    DAYS("Days", Duration.ofSeconds(86400L)),
    WEEKS("Weeks", Duration.ofSeconds(604800L)),
    MONTHS("Months", Duration.ofSeconds(0x282072L)),
    YEARS("Years", Duration.ofSeconds(0x1E18558L)),
    DECADES("Decades", Duration.ofSeconds(0x12CF3570L)),
    CENTURIES("Centuries", Duration.ofSeconds(3155695200L)),
    MILLENNIA("Millennia", Duration.ofSeconds(0x758F0DFC0L)),
    ERAS("Eras", Duration.ofSeconds(31556952000000000L)),
    FOREVER("Forever", Duration.ofSeconds(0x7FFFFFFFFFFFFFFFL, 0x3B9AC9FFL));

    public final String a;
    public final Duration b;

    public ChronoUnit(String s1, Duration duration0) {
        this.a = s1;
        this.b = duration0;
    }

    @Override  // j$.time.temporal.TemporalUnit
    public long between(Temporal temporal0, Temporal temporal1) {
        return temporal0.until(temporal1, this);
    }

    @Override  // j$.time.temporal.TemporalUnit
    public final Temporal g(Temporal temporal0, long v) {
        return temporal0.b(v, this);
    }

    @Override  // j$.time.temporal.TemporalUnit
    public Duration getDuration() {
        return this.b;
    }

    @Override  // j$.time.temporal.TemporalUnit
    public final boolean isDurationEstimated() {
        return this.compareTo(ChronoUnit.DAYS) >= 0;
    }

    @Override
    public final String toString() {
        return this.a;
    }
}

