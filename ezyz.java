public final class ezyz extends ezyx {
    public ezyz() {
        super("delayed-auto-resume-execution");
    }

    @Override  // ezyx
    protected final void b() {
        super.b();
        fagi fagi0 = this.a;
        batl.c(fagi0.c(ezza.l), "The initial delay needs to be set.");
        batl.c(fagi0.c(ezza.k), "The retry count needs to be set.");
    }

    @Override  // ezyx
    public final void c(boolean z) {
        super.c(true);
    }

    public final void f(long v, long v1) {
        fagi fagi0 = this.a;
        fagi0.e(ezza.l, Long.valueOf(v));
        fagi0.e(ezza.m, Long.valueOf(v1));
    }

    public final void g(double f) {
        this.a.e(ezza.n, Double.valueOf(f));
    }

    public final void h(int v) {
        this.a.e(ezza.k, Integer.valueOf(v));
    }
}

