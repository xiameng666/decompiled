package j$.time.format;

import j..time.DateTimeException;
import j..time.ZoneId;
import j..time.ZoneOffset;
import j..time.temporal.ChronoField;
import j..time.temporal.TemporalQuery;
import j..time.zone.h;
import java.text.ParsePosition;
import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.Set;

public class t implements e {
    public final TemporalQuery a;
    public final String b;
    public static volatile AbstractMap.SimpleImmutableEntry c;
    public static volatile AbstractMap.SimpleImmutableEntry d;

    public t(TemporalQuery temporalQuery0, String s) {
        this.a = temporalQuery0;
        this.b = s;
    }

    public n a(v v0) {
        Set set0 = h.d;
        int v1 = set0.size();
        AbstractMap.SimpleImmutableEntry abstractMap$SimpleImmutableEntry0 = v0.b ? t.c : t.d;
        if(abstractMap$SimpleImmutableEntry0 == null || ((int)(((Integer)abstractMap$SimpleImmutableEntry0.getKey()))) != v1) {
            synchronized(this) {
                abstractMap$SimpleImmutableEntry0 = v0.b ? t.c : t.d;
                if(abstractMap$SimpleImmutableEntry0 == null || ((int)(((Integer)abstractMap$SimpleImmutableEntry0.getKey()))) != v1) {
                    Integer integer0 = v1;
                    n n0 = v0.b ? new n("", null, null) : __alloc_invoke__ m, n("", null, null);  // Mismatched object-allocation/constructor-invocation, likely indicating an inlined constructor call
                    for(Object object0: set0) {
                        String s = (String)object0;
                        n0.a(s, s);
                    }
                    abstractMap$SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry(integer0, n0);
                    if(v0.b) {
                        t.c = abstractMap$SimpleImmutableEntry0;
                    }
                    else {
                        t.d = abstractMap$SimpleImmutableEntry0;
                    }
                }
            }
        }
        return (n)abstractMap$SimpleImmutableEntry0.getValue();
    }

    public static int b(v v0, CharSequence charSequence0, int v1, int v2, k k0) {
        String s = charSequence0.subSequence(v1, v2).toString().toUpperCase();
        if(v2 >= charSequence0.length()) {
            v0.e(ZoneId.of(s));
            return v2;
        }
        if(charSequence0.charAt(v2) != 0x30 && !v0.a(charSequence0.charAt(v2), 'Z')) {
            v v3 = new v(v0.a);
            v3.b = v0.b;
            v3.c = v0.c;
            int v4 = k0.i(v3, charSequence0, v2);
            try {
                if(v4 < 0) {
                    if(k0 == k.e) {
                        return ~v1;
                    }
                    v0.e(ZoneId.of(s));
                    return v2;
                }
                v0.e(ZoneId.K(s, ZoneOffset.ofTotalSeconds(((int)(((long)v3.d(ChronoField.OFFSET_SECONDS)))))));
                return v4;
            }
            catch(DateTimeException unused_ex) {
                return ~v1;
            }
        }
        v0.e(ZoneId.of(s));
        return v2;
    }

    @Override  // j$.time.format.e
    public boolean g(x x0, StringBuilder stringBuilder0) {
        ZoneId zoneId0 = (ZoneId)x0.b(this.a);
        if(zoneId0 == null) {
            return false;
        }
        stringBuilder0.append(zoneId0.getId());
        return true;
    }

    @Override  // j$.time.format.e
    public final int i(v v0, CharSequence charSequence0, int v1) {
        int v2 = charSequence0.length();
        if(v1 > v2) {
            throw new IndexOutOfBoundsException();
        }
        if(v1 == v2) {
            return ~v1;
        }
        int v3 = charSequence0.charAt(v1);
        if(v3 != 43 && v3 != 45) {
            if(v2 >= v1 + 2) {
                int v4 = charSequence0.charAt(v1 + 1);
                if(v0.a(((char)v3), 'U') && v0.a(((char)v4), 'T')) {
                    return v2 < v1 + 3 || !v0.a(charSequence0.charAt(v1 + 2), 'C') ? t.b(v0, charSequence0, v1, v1 + 2, k.f) : t.b(v0, charSequence0, v1, v1 + 3, k.f);
                }
                if(v0.a(((char)v3), 'G') && v2 >= v1 + 3 && v0.a(((char)v4), 'M') && v0.a(charSequence0.charAt(v1 + 2), 'T')) {
                    if(v2 >= v1 + 4 && v0.a(charSequence0.charAt(v1 + 3), '0')) {
                        v0.e(ZoneId.of("GMT0"));
                        return v1 + 4;
                    }
                    return t.b(v0, charSequence0, v1, v1 + 3, k.f);
                }
            }
            n n0 = this.a(v0);
            ParsePosition parsePosition0 = new ParsePosition(v1);
            String s = n0.c(charSequence0, parsePosition0);
            if(s == null) {
                if(v0.a(((char)v3), 'Z')) {
                    v0.e(ZoneOffset.UTC);
                    return v1 + 1;
                }
                return ~v1;
            }
            v0.e(ZoneId.of(s));
            return parsePosition0.getIndex();
        }
        return t.b(v0, charSequence0, v1, v1, k.e);
    }

    @Override
    public final String toString() {
        return this.b;
    }
}

