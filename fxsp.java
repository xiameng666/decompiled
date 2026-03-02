public final class fxsp implements AutoCloseable {
    public static gRPCMethodDescriptor a;
    public static gRPCMethodDescriptor b;
    public static gRPCMethodDescriptor c;
    public static gRPCMethodDescriptor d;
    public static gRPCMethodDescriptor e;
    public static gRPCMethodDescriptor f;
    public final bbfe_BaseGrpcServer g;
    public final iakq h;

    public fxsp(bbfe_BaseGrpcServer bbfe0) {
        bbfe0.setContext(bbfe0.context);
        bbfe0.k();
        this.g = bbfe0;
        this.h = iakq.a;
    }

    public fxsp(fxsp fxsp0, iakp iakp0, Object object0) {
        this.g = fxsp0.g;
        this.h = fxsp0.h.h(iakp0, object0);
    }

    @Override
    public final void close() {
        this.g.shutdownChannel();
    }
}

