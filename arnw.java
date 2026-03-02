import j..util.Objects;

final class arnw implements evqc {
    final arot a;

    public arnw(arot arot0) {
        Objects.requireNonNull(arot0);
        this.a = arot0;
        super();
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        arot.a.g("Failure accepting connection", exception0, new Object[0]);
        int v = (exception0 instanceof aztb) ? ((aztb)exception0).b() : 13;
        this.a.d.k(v);
    }
}

