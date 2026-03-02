import j..util.Objects;

final class ggbn extends ggbp {
    final ggbs a;

    public ggbn(ggbs ggbs0) {
        Objects.requireNonNull(ggbs0);
        this.a = ggbs0;
        super(ggbs0.e.length);
    }

    @Override  // ggbp
    public final ggeo a() {
        return this.a.c;
    }

    @Override  // ggbp
    public final Object b(int v) {
        return new ggbm(this.a, v);
    }

    @Override  // ggeo
    public final boolean c() {
        return false;
    }

    @Override  // ggbp
    public Object writeReplace() {
        return super.writeReplace();
    }
}

