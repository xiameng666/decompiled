import j..util.Objects;

final class iauv extends iavq {
    final iauw a;

    public iauv(iauw iauw0) {
        Objects.requireNonNull(iauw0);
        this.a = iauw0;
        super(iauw0.c.e);
    }

    @Override  // iavq
    public final void a() {
        iauw iauw0 = this.a;
        if(iauw0.b == null) {
            try {
                iauw0.a.d();
            }
            catch(Throwable throwable0) {
                iapk iapk0 = iapk.c.e(throwable0).f("Failed to call onReady.");
                this.a.b(iapk0);
            }
        }
    }
}

