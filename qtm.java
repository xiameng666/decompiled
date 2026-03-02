import java.io.EOFException;

public final class qtm extends qtl {
    private static final idlq f;
    private static final idlq g;
    private static final idlq h;
    private static final idlq i;
    private static final idlq j;
    private final idlo k;
    private final idlm l;
    private int m;
    private long n;
    private int o;
    private String p;

    static {
        qtm.f = idlp.b("\'\\");
        qtm.g = idlp.b("\"\\");
        qtm.h = idlp.b("{}[]:, \n\t\r\f/\\;#=");
        qtm.i = idlp.b("\n\r");
        qtm.j = idlp.b("*/");
    }

    public qtm(idlo idlo0) {
        this.m = 0;
        this.k = idlo0;
        this.l = ((idmr)idlo0).b;
        this.l(6);
    }

    private final void A() {
        long v = this.k.m(qtm.h);
        idlm idlm0 = this.l;
        if(Long.compare(v, -1L) == 0) {
            v = idlm0.b;
        }
        idlm0.I(v);
    }

    private final boolean B(int v) {
        switch(v) {
            case 35: 
            case 0x2F: 
            case 59: 
            case 61: 
            case 92: {
                this.x();
                break;
            }
            case 9: 
            case 10: 
            case 12: 
            case 13: 
            case 0x20: 
            case 44: 
            case 58: 
            case 91: 
            case 93: 
            case 0x7B: 
            case 0x7D: {
                break;
            }
            default: {
                return true;
            }
        }
        return false;
    }

    @Override  // qtl
    public final double a() {
        double f;
        switch((this.m == 0 ? this.s() : this.m)) {
            case 8: {
                this.p = this.v(qtm.f);
                break;
            }
            case 9: {
                this.p = this.v(qtm.g);
                break;
            }
            case 10: {
                this.p = this.w();
                break;
            }
            case 11: {
                break;
            }
            case 16: {
                this.m = 0;
                int v = this.b - 1;
                ++this.e[v];
                return (double)this.n;
            }
            case 17: {
                this.p = this.l.t(((long)this.o));
                break;
            }
            default: {
                throw new qth(qtj.b(this, "Expected a double but was "));
            }
        }
        try {
            this.m = 11;
            f = Double.parseDouble(this.p);
        }
        catch(NumberFormatException unused_ex) {
            throw new qth("Expected a double but was " + this.p + " at path " + this.e());
        }
        if(Double.isNaN(f) || Double.isInfinite(f)) {
            throw new qti("JSON forbids NaN and infinities: " + f + " at path " + this.e());
        }
        this.p = null;
        this.m = 0;
        int v1 = this.b - 1;
        ++this.e[v1];
        return f;
    }

    @Override  // qtl
    public final int b() {
        double f;
        String s;
        switch((this.m == 0 ? this.s() : this.m)) {
            case 8: {
                s = this.v(qtm.f);
                goto label_5;
            }
            case 9: {
                s = this.v(qtm.g);
                try {
                label_5:
                    this.p = s;
                    int v = Integer.parseInt(s);
                    this.m = 0;
                    int v1 = this.b - 1;
                    ++this.e[v1];
                    return v;
                }
                catch(NumberFormatException unused_ex) {
                    break;
                }
            }
            case 11: {
                break;
            }
            case 16: {
                long v2 = this.n;
                if(v2 != ((long)(((int)v2)))) {
                    throw new qth("Expected an int but was " + v2 + " at path " + this.e());
                }
                this.m = 0;
                int v3 = this.b - 1;
                ++this.e[v3];
                return (int)v2;
            }
            case 17: {
                this.p = this.l.t(((long)this.o));
                break;
            }
            default: {
                throw new qth(qtj.b(this, "Expected an int but was "));
            }
        }
        try {
            this.m = 11;
            f = Double.parseDouble(this.p);
        }
        catch(NumberFormatException unused_ex) {
            throw new qth("Expected an int but was " + this.p + " at path " + this.e());
        }
        if(((double)(((int)f))) != f) {
            throw new qth("Expected an int but was " + this.p + " at path " + this.e());
        }
        this.p = null;
        this.m = 0;
        int v4 = this.b - 1;
        ++this.e[v4];
        return (int)f;
    }

    @Override  // qtl
    public final int c(qtj qtj0) {
        int v = this.m == 0 ? this.s() : this.m;
        if(v >= 12 && v <= 15) {
            if(v == 15) {
                return this.t(this.p, qtj0);
            }
            int v1 = this.k.h(qtj0.b);
            if(v1 != -1) {
                this.m = 0;
                this.d[this.b - 1] = qtj0.a[v1];
                return v1;
            }
            String s = this.d[this.b - 1];
            String s1 = this.f();
            int v2 = this.t(s1, qtj0);
            if(v2 == -1) {
                this.m = 15;
                this.p = s1;
                this.d[this.b - 1] = s;
                return -1;
            }
            return v2;
        }
        return -1;
    }

    @Override
    public final void close() {
        this.m = 0;
        this.c[0] = 8;
        this.b = 1;
        this.l.G();
        this.k.close();
    }

    @Override  // qtl
    public final String f() {
        String s;
        switch((this.m == 0 ? this.s() : this.m)) {
            case 12: {
                s = this.v(qtm.f);
                break;
            }
            case 13: {
                s = this.v(qtm.g);
                break;
            }
            case 14: {
                s = this.w();
                break;
            }
            case 15: {
                s = this.p;
                break;
            }
            default: {
                throw new qth(qtj.b(this, "Expected a name but was "));
            }
        }
        this.m = 0;
        this.d[this.b - 1] = s;
        return s;
    }

    @Override  // qtl
    public final String g() {
        String s;
        switch((this.m == 0 ? this.s() : this.m)) {
            case 8: {
                s = this.v(qtm.f);
                break;
            }
            case 9: {
                s = this.v(qtm.g);
                break;
            }
            case 10: {
                s = this.w();
                break;
            }
            case 11: {
                s = this.p;
                this.p = null;
                break;
            }
            case 16: {
                s = Long.toString(this.n);
                break;
            }
            case 17: {
                s = this.l.t(((long)this.o));
                break;
            }
            default: {
                throw new qth(qtj.b(this, "Expected a string but was "));
            }
        }
        this.m = 0;
        int v = this.b - 1;
        ++this.e[v];
        return s;
    }

    @Override  // qtl
    public final void h() {
        if((this.m == 0 ? this.s() : this.m) != 3) {
            throw new qth(qtj.b(this, "Expected BEGIN_ARRAY but was "));
        }
        this.l(1);
        this.e[this.b - 1] = 0;
        this.m = 0;
    }

    @Override  // qtl
    public final void i() {
        if((this.m == 0 ? this.s() : this.m) != 1) {
            throw new qth(qtj.b(this, "Expected BEGIN_OBJECT but was "));
        }
        this.l(3);
        this.m = 0;
    }

    @Override  // qtl
    public final void j() {
        if((this.m == 0 ? this.s() : this.m) != 4) {
            throw new qth(qtj.b(this, "Expected END_ARRAY but was "));
        }
        int v = this.b;
        this.b = v - 1;
        ++this.e[v - 2];
        this.m = 0;
    }

    @Override  // qtl
    public final void k() {
        if((this.m == 0 ? this.s() : this.m) != 2) {
            throw new qth(qtj.b(this, "Expected END_OBJECT but was "));
        }
        int v = this.b;
        this.b = v - 1;
        this.d[v - 1] = null;
        ++this.e[v - 2];
        this.m = 0;
    }

    @Override  // qtl
    public final void m() {
        switch((this.m == 0 ? this.s() : this.m)) {
            case 12: {
                this.y(qtm.f);
                break;
            }
            case 13: {
                this.y(qtm.g);
                break;
            }
            case 14: {
                this.A();
                break;
            }
            case 15: {
                break;
            }
            default: {
                throw new qth(qtj.b(this, "Expected a name but was "));
            }
        }
        this.m = 0;
        this.d[this.b - 1] = "null";
    }

    @Override  // qtl
    public final void n() {
        int v = 0;
    alab1:
        while(true) {
            switch((this.m == 0 ? this.s() : this.m)) {
                case 1: {
                    this.l(3);
                    ++v;
                    goto label_26;
                }
                case 2: {
                    --v;
                    if(v < 0) {
                        throw new qth(qtj.b(this, "Expected a value but was "));
                    }
                    --this.b;
                    goto label_26;
                }
                case 3: {
                    this.l(1);
                    ++v;
                    goto label_26;
                }
                case 4: {
                    --v;
                    if(v < 0) {
                        throw new qth(qtj.b(this, "Expected a value but was "));
                    }
                    --this.b;
                    goto label_26;
                }
                case 8: 
                case 12: {
                    this.y(qtm.f);
                    goto label_26;
                }
                case 9: 
                case 13: {
                    this.y(qtm.g);
                    goto label_26;
                }
                case 10: 
                case 14: {
                    this.A();
                    goto label_26;
                }
                case 17: {
                    this.l.I(((long)this.o));
                label_26:
                    this.m = 0;
                    if(v == 0) {
                        int v1 = this.b - 1;
                        ++this.e[v1];
                        this.d[v1] = "null";
                        return;
                    }
                    break;
                }
                case 18: {
                    break alab1;
                }
                default: {
                    goto label_26;
                }
            }
        }
        throw new qth(qtj.b(this, "Expected a value but was "));
    }

    @Override  // qtl
    public final boolean o() {
        int v = this.m == 0 ? this.s() : this.m;
        return v != 2 && v != 4 && v != 18;
    }

    @Override  // qtl
    public final boolean p() {
        switch((this.m == 0 ? this.s() : this.m)) {
            case 5: {
                this.m = 0;
                int v = this.b - 1;
                ++this.e[v];
                return true;
            }
            case 6: {
                this.m = 0;
                int v1 = this.b - 1;
                ++this.e[v1];
                return false;
            }
            default: {
                throw new qth(qtj.b(this, "Expected a boolean but was "));
            }
        }
    }

    @Override  // qtl
    public final int q() {
        switch((this.m == 0 ? this.s() : this.m)) {
            case 1: {
                return 3;
            }
            case 2: {
                return 4;
            }
            case 3: {
                return 1;
            }
            case 4: {
                return 2;
            }
            case 5: 
            case 6: {
                return 8;
            }
            case 7: {
                return 9;
            }
            case 8: 
            case 9: 
            case 10: 
            case 11: {
                return 6;
            }
            case 12: 
            case 13: 
            case 14: 
            case 15: {
                return 5;
            }
            case 16: 
            case 17: {
                return 7;
            }
            default: {
                return 10;
            }
        }
    }

    private final char r() {
        int v3;
        idlo idlo0 = this.k;
        if(idlo0.K(1L)) {
            idlm idlm0 = this.l;
            int v = idlm0.d();
            switch(v) {
                case 10: 
                case 34: 
                case 39: 
                case 0x2F: 
                case 92: {
                    return (char)v;
                }
                case 98: {
                    return '\b';
                }
                case 102: {
                    return '\f';
                }
                case 110: {
                    return '\n';
                }
                case 0x72: {
                    return '\r';
                }
                case 0x74: {
                    return '\t';
                }
                case 0x75: {
                    if(!idlo0.K(4L)) {
                        throw new EOFException("Unterminated escape sequence at path " + this.e());
                    }
                    char c = '\u0000';
                    int v1 = 0;
                    while(v1 < 4) {
                        int v2 = idlm0.c(((long)v1));
                        if(v2 >= 0x30 && v2 <= 57) {
                            v3 = v2 - 0x30;
                            c = (char)(((char)(c << 4)) + v3);
                            ++v1;
                            continue;
                        }
                        if(v2 >= 97 && v2 <= 102) {
                            v3 = v2 - 87;
                            c = (char)(((char)(c << 4)) + v3);
                            ++v1;
                            continue;
                        }
                        if(v2 < 65 || v2 > 70) {
                            throw this.d("\\u" + idlm0.t(4L));
                        }
                        v3 = v2 - 55;
                        c = (char)(((char)(c << 4)) + v3);
                        ++v1;
                        continue;
                    }
                    idlm0.I(4L);
                    return c;
                }
                default: {
                    throw this.d("Invalid escape sequence: \\" + ((char)v));
                }
            }
        }
        throw this.d("Unterminated escape sequence");
    }

    private final int s() {
        idlm idlm2;
        idlm idlm3;
        int v17;
        int v9;
        int v7;
        String s1;
        String s;
        int[] arr_v = this.c;
        int v = this.b - 1;
        int v1 = arr_v[v];
        int v2 = 4;
        int v3 = 1;
        if(v1 == 1) {
            arr_v[v] = 2;
            goto label_34;
        }
        if(v1 == 2) {
            int v4 = this.u(true);
            this.l.d();
            switch(v4) {
                case 44: {
                    goto label_34;
                }
                case 59: {
                    this.x();
                    goto label_34;
                }
                case 93: {
                    this.m = v2;
                    return v2;
                }
                default: {
                    throw this.d("Unterminated array");
                }
            }
        }
        if(v1 != 3 && v1 != 5) {
            switch(v1) {
                case 4: {
                    arr_v[v] = 5;
                    int v5 = this.u(true);
                    idlm idlm0 = this.l;
                    idlm0.d();
                    switch(v5) {
                        case 58: {
                            goto label_34;
                        }
                        case 61: {
                            this.x();
                            if(this.k.K(1L) && idlm0.c(0L) == 62) {
                                idlm0.d();
                            }
                            goto label_34;
                        }
                        default: {
                            throw this.d("Expected \':\'");
                        }
                    }
                }
                case 6: {
                    arr_v[v] = 7;
                    goto label_34;
                }
                case 7: {
                    if(this.u(false) == -1) {
                        v2 = 18;
                        this.m = v2;
                        return v2;
                    }
                    this.x();
                label_34:
                    int v6 = this.u(true);
                    if(v6 != 34) {
                        switch(v6) {
                            case 39: {
                                this.x();
                                this.l.d();
                                this.m = 8;
                                return 8;
                            }
                            case 44: 
                            case 59: {
                            label_190:
                                if(v1 != 1 && v1 != 2) {
                                    throw this.d("Unexpected value");
                                }
                                this.x();
                                this.m = 7;
                                return 7;
                            }
                            case 91: {
                                this.l.d();
                                this.m = 3;
                                return 3;
                            }
                            case 93: {
                                if(v1 == 1) {
                                    this.l.d();
                                    this.m = 4;
                                    return 4;
                                }
                                goto label_190;
                            }
                            case 0x7B: {
                                this.l.d();
                                this.m = 1;
                                return 1;
                            }
                            default: {
                                idlm idlm1 = this.l;
                                switch(idlm1.c(0L)) {
                                    case 70: 
                                    case 102: {
                                        s = "FALSE";
                                        s1 = "false";
                                        v7 = 6;
                                        break;
                                    }
                                    case 78: 
                                    case 110: {
                                        s = "NULL";
                                        s1 = "null";
                                        v7 = 7;
                                        break;
                                    }
                                    case 84: 
                                    case 0x74: {
                                        s = "TRUE";
                                        s1 = "true";
                                        v7 = 5;
                                        break;
                                    }
                                    default: {
                                        v7 = 0;
                                        goto label_67;
                                    }
                                }
                                int v8 = 1;
                                while(true) {
                                    v9 = s1.length();
                                    if(v8 >= v9) {
                                        goto label_62;
                                    }
                                    if(!this.k.K(((long)(v8 + 1)))) {
                                        break;
                                    }
                                    int v10 = idlm1.c(((long)v8));
                                    if(v10 != s1.charAt(v8) && v10 != s.charAt(v8)) {
                                        break;
                                    }
                                    ++v8;
                                }
                                v7 = 0;
                                goto label_67;
                            label_62:
                                if(!this.k.K(((long)(v9 + 1))) || !this.B(idlm1.c(((long)v9)))) {
                                    idlm1.I(((long)v9));
                                    this.m = v7;
                                }
                                else {
                                    v7 = 0;
                                }
                            label_67:
                                if(v7 == 0) {
                                    int v11 = 0;
                                    int v12 = 0;
                                    int v13 = 0;
                                    int v14 = 1;
                                    long v15 = 0L;
                                alab1:
                                    while(true) {
                                        if(this.k.K(((long)(v12 + 1)))) {
                                            int v16 = idlm1.c(((long)v12));
                                            switch(v16) {
                                                case 43: {
                                                    goto label_140;
                                                }
                                                case 45: {
                                                    goto label_146;
                                                }
                                                case 46: {
                                                    goto label_158;
                                                }
                                                case 69: 
                                                case 101: {
                                                    goto label_164;
                                                }
                                                default: {
                                                    if(v16 >= 0x30 && v16 <= 57) {
                                                        if(v11 != 0 && v11 != 1) {
                                                            switch(v11) {
                                                                case 2: {
                                                                    if(v15 == 0L) {
                                                                        v17 = 0;
                                                                        idlm3 = idlm1;
                                                                        break alab1;
                                                                    }
                                                                    int v18 = Long.compare(v15, -922337203685477580L);
                                                                    long v19 = 10L * v15 - ((long)(v16 - 0x30));
                                                                    v14 &= (v18 > 0 || v18 == 0 && v19 < v15 ? 1 : 0);
                                                                    v15 = v19;
                                                                    idlm1 = idlm1;
                                                                    ++v12;
                                                                    continue;
                                                                }
                                                                case 3: {
                                                                    idlm3 = idlm1;
                                                                    v11 = 4;
                                                                    idlm1 = idlm3;
                                                                    ++v12;
                                                                    continue;
                                                                }
                                                                default: {
                                                                    if(v11 == 5 || v11 == 6) {
                                                                        v11 = 7;
                                                                    }
                                                                    idlm3 = idlm1;
                                                                    idlm1 = idlm3;
                                                                    ++v12;
                                                                    continue;
                                                                }
                                                            }
                                                        }
                                                        else {
                                                            v15 = (long)(-(v16 - 0x30));
                                                            v11 = 2;
                                                            idlm1 = idlm1;
                                                            ++v12;
                                                            continue;
                                                        }
                                                        goto label_106;
                                                    }
                                                    else {
                                                    label_106:
                                                        idlm2 = idlm1;
                                                        if(this.B(v16)) {
                                                            idlm3 = idlm2;
                                                            goto label_170;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        else {
                                            idlm2 = idlm1;
                                        }
                                        if(v11 == 2) {
                                            if(v14 == 0) {
                                                idlm3 = idlm2;
                                                v11 = 2;
                                                goto label_135;
                                            }
                                            else {
                                                if(v15 != 0x8000000000000000L) {
                                                    v3 = v13;
                                                }
                                                else if(v13 == 0) {
                                                    v11 = 2;
                                                    goto label_134;
                                                }
                                                if(v15 == 0L) {
                                                    if(v3 == 0) {
                                                        v3 = 0;
                                                    }
                                                    else {
                                                        v11 = 2;
                                                        goto label_134;
                                                    }
                                                }
                                                if(v3 == 0) {
                                                    v15 = -v15;
                                                }
                                                this.n = v15;
                                                idlm3 = idlm2;
                                                idlm3.I(((long)v12));
                                                this.m = 16;
                                                v17 = 16;
                                                break;
                                            }
                                        }
                                    label_134:
                                        idlm3 = idlm2;
                                    label_135:
                                        if(v11 == 2 || (v11 == 4 || v11 == 7)) {
                                            this.o = v12;
                                            v17 = 17;
                                            this.m = 17;
                                            break;
                                        label_140:
                                            idlm3 = idlm1;
                                            if(v11 == 5) {
                                                v11 = 6;
                                                idlm1 = idlm3;
                                                ++v12;
                                                continue;
                                            label_146:
                                                idlm3 = idlm1;
                                                if(v11 == 0) {
                                                    v11 = 1;
                                                    v13 = 1;
                                                    idlm1 = idlm3;
                                                    ++v12;
                                                    continue;
                                                }
                                                else if(v11 == 5) {
                                                    v11 = 6;
                                                    idlm1 = idlm3;
                                                    ++v12;
                                                    continue;
                                                label_158:
                                                    idlm3 = idlm1;
                                                    if(v11 == 2) {
                                                        v11 = 3;
                                                        idlm1 = idlm3;
                                                        ++v12;
                                                        continue;
                                                    label_164:
                                                        idlm3 = idlm1;
                                                        if(v11 == 2 || v11 == 4) {
                                                            v11 = 5;
                                                            idlm1 = idlm3;
                                                            ++v12;
                                                            continue;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    label_170:
                                        break;
                                    }
                                    if(v17 != 0) {
                                        return v17;
                                    }
                                    if(!this.B(idlm3.c(0L))) {
                                        throw this.d("Expected value");
                                    }
                                    this.x();
                                    this.m = 10;
                                    return 10;
                                }
                                return v7;
                            }
                        }
                    }
                    this.l.d();
                    this.m = 9;
                    return 9;
                }
                case 8: {
                    throw new IllegalStateException("JsonReader is closed");
                }
                default: {
                    goto label_34;
                }
            }
        }
        arr_v[v] = 4;
        if(v1 == 5) {
            int v20 = this.u(true);
            this.l.d();
            switch(v20) {
                case 44: {
                    break;
                }
                case 59: {
                    this.x();
                    break;
                }
                case 0x7D: {
                    v2 = 2;
                    this.m = v2;
                    return v2;
                }
                default: {
                    throw this.d("Unterminated object");
                }
            }
        }
        int v21 = this.u(true);
        switch(v21) {
            case 34: {
                this.l.d();
                this.m = 13;
                return 13;
            }
            case 39: {
                this.l.d();
                this.x();
                this.m = 12;
                return 12;
            }
            case 0x7D: {
                if(v1 == 5) {
                    throw this.d("Expected name");
                }
                this.l.d();
                this.m = 2;
                return 2;
            }
            default: {
                this.x();
                if(!this.B(((int)(((char)v21))))) {
                    throw this.d("Expected name");
                }
                v2 = 14;
                this.m = v2;
                return v2;
            }
        }
    }

    private final int t(String s, qtj qtj0) {
        String[] arr_s = qtj0.a;
        for(int v = 0; v < arr_s.length; ++v) {
            if(s.equals(arr_s[v])) {
                this.m = 0;
                this.d[this.b - 1] = s;
                return v;
            }
        }
        return -1;
    }

    @Override
    public final String toString() {
        return "JsonReader(" + this.k.toString() + ")";
    }

    private final int u(boolean z) {
    alab1:
        while(true) {
            int v = 0;
        alab2:
            while(true) {
                idlo idlo0 = this.k;
                if(!idlo0.K(((long)(v + 1)))) {
                    break alab1;
                }
                idlm idlm0 = this.l;
                int v1 = idlm0.c(((long)v));
                if(v1 == 9 || v1 == 10 || v1 == 13 || v1 == 0x20) {
                    ++v;
                    continue;
                }
                idlm0.I(((long)v));
                if(v1 == 0x2F) {
                    if(!idlo0.K(2L)) {
                        return 0x2F;
                    }
                    this.x();
                    switch(idlm0.c(1L)) {
                        case 42: {
                            idlm0.d();
                            idlm0.d();
                            long v2 = idlo0.j(qtm.j);
                            idlm0.I((v2 == -1L ? idlm0.b : v2 + ((long)qtm.j.c())));
                            if(v2 != -1L) {
                                break alab2;
                            }
                            throw this.d("Unterminated comment");
                        }
                        case 0x2F: {
                            idlm0.d();
                            idlm0.d();
                            this.z();
                            break alab2;
                        }
                        default: {
                            return 0x2F;
                        }
                    }
                }
                else {
                    if(v1 == 35) {
                        this.x();
                        this.z();
                        break;
                    }
                    return v1;
                }
                break alab1;
            }
        }
        if(!z) {
            return -1;
        }
        throw new EOFException("End of input");
    }

    private final String v(idlq idlq0) {
        StringBuilder stringBuilder0 = null;
        long v;
        while((v = this.k.m(idlq0)) != -1L) {
            idlm idlm0 = this.l;
            if(idlm0.c(v) == 92) {
                if(stringBuilder0 == null) {
                    stringBuilder0 = new StringBuilder();
                }
                stringBuilder0.append(idlm0.t(v));
                idlm0.d();
                stringBuilder0.append(this.r());
                continue;
            }
            if(stringBuilder0 == null) {
                String s = idlm0.t(v);
                idlm0.d();
                return s;
            }
            stringBuilder0.append(idlm0.t(v));
            idlm0.d();
            return stringBuilder0.toString();
        }
        throw this.d("Unterminated string");
    }

    private final String w() {
        long v = this.k.m(qtm.h);
        return v == -1L ? this.l.s() : this.l.t(v);
    }

    private final void x() {
        throw this.d("Use JsonReader.setLenient(true) to accept malformed JSON");
    }

    private final void y(idlq idlq0) {
        long v;
        while((v = this.k.m(idlq0)) != -1L) {
            idlm idlm0 = this.l;
            if(idlm0.c(v) == 92) {
                idlm0.I(1L + v);
                this.r();
                continue;
            }
            idlm0.I(1L + v);
            return;
        }
        throw this.d("Unterminated string");
    }

    private final void z() {
        long v = this.k.m(qtm.i);
        this.l.I((Long.compare(v, -1L) == 0 ? this.l.b : v + 1L));
    }
}

