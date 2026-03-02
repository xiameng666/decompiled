package j$.time.chrono;

import j..time.LocalTime;
import j..time.ZoneId;
import j..time.ZoneOffset;
import j..time.temporal.Temporal;
import j..time.temporal.TemporalAdjuster;

public interface ChronoLocalDateTime extends Temporal, TemporalAdjuster, Comparable {
    int D(ChronoLocalDateTime arg1);

    Chronology getChronology();

    long toEpochSecond(ZoneOffset arg1);

    ChronoLocalDate toLocalDate();

    LocalTime toLocalTime();

    h x(ZoneId arg1);
}

