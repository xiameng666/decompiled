package j$.time.temporal;

import j..time.format.b0;
import j..time.format.c0;
import java.util.Map;

public interface TemporalField {
    boolean g(TemporalAccessor arg1);

    m i(TemporalAccessor arg1);

    boolean isDateBased();

    TemporalAccessor n(Map arg1, b0 arg2, c0 arg3);

    m range();

    long w(TemporalAccessor arg1);

    Temporal z(Temporal arg1, long arg2);
}

