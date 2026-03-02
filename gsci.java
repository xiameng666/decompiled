import java.util.Set;

final class gsci implements gphl {
    private final fokg b;
    private final ggfp c;

    public gsci() {
        fokg fokg0 = new fokg("EnrollFidoCredential");
        this.b = fokg.a(gscj.a, fokg0);
        this.c = new ggoh("https://www.googleapis.com/auth/userinfo.email");
    }

    @Override  // gphl
    public final fokg a() {
        return this.b;
    }

    @Override  // gphl
    public final Set b() {
        Set set0 = this.c;
        return ((ggfp)set0).isEmpty() ? gscj.c.d : set0;
    }

    @Override  // gphl
    public final boolean c() {
        return false;
    }

    @Override
    public final String toString() {
        return this.b.a;
    }
}

