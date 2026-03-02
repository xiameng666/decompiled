public final class aqqc implements AutoCloseable {
    public static gRPCMethodDescriptor a;
    public static gRPCMethodDescriptor b;
    public static gRPCMethodDescriptor c;
    public static gRPCMethodDescriptor d;
    public final bbfe_BaseGrpcServer e;
    public final iakq f;

    public aqqc(aqqc aqqc0, iakp iakp0, Object object0) {
        this.e = aqqc0.e;
        this.f = aqqc0.f.h(iakp0, object0);
    }

    public aqqc(bbfe_BaseGrpcServer bbfe0) {
        bbfe0.setContext(bbfe0.context);
        bbfe0.k();
        this.e = bbfe0;
        this.f = iakq.a;
    }

    @Override
    public final void close() {
        this.e.shutdownChannel();
    }
}

