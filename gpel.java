public final class gpel implements gphn {
    public static final fokg a;
    public static final gphl b;
    public static final gphl c;
    public static final gphl d;
    public static final gphl e;
    public static final gpel f;
    public final ggfp g;
    private static final fokg h;
    private static final fokg i;
    private final ggeo j;

    static {
        gpel.a = new fokg("google.firebase.fpnv.v1beta.PhoneNumberVerificationService.");
        gpel.h = new fokg("google.firebase.fpnv.v1beta.PhoneNumberVerificationService/");
        gpel.b = new gpeh();
        gpel.c = new gpei();
        gpel.d = new gpej();
        gpel.e = new gpek();
        gpel.f = new gpel();
        gpel.i = new fokg("fpnv.googleapis.com");
    }

    private gpel() {
        ggdy ggdy0 = new ggdy();
        ggdy0.i("staging-fpnv.sandbox.googleapis.com");
        ggdy0.i("fpnv.googleapis.com");
        ggdy0.i("autopush-fpnv.sandbox.googleapis.com");
        ggdy0.i("test-fpnv.sandbox.googleapis.com");
        ggdy0.i("staging-fpnv.sandbox.googleapis.com");
        ggdy0.i("fpnv.googleapis.com");
        ggdy0.h();
        this.g = new ggfn().h();
        ggfp.M(gpel.b, gpel.c, gpel.d, gpel.e);
        ggek ggek0 = new ggek();
        ggek0.i("CheckConfig", gpel.b);
        ggek0.i("FetchDigitalCredentialPayload", gpel.c);
        ggek0.i("MintPhoneNumberToken", gpel.d);
        ggek0.i("GetPublicJwkSet", gpel.e);
        this.j = ggek0.b();
        new ggek().b();
    }

    @Override  // gphn
    public final fokg a() {
        return gpel.i;
    }

    @Override  // gphn
    public final gphl b(String s) {
        String s1 = gpel.h.a;
        if(s.startsWith(s1)) {
            String s2 = s.substring(s1.length());
            return this.j.containsKey(s2) ? ((gphl)this.j.get(s2)) : null;
        }
        return null;
    }
}

