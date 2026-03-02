public final class flyo implements glzn {
    public final hnrf a;

    public flyo(hnrf hnrf0) {
        this.a = hnrf0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        iakr iakr0 = ((hnqx)object0).a;
        gRPCMethodDescriptor iaoj0 = hnqy.b;
        if(iaoj0 == null) {
            synchronized(hnqy.class) {
                iaoj0 = hnqy.b;
                if(iaoj0 == null) {
                    gRPCMethodDescriptorBuilder iaog0 = gRPCMethodDescriptor.newBuilder();
                    iaog0.methodType = gRPCMethodType.a;
                    iaog0.fullMethodName = gRPCMethodDescriptor.generateFullMethodName("google.internal.communications.instantmessaging.v1.LighterCloudMessageService", "ListMessages");
                    iaog0.setSampledToLocalTracing();
                    iaog0.requestMarshaller = new ibjh(((MessageLite)hnrf.a));
                    iaog0.responseMarshaller = new ibjh(((MessageLite)hnrg.a));
                    iaoj0 = iaog0.build();
                    hnqy.b = iaoj0;
                }
            }
            return ibjw.a(iakr0.a(iaoj0, ((hnqx)object0).b), this.a);
        }
        return ibjw.a(iakr0.a(iaoj0, ((hnqx)object0).b), this.a);
    }
}

