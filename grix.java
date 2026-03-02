public final class grix implements gphn {
    public static final fokg a;
    public static final gphl b;
    public static final gphl c;
    public static final gphl d;
    public static final gphl e;
    public static final gphl f;
    public static final gphl g;
    public static final gphl h;
    public static final gphl i;
    public static final grix j;
    public final ggfp k;
    private static final fokg l;
    private static final fokg m;
    private final ggeo n;

    static {
        grix.a = new fokg("google.internal.android.auth.aang.v1.AangService.");
        grix.l = new fokg("google.internal.android.auth.aang.v1.AangService/");
        grix.b = new grip();
        grix.c = new griq();
        grix.d = new grir();
        grix.e = new gris();
        grix.f = new grit();
        grix.g = new griu();
        grix.h = new griv();
        grix.i = new griw();
        grix.j = new grix();
        grix.m = new fokg("androidauthnimblegateway-pa.googleapis.com");
    }

    private grix() {
        ggdy ggdy0 = new ggdy();
        ggdy0.i("androidauthnimblegateway-pa.mtls.googleapis.com");
        ggdy0.i("autopush-androidauthnimblegateway-pa.mtls.sandbox.googleapis.com");
        ggdy0.i("autopush-androidauthnimblegateway-pa.sandbox.googleapis.com");
        ggdy0.i("staging-androidauthnimblegateway-pa.mtls.sandbox.googleapis.com");
        ggdy0.i("staging-androidauthnimblegateway-pa.sandbox.googleapis.com");
        ggdy0.i("androidauthnimblegateway-pa.googleapis.com");
        ggdy0.h();
        this.k = new ggfn().h();
        ggfp.O(grix.b, grix.c, grix.d, grix.e, grix.f, grix.g, new gphl[]{grix.h, grix.i});
        ggek ggek0 = new ggek();
        ggek0.i("GetAccountState", grix.b);
        ggek0.i("FetchManagingApp", grix.c);
        ggek0.i("FetchManagingAppUnauthenticated", grix.d);
        ggek0.i("SyncRestrictedAndroidApps", grix.e);
        ggek0.i("CheckRestrictedApp", grix.f);
        ggek0.i("ThrowExceptionForTesting", grix.g);
        ggek0.i("FetchGetTokenTokens", grix.h);
        ggek0.i("DecryptFrp", grix.i);
        this.n = ggek0.b();
        new ggek().b();
    }

    @Override  // gphn
    public final fokg a() {
        return grix.m;
    }

    @Override  // gphn
    public final gphl b(String s) {
        String s1 = grix.l.a;
        if(s.startsWith(s1)) {
            String s2 = s.substring(s1.length());
            return this.n.containsKey(s2) ? ((gphl)this.n.get(s2)) : null;
        }
        return null;
    }
}

