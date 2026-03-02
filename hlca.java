import java.util.Set;

final class hlca implements gphl {
    private final fokg b;
    private final ggfp c;

    public hlca() {
        fokg fokg0 = new fokg("StartSync");
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

