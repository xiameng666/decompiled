package j$.time.format;

import j..time.DateTimeException;
import j..time.Instant;
import j..time.ZoneId;
import j..time.ZoneOffset;
import j..time.c;
import j..time.chrono.ChronoLocalDate;
import j..time.chrono.Chronology;
import j..time.chrono.q;
import j..time.temporal.ChronoField;
import j..time.temporal.TemporalAccessor;
import j..time.temporal.TemporalField;
import j..time.temporal.TemporalQuery;
import j..time.temporal.k;
import j..time.zone.e;
import j..time.zone.f;
import j..util.Objects;

public final class x {
    public final TemporalAccessor a;
    public final DateTimeFormatter b;
    public int c;

    public x(TemporalAccessor temporalAccessor0, DateTimeFormatter dateTimeFormatter0) {
        ZoneId zoneId2;
        Chronology chronology0 = dateTimeFormatter0.e;
        ZoneId zoneId0 = dateTimeFormatter0.f;
        if(chronology0 != null || zoneId0 != null) {
            Chronology chronology1 = (Chronology)temporalAccessor0.B(k.b);
            ZoneId zoneId1 = (ZoneId)temporalAccessor0.B(k.a);
            ChronoLocalDate chronoLocalDate0 = null;
            if(Objects.equals(chronology0, chronology1)) {
                chronology0 = null;
            }
            if(Objects.equals(zoneId0, zoneId1)) {
                zoneId0 = null;
            }
            if(chronology0 != null || zoneId0 != null) {
                Chronology chronology2 = chronology0 == null ? chronology1 : chronology0;
                if(zoneId0 == null) {
                label_24:
                    if(zoneId0 != null) {
                        zoneId1 = zoneId0;
                    }
                    if(chronology0 != null) {
                        if(temporalAccessor0.d(ChronoField.EPOCH_DAY)) {
                            chronoLocalDate0 = chronology2.y(temporalAccessor0);
                        }
                        else if(chronology0 != q.d || chronology1 != null) {
                            ChronoField[] arr_chronoField = ChronoField.values();
                            for(int v = 0; v < arr_chronoField.length; ++v) {
                                ChronoField chronoField0 = arr_chronoField[v];
                                if(chronoField0.isDateBased() && temporalAccessor0.d(chronoField0)) {
                                    throw __alloc_invoke__ DateTimeException, RuntimeException(c.a("Unable to apply override chronology \'", String.valueOf(chronology0), "\' because the temporal object being formatted contains date fields but does not represent a whole date: ", String.valueOf(temporalAccessor0)));  // Mismatched object-allocation/constructor-invocation, likely indicating an inlined constructor call
                                }
                            }
                        }
                    }
                    temporalAccessor0 = new w(chronoLocalDate0, temporalAccessor0, chronology2, zoneId1);
                }
                else if(temporalAccessor0.d(ChronoField.INSTANT_SECONDS)) {
                    temporalAccessor0 = ((Chronology)Objects.requireNonNullElse(chronology2, q.d)).G(Instant.from(temporalAccessor0), zoneId0);
                }
                else {
                    try {
                        e e0 = zoneId0.I();
                        zoneId2 = e0.h() ? e0.d(Instant.EPOCH) : zoneId0;
                    }
                    catch(f unused_ex) {
                        zoneId2 = zoneId0;
                    }
                    if((zoneId2 instanceof ZoneOffset) && (temporalAccessor0.d(ChronoField.OFFSET_SECONDS) && temporalAccessor0.get(ChronoField.OFFSET_SECONDS) != zoneId0.I().d(Instant.EPOCH).b)) {
                        throw __alloc_invoke__ DateTimeException, RuntimeException(c.a("Unable to apply override zone \'", String.valueOf(zoneId0), "\' because the temporal object being formatted has a different offset but does not represent an instant: ", String.valueOf(temporalAccessor0)));  // Mismatched object-allocation/constructor-invocation, likely indicating an inlined constructor call
                    }
                    goto label_24;
                }
            }
        }
        this.a = temporalAccessor0;
        this.b = dateTimeFormatter0;
    }

    public final Long a(TemporalField temporalField0) {
        return this.c <= 0 || this.a.d(temporalField0) ? this.a.z(temporalField0) : null;
    }

    public final Object b(TemporalQuery temporalQuery0) {
        TemporalAccessor temporalAccessor0 = this.a;
        Object object0 = temporalAccessor0.B(temporalQuery0);
        if(object0 == null && this.c == 0) {
            throw __alloc_invoke__ DateTimeException, RuntimeException(c.a("Unable to extract ", String.valueOf(temporalQuery0), " from temporal ", String.valueOf(temporalAccessor0)));  // Mismatched object-allocation/constructor-invocation, likely indicating an inlined constructor call
        }
        return object0;
    }

    @Override
    public final String toString() {
        return this.a.toString();
    }
}

