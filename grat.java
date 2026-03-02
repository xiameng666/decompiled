public final class grat implements gphn {
    public static final fokg a;
    public static final gphl b;
    public static final gphl c;
    public static final gphl d;
    public static final gphl e;
    public static final grat f;
    public final ggfp g;
    private static final fokg h;
    private static final fokg i;
    private final ggeo j;

    static {
        grat.a = new fokg("google.identity.oauth2.OAuth2Service.");
        grat.h = new fokg("google.identity.oauth2.OAuth2Service/");
        grat.b = new grap();
        grat.c = new graq();
        grat.d = new grar();
        grat.e = new gras();
        grat.f = new grat();
        grat.i = new fokg("prod3-oauth2.googleapis.com");
    }

    private grat() {
        ggdy ggdy0 = new ggdy();
        ggdy0.i("oauth2.googleapis.com");
        ggdy0.i("oauth2.googleapis.com");
        ggdy0.i("prod0-oauth2.googleapis.com");
        ggdy0.i("prod1-oauth2.googleapis.com");
        ggdy0.i("prod2-oauth2.googleapis.com");
        ggdy0.i("prod3-oauth2.googleapis.com");
        ggdy0.h();
        this.g = new ggfn().h();
        ggfp.M(grat.b, grat.c, grat.d, grat.e);
        ggek ggek0 = new ggek();
        ggek0.i("GetToken", grat.b);
        ggek0.i("RevokeToken", grat.c);
        ggek0.i("CreateDeviceCode", grat.d);
        ggek0.i("GetTokenInfo", grat.e);
        this.j = ggek0.b();
        new ggek().b();
    }

    @Override  // gphn
    public final fokg a() {
        return grat.i;
    }

    @Override  // gphn
    public final gphl b(String s) {
        String s1 = grat.h.a;
        if(s.startsWith(s1)) {
            String s2 = s.substring(s1.length());
            return this.j.containsKey(s2) ? ((gphl)this.j.get(s2)) : null;
        }
        return null;
    }
}

