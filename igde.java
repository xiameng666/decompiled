import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public final class igde extends igdt implements igdm, Serializable {
    private static final Set a = null;
    private final long b;
    private final igcm c;
    private transient int d;
    private static final long serialVersionUID = 0xFFFFF804D3E4EBB5L;

    static {
        HashSet hashSet0 = new HashSet();
        igde.a = hashSet0;
        hashSet0.add(igda.g);
        hashSet0.add(igda.f);
        hashSet0.add(igda.e);
        hashSet0.add(igda.c);
        hashSet0.add(igda.d);
        hashSet0.add(igda.b);
        hashSet0.add(igda.a);
    }

    public igde() {
        this(igct.a(), igev.Q());
    }

    public igde(long v, igcm igcm0) {
        igcm igcm1 = igct.d(igcm0);
        long v1 = igcm1.B().k(igcw.b, v);
        igcm igcm2 = igcm1.c();
        this.b = igcm2.h().k(v1);
        this.c = igcm2;
    }

    public igde(long v, igcw igcw0) {
        this(v, igev.R(igcw0));
    }

    @Override  // igdq
    public final int a(igdm igdm0) {
        if(this == igdm0) {
            return 0;
        }
        if((igdm0 instanceof igde) && this.c.equals(((igde)igdm0).c)) {
            int v = Long.compare(this.b, ((igde)igdm0).b);
            if(v < 0) {
                return -1;
            }
            return v == 0 ? 0 : 1;
        }
        return super.a(igdm0);
    }

    @Override  // igdm, igdq
    public final int b(igcr igcr0) {
        if(this.k(igcr0)) {
            return igcr0.a(this.c).a(this.b);
        }
        throw new IllegalArgumentException("Field \'" + igcr0.y + "\' is not supported");
    }

    public final int c() {
        return this.c.h().a(this.b);
    }

    @Override  // igdq
    public final int compareTo(Object object0) {
        return this.a(((igdm)object0));
    }

    public final int d() {
        return this.c.s().a(this.b);
    }

    @Override  // igdm
    public final int e(int v) {
        switch(v) {
            case 0: {
                return this.c.y().a(this.b);
            }
            case 1: {
                return this.c.s().a(this.b);
            }
            case 2: {
                return this.c.h().a(this.b);
            }
            default: {
                throw new IndexOutOfBoundsException("Invalid index: " + v);
            }
        }
    }

    @Override  // igdq
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return !(object0 instanceof igde) || !this.c.equals(((igde)object0).c) ? super.equals(object0) : this.b == ((igde)object0).b;
    }

    public final int f() {
        return this.c.y().a(this.b);
    }

    @Override  // igdm
    public final int g() {
        return 3;
    }

    @Override  // igdm
    public final igcm h() {
        return this.c;
    }

    @Override  // igdq
    public final int hashCode() {
        int v = this.d;
        if(v == 0) {
            int v1 = 0x9D;
            for(int v2 = 0; v2 < 3; ++v2) {
                v1 = (v1 * 23 + this.e(v2)) * 23 + this.n(v2).hashCode();
            }
            int v3 = v1 + this.c.hashCode();
            this.d = v3;
            return v3;
        }
        return v;
    }

    @Override  // igdq
    protected final igcp i(int v, igcm igcm0) {
        switch(v) {
            case 0: {
                return igcm0.y();
            }
            case 1: {
                return igcm0.s();
            }
            case 2: {
                return igcm0.h();
            }
            default: {
                throw new IndexOutOfBoundsException("Invalid index: " + v);
            }
        }
    }

    final igde j(long v) {
        long v1 = this.c.h().k(v);
        return v1 == this.b ? this : new igde(v1, this.c);
    }

    @Override  // igdm, igdq
    public final boolean k(igcr igcr0) {
        igda igda0 = ((igcq)igcr0).a;
        return igde.a.contains(igda0) || igda0.a(this.c).c() >= this.c.D().c() ? igcr0.a(this.c).A() : false;
    }

    public final igde l() {
        return this.j(this.c.D().d(this.b, 1));
    }

    public final igde m() {
        return this.j(this.c.D().a(this.b, 1));
    }

    private Object readResolve() {
        igcm igcm0 = this.c;
        if(igcm0 == null) {
            return new igde(this.b, igev.F);
        }
        igcw igcw0 = igcm0.B();
        if(!igcw.b.equals(igcw0)) {
            igcm igcm1 = igcm0.c();
            return new igde(this.b, igcm1);
        }
        return this;
    }

    @Override
    public final String toString() {
        return igho.a.c(this);
    }
}

