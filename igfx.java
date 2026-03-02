import java.util.Locale;

public abstract class igfx extends igcp {
    public final igcr i;

    protected igfx(igcr igcr0) {
        if(igcr0 == null) {
            throw new IllegalArgumentException("The type must not be null");
        }
        this.i = igcr0;
    }

    @Override  // igcp
    public final boolean A() {
        return true;
    }

    @Override  // igcp
    public abstract int a(long arg1);

    @Override  // igcp
    public int b(Locale locale0) {
        int v = this.c();
        if(v >= 0) {
            if(v < 10) {
                return 1;
            }
            if(v < 100) {
                return 2;
            }
            return v >= 1000 ? Integer.toString(v).length() : 3;
        }
        return Integer.toString(v).length();
    }

    @Override  // igcp
    public abstract int c();

    @Override  // igcp
    public int d(long v) {
        return this.c();
    }

    @Override  // igcp
    public abstract int e();

    @Override  // igcp
    public int f(long v) {
        return this.e();
    }

    @Override  // igcp
    public long g(long v, int v1) {
        return this.w().a(v, v1);
    }

    @Override  // igcp
    public long h(long v, long v1) {
        return this.w().b(v, v1);
    }

    @Override  // igcp
    public long i(long v) {
        return v - this.k(v);
    }

    @Override  // igcp
    public long j(long v) {
        long v1 = this.k(v);
        return v1 == v ? v : this.g(v1, 1);
    }

    @Override  // igcp
    public abstract long k(long arg1);

    @Override  // igcp
    public abstract long l(long arg1, int arg2);

    @Override  // igcp
    public long m(long v, String s, Locale locale0) {
        return this.l(v, this.oW(s, locale0));
    }

    @Override  // igcp
    public String o(int v, Locale locale0) {
        return this.r(v, locale0);
    }

    protected int oW(String s, Locale locale0) {
        try {
            return Integer.parseInt(s);
        }
        catch(NumberFormatException unused_ex) {
            throw new igdb(this.i, s);
        }
    }

    @Override  // igcp
    public String p(long v, Locale locale0) {
        return this.o(this.a(v), locale0);
    }

    @Override  // igcp
    public final String q(igdm igdm0, Locale locale0) {
        return this.o(igdm0.b(this.i), locale0);
    }

    @Override  // igcp
    public String r(int v, Locale locale0) {
        return Integer.toString(v);
    }

    @Override  // igcp
    public String s(long v, Locale locale0) {
        return this.r(this.a(v), locale0);
    }

    @Override  // igcp
    public final String t(igdm igdm0, Locale locale0) {
        return this.r(igdm0.b(this.i), locale0);
    }

    @Override
    public final String toString() {
        return "DateTimeField[" + this.u() + "]";
    }

    @Override  // igcp
    public final String u() {
        return this.i.y;
    }

    @Override  // igcp
    public final igcr v() {
        return this.i;
    }

    @Override  // igcp
    public abstract igcy w();

    @Override  // igcp
    public igcy x() {
        return null;
    }

    @Override  // igcp
    public boolean z(long v) {
        return false;
    }
}

