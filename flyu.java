public final class flyu implements glzn {
    public final hnwc a;

    public flyu(hnwc hnwc0) {
        this.a = hnwc0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        iakr iakr0 = ((hnvm)object0).a;
        gRPCMethodDescriptor iaoj0 = hnvo.b;
        if(iaoj0 == null) {
            synchronized(hnvo.class) {
                iaoj0 = hnvo.b;
                if(iaoj0 == null) {
                    gRPCMethodDescriptorBuilder iaog0 = gRPCMethodDescriptor.newBuilder();
                    iaog0.methodType = gRPCMethodType.a;
                    iaog0.fullMethodName = gRPCMethodDescriptor.generateFullMethodName("google.internal.communications.instantmessaging.v1.Messaging", "PullMessages");
                    iaog0.setSampledToLocalTracing();
                    iaog0.requestMarshaller = new ibjh(((MessageLite)hnwc.a));
                    iaog0.responseMarshaller = new ibjh(((MessageLite)hnwd.a));
                    iaoj0 = iaog0.build();
                    hnvo.b = iaoj0;
                }
            }
            return ibjw.a(iakr0.a(iaoj0, ((hnvm)object0).b), this.a);
        }
        return ibjw.a(iakr0.a(iaoj0, ((hnvm)object0).b), this.a);
    }
}

