public final class hlog implements gphn {
    public static final fokg a;
    public static final gphl b;
    public static final gphl c;
    public static final gphl d;
    public static final gphl e;
    public static final hlog f;
    public final ggfp g;
    private static final fokg h;
    private static final fokg i;
    private final ggeo j;

    static {
        hlog.a = new fokg("com.google.wireless.android.pixel.retaildemo.boq.proto.RetailDemoAccountManagementService.");
        hlog.h = new fokg("com.google.wireless.android.pixel.retaildemo.boq.proto.RetailDemoAccountManagementService/");
        hlog.b = new hloc();
        hlog.c = new hlod();
        hlog.d = new hloe();
        hlog.e = new hlof();
        hlog.f = new hlog();
        hlog.i = new fokg("retaildemoprovisioning-pa.googleapis.com");
    }

    private hlog() {
        ggdy ggdy0 = new ggdy();
        ggdy0.i("autopush-retaildemoprovisioning-pa.mtls.sandbox.googleapis.com");
        ggdy0.i("autopush-retaildemoprovisioning-pa.sandbox.googleapis.com");
        ggdy0.i("retaildemoprovisioning-pa.mtls.googleapis.com");
        ggdy0.i("staging-retaildemoprovisioning-pa.mtls.sandbox.googleapis.com");
        ggdy0.i("staging-retaildemoprovisioning-pa.sandbox.googleapis.com");
        ggdy0.i("retaildemoprovisioning-pa.googleapis.com");
        ggdy0.h();
        this.g = new ggfn().h();
        ggfp.M(hlog.b, hlog.c, hlog.d, hlog.e);
        ggek ggek0 = new ggek();
        ggek0.i("SetUpDemoAccount", hlog.b);
        ggek0.i("CleanUpDemoAccount", hlog.c);
        ggek0.i("CreateOemDemoAccount", hlog.d);
        ggek0.i("DeleteOemDemoAccount", hlog.e);
        this.j = ggek0.b();
        new ggek().b();
    }

    @Override  // gphn
    public final fokg a() {
        return hlog.i;
    }

    @Override  // gphn
    public final gphl b(String s) {
        String s1 = hlog.h.a;
        if(s.startsWith(s1)) {
            String s2 = s.substring(s1.length());
            return this.j.containsKey(s2) ? ((gphl)this.j.get(s2)) : null;
        }
        return null;
    }
}

