import j..util.Objects;
import java.io.Closeable;
import java.io.EOFException;
import java.io.Reader;
import java.util.Arrays;

public final class gqff implements Closeable {
    public gqaa a;
    public final char[] b;
    public int c;
    public int d;
    public long e;
    public int f;
    public String g;
    public int h;
    public int[] i;
    private final Reader j;
    private int k;
    private int l;
    private int m;
    private int[] n;
    private String[] o;

    static {
        gqbk.a = new gqbk();
    }

    public gqff(Reader reader0) {
        this.a = gqaa.b;
        this.b = new char[0x400];
        this.c = 0;
        this.k = 0;
        this.l = 0;
        this.m = 0;
        this.d = 0;
        int[] arr_v = new int[0x20];
        this.n = arr_v;
        this.h = 1;
        arr_v[0] = 6;
        this.o = new String[0x20];
        this.i = new int[0x20];
        this.j = (Reader)Objects.requireNonNull(reader0, "in == null");
    }

    private final void A(int v) {
        int v1 = this.h;
        if(v1 - 1 >= 0x500) {
            throw new gqfi("Nesting limit 1280 reached" + this.g());
        }
        int[] arr_v = this.n;
        if(v1 == arr_v.length) {
            int v2 = v1 + v1;
            this.n = Arrays.copyOf(arr_v, v2);
            this.i = Arrays.copyOf(this.i, v2);
            this.o = (String[])Arrays.copyOf(this.o, v2);
        }
        int v3 = this.h;
        this.h = v3 + 1;
        this.n[v3] = v;
    }

    private final void B(char c) {
        do {
            int v = this.c;
            int v1 = this.k;
            while(v < v1) {
                int v2 = this.b[v];
                if(v2 == c) {
                    this.c = v + 1;
                    return;
                }
                switch(v2) {
                    case 10: {
                        ++this.l;
                        this.m = v + 1;
                        ++v;
                        break;
                    }
                    case 92: {
                        this.c = v + 1;
                        this.v();
                        v = this.c;
                        v1 = this.k;
                        break;
                    }
                    default: {
                        ++v;
                    }
                }
            }
            this.c = v;
        }
        while(this.E(1));
        throw this.x("Unterminated string");
    }

    private final void C() {
        while(this.c < this.k || this.E(1)) {
            int v = this.c;
            int v1 = v + 1;
            this.c = v1;
            int v2 = this.b[v];
            if(v2 == 10) {
                ++this.l;
                this.m = v1;
                return;
            }
            if(v2 == 13) {
                break;
            }
        }
    }

    private final void D() {
        int v1;
        do {
            int v = 0;
        alab1:
            while(true) {
                v1 = this.c + v;
                if(v1 >= this.k) {
                    goto label_9;
                }
                switch(this.b[v1]) {
                    case 35: 
                    case 0x2F: 
                    case 59: 
                    case 61: 
                    case 92: {
                        break alab1;
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
                        this.c += v;
                        return;
                    }
                    default: {
                        ++v;
                    }
                }
            }
            this.z();
            this.c += v;
            return;
        label_9:
            this.c = v1;
        }
        while(this.E(1));
    }

    private final boolean E(int v) {
        int v1 = this.c;
        this.m -= v1;
        char[] arr_c = this.b;
        int v2 = this.k;
        if(v2 == v1) {
            this.k = 0;
        }
        else {
            int v3 = v2 - v1;
            this.k = v3;
            System.arraycopy(arr_c, v1, arr_c, 0, v3);
        }
        this.c = 0;
        int v4;
        while((v4 = this.j.read(arr_c, this.k, 0x400 - this.k)) != -1) {
            int v5 = this.k + v4;
            this.k = v5;
            if(this.l == 0 && this.m == 0 && v5 > 0 && arr_c[0] == 0xFEFF) {
                ++this.c;
                this.m = 1;
                ++v;
            }
            if(v5 >= v) {
                return true;
            }
        }
        return false;
    }

    private final boolean F(char c) {
        switch(c) {
            case 35: 
            case 0x2F: 
            case 59: 
            case 61: 
            case 92: {
                this.z();
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

    public final double a() {
        int v = this.d == 0 ? this.b() : this.d;
        switch(v) {
            case 8: 
            case 9: {
                this.g = this.i(((char)(v == 8 ? 39 : 34)));
                break;
            }
            case 10: {
                this.g = this.k();
                break;
            }
            case 11: {
                break;
            }
            case 15: {
                this.d = 0;
                int v1 = this.h - 1;
                ++this.i[v1];
                return (double)this.e;
            }
            case 16: {
                int v2 = this.c;
                int v3 = this.f;
                this.g = new String(this.b, v2, v3);
                this.c = v2 + v3;
                break;
            }
            default: {
                throw this.d("a double");
            }
        }
        this.d = 11;
        double f = Double.parseDouble(this.g);
        if(this.a != gqaa.a && (Double.isNaN(f) || Double.isInfinite(f))) {
            throw this.x(a.E(f, "JSON forbids NaN and infinities: "));
        }
        this.g = null;
        this.d = 0;
        int v4 = this.h - 1;
        ++this.i[v4];
        return f;
    }

    public final int b() {
        int v23;
        int v24;
        char[] arr_c1;
        int v11;
        int v9;
        String s1;
        String s;
        int[] arr_v = this.n;
        int v = this.h - 1;
        int v1 = arr_v[v];
        int v2 = 3;
        if(v1 == 1) {
            arr_v[v] = 2;
        }
        else if(v1 == 2) {
            switch(this.w(true)) {
                case 44: {
                    break;
                }
                case 59: {
                    this.z();
                    break;
                }
                case 93: {
                    v2 = 4;
                    this.d = v2;
                    return v2;
                }
                default: {
                    throw this.x("Unterminated array");
                }
            }
        }
        else {
        alab1:
            switch(v1) {
                case 4: {
                    arr_v[v] = 5;
                    switch(this.w(true)) {
                        case 58: {
                            break alab1;
                        }
                        case 61: {
                            this.z();
                            if(this.c < this.k || this.E(1)) {
                                int v4 = this.c;
                                if(this.b[v4] == 62) {
                                    this.c = v4 + 1;
                                }
                            }
                            break alab1;
                        }
                        default: {
                            throw this.x("Expected \':\'");
                        }
                    }
                }
                case 3: 
                case 5: {
                    arr_v[v] = 4;
                    if(v1 == 5) {
                        switch(this.w(true)) {
                            case 44: {
                                break;
                            }
                            case 59: {
                                this.z();
                                break;
                            }
                            case 0x7D: {
                                v2 = 2;
                                this.d = v2;
                                return v2;
                            }
                            default: {
                                throw this.x("Unterminated object");
                            }
                        }
                    }
                    int v3 = this.w(true);
                    switch(v3) {
                        case 34: {
                            v2 = 13;
                            this.d = v2;
                            return v2;
                        }
                        case 39: {
                            this.z();
                            this.d = 12;
                            return 12;
                        }
                        default: {
                            if(v3 != 0x7D) {
                                this.z();
                                --this.c;
                                if(!this.F(((char)v3))) {
                                    throw this.x("Expected name");
                                }
                                v2 = 14;
                                this.d = v2;
                                return v2;
                            }
                            if(v1 == 5) {
                                throw this.x("Expected name");
                            }
                            v2 = 2;
                            this.d = v2;
                            return v2;
                        }
                    }
                }
                case 6: {
                    if(this.a == gqaa.a) {
                        this.w(true);
                        int v5 = this.c;
                        this.c = v5 - 1;
                        if(v5 + 4 <= this.k || this.E(5)) {
                            int v6 = this.c;
                            if(this.b[v6] == 41 && this.b[v6 + 1] == 93 && this.b[v6 + 2] == 0x7D && this.b[v6 + 3] == 39 && this.b[v6 + 4] == 10) {
                                this.c = v6 + 5;
                            }
                        }
                    }
                    this.n[this.h - 1] = 7;
                    break;
                }
                case 7: {
                    if(this.w(false) == -1) {
                        v2 = 17;
                        this.d = v2;
                        return v2;
                    }
                    this.z();
                    --this.c;
                    break;
                }
                default: {
                    if(v1 == 8) {
                        throw new IllegalStateException("JsonReader is closed");
                    }
                }
            }
        }
        int v7 = this.w(true);
        switch(v7) {
            case 34: {
                v2 = 9;
                this.d = v2;
                return v2;
            }
            case 39: {
                this.z();
                this.d = 8;
                return 8;
            }
            case 44: 
            case 59: {
                break;
            }
            case 91: {
                this.d = v2;
                return v2;
            }
            case 93: {
                if(v1 == 1) {
                    v2 = 4;
                    this.d = v2;
                    return v2;
                }
                break;
            }
            default: {
                if(v7 != 0x7B) {
                    int v8 = this.c - 1;
                    this.c = v8;
                    char[] arr_c = this.b;
                    switch(arr_c[v8]) {
                        case 70: 
                        case 102: {
                            s = "FALSE";
                            s1 = "false";
                            v9 = 6;
                            break;
                        }
                        case 78: 
                        case 110: {
                            s = "NULL";
                            s1 = "null";
                            v9 = 7;
                            break;
                        }
                        case 84: 
                        case 0x74: {
                            s = "TRUE";
                            s1 = "true";
                            v9 = 5;
                            break;
                        }
                        default: {
                            v9 = 0;
                            goto label_100;
                        }
                    }
                    gqaa gqaa0 = this.a;
                    gqaa gqaa1 = gqaa.c;
                    int v10 = 0;
                    while(true) {
                        v11 = s1.length();
                        if(v10 >= v11) {
                            goto label_95;
                        }
                        if(this.c + v10 >= this.k && !this.E(v10 + 1)) {
                            break;
                        }
                        int v12 = arr_c[this.c + v10];
                        if(v12 != s1.charAt(v10) && (gqaa0 == gqaa1 || v12 != s.charAt(v10))) {
                            break;
                        }
                        ++v10;
                    }
                    v9 = 0;
                    goto label_100;
                label_95:
                    if((this.c + v11 < this.k || this.E(v11 + 1)) && this.F(arr_c[this.c + v11])) {
                        v9 = 0;
                    }
                    else {
                        this.c += v11;
                        this.d = v9;
                    }
                label_100:
                    if(v9 == 0) {
                        int v13 = this.c;
                        int v14 = this.k;
                        int v15 = 0;
                        int v16 = 0;
                        int v17 = 0;
                        int v18 = 1;
                        long v19 = 0L;
                    alab2:
                        while(true) {
                            if(v13 + v15 == v14) {
                                if(v15 == 0x400) {
                                }
                                else if(this.E(v15 + 1)) {
                                    v14 = this.k;
                                    v13 = this.c;
                                    goto label_118;
                                }
                                else {
                                    arr_c1 = arr_c;
                                    goto label_147;
                                }
                                arr_c1 = arr_c;
                            }
                            else {
                            label_118:
                                int v20 = arr_c[v13 + v15];
                                switch(v20) {
                                    case 43: {
                                        arr_c1 = arr_c;
                                        if(v16 == 5) {
                                            v16 = 6;
                                            ++v15;
                                            arr_c = arr_c1;
                                            continue;
                                        }
                                        break;
                                    }
                                    case 45: {
                                        arr_c1 = arr_c;
                                        if(v16 == 0) {
                                            v16 = 1;
                                            v17 = 1;
                                            ++v15;
                                            arr_c = arr_c1;
                                            continue;
                                        }
                                        else if(v16 == 5) {
                                            v16 = 6;
                                            ++v15;
                                            arr_c = arr_c1;
                                            continue;
                                        }
                                        break;
                                    }
                                    case 46: {
                                        arr_c1 = arr_c;
                                        if(v16 == 2) {
                                            v16 = 3;
                                            ++v15;
                                            arr_c = arr_c1;
                                            continue;
                                        }
                                        break;
                                    }
                                    case 69: 
                                    case 101: {
                                        arr_c1 = arr_c;
                                        if(v16 == 2 || v16 == 4) {
                                            v16 = 5;
                                            ++v15;
                                            arr_c = arr_c1;
                                            continue;
                                        }
                                        break;
                                    }
                                    default: {
                                        if(v20 >= 0x30 && v20 <= 57) {
                                            if(v16 == 0 || v16 == 1) {
                                                arr_c1 = arr_c;
                                                v19 = (long)(-(v20 - 0x30));
                                                v16 = 2;
                                            }
                                            else if(v16 == 2) {
                                                if(v19 == 0L) {
                                                    arr_c1 = arr_c;
                                                    break;
                                                }
                                                else {
                                                    int v21 = Long.compare(v19, -922337203685477580L);
                                                    arr_c1 = arr_c;
                                                    long v22 = 10L * v19 - ((long)(v20 - 0x30));
                                                    v18 &= (v21 > 0 || v21 == 0 && v22 < v19 ? 1 : 0);
                                                    v19 = v22;
                                                    ++v15;
                                                    arr_c = arr_c1;
                                                    continue;
                                                }
                                                goto label_132;
                                            }
                                            else {
                                            label_132:
                                                arr_c1 = arr_c;
                                                if(v16 == 3) {
                                                    v16 = 4;
                                                }
                                                else if(v16 == 5 || v16 == 6) {
                                                    v16 = 7;
                                                }
                                            }
                                            ++v15;
                                            arr_c = arr_c1;
                                            continue;
                                        }
                                        else {
                                            arr_c1 = arr_c;
                                            if(!this.F(((char)v20))) {
                                            label_147:
                                                if(v16 == 2) {
                                                    if(v18 != 0) {
                                                        if(v19 != 0x8000000000000000L) {
                                                            v23 = v17;
                                                        label_154:
                                                            if(v19 != 0L) {
                                                                if(v23 == 0) {
                                                                    v19 = -v19;
                                                                }
                                                            }
                                                            else if(v23 == 0) {
                                                                v19 = 0L;
                                                            }
                                                            else {
                                                                v16 = 2;
                                                                goto label_168;
                                                            }
                                                            this.e = v19;
                                                            this.c += v15;
                                                            this.d = 15;
                                                            v24 = 15;
                                                            break alab2;
                                                        }
                                                        else if(v17 != 0) {
                                                            v23 = 1;
                                                            goto label_154;
                                                        }
                                                    }
                                                    v16 = 2;
                                                }
                                            label_168:
                                                if(v16 == 2 || (v16 == 4 || v16 == 7)) {
                                                    this.f = v15;
                                                    v24 = 16;
                                                    this.d = 16;
                                                    break alab2;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            v24 = 0;
                            break;
                        }
                        if(v24 != 0) {
                            return v24;
                        }
                        if(!this.F(arr_c1[this.c])) {
                            throw this.x("Expected value");
                        }
                        this.z();
                        this.d = 10;
                        return 10;
                    }
                    return v9;
                }
                v2 = 1;
                this.d = v2;
                return v2;
            }
        }
        if(v1 != 1 && v1 != 2) {
            throw this.x("Unexpected value");
        }
        this.z();
        --this.c;
        this.d = 7;
        return 7;
    }

    public final int c() {
        int v = this.d == 0 ? this.b() : this.d;
        switch(v) {
            case 8: {
            label_4:
                this.g = v == 10 ? this.k() : this.i(((char)(v == 8 ? 39 : 34)));
                try {
                    int v1 = Integer.parseInt(this.g);
                    this.d = 0;
                    int v2 = this.h - 1;
                    ++this.i[v2];
                    return v1;
                }
                catch(NumberFormatException unused_ex) {
                    goto label_24;
                }
            }
            case 15: {
                long v3 = this.e;
                if(v3 != ((long)(((int)v3)))) {
                    throw new NumberFormatException("Expected an int but was " + v3 + this.g());
                }
                this.d = 0;
                int v4 = this.h - 1;
                ++this.i[v4];
                return (int)v3;
            }
            case 16: {
                int v5 = this.c;
                int v6 = this.f;
                this.g = new String(this.b, v5, v6);
                this.c = v5 + v6;
            label_24:
                this.d = 11;
                double f = Double.parseDouble(this.g);
                if(((double)(((int)f))) != f) {
                    throw new NumberFormatException("Expected an int but was " + this.g + this.g());
                }
                this.g = null;
                this.d = 0;
                int v7 = this.h - 1;
                ++this.i[v7];
                return (int)f;
            }
            default: {
                if(v != 9 && v != 10) {
                    throw this.d("an int");
                }
                goto label_4;
            }
        }
    }

    @Override
    public final void close() {
        this.d = 0;
        this.n[0] = 8;
        this.h = 1;
        this.j.close();
    }

    public final IllegalStateException d(String s) {
        int v = this.u();
        return new IllegalStateException("Expected " + s + " but was " + gqfg.a(this.u()) + this.g() + "\nSee " + gqcd.a((v == 9 ? "adapter-not-null-safe" : "unexpected-json-structure")));
    }

    public final String e() {
        return this.y(false);
    }

    public final String f() {
        return this.y(true);
    }

    public final String g() {
        return " at line " + (this.l + 1) + " column " + (this.c - this.m + 1) + " path " + this.e();
    }

    public final String h() {
        String s;
        switch((this.d == 0 ? this.b() : this.d)) {
            case 12: {
                s = this.i('\'');
                break;
            }
            case 13: {
                s = this.i('\"');
                break;
            }
            case 14: {
                s = this.k();
                break;
            }
            default: {
                throw this.d("a name");
            }
        }
        this.d = 0;
        this.o[this.h - 1] = s;
        return s;
    }

    public final String i(char c) {
        int v5;
        char[] arr_c;
        StringBuilder stringBuilder0 = null;
        do {
            int v = this.c;
            int v1 = this.k;
            int v2 = v;
            while(true) {
                arr_c = this.b;
                if(v >= v1) {
                    break;
                }
                int v3 = arr_c[v];
                if(this.a == gqaa.c && v3 < 0x20) {
                    throw this.x("Unescaped control characters (\\u0000-\\u001F) are not allowed in strict mode");
                }
                if(v3 == c) {
                    int v4 = v + 1 - v2 - 1;
                    this.c = v + 1;
                    if(stringBuilder0 == null) {
                        return new String(arr_c, v2, v4);
                    }
                    stringBuilder0.append(arr_c, v2, v4);
                    return stringBuilder0.toString();
                }
                switch(v3) {
                    case 10: {
                        ++this.l;
                        this.m = v + 1;
                        ++v;
                        continue;
                    }
                    case 92: {
                        v5 = v + 1 - v2;
                        this.c = v + 1;
                        if(stringBuilder0 == null) {
                            stringBuilder0 = new StringBuilder(Math.max(v5 + v5, 16));
                        }
                        break;
                    }
                    default: {
                        ++v;
                        continue;
                    }
                }
                stringBuilder0.append(arr_c, v2, v5 - 1);
                stringBuilder0.append(this.v());
                v2 = this.c;
                v1 = this.k;
                v = v2;
            }
            int v6 = v - v2;
            if(stringBuilder0 == null) {
                stringBuilder0 = new StringBuilder(Math.max(v6 + v6, 16));
            }
            stringBuilder0.append(arr_c, v2, v6);
            this.c = v;
        }
        while(this.E(1));
        throw this.x("Unterminated string");
    }

    public final String j() {
        String s;
        switch((this.d == 0 ? this.b() : this.d)) {
            case 8: {
                s = this.i('\'');
                break;
            }
            case 9: {
                s = this.i('\"');
                break;
            }
            case 10: {
                s = this.k();
                break;
            }
            case 11: {
                s = this.g;
                this.g = null;
                break;
            }
            case 15: {
                s = Long.toString(this.e);
                break;
            }
            case 16: {
                String s1 = new String(this.b, this.c, this.f);
                this.c += this.f;
                s = s1;
                break;
            }
            default: {
                throw this.d("a string");
            }
        }
        this.d = 0;
        int v = this.h - 1;
        ++this.i[v];
        return s;
    }

    public final String k() {
        String s;
        int v = 0;
        StringBuilder stringBuilder0 = null;
        do {
            int v1 = 0;
        alab1:
            while(true) {
                int v2 = this.c + v1;
                if(v2 < this.k) {
                    switch(this.b[v2]) {
                        case 35: 
                        case 0x2F: 
                        case 59: 
                        case 61: 
                        case 92: {
                            this.z();
                            break alab1;
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
                            break alab1;
                        }
                        default: {
                            ++v1;
                            continue;
                        }
                    }
                }
                if(v1 >= 0x400) {
                    goto label_14;
                }
                if(!this.E(v1 + 1)) {
                    break;
                }
            }
            v = v1;
            break;
        label_14:
            if(stringBuilder0 == null) {
                stringBuilder0 = new StringBuilder(Math.max(v1, 16));
            }
            stringBuilder0.append(this.b, this.c, v1);
            this.c += v1;
        }
        while(this.E(1));
        if(stringBuilder0 == null) {
            s = new String(this.b, this.c, v);
        }
        else {
            stringBuilder0.append(this.b, this.c, v);
            s = stringBuilder0.toString();
        }
        this.c += v;
        return s;
    }

    public final void l() {
        if((this.d == 0 ? this.b() : this.d) != 3) {
            throw this.d("BEGIN_ARRAY");
        }
        this.A(1);
        this.i[this.h - 1] = 0;
        this.d = 0;
    }

    public final void m() {
        if((this.d == 0 ? this.b() : this.d) != 1) {
            throw this.d("BEGIN_OBJECT");
        }
        this.A(3);
        this.d = 0;
    }

    public final void n() {
        if((this.d == 0 ? this.b() : this.d) != 4) {
            throw this.d("END_ARRAY");
        }
        int v = this.h;
        this.h = v - 1;
        ++this.i[v - 2];
        this.d = 0;
    }

    public final void o() {
        if((this.d == 0 ? this.b() : this.d) != 2) {
            throw this.d("END_OBJECT");
        }
        int v = this.h;
        this.h = v - 1;
        this.o[v - 1] = null;
        ++this.i[v - 2];
        this.d = 0;
    }

    public final void p() {
        if((this.d == 0 ? this.b() : this.d) != 7) {
            throw this.d("null");
        }
        this.d = 0;
        int v = this.h - 1;
        ++this.i[v];
    }

    public final void q(gqaa gqaa0) {
        Objects.requireNonNull(gqaa0);
        this.a = gqaa0;
    }

    public final void r() {
        int v = 0;
    alab1:
        while(true) {
            switch((this.d == 0 ? this.b() : this.d)) {
                case 1: {
                    this.A(3);
                    ++v;
                    goto label_40;
                }
                case 2: {
                    if(v == 0) {
                        this.o[this.h - 1] = null;
                        v = 0;
                    }
                    --this.h;
                    --v;
                    goto label_40;
                }
                case 3: {
                    this.A(1);
                    ++v;
                    goto label_40;
                }
                case 4: {
                    --this.h;
                    --v;
                    goto label_40;
                }
                case 8: {
                    this.B('\'');
                    goto label_40;
                }
                case 9: {
                    this.B('\"');
                    goto label_40;
                }
                case 10: {
                    this.D();
                    goto label_40;
                }
                case 12: {
                    this.B('\'');
                    if(v == 0) {
                        this.o[this.h - 1] = "<skipped>";
                        v = 0;
                    }
                    goto label_40;
                }
                case 13: {
                    this.B('\"');
                    if(v == 0) {
                        this.o[this.h - 1] = "<skipped>";
                        v = 0;
                    }
                    goto label_40;
                }
                case 14: {
                    this.D();
                    if(v == 0) {
                        this.o[this.h - 1] = "<skipped>";
                        v = 0;
                    }
                    goto label_40;
                }
                case 16: {
                    this.c += this.f;
                label_40:
                    this.d = 0;
                    if(v <= 0) {
                        int v1 = this.h - 1;
                        ++this.i[v1];
                        return;
                    }
                    break;
                }
                case 17: {
                    break alab1;
                }
                default: {
                    goto label_40;
                }
            }
        }
    }

    public final boolean s() {
        int v = this.d == 0 ? this.b() : this.d;
        return v != 2 && v != 4 && v != 17;
    }

    public final boolean t() {
        switch((this.d == 0 ? this.b() : this.d)) {
            case 5: {
                this.d = 0;
                int v = this.h - 1;
                ++this.i[v];
                return true;
            }
            case 6: {
                this.d = 0;
                int v1 = this.h - 1;
                ++this.i[v1];
                return false;
            }
            default: {
                throw this.d("a boolean");
            }
        }
    }

    @Override
    public final String toString() {
        return this.getClass().getSimpleName() + this.g();
    }

    public final int u() {
        switch((this.d == 0 ? this.b() : this.d)) {
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
            case 14: {
                return 5;
            }
            case 15: 
            case 16: {
                return 7;
            }
            default: {
                return 10;
            }
        }
    }

    private final char v() {
        int v4;
        if(this.c == this.k && !this.E(1)) {
            throw this.x("Unterminated escape sequence");
        }
        char[] arr_c = this.b;
        int v = this.c;
        this.c = v + 1;
        char c = arr_c[v];
        switch(c) {
            case 10: {
                if(this.a == gqaa.c) {
                    throw this.x("Cannot escape a newline character in strict mode");
                }
                ++this.l;
                this.m = v + 1;
                goto label_13;
            }
            case 39: {
            label_13:
                if(this.a != gqaa.c) {
                    return c;
                }
                throw this.x("Invalid escaped character \"\'\" in strict mode");
            }
            case 34: 
            case 0x2F: 
            case 92: {
                return c;
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
                if(v + 5 > this.k && !this.E(4)) {
                    throw this.x("Unterminated escape sequence");
                }
                int v1 = this.c;
                int v2 = 0;
                while(v1 < v1 + 4) {
                    int v3 = arr_c[v1];
                    if(v3 >= 0x30 && v3 <= 57) {
                        v4 = v3 - 0x30;
                        v2 = (v2 << 4) + v4;
                        ++v1;
                        continue;
                    }
                    if(v3 >= 97 && v3 <= 102) {
                        v4 = v3 - 87;
                        v2 = (v2 << 4) + v4;
                        ++v1;
                        continue;
                    }
                    if(v3 < 65 || v3 > 70) {
                        throw this.x("Malformed Unicode escape \\u" + new String(arr_c, this.c, 4));
                    }
                    v4 = v3 - 55;
                    v2 = (v2 << 4) + v4;
                    ++v1;
                    continue;
                }
                this.c += 4;
                return (char)v2;
            }
            default: {
                throw this.x("Invalid escape sequence");
            }
        }
    }

    private final int w(boolean z) {
        int v = this.c;
        int v1 = this.k;
        while(true) {
            if(v == v1) {
                this.c = v;
                if(!this.E(1)) {
                    if(!z) {
                        return -1;
                    }
                    throw new EOFException("End of input" + this.g());
                }
                v = this.c;
                v1 = this.k;
            }
            char[] arr_c = this.b;
            int v2 = arr_c[v];
            if(v2 == 10) {
                ++this.l;
                this.m = v + 1;
                ++v;
                goto label_56;
            }
            switch(v2) {
                case 9: 
                case 13: 
                case 0x20: {
                    ++v;
                    goto label_56;
                }
                case 35: {
                    this.c = v + 1;
                    this.z();
                    this.C();
                    v = this.c;
                    v1 = this.k;
                    goto label_56;
                }
                case 0x2F: {
                    this.c = v + 1;
                    if(v + 1 == v1) {
                        this.c = v;
                        boolean z1 = this.E(2);
                        ++this.c;
                        if(!z1) {
                            return 0x2F;
                        }
                    }
                    break;
                }
                default: {
                    this.c = v + 1;
                    return v2;
                }
            }
            this.z();
            int v3 = this.c;
            switch(arr_c[v3]) {
                case 42: {
                    this.c = v3 + 1;
                alab1:
                    while(true) {
                        if(this.c + 2 > this.k && !this.E(2)) {
                            throw this.x("Unterminated comment");
                        }
                        int v4 = this.c;
                        if(arr_c[v4] == 10) {
                            ++this.l;
                            this.m = v4 + 1;
                        }
                        else {
                            for(int v5 = 0; true; ++v5) {
                                if(v5 >= 2) {
                                    break alab1;
                                }
                                if(arr_c[this.c + v5] != "*/".charAt(v5)) {
                                    break;
                                }
                            }
                        }
                        ++this.c;
                    }
                    v = this.c + 2;
                    v1 = this.k;
                label_56:
                    break;
                }
                case 0x2F: {
                    this.c = v3 + 1;
                    this.C();
                    v = this.c;
                    v1 = this.k;
                    break;
                }
                default: {
                    return 0x2F;
                }
            }
        }
    }

    private final gqfi x(String s) {
        throw new gqfi(s + this.g() + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#malformed-json");
    }

    private final String y(boolean z) {
        StringBuilder stringBuilder0 = new StringBuilder("$");
        for(int v = 0; true; ++v) {
            int v1 = this.h;
            if(v >= v1) {
                break;
            }
            int v2 = this.n[v];
            switch(v2) {
                case 1: 
                case 2: {
                    int v3 = this.i[v];
                    if(z && v3 > 0 && v == v1 - 1) {
                        --v3;
                    }
                    stringBuilder0.append('[');
                    stringBuilder0.append(v3);
                    stringBuilder0.append(']');
                    break;
                }
                case 3: 
                case 4: 
                case 5: {
                    stringBuilder0.append('.');
                    String s = this.o[v];
                    if(s != null) {
                        stringBuilder0.append(s);
                    }
                    break;
                }
                case 6: 
                case 7: 
                case 8: {
                    break;
                }
                default: {
                    throw new AssertionError("Unknown scope value: " + v2);
                }
            }
        }
        return stringBuilder0.toString();
    }

    private final void z() {
        if(this.a == gqaa.a) {
            return;
        }
        throw this.x("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
    }
}

