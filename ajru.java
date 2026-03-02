public final class ajru implements ajrb {
    public final grer a;

    public ajru(grer grer0) {
        this.a = grer0;
    }

    @Override  // ajrb
    public final Object a(Object object0) {
        iakr iakr0 = ((grfl)object0).a;
        gRPCMethodDescriptor iaoj0 = grfm.h;
        if(iaoj0 == null) {
            synchronized(grfm.class) {
                iaoj0 = grfm.h;
                if(iaoj0 == null) {
                    gRPCMethodDescriptorBuilder iaog0 = gRPCMethodDescriptor.newBuilder();
                    iaog0.methodType = gRPCMethodType.a;
                    iaog0.fullMethodName = gRPCMethodDescriptor.generateFullMethodName("google.internal.identity.securitydomain.v1.SecurityDomainService", "RotateSharedKey");
                    iaog0.setSampledToLocalTracing();
                    iaog0.requestMarshaller = new ibjh(((MessageLite)grer.a));
                    iaog0.responseMarshaller = new ibjh(((MessageLite)gres.a));
                    iaoj0 = iaog0.build();
                    grfm.h = iaoj0;
                }
            }
            return (gres)ibjw.b(iakr0, iaoj0, ((grfl)object0).b, this.a);
        }
        return (gres)ibjw.b(iakr0, iaoj0, ((grfl)object0).b, this.a);
    }
}

