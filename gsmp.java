public final class gsmp implements gphn {
    public static final fokg a;
    public static final gphl b;
    public static final gphl c;
    public static final gphl d;
    public static final gphl e;
    public static final gsmp f;
    public final ggfp g;
    private static final fokg h;
    private static final fokg i;
    private final ggeo j;

    static {
        gsmp.a = new fokg("google.internal.locationsharing.orchestrator.LocationSharingOrchestratorService.");
        gsmp.h = new fokg("google.internal.locationsharing.orchestrator.LocationSharingOrchestratorService/");
        gsmp.b = new gsml();
        gsmp.c = new gsmm();
        gsmp.d = new gsmn();
        gsmp.e = new gsmo();
        gsmp.f = new gsmp();
        gsmp.i = new fokg("staging-locationsharingorchestrator.sandbox.googleapis.com");
    }

    private gsmp() {
        ggdy ggdy0 = new ggdy();
        ggdy0.i("autopush-locationsharingorchestrator.mtls.sandbox.googleapis.com");
        ggdy0.i("autopush-locationsharingorchestrator.sandbox.googleapis.com");
        ggdy0.i("locationsharingorchestrator.mtls.pa.googleapis.com");
        ggdy0.i("locationsharingorchestrator.pa.googleapis.com");
        ggdy0.i("staging-locationsharingorchestrator.mtls.sandbox.googleapis.com");
        ggdy0.i("staging-locationsharingorchestrator.sandbox.googleapis.com");
        ggdy0.h();
        this.g = new ggfn().h();
        ggfp.M(gsmp.b, gsmp.c, gsmp.d, gsmp.e);
        ggek ggek0 = new ggek();
        ggek0.i("CreateShare", gsmp.b);
        ggek0.i("ListShares", gsmp.c);
        ggek0.i("UpdateShare", gsmp.d);
        ggek0.i("EndShare", gsmp.e);
        this.j = ggek0.b();
        new ggek().b();
    }

    @Override  // gphn
    public final fokg a() {
        return gsmp.i;
    }

    @Override  // gphn
    public final gphl b(String s) {
        String s1 = gsmp.h.a;
        if(s.startsWith(s1)) {
            String s2 = s.substring(s1.length());
            return this.j.containsKey(s2) ? ((gphl)this.j.get(s2)) : null;
        }
        return null;
    }
}

