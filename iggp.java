import java.io.Serializable;
import java.util.HashMap;
import java.util.Locale;

public final class iggp extends igcp implements Serializable {
    private static HashMap a = null;
    private final igcr b;
    private final igcy c;
    private static final long serialVersionUID = 0xE526DAD19BD069D1L;

    private iggp(igcr igcr0, igcy igcy0) {
        if(igcy0 == null) {
            throw new IllegalArgumentException();
        }
        this.b = igcr0;
        this.c = igcy0;
    }

    @Override  // igcp
    public final boolean A() {
        return false;
    }

    @Override  // igcp
    public final void B() {
    }

    public static iggp C(igcr igcr0, igcy igcy0) {
        iggp iggp0;
        synchronized(iggp.class) {
            HashMap hashMap0 = iggp.a;
            iggp0 = null;
            if(hashMap0 == null) {
                iggp.a = new HashMap(7);
            }
            else {
                iggp iggp1 = (iggp)hashMap0.get(igcr0);
                if(iggp1 == null || iggp1.c == igcy0) {
                    iggp0 = iggp1;
                }
            }
            if(iggp0 == null) {
                iggp iggp2 = new iggp(igcr0, igcy0);
                iggp.a.put(igcr0, iggp2);
                return iggp2;
            }
        }
        return iggp0;
    }

    private final UnsupportedOperationException D() {
        return new UnsupportedOperationException(this.b.y + " field is unsupported");
    }

    @Override  // igcp
    public final int a(long v) {
        throw this.D();
    }

    @Override  // igcp
    public final int b(Locale locale0) {
        throw this.D();
    }

    @Override  // igcp
    public final int c() {
        throw this.D();
    }

    @Override  // igcp
    public final int d(long v) {
        throw this.D();
    }

    @Override  // igcp
    public final int e() {
        throw this.D();
    }

    @Override  // igcp
    public final int f(long v) {
        throw this.D();
    }

    @Override  // igcp
    public final long g(long v, int v1) {
        return this.c.a(v, v1);
    }

    @Override  // igcp
    public final long h(long v, long v1) {
        return this.c.b(v, v1);
    }

    @Override  // igcp
    public final long i(long v) {
        throw this.D();
    }

    @Override  // igcp
    public final long j(long v) {
        throw this.D();
    }

    @Override  // igcp
    public final long k(long v) {
        throw this.D();
    }

    @Override  // igcp
    public final long l(long v, int v1) {
        throw this.D();
    }

    @Override  // igcp
    public final long m(long v, String s, Locale locale0) {
        throw this.D();
    }

    @Override  // igcp
    public final String o(int v, Locale locale0) {
        throw this.D();
    }

    @Override  // igcp
    public final String p(long v, Locale locale0) {
        throw this.D();
    }

    @Override  // igcp
    public final String q(igdm igdm0, Locale locale0) {
        throw this.D();
    }

    @Override  // igcp
    public final String r(int v, Locale locale0) {
        throw this.D();
    }

    private Object readResolve() {
        return iggp.C(this.b, this.c);
    }

    @Override  // igcp
    public final String s(long v, Locale locale0) {
        throw this.D();
    }

    @Override  // igcp
    public final String t(igdm igdm0, Locale locale0) {
        throw this.D();
    }

    @Override
    public final String toString() {
        return "UnsupportedDateTimeField";
    }

    @Override  // igcp
    public final String u() {
        return this.b.y;
    }

    @Override  // igcp
    public final igcr v() {
        return this.b;
    }

    @Override  // igcp
    public final igcy w() {
        return this.c;
    }

    @Override  // igcp
    public final igcy x() {
        return null;
    }

    @Override  // igcp
    public final igcy y() {
        return null;
    }

    @Override  // igcp
    public final boolean z(long v) {
        throw this.D();
    }
}

