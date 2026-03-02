import j..util.Objects;

final class ibag extends iavq {
    final iaku a;
    final iapk b;

    public ibag(ibah ibah0, iaku iaku0, iapk iapk0) {
        this.a = iaku0;
        this.b = iapk0;
        Objects.requireNonNull(ibah0);
        super(ibah0.a);
    }

    @Override  // iavq
    public final void a() {
        iaof_metadata iaof0 = new iaof_metadata();
        this.a.a(this.b, iaof0);
    }
}

