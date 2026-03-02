public final class gsqs implements gphn {
    public static final fokg a;
    public static final gphl b;
    public static final gsqs c;
    public final ggfp d;
    private static final fokg e;
    private static final fokg f;
    private final ggeo g;

    static {
        gsqs.a = new fokg("google.internal.notifications.v1.NotificationsApiService.");
        gsqs.e = new fokg("google.internal.notifications.v1.NotificationsApiService/");
        gsqs.b = new gsqr();
        gsqs.c = new gsqs();
        gsqs.f = new fokg("notifications-pa.googleapis.com");
    }

    private gsqs() {
        ggdy ggdy0 = new ggdy();
        ggdy0.i("autopush-eu-notifications-pa.mtls.sandbox.googleapis.com");
        ggdy0.i("autopush-eu-notifications-pa.sandbox.googleapis.com");
        ggdy0.i("autopush-notifications-pa.mtls.sandbox.googleapis.com");
        ggdy0.i("autopush-notifications-pa.sandbox.googleapis.com");
        ggdy0.i("autopush-qual-playground-notifications-pa.mtls.sandbox.googleapis.com");
        ggdy0.i("autopush-qual-playground-notifications-pa.sandbox.googleapis.com");
        ggdy0.i("autopush-us-notifications-pa.mtls.sandbox.googleapis.com");
        ggdy0.i("autopush-us-notifications-pa.sandbox.googleapis.com");
        ggdy0.i("notifications-pa.mtls.googleapis.com");
        ggdy0.i("staging-eu-notifications-pa.mtls.sandbox.googleapis.com");
        ggdy0.i("staging-eu-notifications-pa.sandbox.googleapis.com");
        ggdy0.i("staging-notifications-pa.mtls.sandbox.googleapis.com");
        ggdy0.i("staging-notifications-pa.sandbox.googleapis.com");
        ggdy0.i("staging-qual-qa-notifications-pa.mtls.sandbox.googleapis.com");
        ggdy0.i("staging-qual-qa-notifications-pa.sandbox.googleapis.com");
        ggdy0.i("staging-qual-qa-notifications-ueeshp-pa.mtls.sandbox.googleapis.com");
        ggdy0.i("staging-qual-qa-notifications-ueeshp-pa.sandbox.googleapis.com");
        ggdy0.i("staging-us-notifications-pa.mtls.sandbox.googleapis.com");
        ggdy0.i("staging-us-notifications-pa.sandbox.googleapis.com");
        ggdy0.i("notifications-pa.googleapis.com");
        ggdy0.h();
        this.d = new ggfn().h();
        new ggoh(gsqs.b);
        ggek ggek0 = new ggek();
        ggek0.i("FetchLatestThreads", gsqs.b);
        this.g = ggek0.b();
        ggek ggek1 = new ggek();
        ggek1.i(Integer.valueOf(125207197), gsqs.b);
        ggek1.b();
    }

    @Override  // gphn
    public final fokg a() {
        return gsqs.f;
    }

    @Override  // gphn
    public final gphl b(String s) {
        String s1 = gsqs.e.a;
        if(s.startsWith(s1)) {
            String s2 = s.substring(s1.length());
            return this.g.containsKey(s2) ? ((gphl)this.g.get(s2)) : null;
        }
        return null;
    }
}

