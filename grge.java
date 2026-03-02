import java.util.Set;

final class grge implements gphl {
    private final fokg b;
    private final ggfp c;

    public grge() {
        fokg fokg0 = new fokg("ListSecurityDomainMembers");
        this.b = fokg.a(grgh.a, fokg0);
        this.c = new ggoh("https://www.googleapis.com/auth/cryptauth");
    }

    @Override  // gphl
    public final fokg a() {
        return this.b;
    }

    @Override  // gphl
    public final Set b() {
        Set set0 = this.c;
        return ((ggfp)set0).isEmpty() ? grgh.l.m : set0;
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

