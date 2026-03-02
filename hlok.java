import java.util.Set;

final class hlok implements gphl {
    private final fokg b;
    private final ggfp c;

    public hlok() {
        fokg fokg0 = new fokg("GetDeviceConfig");
        this.b = fokg.a(hlop.a, fokg0);
        this.c = ggnj.a;
    }

    @Override  // gphl
    public final fokg a() {
        return this.b;
    }

    @Override  // gphl
    public final Set b() {
        Set set0 = this.c;
        return ((ggfp)set0).isEmpty() ? hlop.j.k : set0;
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

