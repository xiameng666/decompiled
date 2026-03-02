public final class hllk extends ibjm {
    public hllk(iakr iakr0, iakq iakq0) {
        super(iakr0, iakq0);
    }

    public final gmcd a(hlfp hlfp0) {
        gRPCMethodDescriptor iaoj0 = hlll.n;
        if(iaoj0 == null) {
            synchronized(hlll.class) {
                iaoj0 = hlll.n;
                if(iaoj0 == null) {
                    gRPCMethodDescriptorBuilder iaog0 = gRPCMethodDescriptor.newBuilder();
                    iaog0.methodType = gRPCMethodType.a;
                    iaog0.fullMethodName = gRPCMethodDescriptor.generateFullMethodName("google.android.fitness.firstparty.v0firstparty.FitnessFirstPartyService", "ExchangeSyncTokens");
                    iaog0.setSampledToLocalTracing();
                    iaog0.requestMarshaller = new ibjh(((MessageLite)hlfp.a));
                    iaog0.responseMarshaller = new ibjh(((MessageLite)hlfq.a));
                    iaoj0 = iaog0.build();
                    hlll.n = iaoj0;
                }
            }
            return ibjw.a(this.a.a(iaoj0, this.b), hlfp0);
        }
        return ibjw.a(this.a.a(iaoj0, this.b), hlfp0);
    }

    public final gmcd b(hlfw hlfw0) {
        gRPCMethodDescriptor iaoj0 = hlll.m;
        if(iaoj0 == null) {
            synchronized(hlll.class) {
                iaoj0 = hlll.m;
                if(iaoj0 == null) {
                    gRPCMethodDescriptorBuilder iaog0 = gRPCMethodDescriptor.newBuilder();
                    iaog0.methodType = gRPCMethodType.a;
                    iaog0.fullMethodName = gRPCMethodDescriptor.generateFullMethodName("google.android.fitness.firstparty.v0firstparty.FitnessFirstPartyService", "ListDataPointMutations");
                    iaog0.setSampledToLocalTracing();
                    iaog0.requestMarshaller = new ibjh(((MessageLite)hlfw.a));
                    iaog0.responseMarshaller = new ibjh(((MessageLite)hlfx.a));
                    iaoj0 = iaog0.build();
                    hlll.m = iaoj0;
                }
            }
            return ibjw.a(this.a.a(iaoj0, this.b), hlfw0);
        }
        return ibjw.a(this.a.a(iaoj0, this.b), hlfw0);
    }

    @Override  // ibjo
    protected final ibjo d(iakr iakr0, iakq iakq0) {
        return new hllk(iakr0, iakq0);
    }
}

