package j$.time.format;

import j..util.Objects;
import j..util.concurrent.ConcurrentHashMap;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public final class DecimalStyle {
    public final char a;
    public final char b;
    public final char c;
    public static final DecimalStyle d;
    public static final ConcurrentHashMap e;

    static {
        DecimalStyle.d = new DecimalStyle('0', '-', '.');
        DecimalStyle.e = new ConcurrentHashMap(16, 0.75f, 2);
    }

    public DecimalStyle(char c, char c1, char c2) {
        this.a = c;
        this.b = c1;
        this.c = c2;
    }

    public final String a(String s) {
        int v = this.a;
        if(v == 0x30) {
            return s;
        }
        char[] arr_c = s.toCharArray();
        for(int v1 = 0; v1 < arr_c.length; ++v1) {
            arr_c[v1] = (char)(arr_c[v1] + (v - 0x30));
        }
        return new String(arr_c);
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 || (object0 instanceof DecimalStyle) && this.a == ((DecimalStyle)object0).a && this.b == ((DecimalStyle)object0).b && this.c == ((DecimalStyle)object0).c;
    }

    @Override
    public final int hashCode() {
        return this.a + 43 + this.b + this.c;
    }

    public static DecimalStyle of(Locale locale0) {
        Objects.requireNonNull(locale0, "locale");
        ConcurrentHashMap concurrentHashMap0 = DecimalStyle.e;
        DecimalStyle decimalStyle0 = (DecimalStyle)concurrentHashMap0.get(locale0);
        if(decimalStyle0 == null) {
            DecimalFormatSymbols decimalFormatSymbols0 = DecimalFormatSymbols.getInstance(locale0);
            int v = decimalFormatSymbols0.getZeroDigit();
            int v1 = decimalFormatSymbols0.getMinusSign();
            int v2 = decimalFormatSymbols0.getDecimalSeparator();
            concurrentHashMap0.putIfAbsent(locale0, (v != 0x30 || v1 != 45 || v2 != 46 ? new DecimalStyle(((char)v), ((char)v1), ((char)v2)) : DecimalStyle.d));
            return (DecimalStyle)concurrentHashMap0.get(locale0);
        }
        return decimalStyle0;
    }

    @Override
    public final String toString() {
        return "DecimalStyle[" + this.a + '+' + this.b + this.c + "]";
    }
}

