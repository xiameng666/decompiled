public final class szr implements essh {
    public boolean a;
    public int b;
    private final szp c;

    static {
    }

    public szr(szp szp0) {
        this.b = 3;
        this.c = szp0;
    }

    @Override  // essh
    public final int a() {
        return this.b;
    }

    @Override  // essh
    public final String b() {
        tax tax0 = this.c.a;
        taz taz0 = tax0.g;
        return ((tkn)tax0.c.a).c() == null || taz0.f(new szi(tba.c)) == null || taz0.n() == null ? null : szw.a(tax0.c.a.c(), taz0.l().f(), new tbe(taz0.n(), false).f());
    }

    public final void c(int v) {
        this.b = v;
    }

    @Override  // essh
    public final boolean d() {
        return this.a;
    }

    @Override  // essh
    public final byte[] e(byte[] arr_b) {
        return this.c.b;
    }

    public final void f(szx szx0) {
        int v = 0;
        if(szx0 != null) {
            switch(szx0.ordinal()) {
                case 10: {
                    v = 6;
                    break;
                }
                case 9: 
                case 16: 
                case 17: {
                    v = 5;
                }
            }
        }
        this.c(v);
    }
}

