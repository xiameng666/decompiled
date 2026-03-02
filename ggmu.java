import j..util.Objects;

final class ggmu extends gfyv {
    final Comparable a;
    final ggmy b;

    public ggmu(ggmy ggmy0, Comparable comparable0) {
        Objects.requireNonNull(ggmy0);
        this.b = ggmy0;
        super(comparable0);
        this.a = ggmy0.Y();
    }

    @Override  // gfyv
    protected final Object a(Object object0) {
        return ggmy.Z(((Comparable)object0), this.a) ? null : this.b.a.a(((Comparable)object0));
    }
}

