import j..util.Objects;

final class ggbm extends ggbp {
    final ggbs a;
    private final int c;

    public ggbm(ggbs ggbs0, int v) {
        Objects.requireNonNull(ggbs0);
        this.a = ggbs0;
        super(ggbs0.e[v]);
        this.c = v;
    }

    @Override  // ggbp
    public final ggeo a() {
        return this.a.b;
    }

    @Override  // ggbp
    public final Object b(int v) {
        return this.a.f[v][this.c];
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

