import java.util.Set;

final class gsxd implements gphl {
    private final fokg b;
    private final ggfp c;

    public gsxd() {
        fokg fokg0 = new fokg("GetPhoneAcledProfilesByPhone");
        this.b = fokg.a(gsxk.a, fokg0);
        this.c = ggnj.a;
    }

    @Override  // gphl
    public final fokg a() {
        return this.b;
    }

    @Override  // gphl
    public final Set b() {
        Set set0 = this.c;
        return ((ggfp)set0).isEmpty() ? gsxk.ac.ad : set0;
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

