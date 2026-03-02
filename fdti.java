public final class fdti implements fdtu {
    public final hlan a;

    public fdti(hlan hlan0) {
        this.a = hlan0;
    }

    @Override  // fdtu
    public final MessageLite a(MessageLite hfvm0) {
        gRPCMethodDescriptor iaoj0 = hlao.f;
        if(iaoj0 == null) {
            synchronized(hlao.class) {
                iaoj0 = hlao.f;
                if(iaoj0 == null) {
                    gRPCMethodDescriptorBuilder iaog0 = gRPCMethodDescriptor.newBuilder();
                    iaog0.methodType = gRPCMethodType.a;
                    iaog0.fullMethodName = gRPCMethodDescriptor.generateFullMethodName("google.internal.android.wear.cloudsync.v1.CloudSyncService", "PutDataItems");
                    iaog0.setSampledToLocalTracing();
                    iaog0.requestMarshaller = new ibjh(((MessageLite)hlaz.a));
                    iaog0.responseMarshaller = new ibjh(((MessageLite)hlba.a));
                    iaoj0 = iaog0.build();
                    hlao.f = iaoj0;
                }
            }
            return (hlba)ibjw.b(this.a.a, iaoj0, this.a.b, ((hlaz)hfvm0));
        }
        return (hlba)ibjw.b(this.a.a, iaoj0, this.a.b, ((hlaz)hfvm0));
    }
}

