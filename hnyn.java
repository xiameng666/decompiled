import java.util.Set;

final class hnyn implements gphl {
    private final fokg b;
    private final ggfp c;

    public hnyn() {
        fokg fokg0 = new fokg("ListMessages");
        this.b = fokg.a(hnyv.a, fokg0);
        this.c = ggfp.K("https://www.googleapis.com/auth/tachyon", "https://www.googleapis.com/auth/android-messages");
    }

    @Override  // gphl
    public final fokg a() {
        return this.b;
    }

    @Override  // gphl
    public final Set b() {
        Set set0 = this.c;
        return ((ggfp)set0).isEmpty() ? hnyv.k.l : set0;
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

