import j..util.Objects;

final class arop implements evqc {
    final arot a;

    public arop(arot arot0) {
        Objects.requireNonNull(arot0);
        this.a = arot0;
        super();
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        arot.a.g("Failure rejecting connection", exception0, new Object[0]);
        int v = (exception0 instanceof aztb) ? ((aztb)exception0).b() : 13;
        this.a.d.l(v);
    }
}

