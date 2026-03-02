public final class grde implements gphn {
    public static final fokg a;
    public static final gphl b;
    public static final gphl c;
    public static final gphl d;
    public static final grde e;
    public final ggfp f;
    private static final fokg g;
    private static final fokg h;
    private final ggeo i;

    static {
        grde.a = new fokg("google.internal.identity.passwords.leak.check.v1.PasswordsLeakCheckService.");
        grde.g = new fokg("google.internal.identity.passwords.leak.check.v1.PasswordsLeakCheckService/");
        grde.b = new grdb();
        grde.c = new grdc();
        grde.d = new grdd();
        grde.e = new grde();
        grde.h = new fokg("passwordsleakcheck-pa.googleapis.com");
    }

    private grde() {
        ggdy ggdy0 = new ggdy();
        ggdy0.i("autopush-passwordsleakcheck-pa.mtls.sandbox.googleapis.com");
        ggdy0.i("autopush-passwordsleakcheck-pa.sandbox.googleapis.com");
        ggdy0.i("passwordsleakcheck-pa.mtls.googleapis.com");
        ggdy0.i("staging-passwordsleakcheck-pa.mtls.sandbox.googleapis.com");
        ggdy0.i("staging-passwordsleakcheck-pa.sandbox.googleapis.com");
        ggdy0.i("passwordsleakcheck-pa.googleapis.com");
        ggdy0.h();
        this.f = new ggfn().h();
        ggfp.L(grde.b, grde.c, grde.d);
        ggek ggek0 = new ggek();
        ggek0.i("LookupSingleLeak", grde.b);
        ggek0.i("LookupLeakMatches", grde.c);
        ggek0.i("ReencryptLookupHash", grde.d);
        this.i = ggek0.b();
        new ggek().b();
    }

    @Override  // gphn
    public final fokg a() {
        return grde.h;
    }

    @Override  // gphn
    public final gphl b(String s) {
        String s1 = grde.g.a;
        if(s.startsWith(s1)) {
            String s2 = s.substring(s1.length());
            return this.i.containsKey(s2) ? ((gphl)this.i.get(s2)) : null;
        }
        return null;
    }
}

