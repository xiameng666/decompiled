package j$.time.temporal;

import j..time.LocalDate;

public interface Temporal extends TemporalAccessor {
    Temporal a(TemporalField arg1, long arg2);

    Temporal b(long arg1, TemporalUnit arg2);

    Temporal g(LocalDate arg1);

    long until(Temporal arg1, TemporalUnit arg2);

    Temporal w(long arg1, ChronoUnit arg2);
}

