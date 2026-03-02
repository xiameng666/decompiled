import j..util.Objects;

final class accd extends sa {
    final accn d;

    public accd(accn accn0) {
        Objects.requireNonNull(accn0);
        this.d = accn0;
        super();
    }

    @Override  // sa
    public final int b(int v) {
        return this.d.au.n(v);
    }
}

