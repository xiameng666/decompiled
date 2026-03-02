public final class ekfs implements AutoCloseable {
    public static gRPCMethodDescriptor a;
    public static gRPCMethodDescriptor b;
    public static gRPCMethodDescriptor c;
    public final bbfe_BaseGrpcServer d;
    public final iakq e;

    public ekfs(bbfe_BaseGrpcServer bbfe0) {
        bbfe0.setContext(bbfe0.context);
        bbfe0.k();
        this.d = bbfe0;
        this.e = iakq.a;
    }

    public ekfs(ekfs ekfs0, iakp iakp0, Object object0) {
        this.d = ekfs0.d;
        this.e = ekfs0.e.h(iakp0, object0);
    }

    @Override
    public final void close() {
        this.d.shutdownChannel();
    }
}

