import j..util.Objects;

final class iaqj extends iaky {
    final iaqk a;

    public iaqj(iaqk iaqk0, iakv iakv0) {
        Objects.requireNonNull(iaqk0);
        this.a = iaqk0;
        super(iakv0);
    }

    @Override  // iaky
    public final void f(iaku iaku0, iaof_metadata iaof0) {
        iaof0.i(iaqk.a, "Bearer " + this.a.b);
        this.d.e(new iaqi(this, iaku0), iaof0);
    }
}

