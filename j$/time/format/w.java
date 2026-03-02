package j$.time.format;

import j..time.ZoneId;
import j..time.chrono.ChronoLocalDate;
import j..time.chrono.Chronology;
import j..time.temporal.TemporalAccessor;
import j..time.temporal.TemporalField;
import j..time.temporal.TemporalQuery;
import j..time.temporal.k;
import j..time.temporal.m;

public final class w implements TemporalAccessor {
    public final ChronoLocalDate a;
    public final TemporalAccessor b;
    public final Chronology c;
    public final ZoneId d;

    public w(ChronoLocalDate chronoLocalDate0, TemporalAccessor temporalAccessor0, Chronology chronology0, ZoneId zoneId0) {
        this.a = chronoLocalDate0;
        this.b = temporalAccessor0;
        this.c = chronology0;
        this.d = zoneId0;
    }

    @Override  // j$.time.temporal.TemporalAccessor
    public final Object B(TemporalQuery temporalQuery0) {
        if(temporalQuery0 == k.b) {
            return this.c;
        }
        if(temporalQuery0 == k.a) {
            return this.d;
        }
        return temporalQuery0 == k.c ? this.b.B(temporalQuery0) : temporalQuery0.queryFrom(this);
    }

    @Override  // j$.time.temporal.TemporalAccessor
    public final boolean d(TemporalField temporalField0) {
        return this.a == null || !temporalField0.isDateBased() ? this.b.d(temporalField0) : this.a.d(temporalField0);
    }

    @Override  // j$.time.temporal.TemporalAccessor
    public final int get(TemporalField temporalField0) {
        return k.a(this, temporalField0);
    }

    @Override  // j$.time.temporal.TemporalAccessor
    public final m i(TemporalField temporalField0) {
        return this.a == null || !temporalField0.isDateBased() ? this.b.i(temporalField0) : this.a.i(temporalField0);
    }

    @Override
    public final String toString() {
        String s = String.valueOf(this.b);
        String s1 = "";
        String s2 = this.c == null ? "" : " with chronology " + this.c;
        ZoneId zoneId0 = this.d;
        if(zoneId0 != null) {
            s1 = " with zone " + zoneId0;
        }
        return s + s2 + s1;
    }

    @Override  // j$.time.temporal.TemporalAccessor
    public final long z(TemporalField temporalField0) {
        return this.a == null || !temporalField0.isDateBased() ? this.b.z(temporalField0) : this.a.z(temporalField0);
    }
}

