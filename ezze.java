public final class ezze extends ezyx {
    public ezze() {
        super("fixed-delay-execution");
    }

    @Override  // ezyx
    protected final void b() {
        super.b();
        fagi fagi0 = this.a;
        batl.c(fagi0.c(ezzf.k), "The delay needs to be set.");
        batl.c(!((Boolean)fagi0.b(ezzf.l)).booleanValue() || !((gfsx)fagi0.b(ezyy.i)).i(), "Delays cannot be both exact and specify constraints.");
    }

    @Override  // ezyx
    public final void c(boolean z) {
        super.c(false);
    }

    public final void f(long v) {
        this.a.e(ezzf.k, Long.valueOf(v));
    }

    public final void g(boolean z) {
        this.a.e(ezzf.l, Boolean.valueOf(z));
    }
}

