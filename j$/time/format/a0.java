package j$.time.format;

import j..desugar.sun.nio.fs.g;
import j..time.chrono.Chronology;
import j..time.chrono.q;
import j..time.temporal.ChronoField;
import j..time.temporal.TemporalField;
import j..util.concurrent.ConcurrentHashMap;
import java.text.DateFormatSymbols;
import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;

public class a0 {
    public static final ConcurrentHashMap a;
    public static final y b;
    public static final a0 c;

    static {
        a0.a = new ConcurrentHashMap(16, 0.75f, 2);
        a0.b = __alloc_invoke__ y, Object();  // Mismatched object-allocation/constructor-invocation, likely indicating an inlined constructor call
        a0.c = __alloc_invoke__ a0, Object();  // Mismatched object-allocation/constructor-invocation, likely indicating an inlined constructor call
    }

    public static Object a(TemporalField temporalField0, Locale locale0) {
        z z0;
        AbstractMap.SimpleImmutableEntry abstractMap$SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry(temporalField0, locale0);
        ConcurrentHashMap concurrentHashMap0 = a0.a;
        Object object0 = concurrentHashMap0.get(abstractMap$SimpleImmutableEntry0);
        if(object0 == null) {
            HashMap hashMap0 = new HashMap();
            if(temporalField0 == ChronoField.ERA) {
                DateFormatSymbols dateFormatSymbols0 = DateFormatSymbols.getInstance(locale0);
                HashMap hashMap1 = new HashMap();
                HashMap hashMap2 = new HashMap();
                String[] arr_s = dateFormatSymbols0.getEras();
                for(int v = 0; v < arr_s.length; ++v) {
                    if(!arr_s[v].isEmpty()) {
                        hashMap1.put(Long.valueOf(v), arr_s[v]);
                        String s = arr_s[v];
                        hashMap2.put(Long.valueOf(v), s.substring(0, Character.charCount(s.codePointAt(0))));
                    }
                }
                if(!hashMap1.isEmpty()) {
                    hashMap0.put(TextStyle.FULL, hashMap1);
                    hashMap0.put(TextStyle.SHORT, hashMap1);
                    hashMap0.put(TextStyle.NARROW, hashMap2);
                }
                z0 = new z(hashMap0);
            }
            else if(temporalField0 == ChronoField.MONTH_OF_YEAR) {
                int v1 = DateFormatSymbols.getInstance(locale0).getMonths().length;
                LinkedHashMap linkedHashMap0 = new LinkedHashMap();
                LinkedHashMap linkedHashMap1 = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for(long v2 = 1L; v2 <= ((long)v1); ++v2) {
                    String s1 = g.v(v2, "LLLL", locale0);
                    linkedHashMap0.put(Long.valueOf(v2), s1);
                    linkedHashMap1.put(Long.valueOf(v2), s1.substring(0, Character.charCount(s1.codePointAt(0))));
                    linkedHashMap2.put(Long.valueOf(v2), g.v(v2, "LLL", locale0));
                }
                if(v1 > 0) {
                    hashMap0.put(TextStyle.FULL_STANDALONE, linkedHashMap0);
                    hashMap0.put(TextStyle.NARROW_STANDALONE, linkedHashMap1);
                    hashMap0.put(TextStyle.SHORT_STANDALONE, linkedHashMap2);
                    hashMap0.put(TextStyle.FULL, linkedHashMap0);
                    hashMap0.put(TextStyle.NARROW, linkedHashMap1);
                    hashMap0.put(TextStyle.SHORT, linkedHashMap2);
                }
                z0 = new z(hashMap0);
            }
            else if(temporalField0 == ChronoField.DAY_OF_WEEK) {
                int v3 = DateFormatSymbols.getInstance(locale0).getWeekdays().length;
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                boolean z1 = locale0 == Locale.SIMPLIFIED_CHINESE || locale0 == Locale.TRADITIONAL_CHINESE;
                for(long v4 = 1L; v4 <= ((long)v3); ++v4) {
                    String s2 = g.u(v4, "cccc", locale0);
                    linkedHashMap3.put(Long.valueOf(v4), s2);
                    linkedHashMap4.put(Long.valueOf(v4), (z1 ? new StringBuilder().appendCodePoint(s2.codePointBefore(s2.length())).toString() : s2.substring(0, Character.charCount(s2.codePointAt(0)))));
                    linkedHashMap5.put(Long.valueOf(v4), g.u(v4, "ccc", locale0));
                }
                if(v3 > 0) {
                    hashMap0.put(TextStyle.FULL_STANDALONE, linkedHashMap3);
                    hashMap0.put(TextStyle.NARROW_STANDALONE, linkedHashMap4);
                    hashMap0.put(TextStyle.SHORT_STANDALONE, linkedHashMap5);
                    hashMap0.put(TextStyle.FULL, linkedHashMap3);
                    hashMap0.put(TextStyle.NARROW, linkedHashMap4);
                    hashMap0.put(TextStyle.SHORT, linkedHashMap5);
                }
                z0 = new z(hashMap0);
            }
            else if(temporalField0 == ChronoField.AMPM_OF_DAY) {
                DateFormatSymbols dateFormatSymbols1 = DateFormatSymbols.getInstance(locale0);
                HashMap hashMap3 = new HashMap();
                HashMap hashMap4 = new HashMap();
                String[] arr_s1 = dateFormatSymbols1.getAmPmStrings();
                for(int v5 = 0; v5 < arr_s1.length; ++v5) {
                    if(!arr_s1[v5].isEmpty()) {
                        hashMap3.put(Long.valueOf(v5), arr_s1[v5]);
                        String s3 = arr_s1[v5];
                        hashMap4.put(Long.valueOf(v5), s3.substring(0, Character.charCount(s3.codePointAt(0))));
                    }
                }
                if(!hashMap3.isEmpty()) {
                    hashMap0.put(TextStyle.FULL, hashMap3);
                    hashMap0.put(TextStyle.SHORT, hashMap3);
                    hashMap0.put(TextStyle.NARROW, hashMap4);
                }
                z0 = new z(hashMap0);
            }
            else {
                z0 = "";
            }
            concurrentHashMap0.putIfAbsent(abstractMap$SimpleImmutableEntry0, z0);
            return concurrentHashMap0.get(abstractMap$SimpleImmutableEntry0);
        }
        return object0;
    }

    public String b(Chronology chronology0, TemporalField temporalField0, long v, TextStyle textStyle0, Locale locale0) {
        return chronology0 == q.d || !(temporalField0 instanceof ChronoField) ? this.c(temporalField0, v, textStyle0, locale0) : null;
    }

    public String c(TemporalField temporalField0, long v, TextStyle textStyle0, Locale locale0) {
        Object object0 = a0.a(temporalField0, locale0);
        return (object0 instanceof z) ? ((z)object0).a(v, textStyle0) : null;
    }

    public Iterator d(Chronology chronology0, TemporalField temporalField0, TextStyle textStyle0, Locale locale0) {
        return chronology0 == q.d || !(temporalField0 instanceof ChronoField) ? this.e(temporalField0, textStyle0, locale0) : null;
    }

    public Iterator e(TemporalField temporalField0, TextStyle textStyle0, Locale locale0) {
        Object object0 = a0.a(temporalField0, locale0);
        if((object0 instanceof z)) {
            List list0 = (List)((z)object0).b.get(textStyle0);
            return list0 == null ? null : list0.iterator();
        }
        return null;
    }
}

