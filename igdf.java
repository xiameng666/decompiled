import java.io.Serializable;

public final class igdf extends igdt implements igdm, Serializable {
    private final long a;
    private final igcm b;
    private static final long serialVersionUID = 0xFC45536CF5A58710L;

    public igdf() {
        this(igct.a(), igev.Q());
    }

    public igdf(int v, int v1, int v2) {
        this(v, v1, v2, 0, 0, 0, igev.F);
    }

    public igdf(int v, int v1, int v2, int v3, int v4, int v5, igcm igcm0) {
        igcm igcm1 = igct.d(igcm0).c();
        long v6 = igcm1.b(v, v1, v2, v3, v4, v5, 0);
        this.b = igcm1;
        this.a = v6;
    }

    public igdf(int v, int v1, int v2, byte[] arr_b) {
        this(v, v1, v2, 23, 59, 59, igev.F);
    }

    public igdf(long v, igcm igcm0) {
        igcm igcm1 = igct.d(igcm0);
        this.a = igcm1.B().k(igcw.b, v);
        this.b = igcm1.c();
    }

    public igdf(long v, igcw igcw0) {
        this(v, igev.R(igcw0));
    }

    @Override  // igdq
    public final int a(igdm igdm0) {
        if(this == igdm0) {
            return 0;
        }
        if((igdm0 instanceof igdf) && this.b.equals(((igdf)igdm0).b)) {
            int v = Long.compare(this.a, ((igdf)igdm0).a);
            if(v < 0) {
                return -1;
            }
            return v == 0 ? 0 : 1;
        }
        return super.a(igdm0);
    }

    @Override  // igdm, igdq
    public final int b(igcr igcr0) {
        return igcr0.a(this.b).a(this.a);
    }

    public final igco c(igcw igcw0) {
        igcw igcw1 = igct.e(igcw0);
        igcm igcm0 = this.b.d(igcw1);
        return new igco(this.b.y().a(this.a), this.b.s().a(this.a), this.b.h().a(this.a), this.b.m().a(this.a), this.b.r().a(this.a), this.b.u().a(this.a), this.b.p().a(this.a), igcm0);
    }

    @Override  // igdq
    public final int compareTo(Object object0) {
        return this.a(((igdm)object0));
    }

    public final igde d() {
        return new igde(this.a, this.b);
    }

    @Override  // igdm
    public final int e(int v) {
        switch(v) {
            case 0: {
                return this.b.y().a(this.a);
            }
            case 1: {
                return this.b.s().a(this.a);
            }
            case 2: {
                return this.b.h().a(this.a);
            }
            case 3: {
                return this.b.o().a(this.a);
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
        return !(object0 instanceof igdf) || !this.b.equals(((igdf)object0).b) ? super.equals(object0) : this.a == ((igdf)object0).a;
    }

    @Override  // igdm
    public final int g() {
        return 4;
    }

    @Override  // igdm
    public final igcm h() {
        return this.b;
    }

    @Override  // igdq
    public final int hashCode() {
        return (((((((this.b.y().a(this.a) + 0xE1B) * 23 + this.b.y().v().hashCode()) * 23 + this.b.s().a(this.a)) * 23 + this.b.s().v().hashCode()) * 23 + this.b.h().a(this.a)) * 23 + this.b.h().v().hashCode()) * 23 + this.b.o().a(this.a)) * 23 + this.b.o().v().hashCode() + this.b.hashCode();
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
            case 3: {
                return igcm0.o();
            }
            default: {
                throw new IndexOutOfBoundsException("Invalid index: " + v);
            }
        }
    }

    @Override  // igdm, igdq
    public final boolean k(igcr igcr0) {
        return igcr0.a(this.b).A();
    }

    private Object readResolve() {
        igcm igcm0 = this.b;
        if(igcm0 == null) {
            return new igdf(this.a, igev.F);
        }
        igcw igcw0 = igcm0.B();
        if(!igcw.b.equals(igcw0)) {
            igcm igcm1 = igcm0.c();
            return new igdf(this.a, igcm1);
        }
        return this;
    }

    @Override
    public final String toString() {
        return igho.b.c(this);
    }
}

