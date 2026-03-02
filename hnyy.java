import java.util.Set;

final class hnyy implements gphl {
    private final fokg b;
    private final ggfp c;

    public hnyy() {
        fokg fokg0 = new fokg("BatchGetLighterProfile");
        this.b = fokg.a(hnza.a, fokg0);
        this.c = ggfp.K("https://www.googleapis.com/auth/tachyon", "https://www.googleapis.com/auth/android-messages");
    }

    @Override  // gphl
    public final fokg a() {
        return this.b;
    }

    @Override  // gphl
    public final Set b() {
        Set set0 = this.c;
        return ((ggfp)set0).isEmpty() ? hnza.f.g : set0;
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

