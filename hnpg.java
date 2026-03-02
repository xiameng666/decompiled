public final class hnpg implements gphn {
    public static final fokg a;
    public static final gphl b;
    public static final gphl c;
    public static final gphl d;
    public static final gphl e;
    public static final gphl f;
    public static final gphl g;
    public static final gphl h;
    public static final gphl i;
    public static final gphl j;
    public static final gphl k;
    public static final gphl l;
    public static final gphl m;
    public static final hnpg n;
    public final ggfp o;
    private static final fokg p;
    private static final fokg q;
    private final ggeo r;

    static {
        hnpg.a = new fokg("google.internal.fmd.FmdApiService.");
        hnpg.p = new fokg("google.internal.fmd.FmdApiService/");
        hnpg.b = new hnox();
        hnpg.c = new hnoy();
        hnpg.d = new hnoz();
        hnpg.e = new hnpa();
        hnpg.f = new hnpb();
        hnpg.g = new hnpc();
        hnpg.h = new hnpd();
        hnpg.i = new hnpe();
        hnpg.j = new hnpf();
        hnpg.k = new hnou();
        hnpg.l = new hnov();
        hnpg.m = new hnow();
        hnpg.n = new hnpg();
        hnpg.q = new fokg("findmydevice-pa.googleapis.com");
    }

    private hnpg() {
        ggdy ggdy0 = new ggdy();
        ggdy0.i("autopush-findmydevice-pa.mtls.sandbox.googleapis.com");
        ggdy0.i("autopush-findmydevice-pa.sandbox.googleapis.com");
        ggdy0.i("findmydevice-pa.mtls.googleapis.com");
        ggdy0.i("staging-findmydevice-pa.mtls.sandbox.googleapis.com");
        ggdy0.i("staging-findmydevice-pa.sandbox.googleapis.com");
        ggdy0.i("findmydevice-pa.googleapis.com");
        ggdy0.h();
        this.o = new ggfn().h();
        ggfp.O(hnpg.b, hnpg.c, hnpg.d, hnpg.e, hnpg.f, hnpg.g, new gphl[]{hnpg.h, hnpg.i, hnpg.j, hnpg.k, hnpg.l, hnpg.m});
        ggek ggek0 = new ggek();
        ggek0.i("ExecuteAction", hnpg.b);
        ggek0.i("ExecutePrivilegedAction", hnpg.c);
        ggek0.i("ExecutePrivilegedActionReauth", hnpg.d);
        ggek0.i("ListDevices", hnpg.e);
        ggek0.i("ProcessSitrep", hnpg.f);
        ggek0.i("RemotePayload", hnpg.g);
        ggek0.i("SetFmaTos", hnpg.h);
        ggek0.i("RegisterSpotAndroidDevice", hnpg.i);
        ggek0.i("FetchSpotAndroidDeviceRegistration", hnpg.j);
        ggek0.i("DeleteSpotAndroidDeviceRegistration", hnpg.k);
        ggek0.i("SetQuickLockChallenge", hnpg.l);
        ggek0.i("DeleteQuickLockChallenge", hnpg.m);
        this.r = ggek0.b();
        new ggek().b();
    }

    @Override  // gphn
    public final fokg a() {
        return hnpg.q;
    }

    @Override  // gphn
    public final gphl b(String s) {
        String s1 = hnpg.p.a;
        if(s.startsWith(s1)) {
            String s2 = s.substring(s1.length());
            return this.r.containsKey(s2) ? ((gphl)this.r.get(s2)) : null;
        }
        return null;
    }
}

