public final class gscj implements gphn {
    public static final fokg a;
    public static final gphl b;
    public static final gscj c;
    public final ggfp d;
    private static final fokg e;
    private static final fokg f;
    private final ggeo g;

    static {
        gscj.a = new fokg("google.internal.identity.cryptauth.fido.enrollment.v1.FidoCredentialEnrollmentService.");
        gscj.e = new fokg("google.internal.identity.cryptauth.fido.enrollment.v1.FidoCredentialEnrollmentService/");
        gscj.b = new gsci();
        gscj.c = new gscj();
        gscj.f = new fokg("cryptauthfidoenrollment.pa.googleapis.com");
    }

    private gscj() {
        ggdy ggdy0 = new ggdy();
        ggdy0.i("staging-cryptauthfidoenrollment.pa.sandbox.googleapis.com");
        ggdy0.i("cryptauthfidoenrollment.pa.googleapis.com");
        ggdy0.i("autopush-cryptauthfidoenrollment.pa.sandbox.googleapis.com");
        ggdy0.i("staging-cryptauthfidoenrollment.pa.sandbox.googleapis.com");
        ggdy0.i("cryptauthfidoenrollment.pa.googleapis.com");
        ggdy0.h();
        this.d = new ggfn().h();
        new ggoh(gscj.b);
        ggek ggek0 = new ggek();
        ggek0.i("EnrollFidoCredential", gscj.b);
        this.g = ggek0.b();
        new ggek().b();
    }

    @Override  // gphn
    public final fokg a() {
        return gscj.f;
    }

    @Override  // gphn
    public final gphl b(String s) {
        String s1 = gscj.e.a;
        if(s.startsWith(s1)) {
            String s2 = s.substring(s1.length());
            return this.g.containsKey(s2) ? ((gphl)this.g.get(s2)) : null;
        }
        return null;
    }
}

