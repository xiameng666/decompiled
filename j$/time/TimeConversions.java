package j$.time;

import java.time.Duration;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeConversions {
    public static Instant convert(java.time.Instant instant0) {
        return instant0 == null ? null : Instant.ofEpochSecond(instant0.getEpochSecond(), instant0.getNano());
    }

    public static Duration convert(j..time.Duration duration0) {
        return duration0 == null ? null : Duration.ofSeconds(duration0.getSeconds(), duration0.getNano());
    }

    public static java.time.Instant convert(Instant instant0) {
        return instant0 == null ? null : java.time.Instant.ofEpochSecond(instant0.getEpochSecond(), instant0.getNano());
    }

    public static Period convert(j..time.Period period0) {
        return period0 == null ? null : Period.of(period0.getYears(), period0.b, period0.c);
    }

    public static ZonedDateTime convert(j..time.ZonedDateTime zonedDateTime0) {
        ZoneId zoneId0 = null;
        if(zonedDateTime0 == null) {
            return null;
        }
        int v = zonedDateTime0.a.a.getYear();
        int v1 = zonedDateTime0.a.a.getMonthValue();
        int v2 = zonedDateTime0.a.a.getDayOfMonth();
        int v3 = zonedDateTime0.getHour();
        int v4 = zonedDateTime0.a.getMinute();
        int v5 = zonedDateTime0.a.b.getSecond();
        int v6 = zonedDateTime0.a.b.getNano();
        j..time.ZoneId zoneId1 = zonedDateTime0.getZone();
        if(zoneId1 != null) {
            zoneId0 = ZoneId.of(zoneId1.getId());
        }
        return ZonedDateTime.of(v, v1, v2, v3, v4, v5, v6, zoneId0);
    }
}

