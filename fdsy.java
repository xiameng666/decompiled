public final class fdsy implements fdtu {
    public final hlan a;

    public fdsy(hlan hlan0) {
        this.a = hlan0;
    }

    @Override  // fdtu
    public final MessageLite a(MessageLite hfvm0) {
        gRPCMethodDescriptor iaoj0 = hlao.e;
        if(iaoj0 == null) {
            synchronized(hlao.class) {
                iaoj0 = hlao.e;
                if(iaoj0 == null) {
                    gRPCMethodDescriptorBuilder iaog0 = gRPCMethodDescriptor.newBuilder();
                    iaog0.methodType = gRPCMethodType.a;
                    iaog0.fullMethodName = gRPCMethodDescriptor.generateFullMethodName("google.internal.android.wear.cloudsync.v1.CloudSyncService", "GetDataItems");
                    iaog0.setSampledToLocalTracing();
                    iaog0.requestMarshaller = new ibjh(((MessageLite)hlau.a));
                    iaog0.responseMarshaller = new ibjh(((MessageLite)hlav.a));
                    iaoj0 = iaog0.build();
                    hlao.e = iaoj0;
                }
            }
            return (hlav)ibjw.b(this.a.a, iaoj0, this.a.b, ((hlau)hfvm0));
        }
        return (hlav)ibjw.b(this.a.a, iaoj0, this.a.b, ((hlau)hfvm0));
    }
}

