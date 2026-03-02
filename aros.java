import j..util.Objects;

final class aros implements evqc {
    final arot a;

    public aros(arot arot0) {
        Objects.requireNonNull(arot0);
        this.a = arot0;
        super();
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        arot.a.g("Failure starting discovery", exception0, new Object[0]);
        int v = (exception0 instanceof aztb) ? ((aztb)exception0).b() : 13;
        this.a.d.n(v);
    }
}

