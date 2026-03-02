package j$.time.format;

import j..time.chrono.Chronology;
import j..time.chrono.q;
import j..time.temporal.ChronoField;
import j..time.temporal.TemporalField;
import j..time.temporal.k;
import java.util.Iterator;
import java.util.Map.Entry;

public final class r implements e {
    public final TemporalField a;
    public final TextStyle b;
    public final a0 c;
    public volatile j d;

    public r(TemporalField temporalField0, TextStyle textStyle0, a0 a00) {
        this.a = temporalField0;
        this.b = textStyle0;
        this.c = a00;
    }

    @Override  // j$.time.format.e
    public final boolean g(x x0, StringBuilder stringBuilder0) {
        Long long0 = x0.a(this.a);
        DateTimeFormatter dateTimeFormatter0 = x0.b;
        if(long0 == null) {
            return false;
        }
        Chronology chronology0 = (Chronology)x0.a.B(k.b);
        String s = chronology0 == null || chronology0 == q.d ? this.c.c(this.a, long0.longValue(), this.b, dateTimeFormatter0.b) : this.c.b(chronology0, this.a, long0.longValue(), this.b, dateTimeFormatter0.b);
        if(s == null) {
            if(this.d == null) {
                this.d = new j(this.a, 1, 19, d0.NORMAL);
            }
            return this.d.g(x0, stringBuilder0);
        }
        stringBuilder0.append(s);
        return true;
    }

    @Override  // j$.time.format.e
    public final int i(v v0, CharSequence charSequence0, int v1) {
        a0 a00 = this.c;
        TemporalField temporalField0 = this.a;
        if(v1 < 0 || v1 > charSequence0.length()) {
            throw new IndexOutOfBoundsException();
        }
        DateTimeFormatter dateTimeFormatter0 = v0.a;
        TextStyle textStyle0 = v0.c ? this.b : null;
        Chronology chronology0 = v0.c().c;
        if(chronology0 == null) {
            chronology0 = v0.a.e;
            if(chronology0 == null) {
                chronology0 = q.d;
            }
        }
        Iterator iterator0 = chronology0 == null || chronology0 == q.d ? a00.e(temporalField0, textStyle0, dateTimeFormatter0.b) : a00.d(chronology0, temporalField0, textStyle0, dateTimeFormatter0.b);
        if(iterator0 != null) {
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                Map.Entry map$Entry0 = (Map.Entry)object0;
                String s = (String)map$Entry0.getKey();
                if(v0.g(s, 0, charSequence0, v1, s.length())) {
                    long v2 = (long)(((Long)map$Entry0.getValue()));
                    return v0.f(this.a, v2, v1, s.length() + v1);
                }
            }
            if(temporalField0 == ChronoField.ERA && !v0.c) {
                for(Object object1: chronology0.eras()) {
                    j..time.chrono.k k0 = (j..time.chrono.k)object1;
                    String s1 = k0.toString();
                    if(v0.g(s1, 0, charSequence0, v1, s1.length())) {
                        long v3 = (long)k0.getValue();
                        return v0.f(this.a, v3, v1, s1.length() + v1);
                    }
                }
            }
            if(v0.c) {
                return ~v1;
            }
        }
        if(this.d == null) {
            this.d = new j(this.a, 1, 19, d0.NORMAL);
        }
        return this.d.i(v0, charSequence0, v1);
    }

    @Override
    public final String toString() {
        return this.b == TextStyle.FULL ? "Text(" + this.a + ")" : "Text(" + this.a + "," + this.b + ")";
    }
}

