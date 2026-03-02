import java.util.concurrent.Executor;

public final class bnye implements bnxu {
    public static final bboh a;
    public final ibnf b;
    public final bnzh c;
    public final fqxf d;
    public final Executor e;
    public final bnla f;
    private final fqxe g;

    static {
        bnye.a = bboh.b("OwnerKeyImporter", bbcu.eD);
    }

    public bnye(ibnf ibnf0, bnzh bnzh0, bnla bnla0, fqxf fqxf0, fqxe fqxe0, Executor executor0) {
        this.b = ibnf0;
        this.c = bnzh0;
        this.f = bnla0;
        this.d = fqxf0;
        this.g = fqxe0;
        this.e = executor0;
    }

    @Override  // bnxu
    public final gmcd a(fqzn fqzn0, bnxi bnxi0) {
        gmcd gmcd0 = this.c.a();
        gdta gdta0 = gdta.g(this.g.f()).h(new bnxz(), gmap.a);
        return gdtd.h(new gmcd[]{gmcd0, gdta0}).b(new bnxv(this, gmcd0, gdta0, fqzn0, bnxi0), this.e).i(new bnxw(this, fqzn0), this.e);
    }

    public final gmcd b(gfsx gfsx0, fqzn fqzn0, bnxi bnxi0, gfsx gfsx1) {
        return gdta.g(this.f.e()).i(new bnyd(this, bnxi0, gfsx1, fqzn0, gfsx0), this.e);
    }
}

