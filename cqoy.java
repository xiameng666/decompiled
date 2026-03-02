import j..util.Objects;

final class cqoy implements cqpf {
    final cqpi a;

    public cqoy(cqpi cqpi0) {
        Objects.requireNonNull(cqpi0);
        this.a = cqpi0;
        super();
    }

    @Override  // cqpf
    public final void a(Exception exception0) {
        a.ae(cqpi.d.i(), "Failed to get phone number verification state", exception0);
    }

    @Override  // cqpf
    public final void b(Object object0) {
        cqpb cqpb0 = (cqpb)object0;
        cqov cqov0 = new cqov(this, cqpb0);
        cqow cqow0 = new cqow(this, cqpb0);
        cqpb0.b.ifPresentOrElse(cqov0, cqow0);
    }
}

