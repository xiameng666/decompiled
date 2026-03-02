import java.util.Set;

final class hobd implements gphl {
    private final fokg b;
    private final ggfp c;

    public hobd() {
        fokg fokg0 = new fokg("SignOutUser");
        this.b = fokg.a(hobf.a, fokg0);
        this.c = ggfp.K("https://www.googleapis.com/auth/tachyon", "https://www.googleapis.com/auth/android-messages");
    }

    @Override  // gphl
    public final fokg a() {
        return this.b;
    }

    @Override  // gphl
    public final Set b() {
        Set set0 = this.c;
        return ((ggfp)set0).isEmpty() ? hobf.m.n : set0;
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

