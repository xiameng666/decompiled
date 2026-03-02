public final class flyl implements glzn {
    public final hnrd a;

    public flyl(hnrd hnrd0) {
        this.a = hnrd0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        iakr iakr0 = ((hnqx)object0).a;
        gRPCMethodDescriptor iaoj0 = hnqy.a;
        if(iaoj0 == null) {
            synchronized(hnqy.class) {
                iaoj0 = hnqy.a;
                if(iaoj0 == null) {
                    gRPCMethodDescriptorBuilder iaog0 = gRPCMethodDescriptor.newBuilder();
                    iaog0.methodType = gRPCMethodType.a;
                    iaog0.fullMethodName = gRPCMethodDescriptor.generateFullMethodName("google.internal.communications.instantmessaging.v1.LighterCloudMessageService", "ListConversations");
                    iaog0.setSampledToLocalTracing();
                    iaog0.requestMarshaller = new ibjh(((MessageLite)hnrd.a));
                    iaog0.responseMarshaller = new ibjh(((MessageLite)hnre.a));
                    iaoj0 = iaog0.build();
                    hnqy.a = iaoj0;
                }
            }
            return ibjw.a(iakr0.a(iaoj0, ((hnqx)object0).b), this.a);
        }
        return ibjw.a(iakr0.a(iaoj0, ((hnqx)object0).b), this.a);
    }
}

