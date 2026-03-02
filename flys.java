public final class flys implements glzn {
    public final hgje a;

    public flys(hgje hgje0) {
        this.a = hgje0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        iakr iakr0 = ((hntj)object0).a;
        gRPCMethodDescriptor iaoj0 = hntk.c;
        if(iaoj0 == null) {
            synchronized(hntk.class) {
                iaoj0 = hntk.c;
                if(iaoj0 == null) {
                    gRPCMethodDescriptorBuilder iaog0 = gRPCMethodDescriptor.newBuilder();
                    iaog0.methodType = gRPCMethodType.a;
                    iaog0.fullMethodName = gRPCMethodDescriptor.generateFullMethodName("google.internal.communications.instantmessaging.v1.LighterFrontend", "GetOpenConversation");
                    iaog0.setSampledToLocalTracing();
                    iaog0.requestMarshaller = new ibjh(((MessageLite)hgje.a));
                    iaog0.responseMarshaller = new ibjh(((MessageLite)hgjf.a));
                    iaoj0 = iaog0.build();
                    hntk.c = iaoj0;
                }
            }
            return ibjw.a(iakr0.a(iaoj0, ((hntj)object0).b), this.a);
        }
        return ibjw.a(iakr0.a(iaoj0, ((hntj)object0).b), this.a);
    }
}

