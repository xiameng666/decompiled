public final class fdtq implements fdtu {
    public final hlan a;

    public fdtq(hlan hlan0) {
        this.a = hlan0;
    }

    @Override  // fdtu
    public final MessageLite a(MessageLite hfvm0) {
        gRPCMethodDescriptor iaoj0 = hlao.d;
        if(iaoj0 == null) {
            synchronized(hlao.class) {
                iaoj0 = hlao.d;
                if(iaoj0 == null) {
                    gRPCMethodDescriptorBuilder iaog0 = gRPCMethodDescriptor.newBuilder();
                    iaog0.methodType = gRPCMethodType.a;
                    iaog0.fullMethodName = gRPCMethodDescriptor.generateFullMethodName("google.internal.android.wear.cloudsync.v1.CloudSyncService", "StartSync");
                    iaog0.setSampledToLocalTracing();
                    iaog0.requestMarshaller = new ibjh(((MessageLite)hlbe.a));
                    iaog0.responseMarshaller = new ibjh(((MessageLite)hlbf.a));
                    iaoj0 = iaog0.build();
                    hlao.d = iaoj0;
                }
            }
            return (hlbf)ibjw.b(this.a.a, iaoj0, this.a.b, ((hlbe)hfvm0));
        }
        return (hlbf)ibjw.b(this.a.a, iaoj0, this.a.b, ((hlbe)hfvm0));
    }
}

