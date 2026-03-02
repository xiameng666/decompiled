public final class hohe implements gphn {
    public static final fokg a;
    public static final gphl b;
    public static final gphl c;
    public static final gphl d;
    public static final hohe e;
    public final ggfp f;
    private static final fokg g;
    private static final fokg h;
    private final ggeo i;

    static {
        hohe.a = new fokg("google.internal.feedback.v1.HelpArticlesService.");
        hohe.g = new fokg("google.internal.feedback.v1.HelpArticlesService/");
        hohe.b = new hohb();
        hohe.c = new hohc();
        hohe.d = new hohd();
        hohe.e = new hohe();
        hohe.h = new fokg("feedback-pa.googleapis.com");
    }

    private hohe() {
        ggdy ggdy0 = new ggdy();
        ggdy0.i("autopush-feedback-pa.mtls.sandbox.googleapis.com");
        ggdy0.i("autopush-feedback-pa.sandbox.googleapis.com");
        ggdy0.i("feedback-pa.mtls.googleapis.com");
        ggdy0.i("staging-feedback-pa.mtls.sandbox.googleapis.com");
        ggdy0.i("staging-feedback-pa.sandbox.googleapis.com");
        ggdy0.i("stagingqual-feedback-pa.mtls.sandbox.googleapis.com");
        ggdy0.i("stagingqual-feedback-pa.sandbox.googleapis.com");
        ggdy0.i("feedback-pa.googleapis.com");
        ggdy0.h();
        this.f = new ggfn().h();
        ggfp.L(hohe.b, hohe.c, hohe.d);
        ggek ggek0 = new ggek();
        ggek0.i("SearchHelpArticles", hohe.b);
        ggek0.i("ReportSuggestionInteraction", hohe.c);
        ggek0.i("RenderHelpArticlesHtml", hohe.d);
        this.i = ggek0.b();
        new ggek().b();
    }

    @Override  // gphn
    public final fokg a() {
        return hohe.h;
    }

    @Override  // gphn
    public final gphl b(String s) {
        String s1 = hohe.g.a;
        if(s.startsWith(s1)) {
            String s2 = s.substring(s1.length());
            return this.i.containsKey(s2) ? ((gphl)this.i.get(s2)) : null;
        }
        return null;
    }
}

