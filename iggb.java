import java.io.Serializable;
import java.util.Locale;

public class iggb extends igcp implements Serializable {
    public final igcr a;
    private final igcp b;
    private final igcy c;
    private static final long serialVersionUID = -4730164440214502503L;

    public iggb(igcp igcp0) {
        this(igcp0, null, null);
    }

    public iggb(igcp igcp0, igcy igcy0, igcr igcr0) {
        if(igcp0 == null) {
            throw new IllegalArgumentException("The field must not be null");
        }
        this.b = igcp0;
        this.c = igcy0;
        if(igcr0 == null) {
            igcr0 = igcp0.v();
        }
        this.a = igcr0;
    }

    @Override  // igcp
    public final boolean A() {
        return this.b.A();
    }

    @Override  // igcp
    public final void B() {
    }

    @Override  // igcp
    public int a(long v) {
        return this.b.a(v);
    }

    @Override  // igcp
    public final int b(Locale locale0) {
        return this.b.b(locale0);
    }

    @Override  // igcp
    public final int c() {
        return this.b.c();
    }

    @Override  // igcp
    public final int d(long v) {
        return this.b.d(v);
    }

    @Override  // igcp
    public int e() {
        return this.b.e();
    }

    @Override  // igcp
    public final int f(long v) {
        return this.b.f(v);
    }

    @Override  // igcp
    public final long g(long v, int v1) {
        return this.b.g(v, v1);
    }

    @Override  // igcp
    public final long h(long v, long v1) {
        return this.b.h(v, v1);
    }

    @Override  // igcp
    public final long i(long v) {
        return this.b.i(v);
    }

    @Override  // igcp
    public final long j(long v) {
        return this.b.j(v);
    }

    @Override  // igcp
    public final long k(long v) {
        return this.b.k(v);
    }

    @Override  // igcp
    public long l(long v, int v1) {
        return this.b.l(v, v1);
    }

    @Override  // igcp
    public final long m(long v, String s, Locale locale0) {
        return this.b.m(v, s, locale0);
    }

    @Override  // igcp
    public final String o(int v, Locale locale0) {
        return this.b.o(v, locale0);
    }

    @Override  // igcp
    public final String p(long v, Locale locale0) {
        return this.b.p(v, locale0);
    }

    @Override  // igcp
    public final String q(igdm igdm0, Locale locale0) {
        return this.b.q(igdm0, locale0);
    }

    @Override  // igcp
    public final String r(int v, Locale locale0) {
        return this.b.r(v, locale0);
    }

    @Override  // igcp
    public final String s(long v, Locale locale0) {
        return this.b.s(v, locale0);
    }

    @Override  // igcp
    public final String t(igdm igdm0, Locale locale0) {
        return this.b.t(igdm0, locale0);
    }

    @Override
    public final String toString() {
        return "DateTimeField[" + this.u() + "]";
    }

    @Override  // igcp
    public final String u() {
        return this.a.y;
    }

    @Override  // igcp
    public final igcr v() {
        return this.a;
    }

    @Override  // igcp
    public final igcy w() {
        return this.b.w();
    }

    @Override  // igcp
    public final igcy x() {
        return this.b.x();
    }

    @Override  // igcp
    public final igcy y() {
        return this.c == null ? this.b.y() : this.c;
    }

    @Override  // igcp
    public final boolean z(long v) {
        return this.b.z(v);
    }
}

