package j$.time;

import j..desugar.sun.nio.fs.g;
import j..desugar.sun.nio.fs.n;
import j..time.chrono.q;
import j..time.format.DateTimeFormatter;
import j..time.temporal.ChronoField;
import j..time.temporal.ChronoUnit;
import j..time.temporal.Temporal;
import j..time.temporal.TemporalAccessor;
import j..time.temporal.TemporalAdjuster;
import j..time.temporal.TemporalField;
import j..time.temporal.TemporalQuery;
import j..time.temporal.TemporalUnit;
import j..time.temporal.k;
import j..time.temporal.l;
import j..time.temporal.m;
import j..util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public final class OffsetDateTime implements Temporal, TemporalAdjuster, Serializable, Comparable {
    public final LocalDateTime a;
    public final ZoneOffset b;
    public static final int c = 0;
    private static final long serialVersionUID = 0x1FBFBC5D57D80062L;

    static {
        LocalDateTime.c.getClass();
        new OffsetDateTime(LocalDateTime.c, ZoneOffset.g);
        LocalDateTime.d.getClass();
        new OffsetDateTime(LocalDateTime.d, ZoneOffset.f);
    }

    public OffsetDateTime(LocalDateTime localDateTime0, ZoneOffset zoneOffset0) {
        this.a = (LocalDateTime)Objects.requireNonNull(localDateTime0, "dateTime");
        this.b = (ZoneOffset)Objects.requireNonNull(zoneOffset0, "offset");
    }

    @Override  // j$.time.temporal.TemporalAccessor
    public final Object B(TemporalQuery temporalQuery0) {
        if(temporalQuery0 != k.d && temporalQuery0 != k.e) {
            if(temporalQuery0 == k.a) {
                return null;
            }
            if(temporalQuery0 == k.f) {
                return this.toLocalDate();
            }
            if(temporalQuery0 == k.g) {
                return this.a.toLocalTime();
            }
            if(temporalQuery0 == k.b) {
                return q.d;
            }
            return temporalQuery0 == k.c ? ChronoUnit.NANOS : temporalQuery0.queryFrom(this);
        }
        return this.b;
    }

    public static OffsetDateTime H(TemporalAccessor temporalAccessor0) {
        if((temporalAccessor0 instanceof OffsetDateTime)) {
            return (OffsetDateTime)temporalAccessor0;
        }
        try {
            ZoneOffset zoneOffset0 = ZoneOffset.N(temporalAccessor0);
            LocalDate localDate0 = (LocalDate)temporalAccessor0.B(k.f);
            LocalTime localTime0 = (LocalTime)temporalAccessor0.B(k.g);
            return localDate0 == null || localTime0 == null ? OffsetDateTime.I(Instant.from(temporalAccessor0), zoneOffset0) : new OffsetDateTime(LocalDateTime.of(localDate0, localTime0), zoneOffset0);
        }
        catch(DateTimeException dateTimeException0) {
            throw __alloc_invoke__ DateTimeException, RuntimeException(c.a("Unable to obtain OffsetDateTime from TemporalAccessor: ", String.valueOf(temporalAccessor0), " of type ", temporalAccessor0.getClass().getName()), dateTimeException0);  // Mismatched object-allocation/constructor-invocation, likely indicating an inlined constructor call
        }
    }

    public static OffsetDateTime I(Instant instant0, ZoneId zoneId0) {
        Objects.requireNonNull(instant0, "instant");
        Objects.requireNonNull(zoneId0, "zone");
        ZoneOffset zoneOffset0 = zoneId0.I().d(instant0);
        return new OffsetDateTime(LocalDateTime.I(instant0.getEpochSecond(), instant0.getNano(), zoneOffset0), zoneOffset0);
    }

    public final OffsetDateTime J(long v, TemporalUnit temporalUnit0) {
        return (temporalUnit0 instanceof ChronoUnit) ? this.K(this.a.J(v, temporalUnit0), this.b) : ((OffsetDateTime)temporalUnit0.g(this, v));
    }

    public final OffsetDateTime K(LocalDateTime localDateTime0, ZoneOffset zoneOffset0) {
        return this.a != localDateTime0 || !this.b.equals(zoneOffset0) ? new OffsetDateTime(localDateTime0, zoneOffset0) : this;
    }

    @Override  // j$.time.temporal.Temporal
    public final Temporal a(TemporalField temporalField0, long v) {
        if((temporalField0 instanceof ChronoField)) {
            ZoneOffset zoneOffset0 = this.b;
            LocalDateTime localDateTime0 = this.a;
            switch(((ChronoField)temporalField0)) {
                case 1: {
                    return OffsetDateTime.I(Instant.ofEpochSecond(v, localDateTime0.b.getNano()), zoneOffset0);
                }
                case 2: {
                    return this.K(localDateTime0, ZoneOffset.ofTotalSeconds(((ChronoField)temporalField0).b.a(((ChronoField)temporalField0), v)));
                }
                default: {
                    return this.K(localDateTime0.Q(temporalField0, v), zoneOffset0);
                }
            }
        }
        return (OffsetDateTime)temporalField0.z(this, v);
    }

    @Override  // j$.time.temporal.Temporal
    public final Temporal b(long v, TemporalUnit temporalUnit0) {
        return this.J(v, temporalUnit0);
    }

    @Override
    public final int compareTo(Object object0) {
        int v;
        LocalDateTime localDateTime0 = ((OffsetDateTime)object0).a;
        ZoneOffset zoneOffset0 = this.b;
        LocalDateTime localDateTime1 = this.a;
        if(zoneOffset0.equals(((OffsetDateTime)object0).b)) {
            v = localDateTime1.D(localDateTime0);
            return v == 0 ? localDateTime1.D(localDateTime0) : v;
        }
        v = Long.compare(localDateTime1.toEpochSecond(zoneOffset0), localDateTime0.toEpochSecond(((OffsetDateTime)object0).b));
        if(v == 0) {
            v = localDateTime1.toLocalTime().getNano() - localDateTime0.toLocalTime().getNano();
        }
        return v == 0 ? localDateTime1.D(localDateTime0) : v;
    }

    @Override  // j$.time.temporal.TemporalAccessor
    public final boolean d(TemporalField temporalField0) {
        return (temporalField0 instanceof ChronoField) || temporalField0 != null && temporalField0.g(this);
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof OffsetDateTime) && this.a.equals(((OffsetDateTime)object0).a) && this.b.equals(((OffsetDateTime)object0).b);
    }

    @Override  // j$.time.temporal.Temporal
    public final Temporal g(LocalDate localDate0) {
        return localDate0 == null ? ((OffsetDateTime)null.n(this)) : this.K(this.a.P(localDate0), this.b);
    }

    @Override  // j$.time.temporal.TemporalAccessor
    public final int get(TemporalField temporalField0) {
        if((temporalField0 instanceof ChronoField)) {
            switch(((ChronoField)temporalField0)) {
                case 1: {
                    throw __alloc_invoke__ l, RuntimeException("Invalid field \'InstantSeconds\' for get() method, use getLong() instead");  // Mismatched object-allocation/constructor-invocation, likely indicating an inlined constructor call
                }
                case 2: {
                    return this.b.b;
                }
                default: {
                    return this.a.get(temporalField0);
                }
            }
        }
        return k.a(this, temporalField0);
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() ^ this.b.b;
    }

    @Override  // j$.time.temporal.TemporalAccessor
    public final m i(TemporalField temporalField0) {
        if((temporalField0 instanceof ChronoField)) {
            return temporalField0 == ChronoField.INSTANT_SECONDS || temporalField0 == ChronoField.OFFSET_SECONDS ? ((ChronoField)temporalField0).b : this.a.i(temporalField0);
        }
        return temporalField0.i(this);
    }

    @Override  // j$.time.temporal.TemporalAdjuster
    public final Temporal n(Temporal temporal0) {
        return temporal0.a(ChronoField.EPOCH_DAY, this.toLocalDate().toEpochDay()).a(ChronoField.NANO_OF_DAY, this.a.toLocalTime().T()).a(ChronoField.OFFSET_SECONDS, ((long)this.b.b));
    }

    public static OffsetDateTime parse(CharSequence charSequence0) {
        return OffsetDateTime.parse(charSequence0, DateTimeFormatter.ISO_OFFSET_DATE_TIME);
    }

    public static OffsetDateTime parse(CharSequence charSequence0, DateTimeFormatter dateTimeFormatter0) {
        Objects.requireNonNull(dateTimeFormatter0, "formatter");
        return (OffsetDateTime)dateTimeFormatter0.parse(charSequence0, new n(4));
    }

    private void readObject(ObjectInputStream objectInputStream0) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public Instant toInstant() {
        this.a.getClass();
        return g.r(this.a, this.b);
    }

    public LocalDate toLocalDate() {
        return this.a.a;
    }

    @Override
    public final String toString() {
        return this.a.toString() + this.b.toString();
    }

    @Override  // j$.time.temporal.Temporal
    public final long until(Temporal temporal0, TemporalUnit temporalUnit0) {
        OffsetDateTime offsetDateTime0 = OffsetDateTime.H(temporal0);
        if((temporalUnit0 instanceof ChronoUnit)) {
            ZoneOffset zoneOffset0 = offsetDateTime0.b;
            ZoneOffset zoneOffset1 = this.b;
            if(!zoneOffset1.equals(zoneOffset0)) {
                offsetDateTime0 = new OffsetDateTime(offsetDateTime0.a.M(((long)(zoneOffset1.b - zoneOffset0.b))), zoneOffset1);
            }
            return this.a.until(offsetDateTime0.a, temporalUnit0);
        }
        return temporalUnit0.between(this, offsetDateTime0);
    }

    @Override  // j$.time.temporal.Temporal
    public final Temporal w(long v, ChronoUnit chronoUnit0) {
        return v == 0x8000000000000000L ? this.J(0x7FFFFFFFFFFFFFFFL, chronoUnit0).J(1L, chronoUnit0) : this.J(-v, chronoUnit0);
    }

    private Object writeReplace() {
        return new j..time.m(10, this);
    }

    @Override  // j$.time.temporal.TemporalAccessor
    public final long z(TemporalField temporalField0) {
        if((temporalField0 instanceof ChronoField)) {
            ZoneOffset zoneOffset0 = this.b;
            LocalDateTime localDateTime0 = this.a;
            switch(((ChronoField)temporalField0)) {
                case 1: {
                    return localDateTime0.toEpochSecond(zoneOffset0);
                }
                case 2: {
                    return (long)zoneOffset0.b;
                }
                default: {
                    return localDateTime0.z(temporalField0);
                }
            }
        }
        return temporalField0.w(this);
    }
}

