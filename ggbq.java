import j..util.Objects;

final class ggbq extends ggbp {
    final ggbs a;
    private final int c;

    public ggbq(ggbs ggbs0, int v) {
        Objects.requireNonNull(ggbs0);
        this.a = ggbs0;
        super(ggbs0.d[v]);
        this.c = v;
    }

    @Override  // ggbp
    public final ggeo a() {
        return this.a.c;
    }

    @Override  // ggbp
    public final Object b(int v) {
        return this.a.f[this.c][v];
    }

    @Override  // ggeo
    public final boolean c() {
        return true;
    }

    @Override  // ggbp
    public Object writeReplace() {
        return super.writeReplace();
    }
}

