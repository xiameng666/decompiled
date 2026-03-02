public final class hfpi implements gphn {
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
    public static final hfpi k;
    public final ggfp l;
    private static final fokg m;
    private static final fokg n;
    private final ggeo o;

    static {
        hfpi.a = new fokg("privacy.sandbox.shieldedids.manager.ShieldedProfileManager.");
        hfpi.m = new fokg("privacy.sandbox.shieldedids.manager.ShieldedProfileManager/");
        hfpi.b = new hfoz();
        hfpi.c = new hfpa();
        hfpi.d = new hfpb();
        hfpi.e = new hfpc();
        hfpi.f = new hfpd();
        hfpi.g = new hfpe();
        hfpi.h = new hfpf();
        hfpi.i = new hfpg();
        hfpi.j = new hfph();
        hfpi.k = new hfpi();
        hfpi.n = new fokg("shieldedids-pa.googleapis.com");
    }

    private hfpi() {
        ggdy ggdy0 = new ggdy();
        ggdy0.i("autopush-shieldedids-pa.mtls.sandbox.googleapis.com");
        ggdy0.i("autopush-shieldedids-pa.sandbox.googleapis.com");
        ggdy0.i("shieldedids-pa.mtls.googleapis.com");
        ggdy0.i("staging-shieldedids-pa.mtls.sandbox.googleapis.com");
        ggdy0.i("staging-shieldedids-pa.sandbox.googleapis.com");
        ggdy0.i("shieldedids-pa.googleapis.com");
        ggdy0.h();
        this.l = new ggfn().h();
        ggfp.O(hfpi.b, hfpi.c, hfpi.d, hfpi.e, hfpi.f, hfpi.g, new gphl[]{hfpi.h, hfpi.i, hfpi.j});
        ggek ggek0 = new ggek();
        ggek0.i("Get", hfpi.b);
        ggek0.i("Create", hfpi.c);
        ggek0.i("UpdateEmailRelayMode", hfpi.d);
        ggek0.i("List", hfpi.e);
        ggek0.i("Delete", hfpi.f);
        ggek0.i("Resolve", hfpi.g);
        ggek0.i("FetchUpdatesForChromeSync", hfpi.h);
        ggek0.i("DeleteForTesting", hfpi.i);
        ggek0.i("DeallocateForTesting", hfpi.j);
        this.o = ggek0.b();
        new ggek().b();
    }

    @Override  // gphn
    public final fokg a() {
        return hfpi.n;
    }

    @Override  // gphn
    public final gphl b(String s) {
        String s1 = hfpi.m.a;
        if(s.startsWith(s1)) {
            String s2 = s.substring(s1.length());
            return this.o.containsKey(s2) ? ((gphl)this.o.get(s2)) : null;
        }
        return null;
    }
}

