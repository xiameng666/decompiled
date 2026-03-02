import j..util.Objects;

final class fmxz implements gmbg {
    final boolean a;
    final gged_interceptors b;
    final fmya c;

    public fmxz(fmya fmya0, boolean z, gged_interceptors gged0) {
        this.a = z;
        this.b = gged0;
        Objects.requireNonNull(fmya0);
        this.c = fmya0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        gged_interceptors gged0 = this.c.a(this.b);
        this.c.c.b(this.a, gged0);
    }

    @Override  // gmbg
    public final void b(Object object0) {
        gged_interceptors gged0 = this.c.a(((gged_interceptors)object0));
        this.c.c.b(this.a, gged0);
    }
}

