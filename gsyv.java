public final class gsyv implements gphn {
    public static final fokg a;
    public static final gphl b;
    public static final gphl c;
    public static final gphl d;
    public static final gphl e;
    public static final gphl f;
    public static final gsyv g;
    public final ggfp h;
    private static final fokg i;
    private static final fokg j;
    private final ggeo k;

    static {
        gsyv.a = new fokg("google.internal.ppn.phosphor.v1.IPBlindingService.");
        gsyv.i = new fokg("google.internal.ppn.phosphor.v1.IPBlindingService/");
        gsyv.b = new gsyq();
        gsyv.c = new gsyr();
        gsyv.d = new gsys();
        gsyv.e = new gsyt();
        gsyv.f = new gsyu();
        gsyv.g = new gsyv();
        gsyv.j = new fokg("phosphor-pa.googleapis.com");
    }

    private gsyv() {
        ggdy ggdy0 = new ggdy();
        ggdy0.i("autopush-phosphor-pa.mtls.sandbox.googleapis.com");
        ggdy0.i("autopush-phosphor-pa.sandbox.googleapis.com");
        ggdy0.i("autopush.ipprotectionauth.goog");
        ggdy0.i("phosphor-pa.mtls.googleapis.com");
        ggdy0.i("prod.ipprotectionauth.goog");
        ggdy0.i("staging-phosphor-pa.mtls.sandbox.googleapis.com");
        ggdy0.i("staging-phosphor-pa.sandbox.googleapis.com");
        ggdy0.i("staging.ipprotectionauth.goog");
        ggdy0.i("phosphor-pa.googleapis.com");
        ggdy0.h();
        this.h = new ggfn().h();
        ggfp.N(gsyv.b, gsyv.c, gsyv.d, gsyv.e, gsyv.f);
        ggek ggek0 = new ggek();
        ggek0.i("GetInitialData", gsyv.b);
        ggek0.i("AuthAndSign", gsyv.c);
        ggek0.i("GetInitialDataDarklaunch", gsyv.d);
        ggek0.i("AuthAndSignDarklaunch", gsyv.e);
        ggek0.i("GetProxyConfig", gsyv.f);
        this.k = ggek0.b();
        new ggek().b();
    }

    @Override  // gphn
    public final fokg a() {
        return gsyv.j;
    }

    @Override  // gphn
    public final gphl b(String s) {
        String s1 = gsyv.i.a;
        if(s.startsWith(s1)) {
            String s2 = s.substring(s1.length());
            return this.k.containsKey(s2) ? ((gphl)this.k.get(s2)) : null;
        }
        return null;
    }
}

