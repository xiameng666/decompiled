public final class fdtn implements fdtu {
    public final hlan a;

    public fdtn(hlan hlan0) {
        this.a = hlan0;
    }

    @Override  // fdtu
    public final MessageLite a(MessageLite hfvm0) {
        gRPCMethodDescriptor iaoj0 = hlao.k;
        if(iaoj0 == null) {
            synchronized(hlao.class) {
                iaoj0 = hlao.k;
                if(iaoj0 == null) {
                    gRPCMethodDescriptorBuilder iaog0 = gRPCMethodDescriptor.newBuilder();
                    iaog0.methodType = gRPCMethodType.a;
                    iaog0.fullMethodName = gRPCMethodDescriptor.generateFullMethodName("google.internal.android.wear.cloudsync.v1.CloudSyncService", "GetServerTime");
                    iaog0.setSampledToLocalTracing();
                    iaog0.requestMarshaller = new ibjh(((MessageLite)hfsw.a));
                    iaog0.responseMarshaller = new ibjh(((MessageLite)hlaw.a));
                    iaoj0 = iaog0.build();
                    hlao.k = iaoj0;
                }
            }
            return (hlaw)ibjw.b(this.a.a, iaoj0, this.a.b, ((hfsw)hfvm0));
        }
        return (hlaw)ibjw.b(this.a.a, iaoj0, this.a.b, ((hfsw)hfvm0));
    }
}

