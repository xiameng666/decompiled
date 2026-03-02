import j..util.Objects;

final class epws implements eqgt {
    final epwu a;

    public epws(epwu epwu0) {
        Objects.requireNonNull(epwu0);
        this.a = epwu0;
        super();
    }

    @Override  // eqgt
    public final void a(byte[] arr_b) {
        this.a.a.j("Fully decoded packet message", new Object[0]);
        this.a.h(arr_b);
    }

    @Override  // eqgt
    public final void b(Exception exception0) {
        this.a.a.g("Packet processing error", exception0, new Object[0]);
        this.a.d.d(10556, null);
        this.a.g(10556, null);
    }
}

