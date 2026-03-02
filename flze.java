public final class flze implements glzn {
    public final hnwp a;

    public flze(hnwp hnwp0) {
        this.a = hnwp0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        iakr iakr0 = ((hnvq)object0).a;
        gRPCMethodDescriptor iaoj0 = hnvr.a;
        if(iaoj0 == null) {
            synchronized(hnvr.class) {
                iaoj0 = hnvr.a;
                if(iaoj0 == null) {
                    gRPCMethodDescriptorBuilder iaog0 = gRPCMethodDescriptor.newBuilder();
                    iaog0.methodType = gRPCMethodType.a;
                    iaog0.fullMethodName = gRPCMethodDescriptor.generateFullMethodName("google.internal.communications.instantmessaging.v1.Registration", "Register");
                    iaog0.setSampledToLocalTracing();
                    iaog0.requestMarshaller = new ibjh(((MessageLite)hnwp.a));
                    iaog0.responseMarshaller = new ibjh(((MessageLite)hnwq.a));
                    iaoj0 = iaog0.build();
                    hnvr.a = iaoj0;
                }
            }
            return ibjw.a(iakr0.a(iaoj0, ((hnvq)object0).b), this.a);
        }
        return ibjw.a(iakr0.a(iaoj0, ((hnvq)object0).b), this.a);
    }
}

