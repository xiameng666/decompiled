public final class flyj implements glzn {
    public final hgjb a;

    public flyj(hgjb hgjb0) {
        this.a = hgjb0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        iakr iakr0 = ((hntj)object0).a;
        gRPCMethodDescriptor iaoj0 = hntk.b;
        if(iaoj0 == null) {
            synchronized(hntk.class) {
                iaoj0 = hntk.b;
                if(iaoj0 == null) {
                    gRPCMethodDescriptorBuilder iaog0 = gRPCMethodDescriptor.newBuilder();
                    iaog0.methodType = gRPCMethodType.a;
                    iaog0.fullMethodName = gRPCMethodDescriptor.generateFullMethodName("google.internal.communications.instantmessaging.v1.LighterFrontend", "GetLighterProfile");
                    iaog0.setSampledToLocalTracing();
                    iaog0.requestMarshaller = new ibjh(((MessageLite)hgjb.a));
                    iaog0.responseMarshaller = new ibjh(((MessageLite)hgjc.a));
                    iaoj0 = iaog0.build();
                    hntk.b = iaoj0;
                }
            }
            return ibjw.a(iakr0.a(iaoj0, ((hntj)object0).b), this.a);
        }
        return ibjw.a(iakr0.a(iaoj0, ((hntj)object0).b), this.a);
    }
}

