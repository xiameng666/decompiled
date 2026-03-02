import j..util.Objects;

final class epwz implements eqgt {
    final epxa a;

    public epwz(epxa epxa0) {
        Objects.requireNonNull(epxa0);
        this.a = epxa0;
        super();
    }

    @Override  // eqgt
    public final void a(byte[] arr_b) {
        epxa.a.j("Fully decoded packet message", new Object[0]);
        this.a.h(arr_b);
    }

    @Override  // eqgt
    public final void b(Exception exception0) {
        epxa.a.g("packet processing error", exception0, new Object[0]);
        this.a.f(10556, "packet processing error", null);
    }
}

