import j..util.Objects;

final class epwv implements gmbg {
    final epxa a;

    public epwv(epxa epxa0) {
        Objects.requireNonNull(epxa0);
        this.a = epxa0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        epxa.a.g("Error sending MessagePayload", throwable0, new Object[0]);
        this.a.f(10563, "Error sending MessagePayload", null);
    }

    @Override  // gmbg
    public final void b(Object object0) {
    }
}

