public final class grgh implements gphn {
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
    public static final grgh l;
    public final ggfp m;
    private static final fokg n;
    private static final fokg o;
    private final ggeo p;

    static {
        grgh.a = new fokg("google.internal.identity.securitydomain.v1.SecurityDomainService.");
        grgh.n = new fokg("google.internal.identity.securitydomain.v1.SecurityDomainService/");
        grgh.b = new grfy();
        grgh.c = new grfz();
        grgh.d = new grga();
        grgh.e = new grgb();
        grgh.f = new grgc();
        grgh.g = new grgd();
        grgh.h = new grge();
        grgh.i = new grgf();
        grgh.j = new grgg();
        grgh.k = new grfx();
        grgh.l = new grgh();
        grgh.o = new fokg("securitydomain-pa.googleapis.com");
    }

    private grgh() {
        ggdy ggdy0 = new ggdy();
        ggdy0.i("autopush-securitydomain-pa.mtls.sandbox.googleapis.com");
        ggdy0.i("autopush-securitydomain-pa.sandbox.googleapis.com");
        ggdy0.i("prodlocal-securitydomain-pa.mtls.sandbox.googleapis.com");
        ggdy0.i("prodlocal-securitydomain-pa.sandbox.googleapis.com");
        ggdy0.i("securitydomain-pa.mtls.googleapis.com");
        ggdy0.i("staging-securitydomain-pa.mtls.sandbox.googleapis.com");
        ggdy0.i("staging-securitydomain-pa.sandbox.googleapis.com");
        ggdy0.i("securitydomain-pa.googleapis.com");
        ggdy0.h();
        this.m = new ggfn().h();
        ggfp.O(grgh.b, grgh.c, grgh.d, grgh.e, grgh.f, grgh.g, new gphl[]{grgh.h, grgh.i, grgh.j, grgh.k});
        ggek ggek0 = new ggek();
        ggek0.i("JoinSecurityDomain", grgh.b);
        ggek0.i("LeaveSecurityDomain", grgh.c);
        ggek0.i("ResetSecurityDomain", grgh.d);
        ggek0.i("UpdateSecurityDomainMember", grgh.e);
        ggek0.i("GetSecurityDomain", grgh.f);
        ggek0.i("GetSecurityDomainMember", grgh.g);
        ggek0.i("ListSecurityDomainMembers", grgh.h);
        ggek0.i("RotateSharedKey", grgh.i);
        ggek0.i("ListProductKeys", grgh.j);
        ggek0.i("StoreProductKey", grgh.k);
        this.p = ggek0.b();
        new ggek().b();
    }

    @Override  // gphn
    public final fokg a() {
        return grgh.o;
    }

    @Override  // gphn
    public final gphl b(String s) {
        String s1 = grgh.n.a;
        if(s.startsWith(s1)) {
            String s2 = s.substring(s1.length());
            return this.p.containsKey(s2) ? ((gphl)this.p.get(s2)) : null;
        }
        return null;
    }
}

