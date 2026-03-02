import j..util.Objects;

final class dogn extends lm {
    final edkr a;
    final dogp b;

    public dogn(dogp dogp0, edkr edkr0) {
        this.a = edkr0;
        Objects.requireNonNull(dogp0);
        this.b = dogp0;
        super();
    }

    @Override  // lm
    public final int a() {
        return this.a == null ? 0 : 1;
    }

    @Override  // lm
    public final int b() {
        return this.b.g == null ? 0 : 1;
    }

    @Override  // lm
    public final boolean d(int v, int v1) {
        return Objects.equals(this.a, this.b.g);
    }

    @Override  // lm
    public final boolean e(int v, int v1) {
        edkr edkr0 = this.b.g;
        if(edkr0 != null) {
            return this.a == null ? Objects.equals(edkr0, this.a) : edkr0.c.equals(this.a.c);
        }
        return Objects.equals(null, this.a);
    }
}

