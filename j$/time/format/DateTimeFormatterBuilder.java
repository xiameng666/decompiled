package j$.time.format;

import j..desugar.sun.nio.fs.n;
import j..time.DateTimeException;
import j..time.chrono.Chronology;
import j..time.temporal.ChronoField;
import j..time.temporal.TemporalField;
import j..time.temporal.g;
import j..time.temporal.i;
import j..time.temporal.k;
import j..util.Objects;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;

public final class DateTimeFormatterBuilder {
    public DateTimeFormatterBuilder a;
    public final DateTimeFormatterBuilder b;
    public final ArrayList c;
    public final boolean d;
    public int e;
    public char f;
    public int g;
    public static final n h;
    public static final HashMap i;

    static {
        DateTimeFormatterBuilder.h = new n(6);
        HashMap hashMap0 = new HashMap();
        DateTimeFormatterBuilder.i = hashMap0;
        hashMap0.put(Character.valueOf('G'), ChronoField.ERA);
        hashMap0.put(Character.valueOf('y'), ChronoField.YEAR_OF_ERA);
        hashMap0.put(Character.valueOf('u'), ChronoField.YEAR);
        hashMap0.put(Character.valueOf('Q'), g.a);
        hashMap0.put(Character.valueOf('q'), g.a);
        hashMap0.put(Character.valueOf('M'), ChronoField.MONTH_OF_YEAR);
        hashMap0.put(Character.valueOf('L'), ChronoField.MONTH_OF_YEAR);
        hashMap0.put(Character.valueOf('D'), ChronoField.DAY_OF_YEAR);
        hashMap0.put(Character.valueOf('d'), ChronoField.DAY_OF_MONTH);
        hashMap0.put(Character.valueOf('F'), ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH);
        hashMap0.put(Character.valueOf('E'), ChronoField.DAY_OF_WEEK);
        hashMap0.put(Character.valueOf('c'), ChronoField.DAY_OF_WEEK);
        hashMap0.put(Character.valueOf('e'), ChronoField.DAY_OF_WEEK);
        hashMap0.put(Character.valueOf('a'), ChronoField.AMPM_OF_DAY);
        hashMap0.put(Character.valueOf('H'), ChronoField.HOUR_OF_DAY);
        hashMap0.put(Character.valueOf('k'), ChronoField.CLOCK_HOUR_OF_DAY);
        hashMap0.put(Character.valueOf('K'), ChronoField.HOUR_OF_AMPM);
        hashMap0.put(Character.valueOf('h'), ChronoField.CLOCK_HOUR_OF_AMPM);
        hashMap0.put(Character.valueOf('m'), ChronoField.MINUTE_OF_HOUR);
        hashMap0.put(Character.valueOf('s'), ChronoField.SECOND_OF_MINUTE);
        hashMap0.put(Character.valueOf('S'), ChronoField.NANO_OF_SECOND);
        hashMap0.put(Character.valueOf('A'), ChronoField.MILLI_OF_DAY);
        hashMap0.put(Character.valueOf('n'), ChronoField.NANO_OF_SECOND);
        hashMap0.put(Character.valueOf('N'), ChronoField.NANO_OF_DAY);
        hashMap0.put(Character.valueOf('g'), i.a);
    }

    public DateTimeFormatterBuilder() {
        this.a = this;
        this.c = new ArrayList();
        this.g = -1;
        this.b = null;
        this.d = false;
    }

    public DateTimeFormatterBuilder(DateTimeFormatterBuilder dateTimeFormatterBuilder0) {
        this.a = this;
        this.c = new ArrayList();
        this.g = -1;
        this.b = dateTimeFormatterBuilder0;
        this.d = true;
    }

    public final void a(DateTimeFormatter dateTimeFormatter0) {
        Objects.requireNonNull(dateTimeFormatter0, "formatter");
        this.c((dateTimeFormatter0.a.b ? new d(dateTimeFormatter0.a.a, false) : dateTimeFormatter0.a));
    }

    public DateTimeFormatterBuilder appendPattern(String s) {
        boolean z;
        int v5;
        Objects.requireNonNull(s, "pattern");
        int v = 0;
        while(v < s.length()) {
            int v1 = s.charAt(v);
            if(v1 >= 65 && v1 <= 90 || v1 >= 97 && v1 <= 0x7A) {
                int v2;
                for(v2 = v + 1; v2 < s.length() && s.charAt(v2) == v1; ++v2) {
                }
                int v3 = v2 - v;
                if(v1 == 0x70) {
                    if(v2 < s.length()) {
                        v1 = s.charAt(v2);
                        if(v1 >= 65 && v1 <= 90 || v1 >= 97 && v1 <= 0x7A) {
                            int v4;
                            for(v4 = v2 + 1; v4 < s.length() && s.charAt(v4) == v1; ++v4) {
                            }
                            v5 = v4 - v2;
                            goto label_23;
                        }
                    }
                    v4 = v2;
                    v5 = v3;
                    v3 = 0;
                label_23:
                    if(v3 == 0) {
                        throw new IllegalArgumentException("Pad letter \'p\' must be followed by valid pad pattern: " + s);
                    }
                    if(v3 < 1) {
                        throw new IllegalArgumentException("The pad width must be at least one but was " + v3);
                    }
                    this.a.e = v3;
                    this.a.f = ' ';
                    this.a.g = -1;
                    v3 = v5;
                    v2 = v4;
                }
                String s1 = "+0000";
                TemporalField temporalField0 = (TemporalField)DateTimeFormatterBuilder.i.get(Character.valueOf(((char)v1)));
                if(temporalField0 == null) {
                    switch(v1) {
                        case 0x4F: {
                            if(v3 == 1) {
                                this.f(TextStyle.SHORT);
                            }
                            else {
                                if(v3 != 4) {
                                    throw new IllegalArgumentException("Pattern letter count must be 1 or 4: " + 'O');
                                }
                                this.f(TextStyle.FULL);
                            }
                            v = v2;
                            continue;
                        }
                        case 86: {
                            if(v3 != 2) {
                                throw new IllegalArgumentException("Pattern letter count must be 2: " + 'V');
                            }
                            this.c(new t(k.a, "ZoneId()"));
                            v = v2;
                            continue;
                        }
                        case 87: {
                            if(v3 > 1) {
                                throw new IllegalArgumentException("Too many pattern letters: " + 'W');
                            }
                            this.j(new s('W', v3, v3, v3, 0));
                            v = v2;
                            continue;
                        }
                        case 88: {
                            if(v3 > 5) {
                                throw new IllegalArgumentException("Too many pattern letters: " + 'X');
                            }
                            this.g(j..time.format.k.d[v3 + (v3 == 1 ? 0 : 1)], "Z");
                            v = v2;
                            continue;
                        }
                        case 89: {
                            if(v3 == 2) {
                                this.j(new s('Y', 2, 2, 2, 0));
                            }
                            else {
                                this.j(new s('Y', v3, v3, 19, 0));
                            }
                            v = v2;
                            continue;
                        }
                        case 90: {
                            if(v3 < 4) {
                                this.g("+HHMM", "+0000");
                            }
                            else if(v3 == 4) {
                                this.f(TextStyle.FULL);
                            }
                            else {
                                if(v3 != 5) {
                                    throw new IllegalArgumentException("Too many pattern letters: " + 'Z');
                                }
                                this.g("+HH:MM:ss", "Z");
                            }
                            v = v2;
                            continue;
                        }
                        case 0x76: {
                            if(v3 == 1) {
                                this.c(new u(TextStyle.SHORT, true));
                            }
                            else {
                                if(v3 != 4) {
                                    throw new IllegalArgumentException("Wrong number of  pattern letters: " + 'v');
                                }
                                this.c(new u(TextStyle.FULL, true));
                            }
                            v = v2;
                            continue;
                        }
                        case 0x77: {
                            if(v3 > 2) {
                                throw new IllegalArgumentException("Too many pattern letters: " + 'w');
                            }
                            this.j(new s('w', v3, v3, 2, 0));
                            v = v2;
                            continue;
                        }
                        case 120: {
                            if(v3 > 5) {
                                throw new IllegalArgumentException("Too many pattern letters: " + 'x');
                            }
                            if(v3 == 1) {
                                s1 = "+00";
                            }
                            else if(v3 % 2 != 0) {
                                s1 = "+00:00";
                            }
                            this.g(j..time.format.k.d[v3 + (v3 == 1 ? 0 : 1)], s1);
                            v = v2;
                            continue;
                        }
                        case 0x7A: {
                            if(v3 > 4) {
                                throw new IllegalArgumentException("Too many pattern letters: " + 'z');
                            }
                            if(v3 == 4) {
                                this.c(new u(TextStyle.FULL, false));
                            }
                            else {
                                this.c(new u(TextStyle.SHORT, false));
                            }
                            v = v2;
                            continue;
                        }
                        default: {
                            throw new IllegalArgumentException("Unknown pattern letter: " + ((char)v1));
                        }
                    }
                }
                else {
                    switch(v1) {
                        case 68: {
                            if(v3 == 1) {
                                this.k(temporalField0);
                            }
                            else {
                                if(v3 != 2 && v3 != 3) {
                                    throw new IllegalArgumentException("Too many pattern letters: " + 'D');
                                }
                                this.m(temporalField0, v3, 3, d0.NOT_NEGATIVE);
                            }
                            v = v2;
                            continue;
                        }
                        case 70: {
                            if(v3 != 1) {
                                throw new IllegalArgumentException("Too many pattern letters: " + 'F');
                            }
                            this.k(temporalField0);
                            v = v2;
                            continue;
                        }
                        case 71: {
                            switch(v3) {
                                case 1: 
                                case 2: 
                                case 3: {
                                    this.i(temporalField0, TextStyle.SHORT);
                                    v = v2;
                                    continue;
                                }
                                case 4: {
                                    this.i(temporalField0, TextStyle.FULL);
                                    v = v2;
                                    continue;
                                }
                                case 5: {
                                    this.i(temporalField0, TextStyle.NARROW);
                                    v = v2;
                                    continue;
                                }
                                default: {
                                    throw new IllegalArgumentException("Too many pattern letters: " + 'G');
                                }
                            }
                        }
                        case 83: {
                            this.b(ChronoField.NANO_OF_SECOND, v3, v3, false);
                            v = v2;
                            continue;
                        }
                        case 97: {
                            if(v3 != 1) {
                                throw new IllegalArgumentException("Too many pattern letters: " + 'a');
                            }
                            this.i(temporalField0, TextStyle.SHORT);
                            v = v2;
                            continue;
                        }
                        case 99: {
                            if(v3 == 1) {
                                this.j(new s('c', 1, 1, 1, 0));
                                v = v2;
                                continue;
                            }
                            else {
                                if(v3 == 2) {
                                    throw new IllegalArgumentException("Invalid pattern \"cc\"");
                                }
                                z = true;
                            }
                        label_86:
                            switch(v3) {
                                case 1: 
                                case 2: {
                                    switch(v1) {
                                        case 69: {
                                            this.i(temporalField0, TextStyle.SHORT);
                                            break;
                                        }
                                        case 101: {
                                            this.j(new s('e', v3, v3, v3, 0));
                                            break;
                                        }
                                        default: {
                                            if(v3 == 1) {
                                                this.k(temporalField0);
                                            }
                                            else {
                                                this.l(temporalField0, 2);
                                            }
                                            break;
                                        }
                                    }
                                    break;
                                }
                                case 3: {
                                    this.i(temporalField0, (z ? TextStyle.SHORT_STANDALONE : TextStyle.SHORT));
                                    break;
                                }
                                case 4: {
                                    this.i(temporalField0, (z ? TextStyle.FULL_STANDALONE : TextStyle.FULL));
                                    break;
                                }
                                case 5: {
                                    this.i(temporalField0, (z ? TextStyle.NARROW_STANDALONE : TextStyle.NARROW));
                                    break;
                                }
                                default: {
                                    throw new IllegalArgumentException("Too many pattern letters: " + ((char)v1));
                                }
                            }
                            v = v2;
                            continue;
                        }
                        case 69: 
                        case 77: 
                        case 81: 
                        case 101: {
                            z = false;
                            goto label_86;
                        }
                        case 103: {
                            this.m(temporalField0, v3, 19, d0.NORMAL);
                            v = v2;
                            continue;
                        }
                        case 65: 
                        case 78: 
                        case 110: {
                            this.m(temporalField0, v3, 19, d0.NOT_NEGATIVE);
                            v = v2;
                            continue;
                        }
                        case 76: 
                        case 0x71: {
                            z = true;
                            goto label_86;
                        }
                        case 72: 
                        case 75: 
                        case 100: 
                        case 104: 
                        case 107: 
                        case 109: 
                        case 0x73: {
                            if(v3 == 1) {
                                this.k(temporalField0);
                            }
                            else {
                                if(v3 != 2) {
                                    throw new IllegalArgumentException("Too many pattern letters: " + ((char)v1));
                                }
                                this.l(temporalField0, 2);
                            }
                            v = v2;
                            continue;
                        }
                        case 0x75: 
                        case 0x79: {
                            if(v3 == 2) {
                                Objects.requireNonNull(temporalField0, "field");
                                Objects.requireNonNull(p.h, "baseDate");
                                p p0 = new p(temporalField0, 2, 2, p.h, 0);
                                if(p.h == null) {
                                    if(!temporalField0.range().e(0L)) {
                                        throw new IllegalArgumentException("The base value must be within the range of the field");
                                    }
                                    if(j.f[2] > 0x7FFFFFFFL) {
                                        throw __alloc_invoke__ DateTimeException, RuntimeException("Unable to add printer-parser as the range exceeds the capacity of an int");  // Mismatched object-allocation/constructor-invocation, likely indicating an inlined constructor call
                                    }
                                }
                                this.j(p0);
                            }
                            else if(v3 < 4) {
                                this.m(temporalField0, v3, 19, d0.NORMAL);
                            }
                            else {
                                this.m(temporalField0, v3, 19, d0.EXCEEDS_PAD);
                            }
                            v = v2;
                            continue;
                        }
                        default: {
                            if(v3 == 1) {
                                this.k(temporalField0);
                            }
                            else {
                                this.l(temporalField0, v3);
                            }
                            v = v2;
                            continue;
                        }
                    }
                }
            }
            switch(v1) {
                case 39: {
                    int v6 = v + 1;
                    while(v6 < s.length()) {
                        if(s.charAt(v6) != 39) {
                            ++v6;
                            continue;
                        }
                        else if(v6 + 1 < s.length() && s.charAt(v6 + 1) == 39) {
                            v6 += 2;
                            continue;
                        }
                        break;
                    }
                    if(v6 >= s.length()) {
                        throw new IllegalArgumentException("Pattern ends with an incomplete string literal: " + s);
                    }
                    String s2 = s.substring(v + 1, v6);
                    if(s2.isEmpty()) {
                        this.d('\'');
                    }
                    else {
                        this.e(s2.replace("\'\'", "\'"));
                    }
                    v = v6 + 1;
                    continue;
                }
                case 91: {
                    this.o();
                    ++v;
                    continue;
                }
                case 93: {
                    if(this.a.b == null) {
                        throw new IllegalArgumentException("Pattern invalid as it contains ] without previous [");
                    }
                    this.n();
                    ++v;
                    continue;
                }
                case 35: 
                case 0x7B: 
                case 0x7D: {
                    throw new IllegalArgumentException("Pattern includes reserved character: \'" + ((char)v1) + "\'");
                }
                default: {
                    this.d(((char)v1));
                    ++v;
                }
            }
        }
        return this;
    }

    public final void b(ChronoField chronoField0, int v, int v1, boolean z) {
        if(v == v1 && !z) {
            this.j(new j..time.format.g(chronoField0, v, v1, z));
            return;
        }
        this.c(new j..time.format.g(chronoField0, v, v1, z));
    }

    public final int c(e e0) {
        Objects.requireNonNull(e0, "pp");
        DateTimeFormatterBuilder dateTimeFormatterBuilder0 = this.a;
        int v = dateTimeFormatterBuilder0.e;
        if(v > 0) {
            if(e0 != null) {
                e0 = new l(e0, v, dateTimeFormatterBuilder0.f);
            }
            dateTimeFormatterBuilder0.e = 0;
            dateTimeFormatterBuilder0.f = '\u0000';
        }
        dateTimeFormatterBuilder0.c.add(e0);
        this.a.g = -1;
        return this.a.c.size() - 1;
    }

    public final void d(char c) {
        this.c(new c(c));
    }

    public final void e(String s) {
        Objects.requireNonNull(s, "literal");
        if(!s.isEmpty()) {
            if(s.length() == 1) {
                this.c(new c(s.charAt(0)));
                return;
            }
            this.c(new j..time.format.i(1, s));
        }
    }

    public final void f(TextStyle textStyle0) {
        Objects.requireNonNull(textStyle0, "style");
        if(textStyle0 != TextStyle.FULL && textStyle0 != TextStyle.SHORT) {
            throw new IllegalArgumentException("Style must be either full or short");
        }
        this.c(new j..time.format.i(0, textStyle0));
    }

    public final void g(String s, String s1) {
        this.c(new j..time.format.k(s, s1));
    }

    public static String getLocalizedDateTimePattern(FormatStyle formatStyle0, FormatStyle formatStyle1, Chronology chronology0, Locale locale0) {
        DateFormat dateFormat0;
        Objects.requireNonNull(locale0, "locale");
        Objects.requireNonNull(chronology0, "chrono");
        if(formatStyle0 == null && formatStyle1 == null) {
            throw new IllegalArgumentException("Either dateStyle or timeStyle must be non-null");
        }
        if(formatStyle1 == null) {
            dateFormat0 = DateFormat.getDateInstance(formatStyle0.ordinal(), locale0);
        }
        else {
            dateFormat0 = formatStyle0 == null ? DateFormat.getTimeInstance(formatStyle1.ordinal(), locale0) : DateFormat.getDateTimeInstance(formatStyle0.ordinal(), formatStyle1.ordinal(), locale0);
        }
        if(!(dateFormat0 instanceof SimpleDateFormat)) {
            throw new UnsupportedOperationException("Can\'t determine pattern from " + dateFormat0);
        }
        int v = 0;
        String s = ((SimpleDateFormat)dateFormat0).toPattern();
        if(s == null) {
            return null;
        }
        if(s.indexOf(66) == -1 && s.indexOf(98) == -1) {
            return s;
        }
        StringBuilder stringBuilder0 = new StringBuilder(s.length());
        for(int v1 = 0x20; v < s.length(); v1 = v2) {
            int v2 = s.charAt(v);
            switch(v2) {
                case 0x20: {
                    if(v == 0 || v1 != 66 && v1 != 98) {
                        stringBuilder0.append(' ');
                    }
                    break;
                }
                case 66: 
                case 98: {
                    break;
                }
                default: {
                    stringBuilder0.append(((char)v2));
                }
            }
            ++v;
        }
        int v3 = stringBuilder0.length() - 1;
        if(v3 >= 0 && stringBuilder0.charAt(v3) == 0x20) {
            stringBuilder0.deleteCharAt(v3);
        }
        return stringBuilder0.toString();
    }

    public final void h(ChronoField chronoField0, HashMap hashMap0) {
        Objects.requireNonNull(chronoField0, "field");
        Objects.requireNonNull(hashMap0, "textLookup");
        LinkedHashMap linkedHashMap0 = new LinkedHashMap(hashMap0);
        a a0 = new a(new z(Collections.singletonMap(TextStyle.FULL, linkedHashMap0)));
        this.c(new r(chronoField0, TextStyle.FULL, a0));
    }

    public final void i(TemporalField temporalField0, TextStyle textStyle0) {
        Objects.requireNonNull(temporalField0, "field");
        Objects.requireNonNull(textStyle0, "textStyle");
        this.c(new r(temporalField0, textStyle0, a0.c));
    }

    public final void j(j j0) {
        j j2;
        DateTimeFormatterBuilder dateTimeFormatterBuilder0 = this.a;
        int v = dateTimeFormatterBuilder0.g;
        if(v >= 0) {
            j j1 = (j)dateTimeFormatterBuilder0.c.get(v);
            int v1 = j0.c;
            if(j0.b == v1 && j0.d == d0.NOT_NEGATIVE) {
                j2 = j1.e(v1);
                this.c(j0.d());
                this.a.g = v;
            }
            else {
                j2 = j1.d();
                DateTimeFormatterBuilder dateTimeFormatterBuilder1 = this.a;
                dateTimeFormatterBuilder1.g = this.c(j0);
            }
            this.a.c.set(v, j2);
            return;
        }
        dateTimeFormatterBuilder0.g = this.c(j0);
    }

    public final void k(TemporalField temporalField0) {
        Objects.requireNonNull(temporalField0, "field");
        this.j(new j(temporalField0, 1, 19, d0.NORMAL));
    }

    public final void l(TemporalField temporalField0, int v) {
        Objects.requireNonNull(temporalField0, "field");
        if(v < 1 || v > 19) {
            throw new IllegalArgumentException("The width must be from 1 to 19 inclusive but was " + v);
        }
        this.j(new j(temporalField0, v, v, d0.NOT_NEGATIVE));
    }

    public final void m(TemporalField temporalField0, int v, int v1, d0 d00) {
        if(v == v1 && d00 == d0.NOT_NEGATIVE) {
            this.l(temporalField0, v1);
            return;
        }
        Objects.requireNonNull(temporalField0, "field");
        Objects.requireNonNull(d00, "signStyle");
        if(v < 1 || v > 19) {
            throw new IllegalArgumentException("The minimum width must be from 1 to 19 inclusive but was " + v);
        }
        if(v1 < 1 || v1 > 19) {
            throw new IllegalArgumentException("The maximum width must be from 1 to 19 inclusive but was " + v1);
        }
        if(v1 < v) {
            throw new IllegalArgumentException("The maximum width must exceed or equal the minimum width but " + v1 + " < " + v);
        }
        this.j(new j(temporalField0, v, v1, d00));
    }

    public final void n() {
        DateTimeFormatterBuilder dateTimeFormatterBuilder0 = this.a;
        if(dateTimeFormatterBuilder0.b == null) {
            throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
        }
        if(dateTimeFormatterBuilder0.c.size() > 0) {
            d d0 = new d(this.a.c, this.a.d);
            this.a = this.a.b;
            this.c(d0);
            return;
        }
        this.a = this.a.b;
    }

    public final void o() {
        this.a.g = -1;
        this.a = new DateTimeFormatterBuilder(this.a);
    }

    public final DateTimeFormatter p(c0 c00, Chronology chronology0) {
        return this.q(Locale.getDefault(), c00, chronology0);
    }

    public DateTimeFormatterBuilder parseDefaulting(TemporalField temporalField0, long v) {
        Objects.requireNonNull(temporalField0, "field");
        this.c(new f(temporalField0, v));
        return this;
    }

    public final DateTimeFormatter q(Locale locale0, c0 c00, Chronology chronology0) {
        Objects.requireNonNull(locale0, "locale");
        while(this.a.b != null) {
            this.n();
        }
        return new DateTimeFormatter(new d(this.c, false), locale0, DecimalStyle.d, c00, chronology0, null);
    }

    public DateTimeFormatter toFormatter() {
        return this.q(Locale.getDefault(), c0.SMART, null);
    }
}

