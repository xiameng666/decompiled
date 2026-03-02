import j..util.Objects;

final class iaus extends iavq {
    final iaof_metadata a;
    final iauw b;

    public iaus(iauw iauw0, iaof_metadata iaof0) {
        this.a = iaof0;
        Objects.requireNonNull(iauw0);
        this.b = iauw0;
        super(iauw0.c.e);
    }

    @Override  // iavq
    public final void a() {
        iauw iauw0 = this.b;
        if(iauw0.b == null) {
            try {
                iauw0.a.b(this.a);
            }
            catch(Throwable throwable0) {
                iapk iapk0 = iapk.c.e(throwable0).f("Failed to read headers");
                this.b.b(iapk0);
            }
        }
    }
}

