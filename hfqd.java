public final class hfqd implements gphn {
    public static final fokg a;
    public static final gphl b;
    public static final gphl c;
    public static final gphl d;
    public static final gphl e;
    public static final gphl f;
    public static final gphl g;
    public static final hfqd h;
    public final ggfp i;
    private static final fokg j;
    private static final fokg k;
    private final ggeo l;

    static {
        hfqd.a = new fokg("privacy.sandbox.shieldedids.manager.usermanagement.proto.ShieldedUserManagementService.");
        hfqd.j = new fokg("privacy.sandbox.shieldedids.manager.usermanagement.proto.ShieldedUserManagementService/");
        hfqd.b = new hfpx();
        hfqd.c = new hfpy();
        hfqd.d = new hfpz();
        hfqd.e = new hfqa();
        hfqd.f = new hfqb();
        hfqd.g = new hfqc();
        hfqd.h = new hfqd();
        hfqd.k = new fokg("shieldedids-pa.googleapis.com");
    }

    private hfqd() {
        ggdy ggdy0 = new ggdy();
        ggdy0.i("autopush-shieldedids-pa.mtls.sandbox.googleapis.com");
        ggdy0.i("autopush-shieldedids-pa.sandbox.googleapis.com");
        ggdy0.i("shieldedids-pa.mtls.googleapis.com");
        ggdy0.i("staging-shieldedids-pa.mtls.sandbox.googleapis.com");
        ggdy0.i("staging-shieldedids-pa.sandbox.googleapis.com");
        ggdy0.i("shieldedids-pa.googleapis.com");
        ggdy0.h();
        this.i = new ggfn().h();
        ggfp.O(hfqd.b, hfqd.c, hfqd.d, hfqd.e, hfqd.f, hfqd.g, new gphl[0]);
        ggek ggek0 = new ggek();
        ggek0.i("GetShieldedUserSettings", hfqd.b);
        ggek0.i("UpdateShieldedUserSettings", hfqd.c);
        ggek0.i("ReserveEmailAddresses", hfqd.d);
        ggek0.i("DeleteShieldedUserForTesting", hfqd.e);
        ggek0.i("FetchSettingUpdatesForChromeSync", hfqd.f);
        ggek0.i("UpdateShieldedUserSettingsForChromeSync", hfqd.g);
        this.l = ggek0.b();
        new ggek().b();
    }

    @Override  // gphn
    public final fokg a() {
        return hfqd.k;
    }

    @Override  // gphn
    public final gphl b(String s) {
        String s1 = hfqd.j.a;
        if(s.startsWith(s1)) {
            String s2 = s.substring(s1.length());
            return this.l.containsKey(s2) ? ((gphl)this.l.get(s2)) : null;
        }
        return null;
    }
}

