import j..util.Objects;

final class ggbr extends ggbp {
    final ggbs a;

    public ggbr(ggbs ggbs0) {
        Objects.requireNonNull(ggbs0);
        this.a = ggbs0;
        super(ggbs0.d.length);
    }

    @Override  // ggbp
    public final ggeo a() {
        return this.a.b;
    }

    @Override  // ggbp
    public final Object b(int v) {
        return new ggbq(this.a, v);
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

