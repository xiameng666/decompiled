public final class flye implements glzn {
    public final hnrb a;

    public flye(hnrb hnrb0) {
        this.a = hnrb0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        iakr iakr0 = ((hnqx)object0).a;
        gRPCMethodDescriptor iaoj0 = hnqy.c;
        if(iaoj0 == null) {
            synchronized(hnqy.class) {
                iaoj0 = hnqy.c;
                if(iaoj0 == null) {
                    gRPCMethodDescriptorBuilder iaog0 = gRPCMethodDescriptor.newBuilder();
                    iaog0.methodType = gRPCMethodType.a;
                    iaog0.fullMethodName = gRPCMethodDescriptor.generateFullMethodName("google.internal.communications.instantmessaging.v1.LighterCloudMessageService", "DeleteConversations");
                    iaog0.setSampledToLocalTracing();
                    iaog0.requestMarshaller = new ibjh(((MessageLite)hnrb.a));
                    iaog0.responseMarshaller = new ibjh(((MessageLite)hnrc.a));
                    iaoj0 = iaog0.build();
                    hnqy.c = iaoj0;
                }
            }
            return ibjw.a(iakr0.a(iaoj0, ((hnqx)object0).b), this.a);
        }
        return ibjw.a(iakr0.a(iaoj0, ((hnqx)object0).b), this.a);
    }
}

