package j$.time.temporal;

import j..time.Duration;

public interface TemporalUnit {
    long between(Temporal arg1, Temporal arg2);

    Temporal g(Temporal arg1, long arg2);

    Duration getDuration();

    boolean isDurationEstimated();
}

