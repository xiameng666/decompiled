package j$.time.format;

import j..time.Instant;
import j..time.LocalDate;
import j..time.LocalDateTime;
import j..time.LocalTime;
import j..time.ZoneId;
import j..time.ZoneOffset;
import j..time.temporal.ChronoField;
import j..time.temporal.TemporalAccessor;
import j..time.temporal.k;
import j..time.zone.b;
import j..time.zone.h;
import j..util.Objects;
import j..util.concurrent.ConcurrentHashMap;
import java.lang.ref.SoftReference;
import java.text.DateFormatSymbols;
import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;

public final class u extends t {
    public final TextStyle e;
    public final boolean f;
    public final HashMap g;
    public final HashMap h;
    public static final ConcurrentHashMap i;

    static {
        u.i = new ConcurrentHashMap();
    }

    public u(TextStyle textStyle0, boolean z) {
        super(k.e, "ZoneText(" + textStyle0 + ")");
        this.g = new HashMap();
        this.h = new HashMap();
        this.e = (TextStyle)Objects.requireNonNull(textStyle0, "textStyle");
        this.f = z;
    }

    @Override  // j$.time.format.t
    public final n a(v v0) {
        if(this.e == TextStyle.NARROW) {
            return super.a(v0);
        }
        Locale locale0 = v0.a.b;
        Set set0 = h.d;
        int v1 = set0.size();
        HashMap hashMap0 = v0.b ? this.g : this.h;
        Map.Entry map$Entry0 = (Map.Entry)hashMap0.get(locale0);
        if(map$Entry0 != null && ((int)(((Integer)map$Entry0.getKey()))) == v1) {
            n n0 = (n)((SoftReference)map$Entry0.getValue()).get();
            if(n0 != null) {
                return n0;
            }
        }
        n n1 = v0.b ? new n("", null, null) : __alloc_invoke__ m, n("", null, null);  // Mismatched object-allocation/constructor-invocation, likely indicating an inlined constructor call
        String[][] arr2_s = DateFormatSymbols.getInstance(locale0).getZoneStrings();
        for(int v2 = 0; v2 < arr2_s.length; ++v2) {
            String[] arr_s = arr2_s[v2];
            String s = arr_s[0];
            if(set0.contains(s)) {
                n1.a(s, s);
                HashMap hashMap1 = e0.g;
                HashMap hashMap2 = e0.d;
                String s1 = (String)hashMap2.get(s);
                if(s1 == null && hashMap1.containsKey(s)) {
                    s = (String)hashMap1.get(s);
                    s1 = (String)hashMap2.get(s);
                }
                if(s1 != null) {
                    Map map0 = (Map)e0.f.get(s1);
                    s = map0 == null || !map0.containsKey(locale0.getCountry()) ? ((String)e0.e.get(s1)) : ((String)map0.get(locale0.getCountry()));
                }
                if(hashMap1.containsKey(s)) {
                    s = (String)hashMap1.get(s);
                }
                for(int v3 = this.e == TextStyle.FULL ? 1 : 2; v3 < arr_s.length; v3 += 2) {
                    n1.a(arr_s[v3], s);
                }
            }
        }
        hashMap0.put(locale0, new AbstractMap.SimpleImmutableEntry(v1, new SoftReference(n1)));
        return n1;
    }

    @Override  // j$.time.format.t
    public final boolean g(x x0, StringBuilder stringBuilder0) {
        String[] arr_s;
        boolean z;
        ZoneId zoneId0 = (ZoneId)x0.b(k.a);
        if(zoneId0 == null) {
            return false;
        }
        String s = zoneId0.getId();
        if(!(zoneId0 instanceof ZoneOffset)) {
            TemporalAccessor temporalAccessor0 = x0.a;
            Map map0 = null;
            if(this.f) {
                z = false;
            }
            else if(temporalAccessor0.d(ChronoField.INSTANT_SECONDS)) {
                z = zoneId0.I().g(Instant.from(temporalAccessor0));
            }
            else {
                ChronoField chronoField0 = ChronoField.EPOCH_DAY;
                if(temporalAccessor0.d(chronoField0)) {
                    ChronoField chronoField1 = ChronoField.NANO_OF_DAY;
                    if(temporalAccessor0.d(chronoField1)) {
                        LocalDateTime localDateTime0 = LocalDate.Q(temporalAccessor0.z(chronoField0)).atTime(LocalTime.M(temporalAccessor0.z(chronoField1)));
                        Object object0 = zoneId0.I().e(localDateTime0);
                        z = ((object0 instanceof b) ? ((b)object0) : null) == null ? zoneId0.I().g(localDateTime0.atZone(zoneId0).toInstant()) : false;
                    }
                    else {
                        z = false;
                    }
                }
                else {
                    z = false;
                }
            }
            Locale locale0 = x0.b.b;
            TextStyle textStyle0 = this.e;
            if(textStyle0 != TextStyle.NARROW) {
                ConcurrentHashMap concurrentHashMap0 = u.i;
                SoftReference softReference0 = (SoftReference)concurrentHashMap0.get(s);
                if(softReference0 == null) {
                label_37:
                    TimeZone timeZone0 = TimeZone.getTimeZone(s);
                    String[] arr_s1 = {s, timeZone0.getDisplayName(false, 1, locale0), timeZone0.getDisplayName(false, 0, locale0), timeZone0.getDisplayName(true, 1, locale0), timeZone0.getDisplayName(true, 0, locale0), s, s};
                    if(map0 == null) {
                        map0 = new ConcurrentHashMap();
                    }
                    map0.put(locale0, arr_s1);
                    concurrentHashMap0.put(s, new SoftReference(map0));
                    arr_s = arr_s1;
                }
                else {
                    map0 = (Map)softReference0.get();
                    if(map0 == null) {
                        goto label_37;
                    }
                    else {
                        arr_s = (String[])map0.get(locale0);
                        if(arr_s == null) {
                            goto label_37;
                        }
                    }
                }
                switch(z) {
                    case 0: {
                        map0 = arr_s[textStyle0.a + 1];
                        break;
                    }
                    case 1: {
                        map0 = arr_s[textStyle0.a + 3];
                        break;
                    }
                    default: {
                        map0 = arr_s[textStyle0.a + 5];
                    }
                }
            }
            if(map0 != null) {
                s = map0;
            }
        }
        stringBuilder0.append(s);
        return true;
    }
}

