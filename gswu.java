import java.util.Set;

final class gswu implements gphl {
    private final fokg b;
    private final ggfp c;

    public gswu() {
        fokg fokg0 = new fokg("BlockPeople");
        this.b = fokg.a(gsxk.a, fokg0);
        this.c = ggfp.L("https://www.googleapis.com/auth/peopleapi.legacy.readwrite", "https://www.googleapis.com/auth/peopleapi.readwrite", "https://www.googleapis.com/auth/plus.peopleapi.readwrite");
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
        return false;
    }

    @Override
    public final String toString() {
        return this.b.a;
    }
}

