public final class hfhp implements gphn {
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
    public static final gphl n;
    public static final gphl o;
    public static final hfhp p;
    public final ggfp q;
    private static final fokg r;
    private static final fokg s;
    private final ggeo t;

    static {
        hfhp.a = new fokg("footprints.oneplatform.FootprintsService.");
        hfhp.r = new fokg("footprints.oneplatform.FootprintsService/");
        hfhp.b = new hfhg();
        hfhp.c = new hfhh();
        hfhp.d = new hfhi();
        hfhp.e = new hfhj();
        hfhp.f = new hfhk();
        hfhp.g = new hfhl();
        hfhp.h = new hfhm();
        hfhp.i = new hfhn();
        hfhp.j = new hfho();
        hfhp.k = new hfhb();
        hfhp.l = new hfhc();
        hfhp.m = new hfhd();
        hfhp.n = new hfhe();
        hfhp.o = new hfhf();
        hfhp.p = new hfhp();
        hfhp.s = new fokg("footprints-pa.googleapis.com");
    }

    private hfhp() {
        ggdy ggdy0 = new ggdy();
        ggdy0.i("autopush-footprints-pa.mtls.sandbox.googleapis.com");
        ggdy0.i("autopush-footprints-pa.sandbox.googleapis.com");
        ggdy0.i("autopushsearchqual-footprints-pa.mtls.sandbox.googleapis.com");
        ggdy0.i("autopushsearchqual-footprints-pa.sandbox.googleapis.com");
        ggdy0.i("footprints-pa.mtls.googleapis.com");
        ggdy0.i("staging-footprints-pa.mtls.sandbox.googleapis.com");
        ggdy0.i("staging-footprints-pa.sandbox.googleapis.com");
        ggdy0.i("footprints-pa.googleapis.com");
        ggdy0.h();
        this.q = new ggfn().h();
        ggfp.O(hfhp.b, hfhp.c, hfhp.d, hfhp.e, hfhp.f, hfhp.g, new gphl[]{hfhp.h, hfhp.i, hfhp.j, hfhp.k, hfhp.l, hfhp.m, hfhp.n, hfhp.o});
        ggek ggek0 = new ggek();
        ggek0.i("Read", hfhp.b);
        ggek0.i("Write", hfhp.c);
        ggek0.i("Delete", hfhp.d);
        ggek0.i("GetFacs", hfhp.e);
        ggek0.i("GetActivityControlsSettings", hfhp.f);
        ggek0.i("UpdateActivityControlsSettings", hfhp.g);
        ggek0.i("GetMobileConsents", hfhp.h);
        ggek0.i("ShouldShowMobileConsentFlow", hfhp.i);
        ggek0.i("ShowMobileConsentScreen", hfhp.j);
        ggek0.i("RecordMobileConsentDecision", hfhp.k);
        ggek0.i("GetSettingText", hfhp.l);
        ggek0.i("GetDeletions", hfhp.m);
        ggek0.i("GetXuikitConsentFlow", hfhp.n);
        ggek0.i("RecordConsentPromo", hfhp.o);
        this.t = ggek0.b();
        new ggek().b();
    }

    @Override  // gphn
    public final fokg a() {
        return hfhp.s;
    }

    @Override  // gphn
    public final gphl b(String s) {
        String s1 = hfhp.r.a;
        if(s.startsWith(s1)) {
            String s2 = s.substring(s1.length());
            return this.t.containsKey(s2) ? ((gphl)this.t.get(s2)) : null;
        }
        return null;
    }
}

