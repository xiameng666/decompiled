import java.util.Set;

final class gsyu implements gphl {
    private final fokg b;
    private final ggfp c;

    public gsyu() {
        fokg fokg0 = new fokg("GetProxyConfig");
        this.b = fokg.a(gsyv.a, fokg0);
        this.c = new ggoh("https://www.googleapis.com/auth/ip-protection");
    }

    @Override  // gphl
    public final fokg a() {
        return this.b;
    }

    @Override  // gphl
    public final Set b() {
        Set set0 = this.c;
        return ((ggfp)set0).isEmpty() ? gsyv.g.h : set0;
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

