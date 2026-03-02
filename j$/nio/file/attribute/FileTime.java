package j$.nio.file.attribute;

import j..desugar.sun.nio.fs.g;
import j..time.Instant;
import j..time.LocalDate;
import j..time.LocalDateTime;
import j..time.LocalTime;
import j..time.ZoneOffset;
import j..util.Objects;
import java.util.concurrent.TimeUnit;

public final class FileTime implements Comparable {
    public final TimeUnit a;
    public final long b;
    public Instant c;
    public String d;

    public FileTime(long v, TimeUnit timeUnit0) {
        this.b = v;
        this.a = timeUnit0;
        this.c = null;
    }

    public int compareTo(FileTime fileTime0) {
        long v = this.b;
        TimeUnit timeUnit0 = this.a;
        if(timeUnit0 != null && timeUnit0 == fileTime0.a) {
            return Long.compare(v, fileTime0.b);
        }
        long v1 = this.w().getEpochSecond();
        int v2 = Long.compare(v1, fileTime0.w().getEpochSecond());
        if(v2 != 0) {
            return v2;
        }
        int v3 = Long.compare(this.w().getNano(), fileTime0.w().getNano());
        if(v3 != 0) {
            return v3;
        }
        if(v1 != 0x701CD2FA9578FFL && v1 != 0xFF8FE31014641400L) {
            return 0;
        }
        long v4 = timeUnit0 == null ? TimeUnit.SECONDS.toDays(this.w().getEpochSecond()) : timeUnit0.toDays(v);
        long v5 = fileTime0.a == null ? TimeUnit.SECONDS.toDays(fileTime0.w().getEpochSecond()) : fileTime0.a.toDays(fileTime0.b);
        return v4 == v5 ? Long.compare(this.n(v4), fileTime0.n(v5)) : Long.compare(v4, v5);
    }

    @Override
    public final int compareTo(Object object0) {
        return this.compareTo(((FileTime)object0));
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof FileTime) && this.compareTo(((FileTime)object0)) == 0;
    }

    public static FileTime from(long v, TimeUnit timeUnit0) {
        Objects.requireNonNull(timeUnit0, "unit");
        return new FileTime(v, timeUnit0);
    }

    public static FileTime fromMillis(long v) {
        return new FileTime(v, TimeUnit.MILLISECONDS);
    }

    public static void g(StringBuilder stringBuilder0, int v, int v1) {
        while(v > 0) {
            stringBuilder0.append(((char)(v1 / v + 0x30)));
            v1 %= v;
            v /= 10;
        }
    }

    @Override
    public final int hashCode() {
        return this.w().hashCode();
    }

    public static long i(long v, long v1, long v2) {
        if(v > v2) {
            return 0x7FFFFFFFFFFFFFFFL;
        }
        return v >= -v2 ? v * v1 : 0x8000000000000000L;
    }

    public final long n(long v) {
        TimeUnit timeUnit0 = this.a;
        if(timeUnit0 != null) {
            long v1 = timeUnit0.convert(v, TimeUnit.DAYS);
            return timeUnit0.toNanos(this.b - v1);
        }
        return TimeUnit.SECONDS.toNanos(this.w().getEpochSecond() - TimeUnit.DAYS.toSeconds(v));
    }

    public long toMillis() {
        TimeUnit timeUnit0 = this.a;
        if(timeUnit0 != null) {
            return timeUnit0.toMillis(this.b);
        }
        long v = this.c.getEpochSecond();
        int v1 = this.c.getNano();
        if((Math.abs(v) | 1000L) >>> 0x1F != 0L && v * 1000L / 1000L != v) {
            return v >= 0L ? 0x7FFFFFFFFFFFFFFFL : 0x8000000000000000L;
        }
        return v * 1000L + ((long)(v1 / 1000000));
    }

    @Override
    public final String toString() {
        int v3;
        LocalDateTime localDateTime0;
        long v2;
        int v1;
        long v;
        if(this.d == null) {
            if(this.c == null) {
                TimeUnit timeUnit0 = this.a;
                if(timeUnit0.compareTo(TimeUnit.SECONDS) >= 0) {
                    v = timeUnit0.toSeconds(this.b);
                    v1 = 0;
                }
                else {
                    v = this.w().getEpochSecond();
                    v1 = this.w().getNano();
                }
            }
            else {
                v = this.w().getEpochSecond();
                v1 = this.w().getNano();
            }
            if(Long.compare(v, 0xFFFFFFF1868B8400L) >= 0) {
                v2 = g.z(v - 253402300800L, 315569520000L) + 1L;
                localDateTime0 = LocalDateTime.I(g.H(v - 253402300800L, 315569520000L) - 0xE79747C00L, v1, ZoneOffset.UTC);
            }
            else {
                v2 = (v + 0xE79747C00L) / 315569520000L;
                localDateTime0 = LocalDateTime.I((v + 0xE79747C00L) % 315569520000L - 0xE79747C00L, v1, ZoneOffset.UTC);
            }
            v3 = localDateTime0.a.getYear();
            int v4 = ((int)v2) * 10000 + v3;
            LocalDate localDate0 = localDateTime0.a;
            LocalTime localTime0 = localDateTime0.b;
            if(v4 <= 0) {
                --v4;
            }
            int v5 = localTime0.getNano();
            StringBuilder stringBuilder0 = new StringBuilder(0x40);
            stringBuilder0.append((v4 >= 0 ? "" : "-"));
            int v6 = Math.abs(v4);
            if(v6 < 10000) {
                FileTime.g(stringBuilder0, 1000, Math.abs(v6));
            }
            else {
                stringBuilder0.append(String.valueOf(v6));
            }
            stringBuilder0.append('-');
            FileTime.g(stringBuilder0, 10, localDate0.getMonthValue());
            stringBuilder0.append('-');
            FileTime.g(stringBuilder0, 10, localDate0.getDayOfMonth());
            stringBuilder0.append('T');
            FileTime.g(stringBuilder0, 10, localTime0.getHour());
            stringBuilder0.append(':');
            FileTime.g(stringBuilder0, 10, localDateTime0.getMinute());
            stringBuilder0.append(':');
            FileTime.g(stringBuilder0, 10, localTime0.getSecond());
            if(v5 != 0) {
                stringBuilder0.append('.');
                int v7;
                for(v7 = 100000000; v5 % 10 == 0; v7 /= 10) {
                    v5 /= 10;
                }
                FileTime.g(stringBuilder0, v7, v5);
            }
            stringBuilder0.append('Z');
            this.d = stringBuilder0.toString();
        }
        return this.d;
    }

    public final Instant w() {
        long v2;
        if(this.c == null) {
            long v = this.b;
            int v1 = 0;
            switch(b0.a[this.a.ordinal()]) {
                case 1: {
                    v = FileTime.i(this.b, 86400L, 106751991167300L);
                    break;
                }
                case 2: {
                    v = FileTime.i(this.b, 3600L, 0x91A2B3C4D5E6FL);
                    break;
                }
                case 3: {
                    v = FileTime.i(this.b, 60L, 153722867280912930L);
                    break;
                }
                case 4: {
                    break;
                }
                case 5: {
                    v2 = g.z(v, 1000L);
                    v1 = ((int)g.H(v, 1000L)) * 1000000;
                    v = v2;
                    break;
                }
                case 6: {
                    v2 = g.z(v, 1000000L);
                    v1 = ((int)g.H(v, 1000000L)) * 1000;
                    v = v2;
                    break;
                }
                case 7: {
                    v2 = g.z(v, 1000000000L);
                    v1 = (int)g.H(v, 1000000000L);
                    v = v2;
                    break;
                }
                default: {
                    throw new AssertionError("Unit not handled");
                }
            }
            if(v <= 0xFF8FE31014641400L) {
                this.c = Instant.MIN;
                return this.c;
            }
            if(v >= 0x701CD2FA9578FFL) {
                this.c = Instant.MAX;
                return this.c;
            }
            this.c = Instant.ofEpochSecond(v, v1);
        }
        return this.c;
    }
}

