import j..util.Objects;

final class cqot implements cqpf {
    final cqpi a;

    public cqot(cqpi cqpi0) {
        Objects.requireNonNull(cqpi0);
        this.a = cqpi0;
        super();
    }

    @Override  // cqpf
    public final void a(Exception exception0) {
        a.ae(cqpi.d.i(), "Failed to get security question", exception0);
    }

    @Override  // cqpf
    public final void b(Object object0) {
        if(!((Boolean)object0).booleanValue()) {
            this.a.V(cqpc.h);
        }
    }
}

