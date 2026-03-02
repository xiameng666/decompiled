import java.util.concurrent.Executor;

public final class bnzd implements bnqo {
    public final fqxe a;
    public final bnqm b;
    public final Executor c;
    public final gsyz d;
    public final fqwq e;
    public volatile fqzl f;
    private volatile gmcd g;

    public bnzd(fqxe fqxe0, bnqm bnqm0, Executor executor0, gsyz gsyz0, fqwq fqwq0) {
        this.a = fqxe0;
        this.b = bnqm0;
        this.c = executor0;
        this.d = gsyz0;
        this.e = fqwq0;
    }

    @Override  // bnqo
    public final gmcd a() {
        gftb.q(this.g == null);
        gftb.b(((boolean)(this.e.b.i() ^ 1)), "Provided user secrets do not match Android devices");
        this.g = gdta.g(this.a.f()).i(new bnyz(this), this.c).i(new fqub(new bnza(this)), this.c).i(new fqub(new bnzb(this)), this.c).h(new bnzc(), gmap.a);
        return this.g;
    }
}

