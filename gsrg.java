import java.util.Set;

final class gsrg implements gphl {
    private final fokg b;
    private final ggfp c;

    public gsrg() {
        fokg fokg0 = new fokg("GetAsyncData");
        this.b = fokg.a(gsrj.a, fokg0);
        this.c = new ggoh("https://www.googleapis.com/auth/onegoogle.api");
    }

    @Override  // gphl
    public final fokg a() {
        return this.b;
    }

    @Override  // gphl
    public final Set b() {
        Set set0 = this.c;
        return ((ggfp)set0).isEmpty() ? gsrj.e.f : set0;
    }

    @Override  // gphl
    public final boolean c() {
        return true;
    }

    @Override
    public final String toString() {
        return this.b.a;
    }
}

