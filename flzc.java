public final class flzc implements glzn {
    public final hnwn a;

    public flzc(hnwn hnwn0) {
        this.a = hnwn0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        iakr iakr0 = ((hnvq)object0).a;
        gRPCMethodDescriptor iaoj0 = hnvr.b;
        if(iaoj0 == null) {
            synchronized(hnvr.class) {
                iaoj0 = hnvr.b;
                if(iaoj0 == null) {
                    gRPCMethodDescriptorBuilder iaog0 = gRPCMethodDescriptor.newBuilder();
                    iaog0.methodType = gRPCMethodType.a;
                    iaog0.fullMethodName = gRPCMethodDescriptor.generateFullMethodName("google.internal.communications.instantmessaging.v1.Registration", "RegisterRefresh");
                    iaog0.setSampledToLocalTracing();
                    iaog0.requestMarshaller = new ibjh(((MessageLite)hnwn.a));
                    iaog0.responseMarshaller = new ibjh(((MessageLite)hnwo.a));
                    iaoj0 = iaog0.build();
                    hnvr.b = iaoj0;
                }
            }
            return ibjw.a(iakr0.a(iaoj0, ((hnvq)object0).b), this.a);
        }
        return ibjw.a(iakr0.a(iaoj0, ((hnvq)object0).b), this.a);
    }
}

