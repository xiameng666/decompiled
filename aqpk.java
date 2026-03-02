public final class aqpk implements AutoCloseable {
    public static gRPCMethodDescriptor a;
    public static gRPCMethodDescriptor b;
    public static gRPCMethodDescriptor c;
    public static gRPCMethodDescriptor d;
    public static gRPCMethodDescriptor e;
    public static gRPCMethodDescriptor f;
    public static gRPCMethodDescriptor g;
    public static gRPCMethodDescriptor h;
    public static gRPCMethodDescriptor i;
    public static gRPCMethodDescriptor j;
    public static gRPCMethodDescriptor k;
    public final bbfe_BaseGrpcServer l;
    public final iakq m;

    public aqpk(aqpk aqpk0, iakp iakp0, Object object0) {
        this.l = aqpk0.l;
        this.m = aqpk0.m.h(iakp0, object0);
    }

    public aqpk(bbfe_BaseGrpcServer bbfe0) {
        bbfe0.setContext(bbfe0.context);
        bbfe0.k();
        this.l = bbfe0;
        this.m = iakq.a;
    }

    @Override
    public final void close() {
        this.l.shutdownChannel();
    }
}

