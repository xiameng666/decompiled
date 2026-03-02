public final class aqsg implements AutoCloseable {
    public static gRPCMethodDescriptor a;
    public final bbfe_BaseGrpcServer b;
    public final iakq c;

    public aqsg(aqsg aqsg0, iakp iakp0, Object object0) {
        this.b = aqsg0.b;
        this.c = aqsg0.c.h(iakp0, object0);
    }

    public aqsg(bbfe_BaseGrpcServer bbfe0) {
        bbfe0.setContext(bbfe0.context);
        bbfe0.k();
        this.b = bbfe0;
        this.c = iakq.a;
    }

    @Override
    public final void close() {
        this.b.shutdownChannel();
    }
}

