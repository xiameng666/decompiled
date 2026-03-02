import j..util.Objects;

final class cqou implements cqpf {
    final cqpi a;

    public cqou(cqpi cqpi0) {
        Objects.requireNonNull(cqpi0);
        this.a = cqpi0;
        super();
    }

    @Override  // cqpf
    public final void a(Exception exception0) {
        a.ae(cqpi.d.i(), "Failed to get cached phone number verification state", exception0);
    }

    @Override  // cqpf
    public final void b(Object object0) {
        if(((gged_interceptors)object0).isEmpty()) {
            return;
        }
        this.a.ai = Boolean.valueOf(true);
        cqpb cqpb0 = cqpb.c(((gged_interceptors)object0));
        this.a.U(cqpb0, true);
    }
}

