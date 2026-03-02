import java.io.Serializable;
import java.util.HashMap;

public final class iggq extends igcy implements Serializable {
    private static HashMap a = null;
    private final igda b;
    private static final long serialVersionUID = -6390301302770925357L;

    private iggq(igda igda0) {
        this.b = igda0;
    }

    @Override  // igcy
    public final long a(long v, int v1) {
        throw this.j();
    }

    @Override  // igcy
    public final long b(long v, long v1) {
        throw this.j();
    }

    @Override  // igcy
    public final long c() {
        return 0L;
    }

    @Override
    public final int compareTo(Object object0) {
        igcy igcy0 = (igcy)object0;
        return 0;
    }

    @Override  // igcy
    public final igda e() {
        return this.b;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof iggq) ? ((iggq)object0).h().equals(this.h()) : false;
    }

    @Override  // igcy
    public final boolean f() {
        return true;
    }

    @Override  // igcy
    public final boolean g() {
        return false;
    }

    public final String h() {
        return this.b.m;
    }

    @Override
    public final int hashCode() {
        return this.h().hashCode();
    }

    public static iggq i(igda igda0) {
        iggq iggq0;
        synchronized(iggq.class) {
            HashMap hashMap0 = iggq.a;
            if(hashMap0 == null) {
                iggq.a = new HashMap(7);
                iggq0 = null;
            }
            else {
                iggq0 = (iggq)hashMap0.get(igda0);
            }
            if(iggq0 == null) {
                iggq iggq1 = new iggq(igda0);
                iggq.a.put(igda0, iggq1);
                return iggq1;
            }
        }
        return iggq0;
    }

    private final UnsupportedOperationException j() {
        return new UnsupportedOperationException(this.b.m + " field is unsupported");
    }

    private Object readResolve() {
        return iggq.i(this.b);
    }

    @Override
    public final String toString() {
        return "UnsupportedDurationField[" + this.h() + "]";
    }
}

