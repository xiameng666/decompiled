public final class fdsv implements fdtu {
    public final hlan a;

    public fdsv(hlan hlan0) {
        this.a = hlan0;
    }

    @Override  // fdtu
    public final MessageLite a(MessageLite hfvm0) {
        gRPCMethodDescriptor iaoj0 = hlao.h;
        if(iaoj0 == null) {
            synchronized(hlao.class) {
                iaoj0 = hlao.h;
                if(iaoj0 == null) {
                    gRPCMethodDescriptorBuilder iaog0 = gRPCMethodDescriptor.newBuilder();
                    iaog0.methodType = gRPCMethodType.a;
                    iaog0.fullMethodName = gRPCMethodDescriptor.generateFullMethodName("google.internal.android.wear.cloudsync.v1.CloudSyncService", "PutAssetAcls");
                    iaog0.setSampledToLocalTracing();
                    iaog0.requestMarshaller = new ibjh(((MessageLite)hlay.a));
                    iaog0.responseMarshaller = new ibjh(((MessageLite)hfsw.a));
                    iaoj0 = iaog0.build();
                    hlao.h = iaoj0;
                }
            }
            return (hfsw)ibjw.b(this.a.a, iaoj0, this.a.b, ((hlay)hfvm0));
        }
        return (hfsw)ibjw.b(this.a.a, iaoj0, this.a.b, ((hlay)hfvm0));
    }
}

