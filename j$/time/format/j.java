package j$.time.format;

import j..time.DateTimeException;
import j..time.temporal.TemporalField;
import java.math.BigInteger;

public class j implements e {
    public final TemporalField a;
    public final int b;
    public final int c;
    public final d0 d;
    public final int e;
    public static final long[] f;

    static {
        j.f = new long[]{0L, 10L, 100L, 1000L, 10000L, 100000L, 1000000L, 10000000L, 100000000L, 1000000000L, 10000000000L};
    }

    public j(TemporalField temporalField0, int v, int v1, d0 d00) {
        this.a = temporalField0;
        this.b = v;
        this.c = v1;
        this.d = d00;
        this.e = 0;
    }

    public j(TemporalField temporalField0, int v, int v1, d0 d00, int v2) {
        this.a = temporalField0;
        this.b = v;
        this.c = v1;
        this.d = d00;
        this.e = v2;
    }

    public long a(x x0, long v) {
        return v;
    }

    public boolean b(v v0) {
        return this.e == -1 || this.e > 0 && this.b == this.c && this.d == d0.NOT_NEGATIVE;
    }

    public int c(v v0, long v1, int v2, int v3) {
        return v0.f(this.a, v1, v2, v3);
    }

    public j d() {
        return this.e == -1 ? this : new j(this.a, this.b, this.c, this.d, -1);
    }

    public j e(int v) {
        return new j(this.a, this.b, this.c, this.d, this.e + v);
    }

    @Override  // j$.time.format.e
    public boolean g(x x0, StringBuilder stringBuilder0) {
        TemporalField temporalField0 = this.a;
        Long long0 = x0.a(temporalField0);
        if(long0 == null) {
            return false;
        }
        long v1 = this.a(x0, long0.longValue());
        DecimalStyle decimalStyle0 = x0.b.c;
        String s = v1 == 0x8000000000000000L ? "9223372036854775808" : Long.toString(Math.abs(v1));
        int v2 = this.c;
        if(s.length() > v2) {
            throw __alloc_invoke__ DateTimeException, RuntimeException("Field " + temporalField0 + " cannot be printed as the value " + v1 + " exceeds the maximum print width of " + v2);  // Mismatched object-allocation/constructor-invocation, likely indicating an inlined constructor call
        }
        String s1 = decimalStyle0.a(s);
        int v3 = this.b;
        d0 d00 = this.d;
        if(Long.compare(v1, 0L) >= 0) {
            switch(d00) {
                case 1: {
                    if(v3 < 19 && v1 >= j.f[v3]) {
                        stringBuilder0.append('+');
                    }
                    break;
                }
                case 2: {
                    stringBuilder0.append('+');
                }
            }
        }
        else {
            int v4 = b.a[d00.ordinal()];
            if(v4 != 1 && v4 != 2) {
                switch(v4) {
                    case 3: {
                        stringBuilder0.append(decimalStyle0.b);
                        break;
                    }
                    case 4: {
                        throw __alloc_invoke__ DateTimeException, RuntimeException("Field " + temporalField0 + " cannot be printed as the value " + v1 + " cannot be negative according to the SignStyle");  // Mismatched object-allocation/constructor-invocation, likely indicating an inlined constructor call
                    }
                }
            }
            else {
                stringBuilder0.append(decimalStyle0.b);
            }
        }
        for(int v = 0; v < v3 - s1.length(); ++v) {
            stringBuilder0.append(decimalStyle0.a);
        }
        stringBuilder0.append(s1);
        return true;
    }

    // This method was un-flattened
    @Override  // j$.time.format.e
    public int i(v v0, CharSequence charSequence0, int v1) {
        int v17;
        int v16;
        DateTimeFormatter dateTimeFormatter1;
        int v14;
        long v13;
        BigInteger bigInteger0;
        int v11;
        int v10;
        boolean z2;
        boolean z1;
        int v7;
        int v2 = v1;
        DateTimeFormatter dateTimeFormatter0 = v0.a;
        int v3 = charSequence0.length();
        if(v2 == v3) {
            return ~v2;
        }
        int v4 = charSequence0.charAt(v1);
        DecimalStyle decimalStyle0 = dateTimeFormatter0.c;
        decimalStyle0.getClass();
        int v5 = this.c;
        d0 d00 = this.d;
        int v6 = this.b;
        if(v4 == 43) {
            boolean z = v0.c;
            switch(d00.ordinal()) {
                case 0: {
                    if(z) {
                        return ~v2;
                    }
                    break;
                }
                case 1: 
                case 4: {
                    break;
                }
                default: {
                    if(z || v6 == v5) {
                        return ~v2;
                    }
                }
            }
            ++v2;
            v7 = 0;
            z1 = true;
        }
        else if(v4 == decimalStyle0.b) {
            if(d00.ordinal() != 0 && d00.ordinal() != 1 && d00.ordinal() != 4 && (v0.c || v6 == v5)) {
                return ~v2;
            }
            ++v2;
            z1 = false;
            v7 = 1;
        }
        else {
            if(d00 == d0.ALWAYS && v0.c) {
                return ~v2;
            }
            v7 = 0;
            z1 = false;
        }
        int v8 = v0.c || this.b(v0) ? v6 : 1;
        int v9 = v2 + v8;
        if(v9 > v3) {
            return ~v2;
        }
        if(!v0.c && !this.b(v0)) {
            z2 = false;
            v10 = this.e;
            v11 = Math.max(v10, 0) + 9;
        }
        else {
            z2 = false;
            v10 = this.e;
            v11 = Math.max(v10, 0) + v5;
        }
        bigInteger0 = null;
        while(true) {
            int v12 = Math.min(v2 + v11, v3);
            v13 = 0L;
            v14 = v2;
            while(true) {
                if(v14 < v12) {
                    int v15 = charSequence0.charAt(v14) - dateTimeFormatter0.c.a;
                    dateTimeFormatter1 = dateTimeFormatter0;
                    if(v15 < 0 || v15 > 9) {
                        v15 = -1;
                    }
                    if(v15 < 0) {
                        if(v14 >= v9) {
                            break;
                        }
                        return ~v2;
                    }
                    else {
                        if(v14 + 1 - v2 > 18) {
                            if(bigInteger0 == null) {
                                bigInteger0 = BigInteger.valueOf(v13);
                            }
                            v16 = v3;
                            v17 = v7;
                            bigInteger0 = bigInteger0.multiply(BigInteger.TEN).add(BigInteger.valueOf(v15));
                        }
                        else {
                            v16 = v3;
                            v17 = v7;
                            v13 = v13 * 10L + ((long)v15);
                        }
                        ++v14;
                        dateTimeFormatter0 = dateTimeFormatter1;
                        v3 = v16;
                        v7 = v17;
                        continue;
                    }
                }
                dateTimeFormatter1 = dateTimeFormatter0;
                break;
            }
            if(v10 <= 0 || z2) {
                break;
            }
            z2 = true;
            dateTimeFormatter0 = dateTimeFormatter1;
            v3 = v3;
            v7 = v7;
            v11 = Math.max(v8, v14 - v2 - v10);
            bigInteger0 = null;
        }
        int v18 = v14;
        long v19 = v13;
        BigInteger bigInteger1 = bigInteger0;
        if(v7 != 0) {
            if(bigInteger1 == null) {
                if(v19 != 0L || !v0.c) {
                    v19 = -v19;
                    goto label_102;
                }
            }
            else if(!bigInteger1.equals(BigInteger.ZERO) || !v0.c) {
                bigInteger1 = bigInteger1.negate();
                goto label_102;
            }
            return ~(v2 - 1);
        }
        else if(d00 == d0.EXCEEDS_PAD && v0.c) {
            int v20 = v18 - v2;
            if(z1) {
                if(v20 <= v6) {
                    return ~(v2 - 1);
                }
            }
            else if(v20 > v6) {
                return ~v2;
            }
        }
    label_102:
        if(bigInteger1 != null) {
            if(bigInteger1.bitLength() > 0x3F) {
                bigInteger1 = bigInteger1.divide(BigInteger.TEN);
                --v18;
            }
            return this.c(v0, bigInteger1.longValue(), v2, v18);
        }
        return this.c(v0, v19, v2, v18);
    }

    @Override
    public String toString() {
        TemporalField temporalField0 = this.a;
        d0 d00 = this.d;
        int v = this.c;
        int v1 = this.b;
        if(v1 == 1 && v == 19 && d00 == d0.NORMAL) {
            return "Value(" + temporalField0 + ")";
        }
        return v1 != v || d00 != d0.NOT_NEGATIVE ? "Value(" + temporalField0 + "," + v1 + "," + v + "," + d00 + ")" : "Value(" + temporalField0 + "," + v1 + ")";
    }
}

