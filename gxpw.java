public final class gxpw implements gphn {
    public static final fokg a;
    public static final gphl b;
    public static final gxpw c;
    public final ggfp d;
    private static final fokg e;
    private static final fokg f;
    private final ggeo g;

    static {
        gxpw.a = new fokg("google.internal.android.location.alioth.v1.AliothService.");
        gxpw.e = new fokg("google.internal.android.location.alioth.v1.AliothService/");
        gxpw.b = new gxpv();
        gxpw.c = new gxpw();
        gxpw.f = new fokg("alioth-pa.googleapis.com");
    }

    private gxpw() {
        ggdy ggdy0 = new ggdy();
        ggdy0.i("alioth-pa.mtls.googleapis.com");
        ggdy0.i("autopush-alioth-pa.mtls.sandbox.googleapis.com");
        ggdy0.i("autopush-alioth-pa.sandbox.googleapis.com");
        ggdy0.i("staging-alioth-pa.mtls.sandbox.googleapis.com");
        ggdy0.i("staging-alioth-pa.sandbox.googleapis.com");
        ggdy0.i("alioth-pa.googleapis.com");
        ggdy0.h();
        this.d = new ggfn().h();
        new ggoh(gxpw.b);
        ggek ggek0 = new ggek();
        ggek0.i("GetSuplData", gxpw.b);
        this.g = ggek0.b();
        new ggek().b();
    }

    @Override  // gphn
    public final fokg a() {
        return gxpw.f;
    }

    @Override  // gphn
    public final gphl b(String s) {
        String s1 = gxpw.e.a;
        if(s.startsWith(s1)) {
            String s2 = s.substring(s1.length());
            return this.g.containsKey(s2) ? ((gphl)this.g.get(s2)) : null;
        }
        return null;
    }
}

