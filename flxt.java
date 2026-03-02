public final class flxt implements glzn {
    public final hnvv a;

    public flxt(hnvv hnvv0) {
        this.a = hnvv0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        iakr iakr0 = ((hnvm)object0).a;
        gRPCMethodDescriptor iaoj0 = hnvo.c;
        if(iaoj0 == null) {
            synchronized(hnvo.class) {
                iaoj0 = hnvo.c;
                if(iaoj0 == null) {
                    gRPCMethodDescriptorBuilder iaog0 = gRPCMethodDescriptor.newBuilder();
                    iaog0.methodType = gRPCMethodType.a;
                    iaog0.fullMethodName = gRPCMethodDescriptor.generateFullMethodName("google.internal.communications.instantmessaging.v1.Messaging", "AckMessages");
                    iaog0.setSampledToLocalTracing();
                    iaog0.requestMarshaller = new ibjh(((MessageLite)hnvv.a));
                    iaog0.responseMarshaller = new ibjh(((MessageLite)hnvw.a));
                    iaoj0 = iaog0.build();
                    hnvo.c = iaoj0;
                }
            }
            return ibjw.a(iakr0.a(iaoj0, ((hnvm)object0).b), this.a);
        }
        return ibjw.a(iakr0.a(iaoj0, ((hnvm)object0).b), this.a);
    }
}

