package j$.time.format;

import j..time.temporal.TemporalField;
import j..time.temporal.m;
import j..util.Objects;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public final class g extends j {
    public final boolean g;

    public g(TemporalField temporalField0, int v, int v1, boolean z) {
        this(temporalField0, v, v1, z, 0);
        Objects.requireNonNull(temporalField0, "field");
        m m0 = temporalField0.range();
        if(m0.a != m0.b || m0.c != m0.d) {
            throw new IllegalArgumentException("Field must have a fixed set of values: " + temporalField0);
        }
        if(v < 0 || v > 9) {
            throw new IllegalArgumentException("Minimum width must be from 0 to 9 inclusive but was " + v);
        }
        if(v1 < 1 || v1 > 9) {
            throw new IllegalArgumentException("Maximum width must be from 1 to 9 inclusive but was " + v1);
        }
        if(v1 >= v) {
            return;
        }
        throw new IllegalArgumentException("Maximum width must exceed or equal the minimum width but " + v1 + " < " + v);
    }

    public g(TemporalField temporalField0, int v, int v1, boolean z, int v2) {
        super(temporalField0, v, v1, d0.NOT_NEGATIVE, v2);
        this.g = z;
    }

    @Override  // j$.time.format.j
    public final boolean b(v v0) {
        return v0.c && this.b == this.c && !this.g;
    }

    @Override  // j$.time.format.j
    public final j d() {
        return this.e == -1 ? this : new g(this.a, this.b, this.c, this.g, -1);
    }

    @Override  // j$.time.format.j
    public final j e(int v) {
        return new g(this.a, this.b, this.c, this.g, this.e + v);
    }

    @Override  // j$.time.format.j
    public final boolean g(x x0, StringBuilder stringBuilder0) {
        TemporalField temporalField0 = this.a;
        Long long0 = x0.a(temporalField0);
        if(long0 == null) {
            return false;
        }
        DecimalStyle decimalStyle0 = x0.b.c;
        long v1 = (long)long0;
        m m0 = temporalField0.range();
        m0.b(temporalField0, v1);
        BigDecimal bigDecimal0 = BigDecimal.valueOf(m0.a);
        BigDecimal bigDecimal1 = BigDecimal.valueOf(m0.d).subtract(bigDecimal0).add(BigDecimal.ONE);
        BigDecimal bigDecimal2 = BigDecimal.valueOf(v1).subtract(bigDecimal0);
        RoundingMode roundingMode0 = RoundingMode.FLOOR;
        BigDecimal bigDecimal3 = bigDecimal2.divide(bigDecimal1, 9, roundingMode0);
        BigDecimal bigDecimal4 = BigDecimal.ZERO;
        if(bigDecimal3.compareTo(bigDecimal4) != 0) {
            bigDecimal4 = bigDecimal3.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimal3.stripTrailingZeros();
        }
        int v2 = bigDecimal4.scale();
        boolean z = this.g;
        int v3 = this.b;
        if(v2 == 0) {
            if(v3 > 0) {
                if(z) {
                    stringBuilder0.append(decimalStyle0.c);
                }
                for(int v = 0; v < v3; ++v) {
                    stringBuilder0.append(decimalStyle0.a);
                }
            }
            return true;
        }
        String s = decimalStyle0.a(bigDecimal4.setScale(Math.min(Math.max(bigDecimal4.scale(), v3), this.c), roundingMode0).toPlainString().substring(2));
        if(z) {
            stringBuilder0.append(decimalStyle0.c);
        }
        stringBuilder0.append(s);
        return true;
    }

    @Override  // j$.time.format.j
    public final int i(v v0, CharSequence charSequence0, int v1) {
        DateTimeFormatter dateTimeFormatter0 = v0.a;
        int v2 = v0.c || this.b(v0) ? this.b : 0;
        int v3 = v0.c || this.b(v0) ? this.c : 9;
        int v4 = charSequence0.length();
        if(v1 == v4) {
            return v2 <= 0 ? v1 : ~v1;
        }
        if(this.g) {
            if(charSequence0.charAt(v1) != dateTimeFormatter0.c.c) {
                return v2 <= 0 ? v1 : ~v1;
            }
            ++v1;
        }
        int v5 = v2 + v1;
        if(v5 > v4) {
            return ~v1;
        }
        int v6 = Math.min(v3 + v1, v4);
        int v7 = 0;
        int v8 = v1;
        while(v8 < v6) {
            int v9 = charSequence0.charAt(v8) - dateTimeFormatter0.c.a;
            if(v9 < 0 || v9 > 9) {
                v9 = -1;
            }
            if(v9 >= 0) {
                v7 = v7 * 10 + v9;
                ++v8;
                continue;
            }
            else if(v8 + 1 < v5) {
                return ~v1;
            }
            break;
        }
        BigDecimal bigDecimal0 = new BigDecimal(v7).movePointLeft(v8 - v1);
        m m0 = this.a.range();
        BigDecimal bigDecimal1 = BigDecimal.valueOf(m0.a);
        long v10 = bigDecimal0.multiply(BigDecimal.valueOf(m0.d).subtract(bigDecimal1).add(BigDecimal.ONE)).setScale(0, RoundingMode.FLOOR).add(bigDecimal1).longValueExact();
        return v0.f(this.a, v10, v1, v8);
    }

    @Override  // j$.time.format.j
    public final String toString() {
        return this.g ? "Fraction(" + this.a + "," + this.b + "," + this.c + ",DecimalPoint" + ")" : "Fraction(" + this.a + "," + this.b + "," + this.c + "" + ")";
    }
}

