public final class tjz implements essh {
    public boolean a;
    public int b;
    private final tjx c;

    static {
    }

    public tjz(tjx tjx0) {
        this.b = 3;
        this.c = tjx0;
    }

    @Override  // essh
    public final int a() {
        return this.b;
    }

    @Override  // essh
    public final String b() {
        ttt ttt0 = this.c.a.l;
        tto tto0 = this.c.a.d;
        tpg tpg0 = (tpg)tto0.b.a.get(tpg.a);
        return tpg0 == null || !tpg0.j(tur.a) || ttt0.f(new syf(ttx.a)) == null || ttt0.w() == null ? null : tke.a(tto0.d(), ttt0.t().r(), ttt0.u().r());
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
        return this.c.c;
    }

    public final void f(tkf tkf0) {
        int v = 0;
        if(tkf0 != null) {
            switch(tkf0.ordinal()) {
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

