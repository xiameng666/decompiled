public final class flyy implements gfsi {
    public final hnwf a;
    public final ibkd b;

    public flyy(hnwf hnwf0, ibkd ibkd0) {
        this.a = hnwf0;
        this.b = ibkd0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        iakr iakr0 = ((hnvn)object0).a;
        gRPCMethodDescriptor iaoj0 = hnvo.a;
        if(iaoj0 == null) {
            synchronized(hnvo.class) {
                iaoj0 = hnvo.a;
                if(iaoj0 == null) {
                    gRPCMethodDescriptorBuilder iaog0 = gRPCMethodDescriptor.newBuilder();
                    iaog0.methodType = gRPCMethodType.c;
                    iaog0.fullMethodName = gRPCMethodDescriptor.generateFullMethodName("google.internal.communications.instantmessaging.v1.Messaging", "ReceiveMessages");
                    iaog0.setSampledToLocalTracing();
                    iaog0.requestMarshaller = new ibjh(((MessageLite)hnwf.a));
                    iaog0.responseMarshaller = new ibjh(((MessageLite)hnwl.a));
                    iaoj0 = iaog0.build();
                    hnvo.a = iaoj0;
                }
            }
        }
        ibjw.c(iakr0.a(iaoj0, ((hnvn)object0).b), this.a, this.b);
        return null;
    }
}

