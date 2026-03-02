import j..util.Objects;

final class iawb extends iavq {
    final iaku a;
    final iapk b;

    public iawb(iawh iawh0, iaku iaku0, iapk iapk0) {
        Objects.requireNonNull(iawh0);
        super(iawh0.a);
        this.a = iaku0;
        this.b = iapk0;
    }

    @Override  // iavq
    public final void a() {
        iaof_metadata iaof0 = new iaof_metadata();
        this.a.a(this.b, iaof0);
    }
}

