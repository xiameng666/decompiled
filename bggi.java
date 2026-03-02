public final class bggi implements evqk {
    public final bggq a;

    public bggi(bggq bggq0) {
        this.a = bggq0;
    }

    @Override  // evqk
    public final evql a(Object object0) {
        gged_interceptors gged0 = (gged_interceptors)object0;
        ggfd ggfd0 = bgga.b(gged0);
        gged_interceptors gged1 = bgga.a(gged0);
        evql evql0 = bggq.b(this.a.c.a(ggfd0), "Compromised password check failed.");
        evql evql1 = bggq.b(this.a.d.a(gged1), "Weak password check failed.");
        evql evql2 = bggq.b(bgiy.a(gged1), "Reuse password check failed.");
        evql evql3 = evrg.i(gged_interceptors.n(evql0, evql2, evql1)).g(new bgge(this.a, evql0)).g(new bggf(gged0, evql0, evql2, evql1));
        evql3.A(new bggg());
        return evql3;
    }
}

