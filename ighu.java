import java.util.Arrays;

final class ighu extends igcw {
    final int a;
    final ighx f;
    final ighx g;
    private static final long serialVersionUID = 0x605522C6413E57D1L;

    public ighu(String s, int v, ighx ighx0, ighx ighx1) {
        super(s);
        this.a = v;
        this.f = ighx0;
        this.g = ighx1;
    }

    @Override  // igcw
    public final int a(long v) {
        int v1 = this.c(v).c;
        return this.a + v1;
    }

    @Override  // igcw
    public final int b(long v) {
        return this.a;
    }

    private final ighx c(long v) {
        long v2;
        ighx ighx1;
        ighx ighx0;
        int v1;
        try {
            v1 = this.a;
            ighx0 = this.f;
            ighx1 = this.g;
            v2 = ighx0.a(v, v1, ighx1.c);
        }
        catch(IllegalArgumentException | ArithmeticException unused_ex) {
            v2 = v;
        }
        try {
            v = ighx1.a(v, v1, ighx0.c);
        }
        catch(IllegalArgumentException | ArithmeticException unused_ex) {
        }
        return v2 <= v ? ighx1 : ighx0;
    }

    @Override  // igcw
    public final long d(long v) {
        long v2;
        ighx ighx1;
        ighx ighx0;
        int v1;
        try {
            v1 = this.a;
            ighx0 = this.f;
            ighx1 = this.g;
            v2 = ighx0.a(v, v1, ighx1.c);
            if(v > 0L && v2 < 0L) {
                goto label_6;
            }
            goto label_7;
        }
        catch(IllegalArgumentException | ArithmeticException unused_ex) {
        }
    label_6:
        v2 = v;
        try {
        label_7:
            long v3 = ighx1.a(v, v1, ighx0.c);
            if(v <= 0L || v3 >= 0L) {
                v = v3;
            }
        }
        catch(IllegalArgumentException | ArithmeticException unused_ex) {
        }
        return v2 <= v ? v2 : v;
    }

    @Override  // igcw
    public final long e(long v) {
        long v3;
        long v2;
        ighx ighx1;
        ighx ighx0;
        int v1;
        try {
            v1 = this.a;
            ighx0 = this.f;
            ighx1 = this.g;
            v2 = v + 1L;
            v3 = ighx0.b(v2, v1, ighx1.c);
            if(v2 < 0L && v3 > 0L) {
                goto label_7;
            }
            goto label_8;
        }
        catch(IllegalArgumentException | ArithmeticException unused_ex) {
        }
    label_7:
        v3 = v2;
        try {
        label_8:
            long v4 = ighx1.b(v2, v1, ighx0.c);
            if(v2 >= 0L || v4 <= 0L) {
                v2 = v4;
            }
        }
        catch(IllegalArgumentException | ArithmeticException unused_ex) {
        }
        if(v3 <= v2) {
            v3 = v2;
        }
        return v3 - 1L;
    }

    @Override  // igcw
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof ighu) && this.d.equals(((ighu)object0).d) && this.a == ((ighu)object0).a && this.f.equals(((ighu)object0).f) && this.g.equals(((ighu)object0).g);
    }

    @Override  // igcw
    public final String g(long v) {
        return this.c(v).b;
    }

    @Override  // igcw
    public final boolean h() {
        return false;
    }

    @Override  // igcw
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{((int)this.a), this.f, this.g});
    }
}

