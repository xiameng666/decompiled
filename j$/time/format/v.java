package j$.time.format;

import j..time.ZoneId;
import j..time.temporal.TemporalField;
import j..util.Objects;
import java.util.ArrayList;

public final class v {
    public final DateTimeFormatter a;
    public boolean b;
    public boolean c;
    public final ArrayList d;
    public ArrayList e;

    public v(DateTimeFormatter dateTimeFormatter0) {
        this.b = true;
        this.c = true;
        ArrayList arrayList0 = new ArrayList();
        this.d = arrayList0;
        this.e = null;
        this.a = dateTimeFormatter0;
        arrayList0.add(new b0());
    }

    public final boolean a(char c, char c1) {
        return this.b ? c == c1 : v.b(c, c1);
    }

    public static boolean b(char c, char c1) {
        return c == c1 || Character.toUpperCase(c) == Character.toUpperCase(c1) || Character.toLowerCase(c) == Character.toLowerCase(c1);
    }

    public final b0 c() {
        return (b0)this.d.get(this.d.size() - 1);
    }

    public final Long d(TemporalField temporalField0) {
        return (Long)this.c().a.get(temporalField0);
    }

    public final void e(ZoneId zoneId0) {
        Objects.requireNonNull(zoneId0, "zone");
        this.c().b = zoneId0;
    }

    public final int f(TemporalField temporalField0, long v, int v1, int v2) {
        Objects.requireNonNull(temporalField0, "field");
        Long long0 = (Long)this.c().a.put(temporalField0, Long.valueOf(v));
        return long0 == null || ((long)long0) == v ? v2 : ~v1;
    }

    public final boolean g(CharSequence charSequence0, int v, CharSequence charSequence1, int v1, int v2) {
        if(v + v2 <= charSequence0.length() && v1 + v2 <= charSequence1.length()) {
            if(this.b) {
                for(int v3 = 0; v3 < v2; ++v3) {
                    if(charSequence0.charAt(v + v3) != charSequence1.charAt(v1 + v3)) {
                        return false;
                    }
                }
            }
            else {
                for(int v4 = 0; v4 < v2; ++v4) {
                    int v5 = charSequence0.charAt(v + v4);
                    int v6 = charSequence1.charAt(v1 + v4);
                    if(v5 != v6 && Character.toUpperCase(((char)v5)) != Character.toUpperCase(((char)v6)) && Character.toLowerCase(((char)v5)) != Character.toLowerCase(((char)v6))) {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public final String toString() {
        return this.c().toString();
    }
}

