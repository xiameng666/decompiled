import j..util.Objects;

final class bmqt implements Runnable {
    final bmqw a;

    public bmqt(bmqw bmqw0) {
        Objects.requireNonNull(bmqw0);
        this.a = bmqw0;
        super();
    }

    @Override
    public final void run() {
        bmqr bmqr0 = (bmqr)this.a.f;
        bmqr0.aj.b(null, blgt.B);
        bmqr0.y();
    }
}

