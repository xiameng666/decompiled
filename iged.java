class iged extends iggf {
    private final igdz a;
    private final int c;
    private final int d;

    public iged(igdz igdz0) {
        long v = igdz0.ah();
        super(igcr.h, v);
        this.a = igdz0;
        this.c = 12;
        this.d = 2;
    }

    @Override  // igcp
    public final void B() {
    }

    @Override  // igfx
    public final int a(long v) {
        int v1 = this.a.ae(v);
        return this.a.Z(v, v1);
    }

    @Override  // igfx
    public final int c() {
        return this.c;
    }

    @Override  // igfx
    public final int e() {
        return 1;
    }

    @Override  // igfx
    public final long g(long v, int v1) {
        int v10;
        int v9;
        int v8;
        if(v1 == 0) {
            return v;
        }
        igdz igdz0 = this.a;
        long v2 = (long)igdz0.X(v);
        int v3 = igdz0.ae(v);
        int v4 = igdz0.Z(v, v3);
        int v5 = v4 - 1 + v1;
        if(v5 < 0) {
            int v6 = this.c;
            int v7 = v1 + v6;
            if(Math.signum(v7) == Math.signum(v1)) {
                v8 = v3 - 1;
            }
            else {
                v7 = v1 - v6;
                v8 = v3 + 1;
            }
            v5 = v4 - 1 + v7;
        }
        else {
            v8 = v3;
        }
        if(v5 >= 0) {
            v9 = v8 + v5 / this.c;
            v10 = v5 % this.c + 1;
        }
        else {
            int v11 = this.c;
            v9 = v8 + v5 / v11;
            int v12 = Math.abs(v5) % v11;
            if(v12 == 0) {
                v12 = v11;
            }
            v10 = v11 - v12 + 1;
            if(v10 != 1) {
                --v9;
            }
        }
        int v13 = igdz0.Q(v, v3, v4);
        int v14 = igdz0.V(v9, v10);
        if(v13 > v14) {
            v13 = v14;
        }
        return igdz0.ao(v9, v10, v13) + v2;
    }

    @Override  // igfx
    public final long h(long v, long v1) {
        long v8;
        long v7;
        long v6;
        if(((long)(((int)v1))) == v1) {
            return this.g(v, ((int)v1));
        }
        igdz igdz0 = this.a;
        long v2 = (long)igdz0.X(v);
        int v3 = igdz0.ae(v);
        int v4 = igdz0.Z(v, v3);
        long v5 = ((long)(v4 - 1)) + v1;
        if(Long.compare(v5, 0L) >= 0) {
            v6 = v2;
            v7 = ((long)v3) + v5 / ((long)this.c);
            v8 = v5 % ((long)this.c) + 1L;
        }
        else {
            v6 = v2;
            int v9 = this.c;
            v7 = ((long)v3) + v5 / ((long)v9);
            int v10 = (int)(Math.abs(v5) % ((long)v9));
            if(v10 == 0) {
                v10 = v9;
            }
            long v11 = (long)(v9 - v10 + 1);
            if(v11 != 1L) {
                v7 = -1L + v7;
            }
            v8 = v11;
        }
        if(v7 < ((long)igdz0.Y()) || v7 > ((long)igdz0.W())) {
            throw new IllegalArgumentException(a.u(v1, "Magnitude of add amount is too large: "));
        }
        int v12 = igdz0.Q(v, v3, v4);
        int v13 = igdz0.V(((int)v7), ((int)v8));
        if(v12 > v13) {
            v12 = v13;
        }
        return igdz0.ao(((int)v7), ((int)v8), v12) + v6;
    }

    @Override  // igfx
    public final long i(long v) {
        return v - this.k(v);
    }

    @Override  // igfx
    public final long k(long v) {
        int v1 = this.a.ae(v);
        int v2 = this.a.Z(v, v1);
        return this.a.an(v1) + this.a.am(v1, v2);
    }

    @Override  // igfx
    public final long l(long v, int v1) {
        iggd.e(this, v1, 1, this.c);
        igdz igdz0 = this.a;
        int v2 = igdz0.ae(v);
        int v3 = igdz0.Q(v, v2, igdz0.Z(v, v2));
        int v4 = igdz0.V(v2, v1);
        if(v3 > v4) {
            v3 = v4;
        }
        return igdz0.ao(v2, v1, v3) + ((long)igdz0.X(v));
    }

    @Override  // igfx
    public final igcy x() {
        return this.a.c;
    }

    @Override  // igcp
    public final igcy y() {
        return this.a.g;
    }

    @Override  // igfx
    public final boolean z(long v) {
        int v1 = this.a.ae(v);
        return this.a.ar(v1) && this.a.Z(v, v1) == this.d;
    }
}

