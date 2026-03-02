public final class tfn implements essh {
    public static final String a = "tfn";
    public boolean b;
    public int c;
    private final tfl d;

    static {
    }

    public tfn(tfl tfl0) {
        this.c = 3;
        tjk.f("--> SessionResultImpl", new Object[0]);
        this.d = tfl0;
        tjk.f("<-- SessionResultImpl", new Object[0]);
    }

    @Override  // essh
    public final int a() {
        return this.c;
    }

    @Override  // essh
    public final String b() {
        tgl tgl0 = this.d.a.j;
        tgg tgg0 = this.d.a.b;
        tsh tsh0 = (tsh)tgg0.a.a.get(tsh.a);
        return tsh0 == null || !tsh0.a(thj.a) || tgl0.e(new tfg(tgp.a)) == null || tgl0.t() == null ? null : tfs.a(tgg0.c(), tgl0.q().k(), tgl0.r().k());
    }

    public final void c(tft tft0, Exception exception0) {
        tjk.d("failure() - status {}", exception0, new Object[]{tft0});
        int v = 0;
        if(tft0 != null) {
            switch(tft0.ordinal()) {
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
        this.f(v);
    }

    @Override  // essh
    public final boolean d() {
        return this.b;
    }

    @Override  // essh
    public final byte[] e(byte[] arr_b) {
        tjk.f("--> updateAccumulators", new Object[0]);
        tjk.f("<-- updateAccumulators", new Object[0]);
        return this.d.c;
    }

    public final void f(int v) {
        int v1 = this.c;
        this.c = v;
        tjk.f("setResultCode() - state transition from {} to {}", new Object[]{v1, ((int)this.c)});
    }
}

