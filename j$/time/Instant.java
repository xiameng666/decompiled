package j$.time;

import j..desugar.sun.nio.fs.g;
import j..desugar.sun.nio.fs.n;
import j..time.format.DateTimeFormatter;
import j..time.temporal.ChronoField;
import j..time.temporal.ChronoUnit;
import j..time.temporal.Temporal;
import j..time.temporal.TemporalAccessor;
import j..time.temporal.TemporalAdjuster;
import j..time.temporal.TemporalAmount;
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

public final class Instant implements Temporal, TemporalAdjuster, Serializable, Comparable {
    public static final Instant EPOCH = null;
    public static final Instant MAX = null;
    public static final Instant MIN = null;
    public final long a;
    public final int b;
    private static final long serialVersionUID = 0xF6C2E8F0233A231CL;

    static {
        Instant.EPOCH = new Instant(0L, 0);
        Instant.MIN = Instant.ofEpochSecond(0xFF8FE31014641400L, 0L);
        Instant.MAX = Instant.ofEpochSecond(0x701CD2FA9578FFL, 0x3B9AC9FFL);
    }

    public Instant(long v, int v1) {
        this.a = v;
        this.b = v1;
    }

    @Override  // j$.time.temporal.TemporalAccessor
    public final Object B(TemporalQuery temporalQuery0) {
        if(temporalQuery0 == k.c) {
            return ChronoUnit.NANOS;
        }
        return temporalQuery0 == k.b || temporalQuery0 == k.a || temporalQuery0 == k.e || temporalQuery0 == k.d || temporalQuery0 == k.f || temporalQuery0 == k.g ? null : temporalQuery0.queryFrom(this);
    }

    public static Instant H(long v, int v1) {
        if((((long)v1) | v) == 0L) {
            return Instant.EPOCH;
        }
        if(v >= 0xFF8FE31014641400L && v <= 0x701CD2FA9578FFL) {
            return new Instant(v, v1);
        }
        throw __alloc_invoke__ DateTimeException, RuntimeException("Instant exceeds minimum or maximum instant");  // Mismatched object-allocation/constructor-invocation, likely indicating an inlined constructor call
    }

    public final Instant I(long v, long v1) {
        return (v | v1) == 0L ? this : Instant.ofEpochSecond(g.I(g.I(this.a, v), v1 / 1000000000L), ((long)this.b) + v1 % 1000000000L);
    }

    public final long J(Instant instant0) {
        long v = g.K(instant0.a, this.a);
        long v1 = (long)(instant0.b - this.b);
        int v2 = Long.compare(v, 0L);
        if(v2 > 0 && v1 < 0L) {
            return v - 1L;
        }
        return v2 >= 0 || v1 <= 0L ? v : v + 1L;
    }

    @Override  // j$.time.temporal.Temporal
    public final Temporal a(TemporalField temporalField0, long v) {
        if((temporalField0 instanceof ChronoField)) {
            ((ChronoField)temporalField0).B(v);
            int v1 = this.b;
            long v2 = this.a;
            switch(((ChronoField)temporalField0)) {
                case 1: {
                    return v == ((long)v1) ? this : Instant.H(v2, ((int)v));
                }
                case 2: {
                    return ((int)v) * 1000 == v1 ? this : Instant.H(v2, ((int)v) * 1000);
                }
                case 3: {
                    return ((int)v) * 1000000 == v1 ? this : Instant.H(v2, ((int)v) * 1000000);
                }
                case 4: {
                    return v == v2 ? this : Instant.H(v, v1);
                }
                default: {
                    throw __alloc_invoke__ l, RuntimeException("Unsupported field: " + temporalField0);  // Mismatched object-allocation/constructor-invocation, likely indicating an inlined constructor call
                }
            }
        }
        return (Instant)temporalField0.z(this, v);
    }

    public OffsetDateTime atOffset(ZoneOffset zoneOffset0) {
        return OffsetDateTime.I(this, zoneOffset0);
    }

    public ZonedDateTime atZone(ZoneId zoneId0) {
        return ZonedDateTime.ofInstant(this, zoneId0);
    }

    @Override  // j$.time.temporal.Temporal
    public final Temporal b(long v, TemporalUnit temporalUnit0) {
        return this.plus(v, temporalUnit0);
    }

    public int compareTo(Instant instant0) {
        int v = Long.compare(this.a, instant0.a);
        return v == 0 ? this.b - instant0.b : v;
    }

    @Override
    public final int compareTo(Object object0) {
        return this.compareTo(((Instant)object0));
    }

    @Override  // j$.time.temporal.TemporalAccessor
    public final boolean d(TemporalField temporalField0) {
        return (temporalField0 instanceof ChronoField) ? temporalField0 == ChronoField.INSTANT_SECONDS || temporalField0 == ChronoField.NANO_OF_SECOND || temporalField0 == ChronoField.MICRO_OF_SECOND || temporalField0 == ChronoField.MILLI_OF_SECOND : temporalField0 != null && temporalField0.g(this);
    }

    @Override
    public boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof Instant) && this.a == ((Instant)object0).a && this.b == ((Instant)object0).b;
    }

    public static Instant from(TemporalAccessor temporalAccessor0) {
        if((temporalAccessor0 instanceof Instant)) {
            return (Instant)temporalAccessor0;
        }
        Objects.requireNonNull(temporalAccessor0, "temporal");
        try {
            return Instant.ofEpochSecond(temporalAccessor0.z(ChronoField.INSTANT_SECONDS), temporalAccessor0.get(ChronoField.NANO_OF_SECOND));
        }
        catch(DateTimeException dateTimeException0) {
            throw __alloc_invoke__ DateTimeException, RuntimeException(c.a("Unable to obtain Instant from TemporalAccessor: ", String.valueOf(temporalAccessor0), " of type ", temporalAccessor0.getClass().getName()), dateTimeException0);  // Mismatched object-allocation/constructor-invocation, likely indicating an inlined constructor call
        }
    }

    @Override  // j$.time.temporal.Temporal
    public final Temporal g(LocalDate localDate0) {
        return (Instant)localDate0.n(this);
    }

    @Override  // j$.time.temporal.TemporalAccessor
    public final int get(TemporalField temporalField0) {
        if((temporalField0 instanceof ChronoField)) {
            int v = this.b;
            switch(((ChronoField)temporalField0)) {
                case 1: {
                    return v;
                }
                case 2: {
                    return v / 1000;
                }
                case 3: {
                    return v / 1000000;
                }
                case 4: {
                    ChronoField.INSTANT_SECONDS.b.a(ChronoField.INSTANT_SECONDS, this.a);
                }
            }
            throw __alloc_invoke__ l, RuntimeException("Unsupported field: " + temporalField0);  // Mismatched object-allocation/constructor-invocation, likely indicating an inlined constructor call
        }
        return k.d(this, temporalField0).a(temporalField0, temporalField0.w(this));
    }

    public long getEpochSecond() {
        return this.a;
    }

    public int getNano() {
        return this.b;
    }

    @Override
    public int hashCode() {
        return this.b * 51 + ((int)(this.a ^ this.a >>> 0x20));
    }

    @Override  // j$.time.temporal.TemporalAccessor
    public final m i(TemporalField temporalField0) {
        return k.d(this, temporalField0);
    }

    public boolean isAfter(Instant instant0) {
        return this.compareTo(instant0) > 0;
    }

    public boolean isBefore(Instant instant0) {
        return this.compareTo(instant0) < 0;
    }

    public Instant minus(long v, TemporalUnit temporalUnit0) {
        return v == 0x8000000000000000L ? this.plus(0x7FFFFFFFFFFFFFFFL, temporalUnit0).plus(1L, temporalUnit0) : this.plus(-v, temporalUnit0);
    }

    public Instant minus(TemporalAmount temporalAmount0) {
        return (Instant)temporalAmount0.i(this);
    }

    public Instant minusMillis(long v) {
        return v == 0x8000000000000000L ? this.plusMillis(0x7FFFFFFFFFFFFFFFL).plusMillis(1L) : this.plusMillis(-v);
    }

    public Instant minusSeconds(long v) {
        return v == 0x8000000000000000L ? this.plusSeconds(0x7FFFFFFFFFFFFFFFL).plusSeconds(1L) : this.plusSeconds(-v);
    }

    @Override  // j$.time.temporal.TemporalAdjuster
    public final Temporal n(Temporal temporal0) {
        return temporal0.a(ChronoField.INSTANT_SECONDS, this.a).a(ChronoField.NANO_OF_SECOND, ((long)this.b));
    }

    public static Instant now() {
        return Clock.systemUTC().instant();
    }

    public static Instant ofEpochMilli(long v) {
        return Instant.H(g.z(v, 1000L), ((int)g.H(v, 1000L)) * 1000000);
    }

    public static Instant ofEpochSecond(long v) {
        return Instant.H(v, 0);
    }

    public static Instant ofEpochSecond(long v, long v1) {
        return Instant.H(g.I(v, g.z(v1, 1000000000L)), ((int)g.H(v1, 1000000000L)));
    }

    public static Instant parse(CharSequence charSequence0) {
        n n0 = new n(1);
        return (Instant)DateTimeFormatter.i.parse(charSequence0, n0);
    }

    public Instant plus(long v, TemporalUnit temporalUnit0) {
        if((temporalUnit0 instanceof ChronoUnit)) {
            switch(((ChronoUnit)temporalUnit0)) {
                case 1: {
                    return this.I(0L, v);
                }
                case 2: {
                    return this.I(v / 1000000L, v % 1000000L * 1000L);
                }
                case 3: {
                    return this.plusMillis(v);
                }
                case 4: {
                    return this.plusSeconds(v);
                }
                case 5: {
                    return this.plusSeconds(g.J(v, 60L));
                }
                case 6: {
                    return this.plusSeconds(g.J(v, 3600L));
                }
                case 7: {
                    return this.plusSeconds(g.J(v, 43200L));
                }
                case 8: {
                    return this.plusSeconds(g.J(v, 86400L));
                }
                default: {
                    throw __alloc_invoke__ l, RuntimeException("Unsupported unit: " + temporalUnit0);  // Mismatched object-allocation/constructor-invocation, likely indicating an inlined constructor call
                }
            }
        }
        return (Instant)temporalUnit0.g(this, v);
    }

    public Instant plus(TemporalAmount temporalAmount0) {
        return (Instant)temporalAmount0.g(this);
    }

    public Instant plusMillis(long v) {
        return this.I(v / 1000L, v % 1000L * 1000000L);
    }

    public Instant plusSeconds(long v) {
        return this.I(v, 0L);
    }

    private void readObject(ObjectInputStream objectInputStream0) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public long toEpochMilli() {
        return Long.compare(this.a, 0L) >= 0 || this.b <= 0 ? g.I(g.J(this.a, 1000L), this.b / 1000000) : g.I(g.J(this.a + 1L, 1000L), this.b / 1000000 - 1000);
    }

    @Override
    public String toString() {
        return DateTimeFormatter.i.format(this);
    }

    public Instant truncatedTo(TemporalUnit temporalUnit0) {
        if(temporalUnit0 == ChronoUnit.NANOS) {
            return this;
        }
        Duration duration0 = temporalUnit0.getDuration();
        if(duration0.getSeconds() > 86400L) {
            throw __alloc_invoke__ l, RuntimeException("Unit is too large to be used for truncation");  // Mismatched object-allocation/constructor-invocation, likely indicating an inlined constructor call
        }
        long v = duration0.toNanos();
        if(86400000000000L % v != 0L) {
            throw __alloc_invoke__ l, RuntimeException("Unit must divide into a standard day without remainder");  // Mismatched object-allocation/constructor-invocation, likely indicating an inlined constructor call
        }
        long v1 = this.a % 86400L * 1000000000L + ((long)this.b);
        return this.I(0L, g.z(v1, v) * v - v1);
    }

    @Override  // j$.time.temporal.Temporal
    public long until(Temporal temporal0, TemporalUnit temporalUnit0) {
        Instant instant0 = Instant.from(temporal0);
        if((temporalUnit0 instanceof ChronoUnit)) {
            int v = this.b;
            long v1 = this.a;
            switch(((ChronoUnit)temporalUnit0)) {
                case 1: {
                    return g.I(g.J(g.K(instant0.a, v1), 1000000000L), instant0.b - v);
                }
                case 2: {
                    return g.I(g.J(g.K(instant0.a, v1), 1000000000L), instant0.b - v) / 1000L;
                }
                case 3: {
                    return g.K(instant0.toEpochMilli(), this.toEpochMilli());
                }
                case 4: {
                    return this.J(instant0);
                }
                case 5: {
                    return this.J(instant0) / 60L;
                }
                case 6: {
                    return this.J(instant0) / 3600L;
                }
                case 7: {
                    return this.J(instant0) / 43200L;
                }
                case 8: {
                    return this.J(instant0) / 86400L;
                }
                default: {
                    throw __alloc_invoke__ l, RuntimeException("Unsupported unit: " + temporalUnit0);  // Mismatched object-allocation/constructor-invocation, likely indicating an inlined constructor call
                }
            }
        }
        return temporalUnit0.between(this, instant0);
    }

    @Override  // j$.time.temporal.Temporal
    public final Temporal w(long v, ChronoUnit chronoUnit0) {
        return this.minus(v, chronoUnit0);
    }

    private Object writeReplace() {
        return new j..time.m(2, this);
    }

    @Override  // j$.time.temporal.TemporalAccessor
    public final long z(TemporalField temporalField0) {
        if((temporalField0 instanceof ChronoField)) {
            int v = this.b;
            switch(((ChronoField)temporalField0)) {
                case 1: {
                    return (long)v;
                }
                case 2: {
                    return (long)(v / 1000);
                }
                case 3: {
                    return (long)(v / 1000000);
                }
                case 4: {
                    return this.a;
                }
                default: {
                    throw __alloc_invoke__ l, RuntimeException("Unsupported field: " + temporalField0);  // Mismatched object-allocation/constructor-invocation, likely indicating an inlined constructor call
                }
            }
        }
        return temporalField0.w(this);
    }
}

