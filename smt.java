import j..util.Objects;

final class smt extends tm {
    final smu a;

    public smt(smu smu0) {
        Objects.requireNonNull(smu0);
        this.a = smu0;
        super();
    }

    @Override  // tm
    public final void a() {
        this.a.q();
    }

    @Override  // tm
    public final void b(int v, int v1) {
        smu smu0 = this.a;
        if(smu0.a != null) {
            ++v;
        }
        smu0.u(v, v1);
    }

    @Override  // tm
    public final void d(int v, int v1) {
        smu smu0 = this.a;
        if(smu0.a != null) {
            ++v;
        }
        smu0.w(v, v1);
    }

    @Override  // tm
    public final void e(int v, int v1) {
        smu smu0 = this.a;
        if(smu0.a != null) {
            ++v;
        }
        smu0.x(v, v1);
    }

    @Override  // tm
    public final void g(int v, int v1) {
        smu smu0 = this.a;
        if(smu0.a != null) {
            ++v;
            ++v1;
        }
        smu0.t(v, v1);
    }
}

