import java.util.Set;

final class hlbn implements gphl {
    private final fokg b;
    private final ggfp c;

    public hlbn() {
        fokg fokg0 = new fokg("Heartbeat");
        this.b = fokg.a(hlcg.a, fokg0);
        this.c = ggnj.a;
    }

    @Override  // gphl
    public final fokg a() {
        return this.b;
    }

    @Override  // gphl
    public final Set b() {
        Set set0 = this.c;
        return ((ggfp)set0).isEmpty() ? hlcg.u.v : set0;
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

