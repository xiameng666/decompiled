public final class hlkr extends ibjm {
    public hlkr(iakr iakr0, iakq iakq0) {
        super(iakr0, iakq0);
    }

    public final gmcd a(hlkd hlkd0) {
        gRPCMethodDescriptor iaoj0 = hlks.c;
        if(iaoj0 == null) {
            synchronized(hlks.class) {
                iaoj0 = hlks.c;
                if(iaoj0 == null) {
                    gRPCMethodDescriptorBuilder iaog0 = gRPCMethodDescriptor.newBuilder();
                    iaog0.methodType = gRPCMethodType.a;
                    iaog0.fullMethodName = gRPCMethodDescriptor.generateFullMethodName("google.android.fitness.v0.FitnessService", "ListSessions");
                    iaog0.setSampledToLocalTracing();
                    iaog0.requestMarshaller = new ibjh(((MessageLite)hlkd.a));
                    iaog0.responseMarshaller = new ibjh(((MessageLite)hlke.a));
                    iaoj0 = iaog0.build();
                    hlks.c = iaoj0;
                }
            }
            return ibjw.a(this.a.a(iaoj0, this.b), hlkd0);
        }
        return ibjw.a(this.a.a(iaoj0, this.b), hlkd0);
    }

    @Override  // ibjo
    protected final ibjo d(iakr iakr0, iakq iakq0) {
        return new hlkr(iakr0, iakq0);
    }
}

