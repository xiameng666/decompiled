public final class flzk implements glzn {
    public final hnwt a;

    public flzk(hnwt hnwt0) {
        this.a = hnwt0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        iakr iakr0 = ((hnvq)object0).a;
        gRPCMethodDescriptor iaoj0 = hnvr.d;
        if(iaoj0 == null) {
            synchronized(hnvr.class) {
                iaoj0 = hnvr.d;
                if(iaoj0 == null) {
                    gRPCMethodDescriptorBuilder iaog0 = gRPCMethodDescriptor.newBuilder();
                    iaog0.methodType = gRPCMethodType.a;
                    iaog0.fullMethodName = gRPCMethodDescriptor.generateFullMethodName("google.internal.communications.instantmessaging.v1.Registration", "SignInGaia");
                    iaog0.setSampledToLocalTracing();
                    iaog0.requestMarshaller = new ibjh(((MessageLite)hnwt.a));
                    iaog0.responseMarshaller = new ibjh(((MessageLite)hnwu.a));
                    iaoj0 = iaog0.build();
                    hnvr.d = iaoj0;
                }
            }
            return ibjw.a(iakr0.a(iaoj0, ((hnvq)object0).b), this.a);
        }
        return ibjw.a(iakr0.a(iaoj0, ((hnvq)object0).b), this.a);
    }
}

