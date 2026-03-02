import j..util.Objects;

final class igel extends igek {
    final igen h;

    public igel(igen igen0, igcp igcp0, igcp igcp1, long v) {
        this(igen0, igcp0, igcp1, null, v, false);
    }

    public igel(igen igen0, igcp igcp0, igcp igcp1, igcy igcy0, long v, boolean z) {
        Objects.requireNonNull(igen0);
        this.h = igen0;
        super(igen0, igcp0, igcp1, v, z);
        if(igcy0 == null) {
            igcy0 = new igem(this.e, this);
        }
        this.e = igcy0;
    }

    public igel(igen igen0, igcp igcp0, igcp igcp1, igcy igcy0, igcy igcy1, long v) {
        this(igen0, igcp0, igcp1, igcy0, v, false);
        this.f = igcy1;
    }

    @Override  // igek
    public final int d(long v) {
        return v < this.c ? this.a.d(v) : this.b.d(v);
    }

    @Override  // igek
    public final int f(long v) {
        return v < this.c ? this.a.f(v) : this.b.f(v);
    }

    @Override  // igek
    public final long g(long v, int v1) {
        long v2 = this.c;
        if(v >= v2) {
            long v3 = this.b.g(v, v1);
            if(v3 < v2) {
                igen igen0 = this.h;
                if(igen0.I + v3 < v2) {
                    if(this.d) {
                        return igen0.H.x.a(v3) > 0 ? this.C(v3) : this.C(igen0.H.x.g(v3, -1));
                    }
                    if(igen0.H.A.a(v3) <= 0) {
                        v3 = igen0.H.A.g(v3, -1);
                    }
                    return this.C(v3);
                }
            }
            return v3;
        }
        long v4 = this.a.g(v, v1);
        return v4 < v2 || v4 - this.h.I < v2 ? v4 : this.D(v4);
    }

    @Override  // igek
    public final long h(long v, long v1) {
        long v2 = this.c;
        if(v >= v2) {
            long v3 = this.b.h(v, v1);
            if(v3 < v2) {
                igen igen0 = this.h;
                if(igen0.I + v3 < v2) {
                    if(this.d) {
                        return igen0.H.x.a(v3) > 0 ? this.C(v3) : this.C(igen0.H.x.g(v3, -1));
                    }
                    if(igen0.H.A.a(v3) <= 0) {
                        v3 = igen0.H.A.g(v3, -1);
                    }
                    return this.C(v3);
                }
            }
            return v3;
        }
        long v4 = this.a.h(v, v1);
        return v4 < v2 || v4 - this.h.I < v2 ? v4 : this.D(v4);
    }
}

