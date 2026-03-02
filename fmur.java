import j..util.Objects;

final class fmur implements fmvh {
    final fmus a;

    public fmur(fmus fmus0) {
        Objects.requireNonNull(fmus0);
        this.a = fmus0;
        super();
    }

    @Override  // fmvh
    public final void a() {
    }

    @Override  // fmvh
    public final void b() {
        fmus fmus0 = this.a;
        fmaj fmaj0 = fmus0.f.b(109).a();
        fmus0.f.g.b(fmaj0);
        if(fmus0.N) {
            fmus0.f();
            return;
        }
        new fmux(fmus0.e, fmus0.b, fmus0.ak).executeOnExecutor(fmus0.E, new Void[0]);
        fmus0.am.c(fmus0.b);
    }
}

