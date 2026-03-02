import java.util.Set;

final class gywl implements gphl {
    private final fokg b;
    private final ggfp c;

    public gywl() {
        fokg fokg0 = new fokg("DeleteMyDevice");
        this.b = fokg.a(gywm.a, fokg0);
        this.c = new ggoh("https://www.googleapis.com/auth/nearbypresence-pa");
    }

    @Override  // gphl
    public final fokg a() {
        return this.b;
    }

    @Override  // gphl
    public final Set b() {
        Set set0 = this.c;
        return ((ggfp)set0).isEmpty() ? gywm.l.m : set0;
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

