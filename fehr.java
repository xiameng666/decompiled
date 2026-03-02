import j..util.Objects;

final class fehr implements gmbg {
    final fehs a;

    public fehr(fehs fehs0) {
        Objects.requireNonNull(fehs0);
        this.a = fehs0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        this.a.e.a("stopConnection: Failed");
        ffmn.c("BleOffloadServerConn", throwable0, "Could not stop the offload server", new Object[0]);
    }

    @Override  // gmbg
    public final void b(Object object0) {
        Void void0 = (Void)object0;
        this.a.e.a("stopConnection: Complete");
        ffmn.a("BleOffloadServerConn", "Offload server stopped", new Object[0]);
        this.a.c(fehf.d);
    }
}

