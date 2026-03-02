public final class gsbp implements gphn {
    public static final fokg a;
    public static final gphl b;
    public static final gphl c;
    public static final gsbp d;
    public final ggfp e;
    private static final fokg f;
    private static final fokg g;
    private final ggeo h;

    static {
        gsbp.a = new fokg("google.internal.identity.accountsettings.reach.v1.ReachPresentationService.");
        gsbp.f = new fokg("google.internal.identity.accountsettings.reach.v1.ReachPresentationService/");
        gsbp.b = new gsbn();
        gsbp.c = new gsbo();
        gsbp.d = new gsbp();
        gsbp.g = new fokg("staging-reach-pa.sandbox.googleapis.com");
    }

    private gsbp() {
        ggdy ggdy0 = new ggdy();
        ggdy0.i("dev-reach-pa.sandbox.googleapis.com");
        ggdy0.i("autopush-reach-pa.sandbox.googleapis.com");
        ggdy0.i("reach-pa.googleapis.com");
        ggdy0.i("staging-reach-pa.sandbox.googleapis.com");
        ggdy0.h();
        ggfn ggfn0 = new ggfn();
        ggfn0.i("https://www.googleapis.com/auth/account_settings_mobile");
        this.e = ggfn0.h();
        ggfp.K(gsbp.b, gsbp.c);
        ggek ggek0 = new ggek();
        ggek0.i("GetAccountMessages", gsbp.b);
        ggek0.i("UpdateAccountMessages", gsbp.c);
        this.h = ggek0.b();
        new ggek().b();
    }

    @Override  // gphn
    public final fokg a() {
        return gsbp.g;
    }

    @Override  // gphn
    public final gphl b(String s) {
        String s1 = gsbp.f.a;
        if(s.startsWith(s1)) {
            String s2 = s.substring(s1.length());
            return this.h.containsKey(s2) ? ((gphl)this.h.get(s2)) : null;
        }
        return null;
    }
}

