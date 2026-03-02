import j..util.Objects;

final class ggmv extends gfyv {
    final Comparable a;
    final ggmy b;

    public ggmv(ggmy ggmy0, Comparable comparable0) {
        Objects.requireNonNull(ggmy0);
        this.b = ggmy0;
        super(comparable0);
        this.a = ggmy0.X();
    }

    @Override  // gfyv
    protected final Object a(Object object0) {
        return ggmy.Z(((Comparable)object0), this.a) ? null : this.b.a.b(((Comparable)object0));
    }
}

