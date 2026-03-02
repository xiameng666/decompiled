package j$.time.zone;

import j..desugar.sun.nio.fs.g;
import j..time.Clock;
import j..time.DayOfWeek;
import j..time.Instant;
import j..time.LocalDate;
import j..time.LocalDateTime;
import j..time.LocalTime;
import j..time.Month;
import j..time.ZoneOffset;
import j..time.chrono.q;
import j..time.temporal.ChronoField;
import j..time.temporal.TemporalAdjusters;
import j..time.temporal.j;
import j..util.Objects;
import j..util.concurrent.ConcurrentHashMap;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TimeZone;

public final class e implements Serializable {
    public final long[] a;
    public final ZoneOffset[] b;
    public final long[] c;
    public final LocalDateTime[] d;
    public final ZoneOffset[] e;
    public final d[] f;
    public final TimeZone g;
    public final transient ConcurrentHashMap h;
    public static final long[] i = null;
    public static final d[] j = null;
    public static final LocalDateTime[] k = null;
    public static final b[] l = null;
    private static final long serialVersionUID = 0x2A3F985312278703L;

    static {
        e.i = new long[0];
        e.j = new d[0];
        e.k = new LocalDateTime[0];
        e.l = new b[0];
    }

    public e(ZoneOffset zoneOffset0) {
        this.h = new ConcurrentHashMap();
        ZoneOffset[] arr_zoneOffset = new ZoneOffset[1];
        this.b = arr_zoneOffset;
        arr_zoneOffset[0] = zoneOffset0;
        this.a = e.i;
        this.c = e.i;
        this.d = e.k;
        this.e = arr_zoneOffset;
        this.f = e.j;
        this.g = null;
    }

    public e(TimeZone timeZone0) {
        this.h = new ConcurrentHashMap();
        ZoneOffset[] arr_zoneOffset = new ZoneOffset[1];
        this.b = arr_zoneOffset;
        arr_zoneOffset[0] = e.i(timeZone0.getRawOffset());
        this.a = e.i;
        this.c = e.i;
        this.d = e.k;
        this.e = arr_zoneOffset;
        this.f = e.j;
        this.g = timeZone0;
    }

    public e(long[] arr_v, ZoneOffset[] arr_zoneOffset, long[] arr_v1, ZoneOffset[] arr_zoneOffset1, d[] arr_d) {
        this.h = new ConcurrentHashMap();
        this.a = arr_v;
        this.b = arr_zoneOffset;
        this.c = arr_v1;
        this.e = arr_zoneOffset1;
        this.f = arr_d;
        if(arr_v1.length == 0) {
            this.d = e.k;
        }
        else {
            ArrayList arrayList0 = new ArrayList();
            for(int v = 0; v < arr_v1.length; ++v) {
                ZoneOffset zoneOffset0 = arr_zoneOffset1[v];
                ZoneOffset zoneOffset1 = arr_zoneOffset1[v + 1];
                LocalDateTime localDateTime0 = LocalDateTime.I(arr_v1[v], 0, zoneOffset0);
                int v1 = zoneOffset0.b;
                int v2 = zoneOffset1.b;
                if(v2 > v1) {
                    arrayList0.add(localDateTime0);
                    arrayList0.add(localDateTime0.M(((long)(zoneOffset1.b - v1))));
                }
                else {
                    arrayList0.add(localDateTime0.M(((long)(v2 - v1))));
                    arrayList0.add(localDateTime0);
                }
            }
            this.d = (LocalDateTime[])arrayList0.toArray(new LocalDateTime[arrayList0.size()]);
        }
        this.g = null;
    }

    public static Object a(LocalDateTime localDateTime0, b b0) {
        LocalDateTime localDateTime1 = b0.b;
        LocalDateTime localDateTime2 = b0.b;
        Object object0 = b0.d;
        Object object1 = b0.c;
        if(b0.g()) {
            if(localDateTime0.isBefore(localDateTime1)) {
                return object1;
            }
            return !localDateTime0.isBefore(localDateTime2.M(((long)(object0.b - object1.b)))) ? object0 : b0;
        }
        if(!localDateTime0.isBefore(localDateTime1)) {
            return object0;
        }
        return localDateTime0.isBefore(localDateTime2.M(((long)(object0.b - object1.b)))) ? object1 : b0;
    }

    public final b[] b(int v) {
        int v9;
        LocalDate localDate0;
        d[] arr_d1;
        Integer integer0 = v;
        ConcurrentHashMap concurrentHashMap0 = this.h;
        b[] arr_b = (b[])concurrentHashMap0.get(integer0);
        if(arr_b != null) {
            return arr_b;
        }
        TimeZone timeZone0 = this.g;
        if(timeZone0 != null) {
            b[] arr_b1 = e.l;
            if(v < 1800) {
                return arr_b1;
            }
            long v1 = new LocalDateTime(LocalDate.of(v - 1, 12, 0x1F), LocalTime.L(0, 0)).toEpochSecond(this.b[0]);
            int v2 = timeZone0.getOffset(v1 * 1000L);
            while(v1 < 31968000L + v1) {
                long v3 = v1 + 7776000L;
                if(v2 == timeZone0.getOffset(v3 * 1000L)) {
                    v1 = v3;
                }
                else {
                    while(v3 - v1 > 1L) {
                        long v4 = g.z(v3 + v1, 2L);
                        if(timeZone0.getOffset(v4 * 1000L) == v2) {
                            v1 = v4;
                        }
                        else {
                            v3 = v4;
                            v1 = v1;
                        }
                    }
                    v1 = timeZone0.getOffset(v1 * 1000L) == v2 ? v3 : v1;
                    ZoneOffset zoneOffset0 = e.i(v2);
                    int v5 = timeZone0.getOffset(v1 * 1000L);
                    ZoneOffset zoneOffset1 = e.i(v5);
                    if(e.c(v1, zoneOffset1) == v) {
                        b[] arr_b2 = (b[])Arrays.copyOf(arr_b1, arr_b1.length + 1);
                        arr_b2[arr_b2.length - 1] = new b(v1, zoneOffset0, zoneOffset1);
                        v2 = v5;
                        arr_b1 = arr_b2;
                    }
                    else {
                        v2 = v5;
                    }
                }
            }
            if(0x77C <= v && v < 2100) {
                concurrentHashMap0.putIfAbsent(integer0, arr_b1);
            }
            return arr_b1;
        }
        d[] arr_d = this.f;
        b[] arr_b3 = new b[arr_d.length];
        int v6 = 0;
        while(v6 < arr_d.length) {
            d d0 = arr_d[v6];
            ZoneOffset zoneOffset2 = d0.h;
            DayOfWeek dayOfWeek0 = d0.c;
            Month month0 = d0.a;
            int v7 = d0.b;
            if(v7 < 0) {
                arr_d1 = arr_d;
                int v8 = month0.I(q.d.isLeapYear(((long)v))) + 1 + v7;
                ChronoField.YEAR.B(((long)v));
                Objects.requireNonNull(month0, "month");
                ChronoField.DAY_OF_MONTH.B(((long)v8));
                localDate0 = LocalDate.I(v, month0.getValue(), v8);
                if(dayOfWeek0 != null) {
                    localDate0 = localDate0.with(TemporalAdjusters.previousOrSame(dayOfWeek0));
                }
                v9 = v6;
            }
            else {
                arr_d1 = arr_d;
                v9 = v6;
                ChronoField.YEAR.B(((long)v));
                Objects.requireNonNull(month0, "month");
                ChronoField.DAY_OF_MONTH.B(((long)v7));
                localDate0 = LocalDate.I(v, month0.getValue(), v7);
                if(dayOfWeek0 != null) {
                    localDate0 = localDate0.with(new j(dayOfWeek0.getValue(), 0));
                }
            }
            if(d0.e) {
                localDate0 = localDate0.plusDays(1L);
            }
            LocalDateTime localDateTime0 = LocalDateTime.of(localDate0, d0.d);
            ZoneOffset zoneOffset3 = d0.g;
            switch(d0.f.ordinal()) {
                case 0: {
                    localDateTime0 = localDateTime0.M(((long)(zoneOffset2.b - ZoneOffset.UTC.b)));
                    break;
                }
                case 2: {
                    localDateTime0 = localDateTime0.M(((long)(zoneOffset2.b - zoneOffset3.b)));
                }
            }
            arr_b3[v9] = new b(localDateTime0, zoneOffset2, d0.i);
            v6 = v9 + 1;
            arr_d = arr_d1;
        }
        if(v < 2100) {
            concurrentHashMap0.putIfAbsent(integer0, arr_b3);
        }
        return arr_b3;
    }

    public static int c(long v, ZoneOffset zoneOffset0) {
        return LocalDate.Q(g.z(v + ((long)zoneOffset0.b), 86400L)).getYear();
    }

    public final ZoneOffset d(Instant instant0) {
        TimeZone timeZone0 = this.g;
        if(timeZone0 != null) {
            return e.i(timeZone0.getOffset(instant0.toEpochMilli()));
        }
        long[] arr_v = this.c;
        if(arr_v.length == 0) {
            return this.b[0];
        }
        long v1 = instant0.getEpochSecond();
        ZoneOffset[] arr_zoneOffset = this.e;
        if(this.f.length > 0 && v1 > arr_v[arr_v.length - 1]) {
            b[] arr_b = this.b(e.c(v1, arr_zoneOffset[arr_zoneOffset.length - 1]));
            b b0 = null;
            for(int v = 0; v < arr_b.length; ++v) {
                b0 = arr_b[v];
                if(v1 < b0.a) {
                    return b0.c;
                }
            }
            return b0.d;
        }
        int v2 = Arrays.binarySearch(arr_v, v1);
        if(v2 < 0) {
            v2 = -v2 - 2;
        }
        return arr_zoneOffset[v2 + 1];
    }

    public final Object e(LocalDateTime localDateTime0) {
        b[] arr_b1;
        Object object0 = null;
        ZoneOffset[] arr_zoneOffset = this.b;
        int v = 0;
        TimeZone timeZone0 = this.g;
        if(timeZone0 != null) {
            b[] arr_b = this.b(localDateTime0.a.getYear());
            if(arr_b.length == 0) {
                return e.i(timeZone0.getOffset(localDateTime0.toEpochSecond(arr_zoneOffset[0]) * 1000L));
            }
            while(v < arr_b.length) {
                b b0 = arr_b[v];
                Object object1 = e.a(localDateTime0, b0);
                if(!(object1 instanceof b) && !object1.equals(b0.c)) {
                    ++v;
                    object0 = object1;
                    continue;
                }
                return object1;
            }
            return object0;
        }
        if(this.c.length == 0) {
            return arr_zoneOffset[0];
        }
        LocalDateTime[] arr_localDateTime = this.d;
        if(this.f.length > 0) {
            LocalDateTime localDateTime1 = arr_localDateTime[arr_localDateTime.length - 1];
            if(localDateTime1 == null) {
                int v1 = Long.compare(localDateTime0.a.toEpochDay(), null.a.toEpochDay());
                if(v1 > 0 || v1 == 0 && localDateTime0.toLocalTime().T() > null.toLocalTime().T()) {
                    arr_b1 = this.b(localDateTime0.a.getYear());
                label_29:
                    while(v < arr_b1.length) {
                        b b1 = arr_b1[v];
                        Object object2 = e.a(localDateTime0, b1);
                        if(!(object2 instanceof b) && !object2.equals(b1.c)) {
                            ++v;
                            object0 = object2;
                            continue;
                        }
                        return object2;
                    }
                    return object0;
                }
            }
            else if(localDateTime0.H(localDateTime1) > 0) {
                arr_b1 = this.b(localDateTime0.a.getYear());
                goto label_29;
            }
        }
        int v2 = Arrays.binarySearch(arr_localDateTime, localDateTime0);
        ZoneOffset[] arr_zoneOffset1 = this.e;
        if(v2 == -1) {
            return arr_zoneOffset1[0];
        }
        if(v2 < 0) {
            v2 = -v2 - 2;
        }
        else if(v2 < arr_localDateTime.length - 1 && arr_localDateTime[v2].equals(arr_localDateTime[v2 + 1])) {
            ++v2;
        }
        if((v2 & 1) == 0) {
            LocalDateTime localDateTime2 = arr_localDateTime[v2];
            LocalDateTime localDateTime3 = arr_localDateTime[v2 + 1];
            ZoneOffset zoneOffset0 = arr_zoneOffset1[v2 / 2];
            ZoneOffset zoneOffset1 = arr_zoneOffset1[v2 / 2 + 1];
            return zoneOffset1.b <= zoneOffset0.b ? new b(localDateTime3, zoneOffset0, zoneOffset1) : new b(localDateTime2, zoneOffset0, zoneOffset1);
        }
        return arr_zoneOffset1[v2 / 2 + 1];
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof e) && Objects.equals(this.g, ((e)object0).g) && Arrays.equals(this.a, ((e)object0).a) && Arrays.equals(this.b, ((e)object0).b) && Arrays.equals(this.c, ((e)object0).c) && Arrays.equals(this.e, ((e)object0).e) && Arrays.equals(this.f, ((e)object0).f);
    }

    public final List f(LocalDateTime localDateTime0) {
        Object object0 = this.e(localDateTime0);
        if((object0 instanceof b)) {
            return ((b)object0).g() ? Collections.EMPTY_LIST : g.C(new Object[]{((b)object0).c, ((b)object0).d});
        }
        return Collections.singletonList(((ZoneOffset)object0));
    }

    public final boolean g(Instant instant0) {
        TimeZone timeZone0 = this.g;
        if(timeZone0 != null) {
            return e.i(timeZone0.getRawOffset()).equals(this.d(instant0)) ^ 1;
        }
        ZoneOffset[] arr_zoneOffset = this.b;
        if(this.c.length == 0) {
            return arr_zoneOffset[0].equals(this.d(instant0)) ^ 1;
        }
        int v = Arrays.binarySearch(this.a, instant0.getEpochSecond());
        if(v < 0) {
            v = -v - 2;
        }
        return arr_zoneOffset[v + 1].equals(this.d(instant0)) ^ 1;
    }

    public final boolean h() {
        TimeZone timeZone0 = this.g;
        if(timeZone0 != null) {
            if(!timeZone0.useDaylightTime() && timeZone0.getDSTSavings() == 0) {
                Instant instant0 = Instant.now();
                long v = instant0.getEpochSecond();
                v = instant0.getNano() <= 0 || v >= 0x7FFFFFFFFFFFFFFFL ? instant0.getEpochSecond() : v + 1L;
                int v1 = e.c(v, this.d(instant0));
                b[] arr_b = this.b(v1);
                for(int v2 = arr_b.length - 1; v2 >= 0; --v2) {
                    b b0 = arr_b[v2];
                    if(v > b0.a) {
                        return b0 == null;
                    }
                }
                if(v1 > 1800) {
                    b[] arr_b1 = this.b(v1 - 1);
                    for(int v3 = arr_b1.length - 1; v3 >= 0; --v3) {
                        b b1 = arr_b1[v3];
                        if(v > b1.a) {
                            return b1 == null;
                        }
                    }
                    long v4 = Math.min(v - 31104000L, Clock.systemUTC().millis() / 1000L + 31968000L);
                    int v5 = timeZone0.getOffset((v - 1L) * 1000L);
                    long v6 = LocalDate.of(1800, 1, 1).toEpochDay() * 86400L;
                    while(v6 <= v4) {
                        int v7 = timeZone0.getOffset(v4 * 1000L);
                        if(v5 != v7) {
                            int v8 = e.c(v4, e.i(v7));
                            b[] arr_b2 = this.b(v8 + 1);
                            for(int v9 = arr_b2.length - 1; v9 >= 0; --v9) {
                                b b2 = arr_b2[v9];
                                if(v > b2.a) {
                                    return b2 == null;
                                }
                            }
                            b[] arr_b3 = this.b(v8);
                            return arr_b3[arr_b3.length - 1] == null;
                        }
                        v4 -= 7776000L;
                    }
                }
                return true;
            }
            return false;
        }
        return this.c.length == 0;
    }

    @Override
    public final int hashCode() {
        int v = Arrays.hashCode(this.a);
        int v1 = Arrays.hashCode(this.b);
        int v2 = Arrays.hashCode(this.c);
        int v3 = Arrays.hashCode(this.e);
        int v4 = Arrays.hashCode(this.f);
        return Objects.hashCode(this.g) ^ v ^ v1 ^ v2 ^ v3 ^ v4;
    }

    public static ZoneOffset i(int v) {
        return ZoneOffset.ofTotalSeconds(v / 1000);
    }

    private void readObject(ObjectInputStream objectInputStream0) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override
    public final String toString() {
        return this.g == null ? "ZoneRules[currentStandardOffset=" + this.b[this.b.length - 1] + "]" : "ZoneRules[timeZone=" + this.g.getID() + "]";
    }

    private Object writeReplace() {
        return this.g == null ? new a(1, this) : new a(100, this);
    }
}

