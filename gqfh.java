import j..util.Objects;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

public final class gqfh implements Closeable, Flushable {
    public final Writer a;
    public gqaa b;
    public boolean c;
    public boolean d;
    private static final Pattern e;
    private static final String[] f;
    private static final String[] g;
    private int[] h;
    private int i;
    private gpzf j;
    private String k;
    private String l;
    private boolean m;
    private String n;

    static {
        gqfh.e = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");
        gqfh.f = new String[0x80];
        for(int v = 0; v <= 0x1F; ++v) {
            gqfh.f[v] = String.format("\\u%04x", v);
        }
        gqfh.f[34] = "\\\"";
        gqfh.f[92] = "\\\\";
        gqfh.f[9] = "\\t";
        gqfh.f[8] = "\\b";
        gqfh.f[10] = "\\n";
        gqfh.f[13] = "\\r";
        gqfh.f[12] = "\\f";
        String[] arr_s = (String[])gqfh.f.clone();
        gqfh.g = arr_s;
        arr_s[60] = "\\u003c";
        arr_s[62] = "\\u003e";
        arr_s[38] = "\\u0026";
        arr_s[61] = "\\u003d";
        arr_s[39] = "\\u0027";
    }

    public gqfh(Writer writer0) {
        this.h = new int[0x20];
        this.i = 0;
        this.q(6);
        this.b = gqaa.b;
        this.d = true;
        this.a = (Writer)Objects.requireNonNull(writer0, "out == null");
        this.b(gpzf.a);
    }

    public final void a() {
        int v = this.o();
        switch(v) {
            case 1: {
                this.r(2);
                this.p();
                return;
            }
            case 2: {
                this.a.append(this.l);
                this.p();
                return;
            }
            default: {
                if(v != 4) {
                    switch(v) {
                        case 6: {
                            break;
                        }
                        case 7: {
                            if(this.b != gqaa.a) {
                                throw new IllegalStateException("JSON must have only one top-level value.");
                            }
                            break;
                        }
                        default: {
                            throw new IllegalStateException("Nesting problem.");
                        }
                    }
                    this.r(7);
                    return;
                }
                this.a.append(this.k);
                this.r(5);
            }
        }
    }

    public final void b(gpzf gpzf0) {
        gpzf gpzf1 = (gpzf)Objects.requireNonNull(gpzf0);
        this.j = gpzf1;
        this.l = ",";
        if(gpzf1.d) {
            this.k = ": ";
            if(gpzf1.b.isEmpty()) {
                this.l = ", ";
            }
        }
        else {
            this.k = ":";
        }
        this.m = this.j.b.isEmpty() && this.j.c.isEmpty();
    }

    public final void c(gqaa gqaa0) {
        this.b = (gqaa)Objects.requireNonNull(gqaa0);
    }

    @Override
    public final void close() {
        this.a.close();
        if(this.i > 1 || this.i == 1 && this.h[0] != 7) {
            throw new IOException("Incomplete document");
        }
        this.i = 0;
    }

    public final void d() {
        if(this.n != null) {
            int v = this.o();
            if(v == 5) {
                this.a.write(this.l);
            }
            else if(v != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            this.p();
            this.r(4);
            this.s(this.n);
            this.n = null;
        }
    }

    public final void e() {
        this.d();
        this.u(1, '[');
    }

    public final void f() {
        this.d();
        this.u(3, '{');
    }

    @Override
    public final void flush() {
        if(this.i == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.a.flush();
    }

    public final void g() {
        this.t(1, 2, ']');
    }

    public final void h() {
        this.t(3, 5, '}');
    }

    public final void i(String s) {
        Objects.requireNonNull(s, "name == null");
        if(this.n == null) {
            switch(this.o()) {
                case 3: 
                case 5: {
                    this.n = s;
                    return;
                }
                default: {
                    throw new IllegalStateException("Please begin an object before writing a name.");
                }
            }
        }
        throw new IllegalStateException("Already wrote a name, expecting a value.");
    }

    public final void j() {
        if(this.n != null) {
            if(this.d) {
                this.d();
                goto label_6;
            }
            this.n = null;
            return;
        }
    label_6:
        this.a();
        this.a.write("null");
    }

    public final void k(long v) {
        this.d();
        this.a();
        this.a.write(Long.toString(v));
    }

    public final void l(Number number0) {
        if(number0 == null) {
            this.j();
            return;
        }
        this.d();
        String s = number0.toString();
        Class class0 = number0.getClass();
        if(class0 != Integer.class && class0 != Long.class && class0 != Byte.class && class0 != Short.class && class0 != BigDecimal.class && class0 != BigInteger.class && class0 != AtomicInteger.class && class0 != AtomicLong.class) {
            if(!s.equals("-Infinity") && !s.equals("Infinity") && !s.equals("NaN")) {
                if(class0 != Float.class && class0 != Double.class && !gqfh.e.matcher(s).matches()) {
                    throw new IllegalArgumentException(a.X(class0, s, "String created by ", " is not a valid JSON number: "));
                }
            }
            else if(this.b != gqaa.a) {
                throw new IllegalArgumentException("Numeric values must be finite, but was " + s);
            }
        }
        this.a();
        this.a.append(s);
    }

    public final void m(String s) {
        if(s == null) {
            this.j();
            return;
        }
        this.d();
        this.a();
        this.s(s);
    }

    public final void n(boolean z) {
        this.d();
        this.a();
        this.a.write((z ? "true" : "false"));
    }

    private final int o() {
        int v = this.i;
        if(v != 0) {
            return this.h[v - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private final void p() {
        if(!this.m) {
            Writer writer0 = this.a;
            writer0.write(this.j.b);
            int v = this.i;
            for(int v1 = 1; v1 < v; ++v1) {
                writer0.write(this.j.c);
            }
        }
    }

    private final void q(int v) {
        int v1 = this.i;
        int[] arr_v = this.h;
        if(v1 == arr_v.length) {
            this.h = Arrays.copyOf(arr_v, v1 + v1);
        }
        int v2 = this.i;
        this.i = v2 + 1;
        this.h[v2] = v;
    }

    private final void r(int v) {
        this.h[this.i - 1] = v;
    }

    private final void s(String s) {
        String s1;
        String[] arr_s = this.c ? gqfh.g : gqfh.f;
        Writer writer0 = this.a;
        writer0.write(34);
        int v = s.length();
        int v1 = 0;
        int v2 = 0;
        while(v1 < v) {
            int v3 = s.charAt(v1);
            if(v3 < 0x80) {
                s1 = arr_s[v3];
                if(s1 != null) {
                    goto label_17;
                }
            }
            else {
                switch(v3) {
                    case 0x2028: {
                        s1 = "\\u2028";
                        break;
                    }
                    case 0x2029: {
                        s1 = "\\u2029";
                        break;
                    }
                    default: {
                        goto label_21;
                    }
                }
            label_17:
                if(v2 < v1) {
                    writer0.write(s, v2, v1 - v2);
                }
                writer0.write(s1);
                v2 = v1 + 1;
            }
        label_21:
            ++v1;
        }
        if(v2 < v) {
            writer0.write(s, v2, v - v2);
        }
        writer0.write(34);
    }

    private final void t(int v, int v1, char c) {
        int v2 = this.o();
        if(v2 != v1 && v2 != v) {
            throw new IllegalStateException("Nesting problem.");
        }
        String s = this.n;
        if(s != null) {
            throw new IllegalStateException("Dangling name: " + s);
        }
        --this.i;
        if(v2 == v1) {
            this.p();
        }
        this.a.write(((int)c));
    }

    private final void u(int v, char c) {
        this.a();
        this.q(v);
        this.a.write(((int)c));
    }
}

