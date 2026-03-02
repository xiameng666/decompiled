public final class hntj extends ibjm {
    public hntj(iakr iakr0, iakq iakq0) {
        super(iakr0, iakq0);
    }

    public final gmcd a(hgjg hgjg0) {
        gRPCMethodDescriptor iaoj0 = hntk.a;
        if(iaoj0 == null) {
            synchronized(hntk.class) {
                iaoj0 = hntk.a;
                if(iaoj0 == null) {
                    gRPCMethodDescriptorBuilder iaog0 = gRPCMethodDescriptor.newBuilder();
                    iaog0.methodType = gRPCMethodType.a;
                    iaog0.fullMethodName = gRPCMethodDescriptor.generateFullMethodName("google.internal.communications.instantmessaging.v1.LighterFrontend", "SendLighterMessage");
                    iaog0.setSampledToLocalTracing();
                    iaog0.requestMarshaller = new ibjh(((MessageLite)hgjg.a));
                    iaog0.responseMarshaller = new ibjh(((MessageLite)hgjh.a));
                    iaoj0 = iaog0.build();
                    hntk.a = iaoj0;
                }
            }
            return ibjw.a(this.a.a(iaoj0, this.b), hgjg0);
        }
        return ibjw.a(this.a.a(iaoj0, this.b), hgjg0);
    }

    @Override  // ibjo
    protected final ibjo d(iakr iakr0, iakq iakq0) {
        return new hntj(iakr0, iakq0);
    }
}

