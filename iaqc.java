import j..util.Objects;

final class iaqc extends iaky {
    final iaqd a;

    public iaqc(iaqd iaqd0, iakv iakv0) {
        Objects.requireNonNull(iaqd0);
        this.a = iaqd0;
        super(iakv0);
    }

    @Override  // iaky
    public final void f(iaku iaku0, iaof_metadata iaof0) {
        iaof0.i(iaqd.a, this.a.b);
        this.d.e(iaku0, iaof0);
    }
}

