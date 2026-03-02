package j$.time.format;

import j..desugar.sun.nio.fs.g;
import j..time.DateTimeException;
import j..time.Instant;
import j..time.LocalDate;
import j..time.LocalTime;
import j..time.Period;
import j..time.ZoneId;
import j..time.ZoneOffset;
import j..time.c;
import j..time.chrono.ChronoLocalDate;
import j..time.chrono.Chronology;
import j..time.chrono.h;
import j..time.temporal.ChronoField;
import j..time.temporal.TemporalAccessor;
import j..time.temporal.TemporalField;
import j..time.temporal.TemporalQuery;
import j..time.temporal.k;
import j..time.temporal.l;
import j..time.temporal.m;
import j..util.Objects;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public final class b0 implements TemporalAccessor {
    public final HashMap a;
    public ZoneId b;
    public Chronology c;
    public boolean d;
    public c0 e;
    public ChronoLocalDate f;
    public LocalTime g;
    public Period h;

    public b0() {
        this.a = new HashMap();
        this.h = Period.d;
    }

    @Override  // j$.time.temporal.TemporalAccessor
    public final Object B(TemporalQuery temporalQuery0) {
        if(temporalQuery0 == k.a) {
            return this.b;
        }
        if(temporalQuery0 == k.b) {
            return this.c;
        }
        if(temporalQuery0 == k.f) {
            ChronoLocalDate chronoLocalDate0 = this.f;
            return chronoLocalDate0 != null ? LocalDate.J(chronoLocalDate0) : null;
        }
        if(temporalQuery0 == k.g) {
            return this.g;
        }
        if(temporalQuery0 == k.d) {
            Long long0 = (Long)this.a.get(ChronoField.OFFSET_SECONDS);
            if(long0 != null) {
                return ZoneOffset.ofTotalSeconds(long0.intValue());
            }
            return (this.b instanceof ZoneOffset) ? this.b : temporalQuery0.queryFrom(this);
        }
        if(temporalQuery0 == k.e) {
            return temporalQuery0.queryFrom(this);
        }
        return temporalQuery0 == k.c ? null : temporalQuery0.queryFrom(this);
    }

    public final void c(TemporalAccessor temporalAccessor0) {
        long v;
        Iterator iterator0 = this.a.entrySet().iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            Map.Entry map$Entry0 = (Map.Entry)object0;
            TemporalField temporalField0 = (TemporalField)map$Entry0.getKey();
            if(!temporalAccessor0.d(temporalField0)) {
                continue;
            }
            try {
                v = temporalAccessor0.z(temporalField0);
            }
            catch(RuntimeException unused_ex) {
                continue;
            }
            long v1 = (long)(((Long)map$Entry0.getValue()));
            if(v != v1) {
                throw __alloc_invoke__ DateTimeException, RuntimeException("Conflict found: Field " + temporalField0 + " " + v + " differs from " + temporalField0 + " " + v1 + " derived from " + temporalAccessor0);  // Mismatched object-allocation/constructor-invocation, likely indicating an inlined constructor call
            }
            iterator0.remove();
            continue;
        }
    }

    @Override  // j$.time.temporal.TemporalAccessor
    public final boolean d(TemporalField temporalField0) {
        return this.a.containsKey(temporalField0) || this.f != null && this.f.d(temporalField0) || (this.g != null && this.g.d(temporalField0) || temporalField0 != null && !(temporalField0 instanceof ChronoField) && temporalField0.g(this));
    }

    public final void e() {
        HashMap hashMap0 = this.a;
        if(hashMap0.containsKey(ChronoField.INSTANT_SECONDS)) {
            ZoneId zoneId0 = this.b;
            if(zoneId0 != null) {
                this.h(zoneId0);
                return;
            }
            Long long0 = (Long)hashMap0.get(ChronoField.OFFSET_SECONDS);
            if(long0 != null) {
                this.h(ZoneOffset.ofTotalSeconds(long0.intValue()));
            }
        }
    }

    @Override  // j$.time.temporal.TemporalAccessor
    public final int get(TemporalField temporalField0) {
        return k.a(this, temporalField0);
    }

    public final void h(ZoneId zoneId0) {
        Instant instant0 = Instant.ofEpochSecond(((Long)this.a.remove(ChronoField.INSTANT_SECONDS)).longValue());
        h h0 = this.c.G(instant0, zoneId0);
        this.m(h0.toLocalDate());
        Long long0 = (long)h0.toLocalTime().U();
        this.n(ChronoField.INSTANT_SECONDS, ChronoField.SECOND_OF_DAY, long0);
    }

    @Override  // j$.time.temporal.TemporalAccessor
    public final m i(TemporalField temporalField0) {
        return k.d(this, temporalField0);
    }

    public final void j(long v, long v1, long v2, long v3) {
        if(this.e == c0.LENIENT) {
            long v4 = g.I(g.I(g.I(g.J(v, 3600000000000L), g.J(v1, 60000000000L)), g.J(v2, 1000000000L)), v3);
            int v5 = (int)g.z(v4, 86400000000000L);
            this.l(LocalTime.M(g.H(v4, 86400000000000L)), Period.a(0, 0, v5));
            return;
        }
        int v6 = ChronoField.MINUTE_OF_HOUR.b.a(ChronoField.MINUTE_OF_HOUR, v1);
        int v7 = ChronoField.NANO_OF_SECOND.b.a(ChronoField.NANO_OF_SECOND, v3);
        if(this.e == c0.SMART && v == 24L && v6 == 0 && v2 == 0L && v7 == 0) {
            Period period0 = Period.a(0, 0, 1);
            this.l(LocalTime.MIDNIGHT, period0);
            return;
        }
        this.l(LocalTime.of(ChronoField.HOUR_OF_DAY.b.a(ChronoField.HOUR_OF_DAY, v), v6, ChronoField.SECOND_OF_MINUTE.b.a(ChronoField.SECOND_OF_MINUTE, v2), v7), Period.d);
    }

    public final void k() {
        ChronoField chronoField0 = ChronoField.CLOCK_HOUR_OF_DAY;
        HashMap hashMap0 = this.a;
        long v = 0L;
        if(hashMap0.containsKey(chronoField0)) {
            long v1 = (long)(((Long)hashMap0.remove(chronoField0)));
            if(this.e == c0.STRICT || this.e == c0.SMART && v1 != 0L) {
                chronoField0.B(v1);
            }
            ChronoField chronoField1 = ChronoField.HOUR_OF_DAY;
            if(v1 == 24L) {
                v1 = 0L;
            }
            this.n(chronoField0, chronoField1, Long.valueOf(v1));
        }
        ChronoField chronoField2 = ChronoField.CLOCK_HOUR_OF_AMPM;
        if(hashMap0.containsKey(chronoField2)) {
            long v2 = (long)(((Long)hashMap0.remove(chronoField2)));
            if(this.e == c0.STRICT || this.e == c0.SMART && v2 != 0L) {
                chronoField2.B(v2);
            }
            ChronoField chronoField3 = ChronoField.HOUR_OF_AMPM;
            if(v2 != 12L) {
                v = v2;
            }
            this.n(chronoField2, chronoField3, Long.valueOf(v));
        }
        ChronoField chronoField4 = ChronoField.AMPM_OF_DAY;
        if(hashMap0.containsKey(chronoField4)) {
            ChronoField chronoField5 = ChronoField.HOUR_OF_AMPM;
            if(hashMap0.containsKey(chronoField5)) {
                long v3 = (long)(((Long)hashMap0.remove(chronoField4)));
                long v4 = (long)(((Long)hashMap0.remove(chronoField5)));
                if(this.e == c0.LENIENT) {
                    Long long0 = g.I(g.J(v3, 12L), v4);
                    this.n(chronoField4, ChronoField.HOUR_OF_DAY, long0);
                }
                else {
                    chronoField4.B(v3);
                    chronoField5.B(v3);
                    this.n(chronoField4, ChronoField.HOUR_OF_DAY, Long.valueOf(v3 * 12L + v4));
                }
            }
        }
        ChronoField chronoField6 = ChronoField.NANO_OF_DAY;
        if(hashMap0.containsKey(chronoField6)) {
            long v5 = (long)(((Long)hashMap0.remove(chronoField6)));
            if(this.e != c0.LENIENT) {
                chronoField6.B(v5);
            }
            this.n(chronoField6, ChronoField.HOUR_OF_DAY, Long.valueOf(v5 / 3600000000000L));
            this.n(chronoField6, ChronoField.MINUTE_OF_HOUR, Long.valueOf(v5 / 60000000000L % 60L));
            this.n(chronoField6, ChronoField.SECOND_OF_MINUTE, Long.valueOf(v5 / 1000000000L % 60L));
            this.n(chronoField6, ChronoField.NANO_OF_SECOND, Long.valueOf(v5 % 1000000000L));
        }
        ChronoField chronoField7 = ChronoField.MICRO_OF_DAY;
        if(hashMap0.containsKey(chronoField7)) {
            long v6 = (long)(((Long)hashMap0.remove(chronoField7)));
            if(this.e != c0.LENIENT) {
                chronoField7.B(v6);
            }
            this.n(chronoField7, ChronoField.SECOND_OF_DAY, Long.valueOf(v6 / 1000000L));
            this.n(chronoField7, ChronoField.MICRO_OF_SECOND, Long.valueOf(v6 % 1000000L));
        }
        ChronoField chronoField8 = ChronoField.MILLI_OF_DAY;
        if(hashMap0.containsKey(chronoField8)) {
            long v7 = (long)(((Long)hashMap0.remove(chronoField8)));
            if(this.e != c0.LENIENT) {
                chronoField8.B(v7);
            }
            this.n(chronoField8, ChronoField.SECOND_OF_DAY, Long.valueOf(v7 / 1000L));
            this.n(chronoField8, ChronoField.MILLI_OF_SECOND, Long.valueOf(v7 % 1000L));
        }
        ChronoField chronoField9 = ChronoField.SECOND_OF_DAY;
        if(hashMap0.containsKey(chronoField9)) {
            long v8 = (long)(((Long)hashMap0.remove(chronoField9)));
            if(this.e != c0.LENIENT) {
                chronoField9.B(v8);
            }
            this.n(chronoField9, ChronoField.HOUR_OF_DAY, Long.valueOf(v8 / 3600L));
            this.n(chronoField9, ChronoField.MINUTE_OF_HOUR, Long.valueOf(v8 / 60L % 60L));
            this.n(chronoField9, ChronoField.SECOND_OF_MINUTE, Long.valueOf(v8 % 60L));
        }
        ChronoField chronoField10 = ChronoField.MINUTE_OF_DAY;
        if(hashMap0.containsKey(chronoField10)) {
            long v9 = (long)(((Long)hashMap0.remove(chronoField10)));
            if(this.e != c0.LENIENT) {
                chronoField10.B(v9);
            }
            this.n(chronoField10, ChronoField.HOUR_OF_DAY, Long.valueOf(v9 / 60L));
            this.n(chronoField10, ChronoField.MINUTE_OF_HOUR, Long.valueOf(v9 % 60L));
        }
        ChronoField chronoField11 = ChronoField.NANO_OF_SECOND;
        if(hashMap0.containsKey(chronoField11)) {
            long v10 = (long)(((Long)hashMap0.get(chronoField11)));
            c0 c00 = c0.LENIENT;
            if(this.e != c00) {
                chronoField11.B(v10);
            }
            ChronoField chronoField12 = ChronoField.MICRO_OF_SECOND;
            if(hashMap0.containsKey(chronoField12)) {
                long v11 = (long)(((Long)hashMap0.remove(chronoField12)));
                if(this.e != c00) {
                    chronoField12.B(v11);
                }
                v10 = v10 % 1000L + v11 * 1000L;
                this.n(chronoField12, chronoField11, Long.valueOf(v10));
            }
            ChronoField chronoField13 = ChronoField.MILLI_OF_SECOND;
            if(hashMap0.containsKey(chronoField13)) {
                long v12 = (long)(((Long)hashMap0.remove(chronoField13)));
                if(this.e != c00) {
                    chronoField13.B(v12);
                }
                this.n(chronoField13, chronoField11, Long.valueOf(v10 % 1000000L + v12 * 1000000L));
            }
        }
        ChronoField chronoField14 = ChronoField.HOUR_OF_DAY;
        if(hashMap0.containsKey(chronoField14)) {
            ChronoField chronoField15 = ChronoField.MINUTE_OF_HOUR;
            if(hashMap0.containsKey(chronoField15)) {
                ChronoField chronoField16 = ChronoField.SECOND_OF_MINUTE;
                if(hashMap0.containsKey(chronoField16) && hashMap0.containsKey(chronoField11)) {
                    this.j(((Long)hashMap0.remove(chronoField14)).longValue(), ((Long)hashMap0.remove(chronoField15)).longValue(), ((Long)hashMap0.remove(chronoField16)).longValue(), ((Long)hashMap0.remove(chronoField11)).longValue());
                }
            }
        }
    }

    public final void l(LocalTime localTime0, Period period0) {
        LocalTime localTime1 = this.g;
        if(localTime1 != null) {
            if(!localTime1.equals(localTime0)) {
                throw __alloc_invoke__ DateTimeException, RuntimeException(c.a("Conflict found: Fields resolved to different times: ", String.valueOf(this.g), " ", String.valueOf(localTime0)));  // Mismatched object-allocation/constructor-invocation, likely indicating an inlined constructor call
            }
            Period period1 = this.h;
            period1.getClass();
            if(period1 != Period.d && period0 != Period.d && !this.h.equals(period0)) {
                throw __alloc_invoke__ DateTimeException, RuntimeException(c.a("Conflict found: Fields resolved to different excess periods: ", String.valueOf(this.h), " ", String.valueOf(period0)));  // Mismatched object-allocation/constructor-invocation, likely indicating an inlined constructor call
            }
            this.h = period0;
            return;
        }
        this.g = localTime0;
        this.h = period0;
    }

    public final void m(ChronoLocalDate chronoLocalDate0) {
        ChronoLocalDate chronoLocalDate1 = this.f;
        if(chronoLocalDate1 != null) {
            if(chronoLocalDate0 != null && !chronoLocalDate1.equals(chronoLocalDate0)) {
                throw __alloc_invoke__ DateTimeException, RuntimeException(c.a("Conflict found: Fields resolved to two different dates: ", String.valueOf(this.f), " ", String.valueOf(chronoLocalDate0)));  // Mismatched object-allocation/constructor-invocation, likely indicating an inlined constructor call
            }
        }
        else if(chronoLocalDate0 != null) {
            if(!this.c.equals(chronoLocalDate0.getChronology())) {
                throw __alloc_invoke__ DateTimeException, RuntimeException("ChronoLocalDate must use the effective parsed chronology: " + this.c);  // Mismatched object-allocation/constructor-invocation, likely indicating an inlined constructor call
            }
            this.f = chronoLocalDate0;
        }
    }

    public final void n(TemporalField temporalField0, ChronoField chronoField0, Long long0) {
        Long long1 = (Long)this.a.put(chronoField0, long0);
        if(long1 != null && ((long)long1) != ((long)long0)) {
            throw __alloc_invoke__ DateTimeException, RuntimeException("Conflict found: " + chronoField0 + " " + long1 + " differs from " + chronoField0 + " " + long0 + " while resolving  " + temporalField0);  // Mismatched object-allocation/constructor-invocation, likely indicating an inlined constructor call
        }
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder(0x40);
        stringBuilder0.append(this.a);
        stringBuilder0.append(',');
        stringBuilder0.append(this.c);
        if(this.b != null) {
            stringBuilder0.append(',');
            stringBuilder0.append(this.b);
        }
        if(this.f != null || this.g != null) {
            stringBuilder0.append(" resolved to ");
            ChronoLocalDate chronoLocalDate0 = this.f;
            if(chronoLocalDate0 == null) {
                stringBuilder0.append(this.g);
            }
            else {
                stringBuilder0.append(chronoLocalDate0);
                if(this.g != null) {
                    stringBuilder0.append('T');
                    stringBuilder0.append(this.g);
                    return stringBuilder0.toString();
                }
            }
        }
        return stringBuilder0.toString();
    }

    @Override  // j$.time.temporal.TemporalAccessor
    public final long z(TemporalField temporalField0) {
        Objects.requireNonNull(temporalField0, "field");
        Long long0 = (Long)this.a.get(temporalField0);
        if(long0 != null) {
            return (long)long0;
        }
        if(this.f != null && this.f.d(temporalField0)) {
            return this.f.z(temporalField0);
        }
        if(this.g != null && this.g.d(temporalField0)) {
            return this.g.z(temporalField0);
        }
        if(!(temporalField0 instanceof ChronoField)) {
            return temporalField0.w(this);
        }
        throw __alloc_invoke__ l, RuntimeException("Unsupported field: " + temporalField0);  // Mismatched object-allocation/constructor-invocation, likely indicating an inlined constructor call
    }
}

