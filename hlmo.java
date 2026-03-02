import java.util.Set;

final class hlmo implements gphl {
    private final fokg b;
    private final ggfp c;

    public hlmo() {
        fokg fokg0 = new fokg("GetProfileForTakeout");
        this.b = fokg.a(hlmx.a, fokg0);
        this.c = new ggoh("https://www.googleapis.com/auth/fitness");
    }

    @Override  // gphl
    public final fokg a() {
        return this.b;
    }

    @Override  // gphl
    public final Set b() {
        Set set0 = this.c;
        return ((ggfp)set0).isEmpty() ? hlmx.M.N : set0;
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

