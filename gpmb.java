public final class gpmb {
    public static final gpmb a;
    public final gpma b;
    public final gplw c;
    public final iakq d;
    private final gmcd e;

    static {
        gpmb.a = new gpmb(gpma.a, null, null, null);
        new gpmb(gpma.e, null, null, null);
    }

    public gpmb(gpma gpma0, gplw gplw0, gmcd gmcd0, iakq iakq0) {
        gftb.check(gpma0);
        this.b = gpma0;
        this.c = gplw0;
        this.e = gmcd0;
        this.d = iakq0;
    }

    public final gmcd a() {
        gftb.q(this.b == gpma.d);
        return this.e;
    }

    public static gpmb b(iapk iapk0, iaof_metadata iaof0) {
        gftb.check(iapk0);
        gftb.r(((boolean)(iapk0.h() ^ 1)), "Error status must not be ok");
        gplw gplw0 = new gplw(iapk0, iaof0);
        return new gpmb(gpma.b, gplw0, null, null);
    }

    public static gpmb c(gmcd gmcd0) {
        gftb.check(gmcd0);
        return new gpmb(gpma.d, null, gmcd0, null);
    }
}

