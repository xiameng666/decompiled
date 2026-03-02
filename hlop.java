public final class hlop implements gphn {
    public static final fokg a;
    public static final gphl b;
    public static final gphl c;
    public static final gphl d;
    public static final gphl e;
    public static final gphl f;
    public static final gphl g;
    public static final gphl h;
    public static final gphl i;
    public static final hlop j;
    public final ggfp k;
    private static final fokg l;
    private static final fokg m;
    private final ggeo n;

    static {
        hlop.a = new fokg("com.google.wireless.android.pixel.retaildemo.boq.proto.RetailDemoProvisioningService.");
        hlop.l = new fokg("com.google.wireless.android.pixel.retaildemo.boq.proto.RetailDemoProvisioningService/");
        hlop.b = new hloh();
        hlop.c = new hloi();
        hlop.d = new hloj();
        hlop.e = new hlok();
        hlop.f = new hlol();
        hlop.g = new hlom();
        hlop.h = new hlon();
        hlop.i = new hloo();
        hlop.j = new hlop();
        hlop.m = new fokg("retaildemoprovisioning-pa.googleapis.com");
    }

    private hlop() {
        ggdy ggdy0 = new ggdy();
        ggdy0.i("autopush-retaildemoprovisioning-pa.mtls.sandbox.googleapis.com");
        ggdy0.i("autopush-retaildemoprovisioning-pa.sandbox.googleapis.com");
        ggdy0.i("retaildemoprovisioning-pa.mtls.googleapis.com");
        ggdy0.i("staging-retaildemoprovisioning-pa.mtls.sandbox.googleapis.com");
        ggdy0.i("staging-retaildemoprovisioning-pa.sandbox.googleapis.com");
        ggdy0.i("retaildemoprovisioning-pa.googleapis.com");
        ggdy0.h();
        this.k = new ggfn().h();
        ggfp.O(hlop.b, hlop.c, hlop.d, hlop.e, hlop.f, hlop.g, new gphl[]{hlop.h, hlop.i});
        ggek ggek0 = new ggek();
        ggek0.i("EnrollUser", hlop.b);
        ggek0.i("SyncDevicePolicy", hlop.c);
        ggek0.i("GetUnspoofableIdChallenge", hlop.d);
        ggek0.i("GetDeviceConfig", hlop.e);
        ggek0.i("GetHeartbeatApiKey", hlop.f);
        ggek0.i("GetWifiConfiguration", hlop.g);
        ggek0.i("GetRetailerConfiguration", hlop.h);
        ggek0.i("GetManagedConfiguration", hlop.i);
        this.n = ggek0.b();
        new ggek().b();
    }

    @Override  // gphn
    public final fokg a() {
        return hlop.m;
    }

    @Override  // gphn
    public final gphl b(String s) {
        String s1 = hlop.l.a;
        if(s.startsWith(s1)) {
            String s2 = s.substring(s1.length());
            return this.n.containsKey(s2) ? ((gphl)this.n.get(s2)) : null;
        }
        return null;
    }
}

