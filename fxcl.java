import j..util.Objects;

final class fxcl extends fxcn {
    protected boolean a;
    final fxcq b;

    public fxcl(fxcq fxcq0, fwzh fwzh0, fwze fwze0, fvtz fvtz0) {
        Objects.requireNonNull(fxcq0);
        this.b = fxcq0;
        super(fxcq0, fwzh0, fwze0, fvtz0, true, new fxci());
        this.a = false;
    }

    @Override  // fxcn
    public final void a(fvtd fvtd0, int v) {
        super.a(fvtd0, v);
        if(huvd.u() && this.a) {
            this.a = false;
            this.b.e.b(false);
        }
    }

    @Override  // fxcn
    public final fwzi b(fvtz fvtz0, boolean z) {
        fwzi fwzi0 = super.b(fvtz0, z);
        long v = huvd.d();
        fwzi0.c = v == -1L ? fvtz0.a : Math.max(fwzi0.a().d, v);
        long v1 = this.b.a.f().b();
        long v2 = this.b.a.m().i();
        boolean z1 = true;
        this.a = fvtz0.d() && v1 + fvtz0.c > v2 + fvtz0.c;
        if(!huvd.u() || !this.a) {
            z1 = false;
        }
        fwzi0.d = z1;
        return fwzi0;
    }

    @Override  // fxcn
    public final void c() {
        gmcd gmcd0 = glzd.f(glzd.g(this.b.d.a(), new fxcj(this), this.b.a.mJ().a), new fxck(this), this.b.a.mJ().a);
        this.b.a.g().b(gmcd0);
    }
}

