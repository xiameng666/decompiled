public final class fdtl implements fdtu {
    public final hlan a;

    public fdtl(hlan hlan0) {
        this.a = hlan0;
    }

    @Override  // fdtu
    public final MessageLite a(MessageLite hfvm0) {
        gRPCMethodDescriptor iaoj0 = hlao.g;
        if(iaoj0 == null) {
            synchronized(hlao.class) {
                iaoj0 = hlao.g;
                if(iaoj0 == null) {
                    gRPCMethodDescriptorBuilder iaog0 = gRPCMethodDescriptor.newBuilder();
                    iaog0.methodType = gRPCMethodType.a;
                    iaog0.fullMethodName = gRPCMethodDescriptor.generateFullMethodName("google.internal.android.wear.cloudsync.v1.CloudSyncService", "GetAssetAcls");
                    iaog0.setSampledToLocalTracing();
                    iaog0.requestMarshaller = new ibjh(((MessageLite)hlas.a));
                    iaog0.responseMarshaller = new ibjh(((MessageLite)hlat.a));
                    iaoj0 = iaog0.build();
                    hlao.g = iaoj0;
                }
            }
            return (hlat)ibjw.b(this.a.a, iaoj0, this.a.b, ((hlas)hfvm0));
        }
        return (hlat)ibjw.b(this.a.a, iaoj0, this.a.b, ((hlas)hfvm0));
    }
}

