import j..util.Objects;

final class iauq extends iavq {
    final iaku a;
    final String b;

    public iauq(iaux iaux0, iaku iaku0, String s) {
        this.a = iaku0;
        this.b = s;
        Objects.requireNonNull(iaux0);
        super(iaux0.e);
    }

    @Override  // iavq
    public final void a() {
        iaof_metadata iaof0 = new iaof_metadata();
        iaux.g(this.a, iapk.p.f(String.format("Unable to find compressor by name %s", this.b)), iaof0);
    }
}

