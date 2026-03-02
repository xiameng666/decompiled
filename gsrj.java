public final class gsrj implements gphn {
    public static final fokg a;
    public static final gphl b;
    public static final gphl c;
    public static final gphl d;
    public static final gsrj e;
    public final ggfp f;
    private static final fokg g;
    private static final fokg h;
    private final ggeo i;

    static {
        gsrj.a = new fokg("google.internal.onegoogle.asyncdata.v1.AsyncDataService.");
        gsrj.g = new fokg("google.internal.onegoogle.asyncdata.v1.AsyncDataService/");
        gsrj.b = new gsrg();
        gsrj.c = new gsrh();
        gsrj.d = new gsri();
        gsrj.e = new gsrj();
        gsrj.h = new fokg("ogads-pa.googleapis.com");
    }

    private gsrj() {
        ggdy ggdy0 = new ggdy();
        ggdy0.i("autopush-ogads-pa.mtls.sandbox.googleapis.com");
        ggdy0.i("autopush-ogads-pa.sandbox.googleapis.com");
        ggdy0.i("ogads-pa.mtls.googleapis.com");
        ggdy0.i("staging-ogads-pa.mtls.sandbox.googleapis.com");
        ggdy0.i("staging-ogads-pa.sandbox.googleapis.com");
        ggdy0.i("ogads-pa.googleapis.com");
        ggdy0.h();
        this.f = new ggfn().h();
        ggfp.L(gsrj.b, gsrj.c, gsrj.d);
        ggek ggek0 = new ggek();
        ggek0.i("GetAsyncData", gsrj.b);
        ggek0.i("ReportState", gsrj.c);
        ggek0.i("GetNativeMobileData", gsrj.d);
        this.i = ggek0.b();
        new ggek().b();
    }

    @Override  // gphn
    public final fokg a() {
        return gsrj.h;
    }

    @Override  // gphn
    public final gphl b(String s) {
        String s1 = gsrj.g.a;
        if(s.startsWith(s1)) {
            String s2 = s.substring(s1.length());
            return this.i.containsKey(s2) ? ((gphl)this.i.get(s2)) : null;
        }
        return null;
    }
}

