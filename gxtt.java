public final class gxtt implements gphn {
    public static final fokg a;
    public static final gphl b;
    public static final gxtt c;
    public final ggfp d;
    private static final fokg e;
    private static final fokg f;
    private final ggeo g;

    static {
        gxtt.a = new fokg("google.internal.android.location.voilatile.v1.VoilaTileService.");
        gxtt.e = new fokg("google.internal.android.location.voilatile.v1.VoilaTileService/");
        gxtt.b = new gxts();
        gxtt.c = new gxtt();
        gxtt.f = new fokg("voilatile-pa.googleapis.com");
    }

    private gxtt() {
        ggdy ggdy0 = new ggdy();
        ggdy0.i("autopush-voilatile-pa.mtls.sandbox.googleapis.com");
        ggdy0.i("autopush-voilatile-pa.sandbox.googleapis.com");
        ggdy0.i("preprod-voilatile-pa.mtls.sandbox.googleapis.com");
        ggdy0.i("preprod-voilatile-pa.sandbox.googleapis.com");
        ggdy0.i("prodlocal-voilatile-pa.mtls.sandbox.googleapis.com");
        ggdy0.i("prodlocal-voilatile-pa.sandbox.googleapis.com");
        ggdy0.i("staging-voilatile-pa.mtls.sandbox.googleapis.com");
        ggdy0.i("staging-voilatile-pa.sandbox.googleapis.com");
        ggdy0.i("voilatile-pa.mtls.googleapis.com");
        ggdy0.i("voilatile-pa.googleapis.com");
        ggdy0.h();
        this.d = new ggfn().h();
        new ggoh(gxtt.b);
        ggek ggek0 = new ggek();
        ggek0.i("FindTiles", gxtt.b);
        this.g = ggek0.b();
        new ggek().b();
    }

    @Override  // gphn
    public final fokg a() {
        return gxtt.f;
    }

    @Override  // gphn
    public final gphl b(String s) {
        String s1 = gxtt.e.a;
        if(s.startsWith(s1)) {
            String s2 = s.substring(s1.length());
            return this.g.containsKey(s2) ? ((gphl)this.g.get(s2)) : null;
        }
        return null;
    }
}

