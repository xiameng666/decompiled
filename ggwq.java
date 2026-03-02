import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Formattable;
import java.util.Formatter;

public final class ggwq {
    public int a;
    public int b;
    protected final Object[] c;
    public final StringBuilder d;
    public int e;
    private final ggux f;

    protected ggwq(ggux ggux0, Object[] arr_object, StringBuilder stringBuilder0) {
        this.a = 0;
        this.b = -1;
        ggwv.d(ggux0, "context");
        this.f = ggux0;
        this.e = 0;
        ggwv.d(arr_object, "arguments");
        this.c = arr_object;
        this.d = stringBuilder0;
    }

    public final ggwr a() {
        return this.f.a;
    }

    public final String b() {
        return this.f.b;
    }

    public static StringBuilder c(ggtu ggtu0, StringBuilder stringBuilder0) {
        int v8;
        ggwn ggwn0;
        int v13;
        int v12;
        ggtr ggtr0;
        if(ggtu0.d() != null) {
            ggwq ggwq0 = new ggwq(ggtu0.d(), ggtu0.i(), stringBuilder0);
            String s = ggwq0.b();
            int v = ggwt.b(s, 0);
            int v1 = 0;
            int v2 = -1;
        label_6:
            while(v >= 0) {
                int v3 = v + 1;
                int v4 = 0;
                int v5 = v3;
                while(v5 < s.length()) {
                    int v6 = s.charAt(v5);
                    int v7 = (char)(v6 - 0x30);
                    if(v7 < 10) {
                        v4 = v4 * 10 + v7;
                        if(v4 >= 1000000) {
                            throw ggws.b("index too large", s, v, v5 + 1);
                        }
                        ++v5;
                    }
                    else {
                        switch(v6) {
                            case 36: {
                                if(v5 - v3 == 0) {
                                    throw ggws.b("missing index", s, v, v5 + 1);
                                }
                                if(s.charAt(v3) == 0x30) {
                                    throw ggws.b("index has leading zero", s, v, v5 + 1);
                                }
                                if(v5 + 1 == s.length()) {
                                    throw ggws.c("unterminated parameter", s, v);
                                }
                                v2 = v4 - 1;
                                v3 = v5 + 1;
                                v8 = v5 + 1;
                                goto label_38;
                            }
                            case 60: {
                                if(v2 == -1) {
                                    throw ggws.b("invalid relative parameter", s, v, v5 + 1);
                                }
                                if(v5 + 1 == s.length()) {
                                    throw ggws.c("unterminated parameter", s, v);
                                }
                                v3 = v5 + 1;
                                v8 = v5 + 1;
                            label_38:
                                while(v8 < s.length()) {
                                    if(((char)((s.charAt(v8) & -33) - 65)) < 26) {
                                        int v9 = s.charAt(v8);
                                        int v10 = (v9 & 0x20) == 0 ? 1 : 0;
                                        if(v3 == v8 && v10 == 0) {
                                            ggtr0 = ggtr.a;
                                            goto label_73;
                                        }
                                        else {
                                            int v11 = 1 == v10 ? 0x80 : 0;
                                            while(true) {
                                                if(v3 == v8) {
                                                    ggtr0 = new ggtr(v11, -1, -1);
                                                    goto label_73;
                                                }
                                                v12 = v3 + 1;
                                                v13 = s.charAt(v3);
                                                if(v13 < 0x20 || v13 > 0x30) {
                                                    goto label_65;
                                                }
                                                int v14 = ggtr.a(((char)v13));
                                                if(v14 < 0) {
                                                    if(v13 != 46) {
                                                        throw ggws.a("invalid flag", s, v3);
                                                    }
                                                    ggtr0 = new ggtr(v11, -1, ggtr.b(s, v12, v8));
                                                    goto label_73;
                                                }
                                                if((v11 & 1 << v14) != 0) {
                                                    break;
                                                }
                                                v11 |= 1 << v14;
                                                v3 = v12;
                                            }
                                            throw ggws.a("repeated flag", s, v3);
                                        label_65:
                                            if(v13 <= 57) {
                                                int v15 = v13 - 0x30;
                                            label_67:
                                                if(v12 == v8) {
                                                    ggtr0 = new ggtr(v11, v15, -1);
                                                    goto label_73;
                                                }
                                                else {
                                                    int v16 = s.charAt(v12);
                                                    if(v16 == 46) {
                                                        ggtr0 = new ggtr(v11, v15, ggtr.b(s, v12 + 1, v8));
                                                    label_73:
                                                        ggtq ggtq0 = ggtq.k[ggtq.a(((char)v9))];
                                                        if((v9 & 0x20) == 0 && (ggtq0 == null || (ggtq0.n & 0x80) == 0)) {
                                                            ggtq0 = null;
                                                        }
                                                        int v17 = v8 + 1;
                                                        if(ggtq0 == null) {
                                                            switch(v9) {
                                                                case 72: 
                                                                case 104: {
                                                                    if(!ggtr0.e(0xA0, false)) {
                                                                        throw ggws.b("invalid format specification", s, v, v17);
                                                                    }
                                                                    ggwn0 = new ggwo(ggtr0, v2);
                                                                    goto label_99;
                                                                }
                                                                case 84: 
                                                                case 0x74: {
                                                                    if(!ggtr0.e(0xA0, false)) {
                                                                        throw ggws.b("invalid format specification", s, v, v17);
                                                                    }
                                                                    if(v8 + 2 > s.length()) {
                                                                        throw ggws.a("truncated format specifier", s, v);
                                                                    }
                                                                    ggwk ggwk0 = (ggwk)ggwk.F.get(Character.valueOf(s.charAt(v17)));
                                                                    if(ggwk0 == null) {
                                                                        throw ggws.a("illegal date/time conversion", s, v17);
                                                                    }
                                                                    ggwn0 = new ggwl(ggtr0, v2, ggwk0);
                                                                    v17 = v8 + 2;
                                                                label_99:
                                                                    int v18 = ggwn0.a;
                                                                    if(v18 < 0x20) {
                                                                        ggwq0.a |= 1 << v18;
                                                                    }
                                                                    ggwq0.b = Math.max(ggwq0.b, v18);
                                                                    StringBuilder stringBuilder1 = ggwq0.d;
                                                                    ggwq0.a().a(stringBuilder1, ggwq0.b(), ggwq0.e, v);
                                                                    Object[] arr_object = ggwq0.c;
                                                                    if(v18 < arr_object.length) {
                                                                        Object object0 = arr_object[v18];
                                                                        if(object0 == null) {
                                                                            stringBuilder1.append("null");
                                                                        }
                                                                        else {
                                                                            ggwn0.a(ggwq0, object0);
                                                                        }
                                                                    }
                                                                    else {
                                                                        stringBuilder1.append("[ERROR: MISSING LOG ARGUMENT]");
                                                                    }
                                                                    ggwq0.e = v17;
                                                                    v = ggwt.b(s, v17);
                                                                    continue label_6;
                                                                }
                                                                default: {
                                                                    throw ggws.b("invalid format specification", s, v, v17);
                                                                }
                                                            }
                                                        }
                                                        else {
                                                            if(!ggtr0.e(ggtq0.n, ggtq0.m.f)) {
                                                                throw ggws.b("invalid format specifier", s, v, v17);
                                                            }
                                                            if(v2 < 10) {
                                                                ggwn[] arr_ggwn = (ggwn[])ggwn.c.get(ggtq0);
                                                                ggwv.d(arr_ggwn, "default parameter");
                                                                ggwn0 = arr_ggwn[v2];
                                                            }
                                                            else {
                                                                ggwn0 = new ggwn(v2, ggtq0, ggtr0);
                                                            }
                                                            goto label_99;
                                                        }
                                                        goto label_120;
                                                    }
                                                    else {
                                                    label_120:
                                                        if(((char)(v16 - 0x30)) >= 10) {
                                                            throw ggws.a("invalid width character", s, v12);
                                                        }
                                                        v15 = v15 * 10 + ((char)(v16 - 0x30));
                                                        if(v15 > 0xF423F) {
                                                            throw ggws.b("width too large", s, v3, v8);
                                                        }
                                                        ++v12;
                                                        goto label_67;
                                                    }
                                                }
                                            }
                                            throw ggws.a("invalid flag", s, v3);
                                        }
                                        break;
                                    }
                                    ++v8;
                                }
                                throw ggws.c("unterminated parameter", s, v);
                            }
                            default: {
                                v2 = v1;
                                ++v1;
                                v8 = v5;
                                goto label_38;
                            }
                        }
                    }
                }
                throw ggws.c("unterminated parameter", s, v);
            }
            int v19 = ggwq0.a;
            if((v19 + 1 & v19) != 0 || ggwq0.b > 0x1F && v19 != -1) {
                throw new ggws(String.format("unreferenced arguments [first missing index=%d]", Integer.numberOfTrailingZeros(~v19)));
            }
            StringBuilder stringBuilder2 = ggwq0.d;
            ggwq0.a().a(stringBuilder2, ggwq0.b(), ggwq0.e, ggwq0.b().length());
            if(ggtu0.i().length <= ggwq0.b + 1) {
                return stringBuilder2;
            }
            stringBuilder2.append(" [ERROR: UNUSED LOG ARGUMENTS]");
            return stringBuilder2;
        }
        stringBuilder0.append(ggtz.b(ggtu0.e()));
        return stringBuilder0;
    }

    public static void d(StringBuilder stringBuilder0, Object object0, String s) {
        stringBuilder0.append("[INVALID: format=");
        stringBuilder0.append(s);
        stringBuilder0.append(", type=");
        stringBuilder0.append(object0.getClass().getCanonicalName());
        stringBuilder0.append(", value=");
        stringBuilder0.append(ggtz.b(object0));
        stringBuilder0.append("]");
    }

    public final void e(Object object0, ggtq ggtq0, ggtr ggtr0) {
        boolean z;
        int v = 4;
        int v1 = 1;
        switch(ggtq0.m.ordinal()) {
            case 0: {
                break;
            }
            case 1: {
                z = object0 instanceof Boolean;
                goto label_20;
            }
            case 2: {
                if((object0 instanceof Character)) {
                    z = true;
                }
                else if((object0 instanceof Integer) || (object0 instanceof Byte) || (object0 instanceof Short)) {
                    z = Character.isValidCodePoint(((Number)object0).intValue());
                }
                else {
                    z = false;
                }
                goto label_20;
            }
            case 3: {
                z = (object0 instanceof Integer) || (object0 instanceof Long) || (object0 instanceof Byte) || (object0 instanceof Short) || (object0 instanceof BigInteger);
                goto label_20;
            }
            case 4: {
                z = (object0 instanceof Double) || (object0 instanceof Float) || (object0 instanceof BigDecimal);
            label_20:
                if(!z) {
                    ggwq.d(this.d, object0, ggtq0.o);
                    return;
                }
                break;
            }
            default: {
                throw null;
            }
        }
        StringBuilder stringBuilder0 = this.d;
        int v2 = ggtq0.ordinal();
        switch(v2) {
            case 0: {
                if(!(object0 instanceof Formattable)) {
                    stringBuilder0.append(ggtz.b(object0));
                    return;
                }
                Formattable formattable0 = (Formattable)object0;
                int v4 = ggtr0.b;
                int v5 = v4 & 0xA2;
                if(v5 != 0) {
                    if((v4 & 0x20) == 0) {
                        v1 = 0;
                    }
                    if((v4 & 2) == 0) {
                        v = 0;
                    }
                    v5 = v1 | ((v4 & 0x80) == 0 ? 0 : 2) | v;
                }
                int v6 = stringBuilder0.length();
                Formatter formatter0 = new Formatter(stringBuilder0, ggtz.a);
                try {
                    formattable0.formatTo(formatter0, v5, ggtr0.c, ggtr0.d);
                    return;
                }
                catch(RuntimeException runtimeException0) {
                    stringBuilder0.setLength(v6);
                    try {
                        formatter0.out().append(ggtz.a(formattable0, runtimeException0));
                    }
                    catch(IOException unused_ex) {
                    }
                }
                return;
            }
            case 2: {
                if((object0 instanceof Character)) {
                    stringBuilder0.append(object0);
                    return;
                }
                int v7 = ((Number)object0).intValue();
                if(v7 >>> 16 == 0) {
                    stringBuilder0.append(((char)v7));
                    return;
                }
                stringBuilder0.append(Character.toChars(v7));
                return;
            }
            case 1: 
            case 3: {
                stringBuilder0.append(object0);
                return;
            }
            default: {
                if(v2 == 5 && ggtr0.equals(ggtr0)) {
                    boolean z1 = ggtr0.d();
                    long v3 = ((Number)object0).longValue();
                    if((((Number)object0) instanceof Long)) {
                        ggtz.c(stringBuilder0, v3, z1);
                        return;
                    }
                    if((((Number)object0) instanceof Integer)) {
                        ggtz.c(stringBuilder0, v3 & 0xFFFFFFFFL, z1);
                        return;
                    }
                    if((((Number)object0) instanceof Byte)) {
                        ggtz.c(stringBuilder0, v3 & 0xFFL, z1);
                        return;
                    }
                    if((((Number)object0) instanceof Short)) {
                        ggtz.c(stringBuilder0, v3 & 0xFFFFL, z1);
                        return;
                    }
                    if(!(((Number)object0) instanceof BigInteger)) {
                        throw new IllegalStateException("unsupported number type: " + ((Number)object0).getClass());
                    }
                    String s = ((BigInteger)(((Number)object0))).toString(16);
                    if(z1) {
                        s = s.toUpperCase(ggtz.a);
                    }
                    stringBuilder0.append(s);
                    return;
                }
                stringBuilder0.append(String.format(ggtz.a, ggtq0.o, object0));
            }
        }
    }
}

