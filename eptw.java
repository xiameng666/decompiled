public final class eptw implements AutoCloseable {
    public static gRPCMethodDescriptor a;
    public final bbfe_BaseGrpcServer b;
    public final iakq c;

    public eptw(bbfe_BaseGrpcServer bbfe0) {
        bbfe0.setContext(bbfe0.context);
        bbfe0.k();
        this.b = bbfe0;
        this.c = iakq.a;
    }

    public eptw(eptw eptw0, iakp iakp0, Object object0) {
        this.b = eptw0.b;
        this.c = eptw0.c.h(iakp0, object0);
    }

    @Override
    public final void close() {
        this.b.shutdownChannel();
    }
}

