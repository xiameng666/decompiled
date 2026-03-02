package j$.time.format;

import j..desugar.sun.nio.fs.g;
import j..time.LocalDate;
import j..time.LocalDateTime;
import j..time.LocalTime;
import j..time.ZoneOffset;
import j..time.temporal.ChronoField;

public final class h implements e {
    @Override  // j$.time.format.e
    public final boolean g(x x0, StringBuilder stringBuilder0) {
        Long long0 = x0.a(ChronoField.INSTANT_SECONDS);
        ChronoField chronoField0 = ChronoField.NANO_OF_SECOND;
        Long long1 = x0.a.d(chronoField0) ? x0.a.z(chronoField0) : null;
        if(long0 == null) {
            return false;
        }
        long v1 = (long)long0;
        int v2 = chronoField0.b.a(chronoField0, (long1 == null ? 0L : ((long)long1)));
        if(Long.compare(v1, 0xFFFFFFF1868B8400L) >= 0) {
            long v3 = g.z(v1 - 253402300800L, 315569520000L) + 1L;
            LocalDateTime localDateTime0 = LocalDateTime.I(g.H(v1 - 253402300800L, 315569520000L) - 0xE79747C00L, 0, ZoneOffset.UTC);
            if(v3 > 0L) {
                stringBuilder0.append('+');
                stringBuilder0.append(v3);
            }
            stringBuilder0.append(localDateTime0);
            if(localDateTime0.b.getSecond() == 0) {
                stringBuilder0.append(":00");
            }
        }
        else {
            long v4 = (v1 + 0xE79747C00L) / 315569520000L;
            long v5 = (v1 + 0xE79747C00L) % 315569520000L;
            LocalDateTime localDateTime1 = LocalDateTime.I(v5 - 0xE79747C00L, 0, ZoneOffset.UTC);
            int v6 = stringBuilder0.length();
            stringBuilder0.append(localDateTime1);
            if(localDateTime1.b.getSecond() == 0) {
                stringBuilder0.append(":00");
            }
            if(v4 < 0L) {
                if(localDateTime1.a.getYear() == -10000) {
                    stringBuilder0.replace(v6, v6 + 2, Long.toString(v4 - 1L));
                }
                else if(v5 == 0L) {
                    stringBuilder0.insert(v6, v4);
                }
                else {
                    stringBuilder0.insert(v6 + 1, Math.abs(v4));
                }
            }
        }
        if(v2 > 0) {
            stringBuilder0.append('.');
            int v7 = 100000000;
            for(int v = 0; v2 > 0 || v % 3 != 0 || v < -2; ++v) {
                int v8 = v2 / v7;
                stringBuilder0.append(((char)(v8 + 0x30)));
                v2 -= v8 * v7;
                v7 /= 10;
            }
        }
        stringBuilder0.append('Z');
        return true;
    }

    @Override  // j$.time.format.e
    public final int i(v v0, CharSequence charSequence0, int v1) {
        DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder0.a(DateTimeFormatter.g);
        dateTimeFormatterBuilder0.d('T');
        ChronoField chronoField0 = ChronoField.HOUR_OF_DAY;
        dateTimeFormatterBuilder0.l(chronoField0, 2);
        dateTimeFormatterBuilder0.d(':');
        ChronoField chronoField1 = ChronoField.MINUTE_OF_HOUR;
        dateTimeFormatterBuilder0.l(chronoField1, 2);
        dateTimeFormatterBuilder0.d(':');
        ChronoField chronoField2 = ChronoField.SECOND_OF_MINUTE;
        dateTimeFormatterBuilder0.l(chronoField2, 2);
        ChronoField chronoField3 = ChronoField.NANO_OF_SECOND;
        int v2 = 1;
        dateTimeFormatterBuilder0.b(chronoField3, 0, 9, true);
        dateTimeFormatterBuilder0.d('Z');
        d d0 = dateTimeFormatterBuilder0.toFormatter().a;
        if(d0.b) {
            d0 = new d(d0.a, false);
        }
        v v3 = new v(v0.a);
        v3.b = v0.b;
        v3.c = v0.c;
        int v4 = d0.i(v3, charSequence0, v1);
        if(v4 < 0) {
            return v4;
        }
        long v5 = (long)v3.d(ChronoField.YEAR);
        int v6 = v3.d(ChronoField.MONTH_OF_YEAR).intValue();
        int v7 = v3.d(ChronoField.DAY_OF_MONTH).intValue();
        int v8 = v3.d(chronoField0).intValue();
        int v9 = v3.d(chronoField1).intValue();
        Long long0 = v3.d(chronoField2);
        Long long1 = v3.d(chronoField3);
        int v10 = long0 == null ? 0 : long0.intValue();
        int v11 = long1 == null ? 0 : long1.intValue();
        if(v8 == 24 && v9 == 0 && v10 == 0 && v11 == 0) {
            v8 = 0;
        }
        else if(v8 == 23 && v9 == 59 && v10 == 60) {
            v0.c().d = true;
            v2 = 0;
            v10 = 59;
        }
        else {
            v2 = 0;
        }
        try {
            long v12 = new LocalDateTime(LocalDate.of(((int)v5) % 10000, v6, v7), LocalTime.of(v8, v9, v10, 0)).K(((long)v2)).toEpochSecond(ZoneOffset.UTC);
            long v13 = g.J(v5 / 10000L, 315569520000L);
            return v0.f(chronoField3, ((long)v11), v1, v0.f(ChronoField.INSTANT_SECONDS, v12 + v13, v1, v4));
        }
        catch(RuntimeException unused_ex) {
            return ~v1;
        }
    }

    @Override
    public final String toString() {
        return "Instant()";
    }
}

