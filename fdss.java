public final class fdss implements fdtu {
    public final hlan a;

    public fdss(hlan hlan0) {
        this.a = hlan0;
    }

    @Override  // fdtu
    public final MessageLite a(MessageLite hfvm0) {
        gRPCMethodDescriptor iaoj0 = hlao.j;
        if(iaoj0 == null) {
            synchronized(hlao.class) {
                iaoj0 = hlao.j;
                if(iaoj0 == null) {
                    gRPCMethodDescriptorBuilder iaog0 = gRPCMethodDescriptor.newBuilder();
                    iaog0.methodType = gRPCMethodType.a;
                    iaog0.fullMethodName = gRPCMethodDescriptor.generateFullMethodName("google.internal.android.wear.cloudsync.v1.CloudSyncService", "Heartbeat");
                    iaog0.setSampledToLocalTracing();
                    iaog0.requestMarshaller = new ibjh(((MessageLite)hlax.a));
                    iaog0.responseMarshaller = new ibjh(((MessageLite)hfsw.a));
                    iaoj0 = iaog0.build();
                    hlao.j = iaoj0;
                }
            }
            return (hfsw)ibjw.b(this.a.a, iaoj0, this.a.b, ((hlax)hfvm0));
        }
        return (hfsw)ibjw.b(this.a.a, iaoj0, this.a.b, ((hlax)hfvm0));
    }
}

