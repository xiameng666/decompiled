import j..util.Objects;

final class eqfn implements gmbg {
    final eqfo a;

    public eqfn(eqfo eqfo0) {
        Objects.requireNonNull(eqfo0);
        this.a = eqfo0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        eqfo.h.g("Error sending MessagePayload", throwable0, new Object[0]);
        this.a.f(10563, "Error sending MessagePayload", null);
    }

    @Override  // gmbg
    public final void b(Object object0) {
        this.a.e();
    }
}

