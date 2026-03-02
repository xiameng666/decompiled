import j..util.Objects;

final class fxcp implements fvtb {
    public fxcn a;
    final fxcq b;

    public fxcp(fxcq fxcq0, fwze fwze0) {
        Objects.requireNonNull(fxcq0);
        this.b = fxcq0;
        super();
        this.a = new fxcf(fxcq0, fwze0);
    }

    @Override  // fvtb
    public final void a(fvtd fvtd0, int v) {
        fxcq fxcq0 = this.b;
        if(fxcq0.g) {
            return;
        }
        fxcq0.a.mJ().a();
        gmcd gmcd0 = glzd.f(fxcq0.a(fvtd0, v), new fxco(this, v), fxcq0.a.mJ().a);
        fxcq0.a.g().b(gmcd0);
    }

    final void b(boolean z) {
        if(this.b.g) {
            return;
        }
        fxcn fxcn0 = this.a;
        fwrm.a(fxcn0.d.mH(), 15, ((int)fxcn0.e.a), ((int)fxcn0.e.c));
        fwzl fwzl0 = fxcn0.b(fxcn0.e, z).a();
        fxcn0.f = fxcn0.c.e(fwzl0, fxcn0.e.d);
    }
}

