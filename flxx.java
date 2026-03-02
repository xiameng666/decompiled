public final class flxx implements glzn {
    public final hnqz a;

    public flxx(hnqz hnqz0) {
        this.a = hnqz0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        iakr iakr0 = ((hnqx)object0).a;
        gRPCMethodDescriptor iaoj0 = hnqy.d;
        if(iaoj0 == null) {
            synchronized(hnqy.class) {
                iaoj0 = hnqy.d;
                if(iaoj0 == null) {
                    gRPCMethodDescriptorBuilder iaog0 = gRPCMethodDescriptor.newBuilder();
                    iaog0.methodType = gRPCMethodType.a;
                    iaog0.fullMethodName = gRPCMethodDescriptor.generateFullMethodName("google.internal.communications.instantmessaging.v1.LighterCloudMessageService", "CheckBootstrapRequired");
                    iaog0.setSampledToLocalTracing();
                    iaog0.requestMarshaller = new ibjh(((MessageLite)hnqz.a));
                    iaog0.responseMarshaller = new ibjh(((MessageLite)hnra.a));
                    iaoj0 = iaog0.build();
                    hnqy.d = iaoj0;
                }
            }
            return ibjw.a(iakr0.a(iaoj0, ((hnqx)object0).b), this.a);
        }
        return ibjw.a(iakr0.a(iaoj0, ((hnqx)object0).b), this.a);
    }
}

