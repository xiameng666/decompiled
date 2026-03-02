public final class flyh implements glzn {
    public final hnqc a;

    public flyh(hnqc hnqc0) {
        this.a = hnqc0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        iakr iakr0 = ((hnpy)object0).a;
        gRPCMethodDescriptor iaoj0 = hnpz.c;
        if(iaoj0 == null) {
            synchronized(hnpz.class) {
                iaoj0 = hnpz.c;
                if(iaoj0 == null) {
                    gRPCMethodDescriptorBuilder iaog0 = gRPCMethodDescriptor.newBuilder();
                    iaog0.methodType = gRPCMethodType.a;
                    iaog0.fullMethodName = gRPCMethodDescriptor.generateFullMethodName("google.internal.communications.instantmessaging.v1.LighterBlock", "GetBlockedConversations");
                    iaog0.setSampledToLocalTracing();
                    iaog0.requestMarshaller = new ibjh(((MessageLite)hnqc.a));
                    iaog0.responseMarshaller = new ibjh(((MessageLite)hnqd.a));
                    iaoj0 = iaog0.build();
                    hnpz.c = iaoj0;
                }
            }
            return ibjw.a(iakr0.a(iaoj0, ((hnpy)object0).b), this.a);
        }
        return ibjw.a(iakr0.a(iaoj0, ((hnpy)object0).b), this.a);
    }
}

