final class sr extends tm {
    final ss a;

    public sr(ss ss0) {
        this.a = ss0;
        super();
    }

    @Override  // tm
    public final void a() {
        this.a.c = this.a.b.b();
        this.a.d.a.q();
        this.a.d.d();
    }

    @Override  // tm
    public final void b(int v, int v1) {
        this.a.d.e(this.a, v, v1, null);
    }

    @Override  // tm
    public final void c(int v, int v1, Object object0) {
        this.a.d.e(this.a, v, v1, object0);
    }

    @Override  // tm
    public final void d(int v, int v1) {
        this.a.c += v1;
        qs qs0 = this.a.d;
        int v2 = v + qs0.a(this.a);
        qs0.a.w(v2, v1);
        if(this.a.c > 0 && this.a.b.d == tj.b) {
            qs0.d();
        }
    }

    @Override  // tm
    public final void e(int v, int v1) {
        this.a.c -= v1;
        qs qs0 = this.a.d;
        int v2 = v + qs0.a(this.a);
        qs0.a.x(v2, v1);
        if(this.a.c <= 0 && this.a.b.d == tj.b) {
            qs0.d();
        }
    }

    @Override  // tm
    public final void f() {
        this.a.d.d();
    }

    @Override  // tm
    public final void g(int v, int v1) {
        int v2 = this.a.d.a(this.a);
        this.a.d.a.t(v + v2, v1 + v2);
    }
}

